// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.Messenger;
import com.whatsapp.protocol.cu;
import com.whatsapp.util.bs;
import com.whatsapp.util.w;

// Referenced classes of package com.whatsapp.messaging:
//            d, h, bl, av, 
//            a4, bq

final class f extends HandlerThread
{

    private static final String z;
    private final bq a = new d(this);
    private final bs b = new bs();
    private Handler c;
    private final Messenger d;
    private cu e;
    private Handler f;
    private final w g = new w();

    public f(Messenger messenger)
    {
        super(z);
        d = messenger;
    }

    static Handler a(f f1)
    {
        return f1.c;
    }

    private void a()
    {
        g.a();
        b.b();
    }

    private void a(Message message)
    {
        h.a(a, message);
    }

    static void a(f f1, Message message)
    {
        f1.a(message);
    }

    static void a(f f1, cu cu)
    {
        f1.a(cu);
    }

    private void a(cu cu)
    {
        e = cu;
        g.b();
        b.a();
    }

    static Messenger b(f f1)
    {
        return f1.d;
    }

    private void b(Message message)
    {
        a();
        message.getTarget().sendMessageAtFrontOfQueue(Message.obtain(message));
        bl.a(d, e);
    }

    static void b(f f1, Message message)
    {
        f1.b(message);
    }

    static void c(f f1)
    {
        f1.a();
    }

    static Handler d(f f1)
    {
        return f1.f;
    }

    static cu e(f f1)
    {
        return f1.e;
    }

    protected void onLooperPrepared()
    {
        c = new av(this, g);
        f = new av(this, b);
        Messenger messenger = new Messenger(new a4(this));
        bl.a(d, messenger);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "wL\026.KRj\027(KAZ".toCharArray();
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
        byte byte0 = 46;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 32;
          goto _L8
_L3:
        byte0 = 62;
          goto _L8
_L4:
        byte0 = 127;
          goto _L8
        byte0 = 90;
          goto _L8
    }
}
