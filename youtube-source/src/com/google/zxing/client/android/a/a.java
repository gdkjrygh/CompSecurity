// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.a;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;

final class a
    implements android.hardware.Camera.AutoFocusCallback
{

    private static final String a = com/google/zxing/client/android/a/a.getSimpleName();
    private Handler b;
    private int c;

    a()
    {
    }

    final void a(Handler handler, int i)
    {
        b = handler;
        c = i;
    }

    public final void onAutoFocus(boolean flag, Camera camera)
    {
        if (b != null)
        {
            camera = b.obtainMessage(c, Boolean.valueOf(flag));
            b.sendMessageDelayed(camera, 1500L);
            b = null;
            return;
        } else
        {
            Log.d(a, "Got auto-focus callback, but no handler for it");
            return;
        }
    }

}
