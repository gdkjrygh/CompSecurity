// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.e;

import com.jiubang.commerce.utils.i;
import com.jiubang.commerce.utils.j;

// Referenced classes of package com.jiubang.commerce.ad.e:
//            n, p

class o
    implements Runnable
{

    final String a;
    final p b;
    final n c;

    o(n n1, String s, p p1)
    {
        c = n1;
        a = s;
        b = p1;
        super();
    }

    public void run()
    {
        android.graphics.Bitmap bitmap = i.a(n.a(c), a, n.a(a));
        if (j.a)
        {
            j.a("Ad_SDK", (new StringBuilder()).append("asynLoadAdImage(").append(a).append(", ").append(bitmap).append(")").toString());
        }
        if (b != null)
        {
            b.a(a, bitmap);
        }
    }
}
