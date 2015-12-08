// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.youtube.p;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            aa

public final class dv
    implements aa
{

    private Context a;
    private AtomicReference b;
    private Playlist c;

    public dv(Context context, AtomicReference atomicreference)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (AtomicReference)com.google.android.apps.youtube.common.fromguava.c.a(atomicreference);
    }

    public final boolean a()
    {
        c = (Playlist)b.get();
        return c != null;
    }

    public final String b()
    {
        return a.getString(p.cA, new Object[] {
            c.title
        });
    }

    public final int c()
    {
        return 0;
    }

    public final Playlist d()
    {
        return c;
    }
}
