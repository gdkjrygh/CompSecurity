// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import com.google.android.apps.youtube.app.ui.TabbedView;
import com.google.android.apps.youtube.app.ui.go;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.innertube.model.an;
import com.google.android.apps.youtube.uilib.innertube.t;
import java.util.ArrayList;
import java.util.List;

public final class aj
    implements go
{

    private final TabbedView a;
    private final List b = new ArrayList();

    public aj(TabbedView tabbedview)
    {
        a = (TabbedView)c.a(tabbedview);
        tabbedview.setOnTabSelectedListener(this);
    }

    public final void a()
    {
        b.clear();
        a.a();
    }

    public final void a(int i)
    {
        ((t)b.get(i)).j();
    }

    public final void a(an an1, t t1)
    {
        b.add(t1);
        a.a(an1.a(), t1.k());
        if (an1.b())
        {
            a.a(b.size() - 1);
        }
    }
}
