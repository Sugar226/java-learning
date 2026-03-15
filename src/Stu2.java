import java.util.ArrayList;
import java.util.Scanner;

public class Stu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList();
        while (true) {
            System.out.println("1.添加学生 ");
            System.out.println("2.查看所有学生");
            System.out.println("3.删除学生 ");
            System.out.println("4.修改学生的成绩 ");
            System.out.println("5.退出");
            System.out.println("请输入你想要操作的序号;");
            int num = scanner.nextInt();
            if (num == 1) {
                try {
                    System.out.println("请输入添加学生的姓名:");
                    String stu_name = scanner.next();
                    boolean isequals = true;
                    for (int i = 0; i < list.size(); i++) {
                        Student s = list.get(i);
                        if (stu_name.equals(s.getName())) ;
                        {
                            isequals = false;
                            break;
                        }
                    }
                    if (!isequals){
                        System.out.println("名字重复啦");
                    }
                    else{
                        System.out.println("请输入添加学生的成绩:");
                        int stu_score = scanner.nextInt();
                        Student stu1 = new Student(stu_name, stu_score);
                        list.add(stu1);
                        System.out.println("添加成功！");
                    }
                } catch (Exception e) {
                    System.out.println("异常信息："+e.getMessage());
                }

            }
            else if(num==2){
                try {
                    System.out.println("所有的学生有：");
                    for(int m=0;m<list.size();m++){
                        Student s=list.get(m);
                        System.out.println(s.getName()+s.getScore());
                    }
                } catch (Exception e) {
                    System.out.println("异常信息："+e.getMessage());
                }
            }
            else if(num==3){
                try {
                    System.out.println("请输入想要删除学生的姓名：");
                    String stu_name = scanner.next();
                    boolean isequals = false;
                    for (int i = 0; i < list.size(); i++) {
                        Student s = list.get(i);
                        if (stu_name.equals(s.getName()))
                        {
                            isequals = true;
                            list.remove(i);
                            System.out.println("删除成功！");
                            break;
                        }
                    }
                    if (!isequals){
                        System.out.println("名字没找到");
                    }
                } catch (Exception e) {
                    System.out.println("异常信息："+e.getMessage());
                }
            }
            else if(num==4){
                try {
                    System.out.println("请输入想要修改学生成绩的姓名：");
                    String stu_name = scanner.next();
                    boolean isequals = false;
                    for (int i = 0; i < list.size(); i++) {
                        Student s = list.get(i);
                        if (stu_name.equals(s.getName()))
                        {
                            isequals =true;
                            System.out.println("请输入想要修改学生成绩的成绩：");
                            int stu_score = scanner.nextInt();
                                s.setScore(stu_score);
                                System.out.println("修改成功");
                            break;
                        }
                    }
                    if (!isequals){
                        System.out.println("名字没有找到");
                    }
                } catch (Exception e) {
                    System.out.println("异常信息："+e.getMessage());
                }
            }
            else if(num==5){
                break;
            }

        }
    }
}




