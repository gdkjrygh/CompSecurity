// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.filterfeed;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishPromoBannerSpec;
import com.contextlogic.wish.ui.activity.root.RootActivity;

public class PromoBannerView extends LinearLayout
{

    private TextView bigText;
    private TextView mediumText;
    private WishPromoBannerSpec promoBannerSpec;
    private TextView smallText;

    public PromoBannerView(Context context)
    {
        this(context, null);
    }

    public PromoBannerView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void handleClick()
    {
        if (getContext() != null)
        {
            ((RootActivity)getContext()).showCart(null, null, null);
        }
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300c0, this);
        bigText = (TextView)view.findViewById(0x7f0d0409);
        mediumText = (TextView)view.findViewById(0x7f0d040a);
        smallText = (TextView)view.findViewById(0x7f0d040b);
        setGravity(17);
        setBackgroundResource(0x7f020163);
        setOrientation(1);
        setOnClickListener(new android.view.View.OnClickListener() {

            final PromoBannerView this$0;

            public void onClick(View view1)
            {
                handleClick();
            }

            
            {
                this$0 = PromoBannerView.this;
                super();
            }
        });
    }

    public int getBannerHeight()
    {
        return (int)TypedValue.applyDimension(1, 100F, getResources().getDisplayMetrics());
    }

    public void setBannerSpec(WishPromoBannerSpec wishpromobannerspec)
    {
        promoBannerSpec = wishpromobannerspec;
        if (wishpromobannerspec.getBigText() != null)
        {
            bigText.setText(wishpromobannerspec.getBigText());
            bigText.setVisibility(0);
        } else
        {
            bigText.setVisibility(8);
        }
        if (wishpromobannerspec.getMediumText() != null)
        {
            mediumText.setText(wishpromobannerspec.getMediumText());
            mediumText.setVisibility(0);
        } else
        {
            mediumText.setVisibility(8);
        }
        if (wishpromobannerspec.getSmallText() != null)
        {
            smallText.setText(wishpromobannerspec.getSmallText());
            smallText.setVisibility(0);
            return;
        } else
        {
            smallText.setVisibility(8);
            return;
        }
    }

}
