package Animals_backadge;

import java.io.IOException;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class FlyingAnimal extends Animal{

	public FlyingAnimal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void Sound() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		super.ReadSound();
	}

	
      
}
