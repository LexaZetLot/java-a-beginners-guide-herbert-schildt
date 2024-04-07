import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class ListDemo implements ListSelectionListener {
    JList<String> jlst;
    JScrollPane jscrlp;
    String[] names = {"if", "switch", "for", "while", "do-while", "break", "continue"};
    String[] str ={
            "<html>if(condition) statement<br>else statement;</html>",
            "<html>switch(expression) {<br>case constant:<br>    statement sequence<br>    break;<br>    // ...<br>}</html>",
            "<html>for(init; condition; iteration)<br>    statement</html>",
            "<html>while(condition)<br>    statement</html>",
            "<html>do {<br>    statement;);<br>} while (condition);</html>",
            "<html>break; or break label;</html>",
            "<html>continue; or continue label;</html>"
    };
    JLabel jL = new JLabel();
    ListDemo() {
        JFrame jfrm = new JFrame("JList Demo");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(600, 560);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jlst = new JList<String>(names);
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jscrlp = new JScrollPane(jlst);
        jscrlp.setPreferredSize(new Dimension(120, 90));
        jL = new JLabel("Please choose a name");
        jlst.addListSelectionListener(this);
        jfrm.add(jscrlp);
        jfrm.add(jL);
        jfrm.setVisible(true);
    }
    public void valueChanged(ListSelectionEvent le) {
        int idx = jlst.getSelectedIndex();
        if(idx != -1)
            jL.setText(str[idx]);
        else
            jL.setText("Please choose a name");
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
