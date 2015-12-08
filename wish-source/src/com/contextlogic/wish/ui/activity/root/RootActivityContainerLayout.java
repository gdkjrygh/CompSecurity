// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class RootActivityContainerLayout extends FrameLayout
{

    private FrameLayout overlayContainer;
    private FrameLayout overlayMask;

    public RootActivityContainerLayout(Context context)
    {
        this(context, null);
    }

    public RootActivityContainerLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RootActivityContainerLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void clearOverlay()
    {
        if (overlayContainer == null || overlayMask == null)
        {
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            layoutparams.gravity = 48;
            overlayMask = new FrameLayout(getContext());
            overlayMask.setLayoutParams(layoutparams);
            addView(overlayMask);
            overlayContainer = new FrameLayout(getContext());
            overlayContainer.setLayoutParams(layoutparams);
            addView(overlayContainer);
            overlayMask.setOnClickListener(new android.view.View.OnClickListener() {

                final RootActivityContainerLayout this$0;

                public void onClick(View view)
                {
                }

            
            {
                this$0 = RootActivityContainerLayout.this;
                super();
            }
            });
        }
        overlayContainer.removeAllViews();
        overlayContainer.setVisibility(8);
        overlayMask.setVisibility(8);
    }

    public void showOverlay(View view)
    {
        clearOverlay();
        overlayMask.setBackgroundColor(getResources().getColor(0x7f0c00e4));
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutparams.gravity = 48;
        overlayContainer.setLayoutParams(layoutparams);
        overlayContainer.addView(view);
        overlayContainer.setVisibility(0);
        overlayMask.setVisibility(0);
    }
}
