// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.View;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            b, f

final class c
    implements android.view.View.OnClickListener
{

    final com.google.android.apps.youtube.datalib.distiller.model.c a;
    final b b;

    c(b b1, com.google.android.apps.youtube.datalib.distiller.model.c c1)
    {
        b = b1;
        a = c1;
        super();
    }

    public final void onClick(View view)
    {
        com.google.android.apps.youtube.app.ui.presenter.b.a(b).setOnClickListener(null);
        com.google.android.apps.youtube.app.ui.presenter.b.b(b).a(a);
    }
}
