// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.identity.UserProfile;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            at

final class au
    implements b
{

    final String a;
    final long b;
    final at c;

    au(at at1, String s, long l)
    {
        c = at1;
        a = s;
        b = l;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        at.a(c, a, b, null);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (UserProfile)obj1;
        at.a(c, a, b, ((UserProfile) (obj)));
    }
}
