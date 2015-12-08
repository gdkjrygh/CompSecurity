// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import android.os.Looper;

// Referenced classes of package com.crashlytics.android.internal:
//            m, b

final class o
    implements m
{

    o()
    {
    }

    public final void a(b b)
    {
        if (Looper.myLooper() != Looper.getMainLooper())
        {
            throw new IllegalStateException((new StringBuilder("Event bus ")).append(b).append(" accessed from non-main thread ").append(Looper.myLooper()).toString());
        } else
        {
            return;
        }
    }
}
