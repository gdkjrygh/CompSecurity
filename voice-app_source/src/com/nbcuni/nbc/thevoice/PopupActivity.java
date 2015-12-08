// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.PowerManager;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.comscore.instrumentation.InstrumentedActivity;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.share.widget.ShareDialog;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            MainActivity, PopupJSHandler, PopupJSListener

public class PopupActivity extends InstrumentedActivity
{

    private static List PERMISSIONS;
    private static WebView popupWebView;
    String authTokenFB;
    CallbackManager callbackManager;
    private boolean gatekeeperFull;
    private final PopupJSListener jsListener = new PopupJSListener() {

        final PopupActivity this$0;

        public void closePopup()
        {
            finish();
        }

        public void facebookLogin(String s, List list)
        {
            String s1 = "";
            PopupActivity.PERMISSIONS = list;
            int i = Integer.parseInt(s);
            loginCmdID = i;
            loginSubject = "FacebookLogin";
            Iterator iterator = list.iterator();
            s = s1;
            do
            {
                if (!iterator.hasNext())
                {
                    s.substring(0, s.length() - 1);
                    onClickLogin(i, list);
                    return;
                }
                String s2 = (String)iterator.next();
                s = (new StringBuilder(String.valueOf(s))).append(s2).append(",").toString();
            } while (true);
        }

        public void facebookLogout(String s)
        {
            onClickLogout(s);
        }

        public void facebookPermissionRequest(String s, List list)
        {
            loginCmdID = Integer.parseInt(s);
            loginSubject = "FacebookRequestReadPermissions";
            if (AccessToken.getCurrentAccessToken() != null)
            {
                s = AccessToken.getCurrentAccessToken().getPermissions();
                if (!isSubsetOf(list, s))
                {
                    LoginManager.getInstance().logInWithReadPermissions(getParent(), list);
                }
            }
        }

        public void facebookShare(String s, String s1, String s2, String s3, String s4)
        {
            s = (new StringBuilder("https://www.facebook.com/dialog/feed?app_id=")).append(getString(0x7f08004b)).append("&link=").append(s3).append("&redirect_uri=").append(sharedPreferences.getString("votenowURL", "http://www.nbc.com/the-voice")).append("&name=").append(s1).append("&description=").append(s2).append("&picture=").append(s4).toString();
            handleFacebookShare(s);
        }

        public void hideLoadingScreen()
        {
            runOnUiThread(new Runnable() {

                final _cls1 this$1;

                public void run()
                {
                    loadingImage.clearAnimation();
                    loadingScreen.setVisibility(8);
                    if (loadingTimer != null)
                    {
                        loadingTimer.cancel();
                    }
                }

            
            {
                this$1 = _cls1.this;
                super();
            }
            });
        }

        public void passExpiresValue(String s)
        {
            android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putString("expiryDate", s);
            editor.commit();
        }


            
            {
                this$0 = PopupActivity.this;
                super();
            }
    };
    private RelativeLayout loadingDialog;
    private ImageView loadingImage;
    private RelativeLayout loadingScreen;
    private CountDownTimer loadingTimer;
    private int loginCmdID;
    private String loginSubject;
    Boolean nav;
    private ShareDialog shareDialog;
    SharedPreferences sharedPreferences;
    private RelativeLayout tryAgainScreen;
    private android.os.PowerManager.WakeLock wl;

    public PopupActivity()
    {
        gatekeeperFull = false;
        authTokenFB = "allYourBaseAreBelongToUs";
    }

    private boolean isSubsetOf(Collection collection, Collection collection1)
    {
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                return true;
            }
        } while (collection1.contains((String)collection.next()));
        return false;
    }

    private void onClickLogin(int i, List list)
    {
        LoginManager.getInstance().logInWithReadPermissions(this, list);
    }

    private void onClickLogout(String s)
    {
        LoginManager.getInstance().logOut();
        loadUrlOnUIThread("javascript: FB.logout();");
        sharedPreferences.edit().remove("fbAuthToken").commit();
        if (s != null)
        {
            sendMessageToJS((new StringBuilder("{\"commandId\":\"")).append(s).append("\",\"type\":\"CommandResult\",\"subject\":\"FacebookLogout\"}").toString());
        }
    }

    private void updateView()
    {
        if (!AccessToken.getCurrentAccessToken().getToken().equals("") && AccessToken.getCurrentAccessToken().getToken() != null)
        {
            popupWebView.loadUrl((new StringBuilder("javascript: Voice7webview.nativeFacebookAuth('")).append(AccessToken.getCurrentAccessToken().getToken()).append("')").toString());
        }
    }

    protected void handleFacebookShare(String s)
    {
        String s1;
        String s2;
        String s3;
        String s4;
        String s5;
        s5 = "";
        s3 = "";
        s4 = "";
        s2 = s5;
        s1 = s3;
        String s6 = s.substring(s.indexOf("?") + 1);
        s2 = s5;
        s1 = s3;
        s = new ArrayList();
        s2 = s5;
        s1 = s3;
        HashMap hashmap = new HashMap();
        s2 = s5;
        s1 = s3;
        String as[] = s6.split("&");
        s2 = s5;
        s1 = s3;
        int j = as.length;
        int i = 0;
_L5:
        if (i < j) goto _L2; else goto _L1
_L1:
        s2 = s5;
        s1 = s3;
        s = s.iterator();
_L7:
        s2 = s5;
        s1 = s3;
        if (s.hasNext()) goto _L4; else goto _L3
_L3:
        s2 = s5;
        s1 = s3;
        s = (String)hashmap.get("link");
        s2 = s;
        s1 = s3;
        s5 = (String)hashmap.get("picture");
        s2 = s;
        s1 = s3;
        s3 = (String)hashmap.get("name");
        s2 = s;
        s1 = s3;
        s5 = (String)hashmap.get("description");
        s1 = s3;
        s2 = s;
        s = s5;
_L8:
        s = ((com.facebook.share.model.ShareLinkContent.Builder)(new com.facebook.share.model.ShareLinkContent.Builder()).setContentTitle(s1).setContentDescription(s).setContentUrl(Uri.parse(s2))).build();
        shareDialog.show(s);
        return;
_L2:
        s2 = s5;
        s1 = s3;
        s.add(as[i]);
        i++;
          goto _L5
_L4:
        s2 = s5;
        s1 = s3;
        as = ((String)s.next()).split("=");
        s2 = s5;
        s1 = s3;
        if (as.length != 2) goto _L7; else goto _L6
_L6:
        s2 = s5;
        s1 = s3;
        hashmap.put(as[0], URLDecoder.decode(as[1]));
          goto _L7
        s;
        s.printStackTrace();
        s = s4;
          goto _L8
    }

    public void loadUrlOnUIThread(final String url)
    {
        runOnUiThread(new Runnable() {

            final PopupActivity this$0;
            private final String val$url;

            public void run()
            {
                PopupActivity.popupWebView.loadUrl(url);
            }

            
            {
                this$0 = PopupActivity.this;
                url = s;
                super();
            }
        });
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        callbackManager.onActivityResult(i, j, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj;
        Object obj1;
        try
        {
            MainActivity.popupOpened = true;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle) { }
        wl = ((PowerManager)getSystemService("power")).newWakeLock(6, "NoTurningOff");
        requestWindowFeature(1);
        setContentView(0x7f030015);
        sharedPreferences = getSharedPreferences("PushPreferences", 0);
        bundle = sharedPreferences.edit();
        bundle.putLong("activityTimer", System.currentTimeMillis());
        bundle.commit();
        FacebookSdk.sdkInitialize(getApplicationContext());
        callbackManager = com.facebook.CallbackManager.Factory.create();
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback() {

            final PopupActivity this$0;

            public void onCancel()
            {
                String s = (new StringBuilder("{\"commandId\":\"")).append(loginCmdID).append("\",\"type\":\"CommandResult\",\"subject\":\"").append(loginSubject).append("\",\"error\":{\"code\":\"FacebookLoginCancelled\"}}").toString();
                sendMessageToJS(s);
            }

            public void onError(FacebookException facebookexception)
            {
                facebookexception = (new StringBuilder("{\"commandId\":\"")).append(loginCmdID).append("\",\"type\":\"CommandResult\",\"subject\":\"").append(loginSubject).append("\",\"error\":{\"code\":\"FacebookLoginFailedError\"}}").toString();
                sendMessageToJS(facebookexception);
            }

            public void onSuccess(LoginResult loginresult)
            {
                if (!AccessToken.getCurrentAccessToken().getToken().equals(""))
                {
                    loginresult = (new StringBuilder("{\"commandId\":\"")).append(loginCmdID).append("\",\"type\":\"CommandResult\",\"subject\":\"").append(loginSubject).append("\",\"payload\":{\"token\":\"").append(loginresult.getAccessToken().getToken()).append("\"}}").toString();
                    sendMessageToJS(loginresult);
                }
            }

            public volatile void onSuccess(Object obj2)
            {
                onSuccess((LoginResult)obj2);
            }

            
            {
                this$0 = PopupActivity.this;
                super();
            }
        });
        shareDialog = new ShareDialog(this);
        loadingImage = (ImageView)findViewById(0x7f090055);
        bundle = AnimationUtils.loadAnimation(getApplicationContext(), 0x7f040005);
        loadingImage.startAnimation(bundle);
        loadingScreen = (RelativeLayout)findViewById(0x7f090053);
        loadingDialog = (RelativeLayout)findViewById(0x7f090054);
        tryAgainScreen = (RelativeLayout)findViewById(0x7f090057);
        obj = (TextView)findViewById(0x7f090052);
        obj1 = getIntent().getExtras();
        bundle = ((Bundle) (obj1)).getString("key");
        if (bundle.equals("http://www.nbc.com/the-voice/redirect"))
        {
            gatekeeperFull = true;
        } else
        {
            gatekeeperFull = false;
        }
        if (bundle.contains(sharedPreferences.getString("votenowURL", "votenow")) && !bundle.contains("facebook.com"))
        {
            loadingScreen.setVisibility(0);
            loadingTimer = new CountDownTimer(20000L, 2000L) {

                final PopupActivity this$0;

                public void onFinish()
                {
                    loadingDialog.setVisibility(8);
                    tryAgainScreen.setVisibility(0);
                }

                public void onTick(long l)
                {
                }

            
            {
                this$0 = PopupActivity.this;
                super(l, l1);
            }
            };
            loadingTimer.start();
        }
        ((ImageButton)findViewById(0x7f09005a)).setOnClickListener(new android.view.View.OnClickListener() {

            final PopupActivity this$0;

            public void onClick(View view)
            {
                loadingDialog.setVisibility(0);
                tryAgainScreen.setVisibility(8);
                loadingTimer = new CountDownTimer(20000L, 2000L) {

                    final _cls6 this$1;

                    public void onFinish()
                    {
                        loadingDialog.setVisibility(8);
                        tryAgainScreen.setVisibility(0);
                    }

                    public void onTick(long l)
                    {
                    }

            
            {
                this$1 = _cls6.this;
                super(l, l1);
            }
                };
                loadingTimer.start();
                PopupActivity.popupWebView.reload();
            }


            
            {
                this$0 = PopupActivity.this;
                super();
            }
        });
        nav = Boolean.valueOf(((Bundle) (obj1)).getBoolean("nav"));
        obj1 = ((Bundle) (obj1)).getString("phase", "null");
        if (((String) (obj1)).equals("null"))
        {
            ((TextView) (obj)).setText("");
        } else
        {
            ((TextView) (obj)).setText(((String) (obj1)).toUpperCase());
        }
        ((ImageButton)findViewById(0x7f09004f)).setOnClickListener(new android.view.View.OnClickListener() {

            final PopupActivity this$0;

            public void onClick(View view)
            {
                finish();
            }

            
            {
                this$0 = PopupActivity.this;
                super();
            }
        });
        popupWebView = (WebView)findViewById(0x7f09005b);
        obj = popupWebView.getSettings();
        ((WebSettings) (obj)).setJavaScriptEnabled(true);
        ((WebSettings) (obj)).setDomStorageEnabled(true);
        ((WebSettings) (obj)).setDatabaseEnabled(true);
        ((WebSettings) (obj)).setJavaScriptCanOpenWindowsAutomatically(true);
        ((WebSettings) (obj)).supportMultipleWindows();
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            ((WebSettings) (obj)).setDatabasePath((new StringBuilder("/data/data/")).append(getPackageName()).append("/database").toString());
        }
        ((WebSettings) (obj)).setPluginState(android.webkit.WebSettings.PluginState.ON);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            CookieManager.getInstance().setAcceptThirdPartyCookies(popupWebView, true);
            ((WebSettings) (obj)).setMixedContentMode(2);
        }
        popupWebView.addJavascriptInterface(new PopupJSHandler(this, jsListener), "PopupHandler");
        popupWebView.setWebViewClient(new WebViewClient() {

            final PopupActivity this$0;

            public void onPageFinished(WebView webview, String s)
            {
                super.onPageFinished(webview, s);
                PopupActivity.popupWebView.loadUrl("javascript: window.nativeWrapper = window.nativeWrapper || {};");
                PopupActivity.popupWebView.loadUrl("javascript: window.nativeWrapper.sendMessage = function(messageObject) {PopupHandler.parseMessageObject(JSON.stringify(messageObject));}");
                PopupActivity.popupWebView.loadUrl("javascript: window.nativeWrapper.sendMessage({\"type\":\"Event\",\"subject\":\"HandleLS\",\"payload\":{\"localStorage\": window.localStorage.age_gate }});");
                sendMessageToJS("{\"type\":\"Event\",\"subject\":\"BridgeReady\"}");
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                boolean flag1 = true;
                if (!s.contains("nissanoffthestage")) goto _L2; else goto _L1
_L1:
                boolean flag = false;
_L4:
                return flag;
_L2:
                if (!s.contains("emopenwebview"))
                {
                    break; /* Loop/switch isn't completed */
                }
                flag = flag1;
                if (s.contains("emopenwebview=1"))
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (s.contains("emopenwebview=0"))
                {
                    webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
                    startActivity(webview);
                    PopupActivity.popupWebView.stopLoading();
                    return true;
                }
                break; /* Loop/switch isn't completed */
                if (true) goto _L4; else goto _L3
_L3:
                if (s.startsWith("http://www.nbc.com/the-voice") && s.contains("votenow=null"))
                {
                    finish();
                    return true;
                }
                if (s.startsWith("market://"))
                {
                    webview = new Intent("android.intent.action.VIEW");
                    webview.setData(Uri.parse(s));
                    startActivity(webview);
                    return true;
                }
                if (s.contains("&therecanbeonly=one") && !s.contains("facebook.com"))
                {
                    finish();
                    return true;
                }
                if (s.contains("&code") && s.contains(sharedPreferences.getString("votenowURL", ".votenow.tv")))
                {
                    Object obj2 = s.substring(s.indexOf("code") + 5, s.length());
                    authTokenFB = ((String) (obj2));
                    obj2 = sharedPreferences.edit();
                    ((android.content.SharedPreferences.Editor) (obj2)).putString("fbAuthToken", authTokenFB);
                    ((android.content.SharedPreferences.Editor) (obj2)).commit();
                }
                if (s.contains("twitter.com"))
                {
                    webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
                    startActivity(Intent.createChooser(webview, "Tweet!"));
                    return true;
                }
                if (!s.contains("facebook.com") && !gatekeeperFull && (s.contains(".nbcuniversal.com/privacy/") || s.contains(".nbcuni.com/privacy/") || s.contains("www.nbc.com") || s.contains("//nbc.com") || s.contains("play.google.com") || s.contains("itunes.") || s.contains("sprint.com")))
                {
                    webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
                    startActivity(webview);
                    return true;
                }
                if (s.contains("apps.facebook.com") || s.contains("facebook.com/NBCTheVoice"))
                {
                    webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
                    startActivity(webview);
                    return true;
                }
                if (s.startsWith(getString(0x7f08004c)))
                {
                    finish();
                }
                webview.loadUrl(s);
                if (s.startsWith("close-popup:"))
                {
                    finish();
                }
                if (s.startsWith("mailto"))
                {
                    break; /* Loop/switch isn't completed */
                }
                flag = flag1;
                if (!s.startsWith("tel:")) goto _L4; else goto _L5
_L5:
                webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
                startActivity(webview);
                PopupActivity.popupWebView.stopLoading();
                return true;
            }

            
            {
                this$0 = PopupActivity.this;
                super();
            }
        });
        popupWebView.setWebChromeClient(new WebChromeClient() {

            final PopupActivity this$0;

            public void onCloseWindow(WebView webview)
            {
                super.onCloseWindow(webview);
                finish();
            }

            public boolean onConsoleMessage(ConsoleMessage consolemessage)
            {
                return super.onConsoleMessage(consolemessage);
            }

            
            {
                this$0 = PopupActivity.this;
                super();
            }
        });
        if (!bundle.contains("facebook.com") && bundle.contains(sharedPreferences.getString("votenowURL", "votenow")) && AccessToken.getCurrentAccessToken() != null)
        {
            loadUrlOnUIThread((new StringBuilder(String.valueOf(bundle))).append("#access_token=").append(AccessToken.getCurrentAccessToken().getToken()).toString());
            return;
        }
        if (!bundle.contains("facebook.com") && bundle.contains(sharedPreferences.getString("votenowURL", "votenow")) && sharedPreferences.getString("fbAuthToken", null) != null)
        {
            loadUrlOnUIThread((new StringBuilder(String.valueOf(bundle))).append("#access_token=").append(sharedPreferences.getString("fbAuthToken", null)).toString());
            return;
        } else
        {
            loadUrlOnUIThread(bundle);
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return false;
    }

    protected void onDestroy()
    {
        popupWebView.loadUrl("about:blank");
        if (loadingTimer != null)
        {
            loadingTimer.cancel();
        }
        super.onDestroy();
        try
        {
            MainActivity.popupOpened = false;
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i != 4)
        {
            return false;
        }
        if (popupWebView.canGoBack())
        {
            popupWebView.goBack();
            return false;
        } else
        {
            finish();
            return false;
        }
    }

    protected void onPause()
    {
        popupWebView.pauseTimers();
        if (wl.isHeld())
        {
            wl.release();
        }
        super.onPause();
    }

    protected void onResume()
    {
        popupWebView.resumeTimers();
        if (!wl.isHeld())
        {
            wl.acquire();
        }
        super.onResume();
        if (System.currentTimeMillis() - sharedPreferences.getLong("activityTimer", 0L) > 0xdbba00L)
        {
            finish();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
    }

    public void onStop()
    {
        super.onStop();
    }

    public void sendMessageToJS(String s)
    {
        runOnUiThread(new Runnable() {

            final PopupActivity this$0;
            private final String val$jsCommand;

            public void run()
            {
                PopupActivity.popupWebView.loadUrl((new StringBuilder("javascript:")).append(jsCommand).toString());
            }

            
            {
                this$0 = PopupActivity.this;
                jsCommand = s;
                super();
            }
        });
    }
















}
