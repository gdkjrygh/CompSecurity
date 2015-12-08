// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.squareup.otto.Bus;
import com.walmart.android.events.CloseFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.utils.NetworkConnectivityHelper;
import com.walmartlabs.utils.WLog;
import java.util.Locale;
import java.util.Stack;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmart.android.app.hybrid:
//            WebPresenter, WebTransitionHandler, JSBridgeAdapter

public class PROPERTIES extends WebViewClient
{

    private boolean mIsPageStarted;
    private ObjectMapper mObjectMapper;
    final WebPresenter this$0;

    private void handleError()
    {
        int i;
        if ((new NetworkConnectivityHelper(WebPresenter.access$900(WebPresenter.this))).isConnected())
        {
            i = 0x7f0905a4;
        } else
        {
            i = 0x7f090282;
        }
        (new com.walmart.android.ui.dialog.<init>(WebPresenter.access$900(WebPresenter.this))).setMessage(i).setPositiveButton(0x7f090292, null).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

            final WebPresenter.WebBus this$1;

            public void onDismiss(DialogInterface dialoginterface)
            {
                MessageBus.getBus().post(new CloseFragmentEvent());
            }

            
            {
                this$1 = WebPresenter.WebBus.this;
                super();
            }
        }).show();
        WebPresenter.access$1200(WebPresenter.this).setPictureListener(null);
        WebPresenter.access$1200(WebPresenter.this).setWebViewClient(null);
        WebPresenter.access$1200(WebPresenter.this).setWebChromeClient(null);
        WebPresenter.access$1100(WebPresenter.this).reset();
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        WLog.i(WebPresenter.access$000(), (new StringBuilder()).append("onPageFinished() URL: ").append(s).toString());
        if (!mIsPageStarted)
        {
            WLog.d(WebPresenter.access$000(), "onPageFinished() Not a full page load. Returning.");
            return;
        }
        WebPresenter.access$1100(WebPresenter.this).onPageFinished();
        mIsPageStarted = false;
        WebPresenter.access$1300(WebPresenter.this).callPageFinished();
        if (WebPresenter.access$1400(WebPresenter.this))
        {
            WLog.d(WebPresenter.access$000(), "onPageFinished() Is going back. Returning.");
            WebPresenter.access$1402(WebPresenter.this, false);
            return;
        }
        if (WebPresenter.access$500(WebPresenter.this) != null)
        {
            WLog.d(WebPresenter.access$000(), "onPageFinished() Found page from shouldOverrideUrlLoading()");
            cess._mth200(WebPresenter.access$500(WebPresenter.this)).title = WebPresenter.access$1200(WebPresenter.this).getTitle();
            cess._mth200(WebPresenter.access$500(WebPresenter.this)).pageLoadUrl = s;
            WebPresenter.access$400(WebPresenter.this, WebPresenter.access$500(WebPresenter.this));
            WebPresenter.access$502(WebPresenter.this, null);
        } else
        {
            boolean flag;
            boolean flag1;
            if (WebPresenter.access$1500(WebPresenter.this) != null)
            {
                WLog.d(WebPresenter.access$000(), "onPageFinished() First time page load. Creating initial page.");
                WebPresenter.access$1500(WebPresenter.this).title = WebPresenter.access$1200(WebPresenter.this).getTitle();
                webview = new nit>(WebPresenter.access$1500(WebPresenter.this));
                WebPresenter.access$1502(WebPresenter.this, null);
            } else
            {
                WLog.d(WebPresenter.access$000(), "onPageFinished() Non-user initiated page load. Copying current state");
                webview = WebPresenter.access$300(WebPresenter.this);
                cess._mth200(webview).title = WebPresenter.access$1200(WebPresenter.this).getTitle();
            }
            flag1 = false;
            flag = flag1;
            if (!WebPresenter.access$600(WebPresenter.this).isEmpty())
            {
                flag = flag1;
                if (s.equals(cess._mth200((cess._cls200)WebPresenter.access$600(WebPresenter.this).peek()).pageLoadUrl))
                {
                    flag = true;
                }
            }
            if (!flag)
            {
                cess._mth200(webview).pageLoadUrl = s.trim();
                webview.FullPageRefresh = true;
                WebPresenter.access$400(WebPresenter.this, webview);
            } else
            {
                WLog.d(WebPresenter.access$000(), (new StringBuilder()).append("onPageFinished() Page with same url is already at the top of the stack. Omitting page push for URL: ").append(s).toString());
            }
        }
        MessageBus.getBus().post((new com.walmartlabs.anivia.ilder("pageView")).putString("name", (new StringBuilder()).append("webview : ").append(WebPresenter.access$1200(WebPresenter.this).getTitle()).toString()).putString("section", "webview").putString("subCategory", "webview").putString("url", s));
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        mIsPageStarted = true;
        WLog.i(WebPresenter.access$000(), (new StringBuilder()).append("onPageStarted: ").append(s).toString());
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        WLog.d(WebPresenter.access$000(), String.format(Locale.US, "oReceivedError: errorCode %d, description %s", new Object[] {
            Integer.valueOf(i), s
        }));
        super.onReceivedError(webview, i, s, s1);
        handleError();
    }

    public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
    {
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        WLog.d(WebPresenter.access$000(), (new StringBuilder()).append("shouldOverrideUrlLoading(): ").append(s).toString());
        if (WebPresenter.access$1000(WebPresenter.this, s))
        {
            WLog.d(WebPresenter.access$000(), "Intercepted URL");
            return true;
        } else
        {
            WLog.d(WebPresenter.access$000(), "Starting full page transition.");
            WebPresenter.access$502(WebPresenter.this, WebPresenter.access$300(WebPresenter.this));
            WebPresenter.access$500(WebPresenter.this).FullPageRefresh = true;
            WebPresenter.access$1100(WebPresenter.this).animateForward();
            return super.shouldOverrideUrlLoading(webview, s);
        }
    }

    public ure()
    {
        this$0 = WebPresenter.this;
        super();
        mObjectMapper = new ObjectMapper();
        mObjectMapper.configure(org.codehaus.jackson.map.g.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
}
