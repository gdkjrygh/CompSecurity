// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.embeddedbrowser;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.MailTo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.contextlogic.wish.ApplicationDeepLinkConfig;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.api.core.ApiDataChangeNotificationManager;
import com.contextlogic.wish.api.core.WishApi;
import com.contextlogic.wish.api.core.WishApiConfig;
import com.contextlogic.wish.api.service.UploadImageService;
import com.contextlogic.wish.facebook.FacebookManager;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;
import com.contextlogic.wish.ui.components.navigation.NavigationBarButtonCallback;
import com.contextlogic.wish.ui.components.navigation.NavigationBarWrapper;
import com.contextlogic.wish.ui.components.webview.InterceptingTouchWebView;
import com.contextlogic.wish.ui.fragment.base.BaseContentFragment;
import com.contextlogic.wish.ui.fragment.menu.MainMenuItem;
import com.contextlogic.wish.user.UserStatusManager;
import com.contextlogic.wish.util.BitmapUtil;
import com.contextlogic.wish.util.CompatibilityUtil;
import com.contextlogic.wish.util.FileUtil;
import com.facebook.AppEventsLogger;

// Referenced classes of package com.contextlogic.wish.ui.fragment.embeddedbrowser:
//            WebViewSetupTask, BaseWebViewClient

public class EmbeddedBrowserFragment extends BaseContentFragment
{
    private class EmbeddedWebViewClient extends BaseWebViewClient
    {

        final EmbeddedBrowserFragment this$0;

        public void onPageFinished(WebView webview, String s)
        {
            refreshForwardBackButtons();
            hideProgressIndicator();
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            refreshForwardBackButtons();
            showProgressIndicator();
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            if (getActivity() == null)
            {
                return;
            } else
            {
                PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f06017e));
                refreshForwardBackButtons();
                hideProgressIndicator();
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
            closeBrowser();
_L4:
            return true;
_L6:
            if (!s.equalsIgnoreCase("purchase-complete")) goto _L8; else goto _L7
_L7:
            UserStatusManager.getInstance().resetCartCount();
            if (cartAmount == -1D || currencyCode == null || cartItemIds == null) goto _L10; else goto _L9
_L9:
            webview = new Bundle();
            webview.putString("fb_currency", currencyCode);
            webview.putString("fb_content_type", "product");
            webview.putString("fb_content_id", cartItemIds);
            FacebookManager.getInstance().getAppEventLogger().logEvent("fb_mobile_purchase", cartAmount, webview);
_L11:
            purchaseCompleted = true;
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
                closeBrowser();
            } else
            if (s.equalsIgnoreCase("set-back-marker"))
            {
                backMarkerUrl = getCurrentUrl();
            } else
            if (s.equalsIgnoreCase("upload-image"))
            {
                webview = webview.getQueryParameter("id");
                openImageUploader(webview);
            } else
            {
                webview = WishDeepLinkActivity.getDeepLinkTarget(webview);
                if (webview != null && webview.getType() != com.contextlogic.wish.ApplicationDeepLinkConfig.DeepLinkType.Website)
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

        private EmbeddedWebViewClient()
        {
            this$0 = EmbeddedBrowserFragment.this;
            super();
        }

    }

    class LoadListener
    {

        final EmbeddedBrowserFragment this$0;

        public void checkElement(boolean flag)
        {
            if (flag)
            {
                ((RootActivity)getActivity()).setTestingOutput("True");
                return;
            } else
            {
                ((RootActivity)getActivity()).setTestingOutput("False");
                return;
            }
        }

        public void getElementText(String s)
        {
            ((RootActivity)getActivity()).setTestingOutput(s);
        }

        LoadListener()
        {
            this$0 = EmbeddedBrowserFragment.this;
            super();
        }
    }


    public static final String ARG_CART_AMOUNT = "ArgCartAmount";
    public static final String ARG_CART_ITEM_IDS = "ArgCartItemIds";
    public static final String ARG_CART_PAGE_MODE = "ArgCartPageMode";
    public static final String ARG_CURRENCY_CODE = "ArgCurrencyCode";
    public static final String ARG_FROM_CHECKOUT = "ArgFromCheckout";
    public static final String ARG_INITIAL_URL = "ArgInitialUrl";
    public static final String ARG_USE_NATIVE_STYLE = "ArgUseNativeStyle";
    private static final String STORED_STATE_DATA = "StoredStateData";
    private ImageView backButton;
    private String backMarkerUrl;
    private double cartAmount;
    private String cartItemIds;
    private String currencyCode;
    private boolean firstLoadComplete;
    private ImageView forwardButton;
    private boolean fromCheckout;
    private String initialUrl;
    private ProgressBar loadingSpinner;
    private View overlayLoadingView;
    private boolean purchaseCompleted;
    private boolean shouldUseNativeStyle;
    private View toolbar;
    private UploadImageService uploadImageService;
    private InterceptingTouchWebView webView;

    public EmbeddedBrowserFragment()
    {
    }

    private void closeBrowser()
    {
        CompatibilityUtil.disableHardwareAcceleration(webView);
        ((RootActivity)getActivity()).closeScreensWithCount(1);
    }

    private void completeWebViewSetup()
    {
        if (webView == null)
        {
            return;
        }
        webView.setWebViewClient(new EmbeddedWebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setPluginState(android.webkit.WebSettings.PluginState.ON);
        webView.getSettings().setDomStorageEnabled(true);
        if (WishApplication.getAppInstance().isTestingBuild())
        {
            webView.addJavascriptInterface(new LoadListener(), "HTMLOUT");
        }
        if (!shouldUseNativeStyle)
        {
            webView.getSettings().setBuiltInZoomControls(true);
            webView.getSettings().setSupportZoom(true);
        }
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setScrollBarStyle(0x2000000);
        webView.loadUrl(initialUrl);
    }

    private String getCurrentUrl()
    {
        String s1 = webView.getUrl();
        String s = s1;
        if (s1 == null)
        {
            s = initialUrl;
        }
        return s;
    }

    private void goBack()
    {
        webView.goBack();
    }

    private void goForward()
    {
        webView.goForward();
    }

    private void hideProgressIndicator()
    {
        loadingSpinner.setVisibility(8);
        overlayLoadingView.setVisibility(8);
    }

    private void openImageUploader(final String id)
    {
        final RootActivity rootActivity = (RootActivity)getActivity();
        if (rootActivity != null)
        {
            rootActivity.setUploadMessage(new ValueCallback() {

                final EmbeddedBrowserFragment this$0;
                final String val$id;
                final RootActivity val$rootActivity;

                public void onReceiveValue(Uri uri)
                {
                    showProgressIndicator();
                    Object obj = null;
                    try
                    {
                        uri = BitmapUtil.decodeBitmapFile(FileUtil.getPath(rootActivity, uri), 1024, 1024);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Uri uri)
                    {
                        uri = obj;
                    }
                    if (uri == null)
                    {
                        showNoImageError();
                        hideProgressIndicator();
                        return;
                    } else
                    {
                        uploadImageService.requestService(uri, "ticket-image-uploads", new com.contextlogic.wish.api.service.UploadImageService.SuccessCallback() {

                            final _cls6 this$1;

                            public void onServiceSucceeded(String s, String s1)
                            {
                                hideProgressIndicator();
                                s = String.format("javascript:$(window).trigger('imageUrlReceived',['%s', '%s', '%s']);", new Object[] {
                                    id, s, s1
                                });
                                webView.loadUrl(s);
                            }

            
            {
                this$1 = _cls6.this;
                super();
            }
                        }, new com.contextlogic.wish.api.service.ApiService.FailureCallback() {

                            final _cls6 this$1;

                            public void onServiceFailed()
                            {
                                hideProgressIndicator();
                                PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), getActivity().getString(0x7f06017e));
                            }

            
            {
                this$1 = _cls6.this;
                super();
            }
                        });
                        return;
                    }
                }

                public volatile void onReceiveValue(Object obj)
                {
                    onReceiveValue((Uri)obj);
                }

            
            {
                this$0 = EmbeddedBrowserFragment.this;
                rootActivity = rootactivity;
                id = s;
                super();
            }
            });
            rootActivity.openImageIntent();
        }
    }

    private void refreshForwardBackButtons()
    {
        if (!webView.canGoBack()) goto _L2; else goto _L1
_L1:
        backButton.setEnabled(true);
        if (backButton.getBackground() != null)
        {
            backButton.getBackground().setAlpha(255);
        }
_L8:
        if (!webView.canGoForward()) goto _L4; else goto _L3
_L3:
        forwardButton.setEnabled(true);
        if (forwardButton.getBackground() != null)
        {
            forwardButton.getBackground().setAlpha(255);
        }
_L6:
        return;
_L2:
        backButton.setEnabled(false);
        if (backButton.getBackground() != null)
        {
            backButton.getBackground().setAlpha(50);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        forwardButton.setEnabled(false);
        if (forwardButton.getBackground() == null) goto _L6; else goto _L5
_L5:
        forwardButton.getBackground().setAlpha(50);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void showActionMenu()
    {
        Object obj = getActivity().getString(0x7f060460);
        obj = new ArrayAdapter(getActivity(), 0x1090011, new String[] {
            obj
        });
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setTitle(getString(0x7f060032));
        builder.setAdapter(((android.widget.ListAdapter) (obj)), new android.content.DialogInterface.OnClickListener() {

            final EmbeddedBrowserFragment this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                switch (i)
                {
                default:
                    return;

                case 0: // '\0'
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(getCurrentUrl())));
                    break;
                }
            }

            
            {
                this$0 = EmbeddedBrowserFragment.this;
                super();
            }
        });
        builder.show();
    }

    private void showNoImageError()
    {
        RootActivity rootactivity = (RootActivity)getActivity();
        if (rootactivity != null)
        {
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(rootactivity);
            builder.setTitle(rootactivity.getString(0x7f0602df));
            builder.setMessage(rootactivity.getString(0x7f0602de, new Object[] {
                WishApplication.getAppInstance().getAppName()
            }));
            builder.setPositiveButton(rootactivity.getString(0x7f060305), new android.content.DialogInterface.OnClickListener() {

                final EmbeddedBrowserFragment this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                }

            
            {
                this$0 = EmbeddedBrowserFragment.this;
                super();
            }
            });
            builder.show();
        }
    }

    private void showProgressIndicator()
    {
        if (shouldUseNativeStyle)
        {
            overlayLoadingView.setVisibility(0);
            return;
        } else
        {
            loadingSpinner.setVisibility(0);
            return;
        }
    }

    public void checkWebElment(String s)
    {
        if (loadingSpinner.getVisibility() != 0 && overlayLoadingView.getVisibility() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1;
        s1 = null;
        if (!s.startsWith("tag:"))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = String.format("javascript:window.HTMLOUT.checkElement(document.getElementsByTagName('%s').length > 0);", new Object[] {
            s.substring(4)
        });
_L4:
        if (s1 != null)
        {
            webView.loadUrl(s1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (s.startsWith("class:"))
        {
            s1 = String.format("javascript:window.HTMLOUT.checkElement(document.getElementsByClassName('%s').length > 0);", new Object[] {
                s.substring(6)
            });
        } else
        if (s.startsWith("xpath:"))
        {
            s1 = String.format("javascript:window.HTMLOUT.checkElement(document.evaluate('%s', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue != null);", new Object[] {
                s.substring(6)
            });
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void clickWebElement(String s)
    {
        if (loadingSpinner.getVisibility() != 0 && overlayLoadingView.getVisibility() != 0)
        {
            String s1 = null;
            if (s.startsWith("tag:"))
            {
                s1 = String.format("javascript:(function(){l=document.getElementByTagName('%s')[0];e=document.createEvent('HTMLEvents');e.initEvent('click',true,true);l.dispatchEvent(e);})()", new Object[] {
                    s.substring(4)
                });
            } else
            if (s.startsWith("class:"))
            {
                s1 = String.format("javascript:(function(){l=document.getElementsByClassName('%s')[0];e=document.createEvent('HTMLEvents');e.initEvent('click',true,true);l.dispatchEvent(e);})()", new Object[] {
                    s.substring(6)
                });
            }
            if (s1 != null)
            {
                webView.loadUrl(s1);
                return;
            }
        }
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.EmbeddedBrowser;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f03004d;
    }

    public MainMenuItem getTopLevelMenuItem()
    {
        boolean flag = false;
        if (initialUrl != null)
        {
            flag = initialUrl.equals(String.format("https://%s/m/transaction", new Object[] {
                WishApi.getInstance().getConfig().getApiBaseUrlString()
            }));
        }
        if (flag)
        {
            return MainMenuItem.ORDER_HISTORY;
        } else
        {
            return null;
        }
    }

    public void getWebElmentText(String s)
    {
        if (loadingSpinner.getVisibility() != 0 && overlayLoadingView.getVisibility() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1;
        s1 = null;
        if (!s.startsWith("tag:"))
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = String.format("javascript:window.HTMLOUT.getElementText(document.getElementsByTagName('%s')[0].innerText);", new Object[] {
            s.substring(4)
        });
_L4:
        if (s1 != null)
        {
            webView.loadUrl(s1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (s.startsWith("class:"))
        {
            s1 = String.format("javascript:window.HTMLOUT.getElementText(document.getElementsByClassName('%s')[0].innerText);", new Object[] {
                s.substring(6)
            });
        } else
        if (s.startsWith("xpath:"))
        {
            s1 = String.format("javascript:window.HTMLOUT.getElementText(document.evaluate('%s', document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue.innerText);", new Object[] {
                s.substring(6)
            });
        }
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void handleResume()
    {
        super.handleResume();
        if (!firstLoadComplete)
        {
            firstLoadComplete = true;
            (new WebViewSetupTask(getActivity(), new WebViewSetupTask.PostExecuteCallback() {

                final EmbeddedBrowserFragment this$0;

                public void onPostExecuteComplete()
                {
                    completeWebViewSetup();
                }

            
            {
                this$0 = EmbeddedBrowserFragment.this;
                super();
            }
            })).execute(new Void[0]);
        }
        if (webView != null)
        {
            webView.setVisibility(0);
            webView.setFocusable(true);
            webView.requestFocus(130);
            webView.resumeTimers();
        }
        refreshForwardBackButtons();
    }

    protected void initializeUi(View view)
    {
        getNavigationBar().setTitleLogo();
        overlayLoadingView = view.findViewById(0x7f0d01bf);
        toolbar = view.findViewById(0x7f0d01be);
        if (shouldUseNativeStyle)
        {
            toolbar.setVisibility(8);
        } else
        {
            overlayLoadingView.setVisibility(8);
        }
        backButton = (ImageView)view.findViewById(0x7f0d01c0);
        backButton.setOnClickListener(new android.view.View.OnClickListener() {

            final EmbeddedBrowserFragment this$0;

            public void onClick(View view1)
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Back);
                goBack();
            }

            
            {
                this$0 = EmbeddedBrowserFragment.this;
                super();
            }
        });
        forwardButton = (ImageView)view.findViewById(0x7f0d01c2);
        forwardButton.setOnClickListener(new android.view.View.OnClickListener() {

            final EmbeddedBrowserFragment this$0;

            public void onClick(View view1)
            {
                trackClick(com.contextlogic.wish.analytics.Analytics.EventType.Forward);
                goForward();
            }

            
            {
                this$0 = EmbeddedBrowserFragment.this;
                super();
            }
        });
        loadingSpinner = (ProgressBar)view.findViewById(0x7f0d01c1);
        showProgressIndicator();
        webView = (InterceptingTouchWebView)view.findViewById(0x7f0d01bd);
        webView.setVisibility(0);
        webView.setFocusable(true);
        webView.requestFocus(130);
        if (shouldUseNativeStyle)
        {
            webView.setBackgroundColor(getResources().getColor(0x7f0c00e8));
            webView.setAllowTouch(true);
        }
        if (!shouldUseNativeStyle)
        {
            getNavigationBar().setMenuItem(getResources().getString(0x7f0603b7), 0x7f0200e2, new NavigationBarButtonCallback() {

                final EmbeddedBrowserFragment this$0;

                public void onMenuItemClicked()
                {
                    trackClick(com.contextlogic.wish.analytics.Analytics.EventType.ViewActions);
                    showActionMenu();
                }

            
            {
                this$0 = EmbeddedBrowserFragment.this;
                super();
            }
            });
        }
        uploadImageService = new UploadImageService();
    }

    public boolean onBackPressed()
    {
        String s = getCurrentUrl();
        boolean flag;
        if (backMarkerUrl != null && s != null && s.equals(backMarkerUrl))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (shouldUseNativeStyle && webView.canGoBack() && !flag)
        {
            webView.goBack();
            return true;
        } else
        {
            CompatibilityUtil.disableHardwareAcceleration(webView);
            return super.onBackPressed();
        }
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        if (webView != null)
        {
            webView.setWebViewClient(null);
            webView.loadUrl("about:blank");
            webView.pauseTimers();
            webView = null;
        }
    }

    public void onPause()
    {
        super.onPause();
        if (webView != null)
        {
            webView.stopLoading();
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (webView != null)
        {
            bundle.putString("StoredStateData", getCurrentUrl());
        }
    }

    protected void restoreState(Bundle bundle)
    {
        super.restoreState(bundle);
        if (bundle != null && bundle.containsKey("StoredStateData"))
        {
            initialUrl = bundle.getString("StoredStateData");
        } else
        {
            initialUrl = getArguments().getString("ArgInitialUrl");
        }
        if (getArguments() != null)
        {
            shouldUseNativeStyle = getArguments().getBoolean("ArgUseNativeStyle", false);
            fromCheckout = getArguments().getBoolean("ArgFromCheckout", false);
            cartAmount = getArguments().getDouble("ArgCartAmount");
            currencyCode = getArguments().getString("ArgCurrencyCode");
            cartItemIds = getArguments().getString("ArgCartItemIds");
        } else
        {
            shouldUseNativeStyle = false;
            cartAmount = -1D;
            cartItemIds = null;
        }
        if (initialUrl != null)
        {
            bundle = Uri.parse(initialUrl);
            if (bundle.getHost() != null && bundle.getHost().contains(WishApi.getInstance().getConfig().getApiBaseUrlString()))
            {
                shouldUseNativeStyle = true;
            }
        }
    }

    public boolean useCanvasBackground()
    {
        return shouldUseNativeStyle;
    }








/*
    static boolean access$1502(EmbeddedBrowserFragment embeddedbrowserfragment, boolean flag)
    {
        embeddedbrowserfragment.purchaseCompleted = flag;
        return flag;
    }

*/


/*
    static String access$1602(EmbeddedBrowserFragment embeddedbrowserfragment, String s)
    {
        embeddedbrowserfragment.backMarkerUrl = s;
        return s;
    }

*/










}
