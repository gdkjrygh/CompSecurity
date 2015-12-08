// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.saver;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import com.squareup.otto.Bus;
import com.walmart.android.config.SaverServiceSettings;
import com.walmart.android.data.AppConfig;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.UserVoiceUtils;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.AppConfigManager;
import com.walmart.android.wmservice.Services;

// Referenced classes of package com.walmart.android.app.saver:
//            HasGetItBackBar

public class SaverFAQPresenter extends Presenter
    implements HasGetItBackBar
{
    private static class FeedbackBridge
    {

        private final Activity mActivity;

        public void show()
        {
            mActivity.runOnUiThread(new Runnable() {

                final FeedbackBridge this$0;

                public void run()
                {
                    UserVoiceUtils.launchFeedback(mActivity);
                }

            
            {
                this$0 = FeedbackBridge.this;
                super();
            }
            });
        }


        private FeedbackBridge(Activity activity)
        {
            mActivity = activity;
        }

    }


    public static final String TAG_FAQ = "faq";
    public static final String TAG_HOWTO = "howto";
    private final Activity mActivity;
    private final String mFaqFragment;
    private final String mStartTag;
    private View mView;

    public SaverFAQPresenter(Activity activity)
    {
        this(activity, "howto", null);
    }

    public SaverFAQPresenter(Activity activity, String s, String s1)
    {
        mActivity = activity;
        mStartTag = s;
        mFaqFragment = s1;
        setTitleText(mActivity.getString(0x7f09047f));
    }

    private void updateHowSaveText(AppConfig appconfig)
    {
        int i;
        if (appconfig != null && appconfig.bluebirdEnabled)
        {
            i = 0x7f0904c3;
        } else
        {
            i = 0x7f0904c4;
        }
        ViewUtil.setText(0x7f1004a7, mView, i);
    }

    public int getRedeemLimit()
    {
        return 50;
    }

    public View getView()
    {
        return mView;
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        MessageBus.getBus().unregister(this);
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        MessageBus.getBus().register(this);
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(final ViewGroup parent)
    {
        if (mView == null)
        {
            mView = mActivity.getLayoutInflater().inflate(0x7f040147, parent, false);
            parent = new android.widget.TabHost.TabContentFactory() {

                final SaverFAQPresenter this$0;
                final ViewGroup val$parent;

                public View createTabContent(String s)
                {
                    if ("howto".equals(s))
                    {
                        return mActivity.getLayoutInflater().inflate(0x7f040148, parent, false);
                    } else
                    {
                        s = mActivity.getLayoutInflater().inflate(0x7f040096, parent, false);
                        WebView webview = (WebView)s.findViewById(0x7f100205);
                        webview.getSettings().setJavaScriptEnabled(true);
                        webview.setWebViewClient(webview. new WebViewClient() {

                            final _cls1 this$1;
                            final WebView val$webView;

                            public void onPageFinished(WebView webview, String s)
                            {
                                super.onPageFinished(webview, s);
                                mView.findViewById(0x7f1001bb).setVisibility(8);
                                webView.setVisibility(0);
                            }

                            public boolean shouldOverrideUrlLoading(WebView webview, String s)
                            {
                                webview = new Intent("android.intent.action.VIEW");
                                webview.setData(Uri.parse(s));
                                if (webview.resolveActivity(mActivity.getPackageManager()) != null)
                                {
                                    mActivity.startActivity(webview);
                                    return true;
                                } else
                                {
                                    return false;
                                }
                            }

            
            {
                this$1 = final__pcls1;
                webView = WebView.this;
                super();
            }
                        });
                        webview.addJavascriptInterface(new FeedbackBridge(mActivity), "feedback");
                        webview.loadUrl(Services.get().getSaverServiceSettings().getFaqUrl(mFaqFragment));
                        return s;
                    }
                }

            
            {
                this$0 = SaverFAQPresenter.this;
                parent = viewgroup;
                super();
            }
            };
            TabHost tabhost = (TabHost)mView.findViewById(0x7f10021b);
            tabhost.setOnTabChangedListener(new android.widget.TabHost.OnTabChangeListener() {

                final SaverFAQPresenter this$0;

                public void onTabChanged(String s)
                {
                    Bus bus = MessageBus.getBus();
                    com.walmartlabs.anivia.AniviaEventAsJson.Builder builder = new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView");
                    if ("howto".equals(s))
                    {
                        s = "About Saver - How To";
                    } else
                    {
                        s = "About Saver - FAQ";
                    }
                    bus.post(builder.putString("name", s).putString("section", "Saver").putString("subCategory", "Savings Catcher"));
                }

            
            {
                this$0 = SaverFAQPresenter.this;
                super();
            }
            });
            tabhost.setup();
            android.widget.TabHost.TabSpec tabspec = tabhost.newTabSpec("howto");
            tabspec.setContent(parent);
            tabspec.setIndicator(mActivity.getString(0x7f09047d));
            tabhost.addTab(tabspec);
            tabspec = tabhost.newTabSpec("faq");
            tabspec.setContent(parent);
            tabspec.setIndicator(mActivity.getString(0x7f09047c));
            tabhost.addTab(tabspec);
            tabhost.setCurrentTabByTag(mStartTag);
            if (android.os.Build.VERSION.SDK_INT < 16 && "htc".equalsIgnoreCase(Build.MANUFACTURER))
            {
                parent = (TabWidget)mView.findViewById(0x1020013);
                if (parent != null)
                {
                    for (int i = 0; i < parent.getTabCount(); i++)
                    {
                        TextView textview = (TextView)parent.getChildTabViewAt(i).findViewById(0x1020016);
                        if (textview != null)
                        {
                            textview.setTextColor(mActivity.getResources().getColor(0x7f0f0011));
                        }
                    }

                }
            }
            updateHowSaveText(AppConfigManager.get().getAppConfig());
        }
    }

    public void onNewAppConfigReceived(AppConfig appconfig)
    {
        updateHowSaveText(appconfig);
    }



}
