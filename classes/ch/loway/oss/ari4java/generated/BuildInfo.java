package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Feb 04 15:23:09 CET 2017
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import ch.loway.oss.ari4java.tools.tags.*;

/**********************************************************
 * 
 * Generated by: JavaInterface
 *********************************************************/


public interface BuildInfo {

// void setKernel String
/**********************************************************
 * Kernel version Asterisk was built on.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setKernel(String val );



// String getUser
/**********************************************************
 * Username that build Asterisk
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getUser();



// String getOs
/**********************************************************
 * OS Asterisk was built on.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getOs();



// String getMachine
/**********************************************************
 * Machine architecture (x86_64, i686, ppc, etc.)
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getMachine();



// void setDate String
/**********************************************************
 * Date and time when Asterisk was built.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setDate(String val );



// void setOs String
/**********************************************************
 * OS Asterisk was built on.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setOs(String val );



// void setUser String
/**********************************************************
 * Username that build Asterisk
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setUser(String val );



// String getKernel
/**********************************************************
 * Kernel version Asterisk was built on.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getKernel();



// void setOptions String
/**********************************************************
 * Compile time options, or empty string if default.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setOptions(String val );



// String getDate
/**********************************************************
 * Date and time when Asterisk was built.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getDate();



// String getOptions
/**********************************************************
 * Compile time options, or empty string if default.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getOptions();



// void setMachine String
/**********************************************************
 * Machine architecture (x86_64, i686, ppc, etc.)
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setMachine(String val );


}
;
