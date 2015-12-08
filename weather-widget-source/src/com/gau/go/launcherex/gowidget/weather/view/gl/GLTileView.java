// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view.gl;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.go.gl.graphics.GLCanvas;
import com.go.gl.graphics.GLDrawable;
import com.go.gl.view.GLView;

public class GLTileView extends GLView
{

    private Context a;
    private GLDrawable b;
    private Drawable c;

    public GLTileView(Context context, BitmapDrawable bitmapdrawable)
    {
        super(context);
        a(null, bitmapdrawable);
    }

    public GLTileView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(attributeset, null);
    }

    public GLTileView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(attributeset, null);
    }

    private void a(AttributeSet attributeset, BitmapDrawable bitmapdrawable)
    {
        a = getContext();
        c = bitmapdrawable;
        if (attributeset != null)
        {
            attributeset = a.obtainStyledAttributes(attributeset, com.gau.go.launcherex.gowidget.weatherwidget.R.styleable.TileView);
            c = attributeset.getDrawable(0);
            attributeset.recycle();
        }
    }

    public void cleanup()
    {
        super.cleanup();
        if (b != null)
        {
            releaseDrawableReference(b);
            b.clear();
            b.setCallback(null);
            b = null;
        }
        if (c != null)
        {
            c.setCallback(null);
            c = null;
        }
    }

    protected void onDraw(GLCanvas glcanvas)
    {
        if (b != null)
        {
            b.draw(glcanvas);
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        Object obj;
label0:
        {
            super.onLayout(flag, i, j, k, l);
            if (flag || b == null)
            {
                k -= i;
                l -= j;
                try
                {
                    obj = Bitmap.createBitmap(k, l, android.graphics.Bitmap.Config.ARGB_8888);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    obj = null;
                }
                if (obj != null)
                {
                    break label0;
                }
            }
            return;
        }
        Canvas canvas = new Canvas(((Bitmap) (obj)));
        float f = c.getIntrinsicWidth();
        float f1 = c.getIntrinsicHeight();
        c.setBounds(0, 0, (int)f, (int)f1);
        int i1 = Math.round((float)k / f + 0.5F);
        int j1 = Math.round((float)l / f1 + 0.5F);
        for (i = 0; i < j1; i++)
        {
            canvas.save();
            canvas.translate(-f, (float)i * f1);
            for (j = 0; j < i1; j++)
            {
                canvas.translate(f, 0.0F);
                c.draw(canvas);
            }

            canvas.restore();
        }

        if (b != null)
        {
            b.clear();
        }
        b = GLDrawable.getDrawable(new BitmapDrawable(getResources(), ((Bitmap) (obj))));
        b.setBounds(0, 0, k, l);
    }

    public void setTileBitmapDrawable(BitmapDrawable bitmapdrawable)
    {
        if (bitmapdrawable != null)
        {
            c = bitmapdrawable;
            b = null;
            requestLayout();
        }
    }
}
