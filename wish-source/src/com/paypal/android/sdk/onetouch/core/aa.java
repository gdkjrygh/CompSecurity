// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            x

final class aa extends Handler
{

    private final WeakReference a;

    public aa(x x1)
    {
        a = new WeakReference(x1);
    }

    public final void handleMessage(Message message)
    {
        x x1 = (x)a.get();
        if (x1 != null)
        {
            x1.a(message);
        }
    }
}
