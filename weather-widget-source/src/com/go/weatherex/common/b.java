// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.common;

import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.go.weatherex.common:
//            c, a

public class b
{

    private a a;
    private View b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener h = new c(this);

    public b(View view, a a1)
    {
        c = true;
        b = view;
        d = b.getLeft();
        e = b.getTop();
        f = b.getRight();
        g = b.getBottom();
        a = a1;
        b.getViewTreeObserver().addOnGlobalLayoutListener(h);
    }

    static int a(b b1, int i)
    {
        b1.d = i;
        return i;
    }

    static View a(b b1)
    {
        return b1.b;
    }

    static boolean a(b b1, boolean flag)
    {
        b1.c = flag;
        return flag;
    }

    static int b(b b1)
    {
        return b1.d;
    }

    static int b(b b1, int i)
    {
        b1.e = i;
        return i;
    }

    static int c(b b1)
    {
        return b1.f;
    }

    static int c(b b1, int i)
    {
        b1.f = i;
        return i;
    }

    static int d(b b1)
    {
        return b1.e;
    }

    static int d(b b1, int i)
    {
        b1.g = i;
        return i;
    }

    static int e(b b1)
    {
        return b1.g;
    }

    static a f(b b1)
    {
        return b1.a;
    }

    static boolean g(b b1)
    {
        return b1.c;
    }

    public void a()
    {
        b.getViewTreeObserver().removeGlobalOnLayoutListener(h);
    }
}
