// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.apps.youtube.common.e.b;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            ap, an

final class ao extends Handler
{

    final an a;

    ao(an an1, Looper looper)
    {
        a = an1;
        super(looper);
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 0)
        {
            ap ap1 = (ap)message.obj;
            int i = message.arg1;
            int j = ap1.a((int)(an.a(a).b() - (long)i));
            an.a(a, ap1, i, j);
        }
    }
}
