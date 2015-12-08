// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.controller.mpay;

import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.DialogFactory;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.payment.service.mpay.MobilePayManager;
import com.walmartlabs.payment.view.OnSingleClickListener;

// Referenced classes of package com.walmartlabs.payment.controller.mpay:
//            MoreInfoFragment

class val.tab
    implements com.walmartlabs.payment.service.mpay.InfoInterface
{

    final  this$1;
    final View val$tab;

    public void onGetUserInfo(boolean flag)
    {
        if (flag)
        {
            ViewUtil.findViewById(val$tab, com.walmartlabs.android.payment.n_container).setVisibility(8);
            ViewUtil.findViewById(val$tab, com.walmartlabs.android.payment.n_shadow).setVisibility(8);
        }
    }

    l.rootView()
    {
        this$1 = final_rootview;
        val$tab = View.this;
        super();
    }

    // Unreferenced inner class com/walmartlabs/payment/controller/mpay/MoreInfoFragment$1

/* anonymous class */
    class MoreInfoFragment._cls1
        implements android.widget.TabHost.TabContentFactory
    {

        final MoreInfoFragment this$0;
        final View val$rootView;

        public View createTabContent(String s)
        {
            if ("howto".equals(s))
            {
                s = ViewUtil.inflate(getActivity(), com.walmartlabs.android.payment.R.layout.mpay_info_how_to, (ViewGroup)getView(), false);
                ViewUtil.findViewById(s, com.walmartlabs.android.payment.R.id.mpay_value_button).setOnClickListener(new MoreInfoFragment._cls1._cls1());
                ViewUtil.findViewById(s, com.walmartlabs.android.payment.R.id.mpay_info_link_safe).setOnClickListener(new MoreInfoFragment._cls1._cls2());
                MobilePayManager.get().getUserInfo(s. new MoreInfoFragment._cls1._cls3());
                return s;
            } else
            {
                s = ViewUtil.inflate(getActivity(), com.walmartlabs.android.payment.R.layout.loading_webview, (ViewGroup)getView(), false);
                final WebView webView = (WebView)s.findViewById(com.walmartlabs.android.payment.R.id.webView);
                webView.setWebViewClient(new MoreInfoFragment._cls1._cls4());
                webView.loadUrl(getArguments().getString("URL"));
                return s;
            }
        }

            
            {
                this$0 = final_moreinfofragment;
                rootView = View.this;
                super();
            }

        // Unreferenced inner class com/walmartlabs/payment/controller/mpay/MoreInfoFragment$1$1

/* anonymous class */
        class MoreInfoFragment._cls1._cls1 extends OnSingleClickListener
        {

            final MoreInfoFragment._cls1 this$1;

            public void onSingleClick(View view)
            {
                MessageBus.getBus().post(new com.walmartlabs.anivia.AniviaEventAsJson.Builder("mobilePayGetStarted"));
                ((MoreInfoFragment.Callback)MoreInfoFragment.access$000(this$0)).onSetup();
            }

                    
                    {
                        this$1 = MoreInfoFragment._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/walmartlabs/payment/controller/mpay/MoreInfoFragment$1$2

/* anonymous class */
        class MoreInfoFragment._cls1._cls2 extends OnSingleClickListener
        {

            final MoreInfoFragment._cls1 this$1;

            public void onSingleClick(View view)
            {
                DialogFactory.createAlertDialog(getString(com.walmartlabs.android.payment.R.string.mpay_info_how_safe_title), getString(com.walmartlabs.android.payment.R.string.mpay_info_how_safe_body), getActivity()).show();
            }

                    
                    {
                        this$1 = MoreInfoFragment._cls1.this;
                        super();
                    }
        }


        // Unreferenced inner class com/walmartlabs/payment/controller/mpay/MoreInfoFragment$1$4

/* anonymous class */
        class MoreInfoFragment._cls1._cls4 extends WebViewClient
        {

            final MoreInfoFragment._cls1 this$1;
            final WebView val$webView;

            public void onPageFinished(WebView webview, String s)
            {
                super.onPageFinished(webview, s);
                rootView.findViewById(com.walmartlabs.android.payment.R.id.loading).setVisibility(8);
                webView.setVisibility(0);
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                webview = new Intent("android.intent.action.VIEW");
                webview.setData(Uri.parse(s));
                if (webview.resolveActivity(getActivity().getPackageManager()) != null)
                {
                    getActivity().startActivity(webview);
                    return true;
                } else
                {
                    return false;
                }
            }

                    
                    {
                        this$1 = MoreInfoFragment._cls1.this;
                        webView = webview;
                        super();
                    }
        }

    }

}
