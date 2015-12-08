// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.tabbar;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.contextlogic.wish.ui.components.scrollview.InterceptingTouchHorizontalScrollView;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.components.tabbar:
//            CategoriesTabBarTabSpec, CategoriesTabBarListener, CategoriesTabBarTab

public class CategoriesTabBar extends InterceptingTouchHorizontalScrollView
{

    private CategoriesTabBarListener listener;
    private LinearLayout scrollViewContent;

    public CategoriesTabBar(Context context)
    {
        this(context, null);
    }

    public CategoriesTabBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        scrollViewContent = new LinearLayout(getContext());
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        scrollViewContent.setLayoutParams(layoutparams);
        scrollViewContent.setOrientation(0);
        addView(scrollViewContent);
        setBackgroundColor(getResources().getColor(0x7f0c008f));
    }

    private void selectTab(View view, CategoriesTabBarTabSpec categoriestabbartabspec)
    {
        int i = 0;
        while (i < scrollViewContent.getChildCount()) 
        {
            View view1 = scrollViewContent.getChildAt(i);
            if (view1 == view)
            {
                view1.setSelected(true);
            } else
            {
                view1.setSelected(false);
            }
            i++;
        }
        if (categoriestabbartabspec.getListener() != null)
        {
            categoriestabbartabspec.getListener().onClick(view);
        }
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        if (listener != null && scrollViewContent != null)
        {
            listener.onScrollChanged(i, getWidth(), scrollViewContent.getWidth());
        }
    }

    public void releaseImages()
    {
        for (int i = 0; i < scrollViewContent.getChildCount(); i++)
        {
            View view = scrollViewContent.getChildAt(i);
            if (view instanceof CategoriesTabBarTab)
            {
                ((CategoriesTabBarTab)view).releaseImages();
            }
        }

    }

    public void removeAllTabs()
    {
        scrollViewContent.removeAllViews();
    }

    public void restoreImages()
    {
        for (int i = 0; i < scrollViewContent.getChildCount(); i++)
        {
            View view = scrollViewContent.getChildAt(i);
            if (view instanceof CategoriesTabBarTab)
            {
                ((CategoriesTabBarTab)view).restoreImages();
            }
        }

    }

    public void scrollToOrigin()
    {
        post(new Runnable() {

            final CategoriesTabBar this$0;

            public void run()
            {
                scrollTo(0, 0);
            }

            
            {
                this$0 = CategoriesTabBar.this;
                super();
            }
        });
    }

    public void setListener(CategoriesTabBarListener categoriestabbarlistener)
    {
        listener = categoriestabbarlistener;
    }

    public void setTabs(ArrayList arraylist, int i)
    {
        removeAllTabs();
        boolean flag = false;
        int k = (int)TypedValue.applyDimension(1, 1.0F, getResources().getDisplayMetrics());
        for (int j = 0; j < arraylist.size();)
        {
            final CategoriesTabBarTabSpec tab = (CategoriesTabBarTabSpec)arraylist.get(j);
            final CategoriesTabBarTab tabView = new CategoriesTabBarTab(getContext());
            tabView.setTitle(tab.getTitle());
            tabView.setImageUrl(tab.getImageUrl());
            tabView.setOnClickListener(new android.view.View.OnClickListener() {

                final CategoriesTabBar this$0;
                final CategoriesTabBarTabSpec val$tab;
                final CategoriesTabBarTab val$tabView;

                public void onClick(View view)
                {
                    if (!view.isSelected())
                    {
                        selectTab(tabView, tab);
                    }
                }

            
            {
                this$0 = CategoriesTabBar.this;
                tabView = categoriestabbartab;
                tab = categoriestabbartabspec;
                super();
            }
            });
            boolean flag1 = flag;
            if (!flag)
            {
                flag1 = flag;
                if (j == i)
                {
                    tabView.setSelected(true);
                    flag1 = true;
                }
            }
            scrollViewContent.addView(tabView);
            tab = new View(getContext());
            tab.setBackgroundColor(getResources().getColor(0x7f0c00e8));
            tab.setLayoutParams(new android.widget.LinearLayout.LayoutParams(k, -1));
            scrollViewContent.addView(tab);
            j++;
            flag = flag1;
        }

    }

}
