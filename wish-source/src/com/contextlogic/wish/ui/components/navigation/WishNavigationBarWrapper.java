// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.navigation;

import android.view.View;

// Referenced classes of package com.contextlogic.wish.ui.components.navigation:
//            ActionMenuItem, NavigationBarImageButton, WishNavigationBar, NavigationBarTextButton, 
//            NavigationBarGrayTextButton, NavigationBarButtonCallback

public class WishNavigationBarWrapper
{

    private WishNavigationBar bar;

    public WishNavigationBarWrapper(WishNavigationBar wishnavigationbar)
    {
        bar = wishnavigationbar;
    }

    public void addMenuItem(final ActionMenuItem item, WishNavigationBar.NavigationBarColor navigationbarcolor)
    {
        if (item.getResourceId() != 0)
        {
            navigationbarcolor = new NavigationBarImageButton(bar.getContext());
            navigationbarcolor.setButtonImageResId(item.getResourceId());
            navigationbarcolor.setOnClickListener(new android.view.View.OnClickListener() {

                final WishNavigationBarWrapper this$0;
                final ActionMenuItem val$item;

                public void onClick(View view)
                {
                    item.getCallback().onMenuItemClicked();
                }

            
            {
                this$0 = WishNavigationBarWrapper.this;
                item = actionmenuitem;
                super();
            }
            });
            bar.setRightButton(navigationbarcolor);
            return;
        }
        static class _cls4
        {

            static final int $SwitchMap$com$contextlogic$wish$ui$components$navigation$WishNavigationBar$NavigationBarColor[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$ui$components$navigation$WishNavigationBar$NavigationBarColor = new int[WishNavigationBar.NavigationBarColor.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$navigation$WishNavigationBar$NavigationBarColor[WishNavigationBar.NavigationBarColor.Main.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$navigation$WishNavigationBar$NavigationBarColor[WishNavigationBar.NavigationBarColor.Modal.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4..SwitchMap.com.contextlogic.wish.ui.components.navigation.WishNavigationBar.NavigationBarColor[navigationbarcolor.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            navigationbarcolor = new NavigationBarTextButton(bar.getContext());
            navigationbarcolor.setText(item.getTitle());
            navigationbarcolor.setOnClickListener(new android.view.View.OnClickListener() {

                final WishNavigationBarWrapper this$0;
                final ActionMenuItem val$item;

                public void onClick(View view)
                {
                    item.getCallback().onMenuItemClicked();
                }

            
            {
                this$0 = WishNavigationBarWrapper.this;
                item = actionmenuitem;
                super();
            }
            });
            bar.setRightButton(navigationbarcolor);
            return;

        case 2: // '\002'
            navigationbarcolor = new NavigationBarGrayTextButton(bar.getContext());
            break;
        }
        navigationbarcolor.setText(item.getTitle());
        navigationbarcolor.setOnClickListener(new android.view.View.OnClickListener() {

            final WishNavigationBarWrapper this$0;
            final ActionMenuItem val$item;

            public void onClick(View view)
            {
                item.getCallback().onMenuItemClicked();
            }

            
            {
                this$0 = WishNavigationBarWrapper.this;
                item = actionmenuitem;
                super();
            }
        });
        bar.setRightButton(navigationbarcolor);
    }

    public void clearRightButtons()
    {
        bar.clearRightButtons();
    }

    public void setBarColor(WishNavigationBar.NavigationBarColor navigationbarcolor)
    {
        bar.setBarColor(navigationbarcolor);
    }

    public void setLeftButton(View view)
    {
        bar.setLeftButton(view);
    }

    public void setTitle(String s)
    {
        bar.setTitle(s);
    }

    public void setTitle(String s, String s1)
    {
        bar.setTitle(s, s1);
    }

    public void setTitleView(View view)
    {
        bar.setTitleView(view);
    }

    public void setVisibility(int i)
    {
        bar.setVisibility(i);
    }
}
