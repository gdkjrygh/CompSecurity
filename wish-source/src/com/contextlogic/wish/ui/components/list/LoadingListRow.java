// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.list;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.ui.activity.root.RootActivity;

public class LoadingListRow extends FrameLayout
{
    public static final class ButtonColor extends Enum
    {

        private static final ButtonColor $VALUES[];
        public static final ButtonColor Blue;
        public static final ButtonColor Gray;
        public static final ButtonColor Orange;

        public static ButtonColor valueOf(String s)
        {
            return (ButtonColor)Enum.valueOf(com/contextlogic/wish/ui/components/list/LoadingListRow$ButtonColor, s);
        }

        public static ButtonColor[] values()
        {
            return (ButtonColor[])$VALUES.clone();
        }

        static 
        {
            Gray = new ButtonColor("Gray", 0);
            Blue = new ButtonColor("Blue", 1);
            Orange = new ButtonColor("Orange", 2);
            $VALUES = (new ButtonColor[] {
                Gray, Blue, Orange
            });
        }

        private ButtonColor(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class LoadingMode extends Enum
    {

        private static final LoadingMode $VALUES[];
        public static final LoadingMode ClickToLoad;
        public static final LoadingMode Hidden;
        public static final LoadingMode Loading;
        public static final LoadingMode NoMoreItems;

        public static LoadingMode valueOf(String s)
        {
            return (LoadingMode)Enum.valueOf(com/contextlogic/wish/ui/components/list/LoadingListRow$LoadingMode, s);
        }

        public static LoadingMode[] values()
        {
            return (LoadingMode[])$VALUES.clone();
        }

        static 
        {
            Hidden = new LoadingMode("Hidden", 0);
            Loading = new LoadingMode("Loading", 1);
            ClickToLoad = new LoadingMode("ClickToLoad", 2);
            NoMoreItems = new LoadingMode("NoMoreItems", 3);
            $VALUES = (new LoadingMode[] {
                Hidden, Loading, ClickToLoad, NoMoreItems
            });
        }

        private LoadingMode(String s, int i)
        {
            super(s, i);
        }
    }


    private boolean buttonImpressionTracked;
    private View clickToLoadLayout;
    private View containerLayout;
    private View loadingLayout;
    private LoadingMode loadingMode;
    private Button noMoreItemsButton;
    private View noMoreItemsButtonLayout;
    private String noMoreItemsButtonText;
    private String noMoreItemsDeepLink;
    private View noMoreItemsLayout;
    private String noMoreItemsMessage;
    private TextView noMoreItemsMessageView;
    private TextView noMoreItemsTextView;

    public LoadingListRow(Context context)
    {
        this(context, null);
    }

    public LoadingListRow(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public LoadingListRow(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void handleNoMoreItemsButtonClick()
    {
        (new LogService()).requestService(Integer.toString(WishAnalyticsEvent.CLICK_MOBILE_FEED_ENDED_WIDGET.getValue()), null, null, null);
        RootActivity rootactivity = (RootActivity)getContext();
        if (rootactivity != null && noMoreItemsDeepLink != null)
        {
            Object obj = Uri.parse(noMoreItemsDeepLink);
            if (obj != null)
            {
                obj = WishDeepLinkActivity.getDeepLinkTarget(((Uri) (obj)));
                if (obj != null)
                {
                    rootactivity.processDeepLink(((com.contextlogic.wish.ApplicationDeepLinkConfig) (obj)), false);
                }
            }
        }
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300ca, this);
        containerLayout = view;
        buttonImpressionTracked = false;
        loadingLayout = view.findViewById(0x7f0d041e);
        clickToLoadLayout = view.findViewById(0x7f0d041f);
        noMoreItemsLayout = view.findViewById(0x7f0d0420);
        noMoreItemsTextView = (TextView)view.findViewById(0x7f0d0421);
        noMoreItemsButtonLayout = view.findViewById(0x7f0d0422);
        noMoreItemsButton = (Button)view.findViewById(0x7f0d0424);
        noMoreItemsMessageView = (TextView)view.findViewById(0x7f0d0423);
        loadingLayout.setOnClickListener(new android.view.View.OnClickListener() {

            final LoadingListRow this$0;

            public void onClick(View view1)
            {
            }

            
            {
                this$0 = LoadingListRow.this;
                super();
            }
        });
        noMoreItemsLayout.setOnClickListener(new android.view.View.OnClickListener() {

            final LoadingListRow this$0;

            public void onClick(View view1)
            {
            }

            
            {
                this$0 = LoadingListRow.this;
                super();
            }
        });
        clickToLoadLayout.setOnClickListener(new android.view.View.OnClickListener() {

            final LoadingListRow this$0;

            public void onClick(View view1)
            {
            }

            
            {
                this$0 = LoadingListRow.this;
                super();
            }
        });
        noMoreItemsButtonLayout.setOnClickListener(new android.view.View.OnClickListener() {

            final LoadingListRow this$0;

            public void onClick(View view1)
            {
            }

            
            {
                this$0 = LoadingListRow.this;
                super();
            }
        });
        noMoreItemsButton.setOnClickListener(new android.view.View.OnClickListener() {

            final LoadingListRow this$0;

            public void onClick(View view1)
            {
                handleNoMoreItemsButtonClick();
            }

            
            {
                this$0 = LoadingListRow.this;
                super();
            }
        });
        setLoadingMode(LoadingMode.Hidden);
    }

    public LoadingMode getLoadingMode()
    {
        return loadingMode;
    }

    public void setLoadingMode(LoadingMode loadingmode)
    {
        loadingMode = loadingmode;
        static class _cls6
        {

            static final int $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$ButtonColor[];
            static final int $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$LoadingMode[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$ButtonColor = new int[ButtonColor.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$ButtonColor[ButtonColor.Blue.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$ButtonColor[ButtonColor.Orange.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$LoadingMode = new int[LoadingMode.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$LoadingMode[LoadingMode.Hidden.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$LoadingMode[LoadingMode.Loading.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$LoadingMode[LoadingMode.ClickToLoad.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$list$LoadingListRow$LoadingMode[LoadingMode.NoMoreItems.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls6..SwitchMap.com.contextlogic.wish.ui.components.list.LoadingListRow.LoadingMode[loadingMode.ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 49
    //                   2 86
    //                   3 122
    //                   4 158;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        loadingLayout.setVisibility(8);
        clickToLoadLayout.setVisibility(8);
        noMoreItemsLayout.setVisibility(8);
        noMoreItemsButtonLayout.setVisibility(8);
        return;
_L3:
        loadingLayout.setVisibility(0);
        clickToLoadLayout.setVisibility(8);
        noMoreItemsLayout.setVisibility(8);
        noMoreItemsButtonLayout.setVisibility(8);
        return;
_L4:
        loadingLayout.setVisibility(8);
        clickToLoadLayout.setVisibility(0);
        noMoreItemsLayout.setVisibility(8);
        noMoreItemsButtonLayout.setVisibility(8);
        return;
_L5:
        if (noMoreItemsMessage != null && noMoreItemsButtonText != null && noMoreItemsDeepLink != null)
        {
            loadingLayout.setVisibility(8);
            clickToLoadLayout.setVisibility(8);
            noMoreItemsLayout.setVisibility(8);
            noMoreItemsButtonLayout.setVisibility(0);
            if (!buttonImpressionTracked)
            {
                buttonImpressionTracked = true;
                (new LogService()).requestService(Integer.toString(WishAnalyticsEvent.IMPRESSION_MOBILE_FEED_ENDED_WIDGET.getValue()), null, null, null);
                return;
            }
        } else
        {
            loadingLayout.setVisibility(8);
            clickToLoadLayout.setVisibility(8);
            noMoreItemsLayout.setVisibility(0);
            noMoreItemsButtonLayout.setVisibility(8);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void setNoMoreItemsSpec(String s, String s1, String s2, ButtonColor buttoncolor)
    {
        noMoreItemsMessage = s;
        noMoreItemsButtonText = s1;
        noMoreItemsDeepLink = s2;
        noMoreItemsMessageView.setText(s);
        noMoreItemsButton.setText(s1);
        _cls6..SwitchMap.com.contextlogic.wish.ui.components.list.LoadingListRow.ButtonColor[buttoncolor.ordinal()];
        JVM INSTR tableswitch 1 2: default 64
    //                   1 82
    //                   2 94;
           goto _L1 _L2 _L3
_L1:
        noMoreItemsButton.setBackgroundResource(0x7f0200d5);
_L5:
        setLoadingMode(getLoadingMode());
        return;
_L2:
        noMoreItemsButton.setBackgroundResource(0x7f020048);
        continue; /* Loop/switch isn't completed */
_L3:
        noMoreItemsButton.setBackgroundResource(0x7f02014e);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void setNoMoreItemsText(String s)
    {
        noMoreItemsTextView.setText(s);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        clickToLoadLayout.setOnClickListener(onclicklistener);
    }

    public void setUseLongMode(boolean flag, int i)
    {
        if (!flag)
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)containerLayout.getLayoutParams();
            marginlayoutparams.bottomMargin = 0;
            containerLayout.setLayoutParams(marginlayoutparams);
        } else
        if (getContext() != null)
        {
            int j = ((Activity)getContext()).getWindowManager().getDefaultDisplay().getHeight();
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams1 = (android.view.ViewGroup.MarginLayoutParams)containerLayout.getLayoutParams();
            marginlayoutparams1.bottomMargin = j - i - containerLayout.getHeight();
            containerLayout.setLayoutParams(marginlayoutparams1);
            return;
        }
    }

}
