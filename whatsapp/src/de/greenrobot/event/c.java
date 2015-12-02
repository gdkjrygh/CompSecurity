// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.event;

import java.util.concurrent.ExecutorService;

// Referenced classes of package de.greenrobot.event:
//            f, b, g, e

class c
    implements Runnable
{

    private static final String z;
    private final f a = new f();
    private final g b;

    c(g g1)
    {
        b = g1;
    }

    public void a(e e, Object obj)
    {
        e = de.greenrobot.event.b.a(e, obj);
        a.a(e);
        b.b().execute(this);
    }

    public void run()
    {
        Object obj = a.a();
        if (obj == null)
        {
            try
            {
                throw new IllegalStateException(z);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            b.a(((b) (obj)));
            return;
        }
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "x>k@$X5\"^&\026!$C5\0260=Q(Z0)\\$".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c1 = ac[i];
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
        byte byte0 = 65;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 54;
          goto _L8
_L3:
        byte0 = 81;
          goto _L8
_L4:
        byte0 = 75;
          goto _L8
        byte0 = 48;
          goto _L8
    }
}
