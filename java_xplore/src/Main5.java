/*import javax.swing.JFrame;*/


public final class Main5 extends JFrame {
private Main5() {
setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
getContentPane/*l*/().add(new JLabel("Xplore 2013"));
pack();
setLocationRelativeTo(null);
}

public static void main(String[] args) {
new Main5().setVisible(true);
}
}
