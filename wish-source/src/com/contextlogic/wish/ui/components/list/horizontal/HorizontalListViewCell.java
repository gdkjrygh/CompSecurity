// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.list.horizontal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public abstract class HorizontalListViewCell extends LinearLayout
{

    private String identifier;
    private int index;

    public HorizontalListViewCell(Context context)
    {
        this(context, null);
    }

    public HorizontalListViewCell(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public int getIndex()
    {
        return index;
    }

    public abstract void init();

    public abstract void prepareForRecycle();

    public void releaseImages()
    {
    }

    public void restoreImages()
    {
    }

    public void setIdentifier(String s)
    {
        identifier = s;
    }

    public void setIndex(int i)
    {
        index = i;
    }
}
