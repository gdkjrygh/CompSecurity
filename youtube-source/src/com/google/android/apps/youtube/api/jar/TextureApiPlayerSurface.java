// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.jar;

import android.content.Context;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.google.android.apps.youtube.api.jar.a.ey;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.api.jar:
//            ApiVideoView, h, ah

public final class TextureApiPlayerSurface extends ApiVideoView
    implements ey, h
{

    private final ah a;
    private TextureView b;

    public TextureApiPlayerSurface(Context context, ah ah1)
    {
        super(context);
        a = (ah)com.google.android.apps.youtube.common.fromguava.c.a(ah1);
    }

    public final View a()
    {
        return this;
    }

    public final void a(Surface surface)
    {
        a.a();
    }

    public final void a(TextureView textureview)
    {
        b = textureview;
        addView(textureview);
    }

    public final void b()
    {
        if (b != null)
        {
            removeView(b);
            addView(b);
        }
    }

    public final void c()
    {
    }

    public final void d()
    {
    }

    public final void e()
    {
        if (b != null)
        {
            removeView(b);
        }
        b = null;
    }

    public final void f()
    {
        a.b();
    }

    protected final void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated())
        {
            a.c();
        }
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (b != null)
        {
            b.layout(0, 0, b.getMeasuredWidth(), b.getMeasuredHeight());
        }
    }

    protected final void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        i = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0x40000000);
        j = android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0x40000000);
        if (b != null)
        {
            b.measure(i, j);
        }
    }
}
