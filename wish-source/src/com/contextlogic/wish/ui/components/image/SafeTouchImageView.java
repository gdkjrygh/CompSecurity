// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.ortiz.touch.TouchImageView;

public class SafeTouchImageView extends TouchImageView
{

    private boolean suppressRequestLayout;

    public SafeTouchImageView(Context context)
    {
        super(context);
    }

    public SafeTouchImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public SafeTouchImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void onDraw(Canvas canvas)
    {
        if (getDrawable() != null && (getDrawable() instanceof BitmapDrawable))
        {
            BitmapDrawable bitmapdrawable = (BitmapDrawable)getDrawable();
            if (bitmapdrawable.getBitmap() != null && bitmapdrawable.getBitmap().isRecycled())
            {
                setImageBitmap(null);
            }
        }
        super.onDraw(canvas);
    }

    public void requestLayout()
    {
        if (!suppressRequestLayout)
        {
            super.requestLayout();
        }
    }

    public void setImageDrawable(Drawable drawable)
    {
        suppressRequestLayout = true;
        super.setImageDrawable(drawable);
        suppressRequestLayout = false;
    }
}
