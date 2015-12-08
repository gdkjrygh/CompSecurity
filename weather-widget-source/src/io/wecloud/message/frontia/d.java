// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.frontia;

import android.content.Context;
import io.wecloud.message.d.e;

// Referenced classes of package io.wecloud.message.frontia:
//            c, b

class d
    implements e
{

    private final Context a;
    private final b b;
    private final String c;

    d(Context context, b b1, String s)
    {
        a = context;
        b = b1;
        c = s;
        super();
    }

    public void a(int i)
    {
        io.wecloud.message.frontia.c.a(a, b, c, -101);
    }

    public void a(int i, int j, int k)
    {
    }

    public void b(int i)
    {
        io.wecloud.message.frontia.c.a(a, b, c, 0);
    }
}
