// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.whatsapp:
//            ov, aoz, t0, q7, 
//            hu

class _6 extends Handler
{

    final aoz a;

    _6(aoz aoz1)
    {
        a = aoz1;
        super();
    }

    public void handleMessage(Message message)
    {
        boolean flag = ov.e;
        message.what;
        JVM INSTR tableswitch 1 9: default 60
    //                   1 61
    //                   2 84
    //                   3 60
    //                   4 60
    //                   5 60
    //                   6 60
    //                   7 60
    //                   8 118
    //                   9 182;
           goto _L1 _L2 _L3 _L1 _L1 _L1 _L1 _L1 _L4 _L5
_L1:
        return;
_L2:
        String s = (String)message.obj;
        aoz.b(a).d(s);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        message = (String)message.obj;
        aoz.c(a).a(message);
        aoz.b(a).d(message);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        message = aoz.j(a).keys();
        do
        {
            if (!message.hasMoreElements())
            {
                continue; /* Loop/switch isn't completed */
            }
            String s1 = (String)message.nextElement();
            aoz.j(a).put(s1, new hu());
            aoz.b(a).d(s1);
        } while (!flag);
_L5:
        message = (new HashSet(aoz.j(a).keySet())).iterator();
        do
        {
            if (!message.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            String s2 = (String)message.next();
            if (!s2.contains("-"))
            {
                aoz.j(a).remove(s2);
                aoz.b(a).a(s2);
                if (!flag)
                {
                    continue;
                }
            }
            aoz.j(a).put(s2, new hu());
            aoz.b(a).d(s2);
        } while (!flag);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L6
_L6:
    }
}
