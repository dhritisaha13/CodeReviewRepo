package First;
//make the class Employee public
class Employee {
    int em_age;
    String em_name, em_designation, em_department;
    double em_salary;

    public Employee(int em_age, String em_name, String em_designation, String em_department, double em_salary) {
        this.em_age = em_age;
        this.em_name = em_name;
        this.em_designation = em_designation;
        this.em_department = em_department;
        this.em_salary = em_salary;
    }

   
}
    
     class Developer extends Employee{
         //Data members of this class should be protected
        int developer_id;
        String[] pr_language;

        public Developer(int em_age, String em_name, String em_designation, String em_department, double em_salary, int developer_id, String[] pr_language) {
            super(em_age, em_name, em_designation, em_department, em_salary);
            this.developer_id = developer_id;
            this.pr_language = pr_language;
        }
      void  update_skills(String s){
           s=".net";
          //function was incomplete, hence adding the following lines of code.
           StringBuilder s1 = new StringBuilder().append(pr_language).append(s);
           s1.toString(); 
          
        }

        double rais_salary(double val)
        {
            //operation performed incorrectly
            //function name should be raise_salary
            val=em_salary+=24789.12;
            return val;
            
            //System.out.println();
        }
        void change_designation(String s){
            
            //function is incomplete
        }
        double display_salary(){
            return em_salary;
        }
    }
public class Lakshmisonikar {
    public static void main(String[] args) {
        Developer d1=new Developer(1,"laxmi","Tester","banking",23343.00,435, new String[]{"java", "html", "python"});
        d1.em_designation="Java 14"; //should be d1.pr_language="Java 14";
        //double val = 0;
        d1.rais_salary(val);
        //backup object missing
        //missing operations
        
        
    }
}
