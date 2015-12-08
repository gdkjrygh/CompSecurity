// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Dialog;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.youtube.app.adapter.ad;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.o;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hr, hj, id, ho, 
//            hp, hu

final class ht
    implements android.widget.AdapterView.OnItemClickListener
{

    final hj a;
    final hr b;

    ht(hr hr1, hj hj1)
    {
        b = hr1;
        a = hj1;
        super();
    }

    public final void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (hr.b(b) != null && hr.b(b).isShowing())
        {
            hr.b(b).dismiss();
        }
        adapterview = com.google.android.apps.youtube.app.ui.hr.a(b).a(i);
        if (adapterview != null)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        if (!com.google.android.apps.youtube.app.ui.hr.a(b).d(i)) goto _L2; else goto _L1
_L1:
        hj.f(b.a).b("WatchLater");
        hj.e(b.a).k(hr.c(b), com.google.android.apps.youtube.common.a.a.a(b.a.a, new id(b.a.a, com.google.android.apps.youtube.app.ui.hj.a(b.a))));
_L4:
        return;
_L2:
        if (com.google.android.apps.youtube.app.ui.hr.a(b).c(i))
        {
            hj.h(b.a).a(b.a.a, new ho(b.a, hr.c(b)));
            return;
        }
        if (com.google.android.apps.youtube.app.ui.hr.a(b).e(i))
        {
            hj.i(b.a).a(hr.c(b));
            return;
        }
        if (!com.google.android.apps.youtube.app.ui.hr.a(b).b(i)) goto _L4; else goto _L3
_L3:
        hj.h(b.a).a(b.a.a, new hu(this));
        return;
        hj.f(b.a).b("SaveToPlaylist");
        b.a.a(hr.c(b), adapterview);
        return;
    }
}
