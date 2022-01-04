package self;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class getStudentInformation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生信息(学号-姓名-年龄):");
		String info = "";
		String[] s;
		//创建集合用于存放学生对象
		ArrayList<Student> array = new ArrayList<Student>();
		//循环录入
		while(true){
			info = sc.next();
			if(info.equals("exit")){
				break;
			}
			s = info.split("-");
			array.add(new Student(s[0], s[1], Integer.parseInt(s[2])));
		}
		//比较年龄大小
		Collections.sort(array,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge()-o2.getAge();
			}

		});
		//遍历集合
		for (Student student : array) {
			System.out.println(student);
		}
        //读入到记事本中
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("C:\\student.txt"))));
			for(int i = 0;i<array.size();i++){
				bw.write(array.get(i).getNumber()+"-"+array.get(i).getName()+"-"+array.get(i).getAge());
				bw.newLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
             //释放资源
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

class Student{
	private String number;
	private String name;
	private int age;

	public Student() {}

	public Student(String number ,String name ,int age) {
		this.number=number;
		this.name=name;
		this.age=age;
	}

	public void setNumber(String number) {
		this.number=number;
	}

	public String getNumber() {
		return number;
	}


	public void setName(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age=age;
	}

	public int getAge() {
		return age;
	}
}
