// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import android.content.Context;
import android.util.AttributeSet;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.widget.GLImageView;

public class ProgressBar extends GLImageView
{

    private boolean a;
    private float b;
    private int c;
    private int d;

    public ProgressBar(Context context)
    {
        super(context);
        a = false;
        b = 0.0F;
    }

    public ProgressBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = false;
        b = 0.0F;
    }

    protected void dispatchDraw(GLCanvas glcanvas)
    {
        super.dispatchDraw(glcanvas);
    }

    public void end()
    {
        a = false;
        b = 0.0F;
        invalidate();
    }

    protected void onDraw(GLCanvas glcanvas)
    {
        int i = glcanvas.save();
        glcanvas.translate(c, d, 0.0F);
        glcanvas.rotate(b);
        glcanvas.translate(-c, -d, 0.0F);
        super.onDraw(glcanvas);
        glcanvas.restoreToCount(i);
        if (a)
        {
            b = b + 5F;
            invalidate();
        }
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        c = (mWidth - mPaddingLeft - mPaddingRight) / 2 + mPaddingLeft;
        d = -(mHeight - mPaddingTop - mPaddingBottom) / 2 - mPaddingTop;
    }

    public void start()
    {
        a = true;
        invalidate();
    }
}
