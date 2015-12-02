// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.whatsapp:
//            App, a1e, aun

class p6
    implements Runnable
{

    final a1e a;

    p6(a1e a1e1)
    {
        a = a1e1;
        super();
    }

    public void run()
    {
        ArrayList arraylist;
        int i;
        i = App.am;
        arraylist = new ArrayList();
        Object obj = a1e.c(a);
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = a1e.b(a).entrySet().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        Long long1 = (Long)entry.getValue();
        if (long1.longValue() != 0L && long1.longValue() < System.currentTimeMillis())
        {
            arraylist.add(entry);
        }
          goto _L3
_L2:
        obj;
        JVM INSTR monitorexit ;
        obj = arraylist.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            String s = (String)((java.util.Map.Entry)((Iterator) (obj)).next()).getKey();
            a.c(s);
            Iterator iterator1 = a1e.a(a).iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                ((aun)iterator1.next()).a(s);
                App.B(s);
            } while (i == 0);
        } while (i == 0);
        a1e.d(a);
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L3:
        if (i == 0) goto _L4; else goto _L2
    }
}
