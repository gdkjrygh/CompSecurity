// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.text.Html;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.adobe.mobile.Config;
import com.comscore.analytics.comScore;
import com.comscore.instrumentation.InstrumentedActivity;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.HttpMethod;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.share.widget.ShareDialog;
import com.kochava.android.tracker.Feature;
import com.mixpanel.android.mpmetrics.MixpanelAPI;
import com.urbanairship.push.PushManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.nbcuni.nbc.thevoice:
//            JavaScriptHandler, PopupActivity, HTTPTask, VideoSplash, 
//            JavaScriptListener

public class MainActivity extends InstrumentedActivity
{

    private static List PERMISSIONS;
    public static boolean popupOpened = false;
    private Dialog DNSDialog;
    boolean DNSDialogActive;
    private String OSVersion;
    public int VERSION;
    final List assets = Arrays.asList(new String[0]);
    JSONObject backendResponse;
    String backendTimeZone;
    String backendUrl;
    private final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {

        final MainActivity this$0;

        public boolean isInternet(Context context1)
        {
            return ((ConnectivityManager)context1.getSystemService("connectivity")).getActiveNetworkInfo() != null;
        }

        public void onReceive(Context context1, Intent intent)
        {
            if (intent.getAction().equalsIgnoreCase("android.net.conn.CONNECTIVITY_CHANGE") && isInternet(context1))
            {
                connectionDialog.dismiss();
                DNSDialogActive = false;
                httpTask = (new HTTPTask(MainActivity.this)).execute(new String[] {
                    ""
                });
                webView.loadUrl(webURL);
                unregisterReceiver(broadcastReceiver);
            }
        }

            
            {
                this$0 = MainActivity.this;
                super();
            }
    };
    CallbackManager callbackManager;
    private Dialog connectionDialog;
    private final Context context = this;
    private String deviceCapability;
    private Dialog endOfShowDialog;
    private final IntentFilter filter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    private FileInputStream fis;
    long gatekeeperTimestamp;
    private AsyncTask httpTask;
    private final JavaScriptListener jsListener = new JavaScriptListener() {

        final MainActivity this$0;

        public void addAssetToList(String s)
        {
            if (!assets.contains(s))
            {
                assets.add(s);
            }
        }

        public void closeApp()
        {
            finish();
        }

        public void facebookGraphRequest(String s, String s1, HttpMethod httpmethod, String s2)
        {
            Bundle bundle = new Bundle();
            bundle.putString("fields", s2);
            (new GraphRequest(AccessToken.getCurrentAccessToken(), (new StringBuilder("/")).append(s1).toString(), bundle, httpmethod, s. new com.facebook.GraphRequest.Callback() {

                final _cls1 this$1;
                private final String val$commandId;

                public void onCompleted(GraphResponse graphresponse)
                {
                    String s = (new StringBuilder("{\"commandId\":\"")).append(commandId).append("\",\"type\":\"CommandResult\",\"subject\":\"FacebookGraphRequest\",\"payload\":").append(graphresponse.getRawResponse()).append("}").toString();
                    sendMessageToJS(s);
                    Log.i("WebLog", (new StringBuilder("GRAPHRESPONSE: ")).append(graphresponse.getRawResponse()).toString());
                }

            
            {
                this$1 = final__pcls1;
                commandId = String.this;
                super();
            }
            })).executeAsync();
        }

        public void facebookLogin(String s, List list, boolean flag)
        {
            MainActivity.PERMISSIONS = list;
            int i = Integer.parseInt(s);
            loginCmdID = i;
            loginSubject = "FacebookLogin";
            if (flag)
            {
                onClickLogin(i, list);
                return;
            }
            if (AccessToken.getCurrentAccessToken() != null)
            {
                s = (new StringBuilder("{\"commandId\":\"")).append(loginCmdID).append("\",\"type\":\"CommandResult\",\"subject\":\"").append(loginSubject).append("\",\"payload\":{\"token\":\"").append(AccessToken.getCurrentAccessToken().getToken()).append("\"}}").toString();
            } else
            {
                s = (new StringBuilder("{\"commandId\":\"")).append(loginCmdID).append("\",\"type\":\"CommandResult\",\"subject\":\"").append(loginSubject).append("\"}").toString();
            }
            sendMessageToJS(s);
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
            s = (new StringBuilder("https://www.facebook.com/dialog/feed?app_id=")).append(getString(0x7f08004b)).append("&link=").append(s3).append("&redirect_uri=").append("http://www.nbc.com/the-voice/?votenow=null").append("&therecanbeonly=one").append("&name=").append(s1).append("&description=").append(s2).append("&picture=").append(s4).toString();
            handleFacebookShare(s);
        }

        public void mixpanelIncrementPeopleProperties(JSONObject jsonobject)
        {
            HashMap hashmap = new HashMap();
            int i = 0;
            do
            {
                if (i >= jsonobject.names().length())
                {
                    mixpanel.getPeople().increment(hashmap);
                    return;
                }
                try
                {
                    String s = jsonobject.names().getString(i);
                    hashmap.put(s, Integer.valueOf(jsonobject.getInt(s)));
                }
                catch (JSONException jsonexception) { }
                i++;
            } while (true);
        }

        public void mixpanelRegisterSuperProperties(JSONObject jsonobject)
        {
            JSONObject jsonobject1 = new JSONObject();
            int i = 0;
            do
            {
                if (i >= jsonobject.names().length())
                {
                    mixpanel.registerSuperProperties(jsonobject1);
                    return;
                }
                try
                {
                    String s = jsonobject.names().getString(i);
                    jsonobject1.put(s, jsonobject.getString(s));
                }
                catch (JSONException jsonexception) { }
                i++;
            } while (true);
        }

        public void mixpanelSetPeopleProperties(JSONObject jsonobject)
        {
            JSONObject jsonobject1 = new JSONObject();
            int i = 0;
            do
            {
                if (i >= jsonobject.names().length())
                {
                    mixpanel.getPeople().set(jsonobject1);
                    return;
                }
                try
                {
                    String s = jsonobject.names().getString(i);
                    jsonobject1.put(s, jsonobject.getString(s));
                }
                catch (JSONException jsonexception) { }
                i++;
            } while (true);
        }

        public void mixpanelTrackEvent(String s, JSONObject jsonobject)
        {
            JSONObject jsonobject1 = new JSONObject();
            int i = 0;
            do
            {
                if (i >= jsonobject.names().length())
                {
                    mixpanel.track(s, jsonobject1);
                    return;
                }
                try
                {
                    String s1 = jsonobject.names().getString(i);
                    jsonobject1.put(s1, jsonobject.getString(s1));
                }
                catch (JSONException jsonexception) { }
                i++;
            } while (true);
        }

        public void openDialog(String s, String s1, final String commandId, String s2, String s3)
        {
            String s4 = s;
            if (s == null)
            {
                s4 = getString(0x7f080049);
            }
            if (s1.startsWith("Are you sure you want to close"))
            {
                showQuitDialog();
                return;
            } else
            {
                s = LayoutInflater.from(context).inflate(0x7f03000e, null);
                (new android.app.AlertDialog.Builder(context, 5)).setTitle(s4).setMessage(s1).setView(s).setPositiveButton(s2, s2. new android.content.DialogInterface.OnClickListener() {

                    final _cls1 this$1;
                    private final String val$commandId;
                    private final String val$firstButton;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface = (new StringBuilder("{\"commandId\":\"")).append(commandId).append("\",\"type\":\"CommandResult\",\"subject\":\"OpenDialog\",\"payload\":{\"pressed\":\"").append(firstButton).append("\"}}").toString();
                        sendMessageToJS(dialoginterface);
                    }

            
            {
                this$1 = final__pcls1;
                commandId = s;
                firstButton = String.this;
                super();
            }
                }).setNegativeButton(s3, s3. new android.content.DialogInterface.OnClickListener() {

                    final _cls1 this$1;
                    private final String val$commandId;
                    private final String val$secondButton;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        dialoginterface = (new StringBuilder("{\"commandId\":\"")).append(commandId).append("\",\"type\":\"CommandResult\",\"subject\":\"OpenDialog\",\"payload\":{\"pressed\":\"").append(secondButton).append("\"}}").toString();
                        sendMessageToJS(dialoginterface);
                    }

            
            {
                this$1 = final__pcls1;
                commandId = s;
                secondButton = String.this;
                super();
            }
                }).setOnCancelListener(commandId. new android.content.DialogInterface.OnCancelListener() {

                    final _cls1 this$1;
                    private final String val$commandId;

                    public void onCancel(DialogInterface dialoginterface)
                    {
                        dialoginterface = (new StringBuilder("{\"commandId\":\"")).append(commandId).append("\",\"type\":\"CommandResult\",\"subject\":\"OpenDialog\",\"payload\":{\"pressed\":\"Nothing\"}}").toString();
                        sendMessageToJS(dialoginterface);
                    }

            
            {
                this$1 = final__pcls1;
                commandId = String.this;
                super();
            }
                }).show();
                return;
            }
        }

        public void openUrl(String s, boolean flag, String s1)
        {
            if (flag)
            {
                if (!MainActivity.popupOpened)
                {
                    Intent intent = new Intent(MainActivity.this, com/nbcuni/nbc/thevoice/PopupActivity);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("nav", true);
                    bundle.putString("key", s);
                    if (s1 != null)
                    {
                        bundle.putString("phase", s1);
                    }
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
                return;
            } else
            {
                s = new Intent("android.intent.action.VIEW", Uri.parse(s));
                startActivity(s);
                return;
            }
        }

        public void pauseAudio(String s)
        {
            if (mediaPlayer.isPlaying())
            {
                mediaPlayer.pause();
            }
        }

        public void playAudio(String s, String s1)
        {
            if (mediaPlayer == null)
            {
                Log.i("Badger", "Initializing mediaPlayer");
                mediaPlayer = new MediaPlayer();
                mediaPlayer.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() {

                    final _cls1 this$1;

                    public void onCompletion(MediaPlayer mediaplayer)
                    {
                        try
                        {
                            mediaPlayer.reset();
                            fis.close();
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (MediaPlayer mediaplayer)
                        {
                            mediaplayer.printStackTrace();
                        }
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }
            s = new File((new StringBuilder()).append(getCacheDir()).append("/").append(s).toString());
            if (!s.exists())
            {
                Log.e("Badger", "No such file");
                s = (new StringBuilder("{\"commandId\":\"")).append(s1).append("\",\"type\":\"CommandResult\",\"subject\":\"PlayAudio\",\"error\":{\"code\":\"File not found.\"}").toString();
                sendMessageToJS(s);
                return;
            }
            try
            {
                if (mediaPlayer.isPlaying())
                {
                    mediaPlayer.stop();
                    mediaPlayer.reset();
                    fis.close();
                }
                fis = new FileInputStream(s);
                mediaPlayer.setDataSource(fis.getFD());
                mediaPlayer.prepare();
                mediaPlayer.start();
                s = (new StringBuilder("{\"commandId\":\"")).append(s1).append("\",\"type\":\"CommandResult\",\"subject\":\"PlayAudio\"}").toString();
                sendMessageToJS(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }

        public void pushSetting(boolean flag, String s)
        {
            android.content.SharedPreferences.Editor editor = sharedPrefs.edit();
            if (flag)
            {
                PushManager.enablePush();
                editor.putBoolean("push", flag);
                sendMessageToJS(s);
            } else
            {
                PushManager.disablePush();
                editor.putBoolean("push", flag);
                sendMessageToJS(s);
            }
            editor.commit();
        }

        public void reloadWebView()
        {
            webView.reload();
        }

        public void resumeAudio(String s)
        {
            try
            {
                mediaPlayer.start();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }

        public void saveSharedPreference(String s, String s1)
        {
            android.content.SharedPreferences.Editor editor = sharedPrefs.edit();
            editor.putString(s, s1);
            editor.commit();
        }

        public void sendNativeMessage(String s)
        {
            sendMessageToJS(s);
        }

        public void stopAudio(String s)
        {
            if (!mediaPlayer.isPlaying())
            {
                break MISSING_BLOCK_LABEL_43;
            }
            mediaPlayer.stop();
            mediaPlayer.reset();
            fis.close();
            return;
            s;
            s.printStackTrace();
            return;
        }


            
            {
                this$0 = MainActivity.this;
                super();
            }
    };
    private CountDownTimer loadTimer;
    private int loginCmdID;
    private String loginSubject;
    boolean mediaPaused;
    private MediaPlayer mediaPlayer;
    MixpanelAPI mixpanel;
    private Dialog quitDialog;
    public boolean quitDialogOpen;
    private int resumeCounter;
    private ShareDialog shareDialog;
    private SharedPreferences sharedPrefs;
    private boolean splashShown;
    private Dialog updateDialog;
    private String webURL;
    private WebView webView;
    private android.os.PowerManager.WakeLock wl;

    public MainActivity()
    {
        DNSDialogActive = false;
        deviceCapability = "0";
        resumeCounter = 0;
        mediaPaused = false;
        quitDialogOpen = false;
    }

    private String capitalize(String s)
    {
        String s1;
        if (s == null || s.length() == 0)
        {
            s1 = "";
        } else
        {
            char c = s.charAt(0);
            s1 = s;
            if (!Character.isUpperCase(c))
            {
                return (new StringBuilder(String.valueOf(Character.toUpperCase(c)))).append(s.substring(1)).toString();
            }
        }
        return s1;
    }

    private void createWebView()
    {
        webURL = context.getString(0x7f08004c);
        WebSettings websettings = webView.getSettings();
        websettings.setJavaScriptEnabled(true);
        websettings.setJavaScriptCanOpenWindowsAutomatically(true);
        String s = getApplicationContext().getCacheDir().getAbsolutePath();
        websettings.setSupportMultipleWindows(true);
        websettings.setCacheMode(-1);
        websettings.setDomStorageEnabled(true);
        websettings.setAppCachePath(s);
        websettings.setAllowFileAccess(true);
        websettings.setAppCacheEnabled(true);
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            websettings.setDatabasePath((new StringBuilder("/data/data/")).append(getPackageName()).append("/database").toString());
        }
        websettings.setDatabaseEnabled(true);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
            websettings.setMixedContentMode(2);
        }
        webView.addJavascriptInterface(new JavaScriptHandler(this, jsListener), "NBCHandler");
        webView.setWebChromeClient(new WebChromeClient() {

            final MainActivity this$0;

            public boolean onConsoleMessage(ConsoleMessage consolemessage)
            {
                return true;
            }

            public boolean onCreateWindow(WebView webview, boolean flag, boolean flag1, Message message)
            {
                webview = new WebView(getApplicationContext());
                webview.setWebViewClient(new WebViewClient() {

                    final _cls13 this$1;

                    public boolean shouldOverrideUrlLoading(WebView webview, String s)
                    {
                        if (s.contains("emopenwebview"))
                        {
                            if (s.contains("emopenwebview=1"))
                            {
                                webview = new Intent(_fld0, com/nbcuni/nbc/thevoice/PopupActivity);
                                Bundle bundle = new Bundle();
                                bundle.putBoolean("nav", false);
                                bundle.putString("key", s);
                                webview.putExtras(bundle);
                                startActivity(webview);
                                return true;
                            }
                            if (s.contains("emopenwebview=0"))
                            {
                                webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
                                startActivity(webview);
                                return true;
                            }
                        }
                        if (s.contains("www.facebook.com") && s.contains("dialog/feed"))
                        {
                            handleFacebookShare(s);
                            return true;
                        }
                        if (s.contains("www.facebook.com") && s.contains("dialog/oauth"))
                        {
                            webview = new Intent(_fld0, com/nbcuni/nbc/thevoice/PopupActivity);
                            Bundle bundle1 = new Bundle();
                            bundle1.putBoolean("nav", false);
                            bundle1.putString("key", s);
                            webview.putExtras(bundle1);
                            startActivity(webview);
                            return true;
                        }
                        if (s.startsWith("market://"))
                        {
                            openAppStore(s);
                            return true;
                        }
                        if (s.contains("twitter.com"))
                        {
                            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
                            startActivity(Intent.createChooser(webview, "Tweet!"));
                            return true;
                        }
                        if (s.startsWith("sms:"))
                        {
                            int i = s.indexOf(":");
                            int j = s.indexOf("?");
                            int k = s.indexOf("=");
                            webview = s.substring(i + 1, j);
                            s = s.substring(k + 1);
                            webview = new Intent("android.intent.action.SENDTO", Uri.parse((new StringBuilder("smsto:")).append(webview).toString()));
                            webview.putExtra("sms_body", s);
                            startActivity(webview);
                            return true;
                        }
                        if (s.startsWith("popup-nav"))
                        {
                            webview = new Intent(_fld0, com/nbcuni/nbc/thevoice/PopupActivity);
                            Bundle bundle2 = new Bundle();
                            bundle2.putBoolean("nav", true);
                            bundle2.putString("key", s.substring(s.indexOf(":") + 1));
                            webview.putExtras(bundle2);
                            startActivity(webview);
                            return true;
                        }
                        if (s.startsWith("popup"))
                        {
                            webview = new Intent(_fld0, com/nbcuni/nbc/thevoice/PopupActivity);
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("nav", false);
                            bundle3.putString("key", s.substring(s.indexOf(":") + 1));
                            webview.putExtras(bundle3);
                            startActivity(webview);
                            return true;
                        } else
                        {
                            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
                            startActivity(webview);
                            return true;
                        }
                    }

            
            {
                this$1 = _cls13.this;
                super();
            }
                });
                ((android.webkit.WebView.WebViewTransport)message.obj).setWebView(webview);
                message.sendToTarget();
                return true;
            }

            public boolean onJsAlert(WebView webview, String s1, String s2, JsResult jsresult)
            {
                (new android.app.AlertDialog.Builder(webview.getContext())).setMessage(s2).setCancelable(true).show();
                jsresult.confirm();
                return true;
            }

            public boolean onJsBeforeUnload(WebView webview, String s1, String s2, JsResult jsresult)
            {
                jsresult.confirm();
                return true;
            }

            public boolean onJsConfirm(WebView webview, String s1, String s2, JsResult jsresult)
            {
                (new android.app.AlertDialog.Builder(context, 4)).setTitle("Dialog").setMessage(s2).setPositiveButton(0x104000a, jsresult. new android.content.DialogInterface.OnClickListener() {

                    final _cls13 this$1;
                    private final JsResult val$result;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        result.confirm();
                    }

            
            {
                this$1 = final__pcls13;
                result = JsResult.this;
                super();
            }
                }).setNegativeButton(0x1040000, jsresult. new android.content.DialogInterface.OnClickListener() {

                    final _cls13 this$1;
                    private final JsResult val$result;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        result.cancel();
                    }

            
            {
                this$1 = final__pcls13;
                result = JsResult.this;
                super();
            }
                }).create();
                return super.onJsConfirm(webview, s1, s2, jsresult);
            }

            public boolean onJsPrompt(WebView webview, String s1, String s2, String s3, JsPromptResult jspromptresult)
            {
                webview = LayoutInflater.from(context).inflate(0x7f03000e, null);
                ((TextView)webview.findViewById(0x7f09004b)).setText(s2);
                (new android.app.AlertDialog.Builder(context, 4)).setTitle("Dialog").setView(webview).setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                    final _cls13 this$1;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                    }

            
            {
                this$1 = _cls13.this;
                super();
            }
                }).setNegativeButton(0x1040000, jspromptresult. new android.content.DialogInterface.OnClickListener() {

                    final _cls13 this$1;
                    private final JsPromptResult val$result;

                    public void onClick(DialogInterface dialoginterface, int i)
                    {
                        result.cancel();
                    }

            
            {
                this$1 = final__pcls13;
                result = JsPromptResult.this;
                super();
            }
                }).setOnCancelListener(jspromptresult. new android.content.DialogInterface.OnCancelListener() {

                    final _cls13 this$1;
                    private final JsPromptResult val$result;

                    public void onCancel(DialogInterface dialoginterface)
                    {
                        result.cancel();
                    }

            
            {
                this$1 = final__pcls13;
                result = JsPromptResult.this;
                super();
            }
                }).show();
                return true;
            }

            public void onProgressChanged(WebView webview, int i)
            {
                setProgress(i * 1000);
            }


            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        webView.setWebViewClient(new WebViewClient() {

            final MainActivity this$0;

            private WebResourceResponse getUtf8EncodedCssWebResourceResponse(InputStream inputstream)
            {
                return new WebResourceResponse("text/css", "UTF-8", inputstream);
            }

            public void onPageFinished(WebView webview, String s1)
            {
                webView.loadUrl((new StringBuilder("javascript: window.nativeWrapper = window.nativeWrapper || {}; window.nativeWrapper.os= \"Android\"; window.nativeWrapper.name=\"")).append(getString(0x7f080049)).append("\"; window.nativeWrapper.osVersion=\"").append(OSVersion).append("\"; window.nativeWrapper.version=\"").append(VERSION).append("\"; window.nativeWrapper.deviceModel=\"").append(getDeviceModel()).append("\"; window.nativeWrapper.capabilities= ['").append(deviceCapability).append("']; window.nativeWrapper.pushEnabled=").append(sharedPrefs.getBoolean("push", true)).append("; window.nativeWrapper.serverUrl=\"").append(backendUrl).append("\"; window.nativeWrapper.timeZone=\"").append(getTimeZone()).append("\"; window.nativeWrapper.gatekeeperTimestamp=\"").append(gatekeeperTimestamp).append("\"; window.nativeWrapper.gatekeeperResponse=JSON.parse('").append(backendResponse).append("');").toString());
                webView.loadUrl("javascript: window.nativeWrapper.sendMessage = function(messageObject) {NBCHandler.parseMessageObject(JSON.stringify(messageObject));}");
                webView.loadUrl("javascript: if(nativeWrapper.onMessage){ nativeWrapper.onMessage(JSON.parse('{\"type\":\"Event\",\"subject\":\"BridgeReady\"}'))}");
                if (backendUrl != null)
                {
                    String s2 = (new StringBuilder("{\"type\":\"Event\",\"subject\":\"GatekeeperReady\",\"payload\":{\"gatekeeperTimestamp\":\"")).append(gatekeeperTimestamp).append("\", \"gatekeeperResponse\":").append(backendResponse).append("}}").toString();
                    webView.loadUrl((new StringBuilder("javascript: if(nativeWrapper.onMessage){ nativeWrapper.onMessage(JSON.parse('")).append(s2).append("'))}").toString());
                }
                super.onPageFinished(webview, s1);
                if (loadTimer != null)
                {
                    loadTimer.cancel();
                }
            }

            public void onPageStarted(WebView webview, String s1, Bitmap bitmap)
            {
                loadTimer = new CountDownTimer(10000L, 1000L) {

                    final _cls14 this$1;

                    public void onFinish()
                    {
                        String s = getString(0x7f080062);
                        Toast.makeText(context, s, 0).show();
                    }

                    public void onTick(long l)
                    {
                    }

            
            {
                this$1 = _cls14.this;
                super(l, l1);
            }
                };
                loadTimer.start();
                super.onPageStarted(webview, s1, bitmap);
            }

            public void onReceivedError(WebView webview, int i, String s1, String s2)
            {
                Log.e("WebLog", (new StringBuilder("eCode: ")).append(i).append(" desc: ").append(s1).toString());
                if (loadTimer != null)
                {
                    loadTimer.cancel();
                }
                if (i == -2 && getConnectionStatus(context))
                {
                    webView.loadUrl("about:blank");
                    webView.setVisibility(8);
                    showDNSDialog();
                }
                super.onReceivedError(webview, i, s1, s2);
            }

            public WebResourceResponse shouldInterceptRequest(WebView webview, String s1)
            {
                if (!s1.contains("/") || s1.endsWith("/"))
                {
                    return super.shouldInterceptRequest(webview, s1);
                }
                Object obj = s1.substring(s1.lastIndexOf("/") + 1);
                if (assets.contains(obj))
                {
                    WebResourceResponse webresourceresponse;
                    try
                    {
                        webresourceresponse = getUtf8EncodedCssWebResourceResponse(new FileInputStream(new File((new StringBuilder()).append(getCacheDir()).append("/").append(((String) (obj))).toString())));
                    }
                    catch (IOException ioexception1)
                    {
                        try
                        {
                            obj = getUtf8EncodedCssWebResourceResponse(getAssets().open(((String) (obj))));
                        }
                        catch (IOException ioexception)
                        {
                            return super.shouldInterceptRequest(webview, s1);
                        }
                        return ((WebResourceResponse) (obj));
                    }
                    return webresourceresponse;
                } else
                {
                    return super.shouldInterceptRequest(webview, s1);
                }
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s1)
            {
                if (s1.contains("nissanoffthestage"))
                {
                    webview = new Intent(MainActivity.this, com/nbcuni/nbc/thevoice/PopupActivity);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("nav", false);
                    bundle.putString("key", s1);
                    webview.putExtras(bundle);
                    startActivity(webview);
                    return true;
                }
                if (s1.contains("emopenwebview"))
                {
                    if (s1.contains("emopenwebview=1"))
                    {
                        webview = new Intent(MainActivity.this, com/nbcuni/nbc/thevoice/PopupActivity);
                        Bundle bundle1 = new Bundle();
                        bundle1.putBoolean("nav", false);
                        bundle1.putString("key", s1);
                        webview.putExtras(bundle1);
                        startActivity(webview);
                        return true;
                    }
                    if (s1.contains("emopenwebview=0"))
                    {
                        webview = new Intent("android.intent.action.VIEW", Uri.parse(s1));
                        startActivity(webview);
                        return true;
                    }
                }
                if (s1.contains("www.facebook.com") && s1.contains("dialog/feed"))
                {
                    handleFacebookShare(s1);
                    return true;
                }
                if (s1.contains(".facebook.com") && s1.contains("dialog/share"))
                {
                    handleFacebookShare(s1);
                    return true;
                }
                if (s1.contains(".facebook.com") && s1.contains("dialog") && s1.contains("feed"))
                {
                    handleFacebookShare(s1);
                    return true;
                }
                if (s1.contains(".facebook.com") && s1.contains("dialog") && s1.contains("share"))
                {
                    handleFacebookShare(s1);
                    return true;
                }
                if (s1.contains("www.facebook.com") && s1.contains("dialog/oauth"))
                {
                    webview = new Intent(MainActivity.this, com/nbcuni/nbc/thevoice/PopupActivity);
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("nav", false);
                    bundle2.putString("key", s1);
                    webview.putExtras(bundle2);
                    startActivity(webview);
                    return true;
                }
                if (s1.startsWith("market://"))
                {
                    openAppStore(s1);
                    return true;
                }
                if (s1.contains("twitter.com"))
                {
                    webview = new Intent("android.intent.action.VIEW", Uri.parse(s1));
                    startActivity(Intent.createChooser(webview, "Tweet!"));
                    return true;
                }
                if (s1.startsWith("sms:"))
                {
                    int i = s1.indexOf(":");
                    int j = s1.indexOf("?");
                    int k = s1.indexOf("=");
                    webview = s1.substring(i + 1, j);
                    s1 = s1.substring(k + 1);
                    webview = new Intent("android.intent.action.SENDTO", Uri.parse((new StringBuilder("smsto:")).append(webview).toString()));
                    webview.putExtra("sms_body", s1);
                    startActivity(webview);
                    return true;
                }
                if (s1.startsWith("popup-nav"))
                {
                    webview = new Intent(MainActivity.this, com/nbcuni/nbc/thevoice/PopupActivity);
                    Bundle bundle3 = new Bundle();
                    bundle3.putBoolean("nav", true);
                    bundle3.putString("key", s1.substring(s1.indexOf(":") + 1));
                    webview.putExtras(bundle3);
                    startActivity(webview);
                    return true;
                }
                if (s1.startsWith("popup"))
                {
                    webview = new Intent(MainActivity.this, com/nbcuni/nbc/thevoice/PopupActivity);
                    Bundle bundle4 = new Bundle();
                    bundle4.putBoolean("nav", false);
                    bundle4.putString("key", s1.substring(s1.indexOf(":") + 1));
                    webview.putExtras(bundle4);
                    startActivity(webview);
                    return true;
                }
                if (s1.startsWith("mailto") || s1.startsWith("tel:"))
                {
                    webview = new Intent("android.intent.action.VIEW", Uri.parse(s1));
                    startActivity(webview);
                    return true;
                }
                if (!s1.startsWith(webURL))
                {
                    webview = new Intent("android.intent.action.VIEW", Uri.parse(s1));
                    startActivity(webview);
                    return true;
                } else
                {
                    return false;
                }
            }


            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        if (!getConnectionStatus(context))
        {
            webView.loadUrl("about:blank");
            DNSDialogActive = true;
            showConnectionDialog();
            return;
        } else
        {
            webView.loadUrl((new StringBuilder(String.valueOf(webURL))).append("?wrapper=1").toString());
            return;
        }
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
        runOnUiThread(new Runnable() {

            final MainActivity this$0;

            public void run()
            {
                webView.loadUrl("javascript: FB.logout();");
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        sharedPrefs.edit().remove("fbAuthToken").commit();
        if (s != null)
        {
            sendMessageToJS((new StringBuilder("{\"commandId\":\"")).append(s).append("\",\"type\":\"CommandResult\",\"subject\":\"FacebookLogout\"}").toString());
        }
    }

    private void openAppStore(String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(s));
        startActivity(intent);
    }

    private void setMixPanelProperties(int i)
    {
        Object obj = Calendar.getInstance(Locale.US);
        SimpleDateFormat simpledateformat = new SimpleDateFormat("HH:mm");
        int j;
        if (((Calendar) (obj)).get(7) == 1)
        {
            j = 7;
        } else
        {
            j = ((Calendar) (obj)).get(7) - 1;
        }
        switch (i)
        {
        default:
            return;

        case 1: // '\001'
            if (mixpanel.getPeople().getDistinctId() == null)
            {
                mixpanel.getPeople().identify(mixpanel.getDistinctId());
                mixpanel.getPeople().set("Platform", "Android");
                mixpanel.getPeople().set("Product", "The Voice App");
            }
            JSONObject jsonobject = new JSONObject();
            if (sharedPrefs.getString("MPfirstLaunchDate", null) == null)
            {
                Object obj1 = sharedPrefs.edit();
                SimpleDateFormat simpledateformat1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
                ((android.content.SharedPreferences.Editor) (obj1)).putString("MPfirstLaunchDate", simpledateformat1.format(new Date()));
                ((android.content.SharedPreferences.Editor) (obj1)).commit();
                JSONException jsonexception;
                JSONException jsonexception1;
                try
                {
                    obj1 = simpledateformat1.format(new Date());
                    jsonobject.put("Platform", "Android");
                    jsonobject.put("Product", "The Voice App");
                    jsonobject.put("First App Launch Date", obj1);
                    jsonobject.put("First App Launch", "True");
                    mixpanel.getPeople().set("First App Launch Date", obj1);
                }
                catch (JSONException jsonexception2) { }
            } else
            {
                try
                {
                    jsonobject.put("First App Launch", "False");
                }
                // Misplaced declaration of an exception variable
                catch (JSONException jsonexception1) { }
            }
            try
            {
                jsonobject.put("Hour of Day", ((Calendar) (obj)).get(11));
                jsonobject.put("Min of Hour", simpledateformat.format(((Calendar) (obj)).getTime()));
                jsonobject.put("Day of Week", j);
                mixpanel.getPeople().set("Hour of Day", Integer.valueOf(((Calendar) (obj)).get(11)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((JSONException) (obj)).printStackTrace();
            }
            mixpanel.registerSuperProperties(jsonobject);
            mixpanel.track("Launch", jsonobject);
            return;

        case 2: // '\002'
            jsonobject = new JSONObject();
            jsonexception1 = new JSONObject();
            break;
        }
        try
        {
            jsonobject.put("Hour of Day", ((Calendar) (obj)).get(11));
            jsonobject.put("Min of Hour", simpledateformat.format(((Calendar) (obj)).getTime()));
            jsonobject.put("Day of Week", j);
            obj = sharedPrefs.edit();
            i = sharedPrefs.getInt("AppOpens", 0) + 1;
            jsonobject.put("Total App Opens", i);
            jsonexception1.put("Total App Opens", i);
            ((android.content.SharedPreferences.Editor) (obj)).putInt("AppOpens", i);
            ((android.content.SharedPreferences.Editor) (obj)).commit();
            mixpanel.getPeople().set("Total App Opens", Integer.valueOf(i));
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception) { }
        mixpanel.track("App Opened", jsonobject);
        mixpanel.registerSuperProperties(jsonexception1);
    }

    public void checkVersion(int i, String s)
    {
        if (!s.equals("NONE"))
        {
            resumeCounter = resumeCounter + 1;
        }
        VERSION = 0;
        if (s.equals("FULL"))
        {
            s = new Intent(this, com/nbcuni/nbc/thevoice/PopupActivity);
            Bundle bundle = new Bundle();
            bundle.putBoolean("nav", true);
            bundle.putString("key", "http://www.nbc.com/the-voice/redirect");
            bundle.putString("phase", " ");
            s.putExtras(bundle);
            startActivity(s);
            finish();
        } else
        {
            if (resumeCounter <= 1 && !s.equals("NONE"))
            {
                createWebView();
            }
            try
            {
                VERSION = getPackageManager().getPackageInfo(getPackageName(), 0).versionCode;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
            if (i > VERSION)
            {
                Log.e("WebLog", (new StringBuilder("checkVersion - Update your app, minimum required version: ")).append(i).toString());
                webView.stopLoading();
                webView.loadUrl("about:blank");
                showUpdateDialog();
                return;
            }
        }
    }

    public boolean getConnectionStatus(Context context1)
    {
        for (context1 = ((ConnectivityManager)context1.getSystemService("connectivity")).getActiveNetworkInfo(); context1 == null || !context1.isConnected() || !context1.isAvailable();)
        {
            return false;
        }

        return true;
    }

    public String getDeviceModel()
    {
        String s2 = Build.MANUFACTURER;
        String s1 = Build.MODEL;
        String s = s1;
        if (s1.contains("'") | s1.contains("\""))
        {
            s = s1.replace("\"", "\\\"").replace("'", "\\'");
        }
        s1 = s2;
        if (s2.contains("'") | s2.contains("\""))
        {
            s1 = s2.replace("\"", "\\\"").replace("'", "\\'");
        }
        if (s.startsWith(s1))
        {
            return capitalize(s);
        } else
        {
            return (new StringBuilder(String.valueOf(capitalize(s1)))).append(" ").append(s).toString();
        }
    }

    public String getTimeZone()
    {
        return TimeZone.getDefault().getDisplayName(false, 0, Locale.US);
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

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        callbackManager.onActivityResult(i, j, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        popupOpened = false;
        Config.setContext(getApplicationContext());
        comScore.setAppContext(getApplicationContext());
        sharedPrefs = getSharedPreferences("PushPreferences", 0);
        mixpanel = MixpanelAPI.getInstance(getApplicationContext(), "077d27b869b0ce2fda8e02f7f37cc5a2");
        Object obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("campaign", "Organic");
        }
        catch (JSONException jsonexception) { }
        mixpanel.registerSuperPropertiesOnce(((JSONObject) (obj)));
        setMixPanelProperties(1);
        Feature.setAttributionHandler(new Handler() {

            final MainActivity this$0;

            public void handleMessage(Message message)
            {
                Object obj1;
                obj1 = message.getData().getString("attributionData");
                if (obj1 == null || ((String) (obj1)).equals("false"))
                {
                    break MISSING_BLOCK_LABEL_95;
                }
                message = new JSONObject();
                obj1 = new JSONObject(((String) (obj1)));
                if (((JSONObject) (obj1)).has("tracker"))
                {
                    message.put("campaign", ((JSONObject) (obj1)).get("tracker"));
                }
                if (((JSONObject) (obj1)).has("tracker_id"))
                {
                    message.put("campaign_id", ((JSONObject) (obj1)).get("tracker_id"));
                }
                mixpanel.registerSuperProperties(message);
                return;
                message;
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        obj = new HashMap();
        ((HashMap) (obj)).put("kochava_app_id", "kothe-voice----android53ff5a272245b");
        ((HashMap) (obj)).put("request_attribution", Boolean.valueOf(true));
        ((HashMap) (obj)).put("internalUserId", mixpanel.getDistinctId());
        new Feature(this, ((HashMap) (obj)));
        if (bundle != null)
        {
            splashShown = bundle.getBoolean("splashShown", false);
        }
        if (!sharedPrefs.getBoolean("push", true))
        {
            PushManager.disablePush();
        }
        wl = ((PowerManager)getSystemService("power")).newWakeLock(6, "NoTurningOff");
        requestWindowFeature(1);
        setContentView(0x7f030000);
        webView = (WebView)findViewById(0x7f09002c);
        FacebookSdk.sdkInitialize(getApplicationContext());
        callbackManager = com.facebook.CallbackManager.Factory.create();
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback() {

            final MainActivity this$0;

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

            public volatile void onSuccess(Object obj1)
            {
                onSuccess((LoginResult)obj1);
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        shareDialog = new ShareDialog(this);
        bundle = CookieManager.getInstance();
        if (bundle != null)
        {
            bundle.removeSessionCookie();
        }
        OSVersion = android.os.Build.VERSION.RELEASE;
        deviceCapability = "audio', 'noTelephony";
        webView.setBackgroundColor(0xff000000);
        webView.setVisibility(0);
        if (!getConnectionStatus(context))
        {
            webView.loadUrl("about:blank");
            DNSDialogActive = true;
            showConnectionDialog();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f0d0000, menu);
        return false;
    }

    protected void onDestroy()
    {
        mixpanel.flush();
        super.onDestroy();
        if (httpTask != null)
        {
            httpTask.cancel(true);
        }
        if (loadTimer != null)
        {
            loadTimer.cancel();
        }
        if (webView != null)
        {
            webView.destroy();
        }
        if (mediaPlayer != null)
        {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i != 4)
        {
            return false;
        } else
        {
            sendMessageToJS("{\"type\":\"Event\",\"subject\":\"BackButton\"}");
            return false;
        }
    }

    protected void onPause()
    {
        if (wl.isHeld())
        {
            wl.release();
        }
        sendMessageToJS("{\"type\":\"Event\",\"subject\":\"AppPause\"}");
        webView.onPause();
        webView.pauseTimers();
        if (mediaPlayer != null && mediaPlayer.isPlaying())
        {
            mediaPaused = true;
            mediaPlayer.pause();
        }
        super.onPause();
        Config.pauseCollectingLifecycleData();
    }

    protected void onResume()
    {
        super.onResume();
        if (!wl.isHeld())
        {
            wl.acquire();
        }
        webView.onResume();
        webView.resumeTimers();
        if (mediaPaused)
        {
            mediaPaused = false;
            mediaPlayer.start();
        }
        httpTask = (new HTTPTask(this)).execute(new String[] {
            ""
        });
        Config.collectLifecycleData();
        if (resumeCounter >= 2)
        {
            setMixPanelProperties(2);
        }
        if (sharedPrefs.getString("expiryDate", null) != null)
        {
            webView.loadUrl((new StringBuilder("javascript: window.localStorage.setItem(\"age_gate\", JSON.stringify(")).append(sharedPrefs.getString("expiryDate", null)).append("));").toString());
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bundle.putBoolean("splashShown", splashShown);
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        if (!splashShown)
        {
            startActivity(new Intent(this, com/nbcuni/nbc/thevoice/VideoSplash));
            splashShown = true;
        }
        super.onStart();
    }

    protected void onStop()
    {
        super.onStop();
    }

    public void sendBackendData(String s, JSONObject jsonobject, long l, String s1)
    {
        backendUrl = s;
        backendResponse = jsonobject;
        backendTimeZone = s1;
        gatekeeperTimestamp = l;
    }

    public void sendMessageToJS(String s)
    {
        runOnUiThread(new Runnable() {

            final MainActivity this$0;
            private final String val$jsCommand;

            public void run()
            {
                webView.loadUrl((new StringBuilder("javascript:")).append(jsCommand).toString());
            }

            
            {
                this$0 = MainActivity.this;
                jsCommand = s;
                super();
            }
        });
    }

    public void showConnectionDialog()
    {
        connectionDialog = new Dialog(context, 0x103000c);
        connectionDialog.requestWindowFeature(1);
        connectionDialog.setCancelable(false);
        connectionDialog.setContentView(0x7f03000b);
        ((TextView)connectionDialog.findViewById(0x7f090045)).setText(0x7f08005d);
        ((TextView)connectionDialog.findViewById(0x7f090046)).setText(0x7f08005e);
        connectionDialog.show();
        registerReceiver(broadcastReceiver, filter);
    }

    public void showDNSDialog()
    {
        if (DNSDialogActive)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        DNSDialogActive = true;
        DNSDialog = new Dialog(context, 0x103000c);
        DNSDialog.requestWindowFeature(1);
        DNSDialog.setCancelable(false);
        DNSDialog.setContentView(0x7f03000c);
        ((TextView)DNSDialog.findViewById(0x7f090045)).setText(0x7f08005f);
        ((TextView)DNSDialog.findViewById(0x7f090046)).setText(0x7f080060);
        Button button = (Button)DNSDialog.findViewById(0x7f090047);
        button.setVisibility(0);
        button.setText(0x7f080053);
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                DNSDialog.dismiss();
                finish();
                DNSDialogActive = false;
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        button = (Button)DNSDialog.findViewById(0x7f090048);
        button.setVisibility(0);
        button.setText(0x7f080056);
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                DNSDialog.dismiss();
                httpTask = (new HTTPTask(MainActivity.this)).execute(new String[] {
                    ""
                });
                DNSDialogActive = false;
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        DNSDialog.show();
        return;
        android.view.WindowManager.BadTokenException badtokenexception;
        badtokenexception;
        DNSDialogActive = false;
        return;
    }

    public void showEndOfSeasonDialog()
    {
        webView.loadUrl("about:blank");
        endOfShowDialog = new Dialog(context, 0x103000c);
        endOfShowDialog.requestWindowFeature(1);
        endOfShowDialog.setCancelable(false);
        endOfShowDialog.setContentView(0x7f03000d);
        ((TextView)endOfShowDialog.findViewById(0x7f090045)).setText(0x7f080057);
        ((TextView)endOfShowDialog.findViewById(0x7f090049)).setText(0x7f080058);
        ((TextView)endOfShowDialog.findViewById(0x7f09004a)).setText(0x7f080059);
        ((TextView)endOfShowDialog.findViewById(0x7f090046)).setText(0x7f08005a);
        ((LinearLayout)endOfShowDialog.findViewById(0x7f090043)).setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                endOfShowDialog.dismiss();
                finish();
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        endOfShowDialog.show();
    }

    public void showQuitDialog()
    {
        if (!quitDialogOpen)
        {
            quitDialog = new Dialog(context, 0x103000f);
            quitDialog.requestWindowFeature(1);
            quitDialog.setCancelable(false);
            quitDialog.setContentView(0x7f03000c);
            ((RelativeLayout)quitDialog.findViewById(0x7f090042)).setBackgroundColor(0x106000d);
            ((TextView)quitDialog.findViewById(0x7f090045)).setText(0x7f080049);
            ((TextView)quitDialog.findViewById(0x7f090046)).setText(0x7f080061);
            Button button = (Button)quitDialog.findViewById(0x7f090047);
            button.setText(0x7f080055);
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final MainActivity this$0;

                public void onClick(View view)
                {
                    quitDialog.dismiss();
                    quitDialogOpen = false;
                }

            
            {
                this$0 = MainActivity.this;
                super();
            }
            });
            button = (Button)quitDialog.findViewById(0x7f090048);
            button.setText(0x7f080054);
            button.setOnClickListener(new android.view.View.OnClickListener() {

                final MainActivity this$0;

                public void onClick(View view)
                {
                    quitDialog.dismiss();
                    quitDialogOpen = false;
                    sendMessageToJS("{\"type\":\"Event\",\"subject\":\"AppStop\"}");
                    finish();
                }

            
            {
                this$0 = MainActivity.this;
                super();
            }
            });
            quitDialog.show();
            quitDialogOpen = true;
        }
    }

    public void showUpdateDialog()
    {
        updateDialog = new Dialog(context, 0x103000c);
        updateDialog.requestWindowFeature(1);
        updateDialog.setCancelable(false);
        updateDialog.setContentView(0x7f03000c);
        ((TextView)updateDialog.findViewById(0x7f090045)).setText(0x7f08005b);
        ((TextView)updateDialog.findViewById(0x7f090046)).setText(Html.fromHtml(getString(0x7f08005c)));
        Button button = (Button)updateDialog.findViewById(0x7f090047);
        button.setText(0x7f080053);
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                updateDialog.dismiss();
                finish();
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        button = (Button)updateDialog.findViewById(0x7f090048);
        button.setText(0x7f080052);
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final MainActivity this$0;

            public void onClick(View view)
            {
                view = (new StringBuilder(String.valueOf(getString(0x7f080050)))).append(getPackageName()).toString();
                openAppStore(view);
            }

            
            {
                this$0 = MainActivity.this;
                super();
            }
        });
        updateDialog.show();
    }





























}
