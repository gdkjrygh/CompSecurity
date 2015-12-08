// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.embeddedbrowser;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.MailTo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.webkit.WebView;
import com.contextlogic.wish.ApplicationDeepLinkConfig;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.facebook.FacebookManager;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.user.UserStatusManager;
import com.facebook.AppEventsLogger;

// Referenced classes of package com.contextlogic.wish.ui.fragment.embeddedbrowser:
//            BaseWebViewClient, EmbeddedBrowserFragment

private class <init> extends BaseWebViewClient
{

    final EmbeddedBrowserFragment this$0;

    public void onPageFinished(WebView webview, String s)
    {
        EmbeddedBrowserFragment.access$1800(EmbeddedBrowserFragment.this);
        EmbeddedBrowserFragment.access$700(EmbeddedBrowserFragment.this);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        EmbeddedBrowserFragment.access$1800(EmbeddedBrowserFragment.this);
        EmbeddedBrowserFragment.access$500(EmbeddedBrowserFragment.this);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        if (getActivity() == null)
        {
            return;
        } else
        {
            PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f06017e));
            EmbeddedBrowserFragment.access$1800(EmbeddedBrowserFragment.this);
            EmbeddedBrowserFragment.access$700(EmbeddedBrowserFragment.this);
            return;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_528;
        }
        webview = Uri.parse(s);
        if (webview == null || !webview.getScheme().equalsIgnoreCase(WishDeepLinkActivity.getDeepLinkProtocol())) goto _L2; else goto _L1
_L1:
        s = webview.getHost();
        if (s == null) goto _L4; else goto _L3
_L3:
        if (!s.equalsIgnoreCase("close-browser")) goto _L6; else goto _L5
_L5:
        EmbeddedBrowserFragment.access$1100(EmbeddedBrowserFragment.this);
_L4:
        return true;
_L6:
        if (!s.equalsIgnoreCase("purchase-complete")) goto _L8; else goto _L7
_L7:
        UserStatusManager.getInstance().resetCartCount();
        if (EmbeddedBrowserFragment.access$1200(EmbeddedBrowserFragment.this) == -1D || EmbeddedBrowserFragment.access$1300(EmbeddedBrowserFragment.this) == null || EmbeddedBrowserFragment.access$1400(EmbeddedBrowserFragment.this) == null) goto _L10; else goto _L9
_L9:
        webview = new Bundle();
        webview.putString("fb_currency", EmbeddedBrowserFragment.access$1300(EmbeddedBrowserFragment.this));
        webview.putString("fb_content_type", "product");
        webview.putString("fb_content_id", EmbeddedBrowserFragment.access$1400(EmbeddedBrowserFragment.this));
        FacebookManager.getInstance().getAppEventLogger().logEvent("fb_mobile_purchase", EmbeddedBrowserFragment.access$1200(EmbeddedBrowserFragment.this), webview);
_L11:
        EmbeddedBrowserFragment.access$1502(EmbeddedBrowserFragment.this, true);
        UserStatusManager.getInstance().refreshStatus();
        ApiDataChangeNotificationManager.getInstance().notifyListenersForPurchaseComplete();
        continue; /* Loop/switch isn't completed */
_L10:
        try
        {
            FacebookManager.getInstance().getAppEventLogger().logEvent("fb_mobile_purchase");
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview) { }
        if (true) goto _L11; else goto _L8
_L8:
        if (s.equalsIgnoreCase("cart-reload-required"))
        {
            UserStatusManager.getInstance().refreshStatus();
            ApiDataChangeNotificationManager.getInstance().notifyListenersForCartReloadRequired();
        } else
        if (s.equalsIgnoreCase("purchase-complete-close-browser"))
        {
            UserStatusManager.getInstance().resetCartCount();
            EmbeddedBrowserFragment.access$1100(EmbeddedBrowserFragment.this);
        } else
        if (s.equalsIgnoreCase("set-back-marker"))
        {
            EmbeddedBrowserFragment.access$1602(EmbeddedBrowserFragment.this, EmbeddedBrowserFragment.access$400(EmbeddedBrowserFragment.this));
        } else
        if (s.equalsIgnoreCase("upload-image"))
        {
            webview = webview.getQueryParameter("id");
            EmbeddedBrowserFragment.access$1700(EmbeddedBrowserFragment.this, webview);
        } else
        {
            webview = WishDeepLinkActivity.getDeepLinkTarget(webview);
            if (webview != null && webview.getType() != com.contextlogic.wish.)
            {
                s = getActivity();
                if (s != null && (s instanceof RootActivity))
                {
                    ((RootActivity)s).processDeepLink(webview, false);
                }
            }
        }
        if (true) goto _L4; else goto _L2
_L2:
        if (webview != null && webview.getScheme().equals("mailto"))
        {
            try
            {
                webview = MailTo.parse(s);
                s = new Intent("android.intent.action.SEND");
                s.setType("message/rfc822");
                if (webview.getTo() != null)
                {
                    s.putExtra("android.intent.extra.EMAIL", new String[] {
                        webview.getTo()
                    });
                }
                if (webview.getBody() != null)
                {
                    s.putExtra("android.intent.extra.TEXT", webview.getBody());
                }
                if (webview.getSubject() != null)
                {
                    s.putExtra("android.intent.extra.SUBJECT", webview.getSubject());
                }
                if (webview.getCc() != null)
                {
                    s.putExtra("android.intent.extra.CC", webview.getCc());
                }
                getActivity().startActivity(s);
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f0602db));
            }
            return true;
        }
        return false;
    }

    private ()
    {
        this$0 = EmbeddedBrowserFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
