import com.kahandu.machine.Machine;
import com.kahandu.cache.proxy.CacheHandler;
import com.kahandu.cache.store.CacheStore;
import com.kahandu.machine.AnswerMachine;
import com.kahandu.response.ResponsesInterface;

import java.lang.reflect.Proxy;

public class Main {


    public static void main(String[] args) {

        CacheStore cacheStore = new CacheStore();

        AnswerMachine answerMachine = new AnswerMachine();

        ClassLoader arnoldClassLoader = answerMachine.getClass().getClassLoader();

        // Get all the interfaces that the original object implements
        Class[] interfaces = answerMachine.getClass().getInterfaces();

        // Create a proxy for our arnold object
        Machine proxyMachine = (Machine) Proxy.newProxyInstance(arnoldClassLoader, interfaces, new CacheHandler(cacheStore,answerMachine));

        proxyMachine.answer(ResponsesInterface.text1);
        proxyMachine.answer(ResponsesInterface.text2);
        proxyMachine.answer(ResponsesInterface.text3);
        proxyMachine.answer(ResponsesInterface.text4);
        proxyMachine.answer(ResponsesInterface.text5);
        proxyMachine.answer(ResponsesInterface.text6);

        System.out.println("Now expecting from cache");

        proxyMachine.answer(ResponsesInterface.text1);
        proxyMachine.answer(ResponsesInterface.text2);
        proxyMachine.answer(ResponsesInterface.text3);
        proxyMachine.answer(ResponsesInterface.text4);
        proxyMachine.answer(ResponsesInterface.text5);
        proxyMachine.answer(ResponsesInterface.text6);

    }
}