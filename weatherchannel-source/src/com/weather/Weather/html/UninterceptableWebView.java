// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.html;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.AdapterView;

public class UninterceptableWebView extends WebView
{

    private static final String TAG = "UninterceptableWebView";
    private ViewParent adapterParent;
    private GestureDetector mGestureDetector;

    public UninterceptableWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    /* block-local class not found */
    class XScrollDetector {}

        mGestureDetector = new GestureDetector(context, new XScrollDetector(null));
        setDrawingCacheEnabled(false);
    }

    private ViewParent getAdapterParent()
    {
        if (adapterParent != null)
        {
            return adapterParent;
        }
        ViewParent viewparent;
        for (viewparent = getParent(); viewparent != null && !(viewparent instanceof AdapterView); viewparent = viewparent.getParent()) { }
        adapterParent = viewparent;
        return adapterParent;
    }

    public void applyAfterMoveFix()
    {
        onScrollChanged(getScrollX(), getScrollY(), getScrollX(), getScrollY());
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return true;
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = mGestureDetector.onTouchEvent(motionevent);
        ViewParent viewparent = getAdapterParent();
        if (flag && viewparent != null)
        {
            viewparent.requestDisallowInterceptTouchEvent(true);
        }
        try
        {
            flag = super.onTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            return true;
        }
        return flag;
    }
}
