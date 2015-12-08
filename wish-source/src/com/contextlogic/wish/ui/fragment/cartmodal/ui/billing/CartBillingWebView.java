// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.analytics.WishAnalyticsEvent;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.webview.InterceptingTouchWebView;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.checkout.CartCheckoutActionManager;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.KlarnaPaymentProcessor;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.CartUiView;
import com.contextlogic.wish.ui.fragment.cartmodal.ui.items.CartItemsView;
import com.contextlogic.wish.ui.fragment.embeddedbrowser.BaseWebViewClient;
import com.contextlogic.wish.ui.fragment.embeddedbrowser.WebViewSetupTask;

public class CartBillingWebView extends CartUiView
{
    private class CartBillingWebViewClient extends BaseWebViewClient
    {

        final CartBillingWebView this$0;

        public void onPageFinished(WebView webview, String s)
        {
            hideProgressIndicator();
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            showProgressIndicator();
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            webview = hideLoadingSpinner.getActivity();
            if (webview == null)
            {
                return;
            } else
            {
                hideLoadingSpinner.hideLoadingSpinner();
                PopupAlertDialog.showError(webview, webview.getString(0x7f06030d), webview.getString(0x7f06017e));
                hideProgressIndicator();
                return;
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            if (s != null)
            {
                webview = Uri.parse(s);
                if (webview != null && webview.getScheme().equalsIgnoreCase(WishDeepLinkActivity.getDeepLinkProtocol()))
                {
                    webview = webview.getHost();
                    if (webview != null)
                    {
                        if (webview.equalsIgnoreCase("close-browser"))
                        {
                            backToCartPage();
                            return true;
                        }
                        if (webview.equalsIgnoreCase("browser-back"))
                        {
                            cancel();
                            return true;
                        }
                        if (webview.equalsIgnoreCase("select-paypal"))
                        {
                            onPaypalTabSelected(CartBaseBillingHeader.CartBillingSection.PAYPAL);
                            return true;
                        }
                        if (webview.equalsIgnoreCase("klarna-loading-spinner"))
                        {
                            hideLoadingSpinner.showLoadingSpinner();
                            return true;
                        }
                    }
                } else
                if (webview != null && webview.getPath().equalsIgnoreCase(KLARNA_CONFIRMATION_PAGE_URL))
                {
                    hideLoadingSpinner.hideLoadingSpinner();
                    (new KlarnaPaymentProcessor(hideLoadingSpinner)).handleSuccessfulPayment();
                    hideLoadingSpinner.updatePreferredPaymentMode("PaymentModeKlarna");
                    hideLoadingSpinner.showBrowser(s, true);
                    return true;
                }
            }
            return false;
        }

        private CartBillingWebViewClient()
        {
            this$0 = CartBillingWebView.this;
            super();
        }

    }


    private String KLARNA_CONFIRMATION_PAGE_URL;
    private String mInitialUrl;
    private View mOverlayLoadingView;
    private InterceptingTouchWebView mWebView;

    public CartBillingWebView(CartManager cartmanager, String s)
    {
        super(cartmanager);
        KLARNA_CONFIRMATION_PAGE_URL = "/m/klarna/confirmation";
        mInitialUrl = s;
        init();
    }

    private void backToCartPage()
    {
        cartManager.updateCurrentView(new CartItemsView(cartManager), true);
    }

    private boolean cancel()
    {
        pausePage();
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(getContext())).create();
        alertdialog.setTitle(getContext().getString(0x7f060073));
        alertdialog.setMessage(getContext().getString(0x7f06012c));
        alertdialog.setButton2(getContext().getString(0x7f060488), new android.content.DialogInterface.OnClickListener() {

            final CartBillingWebView this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                hideKeyboard();
                backToCartPage();
            }

            
            {
                this$0 = CartBillingWebView.this;
                super();
            }
        });
        alertdialog.setButton(getContext().getString(0x7f0602d8), new android.content.DialogInterface.OnClickListener() {

            final CartBillingWebView this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                resumePage();
            }

            
            {
                this$0 = CartBillingWebView.this;
                super();
            }
        });
        alertdialog.show();
        return true;
    }

    private void completeWebViewSetup()
    {
        if (mWebView == null)
        {
            return;
        } else
        {
            mWebView.setWebViewClient(new CartBillingWebViewClient());
            mWebView.getSettings().setJavaScriptEnabled(true);
            mWebView.getSettings().setPluginState(android.webkit.WebSettings.PluginState.ON);
            mWebView.getSettings().setDomStorageEnabled(true);
            mWebView.getSettings().setLoadWithOverviewMode(true);
            mWebView.getSettings().setUseWideViewPort(true);
            mWebView.setScrollBarStyle(0x2000000);
            mWebView.loadUrl(mInitialUrl);
            return;
        }
    }

    private void hideProgressIndicator()
    {
        mOverlayLoadingView.setVisibility(8);
    }

    private void init()
    {
        View view = ((LayoutInflater)getContext().getSystemService("layout_inflater")).inflate(0x7f030020, this);
        mWebView = (InterceptingTouchWebView)view.findViewById(0x7f0d00d8);
        mOverlayLoadingView = view.findViewById(0x7f0d00d9);
        mWebView.setVisibility(0);
        mWebView.setFocusable(true);
        mWebView.requestFocus(130);
        mWebView.resumeTimers();
        mWebView.setBackgroundColor(cartManager.getActivity().getResources().getColor(0x7f0c00e8));
        mWebView.setAllowTouch(true);
        (new WebViewSetupTask(cartManager.getActivity(), new com.contextlogic.wish.ui.fragment.embeddedbrowser.WebViewSetupTask.PostExecuteCallback() {

            final CartBillingWebView this$0;

            public void onPostExecuteComplete()
            {
                completeWebViewSetup();
            }

            
            {
                this$0 = CartBillingWebView.this;
                super();
            }
        })).execute(new Void[0]);
    }

    private void onPaypalTabSelected(CartBaseBillingHeader.CartBillingSection cartbillingsection)
    {
        cleanup();
        trackEvent(WishAnalyticsEvent.CLICK_MOBILE_NATIVE_BILLING_NEXT_PAYPAL);
        cartManager.updatePreferredPaymentMode("PaymentModePayPal");
        cartManager.getCartCheckoutActionManager().checkout();
    }

    private void pausePage()
    {
        if (mWebView != null)
        {
            mWebView.pauseTimers();
        }
    }

    private void resumePage()
    {
        if (mWebView != null)
        {
            mWebView.resumeTimers();
        }
    }

    private void showProgressIndicator()
    {
        mOverlayLoadingView.setVisibility(0);
    }

    public void cleanup()
    {
        hideKeyboard();
        if (mWebView != null)
        {
            mWebView.setWebViewClient(null);
            mWebView.loadUrl("about:blank");
            mWebView.pauseTimers();
            mWebView = null;
        }
    }

    public WishAnalyticsEvent getWishAnalyticsPageViewType()
    {
        return null;
    }

    public boolean onBackPressed()
    {
        return cancel();
    }

    public void onCartDataUpdated()
    {
    }
















}
