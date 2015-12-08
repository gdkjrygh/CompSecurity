// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.common;

import android.view.View;

// Referenced classes of package com.go.weatherex.common:
//            b, a

class c
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final b a;

    c(b b1)
    {
        a = b1;
        super();
    }

    public void onGlobalLayout()
    {
        boolean flag2 = true;
        int i = b.a(a).getLeft();
        int j = b.a(a).getTop();
        int k = b.a(a).getRight();
        int l = b.a(a).getBottom();
        boolean flag;
        if (i != b.b(a) || k != b.c(a) || j != b.d(a) || l != b.e(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && b.f(a) != null)
        {
            boolean flag1 = flag2;
            if (k - i == b.c(a) - b.b(a))
            {
                if (l - j != b.e(a) - b.d(a))
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
            }
            b.f(a).a(b.a(a), i, j, k, l, b.b(a), b.d(a), b.c(a), b.e(a), flag1, b.g(a));
        }
        b.a(a, false);
        b.a(a, b.a(a).getLeft());
        b.b(a, b.a(a).getTop());
        b.c(a, b.a(a).getRight());
        b.d(a, b.a(a).getBottom());
    }
}
