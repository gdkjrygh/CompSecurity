// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.e.n;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            ao, ap

public final class an
{

    private final b a = new n();
    private final Handler b = new ao(this, Looper.getMainLooper());

    public an()
    {
    }

    static b a(an an1)
    {
        return an1.a;
    }

    static void a(an an1, ap ap, int i, int j)
    {
        an1.b(ap, i, j);
    }

    private void b(ap ap, int i, int j)
    {
label0:
        {
            b.removeMessages(0, ap);
            if (j != -1)
            {
                j -= (int)(a.b() - (long)i);
                ap = b.obtainMessage(0, i, 0, ap);
                if (j <= 0)
                {
                    break label0;
                }
                b.sendMessageDelayed(ap, j);
            }
            return;
        }
        b.sendMessage(ap);
    }

    public final void a(ap ap)
    {
        b.removeMessages(0, ap);
    }

    public final void a(ap ap, int i, int j)
    {
        c.a(ap, "client cannot be null");
        b(ap, (int)(a.b() - (long)i), j);
    }
}
