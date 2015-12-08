// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.style.ImageSpan;

public class VerticalCenteredImageSpan extends ImageSpan
{

    private final Rect mCapitalAsciiLetterBounds;
    private int mLineSpacingExtra;

    public VerticalCenteredImageSpan(Context context, int i)
    {
        super(context, i);
        mLineSpacingExtra = 0;
        mCapitalAsciiLetterBounds = new Rect();
    }

    public VerticalCenteredImageSpan(Context context, Bitmap bitmap)
    {
        super(context, bitmap);
        mLineSpacingExtra = 0;
        mCapitalAsciiLetterBounds = new Rect();
    }

    public VerticalCenteredImageSpan(Context context, Uri uri)
    {
        super(context, uri);
        mLineSpacingExtra = 0;
        mCapitalAsciiLetterBounds = new Rect();
    }

    public VerticalCenteredImageSpan(Drawable drawable)
    {
        super(drawable);
        mLineSpacingExtra = 0;
        mCapitalAsciiLetterBounds = new Rect();
    }

    public VerticalCenteredImageSpan(Drawable drawable, String s)
    {
        super(drawable, s);
        mLineSpacingExtra = 0;
        mCapitalAsciiLetterBounds = new Rect();
    }

    public void draw(Canvas canvas, CharSequence charsequence, int i, int j, float f, int k, int l, 
            int i1, Paint paint)
    {
        charsequence = getDrawable();
        canvas.save();
        paint.getTextBounds("H", 0, 1, mCapitalAsciiLetterBounds);
        canvas.translate(f, ((i1 - charsequence.getBounds().bottom - paint.getFontMetricsInt().descent - mCapitalAsciiLetterBounds.height() / 2) + charsequence.getBounds().bottom / 2) - mLineSpacingExtra);
        charsequence.draw(canvas);
        canvas.restore();
    }

    public void setLineSpacingExtra(int i)
    {
        mLineSpacingExtra = i;
    }
}
