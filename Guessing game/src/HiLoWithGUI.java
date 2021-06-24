import javax.swing.*;
JFrame window = new JFrame("Guess the number ");
JPanel panel = new JPanel();
JButton button = new JButton("Click Me!");
panel.add(button);
window.add(panel);
window.setSize(300,100);
button.addActionListener(
    System.out.println("Ouch you clicked me!"));
window.setVisibile(true);
public class HiLoWithGUI {
    
}
