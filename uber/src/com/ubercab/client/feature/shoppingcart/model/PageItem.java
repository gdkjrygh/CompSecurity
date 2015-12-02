// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;


// Referenced classes of package com.ubercab.client.feature.shoppingcart.model:
//            Item, Page, TimeWindow

public class PageItem
    implements Comparable
{

    private Item mItem;
    private Page mPage;
    private int mPriority;
    private TimeWindow mTimeWindow;

    public PageItem(Item item, int i)
    {
        mItem = item;
        mPage = null;
        mPriority = i;
        mTimeWindow = item.getTimeWindow();
    }

    public PageItem(Page page, int i)
    {
        mItem = null;
        mPage = page;
        mPriority = i;
        mTimeWindow = page.getTimeWindow();
    }

    private boolean isChildWindowActive(TimeWindow timewindow)
    {
        return isPage() && getPage().isChildActiveDuringTime(timewindow);
    }

    private boolean isWindowOpenOrMatching(TimeWindow timewindow)
    {
        return mTimeWindow != null && (timewindow.equals(mTimeWindow) || TimeWindow.TIME_WINDOW_ALWAYS_OPEN.equals(mTimeWindow) || mTimeWindow.isOpen());
    }

    public int compareTo(PageItem pageitem)
    {
        int i = mPriority - pageitem.getPriority();
        if (i != 0)
        {
            return i;
        }
        if (mItem != null && pageitem.getItem() == null)
        {
            return 1;
        }
        return mItem != null || pageitem.getItem() == null ? 0 : -1;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((PageItem)obj);
    }

    public Item getItem()
    {
        return mItem;
    }

    public Page getPage()
    {
        return mPage;
    }

    public int getPriority()
    {
        return mPriority;
    }

    public TimeWindow getTimeWindow()
    {
        return mTimeWindow;
    }

    public boolean isItem()
    {
        return mItem != null;
    }

    public boolean isPage()
    {
        return mPage != null;
    }

    public boolean isPageItemVisible(TimeWindow timewindow)
    {
        return isWindowOpenOrMatching(timewindow) || isChildWindowActive(timewindow);
    }
}
