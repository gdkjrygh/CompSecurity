// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.baidu;

import android.app.Activity;
import android.app.ProgressDialog;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import chp;
import com.ubercab.payment.internal.activity.AddPaymentActivity;
import com.ubercab.payment.internal.model.ApiError;
import com.ubercab.payment.internal.network.PaymentApi;
import com.ubercab.payment.internal.network.model.CreateThirdPartyPaymentProfileRequest;
import com.ubercab.payment.internal.vendor.baidu.model.AuthorizationDetails;
import com.ubercab.payment.internal.vendor.baidu.model.BaiduWalletTokenData;
import com.ubercab.payment.model.CollectedData;
import cwm;
import e;
import gkh;
import grs;
import gry;
import gsg;
import gtb;
import gtc;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import retrofit.RetrofitError;

// Referenced classes of package com.ubercab.payment.internal.vendor.baidu:
//            BaiduApi

public class BaiduAddActivity extends AddPaymentActivity
{

    private static final Pattern a = Pattern.compile(".*contract_no=(\\d+).*");
    private static final Pattern b = Pattern.compile(".*card_no=(\\w+).*");
    private static final Pattern c = Pattern.compile(".*puresign_order_no=(\\d+).*");
    private chp d;
    private BaiduApi e;
    private PaymentApi f;
    private ProgressDialog g;
    private WebView h;
    private WebViewClient i;

    public BaiduAddActivity()
    {
    }

    static chp a(BaiduAddActivity baiduaddactivity)
    {
        return baiduaddactivity.d;
    }

    static String a(Uri uri, String s, Pattern pattern)
    {
        return b(uri, s, pattern);
    }

    static void a(BaiduAddActivity baiduaddactivity, BaiduWalletTokenData baiduwallettokendata)
    {
        baiduaddactivity.a(baiduwallettokendata);
    }

    private void a(BaiduWalletTokenData baiduwallettokendata)
    {
        String s;
        byte byte0;
        s = f();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 2: default 36
    //                   -2055109037: 61
    //                   96417: 75;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_75;
_L4:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            a(CollectedData.create((new gkh()).a("token_type", "baidu_wallet").a("token_data", baiduwallettokendata).a()));
            return;

        case 1: // '\001'
            b(baiduwallettokendata);
            break;
        }
        break MISSING_BLOCK_LABEL_125;
_L2:
        if (s.equals("data_collection"))
        {
            byte0 = 0;
        }
          goto _L4
        if (s.equals("add"))
        {
            byte0 = 1;
        }
          goto _L4
    }

    private static String b(Uri uri, String s, Pattern pattern)
    {
        s = uri.getQueryParameter(s);
        if (s != null)
        {
            return s;
        }
        if (pattern != null)
        {
            uri = pattern.matcher(uri.toString());
            if (uri.matches())
            {
                return uri.group(1);
            }
        }
        return null;
    }

    static void b(BaiduAddActivity baiduaddactivity)
    {
        baiduaddactivity.k();
    }

    private void b(BaiduWalletTokenData baiduwallettokendata)
    {
        baiduwallettokendata = CreateThirdPartyPaymentProfileRequest.create("baidu_wallet", baiduwallettokendata);
        g.show();
        f.create(baiduwallettokendata, new gtc(this, com/ubercab/payment/internal/model/ApiError) {

            final BaiduAddActivity a;

            private void a()
            {
                a.setResult(-1);
                a.finish();
            }

            private void a(ApiError apierror)
            {
                BaiduAddActivity.c(a).dismiss();
                BaiduAddActivity.a(a).a(e.d);
                cwm.a(a, apierror.getErrorMessage());
            }

            public final volatile void a(Object obj)
            {
                a();
            }

            public final void a(RetrofitError retrofiterror)
            {
                BaiduAddActivity.c(a).dismiss();
                BaiduAddActivity.a(a).a(e.e);
                cwm.a(a, a.getString(gsg.ub__payment_network_error));
            }

            public final void b(Object obj)
            {
                a((ApiError)obj);
            }

            
            {
                a = BaiduAddActivity.this;
                super(activity, class1);
            }
        });
    }

    static ProgressDialog c(BaiduAddActivity baiduaddactivity)
    {
        return baiduaddactivity.g;
    }

    static WebView d(BaiduAddActivity baiduaddactivity)
    {
        return baiduaddactivity.h;
    }

    static Pattern h()
    {
        return a;
    }

    static Pattern i()
    {
        return b;
    }

    static Pattern j()
    {
        return c;
    }

    private void k()
    {
        cwm.a(this, gsg.ub__payment_network_error);
        finish();
    }

    public void onBackPressed()
    {
        if (h.canGoBack())
        {
            h.goBack();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        h = new WebView(this);
        setContentView(h);
        if (d == null)
        {
            d = g().e();
        }
        if (e == null)
        {
            e = (BaiduApi)g().aK().a(com/ubercab/payment/internal/vendor/baidu/BaiduApi);
        }
        if (f == null)
        {
            f = (PaymentApi)g().aK().a(com/ubercab/payment/internal/network/PaymentApi);
        }
        d.a(e.c);
        g = ProgressDialog.show(this, null, getString(gsg.ub__payment_loading), true);
        h.getSettings().setJavaScriptEnabled(true);
        i = new WebViewClient() {

            final BaiduAddActivity a;

            public final void onPageFinished(WebView webview, String s)
            {
                if (BaiduAddActivity.c(a).isShowing())
                {
                    BaiduAddActivity.a(a).a(e.h);
                    BaiduAddActivity.c(a).dismiss();
                }
            }

            public final boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                Object obj = Uri.parse(s);
                if ("api.uber.com.cn".equals(((Uri) (obj)).getHost()))
                {
                    webview = BaiduAddActivity.a(((Uri) (obj)), "contract_no", BaiduAddActivity.h());
                    s = BaiduAddActivity.a(((Uri) (obj)), "card_no", BaiduAddActivity.i());
                    obj = BaiduAddActivity.a(((Uri) (obj)), "puresign_order_no", BaiduAddActivity.j());
                    if (webview != null && s != null && obj != null)
                    {
                        webview = BaiduWalletTokenData.create(webview, s, ((String) (obj)));
                        BaiduAddActivity.a(a, webview);
                    } else
                    {
                        BaiduAddActivity.a(a).a(e.f);
                        BaiduAddActivity.b(a);
                    }
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                a = BaiduAddActivity.this;
                super();
            }
        };
        h.setWebViewClient(i);
        e.getAuthorizationDetails("https://api.uber.com.cn/v1/payments/baidu-wallet/sign/callback", new gtb(this) {

            final BaiduAddActivity a;

            private void a(AuthorizationDetails authorizationdetails)
            {
                BaiduAddActivity.d(a).loadUrl(authorizationdetails.getAuthorizationHref());
            }

            public final volatile void a(Object obj)
            {
                a((AuthorizationDetails)obj);
            }

            public final void a(RetrofitError retrofiterror)
            {
                BaiduAddActivity.b(a);
                a.finish();
            }

            
            {
                a = BaiduAddActivity.this;
                super(activity);
            }
        });
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            h.clearView();
        } else
        {
            h.loadUrl("about:blank");
        }
        h.destroy();
    }

}
