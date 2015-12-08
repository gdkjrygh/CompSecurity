// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.view;

import android.view.View;

public class PropertyHeightAnimWrapper
{

    private View mContent;

    public PropertyHeightAnimWrapper(View view)
    {
        mContent = view;
    }

    public int getHeight()
    {
        return mContent.getHeight();
    }

    public void setHeight(int i)
    {
        mContent.getLayoutParams().height = i;
        mContent.requestLayout();
    }
}
