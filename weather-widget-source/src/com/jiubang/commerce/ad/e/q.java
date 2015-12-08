// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import android.util.SparseArray;
import com.jiubang.commerce.database.b.a;
import com.jiubang.commerce.utils.AdTimer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            r, s

public class q
{

    private static q a;
    private SparseArray b;
    private byte c[];
    private Context d;
    private ExecutorService e;

    private q(Context context)
    {
        c = new byte[0];
        e = Executors.newSingleThreadExecutor();
        d = context.getApplicationContext();
        a();
    }

    static Context a(q q1)
    {
        return q1.d;
    }

    public static q a(Context context)
    {
        com/jiubang/commerce/ad/e/q;
        JVM INSTR monitorenter ;
        if (a != null || context == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        a = new q(context);
        context = a;
        com/jiubang/commerce/ad/e/q;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private void a()
    {
        b = new SparseArray();
    }

    private void a(int i, String s1)
    {
        e.execute(new r(this, i, s1));
    }

    private int d(int i)
    {
        com.jiubang.commerce.database.b.a.a(d).a();
        Iterator iterator = com.jiubang.commerce.database.b.a.a(d).a(i).iterator();
        i = 0;
        do
        {
            String s1;
label0:
            {
                if (iterator.hasNext())
                {
                    s1 = ((com.jiubang.commerce.database.a.a)iterator.next()).b();
                    if (!"click".equals(s1))
                    {
                        break label0;
                    }
                }
                return i;
            }
            if ("show".equals(s1))
            {
                i++;
            }
        } while (true);
    }

    public int a(int i)
    {
        byte abyte0[] = c;
        abyte0;
        JVM INSTR monitorenter ;
        s s1 = (s)b.get(i);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (Math.abs(System.currentTimeMillis() - s1.b) < 0x5265c00L) goto _L3; else goto _L2
_L2:
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        s1 = new s(null);
        int j;
        j = d(i);
        s1.a = j;
        s1.b = AdTimer.b();
        b.put(i, s1);
        i = j;
_L5:
        abyte0;
        JVM INSTR monitorexit ;
        return i;
_L3:
        i = s1.a;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(int i)
    {
        a(i, "show");
    }

    public void c(int i)
    {
        a(i, "click");
    }
}
