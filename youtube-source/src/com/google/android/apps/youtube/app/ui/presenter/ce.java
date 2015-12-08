// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.View;
import com.google.android.apps.youtube.app.navigation.AppNavigator;
import com.google.android.apps.youtube.app.ui.a;
import com.google.android.apps.youtube.datalib.innertube.model.ah;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            cd

final class ce
    implements android.view.View.OnClickListener
{

    final a a;
    final com.google.android.apps.youtube.datalib.d.a b;
    final cd c;

    ce(cd cd1, a a1, com.google.android.apps.youtube.datalib.d.a a2)
    {
        c = cd1;
        a = a1;
        b = a2;
        super();
    }

    public final void onClick(View view)
    {
        if (com.google.android.apps.youtube.app.ui.presenter.cd.a(c) != null)
        {
            a.a(com.google.android.apps.youtube.app.ui.presenter.cd.a(c).n());
            ((AppNavigator)b).a(com.google.android.apps.youtube.app.ui.presenter.cd.a(c).e());
        }
    }
}
