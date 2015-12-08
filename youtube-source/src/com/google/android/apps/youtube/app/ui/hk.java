// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.ah;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hj, LikeAction

final class hk
    implements ah
{

    final String a;
    final LikeAction b;
    final hj c;

    hk(hj hj1, String s, LikeAction likeaction)
    {
        c = hj1;
        a = s;
        b = likeaction;
        super();
    }

    public final void a()
    {
        hj.a(c, a, b);
    }

    public final void a(Exception exception)
    {
        hj.a(c).c(exception);
    }

    public final void b()
    {
    }
}
