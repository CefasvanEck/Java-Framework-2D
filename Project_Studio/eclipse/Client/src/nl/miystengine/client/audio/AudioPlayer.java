package nl.miystengine.client.audio;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

//For now, this file has the proper explanation and is optimized.

public class AudioPlayer
{
	/**
	 * Used to play a sound without positioning.
	 * @param soundFile: path to the audio file
	 */
	public void playSound(String soundFile) 
	{
		File f = new File(soundFile);
		try
		{
			AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());  
			Clip clip = AudioSystem.getClip();
			clip.open(audioIn);
			clip.start();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	//Play audio example: MiystEngine.miystengine.getAudioPlayer().playSound("../sound/sound.wav");
}