// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            d, e

public class c
    implements b
{

    private final Animation a;
    private final ImageView b;
    private final Resources c;
    private final e d;
    private final int e;

    public c(Context context, ImageView imageview, e e1)
    {
        c = context.getResources();
        b = imageview;
        d = e1;
        a = AnimationUtils.loadAnimation(context, 0x10a0000);
        a.setAnimationListener(new d(this, (byte)0));
        e = c.getInteger(0x10e0000);
        imageview.setImageBitmap(null);
        imageview.setAnimation(null);
        imageview.setTag(j.E, this);
    }

    protected void a()
    {
        if (b.getTag(j.E) == this)
        {
            b.invalidate();
            if (d != null)
            {
                d.a(b);
                return;
            }
        }
    }

    public void a(Uri uri, Bitmap bitmap)
    {
        if (b.getTag(j.E) != this)
        {
            return;
        }
        b.setImageBitmap(bitmap);
        if (d != null)
        {
            e e1 = d;
            ImageView imageview = b;
            e1.a(bitmap);
        }
        if (uri.equals(b.getTag(j.F)))
        {
            a();
            return;
        } else
        {
            b.setTag(j.F, uri);
            a.reset();
            a.setDuration(e);
            b.startAnimation(a);
            return;
        }
    }

    public final void a(Object obj, Exception exception)
    {
        if (b.getTag(j.E) == this && d != null)
        {
            obj = d;
            exception = b;
            ((e) (obj)).a();
        }
    }

    public volatile void a(Object obj, Object obj1)
    {
        a((Uri)obj, (Bitmap)obj1);
    }
}
