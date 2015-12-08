// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.UserProfile;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            a

final class b
    implements com.google.android.apps.youtube.common.a.b
{

    final a a;
    private final com.google.android.apps.youtube.common.a.b b;

    public b(a a1, com.google.android.apps.youtube.common.a.b b1)
    {
        a = a1;
        super();
        b = b1;
    }

    public final volatile void a(Object obj, Exception exception)
    {
        L.a("Error retrieving user profile", exception);
        b.a(null, exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (UserProfile)obj1;
        com.google.android.apps.youtube.app.adapter.a.a(a).c(((UserProfile) (obj)).thumbnailUri, b);
    }
}
