// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import com.google.android.apps.youtube.app.ui.presenter.f;
import com.google.android.apps.youtube.datalib.distiller.model.c;
import com.google.android.apps.youtube.uilib.a.h;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            f

final class k
    implements f
{

    final com.google.android.apps.youtube.app.d.f a;

    private k(com.google.android.apps.youtube.app.d.f f1)
    {
        a = f1;
        super();
    }

    k(com.google.android.apps.youtube.app.d.f f1, byte byte0)
    {
        this(f1);
    }

    public final void a(c c1)
    {
        c1.g();
        f.b(a).notifyDataSetChanged();
    }
}
