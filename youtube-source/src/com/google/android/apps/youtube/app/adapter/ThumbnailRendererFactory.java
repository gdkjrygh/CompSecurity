// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.common.network.h;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.youtube.e;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            k

public abstract class ThumbnailRendererFactory extends k
{

    private final bj a;
    private final h b;
    private final ThumbnailSize c;
    private boolean d;
    private boolean e;
    private boolean f;
    private long g;

    public ThumbnailRendererFactory(Context context, bj bj1, h h1, ThumbnailSize thumbnailsize)
    {
        boolean flag1 = true;
        boolean flag = true;
        super(context, j.fy);
        a = (bj)com.google.android.apps.youtube.common.fromguava.c.a(bj1);
        b = h1;
        c = thumbnailsize;
        d = true;
        e = context.getResources().getBoolean(e.d);
        bj1 = context.getResources().getDisplayMetrics();
        int i;
        if (bj1 != null)
        {
            boolean flag2 = d;
            if (((DisplayMetrics) (bj1)).densityDpi > 160)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            d = i & flag2;
            flag2 = e;
            if (((DisplayMetrics) (bj1)).densityDpi > 160)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            e = i & flag2;
        }
        i = ((ActivityManager)context.getSystemService("activity")).getMemoryClass();
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag2 = e;
            if (i >= 48)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 0;
            }
            e = flag2 & i;
            return;
        }
        boolean flag3 = d;
        if (i >= 24)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        d = flag3 & i;
        e = false;
    }

    protected abstract Uri a(Object obj);

    protected final void a(Matrix matrix, ImageView imageview, BitmapDrawable bitmapdrawable)
    {
        float f1 = 0.0F;
        matrix.reset();
        int i = bitmapdrawable.getIntrinsicWidth();
        int l = bitmapdrawable.getIntrinsicHeight();
        int i1 = imageview.getWidth() - imageview.getPaddingLeft() - imageview.getPaddingRight();
        int j1 = imageview.getHeight() - imageview.getPaddingTop() - imageview.getPaddingBottom();
        float f2;
        float f3;
        if (i * j1 > i1 * l)
        {
            f3 = (float)j1 / (float)l;
            f2 = ((float)i1 - (float)i * f3) * 0.5F;
        } else
        {
            f3 = (float)i1 / (float)i;
            f1 = j1;
            float f4 = l;
            f2 = 0.0F;
            f1 = (f1 - f4 * f3) * 0.35F;
        }
        matrix.setScale(f3, f3);
        matrix.postTranslate((int)(f2 + 0.5F), (int)(f1 + 0.5F));
    }

    protected void a(Uri uri, b b1)
    {
        a.a(uri, b1);
    }

    protected void a(Object obj, View view, b b1)
    {
        Uri uri1 = d(obj);
        view = c(obj);
        Uri uri = b(obj);
        obj = a(obj);
        if (uri1 != null)
        {
            obj = uri1;
        }
        if (uri != null && e)
        {
            view = uri;
        }
        if (view == null) goto _L2; else goto _L1
_L1:
        if (c != ThumbnailSize.LARGE) goto _L4; else goto _L3
_L3:
        if (view != null)
        {
            a(((Uri) (view)), b1);
        }
        return;
_L4:
        if (c == null)
        {
            if (System.currentTimeMillis() - g > 60000L)
            {
                f = b.h();
                g = System.currentTimeMillis();
            }
            if (f && d)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
_L2:
        view = ((View) (obj));
        if (true) goto _L3; else goto _L5
_L5:
    }

    protected abstract Uri b(Object obj);

    protected abstract Uri c(Object obj);

    protected abstract Uri d(Object obj);

    private class ThumbnailSize extends Enum
    {

        private static final ThumbnailSize $VALUES[];
        public static final ThumbnailSize LARGE;
        public static final ThumbnailSize SMALL;

        public static ThumbnailSize valueOf(String s)
        {
            return (ThumbnailSize)Enum.valueOf(com/google/android/apps/youtube/app/adapter/ThumbnailRendererFactory$ThumbnailSize, s);
        }

        public static ThumbnailSize[] values()
        {
            return (ThumbnailSize[])$VALUES.clone();
        }

        static 
        {
            SMALL = new ThumbnailSize("SMALL", 0);
            LARGE = new ThumbnailSize("LARGE", 1);
            $VALUES = (new ThumbnailSize[] {
                SMALL, LARGE
            });
        }

        private ThumbnailSize(String s, int i)
        {
            super(s, i);
        }
    }

}
