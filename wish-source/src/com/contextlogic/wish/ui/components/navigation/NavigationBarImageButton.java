// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.components.navigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class NavigationBarImageButton extends FrameLayout
{
    public static final class ButtonMode extends Enum
    {

        private static final ButtonMode $VALUES[];
        public static final ButtonMode Action;
        public static final ButtonMode Back;
        public static final ButtonMode BackGray;
        public static final ButtonMode Blank;
        public static final ButtonMode Filter;
        public static final ButtonMode LeftBlank;
        public static final ButtonMode MenuOpen;
        public static final ButtonMode NextGray;
        public static final ButtonMode Search;
        public static final ButtonMode X;

        public static ButtonMode valueOf(String s)
        {
            return (ButtonMode)Enum.valueOf(com/contextlogic/wish/ui/components/navigation/NavigationBarImageButton$ButtonMode, s);
        }

        public static ButtonMode[] values()
        {
            return (ButtonMode[])$VALUES.clone();
        }

        static 
        {
            Back = new ButtonMode("Back", 0);
            BackGray = new ButtonMode("BackGray", 1);
            Blank = new ButtonMode("Blank", 2);
            Action = new ButtonMode("Action", 3);
            Filter = new ButtonMode("Filter", 4);
            X = new ButtonMode("X", 5);
            NextGray = new ButtonMode("NextGray", 6);
            Search = new ButtonMode("Search", 7);
            LeftBlank = new ButtonMode("LeftBlank", 8);
            MenuOpen = new ButtonMode("MenuOpen", 9);
            $VALUES = (new ButtonMode[] {
                Back, BackGray, Blank, Action, Filter, X, NextGray, Search, LeftBlank, MenuOpen
            });
        }

        private ButtonMode(String s, int i)
        {
            super(s, i);
        }
    }


    private ImageView imageView;

    public NavigationBarImageButton(Context context)
    {
        this(context, null);
    }

    public NavigationBarImageButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public NavigationBarImageButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        imageView = (ImageView)((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300cc, this).findViewById(0x7f0d0429);
    }

    public void setButtonImageResId(int i)
    {
        imageView.setImageResource(i);
    }

    public void setButtonMode(ButtonMode buttonmode)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$contextlogic$wish$ui$components$navigation$NavigationBarImageButton$ButtonMode[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$ui$components$navigation$NavigationBarImageButton$ButtonMode = new int[ButtonMode.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$navigation$NavigationBarImageButton$ButtonMode[ButtonMode.Back.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$navigation$NavigationBarImageButton$ButtonMode[ButtonMode.BackGray.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$navigation$NavigationBarImageButton$ButtonMode[ButtonMode.LeftBlank.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$navigation$NavigationBarImageButton$ButtonMode[ButtonMode.Blank.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$navigation$NavigationBarImageButton$ButtonMode[ButtonMode.Action.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$navigation$NavigationBarImageButton$ButtonMode[ButtonMode.Search.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$navigation$NavigationBarImageButton$ButtonMode[ButtonMode.X.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$components$navigation$NavigationBarImageButton$ButtonMode[ButtonMode.NextGray.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.contextlogic.wish.ui.components.navigation.NavigationBarImageButton.ButtonMode[buttonmode.ordinal()])
        {
        case 4: // '\004'
        default:
            return;

        case 1: // '\001'
            imageView.setImageResource(0x7f020033);
            return;

        case 2: // '\002'
            imageView.setImageResource(0x7f020033);
            return;

        case 3: // '\003'
            imageView.setImageResource(0);
            return;

        case 5: // '\005'
            imageView.setImageResource(0x7f0200e2);
            return;

        case 6: // '\006'
            imageView.setImageResource(0x7f0200be);
            return;

        case 7: // '\007'
            imageView.setImageResource(0x7f0200bb);
            return;

        case 8: // '\b'
            imageView.setImageResource(0x7f02010c);
            break;
        }
    }
}
