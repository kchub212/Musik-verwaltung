import javazoom.jl.decoder.JavaLayerException; 
import javazoom.jl.player.Player;

import java.io.*;
import java.util.List;


//implementing ActionListener interface
public class MusicPlayer {

    Main m = new Main();
    private FileInputStream fileInputStream;
    private BufferedInputStream bufferedInputStream;
    private File myFile = null;
    long totalLength;
    private Player player;
    private Thread playThread;


    // Add field to store playlist
    private List<File> playlist;


    public void setPlaylist(List<File> playlist) {
        this.playlist = playlist;
    }




    MusicPlayer() {
    }


    public File getMyFile() {
        return this.myFile;
    }

    public void setMyFile(File myFile) {
        this.myFile = myFile;
    }



    public void playSong() {
        if (player != null) {
            player.close();
        }
        playThread = null;
        playThread = new Thread(runnablePlay);
        //starting play thread
        playThread.start();
    }


    public void stopSong() {
        if (player != null) {
            player.close();
        }
    }


  Runnable runnablePlay = new Runnable() {
    //@Override
    public void run() {
        try {
            //code for play button
            fileInputStream=new FileInputStream(myFile);
            bufferedInputStream=new BufferedInputStream(fileInputStream);
            player=new Player(bufferedInputStream);
            totalLength=fileInputStream.available();
            player.play();//starting music
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
};

}