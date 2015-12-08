// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gau.go.a:
//            b, c, e

class i
    implements b
{

    final c a;
    final String b;
    final e c;

    i(e e1, c c1, String s)
    {
        c = e1;
        a = c1;
        b = s;
        super();
    }

    public void a()
    {
        if (a != null)
        {
            a.b();
        }
        Intent intent = new Intent("com.android.broadcast.uploaddata");
        intent.putExtra("id", b);
        intent.putExtra("pkg_name", e.b(c).getPackageName());
        e.b(c).sendBroadcast(intent);
    }
}
