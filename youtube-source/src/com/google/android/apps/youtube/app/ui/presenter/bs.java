// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.innertube.model.ab;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            bk

final class bs
    implements b
{

    final bk a;

    private bs(bk bk1)
    {
        a = bk1;
        super();
    }

    bs(bk bk1, byte byte0)
    {
        this(bk1);
    }

    public final volatile void a(Object obj, Exception exception)
    {
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Playlist)obj1;
        if (com.google.android.apps.youtube.app.ui.presenter.bk.b(a) != null && ((Playlist) (obj)).id.equals(com.google.android.apps.youtube.app.ui.presenter.bk.b(a).a()))
        {
            bk.a(a, ((Playlist) (obj)));
        }
    }
}
