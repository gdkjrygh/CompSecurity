// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package com.contextlogic.wish.ui.components.navigation:
//            NavigationBarTextTitle, NavigationBarTextSubtitle

public class WishNavigationBar extends FrameLayout
{
    public static final class NavigationBarColor extends Enum
    {

        private static final NavigationBarColor $VALUES[];
        public static final NavigationBarColor Main;
        public static final NavigationBarColor Modal;

        public static NavigationBarColor valueOf(String s)
        {
            return (NavigationBarColor)Enum.valueOf(com/contextlogic/wish/ui/components/navigation/WishNavigationBar$NavigationBarColor, s);
        }

        public static NavigationBarColor[] values()
        {
            return (NavigationBarColor[])$VALUES.clone();
        }

        static 
        {
            Main = new NavigationBarColor("Main", 0);
            Modal = new NavigationBarColor("Modal", 1);
            $VALUES = (new NavigationBarColor[] {
                Main, Modal
            });
        }

        private NavigationBarColor(String s, int i)
        {
            super(s, i);
        }
    }


    private NavigationBarColor barColor;
    private FrameLayout leftButtonLayout;
    private FrameLayout leftButtonLayoutCover;
    private FrameLayout rightButtonLayout;
    private FrameLayout titleLayout;

    public WishNavigationBar(Context context)
    {
        this(context, null);
    }

    public WishNavigationBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public WishNavigationBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300cb, this);
        leftButtonLayout = (FrameLayout)view.findViewById(0x7f0d0426);
        rightButtonLayout = (FrameLayout)view.findViewById(0x7f0d0428);
        titleLayout = (FrameLayout)view.findViewById(0x7f0d0425);
        leftButtonLayoutCover = (FrameLayout)view.findViewById(0x7f0d0427);
        leftButtonLayoutCover.setVisibility(8);
    }

    public void clearRightButtons()
    {
        rightButtonLayout.removeAllViews();
    }

    public NavigationBarColor getBarColor()
    {
        return barColor;
    }

    public boolean hasRightButton()
    {
        return rightButtonLayout.getChildCount() > 0;
    }

    public boolean isOpaque()
    {
        return true;
    }

    public void setBarColor(NavigationBarColor navigationbarcolor)
    {
        barColor = navigationbarcolor;
        static class _cls1
        {

            static final int $SwitchMap$com$contextlogic$wish$ui$components$navigation$WishNavigationBar$NavigationBarColor[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$ui$components$navigation$WishNavigationBar$NavigationBarColor = new int[NavigationBarColor.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$navigation$WishNavigationBar$NavigationBarColor[NavigationBarColor.Main.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls1..SwitchMap.com.contextlogic.wish.ui.components.navigation.WishNavigationBar.NavigationBarColor[navigationbarcolor.ordinal()])
        {
        default:
            setBackgroundColor(getResources().getColor(0x7f0c00c0));
            return;

        case 1: // '\001'
            setBackgroundColor(getResources().getColor(0x7f0c00bf));
            break;
        }
    }

    public void setLeftButton(View view)
    {
        leftButtonLayout.removeAllViews();
        if (view != null)
        {
            leftButtonLayout.addView(view);
        }
    }

    public void setRightButton(View view)
    {
        rightButtonLayout.removeAllViews();
        if (view != null)
        {
            rightButtonLayout.addView(view);
        }
    }

    public void setTitle(String s)
    {
        NavigationBarTextTitle navigationbartexttitle = new NavigationBarTextTitle(getContext());
        navigationbartexttitle.setTitle(s);
        setTitleView(navigationbartexttitle);
    }

    public void setTitle(String s, String s1)
    {
        NavigationBarTextSubtitle navigationbartextsubtitle = new NavigationBarTextSubtitle(getContext());
        navigationbartextsubtitle.setTitle(s);
        navigationbartextsubtitle.setSubtitle(s1);
        setTitleView(navigationbartextsubtitle);
    }

    public void setTitleView(View view)
    {
        titleLayout.removeAllViews();
        view.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        if (view != null)
        {
            titleLayout.addView(view);
        }
    }
}
