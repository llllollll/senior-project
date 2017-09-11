package holotran;

import java.awt.event.ActionListener;
import javax.swing.*;

public class HoloTranView extends JFrame {
    
    private JButton HoloTranStartButton = new JButton("Convert");

    public String getUpVideoLocation() {
        return "";
    }

    public String getDownVideoLocation() {
        return "";
    }

    public String getLeftVideoLocation() {
        return "";
    }

    public String getRigthVideoLocation() {
        return "";
    }

    public String getOutputVideoLocation() {
        return "";
    }

    void addHoloTranListener(ActionListener listenForHoloTran) {
        HoloTranStartButton.addActionListener(listenForHoloTran);
    }
    
}