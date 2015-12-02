// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.whatsapp:
//            App, k, og, mk

final class t1 extends Handler
{

    t1()
    {
    }

    private void a(String s)
    {
        og og1 = App.az.e(s);
        if (og1 != null)
        {
            og1.t();
        }
        App.b(s);
    }

    public void handleMessage(Message message)
    {
        int j = App.am;
        message.what;
        JVM INSTR tableswitch 1 3: default 36
    //                   1 37
    //                   2 125
    //                   3 186;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        String s;
        s = (String)message.obj;
        a(s);
        if (!mk.h(s))
        {
            break; /* Loop/switch isn't completed */
        }
        App.b(App.au.getApplicationContext(), App.au.getString(0x7f0e01db), 0);
        if (j == 0) goto _L1; else goto _L5
_L5:
        oh oh = App.az.f();
        if (oh != null && s.equals(((og) (oh)).a))
        {
            App.b(App.au.getApplicationContext(), App.au.getString(0x7f0e02fb), 0);
        }
        if (j == 0) goto _L1; else goto _L3
_L3:
        String s1 = (String)message.obj;
        a(s1);
        App.b(s1, message.arg1);
        android.content.Context context = App.au.getApplicationContext();
        App app = App.au;
        int i;
        if (mk.h(s1))
        {
            i = 0x7f0e0188;
        } else
        {
            i = 0x7f0e018b;
        }
        App.b(context, app.getString(i), 0);
        if (j == 0) goto _L1; else goto _L4
_L4:
        s1 = (String)message.obj;
        a(s1);
        App.b(s1, message.arg1);
        App.b(App.au.getApplicationContext(), App.au.getString(0x7f0e018a), 0);
        return;
    }
}
