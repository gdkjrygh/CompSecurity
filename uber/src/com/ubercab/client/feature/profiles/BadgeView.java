// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.profiles;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;

public class BadgeView extends ImageView
{

    private static final android.graphics.Bitmap.Config a;
    private final Paint b;
    private final Paint c;
    private final Paint d;
    private boolean e;
    private int f;
    private Bitmap g;
    private LightingColorFilter h;
    private Rect i;
    private int j;
    private boolean k;
    private String l;
    private boolean m;
    private Rect n;

    public BadgeView(Context context)
    {
        this(context, null);
    }

    public BadgeView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public BadgeView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = new Paint(1);
        c = new Paint(2);
        d = new Paint(1);
        e = true;
        f = 0;
        h = new LightingColorFilter(0, -1);
        i = new Rect();
        j = -1;
        n = new Rect();
        k = true;
        if (isInEditMode())
        {
            f = 0xff444444;
            setImageResource(0x7f0201c0);
            return;
        } else
        {
            d();
            return;
        }
    }

    private static int a(float f1)
    {
        return (int)(0.4F * f1);
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
        bitmap = Bitmap.createBitmap(1, 1, a);
_L1:
        Canvas canvas = new Canvas(bitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmap;
        try
        {
            bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), a);
        }
        // Misplaced declaration of an exception variable
        catch (Drawable drawable)
        {
            return null;
        }
          goto _L1
    }

    private void a(int i1, int j1)
    {
        if (i1 != 0 && j1 != 0)
        {
            i.set(0, 0, i1, j1);
        }
    }

    private void a(Canvas canvas)
    {
        if (e)
        {
            canvas.drawBitmap(g, n, i, c);
            return;
        } else
        {
            canvas.drawBitmap(g, (canvas.getWidth() - g.getWidth()) / 2, (canvas.getHeight() - g.getHeight()) / 2, null);
            return;
        }
    }

    private void b(int i1)
    {
        f = i1;
        d();
    }

    private String c()
    {
        return l;
    }

    private void d()
    {
        if (!k)
        {
            return;
        }
        Paint paint = b;
        android.graphics.Paint.Style style;
        if (m)
        {
            style = android.graphics.Paint.Style.STROKE;
        } else
        {
            style = android.graphics.Paint.Style.FILL_AND_STROKE;
        }
        paint.setStyle(style);
        b.setStrokeWidth(10F);
        b.setColor(f);
        if (e)
        {
            c.setColor(j);
            c.setColorFilter(h);
        }
        c.setAntiAlias(true);
        d.setTextAlign(android.graphics.Paint.Align.CENTER);
        d.setColor(j);
        if (g != null && e)
        {
            n.set(0, 0, g.getWidth(), g.getHeight());
            a(getWidth(), getHeight());
        }
        invalidate();
    }

    public final int a()
    {
        return f;
    }

    public final void a(int i1)
    {
        e = true;
        j = i1;
        h = new LightingColorFilter(0, i1);
        d();
    }

    public final void a(String s)
    {
        l = s;
        d();
    }

    public final void a(boolean flag)
    {
        m = flag;
        d();
    }

    public final void b()
    {
        e = false;
        setImageResource(0x7f02022f);
    }

    protected void onDraw(Canvas canvas)
    {
        if (g != null || !TextUtils.isEmpty(c()) || m)
        {
            int i1 = canvas.getWidth() / 2;
            int j1 = canvas.getHeight() / 2;
            canvas.drawCircle(i1, j1, (float)i1 - b.getStrokeWidth() / 2.0F, b);
            if (g != null)
            {
                a(canvas);
            }
            if (!TextUtils.isEmpty(c()))
            {
                d.setTextSize(a(canvas.getWidth()));
                j1 = (int)((float)j1 - (d.descent() + d.ascent()) / 2.0F);
                canvas.drawText(c(), i1, j1, d);
                return;
            }
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        if ((k1 != i1 || l1 != j1) && g != null)
        {
            a(i1, j1);
        }
    }

    public void setBackgroundColor(int i1)
    {
        b(i1);
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        super.setImageBitmap(bitmap);
        g = bitmap;
        d();
    }

    public void setImageDrawable(Drawable drawable)
    {
        super.setImageDrawable(drawable);
        g = a(drawable);
        d();
    }

    public void setImageResource(int i1)
    {
        super.setImageResource(i1);
        g = a(getDrawable());
        d();
    }

    public void setImageURI(Uri uri)
    {
        super.setImageURI(uri);
        g = a(getDrawable());
        d();
    }

    static 
    {
        a = android.graphics.Bitmap.Config.ARGB_8888;
    }
}
