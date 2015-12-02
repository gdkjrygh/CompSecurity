// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            ov, aoz, a_q, a39

final class ak0 extends Handler
{

    final aoz a;

    private ak0(aoz aoz1, Looper looper)
    {
        a = aoz1;
        super(looper);
    }

    ak0(aoz aoz1, Looper looper, a39 a39)
    {
        this(aoz1, looper);
    }

    public void handleMessage(Message message)
    {
        boolean flag = ov.e;
        message.what;
        JVM INSTR tableswitch 1 12: default 72
    //                   1 78
    //                   2 120
    //                   3 101
    //                   4 72
    //                   5 227
    //                   6 281
    //                   7 335
    //                   8 362
    //                   9 72
    //                   10 389
    //                   11 171
    //                   12 421;
           goto _L1 _L2 _L3 _L4 _L1 _L5 _L6 _L7 _L8 _L1 _L9 _L10 _L11
_L1:
        super.handleMessage(message);
_L12:
        return;
_L2:
        aoz.a(a, message.arg1, (c4)message.obj);
        if (!flag) goto _L12; else goto _L4
_L4:
        a.i((c4)message.obj);
        if (!flag) goto _L12; else goto _L3
_L3:
        c4 c4_1 = (c4)message.obj;
        if (!aoz.a(a, c4_1, message.arg1)) goto _L12; else goto _L13
_L13:
        Message.obtain(aoz.h(a), 2, message.arg1, message.arg2, c4_1).sendToTarget();
        if (!flag) goto _L12; else goto _L10
_L10:
        Object obj = (c4)message.obj;
        c4 c4_2 = aoz.a(a, ((c4) (obj)));
        Handler handler = aoz.h(a);
        int i;
        if (c4_2 == null)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        if (c4_2 != null)
        {
            obj = c4_2;
        }
        Message.obtain(handler, 10, i, 0, obj).sendToTarget();
        if (!flag) goto _L12; else goto _L5
_L5:
        obj = (String)message.obj;
        Message.obtain(aoz.a(a), 1, obj).sendToTarget();
        if (!aoz.b(a, ((String) (obj)))) goto _L12; else goto _L14
_L14:
        Message.obtain(aoz.a(a), 2, obj).sendToTarget();
        if (!flag) goto _L12; else goto _L6
_L6:
        obj = (String)message.obj;
        Message.obtain(aoz.a(a), 1, obj).sendToTarget();
        if (!aoz.a(a, ((String) (obj)))) goto _L12; else goto _L15
_L15:
        Message.obtain(aoz.a(a), 2, obj).sendToTarget();
        if (!flag) goto _L12; else goto _L7
_L7:
        aoz.e(a);
        Message.obtain(aoz.a(a), 8).sendToTarget();
        if (!flag) goto _L12; else goto _L8
_L8:
        aoz.g(a);
        Message.obtain(aoz.a(a), 9).sendToTarget();
        if (!flag) goto _L12; else goto _L9
_L9:
        obj = (a_q)message.obj;
        aoz.a(a, ((a_q) (obj)).c, ((a_q) (obj)).a, ((a_q) (obj)).b);
        if (!flag) goto _L12; else goto _L11
_L11:
        Message.obtain(aoz.d(a), 7).sendToTarget();
        if (!flag) goto _L12; else goto _L1
    }
}
