// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.apps.ytremote.backend.logic.b;
import com.google.android.apps.ytremote.logic.e;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.PairingCode;
import com.google.android.apps.ytremote.model.ScreenId;

// Referenced classes of package com.google.android.apps.ytremote.b:
//            h, d

final class g extends Handler
{

    private final b a;

    private g(Looper looper, b b1)
    {
        super(looper);
        a = b1;
    }

    g(Looper looper, b b1, byte byte0)
    {
        this(looper, b1);
    }

    private void a(h h1)
    {
        h h2 = h1.a();
        if (h2 == h.a)
        {
            a(h1.c, ((CloudScreen) (null)));
            return;
        } else
        {
            sendMessageDelayed(Message.obtain(this, 1, h2), h2.b());
            return;
        }
    }

    private static void a(e e1, CloudScreen cloudscreen)
    {
        if (cloudscreen == null)
        {
            e1.a(3);
            return;
        } else
        {
            e1.a(cloudscreen);
            return;
        }
    }

    public final void a(PairingCode pairingcode, e e1)
    {
        a(h.a(pairingcode, e1));
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        message = (h)message.obj;
        Object obj = ((h) (message)).b;
        e e1 = ((h) (message)).c;
        obj = (CloudScreen)a.a(obj);
        boolean flag;
        if (obj != null)
        {
            Log.i(com.google.android.apps.ytremote.b.d.b(), (new StringBuilder("Found screen with id: ")).append(((CloudScreen) (obj)).getScreenId().toString()).toString());
            a(e1, ((CloudScreen) (obj)));
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            a(message);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
