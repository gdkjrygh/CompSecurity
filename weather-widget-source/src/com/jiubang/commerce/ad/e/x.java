// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import android.content.Context;
import java.util.ArrayList;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            t

class x
    implements Runnable
{

    final Context a;
    final ArrayList b;
    final String c;
    final Integer d;
    final t e;

    x(t t1, Context context, ArrayList arraylist, String s, Integer integer)
    {
        e = t1;
        a = context;
        b = arraylist;
        c = s;
        d = integer;
        super();
    }

    public void run()
    {
        t.a(e, a, b, true, c, d);
    }
}
