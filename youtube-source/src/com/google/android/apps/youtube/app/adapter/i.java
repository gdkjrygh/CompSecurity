// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Message;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            h, j

final class i
    implements b, Runnable
{

    public boolean a;
    public boolean b;
    final h c;
    private final h d;
    private Bitmap e;

    private i(h h1, h h2)
    {
        c = h1;
        super();
        a = false;
        b = false;
        d = h2;
    }

    i(h h1, h h2, byte byte0)
    {
        this(h1, h2);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        if (h.a(d) == this)
        {
            h.a(d, null);
        }
    }

    public final void a(Object obj, Object obj1)
    {
label0:
        {
            obj = (Bitmap)obj1;
            if (h.a(d) == this)
            {
                b = true;
                e = ((Bitmap) (obj));
                if (!com.google.android.apps.youtube.app.adapter.h.b(c))
                {
                    break label0;
                }
                h.a(c, false);
                h.a().sendMessage(Message.obtain(h.a(), this));
            }
            return;
        }
        run();
    }

    public final void run()
    {
        if (h.a(d) == this)
        {
            h.a(d, null);
            BitmapDrawable bitmapdrawable = new BitmapDrawable(h.c(c).getResources(), e);
            h.d(d).setImageDrawable(bitmapdrawable);
            if (h.e(c) != null)
            {
                j j2 = h.e(c);
                Object obj = c;
                obj = e;
                j2.a();
            }
            if (h.d(d).getScaleType() == android.widget.ImageView.ScaleType.MATRIX)
            {
                Matrix matrix = new Matrix();
                c.a(matrix, h.d(d), bitmapdrawable);
                h.d(d).setImageMatrix(matrix);
            }
            if (a)
            {
                h.f(c).reset();
                h.f(c).setDuration(h.g(c));
                h.d(d).startAnimation(h.f(c));
            } else
            if (h.e(c) != null)
            {
                j j1 = h.e(c);
                h h1 = c;
                j1.b();
                return;
            }
        }
    }
}
