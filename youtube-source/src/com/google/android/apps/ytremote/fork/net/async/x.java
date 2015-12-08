// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.fork.net.async;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.ytremote.fork.net.async:
//            ac, y, z, ab, 
//            p

public final class x
{

    private static final Logger a = Logger.getLogger(com/google/android/apps/ytremote/fork/net/async/x.getName());
    private static Long b = Long.valueOf(30000L);
    private static final ab c = new ac((byte)0);
    private static final ab d = new y();
    private static final Collection e = Collections.synchronizedCollection(new ArrayList());

    private x()
    {
    }

    public static p a()
    {
        ab ab = c;
        if (ab == null)
        {
            throw new NullPointerException("LoopRunner cannot be null");
        }
        String s = "EventDispatcher";
        StackTraceElement astacktraceelement[] = (new Throwable()).getStackTrace();
        int j = astacktraceelement.length;
        int i = 0;
        do
        {
label0:
            {
                Object obj = s;
                if (i < j)
                {
                    obj = astacktraceelement[i];
                    if (com/google/android/apps/ytremote/fork/net/async/x.getName().equals(((StackTraceElement) (obj)).getClassName()))
                    {
                        break label0;
                    }
                    String s1 = ((StackTraceElement) (obj)).getClassName();
                    i = s1.lastIndexOf(".");
                    obj = s1;
                    if (i > 0)
                    {
                        obj = s1.substring(i + 1);
                    }
                    obj = (new StringBuilder("EventDispatcher created by ")).append(((String) (obj))).toString();
                }
                obj = new z(true, ab, ((String) (obj)));
                ((z) (obj)).start();
                return ((z) (obj)).a();
            }
            i++;
        } while (true);
    }

    static Logger b()
    {
        return a;
    }

    static Long c()
    {
        return b;
    }

    static Collection d()
    {
        return e;
    }

}
