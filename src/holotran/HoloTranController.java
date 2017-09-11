package holotran;

import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HoloTranController {
    private HoloTranView theView;
    private HoloTranModel theModel;

    public HoloTranController(HoloTranView theView, HoloTranModel theModel) {
        this.theView = theView;
        this.theModel = theModel;
        this.theView.addHoloTranListener(new HoloTranListener());
    }

    class HoloTranListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ArrayList<String> locationList = new ArrayList<String>();

            try {
                locationList.add(theView.getUpVideoLocation());
                locationList.add(theView.getDownVideoLocation());
                locationList.add(theView.getLeftVideoLocation());
                locationList.add(theView.getRigthVideoLocation());
                locationList.add(theView.getOutputVideoLocation());

            } catch(Exception ex) {
                System.out.println(ex);
            }
        }
    }
        
}