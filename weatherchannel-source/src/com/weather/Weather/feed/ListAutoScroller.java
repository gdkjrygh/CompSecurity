// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.os.Handler;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.common.base.Preconditions;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListAutoScroller
{
    public static interface AutoScrollListener
    {

        public abstract void onAutoScrollBegin(ListAutoScroller listautoscroller, AbsListView abslistview);

        public abstract void onAutoScrollEnd(ListAutoScroller listautoscroller, AbsListView abslistview);
    }


    private static final int AUTOSCROLL_TIMEOUT_MS = 750;
    private static final int SCROLL_DURATION_IN_MS = 500;
    private static final String TAG = "Autoscroller";
    private static final int UNBOUNDED = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
    private final Handler handler = new Handler();
    private boolean isAutoScrolling;
    private final ListView listView;
    private final Collection listeners = new ArrayList();
    private final Runnable scrollDoneRunnable = new _cls1();

    public ListAutoScroller(ListView listview)
    {
        listView = (ListView)Preconditions.checkNotNull(listview);
    }

    private static boolean listIsAtTop(AbsListView abslistview)
    {
        while (abslistview.getChildCount() == 0 || abslistview.getChildAt(0).getTop() == 0) 
        {
            return true;
        }
        return false;
    }

    private void notifyScrollBegin()
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AutoScrollListener)iterator.next()).onAutoScrollBegin(this, listView)) { }
    }

    private void notifyScrollEnd()
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((AutoScrollListener)iterator.next()).onAutoScrollEnd(this, listView)) { }
    }

    private void smoothScrollFromTop(int i, int j)
    {
        int l = 0;
        ListAdapter listadapter = listView.getAdapter();
        int k1 = android.view.View.MeasureSpec.makeMeasureSpec(listView.getWidth(), 0x40000000);
        View view = listView.getChildAt(0);
        int k;
        boolean flag;
        int j1;
        if (view != null)
        {
            l = view.getTop() - listView.getPaddingTop();
        }
        flag = false;
        k = 0;
        j1 = ((flag) ? 1 : 0);
        if (listadapter != null)
        {
            j1 = ((flag) ? 1 : 0);
            if (!listadapter.isEmpty())
            {
                int i1 = 0;
                do
                {
                    j1 = k;
                    if (i1 >= i)
                    {
                        break;
                    }
                    view = listadapter.getView(i1, null, listView);
                    j1 = k;
                    if (view != null)
                    {
                        view.measure(k1, UNBOUNDED);
                        j1 = k + view.getMeasuredHeight();
                    }
                    i1++;
                    k = j1;
                } while (true);
            }
        }
        listView.smoothScrollBy(j1 - (j - l), 500);
    }

    public void addListener(AutoScrollListener autoscrolllistener)
    {
        listeners.add(Preconditions.checkNotNull(autoscrolllistener));
    }

    public void setSelectionFromTop(int i, int j)
    {
        LogUtil.d("Autoscroller", LoggingMetaTags.TWC_UI, "setSelectionFromTop position=%s, offset=%s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        handler.removeCallbacks(scrollDoneRunnable);
        isAutoScrolling = false;
        listView.setSelectionFromTop(i, j);
        notifyScrollEnd();
    }

    public void smoothScrollToPosition(int i)
    {
        handler.removeCallbacks(scrollDoneRunnable);
        isAutoScrolling = true;
        listView.smoothScrollToPosition(i);
        handler.postDelayed(scrollDoneRunnable, 750L);
        LogUtil.d("Autoscroller", LoggingMetaTags.TWC_UI, "smoothScrollToPosition isAutoScrolling=%s, position=%s", new Object[] {
            Boolean.valueOf(isAutoScrolling), Integer.valueOf(i)
        });
        notifyScrollBegin();
    }

    public void smoothScrollToPositionFromTop(int i, int j)
    {
        handler.removeCallbacks(scrollDoneRunnable);
        isAutoScrolling = true;
        smoothScrollFromTop(i, j);
        handler.postDelayed(scrollDoneRunnable, 750L);
        LogUtil.d("Autoscroller", LoggingMetaTags.TWC_UI, "smoothScrollToPositionFromTop isAutoScrolling=%s, position=%s, offset=%s", new Object[] {
            Boolean.valueOf(isAutoScrolling), Integer.valueOf(i), Integer.valueOf(j)
        });
        notifyScrollBegin();
    }

    public void smoothScrollToTop()
    {
        if (!listIsAtTop(listView))
        {
            smoothScrollToPosition(0);
        }
    }




/*
    static boolean access$002(ListAutoScroller listautoscroller, boolean flag)
    {
        listautoscroller.isAutoScrolling = flag;
        return flag;
    }

*/


    /* member class not found */
    class _cls1 {}

}
