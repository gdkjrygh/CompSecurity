// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            VideoPreviewActivity, VideoView, in

class ao0 extends Thread
{

    private long a;
    final VideoPreviewActivity b;
    private Object c;

    ao0(VideoPreviewActivity videopreviewactivity)
    {
        b = videopreviewactivity;
        super();
        a = -1L;
        c = new Object();
    }

    public void a(long l)
    {
        synchronized (c)
        {
            a = l;
            c.notifyAll();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void run()
    {
        long l = -1L;
_L2:
        long l1;
        synchronized (c)
        {
            if (a == l)
            {
                c.wait();
            }
            l1 = a;
        }
        l = l1;
        if (VideoPreviewActivity.a(b).isPlaying())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = b.a(1000L * l1);
        l = l1;
        if (obj != null)
        {
            try
            {
                b.runOnUiThread(new in(this, ((android.graphics.Bitmap) (obj))));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                try
                {
                    throw obj;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return;
                }
            }
            l = l1;
        }
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
