// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.anrwatchdog;

import android.os.Looper;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

// Referenced classes of package com.github.anrwatchdog:
//            ANRError$$

public class ANRError extends Error
{
    private static class ANRError$$
    {

        private final String _name;
        private final StackTraceElement _stackTrace[];



        private ANRError$$(String s, StackTraceElement astacktraceelement[])
        {
            _name = s;
            _stackTrace = astacktraceelement;
        }

    }

    private class .._Thread extends Throwable
    {

        final ANRError$$ this$0;

        public Throwable fillInStackTrace()
        {
            setStackTrace(_stackTrace);
            return this;
        }

        private .._Thread(.._Thread _pthread)
        {
            this$0 = ANRError$$.this;
            super(_name, _pthread);
        }

    }


    private static final long serialVersionUID = 1L;
    private final Map _stackTraces;

    private ANRError(.._Thread _pthread, Map map)
    {
        super("Application Not Responding", _pthread);
        _stackTraces = map;
    }

    static ANRError New(String s, boolean flag)
    {
        Thread thread = Looper.getMainLooper().getThread();
        TreeMap treemap = new TreeMap(new Comparator(thread) {

            final Thread val$mainThread;

            public volatile int compare(Object obj1, Object obj2)
            {
                return compare((Thread)obj1, (Thread)obj2);
            }

            public int compare(Thread thread1, Thread thread2)
            {
                if (thread1 == thread2)
                {
                    return 0;
                }
                if (thread1 == mainThread)
                {
                    return 1;
                }
                if (thread2 == mainThread)
                {
                    return -1;
                } else
                {
                    return thread2.getName().compareTo(thread1.getName());
                }
            }

            
            {
                mainThread = thread;
                super();
            }
        });
        Iterator iterator1 = Thread.getAllStackTraces().entrySet().iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
            if (entry.getKey() == thread || ((Thread)entry.getKey()).getName().startsWith(s) && (flag || ((StackTraceElement[])entry.getValue()).length > 0))
            {
                treemap.put(entry.getKey(), entry.getValue());
            }
        } while (true);
        s = null;
        for (Iterator iterator = treemap.entrySet().iterator(); iterator.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iterator.next();
            obj = new ANRError$$(((Thread)((java.util.Map.Entry) (obj)).getKey()).getName(), (StackTraceElement[])((java.util.Map.Entry) (obj)).getValue());
            obj.getClass();
            s = ((.._Thread) (obj)). new .._Thread(s);
        }

        return new ANRError(s, treemap);
    }

    static ANRError NewMainOnly()
    {
        Object obj = Looper.getMainLooper().getThread();
        StackTraceElement astacktraceelement[] = ((Thread) (obj)).getStackTrace();
        HashMap hashmap = new HashMap(1);
        hashmap.put(obj, astacktraceelement);
        obj = new ANRError$$(((Thread) (obj)).getName(), astacktraceelement);
        obj.getClass();
        return new ANRError(((.._Thread) (obj)). new .._Thread(null), hashmap);
    }

    public Throwable fillInStackTrace()
    {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public Map getStackTraces()
    {
        return _stackTraces;
    }
}
