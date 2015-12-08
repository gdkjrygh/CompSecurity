// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.views;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

// Referenced classes of package com.jiubang.playsdk.views:
//            j

public class TouchMaskFrameLayout extends FrameLayout
{

    private j a;

    public TouchMaskFrameLayout(Context context)
    {
        super(context);
        a = new j(this);
    }

    public TouchMaskFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new j(this);
        if (attributeset != null)
        {
            a.a(context, attributeset);
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (a != null)
        {
            a.a(canvas);
        }
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
    }

    public void refreshDrawableState()
    {
        super.refreshDrawableState();
        if (a != null)
        {
            a.a();
        }
    }
}
