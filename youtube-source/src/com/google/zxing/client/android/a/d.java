// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.a;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

// Referenced classes of package com.google.zxing.client.android.a:
//            b

final class d
    implements android.hardware.Camera.PreviewCallback
{

    private static final String a = com/google/zxing/client/android/a/d.getSimpleName();
    private final b b;
    private Handler c;
    private int d;

    d(b b1)
    {
        b = b1;
    }

    final void a(Handler handler, int i)
    {
        c = handler;
        d = i;
    }

    public final void onPreviewFrame(byte abyte0[], Camera camera)
    {
        camera = b.a();
        Handler handler = c;
        if (handler != null)
        {
            handler.obtainMessage(d, ((Point) (camera)).x, ((Point) (camera)).y, abyte0).sendToTarget();
            c = null;
            return;
        } else
        {
            Log.d(a, "Got preview callback, but no handler for it");
            return;
        }
    }

}
