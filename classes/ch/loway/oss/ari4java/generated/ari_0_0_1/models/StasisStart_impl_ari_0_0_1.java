package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Feb 04 15:23:09 CET 2017
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Notification that a channel has entered a Stasis application.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class StasisStart_impl_ari_0_0_1 extends Event_impl_ari_0_0_1 implements StasisStart, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Arguments to the application  */
  private List<String> args;
 public List<String> getArgs() {
   return args;
 }

 @JsonDeserialize( contentAs=String.class )
 public void setArgs(List<String> val ) {
   args = val;
 }

  /**    */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_0_0_1.class )
 public void setChannel(Channel val ) {
   channel = val;
 }

/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Channel getReplace_channel(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setReplace_channel(Channel val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

}

