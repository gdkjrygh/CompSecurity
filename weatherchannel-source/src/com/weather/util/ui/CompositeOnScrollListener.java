// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.ui;

import android.widget.AbsListView;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;

public class CompositeOnScrollListener
    implements android.widget.AbsListView.OnScrollListener
{

    private final Collection listeners;

    public CompositeOnScrollListener(Iterable iterable)
    {
        listeners = ImmutableList.copyOf(iterable);
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((android.widget.AbsListView.OnScrollListener)iterator.next()).onScroll(abslistview, i, j, k)) { }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((android.widget.AbsListView.OnScrollListener)iterator.next()).onScrollStateChanged(abslistview, i)) { }
    }
}
