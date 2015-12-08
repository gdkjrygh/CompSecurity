// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.tabbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.contextlogic.wish.ui.components.tabbar:
//            HorizontalTabBarTabSpec, HorizontalTabBarTab

public class HorizontalTabBar extends LinearLayout
{

    private LinearLayout scrollViewContent;

    public HorizontalTabBar(Context context)
    {
        this(context, null);
    }

    public HorizontalTabBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        scrollViewContent = (LinearLayout)((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300c8, this).findViewById(0x7f0d041a);
        setOrientation(1);
    }

    private void selectTab(View view, HorizontalTabBarTabSpec horizontaltabbartabspec)
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
        if (horizontaltabbartabspec.getListener() != null)
        {
            horizontaltabbartabspec.getListener().onClick(view);
        }
    }

    public void removeAllTabs()
    {
        scrollViewContent.removeAllViews();
    }

    public void setTabs(ArrayList arraylist)
    {
        removeAllTabs();
        boolean flag = false;
        for (arraylist = arraylist.iterator(); arraylist.hasNext();)
        {
            final HorizontalTabBarTabSpec tab = (HorizontalTabBarTabSpec)arraylist.next();
            final HorizontalTabBarTab tabView = new HorizontalTabBarTab(getContext());
            tabView.setTitle(tab.getText());
            tabView.setOnClickListener(new android.view.View.OnClickListener() {

                final HorizontalTabBar this$0;
                final HorizontalTabBarTabSpec val$tab;
                final HorizontalTabBarTab val$tabView;

                public void onClick(View view)
                {
                    if (!view.isSelected())
                    {
                        selectTab(tabView, tab);
                    }
                }

            
            {
                this$0 = HorizontalTabBar.this;
                tabView = horizontaltabbartab;
                tab = horizontaltabbartabspec;
                super();
            }
            });
            boolean flag1 = flag;
            if (!flag)
            {
                tabView.setSelected(true);
                flag1 = true;
            }
            scrollViewContent.addView(tabView);
            flag = flag1;
        }

    }

}
