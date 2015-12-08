// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.player.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.google.android.apps.youtube.core.player.overlay:
//            av, br

public class DefaultThumbnailOverlay extends ImageView
    implements av, br
{

    private boolean a;

    public DefaultThumbnailOverlay(Context context)
    {
        super(context);
        setBackgroundColor(0xff000000);
        setVisibility(4);
        setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
    }

    public final View b()
    {
        return this;
    }

    public final PlayerOverlaysLayout.LayoutParams c()
    {
        return new PlayerOverlaysLayout.LayoutParams(-1, -1);
    }

    public final void d()
    {
        a = true;
        int i;
        if (getDrawable() != null && a)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        setVisibility(i);
    }

    public final void e()
    {
        a = false;
        setVisibility(4);
    }

    public final void f()
    {
        setThumbnail(null);
    }

    public void setMinimized(boolean flag)
    {
    }

    public void setThumbnail(Bitmap bitmap)
    {
        int i;
        if (bitmap == null)
        {
            setImageDrawable(null);
        } else
        {
            setImageBitmap(bitmap);
        }
        if (bitmap != null && a)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        setVisibility(i);
    }
}
