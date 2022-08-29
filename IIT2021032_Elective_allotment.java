import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class branch{
    ArrayList<String> branch_name1 = new ArrayList<>();
    branch() {
        branch_name1.add("1 :INFORMATION TECHNOLOGY");
        branch_name1.add("2 :ELECTRONICS AND COMMUNICATION ENGINEERING");
        branch_name1.add("3 :INFORMATION TECHNOLOGY AND BUSINESS INFORMATICS");
    }
    int idx;
    void display()
    {
        System.out.println(branch_name1.get(0));
        System.out.println(branch_name1.get(1));
        System.out.println(branch_name1.get(2));

    }
    void display_branch(String s)
    {
        System.out.println("NAME " + s + "::  BRANCH " + branch_name1.get(idx));

    }




}
class core_courses_sem1{
    ArrayList<String> core_course_sem1_name = new ArrayList<>();
         core_courses_sem1() {
         core_course_sem1_name.add("PHYSICS                                    (INSTRUCTOR= DR . Chirag Nain");
        core_course_sem1_name.add("INTRODUCTION TO PROGRAMMING                 (INSTRUCTOR= Dr.  Ashutosh Verma");
        core_course_sem1_name.add("LINEAR ALGEBRA                              (INSTRUCTOR= Dr.  Abhishek Singh");
        core_course_sem1_name.add("PROFESSIONAL COMMUNICATION                  (INSTRUCTOR= Dr.  Jay Prakash");
        core_course_sem1_name.add("FUNDAMENTALS OF ELECTRICAL AND ELECTRONICS  (INSTRUCTOR=Dr.   Samyak Jain");

    }
    void display()
    {
        for(int i =0;i<5;i++) {
            System.out.println(core_course_sem1_name.get(i));
        }
    }



}
class core_courses_sem2{
    ArrayList<String> core_course_sem2_name = new ArrayList<>();
    core_courses_sem2() {

        core_course_sem2_name.add("COMPUTER ARCHITECTURE & ORGANISATION           (INSTRUCTOR=  Dr. Aman Jain");
        core_course_sem2_name.add("PRINCIPLES OF COMMUNICATION ENGINEERING        (INSTRUCTOR=  Dr. Amit Kumar");
        core_course_sem2_name.add("PRINCIPLES OF ECONOMICS                        (INSTRUCTOR=  Dr. Naman Jain");
        core_course_sem2_name.add("UNIVARIATE AND MULTIVARIATE CALCULUS           (INSTRUCTOR=  Dr. Surendra Tholiya");
        core_course_sem2_name.add("DISCRETE MATHEMATICS                           (INSTRUCTOR=  Dr. Nitish Kushwaha");
        core_course_sem2_name.add("DATA STRUCTURES AND ALGORITHM                  (INSTRUCTOR=  Dr. Chirag");
    }
    void display()
    {
        for(int i =0;i<5;i++) {
            System.out.println(core_course_sem2_name.get(i));
        }
    }


}
class elective_courses extends Thread{
    double cgpa =10;
    HashMap<String, Integer> elective_courses_sem1_name = new HashMap<>();
    HashMap<String,Integer> elective_courses_sem2_name = new HashMap<>();
    elective_courses() {
        try{
            elective_courses.sleep(100);
        }
        catch (Exception d)
        {
            System.out.println("ERROR");
        }

        elective_courses_sem2_name.put("1 : PYTHON", 1 );
        elective_courses_sem2_name.put("2 : WEB DEVELOPMENT",2);
        elective_courses_sem2_name.put("3 : APP DEVELOPMENT",3);
        elective_courses_sem2_name.put("4 : BLOCKCHAIN",4);
        elective_courses_sem2_name.put("5 : OPEN SOURCE DEVELOPMENT",5);
        elective_courses_sem2_name.put("6 : CYBERSECURITY",6);
        elective_courses_sem2_name.put("7 : DESIGN AND VIDEO EDITING",7);
        elective_courses_sem2_name.put("8 : ETHICAL HACKING",8);
        elective_courses_sem2_name.put("9 : COMPETITIVE PROGRAMMING",9);
        elective_courses_sem2_name.put("10: ROBOTICS",10);

        try{
            elective_courses.sleep(1500);
        }
        catch (Exception e)
        {
            System.out.println("ERROR");
        }


    }
    void display_after_preference()
    {
        try{
            elective_courses.sleep(2100);
        }
        catch (Exception d)
        {
            System.out.println("ERROR");
        }
        System.out.println("AVAILAIBLE CHOICES NOW : ");
        System.out.println();

        for (Map.Entry<String,Integer> e : elective_courses_sem2_name.entrySet())
        {
            if(e.getValue()>0) {
                System.out.println(" Subjects order is :  " + e.getKey());
            }

        }
        try{
            elective_courses.sleep(2500);
        }
        catch (Exception d)
        {
            System.out.println("ERROR");
        }
    }
    void display()
    {
        for (Map.Entry<String,Integer> e : elective_courses_sem2_name.entrySet())
        {

                System.out.println(" Subjects order is :  " + e.getKey());

        }
        try{
            elective_courses.sleep(1800);
        }
        catch (Exception c)
        {
            System.out.println("ERROR");
        }
    }

    int fixed1;
    int fixed2;
    int fixed3;
    void Set_courses (int a , int b ,int c )
    {
        fixed1 =a;
        fixed2=b;
        fixed3=c;
        for(Map.Entry<String,Integer> mm : elective_courses_sem2_name.entrySet())
        {
            if(mm.getValue()==a)
            {
                mm.setValue(-1);
            }
            if(mm.getValue()==b)
            {
                mm.setValue(-1);
            }
            if(mm.getValue()==c)
            {
                mm.setValue(-1);
            }
        }

    }

    void final_allotment (int a , int b, int c , String s)
    {

        if(cgpa>9)
        {
            int ans;
            if(a!=fixed1 && a!=fixed2 && a!=fixed3)
                ans = a;
            else if (b!=fixed1 && b!=fixed2 && b!=fixed3)
                ans=b;
            else if(c!=fixed1 && c!=fixed2 && c!=fixed3)
                ans =c;
            else
                ans=0;


            try{
                elective_courses.sleep(1800);
            }
            catch (Exception e)
            {
                System.out.println("ERROR");
            }
            if(ans==0)
            {
                System.out.println(s + " SORRY ! YOU CANNOT BE ALLOTED ANY COURSE ACCORDING TO YOUR PREFERENCE ORDER. YOU HAVE LOW CGPA FOR YOUR PREFERENCE");
            }
            for(Map.Entry<String, Integer> ll : elective_courses_sem2_name.entrySet())
            {
                if(ll.getValue()==ans)
                {
                    System.out.println("YOU HAVE BEEN ALLOTED "+ ll.getKey());
                    break;
                }
            }
        }

        else if(cgpa<=9 && cgpa>8)
        {
            int ans =0;
            if(a>6 )
            {
                a=0;
            }
            if(b>6)
            {
                b=0;
            }
            if(c>6)
            {
                c=0;
            }

            if(a!=fixed1 && a!=fixed2 && a!=fixed3)
                ans = a;
            else if (b!=fixed1 && b!=fixed2 && b!=fixed3)
                ans=b;
            else if(c!=fixed1 && c!=fixed2 && c!=fixed3)
                ans =c;
            else
                ans=0;

            if(a==0 && b==0 && c==0)
            {
                System.out.println(s + " SORRY ! YOU CANNOT BE ALLOTED ANY COURSE ACCORDING TO YOUR PREFERENCE ORDER. YOU HAVE LOW CGPA FOR YOUR PREFERENCE");
                return;
            }
            if(a==0 && b!=0)
            {
                ans = b;
            }
            if(a==0 && b==0 && c!=0)
            {
                ans = c;
            }
            for(Map.Entry<String, Integer> ll : elective_courses_sem2_name.entrySet())
            {
                if(ll.getValue()==ans)
                {
                    System.out.println( s + " YOU HAVE BEEN ALLOTED "+ ll.getKey());
                    break;
                }
            }


        }
        else if(cgpa>=7 && cgpa<=8)
        {
            int ans=0;
            if(a>4)
            {
                a=0;
            }
            if(b>4)
            {
                b=0;
            }
            if(c>4)
            {
                c=0;
            }

            if(a!=fixed1 && a!=fixed2 && a!=fixed3)
                ans = a;
            else if (b!=fixed1 && b!=fixed2 && b!=fixed3)
                ans=b;
            else if(c!=fixed1 && c!=fixed2 && c!=fixed3)
                ans =c;
            else
                ans=0;
            if(a==0 && b==0 && c==0)
            {

                System.out.println(s + " SORRY ! YOU CANNOT BE ALLOTED ANY COURSE ACCORDING TO YOUR PREFERENCE ORDER. YOU HAVE LOW CGPA FOR YOUR PREFERENCE");
                return;
            }
            if(a==0 && b!=0)
            {
                ans = b;
            }
            if(a==0 && b==0 && c!=0)
            {
                ans = c;
            }

            if(ans==0)
            {
                System.out.println(s + " SORRY ! YOU CANNOT BE ALLOTED ANY COURSE ACCORDING TO YOUR PREFERENCE ORDER. YOU HAVE LOW CGPA FOR YOUR PREFERENCE");
                return;
            }
            for(Map.Entry<String, Integer> ll : elective_courses_sem2_name.entrySet())
            {
                if(ll.getValue()==ans)
                {
                    System.out.println(s+ " YOU HAVE BEEN ALLOTED "+ ll.getKey());
                    break;
                }
            }

        }
    }




}







public class IIT2021032_Elective_allotment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("************WELCOME TO THE COURSE REGISTRATION PORTAL*****************");
        elective_courses ele = new elective_courses();
        branch bra = new branch();
        core_courses_sem2 coursesem2 = new core_courses_sem2();
        core_courses_sem1 coursesem1 = new core_courses_sem1();



        String s ;
        System.out.println("ENTER YOUR NAME :");
        s = sc.next();
        bra.display();
        System.out.println("ENTER YOUR BRANCH CODE");
         bra.idx= sc.nextInt();

        System.out.println("ENTER YOU CGPA");
        ele.cgpa = sc.nextDouble();
        System.out.println("ENTER YOUR SEMESTER");
        int semm = sc.nextInt();
        int p, q, r;
        if(semm==1)
        {
            System.out.println();
            System.out.println();
            System.out.println("YOUR CORE COURSE OF SEMESTER 1");
            coursesem1.display();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("ELECTIVE COURSES FOR YOU");
            ele.display();
        }
        else{
            System.out.println();
            System.out.println();
            System.out.println("YOUR CORE COURSE OF SEMESTER 2");
            coursesem2.display();
            System.out.println();
            System.out.println("ELECTIVE COURSES FOR YOU");
            ele.display();
            System.out.println("WHICH THREE ELECTIVE COURSES DID YOU TOOK IN SEM2 . enter the code numbers");
            p = sc.nextInt();
            q = sc.nextInt();
            r = sc.nextInt();
            ele.Set_courses(p,q,r);
            ele.display_after_preference();
        }



        System.out.println("ENTER PREFERENCE ORDER FOR YOUR ELECTIVES . YOUR CGPA : " + ele.cgpa);
        System.out.println("* cgpa>9 == all courses are available");
        System.out.println("* 9>=cgpa and cgpa>8 == courses with value less than 6 available");
        System.out.println("* 8>=cgpa and cgpa>7 == courses with value less than 4 available");
        System.out.println("* cgpa>9 == all courses are available");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        bra.display_branch(s);
        ele.final_allotment(a,b,c,s);



    }
}
