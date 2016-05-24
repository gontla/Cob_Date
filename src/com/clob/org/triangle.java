package com.clob.org;

public class triangle {
    public static void main ( String arg[] ){
//        InputStreamReader istream = new InputStreamReader(System.in) ;
//        BufferedReader read = new BufferedReader(istream) ;
//        System.out.print("Enter Triangle Size : ");
//        int num=0;
//        try{
//            num=Integer.parseInt( read.readLine() );
//        } catch(Exception Number){
//            System.out.println("Invalid Number!");
//        }
        int num=10;
            for(int i=1;i<=num;i++){
                for(int j=1;j<num-(i-1);j++){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                    for(int k1=1;k1<k;k1+=k){

                        System.out.print("*");
                    }
                }
                System.out.println();
            }
    }
}