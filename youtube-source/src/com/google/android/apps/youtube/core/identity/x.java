// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            w, o, UserProfile, b

final class x
    implements b
{

    final w a;

    x(w w1)
    {
        a = w1;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        o.a(a.a, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (UserProfile)obj1;
        o.a(a.a, ((UserProfile) (obj)).username, ((UserProfile) (obj)).channelId);
        o.c(a.a).a();
        o.d(a.a);
    }
}
