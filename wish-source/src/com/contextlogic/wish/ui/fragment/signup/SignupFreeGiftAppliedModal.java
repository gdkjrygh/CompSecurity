// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

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
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishSignupFreeGiftCart;
import com.contextlogic.wish.ui.components.button.UnifiedFontButton;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;

public class SignupFreeGiftAppliedModal extends FrameLayout
{

    private UnifiedFontButton dismissButton;
    private TextView messageText;
    private View modalView;
    private BorderedImageView productImage;
    private TextView titleText;

    public SignupFreeGiftAppliedModal(Context context)
    {
        this(context, null);
    }

    public SignupFreeGiftAppliedModal(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SignupFreeGiftAppliedModal(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300c1, this);
        modalView = view.findViewById(0x7f0d040c);
        dismissButton = (UnifiedFontButton)view.findViewById(0x7f0d0410);
        titleText = (TextView)view.findViewById(0x7f0d040e);
        messageText = (TextView)view.findViewById(0x7f0d040f);
        productImage = (BorderedImageView)view.findViewById(0x7f0d040d);
        productImage.getImageView().setRequestedImageWidth(100);
        productImage.getImageView().setRequestedImageHeight(100);
        setBackgroundColor(getResources().getColor(0x7f0c006e));
    }

    public void setup(WishProduct wishproduct, WishSignupFreeGiftCart wishsignupfreegiftcart, android.view.View.OnClickListener onclicklistener)
    {
        dismissButton.setOnClickListener(onclicklistener);
        titleText.setText(wishsignupfreegiftcart.getModalTitle());
        messageText.setText(wishsignupfreegiftcart.getModalMessage());
        dismissButton.setText(wishsignupfreegiftcart.getModalButtonText());
        productImage.getImageView().setImageUrl(wishproduct.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium));
        wishproduct = new TranslateAnimation(0.0F, 0.0F, ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getHeight(), 0.0F);
        wishproduct.setFillAfter(false);
        wishproduct.setDuration(200L);
        wishproduct.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final SignupFreeGiftAppliedModal this$0;

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
                this$0 = SignupFreeGiftAppliedModal.this;
                super();
            }
        });
        modalView.startAnimation(wishproduct);
    }

}
