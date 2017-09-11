/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holotran;

/**
 *
 * @author me
 */
public class HoloTran {
    
    private static String a = "left";
    private static String b = "C:\\Users\\BestDark\\Downloads\\Video\\Balto - Steele and Balto.mp4";
    private static String c = "C:\\Users\\BestDark\\Downloads\\Video\\out\\";
    public static void main(String[] args) {
        HoloTranView theView = new HoloTranView();
        HoloTranModel theModel = new HoloTranModel();
        theModel.convertVidoeHoloTran(a, b, c);
//        HoloTranController theController = new HoloTranController(theView, theModel);
//        theView.setVisible(true);
    }
    
}
