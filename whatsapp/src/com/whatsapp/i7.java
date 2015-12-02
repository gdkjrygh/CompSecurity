// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.widget.ImageView;
import java.util.Stack;

// Referenced classes of package com.whatsapp:
//            ao9, b8, ada, og, 
//            kd

final class i7 extends Thread
{

    private static final String z;
    final ao9 a;

    i7(ao9 ao9_1)
    {
        a = ao9_1;
        super(z);
    }

    public void run()
    {
_L2:
        if (b8.a(ao9.a(a)).size() == 0)
        {
            synchronized (b8.a(ao9.a(a)))
            {
                b8.a(ao9.a(a)).wait();
            }
        }
        if (b8.a(ao9.a(a)).size() == 0)
        {
            break MISSING_BLOCK_LABEL_184;
        }
        synchronized (b8.a(ao9.a(a)))
        {
            obj = (ada)b8.a(ao9.a(a)).pop();
        }
        obj1 = ((ada) (obj)).b.a(ao9.c(a), ao9.b(a), true);
        if (((ada) (obj)).a.getTag().equals(((ada) (obj)).b.b(ao9.c(a), ao9.b(a))))
        {
            obj1 = new kd(a, ((android.graphics.Bitmap) (obj1)), ((ada) (obj)).a, ((ada) (obj)).b);
            ((Activity)((ada) (obj)).a.getContext()).runOnUiThread(((Runnable) (obj1)));
        }
        boolean flag = Thread.interrupted();
        if (!flag) goto _L2; else goto _L1
_L1:
        return;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        catch (InterruptedException interruptedexception)
        {
            return;
        }
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\036\022*\037=>\t\024\0033)\0227?4/\030%\017".toCharArray();
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
        byte byte0 = 92;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 93;
          goto _L8
_L3:
        byte0 = 125;
          goto _L8
_L4:
        byte0 = 68;
          goto _L8
        byte0 = 107;
          goto _L8
    }
}
