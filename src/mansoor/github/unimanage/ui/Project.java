package mansoor.github.unimanage.ui;

import mansoor.github.unimanage.utils.MenuItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class Project extends JFrame implements ActionListener {

    Project() {
        setSize(1540, 850);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1500, 750, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);

        JMenuBar mb = new JMenuBar();
        List<MenuItem> menuItems = List.of(
                new MenuItem("New Information", "New Faculty Information", "New Student Information"),
                new MenuItem("View Details", "View Faculty Details", "View Student Details"),
                new MenuItem("Apply Leave", "Faculty Leave", "Student Leave"),
                new MenuItem("Leave Details", "Faculty Leave Details", "Student Leave Details"),
                new MenuItem("Examination","Examination Results", "Enter Marks"),
                new MenuItem("Update Details", "Update Faculty Details","Update Student Details"),
                new MenuItem("Fee Details","Fee Structure","Student Fee Form"),
                new MenuItem("Utility","Notepad","Calculator"),
                new MenuItem("About","About"),
                new MenuItem("Exit","Exit")
        );
        menuItems.forEach(menuItem -> {
            JMenu jMenu = new JMenu(menuItem.getMain());
            mb.add(jMenu);
            for (String sub: menuItem.getSubmenu()) {
                JMenuItem jMenuItem = new JMenuItem(sub);
                jMenuItem.setBackground(Color.WHITE);
                jMenuItem.addActionListener(this);
                jMenu.add(jMenuItem);
            }
        });

        setJMenuBar(mb);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();

        try {
            if (msg.equals("Exit")) {
                setVisible(false);
            } else if (msg.equals("Calculator")) {
                Runtime.getRuntime().exec("calc.exe");
            } else if (msg.equals("Notepad")) {
                Runtime.getRuntime().exec("notepad.exe");
            } else if (msg.equals("New Faculty Information")) {
                new AddTeacher();
            } else if (msg.equals("New Student Information")) {
                new AddStudent();
            } else if (msg.equals("View Faculty Details")) {
                new TeacherDetails();
            } else if (msg.equals("View Student Details")) {
                new StudentDetails();
            } else if (msg.equals("Faculty Leave")) {
                new TeacherLeave();
            } else if (msg.equals("Student Leave")) {
                new StudentLeave();
            } else if (msg.equals("Faculty Leave Details")) {
                new TeacherLeaveDetails();
            } else if (msg.equals("Student Leave Details")) {
                new StudentLeaveDetails();
            } else if (msg.equals("Update Faculty Details")) {
                new UpdateTeacher();
            } else if (msg.equals("Update Student Details")) {
                new UpdateStudent();
            } else if (msg.equals("Enter Marks")) {
                new EnterMarks();
            } else if (msg.equals("Examination Results")) {
                new ExaminationDetails();
            } else if (msg.equals("Fee Structure")) {
                new FeeStructure();
            } else if (msg.equals("About")) {
                new About();
            } else if (msg.equals("Student Fee Form")) {
                new StudentFeeForm();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}