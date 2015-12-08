// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.grid;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public abstract class StaggeredGridCellView
{

    private ViewGroup contentView;
    private String identifier;
    private int index;

    public StaggeredGridCellView(Context context)
    {
        contentView = createContentView(context);
        init();
    }

    protected ViewGroup createContentView(Context context)
    {
        return new FrameLayout(context);
    }

    public ViewGroup getContentView()
    {
        return contentView;
    }

    public Context getContext()
    {
        return getContentView().getContext();
    }

    public String getIdentifier()
    {
        return identifier;
    }

    public int getIndex()
    {
        return index;
    }

    public Resources getResources()
    {
        return getContentView().getResources();
    }

    public abstract void init();

    public void measure(int i, int j)
    {
        getContentView().measure(i, j);
    }

    public void postDelayed(Runnable runnable, long l)
    {
        getContentView().postDelayed(runnable, l);
    }

    public abstract void prepareForRecycle();

    public void releaseImages()
    {
    }

    public void removeCallbacks(Runnable runnable)
    {
        getContentView().removeCallbacks(runnable);
    }

    public void restoreImages()
    {
    }

    public void setEditModeEnabled(boolean flag)
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
