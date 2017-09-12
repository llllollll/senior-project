package holotran;

import java.util.ArrayList;

public class HoloTranModel {
    private ArrayList<String> locationFile = new ArrayList<String>();

    public void convertVidoeHoloTran(String set, String location, String out){
        firstStep(location, out, set);
        lastStep(location, out);
    }

    public void firstStep(String set, String location, String out) {
        new ImageFromVideo(location, out, set); //Image from video and cut green screen
    }
    
    public void lastStep(String location, String out) {
        //Image position and create video from images
    }
}