package com.example.mr_robot.map_practical_5;

import android.widget.TextView;

import java.util.Random;

public class equation_generator {
    public String generator_method(int lvl, TextView tv) {
        Random r = new Random();
        int ans=0;
        String[] operator = {"+","-","*","/"};
        if(lvl==1){
            int x = r.nextInt(10);
            int y = r.nextInt(10);
            int index = r.nextInt(1);
            tv.setText(String.valueOf(x)+operator[index]+String.valueOf(y));
            switch (index) {
                case 0 :
                        ans = x+y;
                        break;
                case 1 :
                    ans = x-y;
                    break;
                case 2 :
                    ans = x*y;
                    break;
                case 3 :
                    ans = x/y;
                    break;
                default:
                    break;
            }
        }
        if(lvl==2){
            int x = r.nextInt(10);
            int y = r.nextInt(10);
            int z = r.nextInt(10);
            int index1 = r.nextInt(2);
            int index2 = r.nextInt(2);
            tv.setText(String.valueOf(x)+operator[index1]+String.valueOf(y)+operator[index2]+String.valueOf(z));
            switch (index1) {
                case 0 :
                    ans = x+y;
                    break;
                case 1 :
                    ans = x-y;
                    break;
                case 2 :
                    ans = x*y;
                    break;
                case 3 :
                    ans = x/y;
                    break;
                default:
                    break;
            }
            switch (index2) {
                case 0 :
                    ans = ans+z;
                    break;
                case 1 :
                    ans = ans-z;
                    break;
                case 2 :
                    ans = ans*z;
                    break;
                case 3 :
                    ans = ans/z;
                    break;
                default:
                    break;
            }
        }
        if(lvl==3){
            int x = r.nextInt(10);
            int y = r.nextInt(10);
            int z = r.nextInt(10);
            int z1 = r.nextInt(10);
            int index1 = r.nextInt(3);
            int index2 = r.nextInt(3);
            int index3 = r.nextInt(3);
            tv.setText(String.valueOf(x)+operator[index1]+String.valueOf(y)+operator[index2]+String.valueOf(z)+operator[index3]+String.valueOf(z1));
            switch (index1) {
                case 0 :
                    ans = x+y;
                    break;
                case 1 :
                    ans = x-y;
                    break;
                case 2 :
                    ans = x*y;
                    break;
                case 3 :
                    ans = x/y;
                    break;
                default:
                    break;
            }
            switch (index2) {
                case 0 :
                    ans = ans+z;
                    break;
                case 1 :
                    ans = ans-z;
                    break;
                case 2 :
                    ans = ans*z;
                    break;
                case 3 :
                    ans = ans/z;
                    break;
                default:
                    break;
            }
            switch (index3) {
                case 0 :
                    ans = ans+z1;
                    break;
                case 1 :
                    ans = ans-z1;
                    break;
                case 2 :
                    ans = ans*z1;
                    break;
                case 3 :
                    ans = ans/z1;
                    break;
                default:
                    break;
            }
        }
        if(lvl==4) {
            int x = r.nextInt(10);
            int y = r.nextInt(10);
            int z = r.nextInt(10);
            int z1 = r.nextInt(10);
            int z2 = r.nextInt(10);
            int index1 = r.nextInt(4);
            int index2 = r.nextInt(4);
            int index3 = r.nextInt(4);
            int index4 = r.nextInt(4);
            tv.setText(String.valueOf(x) + operator[index1] + String.valueOf(y) + operator[index2] + String.valueOf(z) + operator[index3] + String.valueOf(z1) + operator[index4] + String.valueOf(z2));
            switch (index1) {
                case 0:
                    ans = x + y;
                    break;
                case 1:
                    ans = x - y;
                    break;
                case 2:
                    ans = x * y;
                    break;
                case 3:
                    ans = x / y;
                    break;
                default:
                    break;
            }
            switch (index2) {
                case 0:
                    ans = ans + z;
                    break;
                case 1:
                    ans = ans - z;
                    break;
                case 2:
                    ans = ans * z;
                    break;
                case 3:
                    ans = ans / z;
                    break;
                default:
                    break;
            }
            switch (index3) {
                case 0:
                    ans = ans + z1;
                    break;
                case 1:
                    ans = ans - z1;
                    break;
                case 2:
                    ans = ans * z1;
                    break;
                case 3:
                    ans = ans / z1;
                    break;
                default:
                    break;
            }
            switch (index4) {
                case 0:
                    ans = ans + z2;
                    break;
                case 1:
                    ans = ans - z2;
                    break;
                case 2:
                    ans = ans * z2;
                    break;
                case 3:
                    ans = ans / z2;
                    break;
                default:
                    break;
            }
        }
        return String.valueOf(ans);
    }
}
