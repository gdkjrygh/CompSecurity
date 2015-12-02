// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import hot;
import hox;

public class CircleImageView extends ImageView
{

    private static final android.widget.ImageView.ScaleType a;
    private static final android.graphics.Bitmap.Config b;
    private static final int c;
    private final RectF d;
    private final RectF e;
    private final Matrix f;
    private final Paint g;
    private final Paint h;
    private int i;
    private int j;
    private Bitmap k;
    private BitmapShader l;
    private int m;
    private int n;
    private float o;
    private float p;
    private boolean q;
    private boolean r;

    public CircleImageView(Context context)
    {
        super(context);
        d = new RectF();
        e = new RectF();
        f = new Matrix();
        g = new Paint();
        h = new Paint();
        i = c;
        j = 1;
        a();
    }

    public CircleImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        d = new RectF();
        e = new RectF();
        f = new Matrix();
        g = new Paint();
        h = new Paint();
        i = c;
        j = 1;
        context = context.obtainStyledAttributes(attributeset, hox.CircleImageView, i1, 0);
        i1 = getResources().getColor(c);
        i = context.getColor(hox.CircleImageView_circleImageBorderColor, i1);
        j = context.getDimensionPixelSize(hox.CircleImageView_circleImageBorderWidth, 1);
        context.recycle();
        a();
    }

    private static Bitmap a(Drawable drawable)
    {
        if (drawable == null)
        {
            return null;
        }
        if (drawable instanceof BitmapDrawable)
        {
            return ((BitmapDrawable)drawable).getBitmap();
        }
        Bitmap bitmap;
        if (!(drawable instanceof ColorDrawable))
        {
            break MISSING_BLOCK_LABEL_67;
        }
        bitmap = Bitmap.createBitmap(1, 1, b);
_L1:
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
        try
        {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), b);
        }
        // Misplaced declaration of an exception variable
        catch (Drawable drawable)
        {
            return null;
        }
          goto _L1
    }

    private void a()
    {
        super.setScaleType(a);
        q = true;
        if (r)
        {
            b();
            r = false;
        }
    }

    private void b()
    {
        if (!q)
        {
            r = true;
        } else
        if (k != null)
        {
            l = new BitmapShader(k, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
            g.setAntiAlias(true);
            g.setShader(l);
            h.setStyle(android.graphics.Paint.Style.STROKE);
            h.setAntiAlias(true);
            h.setColor(i);
            h.setStrokeWidth(j);
            n = k.getHeight();
            m = k.getWidth();
            e.set(0.0F, 0.0F, getWidth(), getHeight());
            p = Math.min((e.height() - (float)j) / 2.0F, (e.width() - (float)j) / 2.0F);
            d.set(j, j, e.width() - (float)j, e.height() - (float)j);
            o = Math.min(d.height() / 2.0F, d.width() / 2.0F);
            c();
            invalidate();
            return;
        }
    }

    private void c()
    {
        float f1 = 0.0F;
        f.set(null);
        float f2;
        float f3;
        if ((float)m * d.height() > d.width() * (float)n)
        {
            f3 = d.height() / (float)n;
            f2 = (d.width() - (float)m * f3) * 0.5F;
        } else
        {
            f3 = d.width() / (float)m;
            f1 = d.height();
            float f4 = n;
            f2 = 0.0F;
            f1 = (f1 - f4 * f3) * 0.5F;
        }
        f.setScale(f3, f3);
        f.postTranslate((int)(f2 + 0.5F) + j, (int)(f1 + 0.5F) + j);
        l.setLocalMatrix(f);
    }

    public android.widget.ImageView.ScaleType getScaleType()
    {
        return a;
    }

    protected void onDraw(Canvas canvas)
    {
        if (getDrawable() != null)
        {
            canvas.drawCircle(getWidth() / 2, getHeight() / 2, o, g);
            if (j != 0)
            {
                canvas.drawCircle(getWidth() / 2, getHeight() / 2, p, h);
                return;
            }
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        b();
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        super.setImageBitmap(bitmap);
        k = bitmap;
        b();
    }

    public void setImageDrawable(Drawable drawable)
    {
        super.setImageDrawable(drawable);
        k = a(drawable);
        b();
    }

    public void setImageResource(int i1)
    {
        super.setImageResource(i1);
        k = a(getDrawable());
        b();
    }

    public void setImageURI(Uri uri)
    {
        super.setImageURI(uri);
        k = a(getDrawable());
        b();
    }

    public void setScaleType(android.widget.ImageView.ScaleType scaletype)
    {
        if (scaletype != a)
        {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", new Object[] {
                scaletype
            }));
        } else
        {
            return;
        }
    }

    static 
    {
        a = android.widget.ImageView.ScaleType.CENTER_CROP;
        b = android.graphics.Bitmap.Config.ARGB_8888;
        c = hot.ub__uber_white_80;
    }
}
