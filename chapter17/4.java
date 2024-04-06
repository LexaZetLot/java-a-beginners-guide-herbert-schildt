import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CBDemo implements ItemListener {
    JLabel jlabSelected;
    JLabel jlabChanged;
    JCheckBox jcbSelected;
    JCheckBox jcbAlpha;
    JCheckBox jcbBeta;
    JCheckBox jcbGamma;

    CBDemo() {
        JFrame jfrm = new JFrame("Demonstrate Check Boxes");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(240, 120);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jlabSelected = new JLabel("");
        jlabChanged = new JLabel("");

        jcbAlpha = new JCheckBox("Alpha");
        jcbBeta = new JCheckBox("Beta");
        jcbGamma = new JCheckBox("Gamma");

        jcbAlpha.addItemListener(this);
        jcbBeta.addItemListener(this);
        jcbGamma.addItemListener(this);

        jfrm.add(jcbAlpha);
        jfrm.add(jcbBeta);
        jfrm.add(jcbGamma);
        jfrm.add(jlabChanged);
        jfrm.add(jlabSelected);

        jfrm.setVisible(true);
    }
    public void itemStateChanged(ItemEvent ie) {
        String str = "";
        JCheckBox cb = (JCheckBox) ie.getItem();
        if(cb.isSelected())
            jlabChanged.setText(cb.getText() + " was just selected.");
        else
            jlabChanged.setText(cb.getText() + " was just cleared.");

        if(jcbAlpha.isSelected())
            str += "Alpha ";
        if(jcbBeta.isSelected())
            str += "Beta ";
        if(jcbGamma.isSelected())
            str += "Gamma";
        jlabSelected.setText("Selected check boxes: " + str);
    }
}

public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CBDemo();
            }
        });
    }
}
