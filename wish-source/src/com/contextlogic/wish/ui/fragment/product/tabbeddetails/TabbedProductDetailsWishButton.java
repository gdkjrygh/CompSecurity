// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.product.tabbeddetails;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class TabbedProductDetailsWishButton extends FrameLayout
{
    public static final class ButtonMode extends Enum
    {

        private static final ButtonMode $VALUES[];
        public static final ButtonMode Wish;
        public static final ButtonMode WishLoading;
        public static final ButtonMode Wished;
        public static final ButtonMode WishedV2;

        public static ButtonMode valueOf(String s)
        {
            return (ButtonMode)Enum.valueOf(com/contextlogic/wish/ui/fragment/product/tabbeddetails/TabbedProductDetailsWishButton$ButtonMode, s);
        }

        public static ButtonMode[] values()
        {
            return (ButtonMode[])$VALUES.clone();
        }

        static 
        {
            Wish = new ButtonMode("Wish", 0);
            WishLoading = new ButtonMode("WishLoading", 1);
            Wished = new ButtonMode("Wished", 2);
            WishedV2 = new ButtonMode("WishedV2", 3);
            $VALUES = (new ButtonMode[] {
                Wish, WishLoading, Wished, WishedV2
            });
        }

        private ButtonMode(String s, int i)
        {
            super(s, i);
        }
    }


    private ImageView imageView;
    private ProgressBar spinner;
    private TextView textView;

    public TabbedProductDetailsWishButton(Context context)
    {
        this(context, null);
    }

    public TabbedProductDetailsWishButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TabbedProductDetailsWishButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300b6, this);
        imageView = (ImageView)view.findViewById(0x7f0d03df);
        textView = (TextView)view.findViewById(0x7f0d03e0);
        spinner = (ProgressBar)view.findViewById(0x7f0d03e1);
        setButtonMode(ButtonMode.Wish);
    }

    public void setButtonMode(ButtonMode buttonmode)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$contextlogic$wish$ui$fragment$product$tabbeddetails$TabbedProductDetailsWishButton$ButtonMode[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$ui$fragment$product$tabbeddetails$TabbedProductDetailsWishButton$ButtonMode = new int[ButtonMode.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$product$tabbeddetails$TabbedProductDetailsWishButton$ButtonMode[ButtonMode.Wish.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$product$tabbeddetails$TabbedProductDetailsWishButton$ButtonMode[ButtonMode.WishLoading.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$product$tabbeddetails$TabbedProductDetailsWishButton$ButtonMode[ButtonMode.Wished.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$product$tabbeddetails$TabbedProductDetailsWishButton$ButtonMode[ButtonMode.WishedV2.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.contextlogic.wish.ui.fragment.product.tabbeddetails.TabbedProductDetailsWishButton.ButtonMode[buttonmode.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            setEnabled(true);
            textView.setVisibility(0);
            spinner.setVisibility(8);
            imageView.setVisibility(0);
            imageView.setImageResource(0x7f0201a3);
            textView.setText(0x7f06038f);
            return;

        case 2: // '\002'
            setEnabled(false);
            imageView.setVisibility(8);
            spinner.setVisibility(0);
            textView.setVisibility(8);
            return;

        case 3: // '\003'
            setEnabled(true);
            imageView.setVisibility(0);
            imageView.setImageResource(0x7f0201a2);
            textView.setVisibility(0);
            textView.setText(0x7f060137);
            spinner.setVisibility(8);
            return;

        case 4: // '\004'
            setEnabled(true);
            break;
        }
        imageView.setVisibility(0);
        imageView.setImageResource(0x7f0200ea);
        textView.setText(0x7f060397);
        textView.setVisibility(0);
        spinner.setVisibility(8);
    }
}
