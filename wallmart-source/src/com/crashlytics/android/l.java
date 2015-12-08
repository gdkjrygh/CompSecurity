// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import com.crashlytics.android.internal.aP;
import com.crashlytics.android.internal.aU;
import com.crashlytics.android.internal.aX;

// Referenced classes of package com.crashlytics.android:
//            Crashlytics

final class l
    implements aU
{

    private Crashlytics a;

    l(Crashlytics crashlytics)
    {
        a = crashlytics;
        super();
    }

    public final Object a(aX ax)
    {
        boolean flag = false;
        if (ax.d.a)
        {
            ax = a;
            if (!Crashlytics.k())
            {
                flag = true;
            }
            return Boolean.valueOf(flag);
        } else
        {
            return Boolean.valueOf(false);
        }
    }
}
