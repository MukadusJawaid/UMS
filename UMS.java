 import java.util.Scanner;
interface Employees{
    public void idPass();
    public void students(); }
class Admin implements Employees{ 
@Override
    public void idPass() {
        Scanner in= new Scanner(System.in);
        System.out.println("Admin id : ");
        int id= in.nextInt();
        System.out.println("Password : ");
        
        int pass= in.nextInt();
        if (id==104 && pass==454){
            System.out.println("Welcome Admin To DashBoard!\n");
            students();}
        else{
            System.out.println("Sorry Wrong Credentials!");}}
    @Override
    public void students() {
        String[] studentname = {"Mukadus","Abdullah","Rabee","Nofil"};
        String[] rollno={"SE2-104","SE20-135","SE20-137","SE20-140"};
        double[] cgpa= {3.74, 3.87,3.74,3.85};
        String[] sem={"5th","5th","6th","8th"};
        System.out.println("\t\t\t\t\t\tSTUDENT DETAILS\n");
        System.out.println("STUDENT NAME\t\t ROLL NUMBER\t\t CGPA\t\t SEMESTER\t\t");
        System.out.println(studentname[0]+"\t\t\t\t  "+rollno[0]+"\t\t\t "+cgpa[0]+"\t\t\t"+sem[0]);
        System.out.println(studentname[1]+"\t\t\t  "+rollno[1]+"\t\t\t "+cgpa[1]+"\t\t\t"+sem[1]);
        System.out.println(studentname[2]+"\t\t\t\t  "+rollno[2]+"\t\t\t "+cgpa[2]+"\t\t\t"+sem[2]);
        System.out.println(studentname[3]+"\t\t\t\t  "+rollno[3]+"\t\t\t "+cgpa[3]+"\t\t\t"+sem[3]);}}
class AdmissionClasses extends Admin{
    public void classes(){
        System.out.println("New Batch Classes Will Be Started from 1st of August 2022");}}
class Examination extends Admin{
        void exams(){
            System.out.println("Software Engineering Students Mid-term Date : May/10/2022");
            System.out.println("Software Engineering Students Final-exam Date : July/10/2022");
            System.out.println("Architecture Students Mid-term Date : May/12/2022");
            System.out.println("Architecture Students Final-exam Date : July/8/2022");
            System.out.println("Bio-Medical Students Mid-term Date : May/10/2022");
            System.out.println("Bio-Medical Students Final-exam Date : July/10/2022");}}
class Faculty implements Employees{
    @Override
    public void idPass() {
        Scanner a= new Scanner(System.in);
        System.out.println("Faculty id : ");
        int id= a.nextInt();
        Scanner p= new Scanner(System.in);
        System.out.println("Password : ");
        int pass= p.nextInt();
        if (id==135 && pass==555){
            System.out.println("\t\t\t\t\tWelcome Abdullah To DashBoard!\n");
            System.out.println("\n Your Timetable For the Week");
            String []days={"Monday","Thursday","Friday"};
            String [] time={"1:00pm-2:30pm","8:30am-10:00am","10:00am-11:00am"};
            String[] classno={"CF-04","CS-02","CG-01"};
            System.out.println("\n"+"DAY: "+days[0]+" Time: "+time[0]+" Room: "+classno[0]);
            System.out.println("DAY: "+days[1]+" Time: "+time[1]+" Room: "+classno[1]);
            System.out.println("DAY: "+days[2]+" Time: "+time[2]+" Room: "+classno[2]);}
else if (id==137 && pass==777){
            System.out.println("\t\t\t\t\tWelcome Rabee To DashBoard!\n");
            String []days={"Tuesday","Wednesday"};
            String [] time={"1:00pm-2:30pm","8:30am-10:00am"};
            String[] classno={"CF-04","CS-02"};
            System.out.println("\n Your Timetable For the Week");
            System.out.println("\nDAY: "+days[0]+" Time: "+time[0]+" Room: "+classno[0]);
            System.out.println("DAY: "+days[1]+" Time: "+time[1]+" Room: "+classno[1]);}
        else if (id==140 && pass==000){
            System.out.println("\t\t\t\t\tWelcome Nofil To DashBoard!\n");
            String []days={"Thursday"};
            String [] time={"10:00am-11:00am"};
            String[] classno={"CS-02"};
            System.out.println("\n Your Timetable For the Week");
            System.out.println("\nDAY: "+days[0]+" Time: "+time[0]+" Room: "+classno[0]);}
        else{
            System.out.println("Sorry! User Wrong Credentials");}}
    @Override
    public void students() {
        String[] studentname = {"Mukadus","Abdullah","Rabee","Nofil"};
        String[] rollno={"SE2-104","SE20-135","SE20-137","SE20-140"};
        double[] cgpa= {3.74, 3.87,3.74,3.85};
        String[] sem={"5th","5th","6th","8th"};
        System.out.println("\t\t\t\t\t\tSTUDENT DETAILS\n");
        System.out.println("STUDENT NAME\t\t ROLL NUMBER\t\t CGPA\t\t SEMESTER\t\t");
        System.out.println(studentname[0]+"\t\t\t\t  "+rollno[0]+"\t\t\t "+cgpa[0]+"\t\t\t"+sem[0]);
        System.out.println(studentname[1]+"\t\t\t  "+rollno[1]+"\t\t\t "+cgpa[1]+"\t\t\t"+sem[1]);
        System.out.println(studentname[2]+"\t\t\t\t  "+rollno[2]+"\t\t\t "+cgpa[2]+"\t\t\t"+sem[2]);
        System.out.println(studentname[3]+"\t\t\t\t  "+rollno[3]+"\t\t\t "+cgpa[3]+"\t\t\t"+sem[3]);}}
class Professor extends Faculty{
    void timetable(){
        Faculty tt= new Faculty();
        tt.idPass(); }}
class AssistantProfessor extends Faculty{
    void assistant(){
        Scanner in =new Scanner(System.in);
        System.out.println("Professor id: ");
        int id= in.nextInt();
        if(id==555){
            System.out.println("1.Prepare Notes");
            System.out.println("2.Maintain Attendance");
            System.out.println("3.Upload Marks");
            System.out.println("4.Upload Assignment\n");
            System.out.println("To see Student List, press y");
            String ch=in.next();
            char choice;
            do {
                Faculty f=new Faculty();
                f.students();
                System.out.println("\nPress e to exit");
                choice = in.next().charAt(0);}
            while (choice=='y'||choice=='Y');}
        else if(id==777){
            System.out.println("1.Maintain Attendance");
            System.out.println("2.Upload Quiz\n");
            System.out.println("To see Student List, press y");
            String ch=in.next();
            char choice;
            do {
                Faculty f=new Faculty();
                f.students();
                System.out.println("\nPress e to exit");
                choice = in.next().charAt(0);}
            while (choice=='y'||choice=='Y');}
        else if(id==000){
            System.out.println("1.Prepare Notes");
            System.out.println("2.Maintain Attendance");
            System.out.println("3.Upload Marks\n");
            System.out.println("To see Student List, press y");
            String ch=in.next();
            char choice;
            do {
                Faculty f=new Faculty();
                f.students();
                System.out.println("\nPress e to exit");
                choice = in.next().charAt(0);}
            while (choice=='y'||choice=='Y');}
        else {
            System.out.println("Sorry Assistant Wrong Credentials"); } } }
class Lecturer extends Faculty{
    void lecturer(){
    Scanner in = new Scanner(System.in);
    System.out.println("id: ");
    int id= in.nextInt();
    Scanner pas = new Scanner(System.in);
    System.out.println("pass: ");
    int pass= pas.nextInt();
    if(id==111 && pass==222){
        System.out.println("You'll be delivering HCI classes this year to 5th semester"); }
    else if(id==122 && pass==522){
            System.out.println("You'll be delivering SC&D lab classes this year to 5th semester"); }
    else {
        System.out.println("Sorry! You Entered Wrong Credentials!");} } }
public class UMS {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        char choice;
        do {
            System.out.println("FOR ADMIN PORTAL press a\n FOR FACULTY PORTAL press b\n " +
                    "FOR ASSISTANT PROFESSOR PORTAL press c\n FOR LECTURER PORTAL press d\n" +
                    "FOR TIMETABLE OF EXAMS press e\n" + "FOR NEW ADMISSION CLASSES SCHEDULE press f");
            String chr = in.next();
switch (chr) {

case "a":
    Admin admin = new Admin();
    admin.idPass();
    break;
case "b":
    Professor professor = new Professor();
    professor.timetable();
    break;
case "c":
    AssistantProfessor ap = new AssistantProfessor();
    ap.assistant();
    break;
case "d":
    Lecturer l = new Lecturer();
    l.lecturer();
    break;
case "e":
    Examination e = new Examination();
    e.exams();
    break;
case "f":
    AdmissionClasses ac = new AdmissionClasses();
    ac.classes();
    break;
default:
    System.out.println("Please Enter Correct Character!"); }
System.out.println("\nDo You Want To Continue(Y/N)");
choice = in.next().charAt(0); }
while (choice == 'Y' || choice == 'y'); } }
