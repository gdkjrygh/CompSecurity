// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;

import android.app.Activity;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.UserProfile;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.ui:
//            j

final class o
    implements b
{

    final j a;

    private o(j j1)
    {
        a = j1;
        super();
    }

    o(j j1, byte byte0)
    {
        this(j1);
    }

    public final void a(Object obj, Exception exception)
    {
        j.l(a).c(exception);
        j.c(a).finish();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (UserProfile)obj1;
        j.a(a, ((UserProfile) (obj)).displayUsername);
        com.google.android.apps.youtube.app.honeycomb.ui.j.b(a, true);
        j.k(a);
    }
}
