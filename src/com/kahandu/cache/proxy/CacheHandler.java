package com.kahandu.cache.proxy;

import com.kahandu.cache.store.CacheStore;
import com.kahandu.machine.AnswerMachine;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CacheHandler implements InvocationHandler {

    public CacheHandler(CacheStore cacheStore, AnswerMachine answerMachine) {
        this.cacheStore = cacheStore;
        this.answerMachine=answerMachine;
    }

    private CacheStore cacheStore;

    private AnswerMachine answerMachine;



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String returnValue=null;
        if(method.getName().contains("answer")){
            String argument= (String) args[0];
            if(cacheStore.retrieve(argument)!=null){
                System.out.println("Retrieving from Cache");
                return cacheStore.retrieve(argument);
            }
            returnValue= (String) method.invoke(answerMachine,args);
            cacheStore.add(argument, returnValue);
        }
        return returnValue;
    }


}
