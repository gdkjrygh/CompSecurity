// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import android.app.Dialog;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            n, o, f

final class m
{

    final f a;
    private Dialog b;
    private Playlist c;

    private m(f f1)
    {
        a = f1;
        super();
    }

    m(f f1, byte byte0)
    {
        this(f1);
    }

    static Playlist a(m m1)
    {
        return m1.c;
    }

    static void a(m m1, Playlist playlist)
    {
        if (m1.b == null)
        {
            n n1 = new n(m1);
            o o1 = new o(m1);
            m1.b = (new aa(f.c(m1.a))).setMessage(p.fV).setCancelable(true).setPositiveButton(p.fb, o1).setNeutralButton(p.fW, n1).setNegativeButton(p.K, null).create();
        }
        m1.c = playlist;
        m1.b.show();
    }
}
