// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.viewex;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package com.go.weatherex.viewex:
//            b, c

public class FrameImageView extends ImageView
{

    private Drawable a;
    private int b;
    private int c[];
    private Bitmap d[];
    private long e;
    private long f;
    private int g;
    private int h;
    private c i;
    private boolean j;
    private Runnable k;

    public FrameImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = 70L;
        f = 1000L;
        g = -1;
        k = new b(this);
    }

    static int a(FrameImageView frameimageview, int l)
    {
        frameimageview.b = l;
        return l;
    }

    static boolean a(FrameImageView frameimageview)
    {
        return frameimageview.j;
    }

    static Bitmap[] b(FrameImageView frameimageview)
    {
        return frameimageview.d;
    }

    private void c()
    {
        b = 0;
        h = 0;
        if (a != null)
        {
            setImageDrawable(a);
        }
    }

    static int[] c(FrameImageView frameimageview)
    {
        return frameimageview.c;
    }

    static int d(FrameImageView frameimageview)
    {
        int l = frameimageview.b + 1;
        frameimageview.b = l;
        return l;
    }

    private void d()
    {
        a = getDrawable();
    }

    static int e(FrameImageView frameimageview)
    {
        return frameimageview.b;
    }

    private void e()
    {
        c();
        i.a();
    }

    static int f(FrameImageView frameimageview)
    {
        int l = frameimageview.h + 1;
        frameimageview.h = l;
        return l;
    }

    static long g(FrameImageView frameimageview)
    {
        return frameimageview.f;
    }

    static int h(FrameImageView frameimageview)
    {
        return frameimageview.g;
    }

    static int i(FrameImageView frameimageview)
    {
        return frameimageview.h;
    }

    static long j(FrameImageView frameimageview)
    {
        return frameimageview.e;
    }

    static void k(FrameImageView frameimageview)
    {
        frameimageview.e();
    }

    public void a()
    {
        b();
        d();
        post(k);
    }

    public void a(int l)
    {
        g = l;
    }

    public void a(int ai[], c c1)
    {
        i = c1;
        c = ai;
    }

    public void a(Bitmap abitmap[], c c1)
    {
        i = c1;
        d = abitmap;
        j = true;
    }

    public void b()
    {
        removeCallbacks(k);
        c();
    }
}
