// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.news.ui;

import android.app.Fragment;
import android.app.FragmentManager;
import android.database.Cursor;
import android.os.Parcelable;
import com.weather.commons.ui.CursorPagerAdapter;
import java.util.List;

// Referenced classes of package com.weather.commons.news.ui:
//            NewsDetailFragment

public class NewsFragmentPagerAdapter extends CursorPagerAdapter
{

    private final String adSlotName;
    private final NewsPreviewListAdapter.ArticleSelectionListener articleSelectionListener;

    public NewsFragmentPagerAdapter(FragmentManager fragmentmanager, Class class1, List list, Cursor cursor, String s, NewsPreviewListAdapter.ArticleSelectionListener articleselectionlistener)
    {
        super(fragmentmanager, class1, list, cursor);
        adSlotName = s;
        articleSelectionListener = articleselectionlistener;
    }

    public volatile Fragment getItem(int i)
    {
        return getItem(i);
    }

    public NewsDetailFragment getItem(int i)
    {
        NewsDetailFragment newsdetailfragment = (NewsDetailFragment)super.getItem(i);
        if (newsdetailfragment != null)
        {
            newsdetailfragment.initialize(adSlotName, getCursor(), i, articleSelectionListener);
        }
        return newsdetailfragment;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classloader)
    {
    }

    public Parcelable saveState()
    {
        return null;
    }
}
