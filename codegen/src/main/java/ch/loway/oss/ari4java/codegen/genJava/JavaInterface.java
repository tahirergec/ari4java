
package ch.loway.oss.ari4java.codegen.genJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author lenz
 */
public class JavaInterface {

    public final List<String> eventSources = Arrays.asList("Bridge",
            "Channel",
            "Endpoint",
            "DeviceState");

    public String pkgName = "";
    public String className = "";
    public String since = "";
    public String parent = "";

    private static class Definition {
        String method;
        String comment;
        String sinceVersion;
        public Definition(String method, String comment, String sinceVersion) {
            this.method = method;
            this.comment = comment;
            this.sinceVersion = sinceVersion;
        }

        public String toInterfaceString() {
            StringBuilder sb = new StringBuilder();
            JavaGen.addBanner(sb, comment, sinceVersion);
            sb.append(method).append(";");
            return sb.toString();
        }

        public String toUnsupportedString(boolean addJsonIgnore) {
            return (addJsonIgnore ? "  @JsonIgnore\n  " : "  ") + method + "{\n"
                    + "    throw new UnsupportedOperationException(\"Method available from " + sinceVersion + "\");\n"
                    + "  }\n\n";
        }
    }

    private Map<String, Definition> definitions = new HashMap<>();

    public void iKnow(String signature, String method, String comment, String sinceVersion) {
        if (!definitions.containsKey(signature)) {
            definitions.put(signature, new Definition(method, comment, sinceVersion));
        }
    }

    public JavaInterface createScratchCopy() {
        JavaInterface ji = new JavaInterface();
        ji.pkgName = pkgName;
        ji.className = className;
        ji.since = since;
        ji.definitions = new HashMap<>(definitions);
        return ji;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        JavaGen.importClasses(sb, pkgName, Arrays.asList("java.util.Date",
                "java.util.List",
                "java.util.Map",
                "java.util.ArrayList",
                "ch.loway.oss.ari4java.tools.*",
                "ch.loway.oss.ari4java.tools.tags.EventSource",
                "ch.loway.oss.ari4java.generated.actions.requests.*",
                "ch.loway.oss.ari4java.generated.models.Module",
                "ch.loway.oss.ari4java.generated.models.*"));
        JavaGen.addBanner(sb, "\n"
                + "Generated by: " + this.getClass().getSimpleName() + "\n"
        );
        JavaGen.emptyLines(sb, 2);
        sb.append("public interface ").append(className);
        if (eventSources.contains(className)) {
            sb.append(" extends EventSource ");
        } else if (!parent.isEmpty()) {
            sb.append(" extends ").append(parent).append(" ");
        }
        sb.append(" {\n");
        for (String signature : definitions.keySet()) {
            sb.append(definitions.get(signature).toInterfaceString()).append("\n");
        }
        sb.append("}\n");
        return sb.toString();
    }

    /**
     * Removes a signature.
     * When you serialize an object, you remove all required signatures.
     * @param signature the method signature
     */
    public void removeSignature(String signature) {
        if (definitions.containsKey(signature)) {
            definitions.remove(signature);
        } else {
            throw new IllegalArgumentException("Signature not found: " + signature);
        }
    }

    public String getCodeToImplementMissingSignatures() {
        return getCodeToImplementMissingSignatures(false);
    }

    public String getCodeToImplementMissingSignatures(boolean addJsonIgnore) {
        if (definitions.isEmpty()) {
            return "  /* No missing signatures from interface */\n\n";
        } else {
            StringBuilder sb = new StringBuilder();
            // generate empty methods that throw an UnsupportedOperationException
            for (Definition d : definitions.values()) {
                sb.append(d.toUnsupportedString(addJsonIgnore));
            }
            return sb.toString();
        }
    }

}

