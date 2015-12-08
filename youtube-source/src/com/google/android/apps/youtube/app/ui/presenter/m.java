// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.View;
import com.google.a.a.a.a.kz;
import com.google.android.apps.youtube.datalib.d.a;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            h

final class m
    implements android.view.View.OnClickListener
{

    final kz a;
    final h b;

    m(h h1, kz kz)
    {
        b = h1;
        a = kz;
        super();
    }

    public final void onClick(View view)
    {
        if (a != null)
        {
            h.c(b).a(a);
        }
    }
}
