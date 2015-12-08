// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.os.Handler;
import android.widget.AbsListView;

public class DelayedInitialStateNotifier
    implements android.widget.AbsListView.OnScrollListener
{

    private final Handler handler;
    private final AbsListView listView;
    private final android.widget.AbsListView.OnScrollListener listenerToNotify;
    private final Runnable updateTask = new _cls1();

    public DelayedInitialStateNotifier(Handler handler1, AbsListView abslistview, android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        handler = handler1;
        listView = abslistview;
        listenerToNotify = onscrolllistener;
    }

    public void cancel()
    {
        handler.removeCallbacks(updateTask);
    }

    public void notifyLater(long l)
    {
        handler.postDelayed(updateTask, l);
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        cancel();
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        cancel();
    }



    /* member class not found */
    class _cls1 {}

}
