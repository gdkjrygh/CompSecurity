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

class val.rootView
    implements android.widget.actory
{

    final MoreInfoFragment this$0;
    final View val$rootView;

    public View createTabContent(final String tab)
    {
        if ("howto".equals(tab))
        {
            tab = ViewUtil.inflate(getActivity(), com.walmartlabs.android.payment.how_to, (ViewGroup)getView(), false);
            ViewUtil.findViewById(tab, com.walmartlabs.android.payment.ton).setOnClickListener(new OnSingleClickListener() {

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
            });
            ViewUtil.findViewById(tab, com.walmartlabs.android.payment._safe).setOnClickListener(new OnSingleClickListener() {

                final MoreInfoFragment._cls1 this$1;

                public void onSingleClick(View view)
                {
                    DialogFactory.createAlertDialog(getString(com.walmartlabs.android.payment.R.string.mpay_info_how_safe_title), getString(com.walmartlabs.android.payment.R.string.mpay_info_how_safe_body), getActivity()).show();
                }

            
            {
                this$1 = MoreInfoFragment._cls1.this;
                super();
            }
            });
            MobilePayManager.get().getUserInfo(new com.walmartlabs.payment.service.mpay.MobilePayManager.UserInfoInterface() {

                final MoreInfoFragment._cls1 this$1;
                final View val$tab;

                public void onGetUserInfo(boolean flag)
                {
                    if (flag)
                    {
                        ViewUtil.findViewById(tab, com.walmartlabs.android.payment.R.id.mpay_value_button_container).setVisibility(8);
                        ViewUtil.findViewById(tab, com.walmartlabs.android.payment.R.id.mpay_value_button_shadow).setVisibility(8);
                    }
                }

            
            {
                this$1 = MoreInfoFragment._cls1.this;
                tab = view;
                super();
            }
            });
            return tab;
        } else
        {
            tab = ViewUtil.inflate(getActivity(), com.walmartlabs.android.payment.bview, (ViewGroup)getView(), false);
            final WebView webView = (WebView)tab.findViewById(com.walmartlabs.android.payment.gment.getView);
            webView.setWebViewClient(new WebViewClient() {

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
            });
            webView.loadUrl(getArguments().getString("URL"));
            return tab;
        }
    }

    _cls4.val.webView()
    {
        this$0 = final_moreinfofragment;
        val$rootView = View.this;
        super();
    }
}
