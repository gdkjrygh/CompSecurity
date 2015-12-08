// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.View;
import com.google.android.apps.youtube.app.offline.f;
import com.google.android.apps.youtube.app.offline.j;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.datalib.innertube.model.ab;
import com.google.android.apps.youtube.datalib.legacy.model.s;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            bk

final class bq
    implements android.view.View.OnClickListener
{

    final OfflineStoreInterface a;
    final j b;
    final bk c;

    bq(bk bk1, OfflineStoreInterface offlinestoreinterface, j j)
    {
        c = bk1;
        a = offlinestoreinterface;
        b = j;
        super();
    }

    public final void onClick(View view)
    {
        view = bk.b(c).a();
        s s1 = a.b(view);
        if (s1 == null)
        {
            com.google.android.apps.youtube.app.ui.presenter.bk.f(c).a(view, b);
            return;
        }
        if (bk.g(c) != null && s1.a(bk.g(c)))
        {
            com.google.android.apps.youtube.app.ui.presenter.bk.f(c).a(bk.g(c));
            return;
        } else
        {
            com.google.android.apps.youtube.app.ui.presenter.bk.f(c).a(view);
            return;
        }
    }
}
