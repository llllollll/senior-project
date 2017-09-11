package holotran;

public class HoloTranModel {
    public void convertVidoeHoloTran(String set, String location, String out){
        ImageFromVideo theImage =  new ImageFromVideo(location, out, set);
    }
    
}