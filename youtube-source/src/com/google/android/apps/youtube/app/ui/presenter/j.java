// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.View;
import com.google.android.apps.youtube.datalib.d.a;
import com.google.android.apps.youtube.datalib.innertube.model.aw;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            h

final class j
    implements android.view.View.OnClickListener
{

    final aw a;
    final h b;

    j(h h1, aw aw1)
    {
        b = h1;
        a = aw1;
        super();
    }

    public final void onClick(View view)
    {
        h.c(b).a(a.e());
    }
}
