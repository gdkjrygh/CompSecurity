// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.zxing.ReaderException;
import com.google.zxing.b;
import com.google.zxing.client.android.a.c;
import com.google.zxing.common.i;
import com.google.zxing.d;
import java.util.Hashtable;

// Referenced classes of package com.google.zxing.client.android:
//            j, CaptureActivity, g

final class a extends Handler
{

    private static final String a = com/google/zxing/client/android/a.getSimpleName();
    private final CaptureActivity b;
    private final d c = new d();
    private boolean d;

    a(CaptureActivity captureactivity, Hashtable hashtable)
    {
        d = true;
        c.a(hashtable);
        b = captureactivity;
    }

    public final void handleMessage(Message message)
    {
        if (d) goto _L2; else goto _L1
_L1:
        return;
_L2:
        g g1;
        long l1;
        if (message.what != com.google.zxing.client.android.j.b)
        {
            continue; /* Loop/switch isn't completed */
        }
        byte abyte0[] = (byte[])message.obj;
        int k = message.arg1;
        int l = message.arg2;
        l1 = System.currentTimeMillis();
        g1 = b.c().a(abyte0, k, l);
        if (g1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        message = new b(new i(g1));
        message = c.a(message);
        c.a();
_L4:
        Object obj;
        obj = b.b();
        if (message == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        long l2 = System.currentTimeMillis();
        Log.d(a, (new StringBuilder("Found barcode in ")).append(l2 - l1).append(" ms").toString());
        if (obj != null)
        {
            message = Message.obtain(((Handler) (obj)), com.google.zxing.client.android.j.d, message);
            obj = new Bundle();
            ((Bundle) (obj)).putParcelable("barcode_bitmap", g1.d());
            message.setData(((Bundle) (obj)));
            message.sendToTarget();
            return;
        }
        if (true) goto _L1; else goto _L3
        message;
        c.a();
        message = null;
          goto _L4
        message;
        c.a();
        throw message;
        if (obj == null) goto _L1; else goto _L5
_L5:
        Message.obtain(((Handler) (obj)), com.google.zxing.client.android.j.c).sendToTarget();
        return;
        if (message.what != j.g) goto _L1; else goto _L6
_L6:
        d = false;
        Looper.myLooper().quit();
        return;
_L3:
        message = null;
          goto _L4
    }

}
