package com.kahandu.machine;

import com.kahandu.response.ResponsesInterface;

public class AnswerMachine implements Machine {
   // CacheStore cacheStore = new CacheStore();
    public String answer(String request){

     if(request.equals(ResponsesInterface.text1)){
         //cacheStore.add(request,com.kahandu.response.ResponsesInterface.text1Reply);
         return ResponsesInterface.text1Reply;
     }
        if(request.equals(ResponsesInterface.text2)){
           // cacheStore.add(request,com.kahandu.response.ResponsesInterface.text2Reply);
            return ResponsesInterface.text2Reply;
        }
        if(request.equals(ResponsesInterface.text3)){
            //cacheStore.add(request,com.kahandu.response.ResponsesInterface.text3Reply);
            return ResponsesInterface.text3Reply;
        }
        if(request.equals(ResponsesInterface.text4)){
            //cacheStore.add(request,com.kahandu.response.ResponsesInterface.text4Reply);
            return ResponsesInterface.text4Reply;
        }
        if(request.equals(ResponsesInterface.text5)){
            //cacheStore.add(request,com.kahandu.response.ResponsesInterface.text5Reply);
            return ResponsesInterface.text5Reply;
        }
        if(request.equals(ResponsesInterface.text6)){
            //cacheStore.add(request,com.kahandu.response.ResponsesInterface.text6Reply);
            return ResponsesInterface.text6Reply;
        }
        return "";
    }

}
