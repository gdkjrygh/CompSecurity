// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.View;
import com.google.android.apps.youtube.app.ui.cl;
import com.google.android.apps.youtube.datalib.innertube.model.ab;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            bk

final class bo
    implements android.view.View.OnClickListener
{

    final bk a;

    bo(bk bk1)
    {
        a = bk1;
        super();
    }

    public final void onClick(View view)
    {
        if (bk.b(a).k())
        {
            bk.d(a).a(bk.b(a).a(), bk.b(a).c().toString());
        }
    }
}
