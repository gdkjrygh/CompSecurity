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
import com.contextlogic.wish.api.data.WishSignupFreeGiftsAbandon;

public class SignupFreeGiftsAbandonModal extends FrameLayout
{
    public static interface Callback
    {

        public abstract void onAbandon();

        public abstract void onDismiss();
    }


    private WishSignupFreeGiftsAbandon abandonModalInfo;
    private TextView actionButton;
    private TextView cancelButton;
    private TextView messageText;
    private View modalView;
    private TextView titleText;

    public SignupFreeGiftsAbandonModal(Context context)
    {
        this(context, null);
    }

    public SignupFreeGiftsAbandonModal(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SignupFreeGiftsAbandonModal(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        init();
    }

    public void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f0300a2, this);
        modalView = view.findViewById(0x7f0d033e);
        cancelButton = (TextView)view.findViewById(0x7f0d0342);
        actionButton = (TextView)view.findViewById(0x7f0d0341);
        titleText = (TextView)view.findViewById(0x7f0d033f);
        messageText = (TextView)view.findViewById(0x7f0d0340);
        setBackgroundColor(getResources().getColor(0x7f0c006e));
    }

    public void setup(WishSignupFreeGiftsAbandon wishsignupfreegiftsabandon, final Callback callback)
    {
        abandonModalInfo = wishsignupfreegiftsabandon;
        cancelButton.setText(wishsignupfreegiftsabandon.getCancelButtonText());
        cancelButton.setOnClickListener(new android.view.View.OnClickListener() {

            final SignupFreeGiftsAbandonModal this$0;
            final Callback val$callback;

            public void onClick(View view)
            {
                callback.onAbandon();
            }

            
            {
                this$0 = SignupFreeGiftsAbandonModal.this;
                callback = callback1;
                super();
            }
        });
        actionButton.setText(wishsignupfreegiftsabandon.getActionButtonText());
        actionButton.setOnClickListener(new android.view.View.OnClickListener() {

            final SignupFreeGiftsAbandonModal this$0;
            final Callback val$callback;

            public void onClick(View view)
            {
                callback.onDismiss();
            }

            
            {
                this$0 = SignupFreeGiftsAbandonModal.this;
                callback = callback1;
                super();
            }
        });
        titleText.setText(wishsignupfreegiftsabandon.getTitle());
        messageText.setText(wishsignupfreegiftsabandon.getMessage());
        wishsignupfreegiftsabandon = new TranslateAnimation(0.0F, 0.0F, ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getHeight(), 0.0F);
        wishsignupfreegiftsabandon.setFillAfter(false);
        wishsignupfreegiftsabandon.setDuration(200L);
        wishsignupfreegiftsabandon.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final SignupFreeGiftsAbandonModal this$0;

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
                this$0 = SignupFreeGiftsAbandonModal.this;
                super();
            }
        });
        modalView.startAnimation(wishsignupfreegiftsabandon);
    }

}
