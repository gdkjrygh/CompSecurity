// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishSignupFreeGifts;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.grid.StaggeredGridCellView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridView;
import com.contextlogic.wish.ui.components.grid.StaggeredGridViewListener;
import com.contextlogic.wish.ui.components.text.UnifiedFontTextView;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartUiView;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupFreeGiftsAbandonModal, SignupFreeGiftGridAdapter

public class SignupFreeGiftFeedView extends CartUiView
    implements StaggeredGridViewListener
{
    public static interface SignupFreeGiftCallback
    {

        public abstract void onCancel();

        public abstract void onGiftChosen(WishProduct wishproduct);
    }


    private SignupFreeGiftGridAdapter adapter;
    private UnifiedFontTextView appreciationTextView;
    private final SignupFreeGiftCallback callback;
    private CartManager cartManager;
    private UnifiedFontTextView chooseGiftTextView;
    private WishSignupFreeGifts freeGifts;
    private UnifiedFontTextView noThanksTextView;
    private StaggeredGridView productView;
    private UnifiedFontTextView thanksTextView;

    public SignupFreeGiftFeedView(CartManager cartmanager, WishSignupFreeGifts wishsignupfreegifts, SignupFreeGiftCallback signupfreegiftcallback)
    {
        super(cartmanager);
        callback = signupfreegiftcallback;
        freeGifts = wishsignupfreegifts;
        cartManager = cartmanager;
        init();
    }

    private void handleCancel()
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_CLAIM_CANCEL_BUTTON);
        if (freeGifts.getAbandonInfo() != null)
        {
            trackEvent(WishAnalyticsEvent.IMPRESSION_FREE_GIFTS_ABANDONMENT_MODAL);
            SignupFreeGiftsAbandonModal signupfreegiftsabandonmodal = new SignupFreeGiftsAbandonModal(getContext());
            signupfreegiftsabandonmodal.setup(freeGifts.getAbandonInfo(), new SignupFreeGiftsAbandonModal.Callback() {

                final SignupFreeGiftFeedView this$0;

                public void onAbandon()
                {
                    cartManager.getActivity().clearOverlay();
                    trackEvent(WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_ABANDONMENT_MODAL_PROCEED);
                    callback.onCancel();
                }

                public void onDismiss()
                {
                    trackEvent(WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_ABANDONMENT_MODAL_RETURN);
                    cartManager.getActivity().clearOverlay();
                }

            
            {
                this$0 = SignupFreeGiftFeedView.this;
                super();
            }
            });
            cartManager.getActivity().showOverlay(signupfreegiftsabandonmodal, false);
            return;
        } else
        {
            callback.onCancel();
            return;
        }
    }

    private void init()
    {
        Object obj = (LayoutInflater)getContext().getSystemService("layout_inflater");
        productView = (StaggeredGridView)((LayoutInflater) (obj)).inflate(0x7f0300a3, this).findViewById(0x7f0d0343);
        adapter = new SignupFreeGiftGridAdapter(getContext(), productView, freeGifts.getSignupGiftProducts());
        productView.setAdapter(adapter);
        FrameLayout framelayout = new FrameLayout(getContext());
        framelayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, (int)TypedValue.applyDimension(1, 10F, getResources().getDisplayMetrics())));
        obj = ((LayoutInflater) (obj)).inflate(0x7f0300a4, productView, false);
        productView.addHeaderView(((View) (obj)));
        productView.addFooterView(framelayout);
        productView.reloadData();
        productView.setListener(this);
        thanksTextView = (UnifiedFontTextView)((View) (obj)).findViewById(0x7f0d0346);
        appreciationTextView = (UnifiedFontTextView)((View) (obj)).findViewById(0x7f0d0347);
        chooseGiftTextView = (UnifiedFontTextView)((View) (obj)).findViewById(0x7f0d0348);
        thanksTextView.setText(freeGifts.getTitle());
        appreciationTextView.setText(freeGifts.getSubtitle());
        chooseGiftTextView.setText(freeGifts.getMessage());
        noThanksTextView = (UnifiedFontTextView)((View) (obj)).findViewById(0x7f0d0345);
        noThanksTextView.setOnClickListener(new android.view.View.OnClickListener() {

            final SignupFreeGiftFeedView this$0;

            public void onClick(View view)
            {
                handleCancel();
            }

            
            {
                this$0 = SignupFreeGiftFeedView.this;
                super();
            }
        });
        if (freeGifts.getAbandonInfo() != null)
        {
            noThanksTextView.setTextSize(1, 10F);
            noThanksTextView.setTextColor(getResources().getColor(0x7f0c00ea));
        }
        cartManager.hideLoadingSpinner();
    }

    public void cleanup()
    {
    }

    public WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        return null;
    }

    public boolean onBackPressed()
    {
        return true;
    }

    public void onCartDataUpdated()
    {
    }

    public boolean onLongClickCell(StaggeredGridCellView staggeredgridcellview, int i)
    {
        return false;
    }

    public void onScrollChanged(int i, int j, int k, int l)
    {
    }

    public void onSelectCell(StaggeredGridCellView staggeredgridcellview, int i)
    {
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_CLAIM_BUTTON);
        staggeredgridcellview = (WishProduct)freeGifts.getSignupGiftProducts().get(i);
        callback.onGiftChosen(staggeredgridcellview);
    }





}
