
package coursepack;

import java.io.Serializable;

public class Course implements Serializable{
   private static final long serialVersionID= 1703200076466L;
   private String reference,session_time,title,description;
   private float fees;
   private Certificate certificate;
   
      public Course(String reference,String session_time,String title,String description,float fees,Certificate cer){
       this.reference=reference;
       this.session_time=session_time;
       this.title=title;
       this.description=description;
       this.fees=fees;
       this.certificate=cer;
   }

    public Course(String no) {
        this.title=no;
    }

   public void setReference(String ref){
       this.reference=ref;
         }
   public String getReference(){
       return reference;
   }
   public void setSession_time(String sessiontime){
       this.session_time=sessiontime;
   }
   public String getSession_time(){
       return session_time;
   }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public String getDescription(){
        return description;
    }
  
    public void setFees(float fees){
        this.fees=fees;
    }
    public float getFees(){
        return fees;
    }

    public String toString(){
        return "Title: "+title;
                }
    
        @Override
    public boolean equals(Object o){
           if((o!=null) && (o instanceof Course)){
           Course m = (Course) o;
           return(m.getReference().equals(this.reference));
       }
           return false;
    }

    /**
     * @return the certificate
     */
    public Certificate getCertificate() {
        return certificate;
    }

    /**
     * @param certificate the certificate to set
     */
    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }
} 
