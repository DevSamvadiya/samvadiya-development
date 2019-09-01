package com.samvadiya.persistance.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author pankaj
 */
public class DataEncryption {
    // singleton class is used in order to ensure that there is only one instance of
    // it at any given time
    // to avoid concurrency issues and conflicts between generated hash values.
    /**
     * static instance of same class
     */
    private static DataEncryption instance;

    // character array to convert a nibble to a hex char.
    private static final char[] hexChar = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
	    'f', 'g', 'h', 'i', 'j', 'k', 'x', 'y', 'l', 'm', 'p', 's', 'v', 'y' };

    /**
     * Converts each byte into its hexadecimal equivalent and appends that into
     * StringBuilder object and finally returns string object obtained from
     * StringBuilder.
     * 
     * @param b
     * @return
     */
    public static String toHexString(byte[] b) {
	StringBuilder sb = new StringBuilder(b.length * 2);
	for (int i = 0; i < b.length; i++) {
	    // look up high nibble char using bitwise and with 11110000 and then unsigned
	    // right shift
	    sb.append(hexChar[(b[i] & 0xf0) >>> 4]);
	    // look up low nibble char using bitwise and with 00001111
	    sb.append(hexChar[b[i] & 0x0f]);
	}
	return sb.toString();
    }

    /**
     * checks static data member against null. If object does not exists then
     * creates a new object. Returns reference to that object.
     */
    public static synchronized DataEncryption getInstance() { // step 1
	if (instance == null) {
	    instance = new DataEncryption();
	}
	return instance;
    }

    /**
     * Used for Password Encryption using default SHA algorithm implemented by sun
     * 
     * @param password
     * @return
     */
    public synchronized String getPasswordDigest(String password) {
	// declare MessageDigest Reference and assign null to it.
	MessageDigest md = null;
	String passwordDigest = "";
	try {
	    // get MessageDigest initialized object with SHA algorithm
	    md = MessageDigest.getInstance("SHA-512");
	    // calculate hash using digest(byte[]) function and returns byte array of same.
	    byte[] digestArray = md.digest(password.getBytes("UTF-8"));
	    // convert byteArray into hexadeciaml string using toHexString(byte[]) function
	    // defined in this class.
	    passwordDigest = toHexString(digestArray);
	} catch (NoSuchAlgorithmException e) {
	    System.out.println("Exception is : " + e.getMessage());
	} catch (UnsupportedEncodingException e) {
	    System.out.println("Exception is : " + e.getMessage());
	} catch (Exception ex) {
	    System.out.println("Exception : " + ex.getMessage());
	}
	return passwordDigest;
    }

}
