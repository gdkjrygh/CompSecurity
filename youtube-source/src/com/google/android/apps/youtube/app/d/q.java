// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import com.google.android.apps.youtube.app.ui.presenter.v;
import com.google.android.apps.youtube.datalib.distiller.model.a;
import com.google.android.apps.youtube.datalib.distiller.model.c;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            p, f

final class q
    implements Runnable
{

    final c a;
    final p b;

    q(p p1, c c)
    {
        b = p1;
        a = c;
        super();
    }

    public final void run()
    {
        String s = f.g(b.a).e();
        com.google.android.apps.youtube.app.d.p.a(b, com.google.android.apps.youtube.app.d.f.a(b.a).b, s, a);
    }
}
