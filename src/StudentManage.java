import java.util.Scanner;


public class StudentManage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [][]Student=new String[5][2];//与定义对象一样
        String [][]newStudent=new String[5][2];
        while (true) {
            System.out.println("1.添加学生");
            System.out.println("2.查看所有学生");
            System.out.println("3.修改学生成绩（1-100）");
            System.out.println("4.删除学生");
            System.out.println("5.退出");
            System.out.println("请输入你想操作的序号：");
            int num2 = scanner.nextInt();
            int count=0;
            if (num2 == 1) {
                System.out.println("请输入需要添加学生的名字：");
                String Stu_name = scanner.next();
                System.out.println("请输入学生的成绩：");
                String Stu_score = scanner.next();
                Student[count][0]=Stu_name;
                Student[count][1]=Stu_score;
                count++;
                System.out.println("添加成功");
            }
            else if (num2 == 2) {
                System.out.println("所有的学生有：");
                for(int n=0;n<count;n++){
                    System.out.println(Student[n][0]+"    "+Student[n][1]);
                }
            }
            else if(num2==3){
                System.out.println("请输入需要修改学生成绩的名字：");
                String Stu_name1 = scanner.next();
                for (int n=0;n<5;n++){
                    if(Stu_name1.equals(Student[n][0])) {
                        System.out.println("请输入需要修改学生成绩的成绩");
                        String Stu_score1 = scanner.next();
                        Student[n][1] = Stu_score1;
                        System.out.println("修改成功");
                        break;
                    }
                    else if(!Stu_name1.equals(Student[n][0])){
                        System.out.println("该学生不存在");
                        }
                    }
            }
            else if(num2==4){
                System.out.println("请输入需要删除学生的名字：");
                String Stu_name2= scanner.next();
                for(int n=0;n<5;n++){
                    if(!Stu_name2.equals(Student[n][0])){
                        newStudent[n][0]=Student[n][0];
                        newStudent[n][1]=Student[n][1];
                        System.out.println("删除成功");
                        }
                    }
                System.out.println("现在所有的学生有：");
                for(int m=0;m<5;m++){
                    System.out.println(newStudent[m][0]);
                }
            }
            else if(num2==5){
                break;
            }
            else{
                System.out.println("该序号没找到，请输入菜单里的序号");
            }
        }
    }
}

