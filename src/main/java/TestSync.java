import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by longjinwen on 15/05/2017.
 */
public class TestSync {
    @Test
    public  void test(){
        List<String> list = new ArrayList<String>();
        System.out.println(ShareData.COUNT);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=0;i<5;i++){
            executorService.execute(new Sync1());
        }
        executorService.shutdown();
    }
    public static synchronized String ListToString(List<String> list){
        if(list == null || list.size() == 0){
            return "";
        }
        String result = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<list.size();i++){
            sb.append(list.get(i))
                    .append(",");
        }
        result = sb.toString();
        result = result.substring(0,result.length()-1);
        return result;
    }
}
class  Sync1 implements Runnable{
    public void run() {
       //TestSync.ListToString();
        System.out.println(ShareData.COUNT);
    }
}
