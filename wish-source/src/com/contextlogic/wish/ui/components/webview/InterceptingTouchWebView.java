// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.webkit.WebView;

public class InterceptingTouchWebView extends WebView
{

    private boolean allowTouch;

    public InterceptingTouchWebView(Context context)
    {
        this(context, null);
    }

    public InterceptingTouchWebView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x1010085);
    }

    public InterceptingTouchWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, 0x1010085);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 2: default 36
    //                   0 42
    //                   1 42
    //                   2 54;
           goto _L1 _L2 _L2 _L3
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        if (!hasFocus())
        {
            requestFocus();
        }
_L3:
        if (!allowTouch)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void setAllowTouch(boolean flag)
    {
        allowTouch = flag;
    }
}
