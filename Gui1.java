package Lab4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui1 extends JFrame
{
    JTextArea textArea = new JTextArea(15,10);
    JScrollPane Scroll = new JScrollPane(textArea);
    JButton button = new JButton("Add some Text");
    public Gui1()
    { super("Example");
        setSize(500,500);
        setLayout(new FlowLayout());
        add(textArea);
        add(Scroll);
        setVisible(true);
        add(button);
        Scroll.setViewportView(textArea);
        button.addActionListener (new ActionListener()
        {
            public void actionPerformed(ActionEvent
                                                ae)

            {

                String txt = JOptionPane.showInputDialog(null,"Insert some text");
                textArea.append(txt);
            }
        });
    }

    public static void main(String[]args)
    {
        new Gui1().setVisible(true);

    }
}