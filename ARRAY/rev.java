import java.util.Scanner;
public class rev {
    public static void main(String[] args){
        System.out.print("Enter the size of array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num[] = new int[n];
        System.out.println("Enter the elements of array:");
        for(int i=0; i<n; i++){
           num[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++) {
                if (i != j) {
                    for (int k = j+1; k < n; k++) {
                        if (j != k) {
                            if ((num[i] + num[j] + num[k]) == 0) {
                                System.out.println(num[i] + "," + num[j] + "," + num[k]);
                            }
                        }
                    }
                }
            }
        }
    }
}

