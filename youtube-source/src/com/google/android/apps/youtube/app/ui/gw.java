// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.identity.UserProfile;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            gt

final class gw
    implements b
{

    final gt a;

    private gw(gt gt1)
    {
        a = gt1;
        super();
    }

    gw(gt gt1, byte byte0)
    {
        this(gt1);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        L.a("Error retrieving user profile", exception);
        gt.a(a);
    }

    public final volatile void a(Object obj, Object obj1)
    {
        obj = (UserProfile)obj1;
        gt.a(a, ((UserProfile) (obj)));
    }
}
