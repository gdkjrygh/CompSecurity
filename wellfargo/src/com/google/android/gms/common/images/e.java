// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.b.f;
import com.google.android.gms.b.g;
import com.google.android.gms.b.h;

// Referenced classes of package com.google.android.gms.common.images:
//            f, a

public abstract class e
{

    final com.google.android.gms.common.images.f a;
    protected int b;
    protected a c;
    protected int d;

    private Drawable a(Context context, g g1, int i)
    {
        Resources resources = context.getResources();
        if (d > 0)
        {
            h h1 = new h(i, d);
            Drawable drawable = (Drawable)g1.a(h1);
            context = drawable;
            if (drawable == null)
            {
                Drawable drawable1 = resources.getDrawable(i);
                context = drawable1;
                if ((d & 1) != 0)
                {
                    context = a(resources, drawable1);
                }
                g1.b(h1, context);
            }
            return context;
        } else
        {
            return resources.getDrawable(i);
        }
    }

    protected Drawable a(Resources resources, Drawable drawable)
    {
        return f.a(resources, drawable);
    }

    void a(Context context, Bitmap bitmap, boolean flag)
    {
        com.google.android.gms.common.internal.e.a(bitmap);
        Bitmap bitmap1 = bitmap;
        if ((d & 1) != 0)
        {
            bitmap1 = f.a(bitmap);
        }
        context = new BitmapDrawable(context.getResources(), bitmap1);
        if (c != null)
        {
            c.a(a.a, context, true);
        }
        a(((Drawable) (context)), flag, false, true);
    }

    void a(Context context, g g1, boolean flag)
    {
        Drawable drawable = null;
        if (b != 0)
        {
            drawable = a(context, g1, b);
        }
        if (c != null)
        {
            c.a(a.a, drawable, false);
        }
        a(drawable, flag, false, false);
    }

    protected abstract void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2);
}
