package game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.lwjgl.util.vector.Vector3f;
import nl.miystengine.client.FileBasicJava;
import nl.miystengine.client.MiystFramework;

/**
 * The following framework was made before I went to school and I'm remaking it with the knowledge I have now.
 * Because of this, some code isn't optimized or has proper explanation. 
 */

//For now, this file has the proper explanation and is optimized.

public class GameMain
{	
	/**
	 * Will be called when the Constructor of the Miyst Engine
	 */
	public GameMain(){}
	
	/**
	 * Path to the logo of the window
	 */
	private static String logo;
	
	/**
	 * Set the icon of the window
	 * @throws IOException
	 */
	public static ByteBuffer setIcon() throws IOException 
    {
		try
		{
			logo = MiystFramework.miystengine.getPath().source + "Logo blue.png";
			File file = new File(logo);
			if(!file.exists())
			{
				System.out.println("Logo File doesn't exists: " + file.getPath());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
    	return MiystFramework.miystengine.getTextureManager().convertImageData(logo);
    }
	
	/**
	 * This will be show first as the window name
	 * @return the name of the window
	 */
	public String displayName()
	{
		return "test framework";
	}
	
	/**
	 * The version that will be displayed as the window name
	 * @return the version string
	 */
	public String Version()
	{
		return "V1.0.0";
	}
	
	/**
	 * Called just before you enter the world but after everything else is loaded.
	 */
	public void loadingBeforeEntering(){}
	
	/**
	 * Called After creation of the Frame buffer object(FBO)
	 */
	public void activatedOnStart(){}

	/**
	 * Called when in Main menu, loading screen and in-game
	 */
	public void updateOnDeltaTime(){}
	
	/**
	 * Called just before you enter the world
	 */
	public void updateOnEnterWorld(){}

}