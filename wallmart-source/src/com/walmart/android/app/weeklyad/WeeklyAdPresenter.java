// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.weeklyad;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.HttpAuthHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.app.shop.BrowseTokenParser;
import com.walmart.android.app.shop.ShelfListPresenter;
import com.walmart.android.service.weeklyad.WeeklyAdConfiguration;
import com.walmart.android.ui.DialogFactory;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.WalmartUri;
import com.walmart.android.utils.ViewUtil;
import com.walmartlabs.utils.WLog;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.walmart.android.app.weeklyad:
//            WeeklyAdStoreItemPresenter

public class WeeklyAdPresenter extends Presenter
{
    private static class Urls
    {

        private static Uri appendDefaultQueryParams(Uri uri)
        {
            return uri.buildUpon().appendQueryParameter("locale", "en-US").appendQueryParameter("type", "4").appendQueryParameter("mobile_layout_name", "walmartusaapp").build();
        }

        private static Uri getFlyerUrl(String s, String s1, String s2)
        {
            s1 = getMainBaseUrl(s2).buildUpon().appendPath(s1).appendPath("browse");
            if (s == null)
            {
                s = "";
            }
            return s1.appendQueryParameter("flyer_run_id", s).build();
        }

        private static Uri getItemBaseUrl()
        {
            return Uri.parse(server()).buildUpon().appendPath("h").appendPath("m").appendPath("walmartusa").appendPath("item").build();
        }

        private static Uri getMainBaseUrl()
        {
            return getMainBaseUrl(null);
        }

        private static Uri getMainBaseUrl(String s)
        {
            android.net.Uri.Builder builder = Uri.parse(server()).buildUpon().appendPath("h").appendPath("m").appendPath("walmartusa");
            if (s == null)
            {
                s = "";
            }
            return appendDefaultQueryParams(builder.appendQueryParameter("store_code", s).build());
        }

        private static Uri getPreviewUrl(String s, String s1)
        {
            return getMainBaseUrl(s1).buildUpon().appendQueryParameter("preview_code", s).build();
        }

        private static String server()
        {
            return WeeklyAdConfiguration.get().getWeeklyAdServer();
        }





        private Urls()
        {
        }
    }

    public static interface WeeklyAdListener
    {

        public abstract void onUpdateStoreSelectorVisibility(boolean flag);
    }


    private static final String TAG = com/walmart/android/app/weeklyad/WeeklyAdPresenter.getSimpleName();
    private Activity mActivity;
    private WeeklyAdListener mListener;
    private Map mPageRequests;
    private View mView;
    private WebView mWebView;
    private String mWeeklyAdUrl;

    private WeeklyAdPresenter(Activity activity, String s)
    {
        mPageRequests = new HashMap();
        WLog.d(TAG, (new StringBuilder()).append("WeeklyAdPresenter(): url = ").append(s).toString());
        setTitleText(activity.getString(0x7f09060e));
        mActivity = activity;
        mWeeklyAdUrl = s;
    }

    public WeeklyAdPresenter(Activity activity, String s, String s1)
    {
        this(activity, Urls.getPreviewUrl(s1, s).toString());
    }

    public WeeklyAdPresenter(Activity activity, String s, String s1, String s2)
    {
        if (!TextUtils.isEmpty(s2))
        {
            s = Urls.getFlyerUrl(s2, s1, s).toString();
        } else
        {
            s = Urls.getMainBaseUrl(s).toString();
        }
        this(activity, s);
    }

    private void authenticateForHandler(final HttpAuthHandler handler)
    {
        final View contentView = LayoutInflater.from(mActivity).inflate(0x7f0401bc, null);
        (new android.support.v7.app.AlertDialog.Builder(mActivity)).setTitle(0x7f090083).setView(contentView).setPositiveButton(0x7f090469, new android.content.DialogInterface.OnClickListener() {

            final WeeklyAdPresenter this$0;
            final View val$contentView;
            final HttpAuthHandler val$handler;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                dialoginterface = (EditText)contentView.findViewById(0x7f1005d9);
                EditText edittext = (EditText)contentView.findViewById(0x7f1005da);
                handler.proceed(String.valueOf(dialoginterface.getText()), String.valueOf(edittext.getText()));
            }

            
            {
                this$0 = WeeklyAdPresenter.this;
                contentView = view;
                handler = httpauthhandler;
                super();
            }
        }).show();
    }

    private boolean handleEmailLink(String s)
    {
        if (!TextUtils.isEmpty(s) && s.startsWith("mailto:"))
        {
            WLog.d(TAG, (new StringBuilder()).append("handleEmailLink(): Intercepting email link - ").append(s).toString());
            s = new Intent("android.intent.action.SENDTO", Uri.parse(s));
            if (s.resolveActivity(mActivity.getPackageManager()) != null)
            {
                mActivity.startActivity(s);
                return true;
            }
        }
        return false;
    }

    private boolean handleWalmartUrl(String s)
    {
        WalmartUri walmarturi = WalmartUri.parse(s);
        if (walmarturi == null) goto _L2; else goto _L1
_L1:
        walmarturi.getType();
        JVM INSTR tableswitch 2 7: default 52
    //                   2 90
    //                   3 52
    //                   4 52
    //                   5 52
    //                   6 128
    //                   7 54;
           goto _L2 _L3 _L2 _L2 _L2 _L4 _L5
_L2:
        return false;
_L5:
        WLog.d(TAG, (new StringBuilder()).append("handleWalmartUrl(): Intercepting online/shared item URL - ").append(s).toString());
        pushItemDetailsPresenter(walmarturi.getParam(1));
        return true;
_L3:
        WLog.d(TAG, (new StringBuilder()).append("handleWalmartUrl(): Intercepting browse URL - ").append(s).toString());
        try
        {
            pushBrowsePresenter(BrowseTokenParser.encode64(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
_L4:
        WLog.d(TAG, (new StringBuilder()).append("handleWalmartUrl(): Intercepting shelf URL - ").append(s).toString());
        pushShelfPresenter(walmarturi.getParam(0));
        return true;
    }

    private boolean handleWishabiUrl(String s)
    {
        if (!TextUtils.isEmpty(s) && s.startsWith(Urls.getItemBaseUrl().toString()))
        {
            WLog.d(TAG, (new StringBuilder()).append("handleWishabiUrl(): Intercepting store-only item URL - ").append(s).toString());
            pushWeeklyAdStoreItemPresenter(Uri.parse(s).getLastPathSegment());
            return true;
        } else
        {
            return false;
        }
    }

    private boolean interceptUrl(String s)
    {
        WLog.d(TAG, (new StringBuilder()).append("interceptUrl(): ").append(s).toString());
        return handleWishabiUrl(s) || handleWalmartUrl(s) || handleEmailLink(s);
    }

    private void pushBrowsePresenter(String s)
    {
        WLog.d(TAG, (new StringBuilder()).append("pushBrowsePresenter(): Token = ").append(s).toString());
        s = new ShelfListPresenter(mActivity, s);
        s.setTitleText(mActivity.getString(0x7f090555));
        pushPresenter(s, true);
    }

    private void pushItemDetailsPresenter(String s)
    {
        WLog.d(TAG, (new StringBuilder()).append("pushItemDetailsPresenter(): Item ID = ").append(s).toString());
        pushPresenter(new ItemDetailsPresenter(mActivity, s), true);
    }

    private void pushShelfPresenter(String s)
    {
        WLog.d(TAG, (new StringBuilder()).append("pushShelfPresenter(): Shelf ID = ").append(s).toString());
        s = new ShelfListPresenter(mActivity, s, 50);
        s.setTitleText(mActivity.getString(0x7f090555));
        pushPresenter(s);
    }

    private void pushWeeklyAdStoreItemPresenter(String s)
    {
        WLog.d(TAG, (new StringBuilder()).append("pushWeeklyAdStoreItemPresenter(): Item ID = ").append(s).toString());
        pushPresenter(new WeeklyAdStoreItemPresenter(mActivity, s), true);
    }

    private void setStoreSelectorVisibility(boolean flag)
    {
        if (mListener != null)
        {
            mListener.onUpdateStoreSelectorVisibility(flag);
        }
    }

    public View getView()
    {
        return mView;
    }

    public boolean interceptBack()
    {
        if (mWebView.canGoBack())
        {
            mWebView.goBack();
            return true;
        } else
        {
            return super.interceptBack();
        }
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        if (mWebView != null)
        {
            WLog.d(TAG, "onAfterPop(): Destroying WebView");
            mWebView.destroy();
            mWebView = null;
        }
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        setStoreSelectorVisibility(true);
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        setStoreSelectorVisibility(true);
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        WLog.d(TAG, "onCreateMenu()");
        setStoreSelectorVisibility(true);
        return super.onCreateMenu(menu, menuinflater);
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        WLog.d(TAG, "onCreateView()");
        if (mView == null)
        {
            mView = LayoutInflater.from(mActivity).inflate(0x7f0401d7, viewgroup, false);
            mWebView = (WebView)ViewUtil.findViewById(getView(), 0x7f100609);
            final View progress = ViewUtil.findViewById(mView, 0x7f1001bb);
            mWebView.getSettings().setSaveFormData(false);
            viewgroup = mWebView.getSettings().getUserAgentString();
            WebSettings websettings = mWebView.getSettings();
            StringBuilder stringbuilder = new StringBuilder();
            if (viewgroup == null)
            {
                viewgroup = "";
            }
            websettings.setUserAgentString(stringbuilder.append(viewgroup).append(" WMTAPP").toString());
            mWebView.setScrollBarStyle(0);
            mWebView.getSettings().setJavaScriptEnabled(true);
            mWebView.getSettings().setDomStorageEnabled(true);
            mWebView.setWebViewClient(new WebViewClient() {

                final WeeklyAdPresenter this$0;
                final View val$progress;

                public void onPageFinished(WebView webview, String s)
                {
                    super.onPageFinished(webview, s);
                    webview = (Long)mPageRequests.get(s);
                    if (webview != null)
                    {
                        WLog.d(WeeklyAdPresenter.TAG, (new StringBuilder()).append("onPageFinished(): ").append(SystemClock.elapsedRealtime() - webview.longValue()).append(" ms waiting for ").append(s).toString());
                    }
                    progress.setVisibility(8);
                }

                public void onPageStarted(WebView webview, String s, Bitmap bitmap)
                {
                    super.onPageStarted(webview, s, bitmap);
                    mPageRequests.put(s, Long.valueOf(SystemClock.elapsedRealtime()));
                    progress.setVisibility(0);
                }

                public void onReceivedError(WebView webview, int i, String s, String s1)
                {
                    super.onReceivedError(webview, i, s, s1);
                    DialogFactory.createAlertDialog(mActivity.getString(0x7f09060c), mActivity).show();
                    mActivity.onBackPressed();
                }

                public void onReceivedHttpAuthRequest(WebView webview, HttpAuthHandler httpauthhandler, String s, String s1)
                {
                    WLog.d(WeeklyAdPresenter.TAG, (new StringBuilder()).append("onReceivedHttpAuthRequest(): host = ").append(s).append(", realm = ").append(s1).toString());
                }

                public boolean shouldOverrideUrlLoading(WebView webview, String s)
                {
                    return interceptUrl(s) || super.shouldOverrideUrlLoading(webview, s);
                }

            
            {
                this$0 = WeeklyAdPresenter.this;
                progress = view;
                super();
            }
            });
            WLog.d(TAG, (new StringBuilder()).append("loadWebView(): [WEEKLY AD] ").append(mWeeklyAdUrl).toString());
            mWebView.loadUrl(mWeeklyAdUrl);
        }
    }

    public void onNewTop()
    {
        super.onNewTop();
        setStoreSelectorVisibility(false);
    }

    public void onPop()
    {
        super.onPop();
        setStoreSelectorVisibility(false);
    }

    public void setWeeklyAdListener(WeeklyAdListener weeklyadlistener)
    {
        mListener = weeklyadlistener;
    }





}
