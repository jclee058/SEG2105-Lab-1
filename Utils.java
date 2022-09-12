
public class Utils {

    public static String[] findAndReplace( String[] in, String[] what, String[] with ) {

        String[] out = null; // The new array to be returned
	    boolean valid = true; // True if the pre-conditions are satistified

      	// Testing pre-conditions

      	if ( in == null || what == null || with == null ) {
      	    valid = false;
      	} else {
      		out = new String[in.length];
      		out[0] = "";
      		
      		if(in.length == what.length && what.length == with.length) {
      	    	valid = true;
      	    	for ( int j=0; j<in.length; j++ ) {
          	    	out[j]=in[j];
          	    	if (what[j] == null || with[j] == null || in[j] == null) {
          	    		valid = false;
          	    		out = null;
          	    		return out;
          	    	}
      	    	}
      	    	
      		} else {
      	    	valid = false;
      	    	out = null;
      	    }
      	
      	}

      	if ( valid == true ) {
      		for ( int i=0; i<in.length; i++ ) {
      	    	what[i].equals(with[i]);
      	    	
      	    }
      	} else {
      		out= null;
      	}

        return out;
    }
}