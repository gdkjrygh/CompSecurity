// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event.util;

import android.util.Log;
import de.greenrobot.event.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package de.greenrobot.event.util:
//            a

public class m
{

    private static final String z;
    public final Map a = new HashMap();

    public m()
    {
    }

    public m a(Class class1, int i)
    {
        a.put(class1, Integer.valueOf(i));
        return this;
    }

    protected Integer a(Throwable throwable)
    {
        int i = a.b;
        Class class3 = throwable.getClass();
        throwable = (Integer)a.get(class3);
        if (throwable == null)
        {
            Iterator iterator = a.entrySet().iterator();
            Class class1 = null;
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Class class2 = (Class)entry.getKey();
                if (class2.isAssignableFrom(class3) && (class1 == null || class1.isAssignableFrom(class2)))
                {
                    throwable = (Integer)entry.getValue();
                    class1 = class2;
                }
                if (i != 0)
                {
                    return throwable;
                }
            }
            return throwable;
        } else
        {
            return throwable;
        }
    }

    public Integer b(Throwable throwable)
    {
        int i = 20;
        Throwable throwable1 = throwable;
        Object obj;
        do
        {
            obj = a(throwable1);
            if (obj != null)
            {
                return ((Integer) (obj));
            }
            obj = throwable1.getCause();
            i--;
            if (i <= 0 || obj == throwable)
            {
                break;
            }
            throwable1 = ((Throwable) (obj));
        } while (obj != null);
        Log.d(g.m, (new StringBuilder()).append(z).append(throwable).toString());
        return null;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "aF:\n+JJs\0372L\tw\034(\\H}\034{]Li\n4Z[y\034{fm:\0374ZG~Y=@[:".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 91;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 47;
          goto _L8
_L3:
        byte0 = 41;
          goto _L8
_L4:
        byte0 = 26;
          goto _L8
        byte0 = 121;
          goto _L8
    }
}
