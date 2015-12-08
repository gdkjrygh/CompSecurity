// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.net.Uri;
import android.net.http.SslError;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebBackForwardList;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.maps.model.LatLng;
import com.squareup.otto.Bus;
import com.walmart.android.app.account.AccountActivity;
import com.walmart.android.app.bridge.cart.CartBridge;
import com.walmart.android.app.bridge.client.AnalyticsBridge;
import com.walmart.android.app.bridge.client.ClientBridge;
import com.walmart.android.app.bridge.client.ClientBridgeCallback;
import com.walmart.android.app.bridge.client.Customer;
import com.walmart.android.app.bridge.client.LoadingIndicatorBridge;
import com.walmart.android.app.bridge.client.LoadingIndicatorBridgeCallback;
import com.walmart.android.app.bridge.client.SignIn;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.app.main.ActivityResultRouter;
import com.walmart.android.app.order.OrderDetailsPresenter;
import com.walmart.android.app.settings.CXOHybridSettingsActivity;
import com.walmart.android.data.WalmartStore;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.SharedPreferencesUtil;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.Util;
import com.walmart.android.wmservice.WalmartNetService;
import com.walmartlabs.storelocator.StoreLocationManager;
import com.walmartlabs.utils.WLog;
import io.theholygrail.dingo.AnimationController;
import io.theholygrail.dingo.JsonHandler;
import io.theholygrail.dingo.navigation.ExternalUrlOptions;
import io.theholygrail.dingo.navigation.NavigationBridge;
import io.theholygrail.dingo.navigation.NavigationBridgeCallback;
import io.theholygrail.dingo.navigation.NavigationOptions;
import io.theholygrail.dingo.navigationbar.Button;
import io.theholygrail.dingo.navigationbar.NavigationBarBridge;
import io.theholygrail.dingo.navigationbar.NavigationBarBridgeCallback;
import io.theholygrail.dingo.platform.PlatformBridge;
import io.theholygrail.dingo.platform.PlatformBridgeCallback;
import io.theholygrail.dingo.tabbar.TabBarBridge;
import io.theholygrail.dingo.view.ViewBridge;
import io.theholygrail.dingo.view.ViewBridgeCallback;
import io.theholygrail.jsbridge.JSInterface;
import io.theholygrail.jsbridge.JSValue;
import io.theholygrail.jsbridge.JSWebView;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.http.cookie.Cookie;

// Referenced classes of package com.walmart.android.app.bridge:
//            Page, NavigationStack, DrawerUpdateEvent, ResultCallback

public class BridgeController
{
    private class GetLocationAndLoad extends AsyncTask
    {

        private Context mContext;
        private boolean mLoadUrl;
        final BridgeController this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient String doInBackground(Void avoid[])
        {
            String s;
            s = "empty";
            avoid = SharedPreferencesUtil.getSavedLocalAdJsonStore(mContext);
            if (avoid == null || avoid.getAddress() == null || avoid.getAddress().getZip() == null) goto _L2; else goto _L1
_L1:
            avoid = avoid.getAddress().getZip();
_L4:
            return avoid;
_L2:
            Object obj;
            obj = StoreLocationManager.getInstance(mContext).getCurrentLocation();
            avoid = s;
            if (obj == null) goto _L4; else goto _L3
_L3:
            avoid = s;
            if (((LatLng) (obj)).latitude == 0.0D) goto _L4; else goto _L5
_L5:
            avoid = s;
            if (((LatLng) (obj)).longitude == 0.0D) goto _L4; else goto _L6
_L6:
            avoid = new Geocoder(mContext, Locale.US);
            String s1;
            try
            {
                obj = avoid.getFromLocation(((LatLng) (obj)).latitude, ((LatLng) (obj)).longitude, 1);
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                WLog.i(BridgeController.TAG, "Could not get address from location");
                return "empty";
            }
            avoid = s;
            if (((List) (obj)).isEmpty()) goto _L4; else goto _L7
_L7:
            obj = (Address)((List) (obj)).get(0);
            s1 = ((Address) (obj)).getCountryCode();
            if ("US".equals(s1))
            {
                break; /* Loop/switch isn't completed */
            }
            avoid = s;
            if (!"PR".equals(s1)) goto _L4; else goto _L8
_L8:
            avoid = s;
            if (((Address) (obj)).getPostalCode() == null) goto _L4; else goto _L9
_L9:
            avoid = ((Address) (obj)).getPostalCode();
            return avoid;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            if (!"empty".equals(s))
            {
                s = (new StringBuilder()).append("DL=").append(s).append("%2C").append("empty").append("%2C").append("empty").append("%2C").append("geo").toString();
                CookieManager.getInstance().setCookie(".walmart.com", s);
                mDlCookieSet = true;
            }
            if (mLoadUrl && !TextUtils.isEmpty(mUrl))
            {
                loadUrl(mWebView, mUrl);
            }
        }

        public GetLocationAndLoad(boolean flag)
        {
            this$0 = BridgeController.this;
            super();
            mContext = mActivity.getApplicationContext();
            mLoadUrl = flag;
        }
    }

    public static interface PresenterCallback
    {

        public static final int BRIDGE_ERROR = 1;

        public abstract boolean isVisible();

        public abstract void pageError(int i, String s, String s1);

        public abstract void pushPresenter(Presenter presenter);

        public abstract void updateHeader(Page page, boolean flag);

        public abstract void updateLoadingView(boolean flag);
    }


    private static final long BRIDGE_TIMEOUT = 10000L;
    private static final String DL_VALUE_EMPTY = "empty";
    private static final String PR_COUNTRY_CODE = "PR";
    private static final int REQUEST_CODE_SIGN_IN = 1;
    private static final String TAG = com/walmart/android/app/bridge/BridgeController.getSimpleName();
    private static final String US_COUNTRY_CODE = "US";
    private Activity mActivity;
    private AnimationController mAnimationController;
    private boolean mBridgeLoadingIndicatorSet;
    private boolean mBridgeReady;
    private final Runnable mBridgeTimeoutRunnable = new Runnable() {

        final BridgeController this$0;

        public void run()
        {
            if (mPresenterCallback != null)
            {
                mPresenterCallback.pageError(1, null, null);
                WLog.e(BridgeController.TAG, "Bridge error", new Exception());
            }
        }

            
            {
                this$0 = BridgeController.this;
                super();
            }
    };
    private Dialog mDialog;
    private boolean mDlCookieSet;
    private WebView mExternalWebView;
    private boolean mFullPageLoad;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private boolean mIsPaused;
    private NavigationStack mNavigationStack;
    private PresenterCallback mPresenterCallback;
    private View mRootView;
    private boolean mShouldTriggerAppearCallback;
    private boolean mShouldTriggerDisappearCallback;
    private boolean mStartedSigninFromHybrid;
    private String mUrl;
    private JSWebView mWebView;

    public BridgeController()
    {
        mAnimationController = new AnimationController();
    }

    private void createExternalWebView(final String interceptUrlString)
    {
        mExternalWebView = new WebView(mActivity);
        mExternalWebView.getSettings().setLoadWithOverviewMode(true);
        mExternalWebView.getSettings().setUseWideViewPort(true);
        mExternalWebView.getSettings().setBuiltInZoomControls(true);
        mExternalWebView.getSettings().setDisplayZoomControls(false);
        mExternalWebView.getSettings().setUserAgentString(getUserAgent());
        mExternalWebView.setScrollBarStyle(0);
        mExternalWebView.getSettings().setJavaScriptEnabled(true);
        mExternalWebView.getSettings().setDomStorageEnabled(true);
        mExternalWebView.setWebViewClient(new WebViewClient() {

            final BridgeController this$0;
            final String val$interceptUrlString;

            public void onPageFinished(WebView webview, String s)
            {
                WLog.d(BridgeController.TAG, "onPageFinished()");
                super.onPageFinished(webview, s);
                mPresenterCallback.updateLoadingView(false);
            }

            public void onPageStarted(WebView webview, String s, Bitmap bitmap)
            {
                super.onPageStarted(webview, s, bitmap);
                WLog.d(BridgeController.TAG, (new StringBuilder()).append("onPageStarted(): ").append(s).toString());
            }

            public void onReceivedError(WebView webview, int i, String s, String s1)
            {
                WLog.d(BridgeController.TAG, (new StringBuilder()).append("onReceivedError(): errorCode = ").append(i).append(", description = ").append(s).append(", ").append(s1).toString());
                super.onReceivedError(webview, i, s, s1);
            }

            public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
            {
                super.onReceivedSslError(webview, sslerrorhandler, sslerror);
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                WLog.d(BridgeController.TAG, (new StringBuilder()).append("shouldOverrideUrlLoading(): ").append(s).toString());
                if (TextUtils.isEmpty(interceptUrlString))
                {
                    break MISSING_BLOCK_LABEL_144;
                }
                boolean flag;
                URL url = new URL(s);
                URL url1 = new URL(interceptUrlString);
                if (!url.getProtocol().equals(url1.getProtocol()) || !url.getHost().equals(url1.getHost()) || url.getPort() != url1.getPort() || !url.getPath().equals(url1.getPath()))
                {
                    break MISSING_BLOCK_LABEL_144;
                }
                mNavigationStack.getCurrentPageOrModal().setInterceptUrl(s);
                flag = goBack(false, true, false);
                return flag;
                MalformedURLException malformedurlexception;
                malformedurlexception;
                return super.shouldOverrideUrlLoading(webview, s);
            }

            
            {
                this$0 = BridgeController.this;
                interceptUrlString = s;
                super();
            }
        });
    }

    private String getUserAgent()
    {
        String s1 = mWebView.getSettings().getUserAgentString();
        String s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return (new StringBuilder()).append(s).append(" WMTAPP").toString();
    }

    private void hideWebView()
    {
        if (mRootView != null)
        {
            ViewUtil.findViewById(mRootView, 0x7f100084).setVisibility(0);
        }
    }

    private void initWebView()
    {
        mWebView.getSettings().setUserAgentString(getUserAgent());
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            mWebView.getSettings().setMixedContentMode(2);
        }
        final JSInterface mainInterface = setupBridgeInterface();
        mWebView.setWebViewClient(new WebViewClient() {

            final BridgeController this$0;
            final JSInterface val$mainInterface;

            public void onPageFinished(WebView webview, String s)
            {
                WLog.d(BridgeController.TAG, (new StringBuilder()).append("onPageFinished: full page load: ").append(mFullPageLoad).append(" url: ").append(s).toString());
                if (!mFullPageLoad)
                {
                    super.onPageFinished(webview, s);
                    return;
                }
                mNavigationStack.getCurrentPage().resetListeners();
                mHandler.removeCallbacks(mBridgeTimeoutRunnable);
                mHandler.postDelayed(mBridgeTimeoutRunnable, 10000L);
                mFullPageLoad = false;
                mWebView.setupNamespace(mainInterface);
                if (!mBridgeReady)
                {
                    mBridgeReady = true;
                    mWebView.executeJavascript("if (window.nativeBridgeReady != null) {window.nativeBridgeReady(null,window.NativeBridge);}");
                }
                Util.passCookiesToNative();
                super.onPageFinished(webview, s);
            }

            public void onPageStarted(WebView webview, String s, Bitmap bitmap)
            {
                super.onPageStarted(webview, s, bitmap);
                WLog.d(BridgeController.TAG, (new StringBuilder()).append("onPageStarted(): ").append(s).toString());
                mPresenterCallback.updateLoadingView(true);
                mFullPageLoad = true;
                mBridgeReady = false;
            }

            public void onReceivedError(WebView webview, int i, String s, String s1)
            {
                WLog.d(BridgeController.TAG, (new StringBuilder()).append("onReceivedError(): errorCode = ").append(i).append(", description = ").append(s).append(", ").append(s1).toString());
                mPresenterCallback.pageError(i, s, s1);
                super.onReceivedError(webview, i, s, s1);
            }

            public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
            {
                super.onReceivedSslError(webview, sslerrorhandler, sslerror);
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                WLog.d(BridgeController.TAG, (new StringBuilder()).append("shouldOverrideUrlLoading(): ").append(s).toString());
                return super.shouldOverrideUrlLoading(webview, s);
            }

            
            {
                this$0 = BridgeController.this;
                mainInterface = jsinterface;
                super();
            }
        });
    }

    private void loadUrl(WebView webview, String s)
    {
        webview.loadUrl(s);
    }

    private void onAppearIfReady()
    {
        if (mBridgeReady && !mFullPageLoad)
        {
            onAppear();
            return;
        } else
        {
            mShouldTriggerAppearCallback = true;
            return;
        }
    }

    private void pushModal(Page page, io.theholygrail.dingo.AnimationController.AnimationListener animationlistener)
    {
        page.setHistoryIndex(mWebView.copyBackForwardList().getCurrentIndex());
        mNavigationStack.getCurrentPageOrModal().pushModal(page);
        mAnimationController.animateUp(animationlistener);
        mPresenterCallback.updateHeader(page, false);
    }

    private void removeExternalWebView()
    {
        if (mExternalWebView != null)
        {
            if (!mIsPaused)
            {
                mWebView.onResume();
            }
            ((ViewGroup)ViewUtil.findViewById(mRootView, 0x7f100082)).removeView(mExternalWebView);
            mExternalWebView.destroy();
            mExternalWebView = null;
        }
    }

    private void reset(int i)
    {
        mNavigationStack.popToRoot();
        mWebView.goBackOrForward(-i);
        mWebView.reload();
    }

    private void setWebCookies(boolean flag)
    {
        WLog.e(TAG, "Setting web cookies");
        WalmartNetService walmartnetservice = Services.get().getWalmartService();
        CookieManager cookiemanager = CookieManager.getInstance();
        Iterator iterator = walmartnetservice.getCookies().iterator();
        while (iterator.hasNext()) 
        {
            Cookie cookie = (Cookie)iterator.next();
            String s = cookie.getName();
            if (!mDlCookieSet && "DL".equals(s))
            {
                String s1 = cookie.getValue();
                if (s1 != null)
                {
                    String as[] = s1.split("%2C");
                    if (as.length >= 4 && "user".equals(as[3]))
                    {
                        mDlCookieSet = true;
                    }
                }
            }
            StringBuilder stringbuilder = (new StringBuilder()).append(s).append("=").append(cookie.getValue());
            if (cookie.isSecure())
            {
                s = "; secure";
            } else
            {
                s = "";
            }
            s = stringbuilder.append(s).toString();
            cookiemanager.setCookie(cookie.getDomain(), s);
        }
        if (mActivity != null && CXOHybridSettingsActivity.isTestInProdCookieEnabled(mActivity))
        {
            WLog.d(TAG, "Setting magic test cookie");
            cookiemanager.setCookie(".walmart.com", "CXOLNPTEST=1");
        }
        if (!mDlCookieSet)
        {
            (new GetLocationAndLoad(flag)).execute(new Void[0]);
        } else
        if (flag)
        {
            loadUrl(mWebView, mUrl);
            return;
        }
    }

    private JSInterface setupBridgeInterface()
    {
        final JsonHandler handler = JsonHandler.get();
        JSInterface jsinterface = new JSInterface(new PlatformBridge(mActivity, mWebView, handler, new PlatformBridgeCallback() {

            final BridgeController this$0;

            public void onDialogDismissed(Dialog dialog)
            {
                if (mDialog != null && mDialog == dialog)
                {
                    mDialog = null;
                }
            }

            public void showDialog(Dialog dialog)
            {
                if (!mPresenterCallback.isVisible())
                {
                    break MISSING_BLOCK_LABEL_67;
                }
                if (mDialog != null && mDialog.isShowing())
                {
                    mDialog.dismiss();
                }
                mDialog = dialog;
                mDialog.show();
                return;
                dialog;
                mDialog = null;
                return;
            }

            
            {
                this$0 = BridgeController.this;
                super();
            }
        }), "platform");
        jsinterface.addSubInterface(new JSInterface(new NavigationBridge(mWebView, handler, new NavigationBridgeCallback() {

            final BridgeController this$0;
            final JsonHandler val$handler;

            public void animateBackwards()
            {
                goBack(true);
            }

            public void animateForward(String s)
            {
                onDisappear();
                mAnimationController.animateForward();
                Page page = new Page();
                if (s != null)
                {
                    s = (NavigationOptions)handler.fromJson(s, io/theholygrail/dingo/navigation/NavigationOptions);
                    if (s != null && !TextUtils.isEmpty(((NavigationOptions) (s)).title))
                    {
                        page.setTitle(((NavigationOptions) (s)).title);
                    }
                }
                page.setHistoryIndex(mWebView.copyBackForwardList().getCurrentIndex());
                mNavigationStack.push(page);
                mPresenterCallback.updateHeader(page, false);
                MessageBus.getBus().post(new DrawerUpdateEvent(false, true));
            }

            public void dismissModal()
            {
                WLog.d(BridgeController.TAG, "dismissModal()");
                if (mNavigationStack.getCurrentPage().hasModals())
                {
                    goBack(true);
                    return;
                } else
                {
                    WLog.e(BridgeController.TAG, "dismissModal() called on non modal.");
                    return;
                }
            }

            public void popToRoot()
            {
                mNavigationStack.popToRoot();
            }

            public void presentExternalUrl(ExternalUrlOptions externalurloptions)
            {
                if (externalurloptions != null && externalurloptions.url != null)
                {
                    String s = externalurloptions.url;
                    Page page = new Page();
                    page.setIsExternalModal(true);
                    if (!TextUtils.isEmpty(externalurloptions.title))
                    {
                        page.setTitle(externalurloptions.title);
                    }
                    if (!TextUtils.isEmpty(externalurloptions.returnURL))
                    {
                        page.setInterceptUrl(externalurloptions.returnURL);
                    }
                    createExternalWebView(externalurloptions.returnURL);
                    ((ViewGroup)ViewUtil.findViewById(mRootView, 0x7f100082)).addView(mExternalWebView);
                    mWebView.onPause();
                    pushModal(page, s. new io.theholygrail.dingo.AnimationController.AnimationListener() {

                        final _cls4 this$1;
                        final String val$url;

                        public void onAnimationEnd()
                        {
                            loadUrl(mExternalWebView, url);
                        }

            
            {
                this$1 = final__pcls4;
                url = String.this;
                super();
            }
                    });
                }
            }

            public void presentModal(NavigationOptions navigationoptions)
            {
                Page page = new Page();
                if (navigationoptions != null)
                {
                    if (!TextUtils.isEmpty(navigationoptions.title))
                    {
                        page.setTitle(navigationoptions.title);
                    }
                    if (navigationoptions.onNavigationBarButtonTap != null)
                    {
                        JSValue jsvalue = new JSValue(navigationoptions.onNavigationBarButtonTap);
                        page.setButtons(navigationoptions.navigationBarButtons, jsvalue. new io.theholygrail.dingo.navigationbar.NavigationBarBridgeCallback.OnClickListener() {

                            final _cls4 this$1;
                            final JSValue val$buttonsCallback;

                            public void onClick(String s)
                            {
                                s = new JSValue(s);
                                buttonsCallback.callFunction(mWebView, new Object[] {
                                    s
                                }, null);
                            }

            
            {
                this$1 = final__pcls4;
                buttonsCallback = JSValue.this;
                super();
            }
                        });
                    }
                    if (navigationoptions.onAppear != null)
                    {
                        page.setOnAppearListener((new JSValue(navigationoptions.onAppear)). new io.theholygrail.dingo.view.ViewBridgeCallback.OnAppearListener() {

                            final _cls4 this$1;
                            final JSValue val$onAppearCallback;

                            public void onAppear()
                            {
                                onAppearCallback.callFunction(mWebView, null, null);
                            }

            
            {
                this$1 = final__pcls4;
                onAppearCallback = JSValue.this;
                super();
            }
                        });
                    }
                }
                pushModal(page, new io.theholygrail.dingo.AnimationController.AnimationListener() {

                    final _cls4 this$1;

                    public void onAnimationEnd()
                    {
                        onAppearIfReady();
                    }

            
            {
                this$1 = _cls4.this;
                super();
            }
                });
            }

            public void setOnBackListener(io.theholygrail.dingo.navigation.NavigationBridgeCallback.OnBackListener onbacklistener)
            {
                WLog.d(BridgeController.TAG, "setOnBackListener()");
                mNavigationStack.getCurrentPageOrModal().setOnBackListener(onbacklistener);
            }

            
            {
                this$0 = BridgeController.this;
                handler = jsonhandler;
                super();
            }
        }), "navigation"));
        jsinterface.addSubInterface(new JSInterface(new NavigationBarBridge(mWebView, handler, new NavigationBarBridgeCallback() {

            final BridgeController this$0;

            public void setButtons(Button abutton[], io.theholygrail.dingo.navigationbar.NavigationBarBridgeCallback.OnClickListener onclicklistener)
            {
                WLog.d(BridgeController.TAG, "setButtons())");
                Page page = mNavigationStack.getCurrentPageOrModal();
                page.setButtons(abutton, onclicklistener);
                mPresenterCallback.updateHeader(page, mNavigationStack.isRootPage());
            }

            public void setTitle(String s)
            {
                WLog.d(BridgeController.TAG, (new StringBuilder()).append("Set title callback called: ").append(s).toString());
                Page page = mNavigationStack.getCurrentPageOrModal();
                page.setTitle(s);
                mPresenterCallback.updateHeader(page, mNavigationStack.isRootPage());
            }

            
            {
                this$0 = BridgeController.this;
                super();
            }
        }), "navigationBar"));
        jsinterface.addSubInterface(new JSInterface(new TabBarBridge(), "tabBar"));
        jsinterface.addSubInterface(new JSInterface(new CartBridge(mWebView), "cart"));
        jsinterface.addSubInterface(new JSInterface(new ViewBridge(mWebView, new ViewBridgeCallback() {

            final BridgeController this$0;

            public void setOnAppear(io.theholygrail.dingo.view.ViewBridgeCallback.OnAppearListener onappearlistener)
            {
                Page page = mNavigationStack.getCurrentPageOrModal();
                WLog.d(BridgeController.TAG, (new StringBuilder()).append("setOnAppear(): ").append(page.getTitle()).toString());
                page.setOnAppearListener(onappearlistener);
            }

            public void setOnDisappear(io.theholygrail.dingo.view.ViewBridgeCallback.OnDisappearListener ondisappearlistener)
            {
                Page page = mNavigationStack.getCurrentPageOrModal();
                WLog.d(BridgeController.TAG, (new StringBuilder()).append("setOnDisappear(): ").append(page.getTitle()).toString());
                page.setOnDisappearListener(ondisappearlistener);
            }

            public void show()
            {
                WLog.d(BridgeController.TAG, "view.show()");
                showWebView(true);
                if (!mBridgeLoadingIndicatorSet)
                {
                    mPresenterCallback.updateLoadingView(false);
                }
                Util.passCookiesToNative();
            }

            
            {
                this$0 = BridgeController.this;
                super();
            }
        }), "view"));
        JSInterface jsinterface1 = new JSInterface(new ClientBridge(mWebView, handler, new ClientBridgeCallback() {

            final BridgeController this$0;

            public void openBrowser(String s)
            {
                try
                {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(s));
                    if (intent.resolveActivity(mActivity.getPackageManager()) != null)
                    {
                        mActivity.startActivity(intent);
                    }
                    return;
                }
                catch (ActivityNotFoundException activitynotfoundexception)
                {
                    WLog.w(BridgeController.TAG, (new StringBuilder()).append("Could not launch activity for: ").append(s).toString());
                }
            }

            public void showHome()
            {
                MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.HOME, null, false));
            }

            public void showItemPage(String s)
            {
                s = new ItemDetailsPresenter(mActivity, s);
                s.preselectVariant();
                mPresenterCallback.pushPresenter(s);
            }

            public void showOrderDetails(String s)
            {
                mPresenterCallback.pushPresenter(new OrderDetailsPresenter(mActivity, s));
            }

            public void signin(String s, ResultCallback resultcallback)
            {
                Intent intent = new Intent(mActivity, com/walmart/android/app/account/AccountActivity);
                if (!TextUtils.isEmpty(s))
                {
                    intent.putExtra("merge_type", s);
                }
                s = ActivityResultRouter.getInstance(mActivity);
                if (s != null)
                {
                    mStartedSigninFromHybrid = true;
                    s.startActivityForResult(intent, 1, resultcallback. new com.walmart.android.app.main.ActivityResultRouter.ActivityResultCallback() {

                        final _cls7 this$1;
                        final ResultCallback val$success;

                        public void onActivityResult(int i, int j, Intent intent)
                        {
                            if (j == 1)
                            {
                                WLog.d(BridgeController.TAG, "AccountActivity returned RESULT_OK. Passing cookies.");
                                setWebCookies(false);
                                SignIn signin = new SignIn();
                                Authentication authentication = Services.get().getAuthentication();
                                Customer customer = new Customer();
                                customer.firstName = authentication.getFirstName();
                                customer.lastName = authentication.getLastName();
                                customer.customerId = authentication.getCid();
                                boolean flag = intent.getBooleanExtra("email_signup", false);
                                if (flag)
                                {
                                    customer.emailSignup = Boolean.valueOf(flag);
                                }
                                signin.customer = customer;
                                signin.accountCreated = intent.getBooleanExtra("account_created", false);
                                success.onResult(signin);
                                return;
                            } else
                            {
                                WLog.d(BridgeController.TAG, "AccountActivity was canceled.");
                                mStartedSigninFromHybrid = false;
                                success.onResult(null);
                                return;
                            }
                        }

            
            {
                this$1 = final__pcls7;
                success = ResultCallback.this;
                super();
            }
                    });
                }
            }

            
            {
                this$0 = BridgeController.this;
                super();
            }
        }), "client");
        jsinterface.addSubInterface(jsinterface1);
        jsinterface1.addSubInterface(new JSInterface(new LoadingIndicatorBridge(mWebView, handler, new LoadingIndicatorBridgeCallback() {

            final BridgeController this$0;

            public void hide()
            {
                WLog.d(BridgeController.TAG, "Loading indicator hide");
                mBridgeLoadingIndicatorSet = false;
                mPresenterCallback.updateLoadingView(false);
                showWebView(true);
            }

            public void show()
            {
                WLog.d(BridgeController.TAG, "Loading indicator show");
                mBridgeLoadingIndicatorSet = true;
                mPresenterCallback.updateLoadingView(true);
            }

            
            {
                this$0 = BridgeController.this;
                super();
            }
        }), "loadingIndicator"));
        jsinterface1.addSubInterface(new JSInterface(new AnalyticsBridge(mWebView), "analytics"));
        mWebView.setupJsInterface(jsinterface);
        return jsinterface;
    }

    private void showWebView(boolean flag)
    {
        if (mRootView != null)
        {
            ViewUtil.findViewById(mRootView, 0x7f100084).setVisibility(8);
        }
        if (flag)
        {
            mHandler.removeCallbacks(mBridgeTimeoutRunnable);
        }
    }

    public boolean goBack(boolean flag)
    {
        return goBack(flag, false, false);
    }

    public boolean goBack(boolean flag, final boolean intercepted, boolean flag1)
    {
        WLog.d(TAG, (new StringBuilder()).append("goBack(").append(flag).append(", ").append(intercepted).append(", ").append(flag1).append(")").toString());
        boolean flag3 = false;
        boolean flag2 = false;
        Page page;
        int j;
        if (mNavigationStack.getCurrentPage().hasModals())
        {
            flag2 = true;
        } else
        if (mNavigationStack.isRootPage())
        {
            WLog.d(TAG, "goBack called on root page");
            return false;
        }
        onDisappear();
        page = mNavigationStack.getCurrentPageOrModal();
        if (page.isExternalModal())
        {
            j = ((flag3) ? 1 : 0);
            if (!intercepted)
            {
                j = ((flag3) ? 1 : 0);
                if (mExternalWebView != null)
                {
                    j = ((flag3) ? 1 : 0);
                    if (mExternalWebView.canGoBack())
                    {
                        mExternalWebView.goBack();
                        return true;
                    }
                }
            }
        } else
        {
            j = ((flag3) ? 1 : 0);
            if (!flag)
            {
                final String interceptUrl = page.getOnBackListener();
                int i;
                if (interceptUrl != null)
                {
                    interceptUrl.onBack();
                    j = ((flag3) ? 1 : 0);
                } else
                {
                    WLog.w(TAG, "No backlistener or buttons set. Try to go back.");
                    j = 1;
                }
            }
        }
        if (flag2)
        {
            interceptUrl = page.getInterceptUrl();
            page.pop();
            mAnimationController.animateDown(new io.theholygrail.dingo.AnimationController.AnimationListener() {

                final BridgeController this$0;
                final String val$interceptUrl;
                final boolean val$intercepted;

                public void onAnimationEnd()
                {
                    removeExternalWebView();
                    if (intercepted)
                    {
                        loadUrl(mWebView, interceptUrl);
                        return;
                    } else
                    {
                        onAppearIfReady();
                        return;
                    }
                }

            
            {
                this$0 = BridgeController.this;
                intercepted = flag;
                interceptUrl = s;
                super();
            }
            });
        } else
        {
            mNavigationStack.pop();
            mAnimationController.animateBackward(new io.theholygrail.dingo.AnimationController.AnimationListener() {

                final BridgeController this$0;

                public void onAnimationEnd()
                {
                    onAppearIfReady();
                }

            
            {
                this$0 = BridgeController.this;
                super();
            }
            });
        }
        if (j != 0)
        {
            i = mNavigationStack.getCurrentPage().getHistoryIndex();
            j = mWebView.copyBackForwardList().getCurrentIndex();
            if (j > i)
            {
                mWebView.goBackOrForward(i - j);
            } else
            {
                reset(j);
            }
        }
        if (mNavigationStack.getCurrentPage().hasModals())
        {
            MessageBus.getBus().post(new DrawerUpdateEvent(false, true));
        } else
        {
            MessageBus.getBus().post(new DrawerUpdateEvent(true, true));
        }
        mPresenterCallback.updateHeader(mNavigationStack.getCurrentPageOrModal(), mNavigationStack.isRootPage());
        return true;
    }

    public void init(Activity activity, String s, String s1, PresenterCallback presentercallback)
    {
        mWebView = new JSWebView(activity);
        mActivity = activity;
        mPresenterCallback = presentercallback;
        mNavigationStack = new NavigationStack();
        mNavigationStack.getCurrentPage().setTitle(s);
        initWebView();
        if (!TextUtils.isEmpty(s1))
        {
            mUrl = s1;
        }
        resetCookies(true);
    }

    public void initUi(View view)
    {
        mRootView = view;
        ((ViewGroup)ViewUtil.findViewById(mRootView, 0x7f100082)).addView(mWebView, 0);
        mAnimationController.init(mRootView, mWebView);
        mShouldTriggerAppearCallback = true;
    }

    public void onAppear()
    {
        WLog.d(TAG, "onAppear()");
        io.theholygrail.dingo.view.ViewBridgeCallback.OnAppearListener onappearlistener = mNavigationStack.getCurrentPageOrModal().getOnAppearListener();
        if (onappearlistener != null)
        {
            hideWebView();
            mPresenterCallback.updateLoadingView(true);
            mShouldTriggerAppearCallback = false;
            onappearlistener.onAppear();
        } else
        {
            WLog.i(TAG, "current onAppearListener() == null");
            showWebView(false);
        }
        mPresenterCallback.updateHeader(mNavigationStack.getCurrentPageOrModal(), mNavigationStack.isRootPage());
    }

    public boolean onButtonClicked(String s)
    {
        io.theholygrail.dingo.navigationbar.NavigationBarBridgeCallback.OnClickListener onclicklistener = mNavigationStack.getCurrentPageOrModal().getButtonClickListener();
        if (onclicklistener != null)
        {
            onclicklistener.onClick(s);
            return true;
        } else
        {
            WLog.w(TAG, "Button clicked without click listener");
            return false;
        }
    }

    public void onDisappear()
    {
        WLog.d(TAG, "onDisappear()");
        io.theholygrail.dingo.view.ViewBridgeCallback.OnDisappearListener ondisappearlistener = mNavigationStack.getCurrentPageOrModal().getOnDisappearListener();
        if (ondisappearlistener != null)
        {
            mShouldTriggerDisappearCallback = false;
            ondisappearlistener.onDisappear();
            return;
        } else
        {
            WLog.d(TAG, "current onDisappearListener() == null");
            return;
        }
    }

    public void onPause()
    {
        mIsPaused = true;
        if (mExternalWebView != null)
        {
            mExternalWebView.onPause();
        } else
        if (mWebView != null)
        {
            mWebView.onPause();
            return;
        }
    }

    public void onResume()
    {
        mIsPaused = false;
        setWebCookies(false);
        if (mExternalWebView != null)
        {
            mExternalWebView.onResume();
        } else
        if (mWebView != null)
        {
            mWebView.onResume();
            return;
        }
    }

    public void onSignIn()
    {
        if (mStartedSigninFromHybrid)
        {
            mStartedSigninFromHybrid = false;
            return;
        } else
        {
            reload();
            return;
        }
    }

    public void reload()
    {
        if (mExternalWebView != null)
        {
            removeExternalWebView();
        }
        mNavigationStack.popToRoot();
        mWebView.clearHistory();
        resetCookies(true);
    }

    public void resetCookies(boolean flag)
    {
        Util.clearWebViewCookies();
        setWebCookies(flag);
    }

    public void setVisibility(boolean flag)
    {
        if (flag)
        {
            mShouldTriggerDisappearCallback = true;
            if (mShouldTriggerAppearCallback)
            {
                onAppear();
            }
        } else
        {
            if (mDialog != null)
            {
                if (mDialog.isShowing())
                {
                    mDialog.cancel();
                }
                mDialog = null;
            }
            mShouldTriggerAppearCallback = true;
            if (mShouldTriggerDisappearCallback)
            {
                onDisappear();
                return;
            }
        }
    }













/*
    static boolean access$1702(BridgeController bridgecontroller, boolean flag)
    {
        bridgecontroller.mBridgeLoadingIndicatorSet = flag;
        return flag;
    }

*/



/*
    static boolean access$1902(BridgeController bridgecontroller, boolean flag)
    {
        bridgecontroller.mStartedSigninFromHybrid = flag;
        return flag;
    }

*/




/*
    static boolean access$202(BridgeController bridgecontroller, boolean flag)
    {
        bridgecontroller.mFullPageLoad = flag;
        return flag;
    }

*/



/*
    static boolean access$2202(BridgeController bridgecontroller, boolean flag)
    {
        bridgecontroller.mDlCookieSet = flag;
        return flag;
    }

*/




/*
    static boolean access$302(BridgeController bridgecontroller, boolean flag)
    {
        bridgecontroller.mBridgeReady = flag;
        return flag;
    }

*/







/*
    static Dialog access$802(BridgeController bridgecontroller, Dialog dialog)
    {
        bridgecontroller.mDialog = dialog;
        return dialog;
    }

*/

}
