// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 03.12.2019 11:11:45
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   TitlesFrame.java

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TitlesFrame extends JFrame
{

    public TitlesFrame()
    {
        initUI();
    }

    private void initUI()
    {
        setTitle("\u041A\u0440\u0438\u0432\u044B\u0435 \u0444\u0438\u0433\u0443\u0440\u044B");
        setDefaultCloseOperation(3);
        add(new TitlesPanel(78));
        setSize(350, 350);
        setLocationRelativeTo(null);
    }

    public static void main(String args[])
    {
        SwingUtilities.invokeLater(new Runnable() {

            public void run()
            {
                TitlesFrame ps = new TitlesFrame();
                ps.setVisible(true);
            }

        }
);
    }
}