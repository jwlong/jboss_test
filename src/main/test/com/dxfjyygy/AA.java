package com.dxfjyygy;

/**
 * Created by longjinwen on 21/07/2017.
 */
public class AA {
    public static void main(String[] args) {
        int count = 0;
        int flag = 86;
//        for(int i = 0 ;i< 88 ;i++){
//            if(flag < i) {
//                count++;
//            }
//        }
//
        for(int i = 0 ;i< 88 ;i++){
            if(flag < i) {
                for(int x =0;x<3;x++){
                    for(int j=0; j<4;j++){
                        count++;
                    }
                }
            }
        }

//        for(int i =0;i<3;i++){
//            for(int j=0; j<4;j++){
//                count++;
//            }
//        }
        System.out.println(count);
    }
}
