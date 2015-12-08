// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            be, bd, cp, bg

final class bf
    implements b
{

    final be a;

    bf(be be1)
    {
        a = be1;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        L.a("Error creating playlist", exception);
        bd.c(a.d).c(exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Playlist)obj1;
        com.google.android.apps.youtube.app.ui.bd.b(a.d).c(new cp());
        a.c.a(((Playlist) (obj)));
        ah.a(com.google.android.apps.youtube.app.ui.bd.a(a.d), p.aC, 1);
    }
}
