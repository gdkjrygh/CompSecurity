// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import com.google.android.apps.youtube.app.adapter.ad;
import com.google.android.apps.youtube.core.a.a;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.ui.PagedView;
import com.google.android.apps.youtube.core.ui.l;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            hr, hj

final class hs extends l
{

    final hj a;
    final hr b;

    hs(hr hr1, Activity activity, PagedView pagedview, a a1, af af, aw aw, hj hj)
    {
        b = hr1;
        a = hj;
        super(activity, pagedview, a1, af, aw);
    }

    protected final void a()
    {
        com.google.android.apps.youtube.app.ui.hr.a(b).notifyDataSetChanged();
        g();
    }
}
