// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.content.Context;
import com.google.android.apps.youtube.common.e.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.o;
import com.google.android.apps.youtube.medialib.a.a;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            br

public final class bs
{

    private final Context a;
    private final b b;
    private final a c;
    private final o d;

    public bs(Context context, b b1, a a1, o o1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        c = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        d = (o)com.google.android.apps.youtube.common.fromguava.c.a(o1);
    }

    public final br a(String s)
    {
        s = new br(a, b, c, d, s);
        s.a();
        return s;
    }
}
