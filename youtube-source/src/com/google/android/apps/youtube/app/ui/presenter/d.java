// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.View;
import com.google.android.apps.youtube.app.d.r;
import com.google.android.apps.youtube.datalib.distiller.model.c;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            b

final class d
    implements android.view.View.OnClickListener
{

    final c a;
    final b b;

    d(b b1, c c)
    {
        b = b1;
        a = c;
        super();
    }

    public final void onClick(View view)
    {
        com.google.android.apps.youtube.app.ui.presenter.b.c(b).a(a);
    }
}
