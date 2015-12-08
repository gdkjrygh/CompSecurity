// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.a.e;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            ae, i, j

public abstract class h
    implements android.view.animation.Animation.AnimationListener, ae
{

    private static Handler a;
    private final Context b;
    private final ImageView c;
    private final Animation d;
    private final int e;
    private i f;
    private boolean g;
    private j h;

    public h(Context context, View view, int k)
    {
        g = true;
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        b = context.getApplicationContext();
        d = AnimationUtils.loadAnimation(context, 0x10a0000);
        d.setAnimationListener(this);
        e = context.getResources().getInteger(0x10e0000);
        c = (ImageView)view.findViewById(k);
        if (a == null)
        {
            a = new Handler(context.getMainLooper());
        }
    }

    static Handler a()
    {
        return a;
    }

    static i a(h h1)
    {
        return h1.f;
    }

    static i a(h h1, i k)
    {
        h1.f = null;
        return null;
    }

    static boolean a(h h1, boolean flag)
    {
        h1.g = false;
        return false;
    }

    static boolean b(h h1)
    {
        return h1.g;
    }

    static Context c(h h1)
    {
        return h1.b;
    }

    static ImageView d(h h1)
    {
        return h1.c;
    }

    static j e(h h1)
    {
        return h1.h;
    }

    static Animation f(h h1)
    {
        return h1.d;
    }

    static int g(h h1)
    {
        return h1.e;
    }

    public final View a(int k, Object obj)
    {
        f = new i(this, this, (byte)0);
        a(obj, ((View) (c)), ((b) (com.google.android.apps.youtube.common.a.e.a(a, f))));
        if (f != null && !f.b)
        {
            c.setImageBitmap(null);
            c.setAnimation(null);
            f.a = true;
        }
        return c;
    }

    protected void a(Matrix matrix, ImageView imageview, BitmapDrawable bitmapdrawable)
    {
    }

    public final void a(j j1)
    {
        h = j1;
    }

    protected abstract void a(Object obj, View view, b b1);

    public void onAnimationEnd(Animation animation)
    {
        c.invalidate();
        if (h != null)
        {
            h.b();
        }
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }
}
