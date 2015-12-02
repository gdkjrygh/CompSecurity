// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import android.text.style.LineHeightSpan;
import java.lang.ref.WeakReference;

public class dth extends ImageSpan
    implements LineHeightSpan
{

    private int a;
    private boolean b;
    private int c;
    private WeakReference d;

    public dth(Drawable drawable)
    {
        super(drawable);
        a = drawable.getIntrinsicHeight();
    }

    private Drawable a()
    {
        Object obj = d;
        Drawable drawable = null;
        if (obj != null)
        {
            drawable = (Drawable)((WeakReference) (obj)).get();
        }
        obj = drawable;
        if (drawable == null)
        {
            obj = getDrawable();
            d = new WeakReference(obj);
        }
        return ((Drawable) (obj));
    }

    public final void a(int i)
    {
        c = i;
    }

    public final void b()
    {
        b = true;
    }

    public void chooseHeight(CharSequence charsequence, int i, int j, int k, int l, android.graphics.Paint.FontMetricsInt fontmetricsint)
    {
        if (b)
        {
            fontmetricsint.ascent = -a;
        }
    }

    public void draw(Canvas canvas, CharSequence charsequence, int i, int j, float f, int k, int l, 
            int i1, Paint paint)
    {
        charsequence = a();
        canvas.save();
        i = charsequence.getIntrinsicHeight() / 2;
        j = paint.getFontMetricsInt().top;
        k = paint.getFontMetricsInt().bottom;
        canvas.translate(f, i1 - charsequence.getBounds().bottom - ((k - j) / 2 - i));
        charsequence.draw(canvas);
        canvas.restore();
    }

    public int getSize(Paint paint, CharSequence charsequence, int i, int j, android.graphics.Paint.FontMetricsInt fontmetricsint)
    {
        return a().getBounds().right + c;
    }
}
