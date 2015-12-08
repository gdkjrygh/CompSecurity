// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.fragment.cartmodal.CartManager;
import com.contextlogic.wish.ui.fragment.cartmodal.paymentprocessor.KlarnaPaymentProcessor;
import com.contextlogic.wish.ui.fragment.embeddedbrowser.BaseWebViewClient;

// Referenced classes of package com.contextlogic.wish.ui.fragment.cartmodal.ui.billing:
//            CartBillingWebView

private class <init> extends BaseWebViewClient
{

    final CartBillingWebView this$0;

    public void onPageFinished(WebView webview, String s)
    {
        CartBillingWebView.access$1300(CartBillingWebView.this);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        CartBillingWebView.access$1400(CartBillingWebView.this);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        webview = CartBillingWebView.access$1100(CartBillingWebView.this).getActivity();
        if (webview == null)
        {
            return;
        } else
        {
            CartBillingWebView.access$1200(CartBillingWebView.this).hideLoadingSpinner();
            PopupAlertDialog.showError(webview, webview.getString(0x7f06030d), webview.getString(0x7f06017e));
            CartBillingWebView.access$1300(CartBillingWebView.this);
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
                        CartBillingWebView.access$200(CartBillingWebView.this);
                        return true;
                    }
                    if (webview.equalsIgnoreCase("browser-back"))
                    {
                        boolean _tmp = CartBillingWebView.access$300(CartBillingWebView.this);
                        return true;
                    }
                    if (webview.equalsIgnoreCase("select-paypal"))
                    {
                        CartBillingWebView.access$400(CartBillingWebView.this, PAL);
                        return true;
                    }
                    if (webview.equalsIgnoreCase("klarna-loading-spinner"))
                    {
                        CartBillingWebView.access$500(CartBillingWebView.this).showLoadingSpinner();
                        return true;
                    }
                }
            } else
            if (webview != null && webview.getPath().equalsIgnoreCase(CartBillingWebView.access$600(CartBillingWebView.this)))
            {
                CartBillingWebView.access$700(CartBillingWebView.this).hideLoadingSpinner();
                (new KlarnaPaymentProcessor(CartBillingWebView.access$800(CartBillingWebView.this))).handleSuccessfulPayment();
                CartBillingWebView.access$900(CartBillingWebView.this).updatePreferredPaymentMode("PaymentModeKlarna");
                CartBillingWebView.access$1000(CartBillingWebView.this).showBrowser(s, true);
                return true;
            }
        }
        return false;
    }

    private ()
    {
        this$0 = CartBillingWebView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
