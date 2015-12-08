// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            cl, au, ci, cm, 
//            bg, bf, cb, cd

public class ch extends Thread
{

    private static final String a = com/paypal/android/sdk/onetouch/core/ch.getSimpleName();
    private cm b;
    private String c;
    private List d;
    private cb e;
    private cd f;

    public ch(String s, cm cm1, cb cb, cd cd)
    {
        d = Collections.synchronizedList(new LinkedList());
        c = s;
        b = cm1;
        e = cb;
        f = cd;
        start();
    }

    public final void a(cl cl1)
    {
        synchronized (d)
        {
            d.add(cl1);
            (new StringBuilder("Queued ")).append(cl1.n());
            d.notifyAll();
        }
        return;
        cl1;
        list;
        JVM INSTR monitorexit ;
        throw cl1;
    }

    public void run()
    {
        (new StringBuilder("Starting ")).append(getClass().getSimpleName());
_L3:
        Object obj1 = d;
        obj1;
        JVM INSTR monitorenter ;
        boolean flag = d.isEmpty();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        d.wait();
        Object obj = null;
_L1:
        obj1;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
            try
            {
                ((cl) (obj)).a(((cl) (obj)).b());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.e("paypal.sdk", "Exception computing request", ((Throwable) (obj1)));
                ((cl) (obj)).a(new bg(bf.c.toString(), "JSON Exception in computeRequest", ((JSONException) (obj1)).getMessage()));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Log.e("paypal.sdk", "Exception computing request", ((Throwable) (obj1)));
                ((cl) (obj)).a(new bg(bf.c.toString(), "Unsupported encoding", ((UnsupportedEncodingException) (obj1)).getMessage()));
            }
            if (au.a(c))
            {
                obj1 = e;
            } else
            {
                obj1 = f;
            }
            if (!((ci) (obj1)).b(((cl) (obj))))
            {
                b.a(((cl) (obj)));
            }
        }
        continue; /* Loop/switch isn't completed */
        obj;
        obj = null;
          goto _L1
        obj = (cl)d.remove(0);
          goto _L1
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        if (true) goto _L3; else goto _L2
_L2:
    }

}
