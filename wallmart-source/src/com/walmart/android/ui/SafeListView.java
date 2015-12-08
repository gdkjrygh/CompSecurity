// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ListView;

public class SafeListView extends ListView
{

    public SafeListView(Context context)
    {
        super(context);
    }

    public SafeListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public SafeListView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected void dispatchDraw(Canvas canvas)
    {
        try
        {
            super.dispatchDraw(canvas);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Canvas canvas)
        {
            Log.w("SafeListView", "ListView's exception", canvas);
        }
    }

    protected void layoutChildren()
    {
        try
        {
            super.layoutChildren();
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            Log.w("SafeListView", "ListView's exception", illegalstateexception);
        }
    }

    protected void onDetachedFromWindow()
    {
        try
        {
            super.onDetachedFromWindow();
            return;
        }
        catch (Exception exception)
        {
            Log.w("SafeListView", "ListView's exception", exception);
        }
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        try
        {
            super.onFocusChanged(flag, i, rect);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Rect rect)
        {
            Log.w("SafeListView", "ListView's exception", rect);
        }
    }
}
