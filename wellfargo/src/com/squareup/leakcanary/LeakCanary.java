// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.leakcanary;

import android.app.Application;

// Referenced classes of package com.squareup.leakcanary:
//            RefWatcher

public final class LeakCanary
{

    private LeakCanary()
    {
        throw new AssertionError();
    }

    public static RefWatcher install(Application application)
    {
        return RefWatcher.DISABLED;
    }
}
