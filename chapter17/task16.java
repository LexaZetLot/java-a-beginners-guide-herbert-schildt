import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class ListDemo implements ListSelectionListener {
    JList<String> jlst;
    JLabel jlab;
    JScrollPane jscrlp;
    String[] names = {"Sherry", "Jon", "Rachel",
            "Sasha", "Josselyn", "Randy",
            "Tom", "Mary", "Ken",
            "Andrew", "Matt", "Todd"};
    ListDemo() {
        JFrame jfrm = new JFrame("JList Demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(200, 160);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlst = new JList<String>(names);
        jscrlp = new JScrollPane(jlst);
        jscrlp.setPreferredSize(new Dimension(120, 90));
        jlab = new JLabel("Please choose a name");
        jlst.addListSelectionListener(this);
        jfrm.add(jscrlp);
        jfrm.add(jlab);
        jfrm.setVisible(true);
    }
    public void valueChanged(ListSelectionEvent le) {
        int[] idx = jlst.getSelectedIndices();
        if(idx.length != 0) {
            String who = "";
            for(int i: idx)
                who += names[i] + " ";
            jlab.setText("Current selections: " + who);
        } else
            jlab.setText("Please choose a name");
    }
}

public class Main {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ListDemo();
            }
        });
    }
}
