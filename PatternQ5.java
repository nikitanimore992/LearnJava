

class PatternQ5{

    public static void main(String[] args) {
        int m =5;
        int n=5;
    
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println("");
        }
      
    }
}