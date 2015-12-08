// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline;

import android.app.Dialog;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.offline:
//            l, f

final class k
{

    final f a;
    private Dialog b;
    private String c;

    private k(f f1)
    {
        a = f1;
        super();
    }

    k(f f1, byte byte0)
    {
        this(f1);
    }

    static String a(k k1)
    {
        return k1.c;
    }

    static void a(k k1, String s)
    {
        if (k1.b == null)
        {
            l l1 = new l(k1);
            k1.b = (new aa(f.c(k1.a))).setMessage(p.fc).setCancelable(true).setPositiveButton(p.fb, l1).setNegativeButton(p.K, null).create();
        }
        k1.c = s;
        k1.b.show();
    }
}
