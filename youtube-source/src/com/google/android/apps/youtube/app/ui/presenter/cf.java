// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.View;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.datalib.innertube.model.ah;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            cd

final class cf
    implements android.view.View.OnClickListener
{

    final a a;
    final cd b;

    cf(cd cd1, a a1)
    {
        b = cd1;
        a = a1;
        super();
    }

    public final void onClick(View view)
    {
        if (com.google.android.apps.youtube.app.ui.presenter.cd.a(b) != null && com.google.android.apps.youtube.app.ui.presenter.cd.a(b).j() != null)
        {
            a.a(com.google.android.apps.youtube.app.ui.presenter.cd.a(b).j());
        }
    }
}
