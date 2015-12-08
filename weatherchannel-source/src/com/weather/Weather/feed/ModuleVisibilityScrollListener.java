// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.feed;

import android.widget.AbsListView;
import com.google.common.base.Preconditions;
import com.weather.util.log.LogUtil;
import com.weather.util.log.LoggingMetaTags;

// Referenced classes of package com.weather.Weather.feed:
//            Module, ListAutoScroller

public class ModuleVisibilityScrollListener
    implements android.widget.AbsListView.OnScrollListener, ListAutoScroller.AutoScrollListener
{

    private static final String TAG = "ModuleVisibilityScrollListener";
    private boolean autoScrolling;
    private int currentScrollState;
    private final AbsListView listView;

    public ModuleVisibilityScrollListener(AbsListView abslistview)
    {
        listView = (AbsListView)Preconditions.checkNotNull(abslistview);
    }

    private void checkAndUpdateNextModuleVisibility(int i, Module module)
    {
        Module module1;
label0:
        {
            if (i < listView.getCount() - 1)
            {
                module1 = (Module)listView.getItemAtPosition(i + 1);
                if (!module.isViewMoreThenHalfVisible())
                {
                    break label0;
                }
                module1.modulePreviousItemMoreThenHalfVisible();
            }
            return;
        }
        module1.modulePreviousItemNoMoreVisible();
    }

    private void updateAllVisibility()
    {
        int j = listView.getFirstVisiblePosition();
        int k = listView.getLastVisiblePosition();
        int l = listView.getCount();
        LogUtil.d("ModuleVisibilityScrollListener", LoggingMetaTags.TWC_UI, "updateAllVisibility firstVisible=%s, lastVisible=%s, count=%s", new Object[] {
            Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(l)
        });
        int i = 0;
        while (i < l) 
        {
            Module module;
            boolean flag;
            if (i >= j && i <= k)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            module = (Module)listView.getItemAtPosition(i);
            if (module != null)
            {
                if (autoScrolling)
                {
                    module.noLongerVisible();
                    module.modulePreviousItemNoMoreVisible();
                } else
                {
                    if (currentScrollState == 0)
                    {
                        if (flag)
                        {
                            LogUtil.d("ModuleVisibilityScrollListener", LoggingMetaTags.TWC_UI, "updateAllVisibility position=%s, visible, settled", new Object[] {
                                Integer.valueOf(i)
                            });
                            module.visibleItemIsSettled();
                        } else
                        {
                            LogUtil.d("ModuleVisibilityScrollListener", LoggingMetaTags.TWC_UI, "updateAllVisibility position=%s, not visible", new Object[] {
                                Integer.valueOf(i)
                            });
                            module.noLongerVisible();
                        }
                    } else
                    if (flag)
                    {
                        LogUtil.d("ModuleVisibilityScrollListener", LoggingMetaTags.TWC_UI, "updateAllVisibility position=%s, visible, scrolling", new Object[] {
                            Integer.valueOf(i)
                        });
                        module.visibleItemIsScrolling();
                    }
                    checkAndUpdateNextModuleVisibility(i, module);
                }
            }
            i++;
        }
    }

    public void onAutoScrollBegin(ListAutoScroller listautoscroller, AbsListView abslistview)
    {
        autoScrolling = true;
        updateAllVisibility();
    }

    public void onAutoScrollEnd(ListAutoScroller listautoscroller, AbsListView abslistview)
    {
        autoScrolling = false;
        updateAllVisibility();
    }

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
        LogUtil.v("ModuleVisibilityScrollListener", LoggingMetaTags.TWC_UI, "onScroll firstVisibleItem=%s, visibleItemCount=%s, totalItemCount=%s, autoScrolling=%s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Boolean.valueOf(autoScrolling)
        });
        if (!autoScrolling)
        {
            int l;
            if (i == 0)
            {
                j = i;
            } else
            {
                j = i - 1;
            }
            l = listView.getLastVisiblePosition();
            if (abslistview.getLastVisiblePosition() + 1 == k)
            {
                k = abslistview.getLastVisiblePosition();
            } else
            {
                k = abslistview.getLastVisiblePosition() + 1;
            }
            while (j <= k) 
            {
                Module module = (Module)abslistview.getItemAtPosition(j);
                if (module != null && j <= l && j >= i)
                {
                    module.scrollingItemIsVisible();
                    checkAndUpdateNextModuleVisibility(j, module);
                }
                j++;
            }
        }
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        LogUtil.v("ModuleVisibilityScrollListener", LoggingMetaTags.TWC_UI, "onScrollStateChanged scrollState=%s", new Object[] {
            LogUtil.getScrollStateName(i)
        });
        currentScrollState = i;
        if (!autoScrolling)
        {
            updateAllVisibility();
        }
    }
}
