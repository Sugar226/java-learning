package BookManage;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> list = new ArrayList<>();
        int Book_Id = 1;
        boolean isBorrowed=true;
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
                    Book book = new Book(Book_title, Book_author, Book_price,Book_Id,isBorrowed);
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
            else if(num==6){
                Boolean isequals = false;
                System.out.println("请输入你想借阅图书的名字：");
                String Book_title = scanner.next();
                for (int i = 0; i < list.size(); i++) {
                    Book b = list.get(i);
                    if (Book_title.equals(b.getTitle())) {
                        isequals = true;
                        if(isBorrowed) {
                            System.out.println("成功借出该图书!");
                            isBorrowed=false;
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
                for (int i = 0; i < list.size(); i++) {
                    Book b = list.get(i);
                    if (Book_title.equals(b.getTitle())) {
                        isequals = true;
                        if(!isBorrowed) {
                            System.out.println("成功还回该图书!");
                            isBorrowed=true;
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
        private boolean isBorrowed;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Book(String title, String author, double price, int id,boolean isBorrowed) {
            this.title = title;
            this.author = author;
            this.price = price;
            this.id=id;
            this.isBorrowed=isBorrowed;
        }

    }