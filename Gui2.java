package Lab4;
import java.awt.*;
import javax.swing.*;
public class Gui2 extends JFrame
{
    JTextField jta = new JTextField(13);

    Font fnt = new Font("Arial",Font.BOLD,11);
    Gui2()
    {
        super("Example");
        setLayout(new FlowLayout());
        setSize(450,250);
        add(jta);
        jta.setForeground(Color.CYAN);
        jta.setFont(fnt);
        setVisible(true);
    }

    public static void main(String[]args)
    {
        new Gui2();
    }
}