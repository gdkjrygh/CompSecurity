// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.ah;
import com.google.android.apps.youtube.datalib.innertube.z;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            cl, LikeAction

final class cm
    implements ah
{

    final LikeAction a;
    final String b;
    final cl c;

    cm(cl cl1, LikeAction likeaction, String s)
    {
        c = cl1;
        a = likeaction;
        b = s;
        super();
    }

    public final void a()
    {
        cl.a(c, a, b, z.a);
    }

    public final void a(Exception exception)
    {
        cl.a(c).c(exception);
    }

    public final void b()
    {
    }
}
