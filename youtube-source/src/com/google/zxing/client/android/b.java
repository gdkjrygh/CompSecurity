// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.os.Handler;
import android.os.Looper;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.h;
import java.util.Hashtable;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.google.zxing.client.android:
//            a, CaptureActivity

final class b extends Thread
{

    private final CaptureActivity a;
    private final Hashtable b = new Hashtable();
    private Handler c;
    private final CountDownLatch d = new CountDownLatch(1);

    b(CaptureActivity captureactivity, String s, h h)
    {
        a = captureactivity;
        captureactivity = new Vector();
        captureactivity.add(BarcodeFormat.QR_CODE);
        b.put(DecodeHintType.POSSIBLE_FORMATS, captureactivity);
        if (s != null)
        {
            b.put(DecodeHintType.CHARACTER_SET, s);
        }
        b.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, h);
    }

    final Handler a()
    {
        try
        {
            d.await();
        }
        catch (InterruptedException interruptedexception) { }
        return c;
    }

    public final void run()
    {
        Looper.prepare();
        c = new a(a, b);
        d.countDown();
        Looper.loop();
    }
}
