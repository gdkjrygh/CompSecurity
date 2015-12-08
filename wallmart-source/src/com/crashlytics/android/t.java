// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.Context;
import com.crashlytics.android.internal.aa;
import com.crashlytics.android.internal.q;
import com.crashlytics.android.internal.v;
import java.util.concurrent.CountDownLatch;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics, v

final class t extends aa
{

    private Context a;
    private float b;
    private CountDownLatch c;
    private Crashlytics d;

    t(Crashlytics crashlytics, Context context, float f, CountDownLatch countdownlatch)
    {
        d = crashlytics;
        a = context;
        b = f;
        c = countdownlatch;
        super();
    }

    public final void a()
    {
        if (Crashlytics.a(d, a, b))
        {
            Crashlytics.a(d).e();
        }
        c.countDown();
        return;
        Object obj;
        obj;
        v.a().b().a("Crashlytics", "Problem encountered during Crashlytics initialization.", ((Throwable) (obj)));
        c.countDown();
        return;
        obj;
        c.countDown();
        throw obj;
    }
}
