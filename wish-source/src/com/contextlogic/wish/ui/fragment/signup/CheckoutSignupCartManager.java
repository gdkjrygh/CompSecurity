// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.signup;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCartItem;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishSignupFreeGiftCart;
import com.contextlogic.wish.api.data.WishSignupFreeGifts;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.api.service.ClaimFreeSignupGiftService;
import com.contextlogic.wish.api.service.GetSignupFreeGiftsService;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.fragment.cartmodal.CartExperimentManager;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.checkout.CartCheckoutActionManager;
import com.contextlogic.wish.ui.fragment.cartmodal.checkout.PlaceOrderCheckoutManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartUiView;
import com.contextlogic.wish.ui.fragment.product.tabbeddetails.ProductDetailsAddToCartModal;
import com.contextlogic.wish.user.UserPreferences;
import com.google.android.gms.wallet.MaskedWallet;

// Referenced classes of package com.contextlogic.wish.ui.fragment.signup:
//            SignupFreeGiftCartFrameView, SignupFreeGiftFeedView, SignupUpdateProfileFragment, DataEntryCheckoutSignupCartManager, 
//            SignupFreeGiftAppliedModal

public class CheckoutSignupCartManager
    implements CartManager
{

    private static final long TRANSITION_ANIMATION_TIME = 250L;
    private ProductDetailsAddToCartModal addToCartModal;
    private String addedToCartVariationId;
    private WishCart cart;
    private CartCheckoutActionManager cartCheckoutActionManager;
    private SignupFreeGiftCartFrameView cartFrame;
    private ClaimFreeSignupGiftService claimFreeSignupGiftService;
    private CartUiView currentUiView;
    private WishSignupFreeGiftCart freeGiftCart;
    private boolean freeGiftFlowCompleted;
    private WishSignupFreeGifts freeGifts;
    private GetSignupFreeGiftsService getSignupFreeGiftsService;
    private boolean isAddingToCart;
    private boolean returnToShipping;
    private RootActivity rootActivity;
    private WishProduct selectedProduct;
    private WishShippingInfo shippingInfo;
    private com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow signupFlow;
    private WishUserBillingInfo userBillingInfo;

    public CheckoutSignupCartManager(RootActivity rootactivity, com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow wishsignupflow)
    {
        rootActivity = rootactivity;
        claimFreeSignupGiftService = new ClaimFreeSignupGiftService();
        getSignupFreeGiftsService = new GetSignupFreeGiftsService();
        signupFlow = wishsignupflow;
        isAddingToCart = false;
        if (rootactivity != null)
        {
            rootactivity.startDeviceCollector();
        }
    }

    private void cancelAllRequests()
    {
        claimFreeSignupGiftService.cancelAllRequests();
        getSignupFreeGiftsService.cancelAllRequests();
    }

    private void handleAddToCartFailure(String s)
    {
        showErrorMessage(s, getActivity().getString(0x7f060173));
    }

    private void handleCartLoaded(WishCart wishcart, WishShippingInfo wishshippinginfo, WishUserBillingInfo wishuserbillinginfo)
    {
        updateData(wishcart, wishshippinginfo, wishuserbillinginfo);
        getCartCheckoutActionManager().checkout();
    }

    private void handleLoadingFailure(String s)
    {
        hideLoadingSpinner();
        showErrorMessage(s);
        close();
    }

    private void handleLoadingSuccess(WishSignupFreeGifts wishsignupfreegifts)
    {
        freeGifts = wishsignupfreegifts;
        initializeUi(wishsignupfreegifts);
    }

    private boolean hasCreditCardBillingInfo()
    {
        return cart != null && userBillingInfo != null && userBillingInfo.getCreditCardInfo(cart.getPaymentProcessor()) != null;
    }

    private void initializeUi(final WishSignupFreeGifts freeGifts)
    {
        trackEvent(WishAnalyticsEvent.IMPRESSION_MOBILE_FREE_GIFTS_SCREEN);
        cartFrame = new SignupFreeGiftCartFrameView(this);
        updateCurrentView(new SignupFreeGiftFeedView(this, freeGifts, new SignupFreeGiftFeedView.SignupFreeGiftCallback() {

            final CheckoutSignupCartManager this$0;
            final WishSignupFreeGifts val$freeGifts;

            public void onCancel()
            {
                close();
            }

            public void onGiftChosen(WishProduct wishproduct)
            {
                if (wishproduct == null)
                {
                    return;
                } else
                {
                    onGiftSelected(wishproduct, freeGifts);
                    return;
                }
            }

            
            {
                this$0 = CheckoutSignupCartManager.this;
                freeGifts = wishsignupfreegifts;
                super();
            }
        }), false);
        rootActivity.populateCartContainer(cartFrame);
        rootActivity.closeMenus();
        cartFrame.animateOpen();
    }

    private void notifyUiOfDataChange()
    {
        if (currentUiView != null)
        {
            currentUiView.onCartDataUpdated();
        }
    }

    private void onGiftSelected(WishProduct wishproduct, WishSignupFreeGifts wishsignupfreegifts)
    {
        if (isAddingToCart)
        {
            return;
        }
        selectedProduct = wishproduct;
        isAddingToCart = true;
        if (wishproduct.hasSelectableOptions())
        {
            addToCartModal = new ProductDetailsAddToCartModal(getActivity(), null, 0, true, wishsignupfreegifts.getClaimGiftText());
            addToCartModal.setOnClickListener(new android.view.View.OnClickListener() {

                final CheckoutSignupCartManager this$0;

                public void onClick(View view)
                {
                }

            
            {
                this$0 = CheckoutSignupCartManager.this;
                super();
            }
            });
            addToCartModal.setProduct(wishproduct, null);
            addToCartModal.setCallback(new com.contextlogic.wish.ui.fragment.product.tabbeddetails.ProductDetailsAddToCartModal.Callback() {

                final CheckoutSignupCartManager this$0;

                public void onAddToCart(String s, String s1, int i)
                {
                    getActivity().clearOverlay();
                    addToCartModal = null;
                    addToCart(s, s1, null, 1);
                }

                public void onAddToCartCancel()
                {
                    isAddingToCart = false;
                    getActivity().clearOverlay();
                    addToCartModal = null;
                }

            
            {
                this$0 = CheckoutSignupCartManager.this;
                super();
            }
            });
            getActivity().showOverlay(addToCartModal, false);
            return;
        } else
        {
            addToCart(wishproduct.getProductId(), wishproduct.getDefaultCommerceVariationId(), null, 1);
            return;
        }
    }

    private void trackCurrentView()
    {
        if (currentUiView != null && currentUiView.getWishAnalyticsPageViewType() != null)
        {
            trackEvent(currentUiView.getWishAnalyticsPageViewType());
        }
    }

    public void addToCart(String s, String s1)
    {
        addToCart(s, s1, null);
    }

    public void addToCart(String s, String s1, String s2)
    {
        addToCart(s, s1, s2, 1);
    }

    public void addToCart(String s, String s1, String s2, int i)
    {
        showLoadingSpinner();
        isAddingToCart = true;
        addedToCartVariationId = s1;
        claimFreeSignupGiftService.requestService(s, s1, false, new com.contextlogic.wish.api.service.ClaimFreeSignupGiftService.SuccessCallback() {

            final CheckoutSignupCartManager this$0;

            public void onServiceSucceeded(WishSignupFreeGiftCart wishsignupfreegiftcart)
            {
                hideLoadingSpinner();
                freeGiftCart = wishsignupfreegiftcart;
                handleCartLoaded(wishsignupfreegiftcart.getCart(), null, null);
                isAddingToCart = false;
            }

            
            {
                this$0 = CheckoutSignupCartManager.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ClaimFreeSignupGiftService.FailureCallback() {

            final CheckoutSignupCartManager this$0;

            public void onServiceFailed(String s3)
            {
                hideLoadingSpinner();
                handleAddToCartFailure(s3);
                isAddingToCart = false;
            }

            
            {
                this$0 = CheckoutSignupCartManager.this;
                super();
            }
        });
    }

    public void close()
    {
        if (currentUiView != null)
        {
            currentUiView.cleanup();
        }
        rootActivity.clearCartManager();
        if (!freeGiftFlowCompleted)
        {
            if (signupFlow != null && signupFlow != com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow.GenderFreeGifts)
            {
                SignupUpdateProfileFragment signupupdateprofilefragment = new SignupUpdateProfileFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("ArgSignupFlow", com.contextlogic.wish.ui.activity.login.LoginActivity.WishSignupFlow.None);
                signupupdateprofilefragment.setArguments(bundle);
                rootActivity.setModalContentFragment(signupupdateprofilefragment, true);
            } else
            if (signupFlow != null)
            {
                com.contextlogic.wish.ui.fragment.base.BaseContentFragment basecontentfragment = rootActivity.getFirstFeedFragment(false);
                rootActivity.setContentFragment(basecontentfragment, true);
                return;
            }
        }
    }

    public RootActivity getActivity()
    {
        return rootActivity;
    }

    public String getAddedToCartVariationId()
    {
        return addedToCartVariationId;
    }

    public WishCart getCart()
    {
        return cart;
    }

    public CartCheckoutActionManager getCartCheckoutActionManager()
    {
        return cartCheckoutActionManager;
    }

    public String getCheckoutOfferId()
    {
        return null;
    }

    public String getCurrencyCode()
    {
        if (cart == null || CartExperimentManager.mustUseUsd(this))
        {
            return "USD";
        } else
        {
            return cart.getTotal().getLocalizedCurrencyCode();
        }
    }

    public CartUiView getCurrentUiView()
    {
        return currentUiView;
    }

    public String getEffectivePaymentMode()
    {
        if (UserPreferences.getPreferredPaymentMode().equals("PaymentModePayPal"))
        {
            return "PaymentModePayPal";
        } else
        {
            return "PaymentModeCC";
        }
    }

    public MaskedWallet getGoogleWalletMaskedWallet()
    {
        return null;
    }

    public WishShippingInfo getShippingInfo()
    {
        return shippingInfo;
    }

    public WishUserBillingInfo getUserBillingInfo()
    {
        return userBillingInfo;
    }

    public WishSignupFreeGiftCart getWishSignupFreeGiftCart()
    {
        return freeGiftCart;
    }

    public boolean googleWalletMaskedWalletNeedsReload()
    {
        return false;
    }

    public boolean hasValidBillingInfo()
    {
        String s = getEffectivePaymentMode();
        return s.equals("PaymentModeCC") && hasCreditCardBillingInfo() || s.equals("PaymentModePayPal");
    }

    public boolean hasValidShippingInfo()
    {
        if (returnToShipping)
        {
            returnToShipping = false;
        } else
        if (shippingInfo != null)
        {
            return true;
        }
        return false;
    }

    public void hideLoadingSpinner()
    {
        rootActivity.hideLoadingSpinner();
    }

    public void markGoogleWalletMaskedWalletNeedsReload()
    {
    }

    public void onBackPressed()
    {
        while (currentUiView != null && currentUiView.onBackPressed() || cartCheckoutActionManager != null && cartCheckoutActionManager.onBackPressed()) 
        {
            return;
        }
        close();
    }

    public void removeProduct(WishCartItem wishcartitem)
    {
    }

    public void requestClose()
    {
    }

    public void setBackButtonInfo(boolean flag)
    {
        returnToShipping = flag;
    }

    public void showBrowser(String s, boolean flag)
    {
        if (flag)
        {
            freeGiftFlowCompleted = true;
            close();
            (new Handler()).post(new Runnable() {

                final CheckoutSignupCartManager this$0;

                public void run()
                {
                    RootActivity rootactivity = rootActivity;
                    if (rootactivity != null)
                    {
                        rootactivity.setContentFragment(rootactivity.getFirstFeedFragment(false), true);
                        trackEvent(WishAnalyticsEvent.IMPRESSION_MOBILE_FREE_GIFT_APPLIED_MODAL);
                        SignupFreeGiftAppliedModal signupfreegiftappliedmodal = new SignupFreeGiftAppliedModal(rootactivity);
                        signupfreegiftappliedmodal.setup(selectedProduct, freeGiftCart, rootactivity. new android.view.View.OnClickListener() {

                            final _cls7 this$1;
                            final RootActivity val$rootActivity;

                            public void onClick(View view)
                            {
                                trackEvent(WishAnalyticsEvent.CLICK_MOBILE_FREE_GIFT_APPLIED_MODAL_CONTINUE);
                                rootActivity.clearOverlay();
                            }

            
            {
                this$1 = final__pcls7;
                rootActivity = RootActivity.this;
                super();
            }
                        });
                        rootactivity.showOverlay(signupfreegiftappliedmodal, false);
                    }
                }

            
            {
                this$0 = CheckoutSignupCartManager.this;
                super();
            }
            });
            return;
        } else
        {
            handleAddToCartFailure(null);
            return;
        }
    }

    public void showCart()
    {
    }

    public void showErrorMessage(String s)
    {
        showErrorMessage(s, null);
    }

    public void showErrorMessage(String s, String s1)
    {
        String s2 = s;
        if (s == null)
        {
            s2 = s1;
        }
        PopupAlertDialog.showError(rootActivity, rootActivity.getString(0x7f06030d), s2);
    }

    public void showFreeGiftsView()
    {
        showLoadingSpinner();
        if (selectedProduct != null)
        {
            claimFreeSignupGiftService.requestService(selectedProduct.getProductId(), addedToCartVariationId, true, new com.contextlogic.wish.api.service.ClaimFreeSignupGiftService.SuccessCallback() {

                final CheckoutSignupCartManager this$0;

                public void onServiceSucceeded(WishSignupFreeGiftCart wishsignupfreegiftcart)
                {
                    freeGiftCart = null;
                    addedToCartVariationId = null;
                    selectedProduct = null;
                    hideLoadingSpinner();
                    showFreeGiftsView();
                }

            
            {
                this$0 = CheckoutSignupCartManager.this;
                super();
            }
            }, new com.contextlogic.wish.api.service.ClaimFreeSignupGiftService.FailureCallback() {

                final CheckoutSignupCartManager this$0;

                public void onServiceFailed(String s)
                {
                    hideLoadingSpinner();
                    handleAddToCartFailure(s);
                }

            
            {
                this$0 = CheckoutSignupCartManager.this;
                super();
            }
            });
            return;
        }
        if (freeGifts != null)
        {
            initializeUi(freeGifts);
            return;
        } else
        {
            getSignupFreeGiftsService.requestService(new com.contextlogic.wish.api.service.GetSignupFreeGiftsService.SuccessCallback() {

                final CheckoutSignupCartManager this$0;

                public void onServiceSucceeded(WishSignupFreeGifts wishsignupfreegifts)
                {
                    handleLoadingSuccess(wishsignupfreegifts);
                }

            
            {
                this$0 = CheckoutSignupCartManager.this;
                super();
            }
            }, new com.contextlogic.wish.api.service.GetSignupFreeGiftsService.FailureCallback() {

                final CheckoutSignupCartManager this$0;

                public void onServiceFailed(String s)
                {
                    handleLoadingFailure(s);
                }

            
            {
                this$0 = CheckoutSignupCartManager.this;
                super();
            }
            });
            return;
        }
    }

    public void showLoadingSpinner()
    {
        rootActivity.showLoadingSpinner();
    }

    public void showPriceExpiryInfo(WishCartItem wishcartitem)
    {
    }

    public void trackEvent(WishAnalyticsEvent wishanalyticsevent)
    {
        (new LogService()).requestService(Integer.toString(wishanalyticsevent.getValue()), null, null, null);
    }

    public void updateCart(String s, String s1, int i)
    {
    }

    public void updateCheckoutActionManager()
    {
        boolean flag = hasValidBillingInfo();
        boolean flag1 = hasValidShippingInfo();
        if (flag && flag1)
        {
            cartCheckoutActionManager = new PlaceOrderCheckoutManager(this, getEffectivePaymentMode());
            return;
        } else
        {
            cartCheckoutActionManager = new DataEntryCheckoutSignupCartManager(this);
            return;
        }
    }

    public void updateCurrentView(final CartUiView uiView, boolean flag)
    {
        if (flag && currentUiView != null)
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setFillAfter(false);
            alphaanimation.setDuration(250L);
            alphaanimation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final CheckoutSignupCartManager this$0;
                final CartUiView val$uiView;

                public void onAnimationEnd(Animation animation)
                {
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                    currentUiView.cleanup();
                    cartFrame.setContentView(uiView);
                    currentUiView = uiView;
                    trackCurrentView();
                    animation = new AlphaAnimation(0.0F, 1.0F);
                    animation.setFillBefore(true);
                    animation.setDuration(250L);
                    uiView.startAnimation(animation);
                }

            
            {
                this$0 = CheckoutSignupCartManager.this;
                uiView = cartuiview;
                super();
            }
            });
            currentUiView.startAnimation(alphaanimation);
            return;
        }
        if (currentUiView != null)
        {
            currentUiView.cleanup();
        }
        cartFrame.setContentView(uiView);
        currentUiView = uiView;
        trackCurrentView();
    }

    public void updateData(WishCart wishcart, WishShippingInfo wishshippinginfo, WishUserBillingInfo wishuserbillinginfo)
    {
        cart = wishcart;
        shippingInfo = wishshippinginfo;
        userBillingInfo = wishuserbillinginfo;
        updateCheckoutActionManager();
        notifyUiOfDataChange();
    }

    public void updateGoogleWalletMaskedWallet(MaskedWallet maskedwallet)
    {
    }

    public void updatePreferredPaymentMode(String s)
    {
        UserPreferences.setPreferredPaymentMode(s);
        updateData(cart, shippingInfo, userBillingInfo);
    }



/*
    static WishSignupFreeGiftCart access$002(CheckoutSignupCartManager checkoutsignupcartmanager, WishSignupFreeGiftCart wishsignupfreegiftcart)
    {
        checkoutsignupcartmanager.freeGiftCart = wishsignupfreegiftcart;
        return wishsignupfreegiftcart;
    }

*/


/*
    static ProductDetailsAddToCartModal access$1002(CheckoutSignupCartManager checkoutsignupcartmanager, ProductDetailsAddToCartModal productdetailsaddtocartmodal)
    {
        checkoutsignupcartmanager.addToCartModal = productdetailsaddtocartmodal;
        return productdetailsaddtocartmodal;
    }

*/


/*
    static String access$102(CheckoutSignupCartManager checkoutsignupcartmanager, String s)
    {
        checkoutsignupcartmanager.addedToCartVariationId = s;
        return s;
    }

*/



/*
    static CartUiView access$1102(CheckoutSignupCartManager checkoutsignupcartmanager, CartUiView cartuiview)
    {
        checkoutsignupcartmanager.currentUiView = cartuiview;
        return cartuiview;
    }

*/





/*
    static WishProduct access$202(CheckoutSignupCartManager checkoutsignupcartmanager, WishProduct wishproduct)
    {
        checkoutsignupcartmanager.selectedProduct = wishproduct;
        return wishproduct;
    }

*/






/*
    static boolean access$702(CheckoutSignupCartManager checkoutsignupcartmanager, boolean flag)
    {
        checkoutsignupcartmanager.isAddingToCart = flag;
        return flag;
    }

*/


}
