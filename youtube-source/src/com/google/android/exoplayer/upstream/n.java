// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer.e.a;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer.upstream:
//            o, Loader, m

final class n extends Handler
    implements Runnable
{

    final Loader a;
    private final o b;
    private volatile Thread c;

    public n(Loader loader, o o1)
    {
        a = loader;
        super();
        b = o1;
    }

    public final void a()
    {
        b.g();
        if (c != null)
        {
            c.interrupt();
        }
    }

    public final void handleMessage(Message message)
    {
        com.google.android.exoplayer.upstream.Loader.a(a, false);
        com.google.android.exoplayer.upstream.Loader.a(a, null);
        if (b.h())
        {
            com.google.android.exoplayer.upstream.Loader.a(a).f();
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            com.google.android.exoplayer.upstream.Loader.a(a).e();
            return;

        case 1: // '\001'
            com.google.android.exoplayer.upstream.Loader.a(a).a((IOException)message.obj);
            break;
        }
    }

    public final void run()
    {
        try
        {
            c = Thread.currentThread();
            if (!b.h())
            {
                b.i();
            }
            sendEmptyMessage(0);
            return;
        }
        catch (IOException ioexception)
        {
            obtainMessage(1, ioexception).sendToTarget();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            com.google.android.exoplayer.e.a.b(b.h());
            sendEmptyMessage(0);
            return;
        }
        catch (Exception exception)
        {
            Log.e("LoadTask", "Unexpected error loading stream", exception);
            obtainMessage(1, new Loader.UnexpectedLoaderException(exception)).sendToTarget();
            return;
        }
    }
}
