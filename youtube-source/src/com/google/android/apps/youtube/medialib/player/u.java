// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.player;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.google.android.apps.youtube.medialib.player:
//            p, n

final class u extends HandlerThread
    implements android.os.Handler.Callback
{

    private Handler a;
    private p b;

    public u(p p1)
    {
        super("YouTubePlayer.MediaPlayerThread");
        b = p1;
    }

    public final void a()
    {
        a.sendEmptyMessage(2);
    }

    public final void a(int i)
    {
        a.sendMessage(Message.obtain(a, 4, i, 0));
    }

    public final void a(n n1, Uri uri)
    {
        a.sendMessage(Message.obtain(a, 1, ((Object) (new Object[] {
            n1, uri
        }))));
    }

    public final void b()
    {
        a.sendEmptyMessage(3);
    }

    public final void c()
    {
        a.sendEmptyMessage(5);
    }

    public final void d()
    {
        this;
        JVM INSTR monitorenter ;
        a.removeMessages(1);
        if (b != null)
        {
            p.a(b);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean handleMessage(Message message)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        int i = message.what;
        i;
        JVM INSTR tableswitch 1 6: default 48
    //                   1 52
    //                   2 84
    //                   3 96
    //                   4 108
    //                   5 124
    //                   6 136;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        message = ((Message) ((Object[])message.obj));
        p.a(b, (n)message[0], (Uri)message[1]);
        flag = true;
        continue; /* Loop/switch isn't completed */
_L3:
        p.b(b);
        flag = true;
        continue; /* Loop/switch isn't completed */
_L4:
        p.c(b);
        flag = true;
        continue; /* Loop/switch isn't completed */
_L5:
        p.a(b, message.arg1);
        flag = true;
        continue; /* Loop/switch isn't completed */
_L6:
        p.a(b);
        flag = true;
        continue; /* Loop/switch isn't completed */
_L7:
        p.a(b);
        getLooper().quit();
        a.removeCallbacksAndMessages(null);
        b = null;
        flag = true;
        if (true) goto _L1; else goto _L8
_L8:
        message;
        throw message;
    }

    public final boolean quit()
    {
        if (getLooper() != null)
        {
            a.sendEmptyMessage(6);
            return true;
        } else
        {
            return false;
        }
    }

    public final void start()
    {
        super.start();
        a = new Handler(getLooper(), this);
    }
}
