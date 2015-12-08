// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;

import android.app.MediaRouteButton;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.youtube.r;

public class CustomMediaRouteButton extends MediaRouteButton
{

    private Drawable a;

    public CustomMediaRouteButton(Context context)
    {
        super(context);
    }

    public CustomMediaRouteButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, r.m);
        a(context.getDrawable(0));
        context.recycle();
    }

    public CustomMediaRouteButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, r.m, i, 0);
        a(context.getDrawable(0));
        context.recycle();
    }

    private void a(Drawable drawable)
    {
        if (a != null)
        {
            a.setCallback(null);
            unscheduleDrawable(a);
        }
        a = drawable;
        if (drawable != null)
        {
            drawable.setCallback(this);
            drawable.setState(getDrawableState());
            boolean flag;
            if (getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            drawable.setVisible(flag, false);
        }
        refreshDrawableState();
    }

    protected void drawableStateChanged()
    {
        super.drawableStateChanged();
        if (a != null)
        {
            int ai[] = getDrawableState();
            a.setState(ai);
            invalidate();
        }
    }

    public void jumpDrawablesToCurrentState()
    {
        super.jumpDrawablesToCurrentState();
        if (a != null)
        {
            a.jumpToCurrentState();
        }
    }

    protected void onDraw(Canvas canvas)
    {
        if (a == null)
        {
            return;
        } else
        {
            int j1 = getPaddingLeft();
            int k1 = getWidth();
            int l1 = getPaddingRight();
            int k = getPaddingTop();
            int l = getHeight();
            int i1 = getPaddingBottom();
            int i = a.getIntrinsicWidth();
            int j = a.getIntrinsicHeight();
            j1 += (k1 - l1 - j1 - i) / 2;
            k = (l - i1 - k - j) / 2 + k;
            a.setBounds(j1, k, j1 + i, k + j);
            a.draw(canvas);
            return;
        }
    }

    public void setVisibility(int i)
    {
        super.setVisibility(i);
        if (a != null)
        {
            Drawable drawable = a;
            boolean flag;
            if (getVisibility() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            drawable.setVisible(flag, false);
        }
    }

    protected boolean verifyDrawable(Drawable drawable)
    {
        return super.verifyDrawable(drawable) || drawable == a;
    }
}
