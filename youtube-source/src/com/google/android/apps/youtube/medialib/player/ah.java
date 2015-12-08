// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.os.Handler;
import android.os.Message;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            af

class ah
    implements android.os.Handler.Callback
{

    final af b;

    private ah(af af1)
    {
        b = af1;
        super();
    }

    ah(af af1, byte byte0)
    {
        this(af1);
    }

    protected boolean a()
    {
        return true;
    }

    public boolean handleMessage(Message message)
    {
        boolean flag;
        if (a() == af.b(b))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Handler handler;
            for (Iterator iterator = af.a(b).iterator(); iterator.hasNext(); handler.sendMessage(Message.obtain(handler, message.what, message.arg1, message.arg2, message.obj)))
            {
                handler = (Handler)iterator.next();
            }

        }
        return true;
    }
}
