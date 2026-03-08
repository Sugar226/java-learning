import java.util.ArrayList;
import java.util.Scanner;


public class StuManageooj {
    public static void main (String[] args){
    Scanner scanner=new Scanner(System.in);
    ArrayList<Student> list=new ArrayList<Student>();
        while (true) {
            System.out.println("1.添加学生");
            System.out.println("2.查看所有学生");
            System.out.println("3.修改学生成绩（1-100）");
            System.out.println("4.删除学生");
            System.out.println("5.退出");
            System.out.println("请输入你想操作的序号：");
            int num1 = scanner.nextInt();
            if(num1==1){
            System.out.print("请输入学生姓名：");
            String stu_name=scanner.next();
            System.out.println("请输入学生的成绩：");
            int stu_score = scanner.nextInt();
            Student student=new Student(stu_name,stu_score);
            list.add(student);
            System.out.println("添加成功！现在表中内容为:");
                for(int i=0;i<list.size();i++){
                    Student s2=list.get(i);
                    System.out.println(s2.getName()+"    "+s2.getScore());
                }
            }
            else if(num1==2){
                System.out.println("所有学生有：");
                for(int i=0;i<list.size();i++) {
                    Student stu=list.get(i);
                    System.out.println(stu.getName());
                }
            }
            else if(num1==3){
                System.out.println("请输入需要修改学生成绩的名字：");
                String Stu_name1 = scanner.next();
                for(int i=0;i<list.size();i++) {
                    Student stu = list.get(i);
                    if (Stu_name1.equals(stu.getName())) {
                           System.out.println("请输入需要修改学生的成绩：");
                           int Stu_score1 = scanner.nextInt();
                           stu.setScore(Stu_score1);
                           System.out.println("修改成功！现在表中内容为:");
                               for(int m=0;m<list.size();m++){
                                    Student s=list.get(m);
                                    System.out.println(s.getName()+"    "+s.getScore());
                        }
                               break;
                    }
                    else{
                           System.out.println("未找到学生："+Stu_name1);
                           break;
                    }
                }
            }
            else if(num1==4) {
                System.out.println("请输入需要删除学生的名字：");
                String Stu_name2 = scanner.next();
                for (int i = 0; i < list.size(); i++) {
                    Student stu1 = list.get(i);
                    if (Stu_name2.equals(stu1.getName())) {
                        list.remove(i);
                        System.out.println("删除成功！现在表中内容为:");
                        for(int m=0;m<list.size();m++){
                            Student s=list.get(m);
                            System.out.println(s.getName()+s.getScore());
                        }
                        break;
                    }
                    else if (!Stu_name2.equals(stu1.getName())){
                        System.out.println("未找到学生："+Stu_name2);
                        break;
                    }
                }
            }
            else if(num1==5){
                break;
            }
        }
    }
}

class Student {
    private String name;
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name, int score){
        this.name=name;
        this.score=score;
    }



}