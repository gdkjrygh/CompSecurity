// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import com.jiubang.commerce.ad.url.h;
import com.jiubang.commerce.ad.url.i;
import java.util.List;

final class u
    implements Runnable
{

    final Context a;
    final int b;
    final List c;
    final boolean d;
    final i e;

    u(Context context, int i, List list, boolean flag, i j)
    {
        a = context;
        b = i;
        c = list;
        d = flag;
        e = j;
        super();
    }

    public void run()
    {
        h.a(a, String.valueOf(b), c, d, e);
    }
}
