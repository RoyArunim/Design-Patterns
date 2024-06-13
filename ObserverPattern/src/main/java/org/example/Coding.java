package org.example;

import java.util.ArrayList;
import java.util.List;

public class Coding {

    public void f(List<String> ans,String str,  int open, int close, int n){
        if(str.length()==2*n){
            ans.add(str);
            return;
        }

        if(open<n){
            f(ans, str+"(",open+1, close, n);
        }
        if(open>close){
            f(ans, str+")",open, close+1, n);
        }
    }

    public List<String> generateParenthesis(int n){
        List<String> ans=new ArrayList<>();
        f(ans,"", 0,0,n);
        return ans;

    }



}
