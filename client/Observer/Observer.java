package client;

import javax.swing.*;

public class Observer implements IObserver {

    public Observer(IInterfata z){
        z.RegisterObserver(this);
    }

    @Override
    public void update(String limba) {
        //System.out.println("Ati selectat limba " + limba);
        JOptionPane.showMessageDialog(null,
                "Ati selectat limba " + limba,
                "Observer",
                JOptionPane.INFORMATION_MESSAGE);
    }

}
