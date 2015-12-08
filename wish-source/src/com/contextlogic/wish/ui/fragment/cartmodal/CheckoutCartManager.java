// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.api.data.WishAddToCartOfferApplied;
import com.contextlogic.wish.api.data.WishCart;
import com.contextlogic.wish.api.data.WishCartAbandonOffer;
import com.contextlogic.wish.api.data.WishCartEducationModalSpec;
import com.contextlogic.wish.api.data.WishCartItem;
import com.contextlogic.wish.api.data.WishCheckoutOffer;
import com.contextlogic.wish.api.data.WishLocalizedCurrencyValue;
import com.contextlogic.wish.api.data.WishProduct;
import com.contextlogic.wish.api.data.WishShippingInfo;
import com.contextlogic.wish.api.data.WishUpsellOffer;
import com.contextlogic.wish.api.data.WishUserBillingInfo;
import com.contextlogic.wish.api.service.GetCartService;
import com.contextlogic.wish.api.service.LogService;
import com.contextlogic.wish.api.service.UpdateCartService;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.fragment.cartmodal.checkout.CartCheckoutActionManager;
import com.contextlogic.wish.ui.fragment.cartmodal.checkout.DataEntryCheckoutManager;
import com.contextlogic.wish.ui.fragment.cartmodal.checkout.GoogleWalletCheckoutManager;
import com.contextlogic.wish.ui.fragment.cartmodal.checkout.KlarnaCheckoutManager;
import com.contextlogic.wish.ui.fragment.cartmodal.checkout.PlaceOrderCheckoutManager;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartAbandonOfferModal;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartAddToCartOfferAppliedModal;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartEducationModal;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartFrameView;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartPriceExpiryModal;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartUiView;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartUpsellModal;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.items.CartItemsView;
import com.contextlogic.wish.ui.fragment.embeddedbrowser.EmbeddedBrowserFragment;
import com.contextlogic.wish.ui.fragment.product.tabbeddetails.ProductDetailsAddToCartModal;
import com.contextlogic.wish.user.UserPreferences;
import com.contextlogic.wish.util.TabletUtil;
import com.google.android.gms.wallet.MaskedWallet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal:
//            CartManager, CartExperimentManager

public class CheckoutCartManager
    implements CartManager
{

    private static final long TRANSITION_ANIMATION_TIME = 250L;
    private ProductDetailsAddToCartModal addToCartModal;
    private String addedToCartProductId;
    private String addedToCartVariationId;
    private WishCart cart;
    private CartCheckoutActionManager cartCheckoutActionManager;
    private CartFrameView cartFrame;
    private CartUiView currentUiView;
    private WishCartEducationModalSpec educationModalSpec;
    private GetCartService getCartService;
    private MaskedWallet googleWalletMaskedWallet;
    private boolean googleWalletMaskedWalletNeedsReload;
    private RootActivity rootActivity;
    private WishShippingInfo shippingInfo;
    private boolean showEducationModal;
    private boolean showUpsellModal;
    private String storedErrorMessage;
    private UpdateCartService updateCartService;
    private WishUpsellOffer upsellOffer;
    private WishUserBillingInfo userBillingInfo;

    public CheckoutCartManager(RootActivity rootactivity)
    {
        rootActivity = rootactivity;
        getCartService = new GetCartService();
        updateCartService = new UpdateCartService();
        if (rootactivity != null)
        {
            rootactivity.startDeviceCollector();
        }
    }

    private void cancelAllRequests()
    {
        getCartService.cancelAllRequests();
        updateCartService.cancelAllRequests();
    }

    private void handleAddToCartFailure(String s)
    {
        storedErrorMessage = s;
        showCart();
    }

    private boolean handleCartAbandonOffer()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (cart != null)
        {
            flag = flag1;
            if (cart.getItems() != null)
            {
                flag = flag1;
                if (cart.getItems().size() > 0)
                {
                    flag = flag1;
                    if (cart.getCartAbandonOffer() != null)
                    {
                        flag = flag1;
                        if (!cart.getCartAbandonOffer().isExpired())
                        {
                            CartAbandonOfferModal cartabandonoffermodal = new CartAbandonOfferModal(getActivity());
                            cartabandonoffermodal.setup(this, cart.getCartAbandonOffer(), new com.contextlogic.wish.ui.fragment.cartmodal.ui.CartAbandonOfferModal.Callback() {

                                final CheckoutCartManager this$0;

                                public void onClaim(WishCart wishcart)
                                {
                                    getActivity().clearOverlay();
                                    updateData(wishcart, shippingInfo, userBillingInfo);
                                    if (cartCheckoutActionManager != null)
                                    {
                                        cartCheckoutActionManager.checkout();
                                    }
                                }

                                public void onDismiss()
                                {
                                    getActivity().clearOverlay();
                                    close();
                                }

                                public void onError()
                                {
                                    rootActivity.clearOverlay();
                                    showErrorMessage(getActivity().getString(0x7f060202));
                                    close();
                                }

            
            {
                this$0 = CheckoutCartManager.this;
                super();
            }
                            });
                            getActivity().showOverlay(cartabandonoffermodal, false);
                            flag = true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    private void handleCartLoaded(WishCart wishcart, WishShippingInfo wishshippinginfo, WishUserBillingInfo wishuserbillinginfo)
    {
        updateData(wishcart, wishshippinginfo, wishuserbillinginfo);
        initializeUi();
        if (storedErrorMessage != null)
        {
            showErrorMessage(storedErrorMessage);
            storedErrorMessage = null;
        }
        processAddToCartOffer();
    }

    private boolean hasBoletoBillingInfo()
    {
        return userBillingInfo != null && userBillingInfo.getBoletoInfo() != null;
    }

    private boolean hasCreditCardBillingInfo()
    {
        return cart != null && userBillingInfo != null && userBillingInfo.getCreditCardInfo(cart.getPaymentProcessor()) != null;
    }

    private boolean hasGoogleWalletBillingInfo()
    {
        return googleWalletMaskedWallet != null;
    }

    private boolean hasKlarnaBillingInfo()
    {
        return userBillingInfo != null && userBillingInfo.getKlarnaInfo() != null;
    }

    private boolean hasOxxoBillingInfo()
    {
        return userBillingInfo != null && userBillingInfo.getOxxoInfo() != null;
    }

    private void initializeUi()
    {
        cartFrame = new CartFrameView(this);
        trackEvent(WishAnalyticsEvent.IMPRESSION_MOBILE_CART);
        updateCurrentView(new CartItemsView(this), false);
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

    private void processAddToCartOffer()
    {
        if (cart.getAddToCartOfferApplied() != null && !cart.getAddToCartOfferApplied().isExpired())
        {
            CartAddToCartOfferAppliedModal cartaddtocartofferappliedmodal = new CartAddToCartOfferAppliedModal(getActivity());
            cartaddtocartofferappliedmodal.setup(cart.getAddToCartOfferApplied(), new android.view.View.OnClickListener() {

                final CheckoutCartManager this$0;

                public void onClick(View view)
                {
                    getActivity().clearOverlay();
                    if (showUpsellModal)
                    {
                        showUpsellModal();
                    } else
                    if (showEducationModal)
                    {
                        showEducationModal();
                        return;
                    }
                }

            
            {
                this$0 = CheckoutCartManager.this;
                super();
            }
            });
            getActivity().showOverlay(cartaddtocartofferappliedmodal, false, false);
        } else
        {
            if (showUpsellModal)
            {
                showUpsellModal();
                return;
            }
            if (showEducationModal)
            {
                showEducationModal();
                return;
            }
        }
    }

    private void showAddToCartModal(final WishProduct commerceProductId)
    {
        addToCartModal = new ProductDetailsAddToCartModal(getActivity());
        addToCartModal.setOnClickListener(new android.view.View.OnClickListener() {

            final CheckoutCartManager this$0;

            public void onClick(View view)
            {
            }

            
            {
                this$0 = CheckoutCartManager.this;
                super();
            }
        });
        addToCartModal.setProduct(commerceProductId, null);
        final String addToCartOfferId = commerceProductId.getAddToCartOfferId();
        commerceProductId = commerceProductId.getCommerceProductId();
        addToCartModal.setCallback(new com.contextlogic.wish.ui.fragment.product.tabbeddetails.ProductDetailsAddToCartModal.Callback() {

            final CheckoutCartManager this$0;
            final String val$addToCartOfferId;
            final String val$commerceProductId;

            public void onAddToCart(String s, String s1, int i)
            {
                getActivity().clearOverlay();
                addToCartModal = null;
                if (commerceProductId != null && s1 != null && i > 0)
                {
                    addToCart(commerceProductId, s1, addToCartOfferId, i);
                    return;
                } else
                {
                    showCart();
                    return;
                }
            }

            public void onAddToCartCancel()
            {
                getActivity().clearOverlay();
                addToCartModal = null;
            }

            
            {
                this$0 = CheckoutCartManager.this;
                commerceProductId = s;
                addToCartOfferId = s1;
                super();
            }
        });
        getActivity().showOverlay(addToCartModal, false);
    }

    private void showEducationModal()
    {
        showEducationModal = false;
        if (educationModalSpec != null && !TabletUtil.isTablet(getActivity()))
        {
            CartEducationModal carteducationmodal = new CartEducationModal(getActivity());
            carteducationmodal.setup(educationModalSpec, new android.view.View.OnClickListener() {

                final CheckoutCartManager this$0;

                public void onClick(View view)
                {
                    trackEvent(WishAnalyticsEvent.CLICK_CART_EDUCATION_MODAL_BUTTON);
                    getActivity().clearOverlay();
                }

            
            {
                this$0 = CheckoutCartManager.this;
                super();
            }
            });
            trackEvent(WishAnalyticsEvent.IMPRESSION_CART_EDUCATION_MODAL);
            getActivity().showOverlay(carteducationmodal, false, true);
        }
    }

    private void showUpsellModal()
    {
        showUpsellModal = false;
        boolean flag1 = false;
        boolean flag = flag1;
        if (!cart.getItems().isEmpty())
        {
            WishCartItem wishcartitem = (WishCartItem)cart.getItems().get(0);
            flag = flag1;
            if (addedToCartProductId != null)
            {
                flag = flag1;
                if (!cart.getItems().isEmpty())
                {
                    flag = flag1;
                    if (wishcartitem.getProductId().equals(addedToCartProductId))
                    {
                        flag = flag1;
                        if (upsellOffer != null)
                        {
                            final CartUpsellModal cartUpsellModal = new CartUpsellModal(getActivity());
                            cartUpsellModal.setup(wishcartitem, upsellOffer, new android.view.View.OnClickListener() {

                                final CheckoutCartManager this$0;
                                final CartUpsellModal val$cartUpsellModal;

                                public void onClick(View view)
                                {
                                    cartUpsellModal.trackEvent(WishAnalyticsEvent.CLICK_MOBILE_UPSELL_MODAL_NO_THANKS_BUTTON);
                                    getActivity().clearOverlay();
                                    if (showEducationModal)
                                    {
                                        showEducationModal();
                                    }
                                }

            
            {
                this$0 = CheckoutCartManager.this;
                cartUpsellModal = cartupsellmodal;
                super();
            }
                            });
                            cartUpsellModal.setCallback(new com.contextlogic.wish.ui.fragment.cartmodal.ui.CartUpsellModal.Callback() {

                                final CheckoutCartManager this$0;

                                public void onAddToCartUpsell(WishProduct wishproduct)
                                {
                                    getActivity().clearOverlay();
                                    if (wishproduct.canShowAddToCartModal())
                                    {
                                        showAddToCartModal(wishproduct);
                                        return;
                                    } else
                                    {
                                        addToCart(wishproduct.getCommerceProductId(), wishproduct.getCommerceDefaultVariationId(), wishproduct.getAddToCartOfferId(), 1);
                                        return;
                                    }
                                }

            
            {
                this$0 = CheckoutCartManager.this;
                super();
            }
                            });
                            getActivity().showOverlay(cartUpsellModal, false, false);
                            flag = true;
                        }
                    }
                }
            }
        }
        if (!flag && showEducationModal)
        {
            showEducationModal();
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
        addedToCartVariationId = s1;
        addedToCartProductId = s;
        showLoadingSpinner();
        updateCartService.requestService(s, s1, i, true, s2, new com.contextlogic.wish.api.service.UpdateCartService.SuccessCallback() {

            final CheckoutCartManager this$0;

            public void onServiceSucceeded(WishCart wishcart, WishShippingInfo wishshippinginfo, WishUserBillingInfo wishuserbillinginfo, WishUpsellOffer wishupselloffer)
            {
                boolean flag1 = true;
                upsellOffer = wishupselloffer;
                CheckoutCartManager checkoutcartmanager = CheckoutCartManager.this;
                boolean flag;
                if (wishupselloffer != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                checkoutcartmanager.showUpsellModal = flag;
                checkoutcartmanager = CheckoutCartManager.this;
                if (wishcart != null)
                {
                    wishupselloffer = wishcart.getCartEducationModalSpec();
                } else
                {
                    wishupselloffer = null;
                }
                checkoutcartmanager.educationModalSpec = wishupselloffer;
                wishupselloffer = CheckoutCartManager.this;
                if (educationModalSpec != null)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                wishupselloffer.showEducationModal = flag;
                hideLoadingSpinner();
                handleCartLoaded(wishcart, wishshippinginfo, wishuserbillinginfo);
            }

            
            {
                this$0 = CheckoutCartManager.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.UpdateCartService.FailureCallback() {

            final CheckoutCartManager this$0;

            public void onServiceFailed(String s3)
            {
                handleAddToCartFailure(s3);
            }

            
            {
                this$0 = CheckoutCartManager.this;
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
        if (cart != null && cart.getCheckoutOffer() != null)
        {
            return cart.getCheckoutOffer().getOfferId();
        } else
        {
            return null;
        }
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
        if (CartExperimentManager.canCheckoutWithKlarnaOnly(this))
        {
            return "PaymentModeKlarna";
        }
        if (CartExperimentManager.canCheckoutWithKlarnaHybrid(this))
        {
            if (UserPreferences.getPreferredPaymentMode().equals("PaymentModePayPal"))
            {
                return "PaymentModePayPal";
            } else
            {
                return "PaymentModeKlarna";
            }
        }
        if (UserPreferences.getPreferredPaymentMode().equals("PaymentModeBoleto") && CartExperimentManager.canCheckoutWithBoleto(this))
        {
            return "PaymentModeBoleto";
        }
        if (UserPreferences.getPreferredPaymentMode().equals("PaymentModeOxxo") && CartExperimentManager.canCheckoutWithOxxo(this))
        {
            return "PaymentModeOxxo";
        }
        if (UserPreferences.getPreferredPaymentMode().equals("PaymentModePayPal") && CartExperimentManager.canCheckoutWithPayPal(this))
        {
            return "PaymentModePayPal";
        }
        if (UserPreferences.getPreferredPaymentMode().equals("PaymentModeGoogle") && CartExperimentManager.canCheckoutWithGoogleWallet(this))
        {
            return "PaymentModeGoogle";
        } else
        {
            return "PaymentModeCC";
        }
    }

    public MaskedWallet getGoogleWalletMaskedWallet()
    {
        return googleWalletMaskedWallet;
    }

    public WishShippingInfo getShippingInfo()
    {
        return shippingInfo;
    }

    public WishUserBillingInfo getUserBillingInfo()
    {
        return userBillingInfo;
    }

    public boolean googleWalletMaskedWalletNeedsReload()
    {
        return googleWalletMaskedWalletNeedsReload;
    }

    public boolean hasValidBillingInfo()
    {
        String s = getEffectivePaymentMode();
        return s.equals("PaymentModePayPal") || s.equals("PaymentModeCC") && hasCreditCardBillingInfo() || s.equals("PaymentModeBoleto") && hasBoletoBillingInfo() || s.equals("PaymentModeOxxo") && hasOxxoBillingInfo() || s.equals("PaymentModeKlarna") && hasKlarnaBillingInfo() || s.equals("PaymentModeGoogle") && hasGoogleWalletBillingInfo();
    }

    public boolean hasValidShippingInfo()
    {
        String s = getEffectivePaymentMode();
        return s.equals("PaymentModeGoogle") && hasGoogleWalletBillingInfo() || s.equals("PaymentModeKlarna") || !s.equals("PaymentModeGoogle") && shippingInfo != null;
    }

    public void hideLoadingSpinner()
    {
        rootActivity.hideLoadingSpinner();
    }

    public void markGoogleWalletMaskedWalletNeedsReload()
    {
        googleWalletMaskedWalletNeedsReload = true;
    }

    public void onBackPressed()
    {
        while (currentUiView != null && currentUiView.onBackPressed() || cartCheckoutActionManager != null && cartCheckoutActionManager.onBackPressed() || handleCartAbandonOffer()) 
        {
            return;
        }
        close();
    }

    public void removeProduct(final WishCartItem item)
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getActivity())).create();
        alertdialog.setTitle(getActivity().getString(0x7f060073));
        alertdialog.setMessage(getActivity().getString(0x7f060075));
        alertdialog.setButton(getActivity().getString(0x7f0602d8), new android.content.DialogInterface.OnClickListener() {

            final CheckoutCartManager this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
            }

            
            {
                this$0 = CheckoutCartManager.this;
                super();
            }
        });
        alertdialog.setButton2(getActivity().getString(0x7f060488), new android.content.DialogInterface.OnClickListener() {

            final CheckoutCartManager this$0;
            final WishCartItem val$item;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                updateCart(item.getProductId(), item.getVariationId(), 0);
            }

            
            {
                this$0 = CheckoutCartManager.this;
                item = wishcartitem;
                super();
            }
        });
        alertdialog.show();
    }

    public void requestClose()
    {
        getActivity().hideKeyboard();
        if (!handleCartAbandonOffer())
        {
            close();
        }
    }

    public void setBackButtonInfo(boolean flag)
    {
    }

    public void showBrowser(String s, boolean flag)
    {
        Bundle bundle;
        bundle = new Bundle();
        bundle.putString("ArgInitialUrl", s);
        bundle.putBoolean("ArgUseNativeStyle", true);
        bundle.putBoolean("ArgFromCheckout", true);
        s = null;
        Object obj;
        obj = new JSONArray();
        HashSet hashset = new HashSet();
        Iterator iterator = cart.getItems().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            WishCartItem wishcartitem = (WishCartItem)iterator.next();
            if (!hashset.contains(wishcartitem.getProductId()))
            {
                hashset.add(wishcartitem.getProductId());
                ((JSONArray) (obj)).put(wishcartitem.getProductId());
            }
        } while (true);
          goto _L1
        obj;
_L3:
        if (s != null)
        {
            bundle.putString("ArgCartItemIds", s);
        }
        s = new EmbeddedBrowserFragment();
        s.setArguments(bundle);
        bundle.putDouble("ArgCartAmount", cart.getTotal().getValue());
        bundle.putString("ArgCurrencyCode", cart.getTotal().getLocalizedCurrencyCode());
        rootActivity.setContentFragment(s, false);
        close();
        return;
_L1:
        obj = ((JSONArray) (obj)).toString();
        s = ((String) (obj));
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void showCart()
    {
        showLoadingSpinner();
        getCartService.requestService(null, null, new com.contextlogic.wish.api.service.GetCartService.SuccessCallback() {

            final CheckoutCartManager this$0;

            public void onServiceSucceeded(WishCart wishcart, WishShippingInfo wishshippinginfo, WishUserBillingInfo wishuserbillinginfo)
            {
                hideLoadingSpinner();
                handleCartLoaded(wishcart, wishshippinginfo, wishuserbillinginfo);
            }

            
            {
                this$0 = CheckoutCartManager.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

            final CheckoutCartManager this$0;

            public void onServiceFailed()
            {
                hideLoadingSpinner();
                showErrorMessage(rootActivity.getString(0x7f060175));
            }

            
            {
                this$0 = CheckoutCartManager.this;
                super();
            }
        });
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

    public void showLoadingSpinner()
    {
        rootActivity.showLoadingSpinner();
    }

    public void showPriceExpiryInfo(WishCartItem wishcartitem)
    {
        trackEvent(WishAnalyticsEvent.CLICK_CART_TIMER);
        CartPriceExpiryModal cartpriceexpirymodal = new CartPriceExpiryModal(getActivity());
        cartpriceexpirymodal.setup(wishcartitem, new android.view.View.OnClickListener() {

            final CheckoutCartManager this$0;

            public void onClick(View view)
            {
                getActivity().clearOverlay();
            }

            
            {
                this$0 = CheckoutCartManager.this;
                super();
            }
        });
        getActivity().showOverlay(cartpriceexpirymodal, false);
    }

    public void trackEvent(WishAnalyticsEvent wishanalyticsevent)
    {
        (new LogService()).requestService(Integer.toString(wishanalyticsevent.getValue()), null, null, null);
    }

    public void updateCart(String s, String s1, int i)
    {
        showLoadingSpinner();
        updateCartService.requestService(s, s1, i, false, null, new com.contextlogic.wish.api.service.UpdateCartService.SuccessCallback() {

            final CheckoutCartManager this$0;

            public void onServiceSucceeded(WishCart wishcart, WishShippingInfo wishshippinginfo, WishUserBillingInfo wishuserbillinginfo, WishUpsellOffer wishupselloffer)
            {
                hideLoadingSpinner();
                markGoogleWalletMaskedWalletNeedsReload();
                updateData(wishcart, wishshippinginfo, wishuserbillinginfo);
            }

            
            {
                this$0 = CheckoutCartManager.this;
                super();
            }
        }, new com.contextlogic.wish.api.service.UpdateCartService.FailureCallback() {

            final CheckoutCartManager this$0;

            public void onServiceFailed(String s2)
            {
                hideLoadingSpinner();
                if (s2 != null)
                {
                    showErrorMessage(s2);
                }
            }

            
            {
                this$0 = CheckoutCartManager.this;
                super();
            }
        });
    }

    public void updateCheckoutActionManager()
    {
        boolean flag = hasValidBillingInfo();
        boolean flag1 = hasValidShippingInfo();
        String s = getEffectivePaymentMode();
        if (s.equals("PaymentModeGoogle") && (!flag || !flag1))
        {
            cartCheckoutActionManager = new GoogleWalletCheckoutManager(this);
            return;
        }
        if (s.equals("PaymentModeKlarna"))
        {
            cartCheckoutActionManager = new KlarnaCheckoutManager(this);
            return;
        }
        if (flag && flag1)
        {
            cartCheckoutActionManager = new PlaceOrderCheckoutManager(this, s);
            return;
        } else
        {
            cartCheckoutActionManager = new DataEntryCheckoutManager(this);
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

                final CheckoutCartManager this$0;
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
                this$0 = CheckoutCartManager.this;
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
        googleWalletMaskedWallet = maskedwallet;
        googleWalletMaskedWalletNeedsReload = false;
        updateData(cart, shippingInfo, userBillingInfo);
    }

    public void updatePreferredPaymentMode(String s)
    {
        UserPreferences.setPreferredPaymentMode(s);
        updateData(cart, shippingInfo, userBillingInfo);
    }




/*
    static ProductDetailsAddToCartModal access$1002(CheckoutCartManager checkoutcartmanager, ProductDetailsAddToCartModal productdetailsaddtocartmodal)
    {
        checkoutcartmanager.addToCartModal = productdetailsaddtocartmodal;
        return productdetailsaddtocartmodal;
    }

*/



/*
    static CartUiView access$1102(CheckoutCartManager checkoutcartmanager, CartUiView cartuiview)
    {
        checkoutcartmanager.currentUiView = cartuiview;
        return cartuiview;
    }

*/







/*
    static WishUpsellOffer access$202(CheckoutCartManager checkoutcartmanager, WishUpsellOffer wishupselloffer)
    {
        checkoutcartmanager.upsellOffer = wishupselloffer;
        return wishupselloffer;
    }

*/



/*
    static boolean access$302(CheckoutCartManager checkoutcartmanager, boolean flag)
    {
        checkoutcartmanager.showUpsellModal = flag;
        return flag;
    }

*/



/*
    static WishCartEducationModalSpec access$402(CheckoutCartManager checkoutcartmanager, WishCartEducationModalSpec wishcarteducationmodalspec)
    {
        checkoutcartmanager.educationModalSpec = wishcarteducationmodalspec;
        return wishcarteducationmodalspec;
    }

*/



/*
    static boolean access$502(CheckoutCartManager checkoutcartmanager, boolean flag)
    {
        checkoutcartmanager.showEducationModal = flag;
        return flag;
    }

*/




}
