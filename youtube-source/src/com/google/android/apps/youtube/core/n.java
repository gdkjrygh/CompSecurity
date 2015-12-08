// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.apps.youtube.common.e.f;

// Referenced classes of package com.google.android.apps.youtube.core:
//            a

final class n extends f
{

    final a a;

    n(a a1)
    {
        a = a1;
        super();
    }

    public final Object a()
    {
        android.content.pm.ApplicationInfo applicationinfo = a.a.getApplicationInfo();
        return a.a.getPackageManager().getApplicationLabel(applicationinfo).toString();
    }
}
