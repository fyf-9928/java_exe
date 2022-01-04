package chapter7;
import java.util.Arrays;
import java.util.Scanner;

public class ex7_17 {

	public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("输入学生个数：");
        int length = input.nextInt();

        String[] names = new String[length];
        int[] scores = new int[length];

        System.out.print("输入姓名成绩：");
        for (int i = 0 ; i < length ; i++){
            names[i] = input.next();
            scores[i] = input.nextInt();
        }

        String[] names_feedback = new String[length];
        names_feedback = sort(names, scores);

        System.out.print(Arrays.toString(names_feedback));
    }

    public static String[] sort(String[] names, int[] scores){

        String[] names_feedback = new String[names.length];

        int index = -1;     // 保存最大值下标
        for (int i = 0 ; i < names.length ; i++) {

            index = list_max(scores);

            names_feedback[i]=names[index];
            scores[index]=-1;
        }

        return names_feedback;
    }

    //4+ 自定义方法list_max()，传入scores数组并接收除负数外最大值的下标
    public static int list_max(int[] scores){

        int temp_max = 0, temp_index = -1;
        int length = scores.length;

        for (int i = 0 ; i < length ; i++){
            if (temp_max < scores[i] && scores[i] >= 0){
                temp_max = scores[i];
                temp_index = i;
            }
        }

        return temp_index;

	}

}
