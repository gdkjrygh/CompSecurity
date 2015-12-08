// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import android.app.Dialog;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            z, r, v

final class y
{

    final r a;
    private Dialog b;
    private String c;
    private String d;
    private v e;

    private y(r r1)
    {
        a = r1;
        super();
    }

    y(r r1, byte byte0)
    {
        this(r1);
    }

    static String a(y y1)
    {
        return y1.c;
    }

    static void a(y y1, String s, String s1, v v)
    {
        if (y1.b == null)
        {
            z z1 = new z(y1);
            y1.b = (new aa(r.b(y1.a))).setMessage(p.fv).setCancelable(true).setPositiveButton(p.fu, z1).setNegativeButton(p.K, null).create();
        }
        y1.c = s;
        y1.d = s1;
        y1.e = v;
        y1.b.show();
    }

    static String b(y y1)
    {
        return y1.d;
    }

    static v c(y y1)
    {
        return y1.e;
    }
}
