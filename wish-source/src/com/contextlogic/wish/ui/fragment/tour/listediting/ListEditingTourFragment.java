// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.tour.listediting;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.View;
import com.contextlogic.wish.cache.RuntimeStateStore;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.navigation.NavigationBarButtonCallback;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.profile.ProfileFragment;
import com.contextlogic.wish.user.LoggedInUser;
import com.viewpagerindicator.CirclePageIndicator;

// Referenced classes of package com.contextlogic.wish.ui.fragment.tour.listediting:
//            ListEditingTourAdapter

public class ListEditingTourFragment extends BaseContentFragment
{

    private ListEditingTourAdapter adapter;
    private CirclePageIndicator indicator;
    private ViewPager pager;

    public ListEditingTourFragment()
    {
    }

    private void refreshTitle()
    {
        if (pager.getCurrentItem() <= 0)
        {
            getNavigationBar().setTitle(getString(0x7f060295));
        } else
        {
            getNavigationBar().setTitle(String.format(getString(0x7f060190), new Object[] {
                Integer.valueOf(Math.min(5, pager.getCurrentItem() + 1))
            }));
        }
        if (pager.getCurrentItem() >= 3)
        {
            getNavigationBar().setMenuItem(getResources().getString(0x7f060130), 0, new NavigationBarButtonCallback() {

                final ListEditingTourFragment this$0;

                public void onMenuItemClicked()
                {
                    trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Done);
                    handleNext();
                }

            
            {
                this$0 = ListEditingTourFragment.this;
                super();
            }
            });
            return;
        } else
        {
            getNavigationBar().setMenuItem(null, 0x7f02010c, new NavigationBarButtonCallback() {

                final ListEditingTourFragment this$0;

                public void onMenuItemClicked()
                {
                    trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Next);
                    handleNext();
                }

            
            {
                this$0 = ListEditingTourFragment.this;
                super();
            }
            });
            return;
        }
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.ListEditingTour;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f030067;
    }

    public void handleModalBack()
    {
        onBackPressed();
    }

    public void handleNext()
    {
        if (pager.getCurrentItem() >= 3)
        {
            dismissModal();
            return;
        } else
        {
            pager.setCurrentItem(pager.getCurrentItem() + 1, true);
            return;
        }
    }

    protected void initializeUi(View view)
    {
        adapter = new ListEditingTourAdapter(getActivity(), this);
        pager = (ViewPager)view.findViewById(0x7f0d021f);
        pager.setAdapter(adapter);
        indicator = (CirclePageIndicator)view.findViewById(0x7f0d0220);
        indicator.setForceCount(4);
        indicator.setViewPager(pager);
        indicator.setOnPageChangeListener(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final ListEditingTourFragment this$0;

            public void onPageScrollStateChanged(int i)
            {
            }

            public void onPageScrolled(int i, float f, int j)
            {
            }

            public void onPageSelected(int i)
            {
                if (i >= 4)
                {
                    dismissModal();
                    return;
                } else
                {
                    refreshTitle();
                    return;
                }
            }

            
            {
                this$0 = ListEditingTourFragment.this;
                super();
            }
        });
        refreshTitle();
    }

    public boolean onBackPressed()
    {
        if (pager.getCurrentItem() == 0)
        {
            dismissModal();
            return true;
        } else
        {
            pager.setCurrentItem(pager.getCurrentItem() - 1, true);
            return true;
        }
    }

    public void onLearnMoreClicked()
    {
        trackClick(com.contextlogic.wish.analytics.Analytics.EventType.LearnMoreSelect);
        pager.setCurrentItem(1, true);
    }

    public void onNotNowClicked()
    {
        trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Dismiss);
        dismissModal();
    }

    public void onViewProfileClicked()
    {
        dismissModal();
        trackClick(com.contextlogic.wish.analytics.Analytics.EventType.ProfileSelect);
        (new Handler()).post(new Runnable() {

            final ListEditingTourFragment this$0;

            public void run()
            {
                RootActivity rootactivity = (RootActivity)getActivity();
                ProfileFragment profilefragment = new ProfileFragment();
                Bundle bundle = new Bundle();
                bundle.putString("ArgUser", RuntimeStateStore.getInstance().storeState(LoggedInUser.getInstance().getCurrentUser(), null));
                profilefragment.setArguments(bundle);
                rootactivity.setContentFragment(profilefragment, false);
                rootactivity.closeMenus();
            }

            
            {
                this$0 = ListEditingTourFragment.this;
                super();
            }
        });
    }

}
