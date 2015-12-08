// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.taxonomy;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.walmart.android.analytics.GoogleAnalytics;
import com.walmart.android.utils.ViewUtil;

// Referenced classes of package com.walmart.android.app.shop.taxonomy:
//            BreadcrumbTaxonomyPresenterBase

public class BreadcrumbTaxonomyPresenter extends BreadcrumbTaxonomyPresenterBase
{

    private ViewGroup mRootView;
    private String mTitle;

    public BreadcrumbTaxonomyPresenter(Activity activity, int i)
    {
        super(activity, i);
    }

    private void trackPageView()
    {
        GoogleAnalytics.trackPageView("Shop");
    }

    public String getTitleText()
    {
        return mTitle;
    }

    public View getView()
    {
        return mRootView;
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        if (mRootView == null)
        {
            mRootView = (ViewGroup)ViewUtil.inflate(viewgroup.getContext(), 0x7f0401b3, viewgroup);
            viewgroup = (ListView)ViewUtil.findViewById(mRootView, 0x7f1005cb);
            View view = mRootView.findViewById(0x7f100545);
            init(mRootView, viewgroup, view);
        }
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        reloadData();
    }

    public void setTitleText(String s)
    {
        mTitle = s;
    }

    protected boolean shouldVisitLeafItems()
    {
        return false;
    }
}
