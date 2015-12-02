// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import android.util.Log;
import java.util.concurrent.ExecutorService;

// Referenced classes of package de.greenrobot.event:
//            f, b, g, e

final class a
    implements Runnable
{

    private static final String z[];
    private volatile boolean a;
    private final g b;
    private final f c = new f();

    a(g g1)
    {
        b = g1;
    }

    public void a(e e, Object obj)
    {
        e = de.greenrobot.event.b.a(e, obj);
        this;
        JVM INSTR monitorenter ;
        c.a(e);
        if (!a)
        {
            a = true;
            b.b().execute(this);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        e;
        this;
        JVM INSTR monitorexit ;
        throw e;
    }

    public void run()
    {
_L4:
        b b2 = c.a(1000);
        b b1 = b2;
        if (b2 != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        b1 = c.a();
        if (b1 != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        a = false;
        this;
        JVM INSTR monitorexit ;
        a = false;
        return;
        this;
        JVM INSTR monitorexit ;
_L2:
        b.a(b1);
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        Log.w(z[0], (new StringBuilder()).append(Thread.currentThread().getName()).append(z[1]).toString(), ((Throwable) (obj)));
        a = false;
        return;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        a = false;
        throw obj;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "u,cr\031";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "\020-goMY4ry\037B/vl\031U>";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 109;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 48;
          goto _L9
_L5:
        byte0 = 90;
          goto _L9
_L6:
        byte0 = 6;
          goto _L9
        byte0 = 28;
          goto _L9
    }
}
