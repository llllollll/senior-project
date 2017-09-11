package holotran;

import marvin.MarvinPluginCollection;
import marvin.io.MarvinImageIO;
import marvin.image.MarvinImage;
import marvin.color.MarvinColorModelConverter;

public class GreenScreenProcess {

    private MarvinImage imageIn;
    private MarvinImage imageOut;

    private String pathIn;
    private String pathOut;

    public GreenScreenProcess(String input){
        this.pathIn = input;
        this.pathOut = input;
        GSProcess();
    }

    
    public void GSProcess() {
        setup();
        removeScreenColor(imageIn, imageOut);
        savePicture();
        System.out.println("55");
    }
    
    private void setup() {
        imageIn = MarvinImageIO.loadImage(pathIn);
        imageOut = new MarvinImage(imageIn.getWidth(), imageIn.getHeight());
    }

    private void savePicture() {
        MarvinImageIO.saveImage(imageOut, pathOut);
    }

    private void removeScreenColor(MarvinImage in, MarvinImage out) {
        for(int y = 0; y < in.getHeight(); y++) {
            for(int x = 0; x < in.getWidth(); x++) {

                int color = in.getIntColor(x, y);
                int r = in.getIntComponent0(x, y);
                int g = in.getIntComponent1(x, y);
                int b = in.getIntComponent2(x, y);

                double[] hsv = MarvinColorModelConverter.rgbToHsv(new int[] {color});

                if(hsv[0] >= 60 && hsv[0] <= 130 && hsv[1] >= 0.4 && hsv[2] >= 0.3) {
                    out.setIntColor(x, y, 0, 127, 127, 127);
                } else {
                    out.setIntColor(x, y, color);
                }
            }
        }
        reduceColorScreen(out);
    }

    private void reduceColorScreen(MarvinImage out){
        for(int y = 0; y < out.getHeight(); y++){
            for(int x = 0; x < out.getWidth(); x++){
                
                int r = out.getIntComponent0(x, y);
                int g = out.getIntComponent1(x, y);
                int b = out.getIntComponent2(x, y);
                int color = out.getIntColor(x, y);
                
                double[] hsv = MarvinColorModelConverter.rgbToHsv(new int[] {color});
                
                if(hsv[0] >= 60 && hsv[0] <= 130 && hsv[1] >= 0.15 && hsv[2] > 0.15) {
                    if((r*b != 0 && (g*g)/(r*b) >= 1.5 )){
                        out.setIntColor(x, y, 255, (int)(r*1.4), (int)g, (int)(b*1.4));
                    } else {
                        out.setIntColor(x, y, 255, (int)(r*1.2), g, (int)(b*1.2));
                    }
                }
            }
        }
        MarvinPluginCollection.alphaBoundary(out, 6);
    }
} 