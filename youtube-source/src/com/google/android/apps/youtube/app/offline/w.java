// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import android.app.Dialog;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            x, r

final class w
{

    final r a;
    private Dialog b;
    private String c;

    private w(r r1)
    {
        a = r1;
        super();
    }

    w(r r1, byte byte0)
    {
        this(r1);
    }

    static String a(w w1)
    {
        return w1.c;
    }

    static void a(w w1, String s)
    {
        if (w1.b == null)
        {
            x x1 = new x(w1);
            w1.b = (new aa(r.b(w1.a))).setMessage(p.fd).setCancelable(true).setPositiveButton(p.fb, x1).setNegativeButton(p.K, null).create();
        }
        w1.c = s;
        w1.b.show();
    }
}
