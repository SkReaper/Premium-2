package Employees;

/**
 * Created by ASUS on 09.Apr.2017.
 */
public class Employee {
    private int id_employee;
    private String last_name;
    private String first_name;
    private String username;
    private String password;
    private String cnp;
    private int id_job;
    private int id_departament;
    private String email;
    private String phone;
    private String role;

    public Employee(int id_employee,String last_name,String first_name,String username,String password,String cnp,int id_job,int id_departament,String email,String phone,String role){
        this.id_employee=id_employee;
        this.last_name=last_name;
        this.first_name=first_name;
        this.username=username;
        this.password=password;
        this.cnp=cnp;
        this.id_job=id_job;
        this.id_departament=id_departament;
        this.email=email;
        this.phone=phone;
        this.role=role;
    }

    public int getId() { return this.id_employee; }
    public String getLast_name(){ return this.last_name; }
    public String getFirst_name(){ return this.first_name; }
    public String getUsername(){ return this.username; }
    public String getPassword(){ return this.password;}
    public String getCnp(){ return this.cnp; }
    public int getId_job(){ return this.id_job; }
    public int getId_departament(){ return this.id_departament; }
    public String getEmail(){ return this.email; }
    public String getPhone(){ return this.phone; }
    public String getRole(){ return this.role; }

    public void setId(int id_employee){this.id_employee=id_employee;}
    public void setLast_name(String last_name){this.last_name=last_name;}
    public void setFirst_name(String first_name){this.first_name=first_name;}
    public void setUsername(String username){this.username=username;}
    public void setPassword(String password){this.password=password;}
    public void setCnp(String cnp){this.cnp=cnp;}
    public void setId_job(int id_job){this.id_job=id_job;}
    public void setId_departament(int id_departament){this.id_departament=id_departament;}
    public void setEmail(String email){this.email=email;}
    public void setPhone(String phone){this.phone=phone;}
    public void setRole(String role){this.role=role;}



}
