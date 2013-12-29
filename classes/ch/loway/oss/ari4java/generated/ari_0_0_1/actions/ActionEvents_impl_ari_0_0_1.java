package ch.loway.oss.ari4java.generated.ari_0_0_1.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.BaseAriAction;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import com.fasterxml.jackson.core.type.TypeReference;
import ch.loway.oss.ari4java.generated.ari_0_0_1.models.*;

public class ActionEvents_impl_ari_0_0_1 extends BaseAriAction  implements ActionEvents {
/**********************************************************
 * Events from Asterisk to applications
 * 
 * WebSocket connection for events.
 *********************************************************/
private void buildEventWebsocket(String app) {
reset();
url = "/events";
method = "GET";
lParamQuery.add( BaseAriAction.HttpParam.build( "app", app) );
wsUpgrade = true;
}

@Override
public Message eventWebsocket(String app) throws RestException {
throw new RestException("No synchronous operation on WebSocket");
}

@Override
public void eventWebsocket(String app, AriCallback<Message> callback) {
buildEventWebsocket(app);
httpActionAsync(callback, Message_impl_ari_0_0_1.class);
}

};

