package test3.q19;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {
    static ConcurrentHashMap<String, Object> chm =
            new ConcurrentHashMap<String, Object>();
    public static void main(String[] args) {
        chm.put("a", "aaa");
        chm.put("b", "bbb");
        chm.put("c", "ccc");
        new Thread(){
            public void run(){
                Iterator<Entry<String, Object>> it =
                        Cache.chm.entrySet().iterator();
                while(it.hasNext()){
                    Entry<String, Object> en = it.next();
                    if(en.getKey().equals("a") || en.getKey().equals("b")){
                        it.remove();
                    }
                }
            }
        }.start();
        new Thread(){
            public void run(){
                Iterator<Entry<String, Object>> it =
                        Cache.chm.entrySet().iterator();
                while(it.hasNext()){
                    Entry<String, Object> en = it.next();
                    System.out.print(en.getKey()+", ");
                }
            }
        }.start();
    }
}

/*
    Which of the following are possible outputs when the above program is run?
        Select 1 option:
        A. It may print any combination of the keys.
        B. It may print any combination except: c,
       !C. It may print any combination except: a, or b, or a, b, or b, a
        D. It may print any combination except: b, c,
        E. It may print any combination except: a, b,
*/
