package PATTERNS;

public class DiamondPattern {


//      * 
//     * *
//    * * *
//   * * * *
//  * * * * *
// * * * * * *
//  * * * * *
//   * * * *
//    * * * 
//     * *
//      *


    public static void main(String[] args){
        int n=10;
        int count=n/2;
        int st=1;
        for(int i=0;i<n/2;i++){
            for(int j=0;j<count;j++){
                System.out.print(" ");
            }
            for(int k=0;k<st;k++){
                System.out.print("* ");
            }
            System.out.println();
            count-=1;
            st+=1;
        }
      
        for(int i=0;i<n/2+1;i++){
            for(int j=0;j<count;j++){
                System.out.print(" ");
            }
            for(int k=0;k<st;k++){
                System.out.print("* ");
            }
            System.out.println();
            count+=1;
            st-=1;
        }
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
// 0 1 0 1 0 1
// 1 0 1 0 1 0 1
// 0 1 0 1 0 1 0 1
// 1 0 1 0 1 0 1 0 1


        int flag=0;
        for(int i=1;i<n;i++){
            if(i%2==0){
                flag=0;
            }
            else{
                flag=1;
            }
            for(int j=1;j<=i;j++){
                if(flag==1){
                    flag=0;
                    System.out.print("1 ");
                }
                else{
                    flag=1;
                    System.out.print("0 ");
                }
            }
            System.out.println();
    }

    // 1      1
    // 12    21
    // 123  321
    // 12344321


    n=5;
    for(int i=1;i<n+1;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+"");
        }
        for(int k=(2*n-i*2);k>0;k=k-1){
            System.out.print(" ");
        }
        for(int p=i;p>0;p--){
            System.out.print(p+"");
        }
        System.out.println();

    }


        // A
        // AB
        // ABC
        // ABCD
        // ABCDE



    for(int i=1;i<n+1;i++){
        for(int j=1;j<=i;j++){
            System.out.print((char)(64+j));
        }
        System.out.println();
    }

        // **********
        // ****  ****
        // ***    ***
        // **      **
        // *        *
        // *        *
        // **      **
        // ***    ***
        // ****  ****
        // **********


    for(int i=1;i<=n;i++){
        for(int k=1;k<=n-i+1;k++){
            System.out.print("*");
        }
        for(int j=1;j<2*i-1;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=n-i+1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    for(int i=1;i<=n;i++){
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        for(int j=1;j<=2*n-2*i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }
    int k=31;
    String p=Integer.toString(k);
    System.out.println(p);
    int t=Integer.valueOf(p.charAt(1));
    System.out.println(t);

    
}
}
