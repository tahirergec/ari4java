package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;

public interface ActionSounds {

// void get String AriCallback<Sound> callback
/**********************************************************
 * 
 *********************************************************/
public void get(String soundId, AriCallback<Sound> callback);



// Sound get String
/**********************************************************
 * Get a sound's details.
 *********************************************************/
public Sound get(String soundId) throws RestException;



// List<? extends Sound> list String String
/**********************************************************
 * List all sounds.
 *********************************************************/
public List<? extends Sound> list(String lang, String format) throws RestException;



// void list String String AriCallback<List<? extends Sound>> callback
/**********************************************************
 * 
 *********************************************************/
public void list(String lang, String format, AriCallback<List<? extends Sound>> callback);


}
;
