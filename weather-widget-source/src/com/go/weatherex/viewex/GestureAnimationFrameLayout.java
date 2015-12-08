// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.viewex;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

// Referenced classes of package com.go.weatherex.viewex:
//            d, g

public class GestureAnimationFrameLayout extends FrameLayout
    implements d
{

    private g a;
    private boolean b;

    public GestureAnimationFrameLayout(Context context)
    {
        super(context);
        b = false;
    }

    public GestureAnimationFrameLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
    }

    public GestureAnimationFrameLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = false;
    }

    public void a(g g1)
    {
        a = g1;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (b)
        {
            super.dispatchDraw(canvas);
            return;
        }
        if (a != null && a.a())
        {
            int i = canvas.save();
            if (a.a(this, canvas))
            {
                super.dispatchDraw(canvas);
            }
            canvas.restoreToCount(i);
            return;
        } else
        {
            super.dispatchDraw(canvas);
            return;
        }
    }

    public void draw(Canvas canvas)
    {
        b = true;
        if (a != null && a.a())
        {
            int i = canvas.save();
            if (a.a(this, canvas))
            {
                super.draw(canvas);
            }
            canvas.restoreToCount(i);
        } else
        {
            super.draw(canvas);
        }
        b = false;
    }
}
