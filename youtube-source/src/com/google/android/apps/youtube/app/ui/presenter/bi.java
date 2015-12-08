// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.View;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.datalib.innertube.model.aa;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            bh

final class bi
    implements android.view.View.OnClickListener
{

    final a a;
    final bh b;

    bi(bh bh1, a a1)
    {
        b = bh1;
        a = a1;
        super();
    }

    public final void onClick(View view)
    {
        if (com.google.android.apps.youtube.app.ui.presenter.bh.a(b) != null && com.google.android.apps.youtube.app.ui.presenter.bh.a(b).b() != null)
        {
            a.a(com.google.android.apps.youtube.app.ui.presenter.bh.a(b).b());
        }
    }
}
