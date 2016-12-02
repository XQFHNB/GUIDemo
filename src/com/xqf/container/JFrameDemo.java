package com.xqf.container;

import javax.swing.*;
import java.awt.*;

/**
 * Created by XQF on 2016/12/2.
 */
public class JFrameDemo extends JFrame {
    //// TODO: 2016/12/2 成员变量的声明，后续添加 
    public JFrameDemo() {
        this.setTitle("JFrame 窗口演示");
        Container contentPane=this.getContentPane();
        contentPane.setLayout(new BorderLayout());
        // contentPane.add(其他组件)
        // 其他处理
        this.setVisible(true);
        this.setSize(600, 400);
    }

    public static void main(String[] args) {
        new JFrameDemo();
    }
}
