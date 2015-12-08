// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.a;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.gau.go.a:
//            b, s, e

class t
    implements b
{

    final s a;

    t(s s1)
    {
        a = s1;
        super();
    }

    public void a()
    {
        e.e(a.b);
        Intent intent = new Intent("com.android.broadcast.ctrlinfo");
        intent.putExtra("pkg_name", e.b(a.b).getPackageName());
        e.b(a.b).sendBroadcast(intent);
    }
}
