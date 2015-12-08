// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.app.Activity;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            v, UserProfile, o

final class s
    implements b
{

    final v a;
    final Activity b;
    final o c;

    s(o o1, v v1, Activity activity)
    {
        c = o1;
        a = v1;
        b = activity;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        a.a(exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (UserProfile)obj1;
        if (((UserProfile) (obj)).isEligibleForChannel)
        {
            o.a(c, a, b);
            return;
        }
        if (((UserProfile) (obj)).isLightweight)
        {
            com.google.android.apps.youtube.core.identity.o.b(c, a, b);
            return;
        } else
        {
            a.a();
            return;
        }
    }
}
