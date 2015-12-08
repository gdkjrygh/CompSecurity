// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.UserProfile;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            d, c

final class e
    implements b
{

    final c a;

    private e(c c1)
    {
        a = c1;
        super();
    }

    e(c c1, byte byte0)
    {
        this(c1);
    }

    public final void a(Object obj, Exception exception)
    {
        obj = (GDataRequest)obj;
        L.a((new StringBuilder("Couldn't retrieve user profile info from [uri=")).append(((GDataRequest) (obj)).a).append("]").toString(), exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (UserProfile)obj1;
        if (((UserProfile) (obj)).thumbnailUri != null)
        {
            com.google.android.apps.youtube.core.player.overlay.c.b(a, d.a(new com.google.android.apps.youtube.core.player.overlay.d(a, (byte)0)));
            c.g(a).a(((UserProfile) (obj)).thumbnailUri, com.google.android.apps.youtube.common.a.e.a(c.c(a), c.f(a)));
        }
    }
}
