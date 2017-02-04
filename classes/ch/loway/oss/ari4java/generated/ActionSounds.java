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


public interface ActionSounds {

// List<Sound> list String String
/**********************************************************
 * List all sounds.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public List<Sound> list(String lang, String format) throws RestException;



// Sound get String
/**********************************************************
 * Get a sound's details.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public Sound get(String soundId) throws RestException;



// void list String String AriCallback<List<Sound>> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void list(String lang, String format, AriCallback<List<Sound>> callback);



// void get String AriCallback<Sound> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void get(String soundId, AriCallback<Sound> callback);


}
;
