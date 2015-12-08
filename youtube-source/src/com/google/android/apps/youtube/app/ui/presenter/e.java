// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.View;
import com.google.android.apps.youtube.datalib.distiller.model.c;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            b, g

final class e
    implements android.view.View.OnClickListener
{

    final c a;
    final b b;

    e(b b1, c c1)
    {
        b = b1;
        a = c1;
        super();
    }

    public final void onClick(View view)
    {
        com.google.android.apps.youtube.app.ui.presenter.b.d(b).a(a.i());
    }
}
