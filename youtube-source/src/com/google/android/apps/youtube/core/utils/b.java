// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.content.Context;
import com.google.android.ads.s;
import com.google.android.ads.t;
import com.google.android.apps.youtube.common.e.f;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            a

final class b extends f
{

    final Context a;
    final String b;
    final String c;
    final a d;

    b(a a1, Context context, String s1, String s2)
    {
        d = a1;
        a = context;
        b = s1;
        c = s2;
        super();
    }

    public final Object a()
    {
        t t1 = new t(s.a(com.google.android.apps.youtube.core.utils.a.a(d), a));
        t1.a(b, c);
        return t1;
    }
}
