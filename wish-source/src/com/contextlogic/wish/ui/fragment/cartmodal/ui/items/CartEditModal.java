// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.items;

import android.content.Context;
import android.content.res.Resources;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.contextlogic.wish.api.data.WishCartItem;
import com.contextlogic.wish.api.data.WishImage;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.image.BorderedImageView;
import com.contextlogic.wish.ui.components.image.CachedImageView;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import java.util.ArrayList;

public class CartEditModal extends FrameLayout
{
    public static interface Callback
    {

        public abstract void onCancel();

        public abstract void onEdit(WishCartItem wishcartitem, int i);
    }


    private static final long MAX_QUANTITY = 15L;
    private static final long TRANSITION_DURATION = 250L;
    private Callback callback;
    private WishCartItem cartItem;
    private CartManager cartManager;
    private View closeButton;
    private TextView doneButton;
    private View modalView;
    private BorderedImageView productImageView;
    private Spinner quantitySpinner;

    public CartEditModal(CartManager cartmanager)
    {
        super(cartmanager.getActivity());
        cartManager = cartmanager;
        init();
    }

    private void animateModalView()
    {
        if (modalView == null)
        {
            return;
        } else
        {
            TranslateAnimation translateanimation = new TranslateAnimation(0.0F, 0.0F, ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay().getHeight(), 0.0F);
            translateanimation.setFillAfter(false);
            translateanimation.setDuration(250L);
            translateanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final CartEditModal this$0;

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
                this$0 = CartEditModal.this;
                super();
            }
            });
            modalView.startAnimation(translateanimation);
            return;
        }
    }

    private void handleClose()
    {
        cartManager.getActivity().clearOverlay();
        callback.onCancel();
        callback = null;
    }

    private void handleDone()
    {
        cartManager.getActivity().clearOverlay();
        callback.onEdit(cartItem, quantitySpinner.getSelectedItemPosition() + 1);
        callback = null;
    }

    public void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030021, this);
        modalView = view.findViewById(0x7f0d00da);
        quantitySpinner = (Spinner)view.findViewById(0x7f0d00dd);
        Object obj = new ArrayList();
        for (int i = 1; (long)i <= 15L; i++)
        {
            ((ArrayList) (obj)).add(Integer.toString(i));
        }

        obj = new ArrayAdapter(getContext(), 0x7f03002a, ((java.util.List) (obj)));
        ((ArrayAdapter) (obj)).setDropDownViewResource(0x1090009);
        quantitySpinner.setAdapter(((android.widget.SpinnerAdapter) (obj)));
        productImageView = (BorderedImageView)view.findViewById(0x7f0d00db);
        productImageView.getImageView().setRequestedImageWidth(100);
        productImageView.getImageView().setRequestedImageHeight(100);
        doneButton = (TextView)view.findViewById(0x7f0d00de);
        doneButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartEditModal this$0;

            public void onClick(View view1)
            {
                handleDone();
            }

            
            {
                this$0 = CartEditModal.this;
                super();
            }
        });
        closeButton = view.findViewById(0x7f0d00dc);
        closeButton.setOnClickListener(new android.view.View.OnClickListener() {

            final CartEditModal this$0;

            public void onClick(View view1)
            {
                handleClose();
            }

            
            {
                this$0 = CartEditModal.this;
                super();
            }
        });
        setBackgroundColor(getResources().getColor(0x7f0c006e));
    }

    public void showForCartItem(WishCartItem wishcartitem, Callback callback1)
    {
        callback = callback1;
        cartItem = wishcartitem;
        productImageView.getImageView().setImageUrl(wishcartitem.getImage().getUrlString(com.contextlogic.wish.api.data.WishImage.ImageSize.Medium));
        quantitySpinner.setSelection(cartItem.getQuantity() - 1);
        cartManager.getActivity().clearOverlay();
        cartManager.getActivity().showOverlay(this, false);
        animateModalView();
    }



}
