
package coursepack;

import static GUI.CourseraApp.mycourses;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CourseCollection {
  
   public static final String path = System.getProperty("user.home")+"/Coursera/Course.txt/";
   private List<Course> courses;
    
    public CourseCollection(){
        this.courses = new LinkedList<>();
    }
    
    public boolean addCourse(Course c){
        return courses.add(c);
    }  
    public boolean removeCourse(Course c){
        return courses.remove(c);
    }    
    
    public void modifyCourse(Course search,Course newCourse){
        int i = courses.indexOf(search);
        if(i>=0) courses.set(i,newCourse);
    }
    
    public Course searchCourse(String ref){      
        ListIterator<Course> iter = courses.listIterator();
        while(iter.hasNext()){
            Course c = iter.next();
            if(c.getReference().equals(ref)) return c;
        }
            Course c2 = new Course("No");
            return c2;
    }
    
    public void sortCourses(Comparator comp){
        Collections.sort(courses,comp);
    }
    public boolean findCourse(Course c){
        if((courses.contains(c))) return true;
         return false;
    }
    @Override
    public String toString(){
        String str="";
        ListIterator<Course> iter = courses.listIterator();
        while(iter.hasNext()){
            Course c = iter.next();
            str+=c.toString()+"\n";
        }
        return str;
    }
    public void save(String filename){
        FileOutputStream fos = null;
        ObjectOutputStream os = null;  
        try{
            fos = new FileOutputStream(filename);
            os = new ObjectOutputStream(fos);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        try{
            os.writeObject(courses);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public void load(String file){
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        try{
            courses = (List<Course>) ois.readObject();
            ListIterator<Course> iter = courses.listIterator();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(EOFException e){
            return;
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public ListIterator<Course> getCourses(){
        return courses.listIterator();
    }
}
