// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProfileFollowButton extends FrameLayout
{
    public static final class ButtonMode extends Enum
    {

        private static final ButtonMode $VALUES[];
        public static final ButtonMode Follow;
        public static final ButtonMode FollowLoading;
        public static final ButtonMode Following;
        public static final ButtonMode FollowingLoading;

        public static ButtonMode valueOf(String s)
        {
            return (ButtonMode)Enum.valueOf(com/contextlogic/wish/ui/fragment/profile/ProfileFollowButton$ButtonMode, s);
        }

        public static ButtonMode[] values()
        {
            return (ButtonMode[])$VALUES.clone();
        }

        static 
        {
            Follow = new ButtonMode("Follow", 0);
            Following = new ButtonMode("Following", 1);
            FollowLoading = new ButtonMode("FollowLoading", 2);
            FollowingLoading = new ButtonMode("FollowingLoading", 3);
            $VALUES = (new ButtonMode[] {
                Follow, Following, FollowLoading, FollowingLoading
            });
        }

        private ButtonMode(String s, int i)
        {
            super(s, i);
        }
    }


    private ButtonMode buttonMode;
    protected ProgressBar buttonProgress;
    private TextView textView;

    public ProfileFollowButton(Context context)
    {
        this(context, null);
    }

    public ProfileFollowButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ProfileFollowButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f03008e, this);
        buttonProgress = (ProgressBar)view.findViewById(0x7f0d02be);
        textView = (TextView)view.findViewById(0x7f0d02bd);
    }

    public void setButtonMode(ButtonMode buttonmode)
    {
        buttonMode = buttonmode;
        static class _cls1
        {

            static final int $SwitchMap$com$contextlogic$wish$ui$fragment$profile$ProfileFollowButton$ButtonMode[];

            static 
            {
                $SwitchMap$com$contextlogic$wish$ui$fragment$profile$ProfileFollowButton$ButtonMode = new int[ButtonMode.values().length];
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$profile$ProfileFollowButton$ButtonMode[ButtonMode.Follow.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$profile$ProfileFollowButton$ButtonMode[ButtonMode.Following.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$profile$ProfileFollowButton$ButtonMode[ButtonMode.FollowLoading.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$contextlogic$wish$ui$fragment$profile$ProfileFollowButton$ButtonMode[ButtonMode.FollowingLoading.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.contextlogic.wish.ui.fragment.profile.ProfileFollowButton.ButtonMode[buttonMode.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            textView.setTextSize(1, 12F);
            textView.setVisibility(0);
            buttonProgress.setVisibility(8);
            textView.setText(getContext().getString(0x7f0601b0));
            return;

        case 2: // '\002'
            textView.setTextSize(1, 10F);
            textView.setVisibility(0);
            buttonProgress.setVisibility(8);
            textView.setText(getContext().getString(0x7f0601b1));
            return;

        case 3: // '\003'
            textView.setVisibility(8);
            buttonProgress.setVisibility(0);
            return;

        case 4: // '\004'
            textView.setVisibility(8);
            break;
        }
        buttonProgress.setVisibility(0);
    }
}
