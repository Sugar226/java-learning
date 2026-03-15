package BookManage;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        int Book_Id = 1;
        while (true) {
            System.out.println("\n===== 图书管理系统 =====");
            System.out.println("1. 添加图书");
            System.out.println("2. 查看所有图书");
            System.out.println("3. 按书名搜索图书");
            System.out.println("4. 删除图书");
            System.out.println("5. 修改图书信息");
            System.out.println("6. 借书");
            System.out.println("7. 还书");
            System.out.println("8. 退出");
            System.out.print("请选择操作：");
            int num = scanner.nextInt();
            if (num == 1) {
                Boolean isequals = false;
                System.out.println("请输入想添加图书的名字:");
                String Book_title = scanner.next();
                for (int i = 0; i < list.size(); i++) {
                    Book b = list.get(i);
                    if (Book_title.equals(b.getTitle())) {
                        isequals = true;
                        break;
                    }
                }
                if (isequals) {
                    System.out.println("图书已经存在");
                } else {
                    System.out.println("请输入想添加图书的作者:");
                    String Book_author = scanner.next();
                    System.out.println("请输入想添加图书的价格:");
                    double Book_price = scanner.nextDouble();
                    Book_Id++;
                    Book book = new Book(Book_title, Book_author, Book_price,Book_Id);
                    list.add(book);
                    System.out.println("图书信息添加成功！");
                }
            } else if (num == 2) {
                for (int i = 0; i < list.size(); i++) {
                    Book b = list.get(i);
                    System.out.println(b.getTitle() + "  " + b.getAuthor() + "   "
                            + b.getPrice() + "   " + b.getId()+ "   " + b.isBorrowed());
                }
            } else if (num == 3) {
                Boolean isequals = false;
                System.out.println("请输入你想搜索图书的名字：");
                String Book_title = scanner.next();
                for (int i = 0; i < list.size(); i++) {
                    Book b = list.get(i);
                    if (Book_title.equals(b.getTitle())) {
                        System.out.println(b.getTitle() + "  " + b.getAuthor() + "   "
                                + b.getPrice() + "   " + b.getId()+ "   " + b.isBorrowed());
                        isequals = true;
                        break;
                    }
                }
                if (!isequals) {
                    System.out.println("图书不存在");
                }
            }
            else if (num == 4) {
                Boolean isequals = false;
                System.out.println("请输入你想删除图书的名字：");
                String Book_title = scanner.next();
                for (int i = 0; i < list.size(); i++) {
                    Book b = list.get(i);
                    if (Book_title.equals(b.getTitle())) {
                        list.remove(i);
                        isequals = true;
                        break;
                    }
                }
                if (!isequals) {
                    System.out.println("图书不存在");
                }
            }
            else if(num==5){
                Book newbook=null;
                System.out.println("请输入想修改图书信息的名字");
                String Book_title = scanner.next();
                for (int i = 0; i < list.size(); i++) {
                    Book b = list.get(i);
                    if (Book_title.equals(b.getTitle())) {
                        newbook = b;
                        break;
                    }
                }
                if(newbook==null){
                    System.out.println("图书不存在");
                    break;
                }
                    System.out.println("1.图书名字");
                    System.out.println("2.图书价格");
                    System.out.println("3.图书作者");

                    System.out.println("请输入你想要修改哪个信息：");
                    int set_num=scanner.nextInt();
                    switch(set_num){
                        case 1:
                            System.out.println("请输入想修改图书的新名字:");
                            String set_title=scanner.next();
                            newbook.setTitle(set_title);
                            System.out.println("修改成功");
                            break;
                        case 2:
                            System.out.println("请输入想修改图书的新价格:");
                            double set_price=scanner.nextDouble();
                            newbook.setPrice(set_price);
                            System.out.println("修改成功");
                            break;
                        case 3:
                            System.out.println("请输入想修改图书的新作者:");
                            String set_author=scanner.next();
                            newbook.setAuthor(set_author);
                            System.out.println("修改成功");
                            break;
                    }


            }
            else if(num==6){
                Boolean isequals = false;
                System.out.println("请输入你想借阅图书的名字：");
                String Book_title = scanner.next();
                for (int i = 0; i < list.size(); i++) {
                    Book b = list.get(i);
                    if (Book_title.equals(b.getTitle())) {
                        isequals = true;
                        if(!b.isBorrowed()) {
                            System.out.println("成功借出该图书!");
                            b.setBorrowed(true);
                            break;
                        }
                        else{
                            System.out.println("该图书已被借出");
                        }
                    }
                }
                if (!isequals) {
                    System.out.println("图书不存在");
                }
            }
            else if(num==7){
                Boolean isequals = false;
                System.out.println("请输入你想还图书的名字：");
                String Book_title = scanner.next();
                for (int i = 0; i < list.size(); i++){
                    Book b = list.get(i);
                    if (Book_title.equals(b.getTitle())) {
                        isequals = true;
                        if(!b.isBorrowed()) {
                            System.out.println("成功还回该图书!");
                            b.setBorrowed(true);
                            break;
                        }
                        else{
                            System.out.println("该图书没有被借出");
                        }
                    }
                }
                if (!isequals) {
                    System.out.println("图书不存在");
                }
            }
            else if(num==8){
                break;
            }

        }
    }
}

    class Book {
        private int id;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public boolean isBorrowed() {
            return isBorrowed;
        }

        public void setBorrowed(boolean borrowed) {
            isBorrowed = borrowed;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        private String title;
        private String author;
        private double price;
        private boolean isBorrowed=false;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Book(String title, String author, double price, int id) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.id=id;
        }

    }