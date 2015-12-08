// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;
import com.google.android.apps.youtube.uilib.innertube.q;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            LoadingFrameLayout

final class bs
    implements android.view.View.OnClickListener
{

    final q a;
    final LoadingFrameLayout b;

    bs(LoadingFrameLayout loadingframelayout, q q1)
    {
        b = loadingframelayout;
        a = q1;
        super();
    }

    public final void onClick(View view)
    {
        if (a != null)
        {
            a.k_();
        }
    }
}
