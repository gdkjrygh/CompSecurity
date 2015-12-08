// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.View;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.datalib.innertube.model.as;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            cw

final class cx
    implements android.view.View.OnClickListener
{

    final a a;
    final cw b;

    cx(cw cw1, a a1)
    {
        b = cw1;
        a = a1;
        super();
    }

    public final void onClick(View view)
    {
        if (com.google.android.apps.youtube.app.ui.presenter.cw.a(b) != null && com.google.android.apps.youtube.app.ui.presenter.cw.a(b).b() != null)
        {
            a.a(com.google.android.apps.youtube.app.ui.presenter.cw.a(b).b());
        }
    }
}
