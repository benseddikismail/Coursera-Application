
package GUI;
import coursepack.Certificate;
import coursepack.Course;
import coursepack.CourseCollection;
import java.awt.FlowLayout;
import javax.swing.JTabbedPane;
import GUI.CRUDCoursePanel;
import static coursepack.CourseCollection.path;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

/*Ismail Ben seddik*/
//Please view the comments in each of the panels' codes

public class CourseraApp extends javax.swing.JFrame {
  
    public static CourseCollection courses;
    public static CourseCollection mycourses;
           
    public CourseraApp() {
        setTitle("Coursera Application");
        setLayout(new FlowLayout());
        courses = new CourseCollection();
        mycourses= new CourseCollection();
        initComponents();
        Course c1 = new Course("CSC 1401","MWF-> 12:00 to 12:50","Introduction to programming","This course is an introduction to the fundamentals of programming",188,Certificate.Course);
        Course c2 = new Course("MTH 2304","TR-> 5:00 to 6:20","Multivariable Calculus","This course is an introduction to the fundamentals of multivarialble calculus",145,Certificate.Specialization);
        Course c3 = new Course("DSG 1301","MWF-> 3:40 to 5:00","Graphic design","This course is an introduction to graphic design",50,Certificate.Professional);
        Course c4 = new Course("CHE 1300","TR-> 5:00 to 6:20","Introduction to Chemistry","This course is an introduction to chemistry",77,Certificate.Course);
        Course c5 = new Course("EGR 2302","MWF-> 12:00 to 12:50","Engineering Economics","This course is an introduction to economics of engineers",150,Certificate.Professional);
    courses.addCourse(c5);
    courses.addCourse(c4);
    courses.addCourse(c1);
    courses.addCourse(c2);
    courses.addCourse(c3);
    Icon icon1 = new ImageIcon(getClass().getResource("/icons/Help.png"));
    CRUDCoursePanel cr = new CRUDCoursePanel();
    Icon icon2 = new ImageIcon(getClass().getResource("/icons/Find.png"));
    CourseSearchPanel cs = new CourseSearchPanel();
    jTabbedPane1.addTab("Courses",icon1,cr);
    jTabbedPane1.addTab("Search",icon2,cs);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        save = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jMenu1.setText("File");

        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save.png"))); // NOI18N
        save.setMnemonic('S');
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jMenu1.add(save);

        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Exit.png"))); // NOI18N
        exit.setMnemonic('E');
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        help.setText("Help");

        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/About.png"))); // NOI18N
        about.setMnemonic('A');
        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        help.add(about);

        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
             mycourses.save(path);
    }//GEN-LAST:event_saveActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
       String msg = "This app enables you to add and remove \n courses as you wish with the option to \n search for your courses based on their references.";
        JOptionPane.showMessageDialog(CourseraApp.this,msg,"About",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aboutActionPerformed

    public static void main(String args[]) {
               
               CourseraApp form = new CourseraApp();
                form.setVisible(true);
               mycourses.load(path);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu help;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem save;
    // End of variables declaration//GEN-END:variables

}
