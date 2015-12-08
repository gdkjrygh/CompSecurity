// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.dealdash;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.contextlogic.wish.api.data.DealDashPageInfo;
import com.contextlogic.wish.ui.components.button.UnifiedFontButton;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.util.TabletUtil;

public class DealDashModal extends FrameLayout
{

    private UnifiedFontButton cartButton;
    private CachedImageView iconImage;
    private TextView messageText;
    private View modalView;
    private DealDashPageInfo pageInfo;
    private TextView titleText;

    public DealDashModal(Context context)
    {
        this(context, null);
    }

    public DealDashModal(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DealDashModal(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f03003b, this);
        modalView = view.findViewById(0x7f0d0159);
        cartButton = (UnifiedFontButton)view.findViewById(0x7f0d015d);
        titleText = (TextView)view.findViewById(0x7f0d015b);
        messageText = (TextView)view.findViewById(0x7f0d015c);
        iconImage = (CachedImageView)view.findViewById(0x7f0d015a);
        iconImage.setRequestedImageWidth(100);
        iconImage.setRequestedImageHeight(100);
        if (TabletUtil.isTablet(getContext()))
        {
            setBackgroundColor(getResources().getColor(0x7f0c00e4));
            return;
        } else
        {
            setBackgroundColor(getResources().getColor(0x7f0c006e));
            return;
        }
    }

    public void setup(DealDashPageInfo dealdashpageinfo, android.view.View.OnClickListener onclicklistener)
    {
        pageInfo = dealdashpageinfo;
        cartButton.setOnClickListener(onclicklistener);
        cartButton.setText(pageInfo.getButtonText());
        titleText.setText(pageInfo.getTitle());
        messageText.setText(pageInfo.getTopSubtitle());
        dealdashpageinfo = new TranslateAnimation(0.0F, 0.0F, ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getHeight(), 0.0F);
        dealdashpageinfo.setFillAfter(false);
        dealdashpageinfo.setDuration(200L);
        dealdashpageinfo.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final DealDashModal this$0;

            public void onAnimationEnd(Animation animation)
            {
            }

            public void onAnimationRepeat(Animation animation)
            {
            }

            public void onAnimationStart(Animation animation)
            {
                modalView.setVisibility(0);
            }

            
            {
                this$0 = DealDashModal.this;
                super();
            }
        });
        modalView.startAnimation(dealdashpageinfo);
    }

}
