package se.devoteam.maven;

/*
 * se.devoteam.maven.SecretKey
 * 
 * Version:  1.0 
 *
 * Date:     2012-09-20
 * 
 * Copyright: 
 */
import java.io.Serializable;

/**
 * 
 * @author Karin Karlsson
 */
public interface SecretKey extends Serializable {
	
	public static final String SYSTEM_PROPERTY_SEC_LOCATION = "settings.security";
	
	public boolean isSet();
}
