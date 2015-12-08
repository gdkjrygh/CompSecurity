// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Environment;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.sessionm.core.Config;
import com.sessionm.core.Session;
import com.sessionm.core.StatsCollector;
import com.sessionm.core.h;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

// Referenced classes of package com.sessionm.ui:
//            LoaderView, HTML5InlineVideoJSInterface, ActivityController

public class SessionMViewContainer
    implements LoaderView.Listener
{
    public static final class ActivityControllerTestFailureMode extends Enum
    {

        private static final ActivityControllerTestFailureMode $VALUES[];
        public static final ActivityControllerTestFailureMode CONTENT_UNAVAILABLE;
        public static final ActivityControllerTestFailureMode NONE;
        public static final ActivityControllerTestFailureMode WEB_VIEW_LOAD_FAILURE;

        public static ActivityControllerTestFailureMode valueOf(String s)
        {
            return (ActivityControllerTestFailureMode)Enum.valueOf(com/sessionm/ui/SessionMViewContainer$ActivityControllerTestFailureMode, s);
        }

        public static ActivityControllerTestFailureMode[] values()
        {
            return (ActivityControllerTestFailureMode[])$VALUES.clone();
        }

        static 
        {
            NONE = new ActivityControllerTestFailureMode("NONE", 0);
            CONTENT_UNAVAILABLE = new ActivityControllerTestFailureMode("CONTENT_UNAVAILABLE", 1);
            WEB_VIEW_LOAD_FAILURE = new ActivityControllerTestFailureMode("WEB_VIEW_LOAD_FAILURE", 2);
            $VALUES = (new ActivityControllerTestFailureMode[] {
                NONE, CONTENT_UNAVAILABLE, WEB_VIEW_LOAD_FAILURE
            });
        }

        private ActivityControllerTestFailureMode(String s, int i)
        {
            super(s, i);
        }
    }

    private class ContainerWebViewClient extends WebViewClient
    {

        final SessionMViewContainer this$0;
        private long webViewStartTime;

        public void onPageFinished(WebView webview, String s)
        {
label0:
            {
                long l = System.currentTimeMillis() - webViewStartTime;
                StatsCollector.a(com.sessionm.core.StatsCollector.Stat.ey, l);
                if (Log.isLoggable("SessionM.WebView", 3))
                {
                    Log.d("SessionM.WebView", String.format("Finished web view loading duration: %d", new Object[] {
                        Long.valueOf(l)
                    }));
                }
                if (webView != null && type == WebViewType.BROWSER && loaderView != null)
                {
                    loaderView.dismiss();
                    loaderView = null;
                    webView.setVisibility(0);
                }
                CookieSyncManager.getInstance().sync();
                if (listener != null)
                {
                    if (!SessionMViewContainer.failureMode.equals(ActivityControllerTestFailureMode.WEB_VIEW_LOAD_FAILURE))
                    {
                        break label0;
                    }
                    listener.onFailure(SessionMViewContainer.this, 5, "web view error failure simulation", s);
                }
                return;
            }
            listener.onViewLoaded(SessionMViewContainer.this, s);
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            super.onPageStarted(webview, s, bitmap);
            webViewStartTime = System.currentTimeMillis();
            if (Log.isLoggable("SessionM.WebView", 3))
            {
                Log.d("SessionM.WebView", (new StringBuilder()).append("Web view loading started, url: ").append(s).toString());
            }
            if (listener != null)
            {
                listener.onViewLoadStarted(SessionMViewContainer.this, s);
            }
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            if (Log.isLoggable("SessionM.WebView", 3))
            {
                Log.d("SessionM.WebView", (new StringBuilder()).append("Failed to load web view, url: ").append(s1).append(", description: ").append(s).append(", code: ").append(i).toString());
            }
            if (listener != null)
            {
                listener.onFailure(SessionMViewContainer.this, i, s, s1);
            }
        }

        public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
        {
            if (Log.isLoggable("SessionM.WebView", 3))
            {
                Log.d("SessionM.WebView", (new StringBuilder()).append("onReceivedSslError() callback while loading web view, error: ").append(sslerror).toString());
            }
            sslerrorhandler.proceed();
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            if (Log.isLoggable("SessionM.WebView", 3))
            {
                Log.d("SessionM.WebView", (new StringBuilder()).append("Processing URL redirect: ").append(s).toString());
            }
            boolean flag1 = super.shouldOverrideUrlLoading(webview, s);
            boolean flag2;
            boolean flag3;
            if (flag1)
            {
                return true;
            }
            flag2 = flag1;
            flag3 = flag1;
            webview = Uri.parse(s);
            flag2 = flag1;
            flag3 = flag1;
            Object obj = webview.getScheme();
            flag2 = flag1;
            flag3 = flag1;
            if (((String) (obj)).equalsIgnoreCase("external")) goto _L2; else goto _L1
_L1:
            flag2 = flag1;
            flag3 = flag1;
            if (!((String) (obj)).equalsIgnoreCase("external-secure")) goto _L3; else goto _L2
_L2:
            flag2 = flag1;
            flag3 = flag1;
            if (!((String) (obj)).equalsIgnoreCase("external")) goto _L5; else goto _L4
_L4:
            flag2 = flag1;
            flag3 = flag1;
            webview = String.format("http:%s", new Object[] {
                webview.getEncodedSchemeSpecificPart()
            });
_L13:
            flag2 = flag1;
            flag3 = flag1;
            obj = new Intent("android.intent.action.VIEW");
            flag2 = flag1;
            flag3 = flag1;
            if (((Intent) (obj)).resolveActivity(hostingActivity.getPackageManager()) != null) goto _L7; else goto _L6
_L6:
            flag2 = flag1;
            flag3 = flag1;
            if (!Log.isLoggable("SessionM.WebView", 6))
            {
                break MISSING_BLOCK_LABEL_228;
            }
            flag2 = flag1;
            flag3 = flag1;
            Log.e("SessionM.WebView", "Unable to resolve activity for external url");
            flag2 = flag1;
            flag3 = flag1;
            if (listener == null) goto _L9; else goto _L8
_L8:
            flag2 = flag1;
            flag3 = flag1;
            listener.onFailure(SessionMViewContainer.this, -1, "Unable to resolve activity for external url", webview);
              goto _L9
_L14:
            boolean flag;
            flag1 = flag;
            if (!flag) goto _L11; else goto _L10
_L10:
            flag2 = flag;
            flag3 = flag;
            flag1 = flag;
            if (!Log.isLoggable("SessionM.WebView", 3)) goto _L11; else goto _L12
_L12:
            flag2 = flag;
            flag3 = flag;
            Log.d("SessionM.WebView", (new StringBuilder()).append("Started Android activity for url: ").append(s).toString());
            flag1 = flag;
              goto _L11
_L5:
            flag2 = flag1;
            flag3 = flag1;
            webview = String.format("https:%s", new Object[] {
                webview.getEncodedSchemeSpecificPart()
            });
              goto _L13
_L7:
            flag2 = flag1;
            flag3 = flag1;
            ((Intent) (obj)).setData(Uri.parse(webview));
            flag2 = flag1;
            flag3 = flag1;
            hostingActivity.startActivity(((Intent) (obj)));
            flag = true;
              goto _L14
_L3:
            flag2 = flag1;
            flag3 = flag1;
            if (((String) (obj)).equalsIgnoreCase("sip")) goto _L16; else goto _L15
_L15:
            flag2 = flag1;
            flag3 = flag1;
            if (((String) (obj)).equalsIgnoreCase("geo")) goto _L16; else goto _L17
_L17:
            flag2 = flag1;
            flag3 = flag1;
            if (((String) (obj)).equalsIgnoreCase("content")) goto _L16; else goto _L18
_L18:
            flag2 = flag1;
            flag3 = flag1;
            if (((String) (obj)).equalsIgnoreCase("tel")) goto _L16; else goto _L19
_L19:
            flag2 = flag1;
            flag3 = flag1;
            if (((String) (obj)).equalsIgnoreCase("sms")) goto _L16; else goto _L20
_L20:
            flag2 = flag1;
            flag3 = flag1;
            if (((String) (obj)).equalsIgnoreCase("market")) goto _L16; else goto _L21
_L21:
            flag = flag1;
            flag2 = flag1;
            flag3 = flag1;
            if (!((String) (obj)).equalsIgnoreCase("mailto")) goto _L14; else goto _L16
_L16:
            flag2 = flag1;
            flag3 = flag1;
            webview = new Intent("android.intent.action.VIEW");
            flag2 = flag1;
            flag3 = flag1;
            if (webview.resolveActivity(hostingActivity.getPackageManager()) != null)
            {
                break MISSING_BLOCK_LABEL_675;
            }
            flag2 = flag1;
            flag3 = flag1;
            if (!Log.isLoggable("SessionM.WebView", 6))
            {
                break MISSING_BLOCK_LABEL_625;
            }
            flag2 = flag1;
            flag3 = flag1;
            Log.e("SessionM.WebView", "Unable to resolve activity for url");
            flag2 = flag1;
            flag3 = flag1;
            if (listener == null)
            {
                break MISSING_BLOCK_LABEL_806;
            }
            flag2 = flag1;
            flag3 = flag1;
            listener.onFailure(SessionMViewContainer.this, -1, "Unable to resolve activity for url", s);
            break MISSING_BLOCK_LABEL_806;
            flag2 = flag1;
            flag3 = flag1;
            webview.setFlags(0x2000000);
            flag2 = flag1;
            flag3 = flag1;
            webview.setData(Uri.parse(s));
            flag2 = flag1;
            flag3 = flag1;
            hostingActivity.startActivity(webview);
            flag = true;
              goto _L14
            webview;
            flag1 = false;
_L24:
            executeJavascript("GreyhoundEventDispatcher.dispatch('external.error','Activity Not Found');");
            break; /* Loop/switch isn't completed */
            webview;
            flag1 = false;
_L23:
            executeJavascript(String.format("GreyhoundEventDispatcher.dispatch('external.error',%s);", new Object[] {
                webview.getMessage()
            }));
            break; /* Loop/switch isn't completed */
            webview;
            flag1 = flag2;
            if (true) goto _L23; else goto _L22
_L22:
            break; /* Loop/switch isn't completed */
            webview;
            flag1 = flag3;
            if (true) goto _L24; else goto _L11
_L9:
            flag = false;
              goto _L14
_L11:
            return flag1;
            flag = false;
              goto _L14
        }

        private ContainerWebViewClient()
        {
            this$0 = SessionMViewContainer.this;
            super();
        }

    }

    private class MyWebChromeClient extends WebChromeClient
    {

        final SessionMViewContainer this$0;

        public boolean onConsoleMessage(ConsoleMessage consolemessage)
        {
            if (Log.isLoggable("SessionM.WebView", 3))
            {
                Log.d("SessionM.WebView", String.format("Line : %s  message %s", new Object[] {
                    Integer.valueOf(consolemessage.lineNumber()), consolemessage.message()
                }));
            }
            return true;
        }

        public void onGeolocationPermissionsShowPrompt(String s, android.webkit.GeolocationPermissions.Callback callback)
        {
            callback.invoke(s, true, false);
        }

        public void onHideCustomView()
        {
            executeJavascript("GreyhoundEventDispatcher.dispatch('notify-view-hidden','view was hidden');");
        }

        public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
        {
            result = jsresult;
            webview = new android.app.AlertDialog.Builder(hostingActivity);
            webview.setMessage(s1);
            webview.setTitle("Alert");
            webview.setPositiveButton("OK", new android.content.DialogInterface.OnClickListener() {

                final MyWebChromeClient this$1;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    if (result != null)
                    {
                        result.confirm();
                        result = null;
                    }
                }

            
            {
                this$1 = MyWebChromeClient.this;
                super();
            }
            });
            webview.show();
            return true;
        }

        public void onProgressChanged(WebView webview, int i)
        {
            hostingActivity.getWindow().setFeatureInt(2, i * 100);
        }

        public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
        {
            executeJavascript("GreyhoundEventDispatcher.dispatch('notify-view-shown','view was overlayed');");
        }

        public boolean onShowFileChooser(WebView webview, ValueCallback valuecallback, android.webkit.WebChromeClient.FileChooserParams filechooserparams)
        {
            Intent intent;
            if (SessionMViewContainer.mFilePathCallback != null)
            {
                SessionMViewContainer.mFilePathCallback.onReceiveValue(null);
            }
            SessionMViewContainer.mFilePathCallback = valuecallback;
            intent = new Intent("android.media.action.IMAGE_CAPTURE");
            webview = intent;
            if (intent.resolveActivity(hostingActivity.getPackageManager()) == null) goto _L2; else goto _L1
_L1:
            webview = createImageFile();
            intent.putExtra("PhotoPath", SessionMViewContainer.mCameraPhotoPath);
            filechooserparams = webview;
_L3:
            if (filechooserparams != null)
            {
                SessionMViewContainer.mCameraPhotoPath = (new StringBuilder()).append("file:").append(filechooserparams.getAbsolutePath()).toString();
                intent.putExtra("output", Uri.fromFile(filechooserparams));
                webview = intent;
            } else
            {
                webview = null;
            }
_L2:
            valuecallback = new Intent("android.intent.action.GET_CONTENT");
            valuecallback.addCategory("android.intent.category.OPENABLE");
            valuecallback.setType("image/*");
            if (webview != null)
            {
                webview = (new Intent[] {
                    webview
                });
            } else
            {
                webview = new Intent[0];
            }
            filechooserparams = new Intent("android.intent.action.CHOOSER");
            filechooserparams.putExtra("android.intent.extra.INTENT", valuecallback);
            filechooserparams.putExtra("android.intent.extra.TITLE", "Image Chooser");
            filechooserparams.putExtra("android.intent.extra.INITIAL_INTENTS", webview);
            hostingActivity.startActivityForResult(filechooserparams, 1);
            return true;
            valuecallback;
            webview = null;
_L4:
            Log.e("SessionM.WebView", "Unable to create Image File from onShowFileChooser", valuecallback);
            filechooserparams = webview;
            if (Log.isLoggable("SessionM.WebView", 3))
            {
                filechooserparams = String.format(Locale.US, "Unable to create Image File from onShowFileChooser", new Object[0]);
                Session.D().a("javascript-error", filechooserparams, valuecallback);
                filechooserparams = webview;
            }
              goto _L3
            valuecallback;
              goto _L4
        }

        public void openFileChooser(ValueCallback valuecallback)
        {
            if (listener != null)
            {
                listener.onValueCallback(SessionMViewContainer.this, valuecallback);
            }
            valuecallback = new Intent("android.intent.action.GET_CONTENT");
            valuecallback.addCategory("android.intent.category.OPENABLE");
            valuecallback.setType("image/*");
            valuecallback = Intent.createChooser(valuecallback, "Image Chooser");
            hostingActivity.startActivityForResult(valuecallback, 1);
        }

        public void openFileChooser(ValueCallback valuecallback, String s)
        {
            openFileChooser(valuecallback);
        }

        public void openFileChooser(ValueCallback valuecallback, String s, String s1)
        {
            openFileChooser(valuecallback);
        }

        private MyWebChromeClient()
        {
            this$0 = SessionMViewContainer.this;
            super();
        }

    }

    public static interface SessionMViewContainerListener
    {

        public abstract void onClosePressed(SessionMViewContainer sessionmviewcontainer);

        public abstract void onFailure(SessionMViewContainer sessionmviewcontainer, int i, String s, String s1);

        public abstract void onValueCallback(SessionMViewContainer sessionmviewcontainer, ValueCallback valuecallback);

        public abstract void onViewLoadStarted(SessionMViewContainer sessionmviewcontainer, String s);

        public abstract void onViewLoaded(SessionMViewContainer sessionmviewcontainer, String s);
    }

    public static final class WebViewType extends Enum
    {

        private static final WebViewType $VALUES[];
        public static final WebViewType BROWSER;
        public static final WebViewType NORMAL;

        public static WebViewType valueOf(String s)
        {
            return (WebViewType)Enum.valueOf(com/sessionm/ui/SessionMViewContainer$WebViewType, s);
        }

        public static WebViewType[] values()
        {
            return (WebViewType[])$VALUES.clone();
        }

        static 
        {
            NORMAL = new WebViewType("NORMAL", 0);
            BROWSER = new WebViewType("BROWSER", 1);
            $VALUES = (new WebViewType[] {
                NORMAL, BROWSER
            });
        }

        private WebViewType(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int BACK_BUTTON_ID = 1;
    private static final int CLOSE_BUTTON_ID = 4;
    private static final int FORWARD_BUTTON_ID = 2;
    private static final String JAVASCRIPT_INTERFACE_NAME = "Android";
    private static final String JAVASCRIPT_VIDEO_INTERFACE_NAME = "AndroidVideo";
    private static final int RELOAD_BUTTON_ID = 3;
    private static final String TAG = "SessionM.WebView";
    private static ActivityControllerTestFailureMode failureMode;
    protected static String mCameraPhotoPath;
    protected static ValueCallback mFilePathCallback;
    private LinearLayout browserLayout;
    private ImageButton closeButton;
    private Activity hostingActivity;
    private HTML5InlineVideoJSInterface jsVideoInterface;
    private SessionMViewContainerListener listener;
    private LoaderView loaderView;
    private JsResult result;
    private WebViewType type;
    private WebView webView;

    public SessionMViewContainer(Activity activity, WebViewType webviewtype, Object obj)
    {
        type = WebViewType.NORMAL;
        type = webviewtype;
        hostingActivity = activity;
        webView = new WebView(activity);
        int i;
        if (type.equals(WebViewType.BROWSER))
        {
            browserLayout = new LinearLayout(activity);
            webviewtype = new android.widget.LinearLayout.LayoutParams(-1, -1);
            browserLayout.setOrientation(1);
            browserLayout.setLayoutParams(webviewtype);
            webView.setLayoutParams(webviewtype);
            webView.setScrollBarStyle(0x2000000);
            webView.setFocusableInTouchMode(true);
            webView.setClickable(true);
            webView.setEnabled(true);
            webView.setVisibility(4);
            browserLayout.requestDisallowInterceptTouchEvent(true);
            browserLayout.requestFocus(130);
            createControlLayout();
            webviewtype = new FrameLayout(activity);
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutparams.addRule(12);
            webviewtype.setLayoutParams(layoutparams);
            webviewtype.addView(webView);
            loaderView = LoaderView.getInstance();
            loaderView.init(activity, webviewtype, this, false);
            browserLayout.addView(webviewtype);
            loaderView.present(LoaderView.LoaderViewStatus.LOADING);
        } else
        {
            webviewtype = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            webView.setLayoutParams(webviewtype);
            webView.setBackgroundColor(0);
            webView.setVerticalScrollBarEnabled(false);
            webView.setHorizontalScrollBarEnabled(false);
        }
        i = android.os.Build.VERSION.SDK_INT;
        if (i >= 11 && (i < 16 || Session.D().isHardwareAccelerationDisabled()))
        {
            webView.setLayerType(1, null);
        }
        if (obj != null)
        {
            webView.addJavascriptInterface(obj, "Android");
        }
        webviewtype = Config.f();
        webView.setWebChromeClient(new MyWebChromeClient());
        webView.setWebViewClient(new ContainerWebViewClient());
        obj = webView.getSettings();
        ((WebSettings) (obj)).setLayoutAlgorithm(android.webkit.WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        ((WebSettings) (obj)).setSaveFormData(false);
        ((WebSettings) (obj)).setJavaScriptEnabled(true);
        ((WebSettings) (obj)).setGeolocationEnabled(true);
        ((WebSettings) (obj)).setGeolocationDatabasePath(webviewtype.c(activity));
        ((WebSettings) (obj)).setAppCacheEnabled(true);
        ((WebSettings) (obj)).setDomStorageEnabled(true);
        ((WebSettings) (obj)).setCacheMode(-1);
        if (android.os.Build.VERSION.SDK_INT < 18)
        {
            ((WebSettings) (obj)).setAppCacheMaxSize(0x800000L);
            ((WebSettings) (obj)).setSavePassword(false);
        }
        ((WebSettings) (obj)).setAppCachePath(webviewtype.b(activity));
        ((WebSettings) (obj)).setDatabaseEnabled(true);
        ((WebSettings) (obj)).setDatabasePath(webviewtype.d(activity));
        ((WebSettings) (obj)).setAllowFileAccess(false);
        ((WebSettings) (obj)).setJavaScriptCanOpenWindowsAutomatically(true);
        ((WebSettings) (obj)).setSupportZoom(false);
        ((WebSettings) (obj)).setSupportMultipleWindows(false);
        ((WebSettings) (obj)).setUseWideViewPort(false);
        webView.setFocusable(true);
        webView.setFocusableInTouchMode(true);
        webView.setClickable(true);
        webView.setEnabled(true);
        webView.setAddStatesFromChildren(true);
        CookieManager.getInstance().setAcceptCookie(true);
        webView.requestFocus(130);
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            webView.setOnTouchListener(new android.view.View.OnTouchListener() {

                final SessionMViewContainer this$0;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    SessionMViewContainer sessionmviewcontainer = SessionMViewContainer.this;
                    sessionmviewcontainer;
                    JVM INSTR monitorenter ;
                    if (webView == null) goto _L2; else goto _L1
_L1:
                    motionevent.getAction();
                    JVM INSTR tableswitch 0 1: default 68
                //                               0 48
                //                               1 48;
                       goto _L2 _L3 _L3
_L2:
                    return false;
_L3:
                    if (!view.hasFocus())
                    {
                        view.requestFocus();
                    }
                    if (true) goto _L2; else goto _L4
_L4:
                    view;
                    sessionmviewcontainer;
                    JVM INSTR monitorexit ;
                    throw view;
                }

            
            {
                this$0 = SessionMViewContainer.this;
                super();
            }
            });
        }
        jsVideoInterface = new HTML5InlineVideoJSInterface(activity, webView);
        webView.addJavascriptInterface(jsVideoInterface, "AndroidVideo");
    }

    private void clearCache()
    {
        if (webView == null)
        {
            return;
        } else
        {
            webView.clearCache(true);
            webView.clearHistory();
            webView.clearFormData();
            return;
        }
    }

    private void createControlLayout()
    {
        RelativeLayout relativelayout = new RelativeLayout(hostingActivity);
        relativelayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        relativelayout.setBackgroundColor(0xff000000);
        browserLayout.setScrollBarStyle(0x2000000);
        browserLayout.addView(relativelayout);
        Object obj = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[] {
            0xfff6f6f6, 0xffe1e1e1, -1
        });
        ((GradientDrawable) (obj)).setCornerRadius(0.0F);
        ((GradientDrawable) (obj)).setStroke(1, 0xff402200);
        ((GradientDrawable) (obj)).setCornerRadius(1.0F);
        Object obj1;
        Object obj2;
        Object obj3;
        android.widget.RelativeLayout.LayoutParams layoutparams;
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            relativelayout.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
        } else
        {
            relativelayout.setBackground(((android.graphics.drawable.Drawable) (obj)));
        }
        obj = new Matrix();
        ((Matrix) (obj)).preScale(-1F, 1.0F);
        obj2 = BitmapFactory.decodeResource(browserLayout.getResources(), 0x1080024);
        obj1 = BitmapFactory.decodeResource(browserLayout.getResources(), 0x1080038);
        obj3 = BitmapFactory.decodeResource(browserLayout.getResources(), 0x108007c);
        obj = getControlImageButton(50, 50, Bitmap.createBitmap(((Bitmap) (obj2)), 0, 0, ((Bitmap) (obj2)).getWidth(), ((Bitmap) (obj2)).getHeight(), ((Matrix) (obj)), true), 10, 10, 10, 10);
        ((ImageButton) (obj)).setId(1);
        layoutparams = new android.widget.RelativeLayout.LayoutParams(((ImageButton) (obj)).getLayoutParams());
        layoutparams.addRule(9);
        ((ImageButton) (obj)).setLayoutParams(layoutparams);
        relativelayout.addView(((View) (obj)));
        obj2 = getControlImageButton(50, 50, ((Bitmap) (obj2)), 10, 10, 10, 10);
        ((ImageButton) (obj2)).setId(2);
        layoutparams = new android.widget.RelativeLayout.LayoutParams(((ImageButton) (obj2)).getLayoutParams());
        layoutparams.addRule(1, 1);
        ((ImageButton) (obj2)).setLayoutParams(layoutparams);
        relativelayout.addView(((View) (obj2)));
        obj3 = getControlImageButton(50, 50, ((Bitmap) (obj3)), 0, 10, 10, 10);
        ((ImageButton) (obj3)).setId(3);
        layoutparams = new android.widget.RelativeLayout.LayoutParams(((ImageButton) (obj3)).getLayoutParams());
        layoutparams.addRule(1, 2);
        ((ImageButton) (obj3)).setLayoutParams(layoutparams);
        relativelayout.addView(((View) (obj3)));
        obj1 = getControlImageButton(50, 50, ((Bitmap) (obj1)), 10, 10, 10, 10);
        ((ImageButton) (obj1)).setId(4);
        layoutparams = new android.widget.RelativeLayout.LayoutParams(((ImageButton) (obj1)).getLayoutParams());
        layoutparams.addRule(11);
        ((ImageButton) (obj1)).setLayoutParams(layoutparams);
        relativelayout.addView(((View) (obj1)));
        layoutparams.addRule(13);
        ((ImageButton) (obj3)).setOnClickListener(new android.view.View.OnClickListener() {

            final SessionMViewContainer this$0;

            public void onClick(View view)
            {
                if (webView != null)
                {
                    webView.reload();
                }
            }

            
            {
                this$0 = SessionMViewContainer.this;
                super();
            }
        });
        ((ImageButton) (obj1)).setOnClickListener(new android.view.View.OnClickListener() {

            final SessionMViewContainer this$0;

            public void onClick(View view)
            {
                if (listener != null)
                {
                    listener.onClosePressed(SessionMViewContainer.this);
                }
            }

            
            {
                this$0 = SessionMViewContainer.this;
                super();
            }
        });
        ((ImageButton) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            final SessionMViewContainer this$0;

            public void onClick(View view)
            {
                if (webView != null && webView.canGoBack())
                {
                    webView.goBack();
                }
            }

            
            {
                this$0 = SessionMViewContainer.this;
                super();
            }
        });
        ((ImageButton) (obj2)).setOnClickListener(new android.view.View.OnClickListener() {

            final SessionMViewContainer this$0;

            public void onClick(View view)
            {
                if (webView != null && webView.canGoForward())
                {
                    webView.goForward();
                }
            }

            
            {
                this$0 = SessionMViewContainer.this;
                super();
            }
        });
        relativelayout.setPadding(10, 10, 10, 10);
    }

    private File createImageFile()
        throws IOException
    {
        String s = (new SimpleDateFormat("yyyyMMdd_HHmmss")).format(new Date());
        return File.createTempFile((new StringBuilder()).append("JPEG_").append(s).append("_").toString(), ".jpg", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
    }

    private ImageButton getControlImageButton(int i, int j, Bitmap bitmap, int k, int l, int i1, int j1)
    {
        ImageButton imagebutton = new ImageButton(hostingActivity);
        imagebutton.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(ActivityController.convertDpToPixels(hostingActivity, i), ActivityController.convertDpToPixels(hostingActivity, j)));
        imagebutton.setImageBitmap(bitmap);
        return imagebutton;
    }

    public static void resetWebCaches(Activity activity)
    {
        activity.runOnUiThread(new Runnable(activity) {

            final Activity val$appActivity;

            public void run()
            {
                (new SessionMViewContainer(appActivity, WebViewType.NORMAL, null)).clearCache();
            }

            
            {
                appActivity = activity;
                super();
            }
        });
    }

    public static void setFailureMode(ActivityControllerTestFailureMode activitycontrollertestfailuremode)
    {
        failureMode = activitycontrollertestfailuremode;
    }

    void destroy()
    {
        this;
        JVM INSTR monitorenter ;
        if (Log.isLoggable("SessionM.WebView", 3))
        {
            Log.d("SessionM.WebView", "Destroy container view");
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            webView.removeJavascriptInterface("Android");
        }
        if (result != null)
        {
            result.cancel();
            result = null;
        }
        if (jsVideoInterface != null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                webView.removeJavascriptInterface("AndroidVideo");
            }
            jsVideoInterface.destroy();
            jsVideoInterface = null;
        }
        if (type == WebViewType.BROWSER)
        {
            ((ViewGroup)webView.getParent()).removeAllViews();
        }
        if (!h.aE().equals("NOOK"))
        {
            webView.destroy();
        }
        webView = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void executeJavascript(final String js)
    {
        hostingActivity.runOnUiThread(new Runnable() {

            final SessionMViewContainer this$0;
            final String val$js;

            public void run()
            {
                if (Log.isLoggable("SessionM.WebView", 3))
                {
                    Log.d("SessionM.WebView", (new StringBuilder()).append("Executing JS: ").append(js).toString());
                }
                if (webView != null)
                {
                    webView.loadUrl((new StringBuilder()).append("javascript:").append(js).toString());
                }
_L1:
                return;
                Throwable throwable;
                throwable;
                if (Log.isLoggable("SessionM.WebView", 3))
                {
                    Log.e("SessionM.WebView", (new StringBuilder()).append("Failed to execute javascript: ").append(js).toString(), throwable);
                    String s = String.format(Locale.US, "exception executing JS string: %s", new Object[] {
                        js
                    });
                    Session.D().a("javascript-error", s, throwable);
                    return;
                }
                  goto _L1
            }

            
            {
                this$0 = SessionMViewContainer.this;
                js = s;
                super();
            }
        });
    }

    public ViewGroup getViewGroup()
    {
        if (type.equals(WebViewType.BROWSER))
        {
            return browserLayout;
        } else
        {
            return webView;
        }
    }

    public WebView getWebView()
    {
        return webView;
    }

    public void loadContent(String s, String s1)
    {
        if (webView == null)
        {
            return;
        } else
        {
            webView.loadDataWithBaseURL(s, s1, "text/html", "utf-8", "http://about:blank");
            return;
        }
    }

    public void loadUrl(String s)
    {
        if (webView == null)
        {
            return;
        } else
        {
            webView.loadUrl(s);
            return;
        }
    }

    public void onCancel()
    {
        if (listener != null)
        {
            listener.onClosePressed(this);
        }
    }

    public void onPause()
    {
        if (webView != null && android.os.Build.VERSION.SDK_INT >= 11)
        {
            webView.onPause();
        }
        jsVideoInterface.pause();
    }

    public void onReloadStarted()
    {
    }

    public void onResume()
    {
        if (webView != null && android.os.Build.VERSION.SDK_INT >= 11)
        {
            webView.onResume();
        }
    }

    void removeCloseButton()
    {
        if (closeButton == null)
        {
            return;
        }
        ViewGroup viewgroup = (ViewGroup)webView.getParent();
        if (viewgroup != null)
        {
            viewgroup.removeView(closeButton);
        }
        closeButton = null;
    }

    public void setListener(SessionMViewContainerListener sessionmviewcontainerlistener)
    {
        listener = sessionmviewcontainerlistener;
    }

    void showCloseButton()
    {
        if (closeButton == null)
        {
            closeButton = h.d(hostingActivity);
            closeButton.setOnClickListener(new android.view.View.OnClickListener() {

                final SessionMViewContainer this$0;

                public void onClick(View view)
                {
                    if (listener != null)
                    {
                        listener.onClosePressed(SessionMViewContainer.this);
                    }
                }

            
            {
                this$0 = SessionMViewContainer.this;
                super();
            }
            });
            ViewGroup viewgroup = (ViewGroup)webView.getParent();
            if (viewgroup != null)
            {
                viewgroup.addView(closeButton);
                return;
            }
        }
    }

    static 
    {
        failureMode = ActivityControllerTestFailureMode.NONE;
    }







/*
    static JsResult access$502(SessionMViewContainer sessionmviewcontainer, JsResult jsresult)
    {
        sessionmviewcontainer.result = jsresult;
        return jsresult;
    }

*/





/*
    static LoaderView access$802(SessionMViewContainer sessionmviewcontainer, LoaderView loaderview)
    {
        sessionmviewcontainer.loaderView = loaderview;
        return loaderview;
    }

*/

}
