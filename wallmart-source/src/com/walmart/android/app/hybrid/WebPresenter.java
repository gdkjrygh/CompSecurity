// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.squareup.otto.Bus;
import com.walmart.android.app.account.AccountActivity;
import com.walmart.android.app.item.ItemDetailsPresenter;
import com.walmart.android.app.main.ActivityResultRouter;
import com.walmart.android.app.main.HomeActivity;
import com.walmart.android.app.shop.ShelfListPresenter;
import com.walmart.android.events.CloseFragmentEvent;
import com.walmart.android.events.SwitchFragmentEvent;
import com.walmart.android.service.MessageBus;
import com.walmart.android.service.cart.ListInfo;
import com.walmart.android.ui.CustomProgressDialog;
import com.walmart.android.ui.Presenter;
import com.walmart.android.util.WalmartUri;
import com.walmart.android.utils.NetworkConnectivityHelper;
import com.walmart.android.utils.ViewUtil;
import com.walmart.android.wmservice.Authentication;
import com.walmart.android.wmservice.Services;
import com.walmart.android.wmservice.Util;
import com.walmart.android.wmservice.WalmartNetService;
import com.walmart.android.wmui.WalmartShareActionProvider;
import com.walmartlabs.auth.AuthenticationStatusEvent;
import com.walmartlabs.utils.WLog;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Stack;
import org.apache.http.cookie.Cookie;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmart.android.app.hybrid:
//            WebTransitionHandler, JSBridgeAdapter, HybridPlatformBridge

public class WebPresenter extends Presenter
{
    private class JSPageListener
        implements JSBridgeAdapter.PageStateListener
    {

        final WebPresenter this$0;

        public void back()
        {
            WLog.d(WebPresenter.TAG, "JSPageListener.back()");
            if (!goBack())
            {
                WLog.d(WebPresenter.TAG, "Can't go back anymore. Sending back press to activity.");
                mActivity.onBackPressed();
            }
        }

        public void onStatePushed(JSBridgeAdapter.State state)
        {
            WLog.d(WebPresenter.TAG, "JSPageListener.onStatePushed()");
            if (state != null)
            {
                state = new Page(state);
            } else
            {
                state = getCopyOfTopPage();
            }
            state.isFullPageRefresh = false;
            pushPage(state);
        }

        public void onStateReplaced(JSBridgeAdapter.State state)
        {
            WLog.d(WebPresenter.TAG, "JSPageListener.onStateReplaced()");
            if (mForwardAnimatingPage != null)
            {
                mForwardAnimatingPage.setState(state);
                WLog.d(WebPresenter.TAG, "replacing state of page that has not yet been pushed (onPageFinished not yet received)");
                return;
            }
            if (!mPageStack.isEmpty())
            {
                ((Page)mPageStack.peek()).setState(state);
                updateActionBarState(state);
                WLog.d(WebPresenter.TAG, "replacing state of top page");
                return;
            } else
            {
                WLog.e(WebPresenter.TAG, "Illegal State. Tried to replace page when there was nothing previously pushed!");
                return;
            }
        }

        private JSPageListener()
        {
            this$0 = WebPresenter.this;
            super();
        }

    }

    public static interface Listener
    {

        public abstract void onCookiesCleared(WebView webview);

        public abstract void onRestart();
    }

    public static class Page
    {

        public boolean isFullPageRefresh;
        private JSBridgeAdapter.State state;

        public void setState(JSBridgeAdapter.State state1)
        {
            state = new JSBridgeAdapter.State(state1);
        }

        public String toString()
        {
            return (new StringBuilder()).append("[t:").append(state.title).append(", fp: ").append(isFullPageRefresh).append(", url:").append("").append(state.pageLoadUrl).append("]").toString();
        }


        public Page()
        {
            state = new JSBridgeAdapter.State();
        }

        public Page(JSBridgeAdapter.State state1)
        {
            state = new JSBridgeAdapter.State(state1);
        }

        public Page(Page page)
        {
            if (page.state != null)
            {
                state = new JSBridgeAdapter.State(page.state);
                return;
            } else
            {
                state = new JSBridgeAdapter.State();
                return;
            }
        }

        public Page(String s)
        {
            this();
            state.title = s;
        }
    }

    public class WebBus extends WebViewClient
    {

        private boolean mIsPageStarted;
        private ObjectMapper mObjectMapper;
        final WebPresenter this$0;

        private void handleError()
        {
            int i;
            if ((new NetworkConnectivityHelper(mActivity)).isConnected())
            {
                i = 0x7f0905a4;
            } else
            {
                i = 0x7f090282;
            }
            (new com.walmart.android.ui.dialog.AlertDialog.Builder(mActivity)).setMessage(i).setPositiveButton(0x7f090292, null).setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                final WebBus this$1;

                public void onDismiss(DialogInterface dialoginterface)
                {
                    MessageBus.getBus().post(new CloseFragmentEvent());
                }

            
            {
                this$1 = WebBus.this;
                super();
            }
            }).show();
            mWebView.setPictureListener(null);
            mWebView.setWebViewClient(null);
            mWebView.setWebChromeClient(null);
            mWebTransitionHandler.reset();
        }

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            WLog.i(WebPresenter.TAG, (new StringBuilder()).append("onPageFinished() URL: ").append(s).toString());
            if (!mIsPageStarted)
            {
                WLog.d(WebPresenter.TAG, "onPageFinished() Not a full page load. Returning.");
                return;
            }
            mWebTransitionHandler.onPageFinished();
            mIsPageStarted = false;
            mJSBridgeAdapter.callPageFinished();
            if (mIsFullPageBack)
            {
                WLog.d(WebPresenter.TAG, "onPageFinished() Is going back. Returning.");
                mIsFullPageBack = false;
                return;
            }
            if (mForwardAnimatingPage != null)
            {
                WLog.d(WebPresenter.TAG, "onPageFinished() Found page from shouldOverrideUrlLoading()");
                mForwardAnimatingPage.state.title = mWebView.getTitle();
                mForwardAnimatingPage.state.pageLoadUrl = s;
                pushPage(mForwardAnimatingPage);
                mForwardAnimatingPage = null;
            } else
            {
                boolean flag;
                boolean flag1;
                if (mInitialState != null)
                {
                    WLog.d(WebPresenter.TAG, "onPageFinished() First time page load. Creating initial page.");
                    mInitialState.title = mWebView.getTitle();
                    webview = new Page(mInitialState);
                    mInitialState = null;
                } else
                {
                    WLog.d(WebPresenter.TAG, "onPageFinished() Non-user initiated page load. Copying current state");
                    webview = getCopyOfTopPage();
                    ((Page) (webview)).state.title = mWebView.getTitle();
                }
                flag1 = false;
                flag = flag1;
                if (!mPageStack.isEmpty())
                {
                    flag = flag1;
                    if (s.equals(((Page)mPageStack.peek()).state.pageLoadUrl))
                    {
                        flag = true;
                    }
                }
                if (!flag)
                {
                    ((Page) (webview)).state.pageLoadUrl = s.trim();
                    webview.isFullPageRefresh = true;
                    pushPage(webview);
                } else
                {
                    WLog.d(WebPresenter.TAG, (new StringBuilder()).append("onPageFinished() Page with same url is already at the top of the stack. Omitting page push for URL: ").append(s).toString());
                }
            }
            MessageBus.getBus().post((new com.walmartlabs.anivia.AniviaEventAsJson.Builder("pageView")).putString("name", (new StringBuilder()).append("webview : ").append(mWebView.getTitle()).toString()).putString("section", "webview").putString("subCategory", "webview").putString("url", s));
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            super.onPageStarted(webview, s, bitmap);
            mIsPageStarted = true;
            WLog.i(WebPresenter.TAG, (new StringBuilder()).append("onPageStarted: ").append(s).toString());
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            WLog.d(WebPresenter.TAG, String.format(Locale.US, "oReceivedError: errorCode %d, description %s", new Object[] {
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
            WLog.d(WebPresenter.TAG, (new StringBuilder()).append("shouldOverrideUrlLoading(): ").append(s).toString());
            if (handleUri(s))
            {
                WLog.d(WebPresenter.TAG, "Intercepted URL");
                return true;
            } else
            {
                WLog.d(WebPresenter.TAG, "Starting full page transition.");
                mForwardAnimatingPage = getCopyOfTopPage();
                mForwardAnimatingPage.isFullPageRefresh = true;
                mWebTransitionHandler.animateForward();
                return super.shouldOverrideUrlLoading(webview, s);
            }
        }

        public WebBus()
        {
            this$0 = WebPresenter.this;
            super();
            mObjectMapper = new ObjectMapper();
            mObjectMapper.configure(org.codehaus.jackson.map.DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        }
    }

    public static interface WebFragmentCallback
    {

        public abstract boolean isResumed();
    }


    public static final String MENU_COOKIES = "Show Cookies";
    public static final String MENU_RESTART = "Restart";
    public static final int REQUEST_START_LOGIN = 10;
    private static final String TAG = com/walmart/android/app/hybrid/WebPresenter.getSimpleName();
    private Activity mActivity;
    private MenuItem mCartMenuItem;
    private Page mForwardAnimatingPage;
    private JSBridgeAdapter.State mInitialState;
    private boolean mIsActive;
    private boolean mIsFullPageBack;
    private JSBridgeAdapter mJSBridgeAdapter;
    private AuthenticationStatusEvent mLastAuthEvent;
    private Listener mListener;
    private Stack mPageStack;
    private ViewGroup mRootView;
    private MenuItem mSearchMenuItem;
    private MenuItem mShareMenuItem;
    private boolean mStartedAccountActivityFromUrlIntercept;
    private String mUrl;
    private WebFragmentCallback mWebFragmentCallback;
    private WebTransitionHandler mWebTransitionHandler;
    private WebView mWebView;

    public WebPresenter(Activity activity)
    {
        mStartedAccountActivityFromUrlIntercept = false;
        mActivity = activity;
        mInitialState = new JSBridgeAdapter.State();
    }

    private void clearAllCookies()
    {
        WLog.d(TAG, "Clearing cookies");
        Util.clearWebViewCookies();
        if (mListener != null)
        {
            mListener.onCookiesCleared(mWebView);
        }
    }

    private Page getCopyOfTopPage()
    {
        if (!mPageStack.isEmpty())
        {
            return new Page((Page)mPageStack.peek());
        } else
        {
            Page page = new Page();
            WLog.e(TAG, "Bad State. Top page copy requested with empty stack.");
            return page;
        }
    }

    private boolean goBack()
    {
        if (mWebView.canGoBack())
        {
            if (!mPageStack.isEmpty())
            {
                Page page = (Page)mPageStack.pop();
                WLog.d(TAG, (new StringBuilder()).append("Stack change: popped page. isFullPageRefresh: ").append(page.isFullPageRefresh).toString());
                if (page.isFullPageRefresh)
                {
                    mIsFullPageBack = true;
                    mWebTransitionHandler.animateBack();
                } else
                {
                    mWebView.goBack();
                }
                if (!mPageStack.isEmpty())
                {
                    updateActionBarState(((Page)mPageStack.peek()).state);
                }
            } else
            {
                mWebView.goBack();
                Log.e(TAG, "Bad state. WebView.canGoBack() returned true but no page in pagestack available!");
            }
            return true;
        } else
        {
            return false;
        }
    }

    private boolean handleUri(String s)
    {
        if (!interceptLoginUrl(s)) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        Object obj;
        boolean flag1;
        obj = WalmartUri.parse(s);
        flag1 = false;
        flag = flag1;
        if (obj == null) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (((WalmartUri) (obj)).getType() == 14) goto _L4; else goto _L5
_L5:
        ((WalmartUri) (obj)).getType();
        JVM INSTR lookupswitch 5: default 96
    //                   2: 128
    //                   6: 169
    //                   7: 212
    //                   17: 391
    //                   22: 427;
           goto _L6 _L7 _L8 _L9 _L10 _L11
_L6:
        s = new Intent("android.intent.action.VIEW", Uri.parse(s), mActivity, com/walmart/android/app/main/HomeActivity);
        mActivity.startActivity(s);
_L13:
        return true;
_L7:
        s = ((WalmartUri) (obj)).getParam(0);
        s = new ShelfListPresenter(mActivity, s);
        s.setTitleText(mActivity.getString(0x7f090555));
        pushPresenter(s);
        continue; /* Loop/switch isn't completed */
_L8:
        s = ((WalmartUri) (obj)).getParam(0);
        s = new ShelfListPresenter(mActivity, s, 50);
        s.setTitleText(mActivity.getString(0x7f090555));
        pushPresenter(s);
        continue; /* Loop/switch isn't completed */
_L9:
        s = ((WalmartUri) (obj)).getParam(1);
        Object obj1 = Uri.parse(((WalmartUri) (obj)).getOriginalUri());
        obj = ((Uri) (obj1)).getQueryParameter("registryId");
        String s1 = ((Uri) (obj1)).getQueryParameter("listId");
        String s2 = ((Uri) (obj1)).getQueryParameter("listType");
        obj1 = ((Uri) (obj1)).getQueryParameter("listItemId");
        WLog.d(TAG, (new StringBuilder()).append("Item details registry params: ").append(((String) (obj))).append(", ").append(s1).append(", ").append(s2).append(", ").append(((String) (obj1))).toString());
        s = new ItemDetailsPresenter(mActivity, s);
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && !TextUtils.isEmpty(s1) && !TextUtils.isEmpty(((CharSequence) (obj1))) && !TextUtils.isEmpty(s2))
        {
            s.setListInfo(new ListInfo(((String) (obj)), s1, ((String) (obj1)), s2));
        }
        pushPresenter(s);
        continue; /* Loop/switch isn't completed */
_L10:
        s = new Bundle();
        s.putBoolean("START_SYNC", true);
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.SAVER_DASHBOARD, s));
        continue; /* Loop/switch isn't completed */
_L11:
        s = new Bundle();
        s.putString("start_mode", "root");
        MessageBus.getBus().post(new SwitchFragmentEvent(com.walmart.android.config.FragmentConfig.FragmentName.SHOP, s, true));
        if (true) goto _L13; else goto _L12
_L12:
    }

    private boolean interceptLoginUrl(String s)
    {
label0:
        {
            boolean flag1 = false;
            s = Uri.parse(s);
            Object obj = s.getPath();
            boolean flag = flag1;
            if (obj == null)
            {
                break label0;
            }
            if (!((String) (obj)).equals("/account/login") && !((String) (obj)).equals("/account/signup"))
            {
                flag = flag1;
                if (!((String) (obj)).equals("/signin"))
                {
                    break label0;
                }
            }
            WLog.d(TAG, (new StringBuilder()).append("Intercepting login URL: ").append(s.toString()).toString());
            obj = s.getQueryParameter("returnUrl");
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                s = (new StringBuilder()).append(s.getScheme()).append("://").append(s.getAuthority()).append(((String) (obj))).toString();
            } else
            {
                WLog.d(TAG, "No return URL found. Default to root.");
                s = mUrl;
            }
            WLog.d(TAG, (new StringBuilder()).append("Return URL: ").append(s).toString());
            obj = Services.get().getAuthentication();
            if (((Authentication) (obj)).hasCredentials())
            {
                WLog.d(TAG, "Have session token.");
                if (((Authentication) (obj)).needsSessionRenewal())
                {
                    renewSessionAndGoToReturnUrl(s);
                } else
                {
                    WLog.d(TAG, "Current session token valid. Passing cookies to bridge and loading returnUrl");
                    passCookiesToBridge();
                    mWebView.loadUrl(s);
                }
            } else
            {
                WLog.d(TAG, "Don't have session token. Starting AccountActivity.");
                startAccountActivity(s);
            }
            flag = true;
        }
        return flag;
    }

    private boolean isVisible()
    {
        return mIsActive && mWebFragmentCallback != null && mWebFragmentCallback.isResumed();
    }

    private void passCookiesToBridge()
    {
        if (!Services.get().getAuthentication().hasCredentials())
        {
            WLog.d(TAG, "passCookiesToBridge() Not signed in. Not passing cookies.");
        } else
        {
            Object obj = Uri.parse(mUrl);
            String s1 = (new StringBuilder()).append(((Uri) (obj)).getScheme()).append("://").append(((Uri) (obj)).getAuthority()).toString();
            obj = Services.get().getWalmartService();
            CookieManager cookiemanager = CookieManager.getInstance();
            obj = ((WalmartNetService) (obj)).getCookies();
            WLog.i(TAG, "Setting cookies");
            Iterator iterator = ((List) (obj)).iterator();
            while (iterator.hasNext()) 
            {
                Cookie cookie = (Cookie)iterator.next();
                String s2 = cookie.getPath();
                String s = s1;
                if (!TextUtils.isEmpty(s2))
                {
                    s = (new StringBuilder()).append(s1).append(s2).toString();
                }
                cookiemanager.setCookie(s, (new StringBuilder()).append(cookie.getName()).append("=").append(cookie.getValue()).toString());
            }
        }
    }

    private void printPageStack()
    {
        WLog.v(TAG, "PageStack: ");
        for (int i = 0; i < mPageStack.size(); i++)
        {
            Page page = (Page)mPageStack.get(i);
            WLog.i(TAG, (new StringBuilder()).append("Page: ").append(page.toString()).toString());
        }

    }

    private void pushPage(Page page)
    {
        WLog.d(TAG, (new StringBuilder()).append("Pushing page. isFullPageRefresh: ").append(page.isFullPageRefresh).toString());
        mPageStack.push(page);
        updateActionBarState(page.state);
    }

    private void renewSessionAndGoToReturnUrl(final String returnUrl)
    {
        WLog.d(TAG, "renewSessionAndGoToReturnUrl()");
        final ProgressDialog progressDialog = CustomProgressDialog.create(mActivity);
        Authentication authentication = Services.get().getAuthentication();
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(mActivity.getString(0x7f0901ce));
        progressDialog.show();
        authentication.renewSession(new com.walmart.android.wmservice.Authentication.AuthCallback() {

            final WebPresenter this$0;
            final ProgressDialog val$progressDialog;
            final String val$returnUrl;

            public void onFailure(int i)
            {
                Log.e(WebPresenter.TAG, "renewSessionAndGoToReturnUrl() Unable to renew session");
                progressDialog.dismiss();
            }

            public void onSuccess()
            {
                WLog.d(WebPresenter.TAG, "Successfully renewed session. Setting cookies and loading return URL.");
                progressDialog.dismiss();
                passCookiesToBridge();
                mWebView.loadUrl(returnUrl);
            }

            
            {
                this$0 = WebPresenter.this;
                progressDialog = progressdialog;
                returnUrl = s;
                super();
            }
        });
    }

    private boolean setMenuItemVisibility(MenuItem menuitem, boolean flag)
    {
        boolean flag2 = false;
        boolean flag1 = flag2;
        if (menuitem != null)
        {
            flag1 = flag2;
            if (menuitem.isVisible() != flag)
            {
                WLog.d(TAG, (new StringBuilder()).append("setMenuItemVisibility ").append(menuitem.getTitle()).append(" : ").append(flag).toString());
                menuitem.setVisible(flag);
                flag1 = true;
            }
        }
        return flag1 && flag;
    }

    private void setShareIntent(String s, String s1)
    {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        if (!TextUtils.isEmpty(s1))
        {
            intent.putExtra("android.intent.extra.SUBJECT", s1);
        }
        intent.putExtra("android.intent.extra.TEXT", s);
        ((WalmartShareActionProvider)MenuItemCompat.getActionProvider(mShareMenuItem)).setShareIntent(intent);
    }

    private void setupJavascriptBridge()
    {
        mJSBridgeAdapter = new JSBridgeAdapter(mActivity, mWebView);
        mJSBridgeAdapter.setCoreInterface(new HybridPlatformBridge(mActivity, mWebView));
        mJSBridgeAdapter.setPageStateListener(new JSPageListener());
        mJSBridgeAdapter.registerHandlers();
    }

    private void startAccountActivity(final String returnUrl)
    {
        Intent intent = new Intent(mActivity, com/walmart/android/app/account/AccountActivity);
        mStartedAccountActivityFromUrlIntercept = true;
        ActivityResultRouter.getInstance(mActivity).startActivityForResult(intent, 10, new com.walmart.android.app.main.ActivityResultRouter.ActivityResultCallback() {

            final WebPresenter this$0;
            final String val$returnUrl;

            public void onActivityResult(int i, int j, Intent intent1)
            {
                if (j == 1)
                {
                    WLog.d(WebPresenter.TAG, "AccountActivity returned RESULT_OK. Passing cookies.");
                    passCookiesToBridge();
                    mWebView.loadUrl(returnUrl);
                    return;
                } else
                {
                    WLog.d(WebPresenter.TAG, "AccountActivity was canceled.");
                    mStartedAccountActivityFromUrlIntercept = false;
                    mWebView.reload();
                    return;
                }
            }

            
            {
                this$0 = WebPresenter.this;
                returnUrl = s;
                super();
            }
        });
    }

    private void updateActionBarState(JSBridgeAdapter.State state)
    {
        if (isVisible())
        {
            WLog.d(TAG, (new StringBuilder()).append("updateActionBarState() ").append(state.toString()).toString());
            setTitleText(state.title);
            setMenuItemVisibility(mCartMenuItem, state.showCart);
            setMenuItemVisibility(mSearchMenuItem, state.showSearch);
            boolean flag;
            if (!TextUtils.isEmpty(state.shareText))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (setMenuItemVisibility(mShareMenuItem, flag))
            {
                setShareIntent(state.shareText, state.shareTitle);
            }
            ((AppCompatActivity)mActivity).getSupportActionBar().setTitle(state.title);
            return;
        } else
        {
            WLog.d(TAG, (new StringBuilder()).append("updateActionBarState() while not visible. ignoring. ").append(state.toString()).toString());
            return;
        }
    }

    public View getView()
    {
        return mRootView;
    }

    public boolean interceptBack()
    {
        if (mWebTransitionHandler.isFinishing())
        {
            WLog.d(TAG, "interceptBack() Transition handler is finishing. Return false.");
            return false;
        }
        if (mWebTransitionHandler.hasOngoingTransitions())
        {
            WLog.d(TAG, "interceptBack() Transition handler has ongoing transitions. Return true.");
            return true;
        }
        if (goBack())
        {
            return true;
        } else
        {
            WLog.d(TAG, "interceptBack() return false");
            return false;
        }
    }

    public void onAfterPop()
    {
        super.onAfterPop();
        MessageBus.getBus().unregister(this);
        mWebView.destroy();
        mWebView = null;
    }

    public void onAuthStatusChanged(AuthenticationStatusEvent authenticationstatusevent)
    {
        WLog.i(TAG, (new StringBuilder()).append("onAuthStatusChanged() loggedIn: ").append(authenticationstatusevent.loggedIn).toString());
        if (mLastAuthEvent == null || !mLastAuthEvent.loggedIn || authenticationstatusevent.loggedIn) goto _L2; else goto _L1
_L1:
        WLog.i(TAG, "onAuthStatusChanged() user signed out. Clearing cookies and restarting.");
        clearAllCookies();
        if (mListener != null)
        {
            mListener.onRestart();
        }
_L4:
        mLastAuthEvent = authenticationstatusevent;
        return;
_L2:
        if ((mLastAuthEvent == null || !mLastAuthEvent.loggedIn) && authenticationstatusevent.loggedIn)
        {
            if (!mStartedAccountActivityFromUrlIntercept)
            {
                WLog.i(TAG, "onAuthStatusChanged() signed in from app. Passing cookies and reloading.");
                passCookiesToBridge();
                mWebView.reload();
            } else
            {
                WLog.i(TAG, "onAuthStatusChanged() signed in from intercepted URL. Session transfer handled from AccountActivity callback.");
                mStartedAccountActivityFromUrlIntercept = false;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onBeforePoppedTo()
    {
        super.onBeforePoppedTo();
        mIsActive = true;
    }

    public void onBeforePush()
    {
        super.onBeforePush();
        if (!TextUtils.isEmpty(mUrl))
        {
            WLog.i(TAG, (new StringBuilder()).append("onBeforePush() loading URL: ").append(mUrl).toString());
            mWebView.loadUrl(mUrl);
        }
        MessageBus.getBus().register(this);
    }

    public boolean onCreateMenu(Menu menu, MenuInflater menuinflater)
    {
        WLog.d(TAG, "onCreateMenu()");
        mShareMenuItem = menu.findItem(0x7f100692);
        mSearchMenuItem = menu.findItem(0x7f100691);
        mCartMenuItem = menu.findItem(0x7f100690);
        if (mInitialState == null) goto _L2; else goto _L1
_L1:
        WLog.d(TAG, "hasInitialState");
        updateActionBarState(mInitialState);
_L4:
        return false;
_L2:
        WLog.d(TAG, (new StringBuilder()).append("page stack isEmpty: ").append(mPageStack.isEmpty()).toString());
        if (!mPageStack.isEmpty())
        {
            updateActionBarState(((Page)mPageStack.peek()).state);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onCreateView(ViewGroup viewgroup)
    {
        super.onCreateView(viewgroup);
        if (mRootView == null)
        {
            mPageStack = new Stack();
            mRootView = (ViewGroup)ViewUtil.inflate(mActivity, 0x7f0401d5, viewgroup);
            mWebView = (WebView)ViewUtil.findViewById(mRootView, 0x7f100609);
            mWebTransitionHandler = new WebTransitionHandler();
            mWebTransitionHandler.init(mRootView);
            mWebView.setScrollBarStyle(0);
            mWebView.getSettings().setJavaScriptEnabled(true);
            mWebView.getSettings().setDomStorageEnabled(true);
            String s = mWebView.getSettings().getUserAgentString();
            viewgroup = s;
            if (s == null)
            {
                viewgroup = "";
            }
            mWebView.getSettings().setUserAgentString((new StringBuilder()).append(viewgroup).append(" WMTAPP").toString());
            mWebView.setWebViewClient(new WebBus());
            mWebView.setWebChromeClient(new WebChromeClient() {

                final WebPresenter this$0;

                public void onConsoleMessage(String s1, int i, String s2)
                {
                    super.onConsoleMessage(s1, i, s2);
                    WLog.v(WebPresenter.TAG, (new StringBuilder()).append("onConsoleMessage: ").append(s1).append(" ").append(s2).append(" ").append(i).toString());
                }

            
            {
                this$0 = WebPresenter.this;
                super();
            }
            });
            clearAllCookies();
            passCookiesToBridge();
            setupJavascriptBridge();
        }
    }

    public void onNewTop()
    {
        super.onNewTop();
        mIsActive = false;
    }

    public boolean onOptionsMenuItemSelected(MenuItem menuitem, Activity activity)
    {
        return super.onOptionsMenuItemSelected(menuitem, activity);
    }

    public void onPop()
    {
        super.onPop();
        mIsActive = false;
    }

    public void onPushed()
    {
        super.onPushed();
        mIsActive = true;
    }

    public void onResumeAsTop()
    {
        super.onResumeAsTop();
        mIsActive = true;
    }

    public void onStopAsTop()
    {
        super.onStopAsTop();
        mIsActive = false;
    }

    public void setInitialActionbarState(String s, boolean flag, boolean flag1)
    {
        mInitialState = new JSBridgeAdapter.State();
        mInitialState.title = s;
        mInitialState.showSearch = flag;
        mInitialState.showCart = flag1;
    }

    public void setListener(Listener listener)
    {
        mListener = listener;
    }

    public void setUrl(String s)
    {
        mUrl = s;
    }

    public void setWebFragmentCallbacks(WebFragmentCallback webfragmentcallback)
    {
        mWebFragmentCallback = webfragmentcallback;
    }









/*
    static boolean access$1402(WebPresenter webpresenter, boolean flag)
    {
        webpresenter.mIsFullPageBack = flag;
        return flag;
    }

*/



/*
    static JSBridgeAdapter.State access$1502(WebPresenter webpresenter, JSBridgeAdapter.State state)
    {
        webpresenter.mInitialState = state;
        return state;
    }

*/



/*
    static boolean access$1702(WebPresenter webpresenter, boolean flag)
    {
        webpresenter.mStartedAccountActivityFromUrlIntercept = flag;
        return flag;
    }

*/





/*
    static Page access$502(WebPresenter webpresenter, Page page)
    {
        webpresenter.mForwardAnimatingPage = page;
        return page;
    }

*/




}
