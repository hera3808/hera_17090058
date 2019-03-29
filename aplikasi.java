import javax.swing.*;
import java.awt.*;

public class aplikasi{
    public static void main (String[] args){
        JFrame frame = new JFrame("hallo");
        frame.setSize(300, 200);

        frame.setLayout(new BorderLayout());

        JLabel lblNama = new JLabel();
        lblNama.setText("hera");
        //frame.add(lblNama, BorderLayout.WEST);
        JLabel lblNim = new JLabel();
        lblNim.setText("17090058");

        JButton btnsimpan = new JButton("simpan");
        frame.add(btnsimpan, BorderLayout.EAST);

        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(3,1));
        frame.add(westPanel, BorderLayout.WEST);
        westPanel.add(lblNama);
        westPanel.add(lblNim);

        frame.setVisible(true);



    }
}