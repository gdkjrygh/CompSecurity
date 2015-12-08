// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.c.a;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            UserProfile, l, z, n, 
//            f

final class m
    implements b
{

    final f a;
    final a b;
    final l c;

    m(l l1, f f, a a1)
    {
        c = l1;
        a = f;
        b = a1;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        L.a("Could not fetch user profile", exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (UserProfile)obj1;
        if (com.google.android.apps.youtube.core.identity.l.a(c) == a)
        {
            com.google.android.apps.youtube.core.identity.l.a(c, com.google.android.apps.youtube.core.identity.z.a(com.google.android.apps.youtube.core.identity.l.a(c), ((UserProfile) (obj))));
            l.c(c).a(com.google.android.apps.youtube.core.identity.l.b(c));
            b.c(new n());
        }
    }
}
