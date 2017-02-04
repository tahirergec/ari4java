package ch.loway.oss.ari4java.generated.ari_1_10_0.models;

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
 * Notification that a bridge has been created.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class BridgeCreated_impl_ari_1_10_0 extends Event_impl_ari_1_10_0 implements BridgeCreated, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**    */
  private Bridge bridge;
 public Bridge getBridge() {
   return bridge;
 }

 @JsonDeserialize( as=Bridge_impl_ari_1_10_0.class )
 public void setBridge(Bridge val ) {
   bridge = val;
 }

/** No missing signatures from interface */
}

