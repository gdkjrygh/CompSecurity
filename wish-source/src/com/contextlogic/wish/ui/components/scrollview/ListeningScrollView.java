// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.scrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

public class ListeningScrollView extends ScrollView
{
    public static interface ScrollViewListener
    {

        public abstract void onScrollChanged(int i, int j);
    }


    private ScrollViewListener scrollViewListener;

    public ListeningScrollView(Context context)
    {
        super(context);
        scrollViewListener = null;
    }

    public ListeningScrollView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        scrollViewListener = null;
    }

    public ListeningScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        scrollViewListener = null;
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        if (scrollViewListener != null)
        {
            scrollViewListener.onScrollChanged(j, j - l);
        }
    }

    public void setScrollViewListener(ScrollViewListener scrollviewlistener)
    {
        scrollViewListener = scrollviewlistener;
    }
}
