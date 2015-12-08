// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.widget;

import android.net.Uri;
import android.webkit.HttpAuthHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.urbanairship.Logger;
import com.urbanairship.actions.ActionArguments;
import com.urbanairship.actions.ActionRunner;
import com.urbanairship.actions.Situation;
import com.urbanairship.js.NativeBridge;
import com.urbanairship.js.UAJavascriptInterface;
import com.urbanairship.util.JSONUtils;
import com.urbanairship.util.UriUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.urbanairship.widget:
//            RichPushMessageWebView

public class UAWebViewClient extends WebViewClient
{
    private static class Credentials
    {

        final String password;
        final String username;

        Credentials(String s, String s1)
        {
            username = s;
            password = s1;
        }
    }


    private static final String CLOSE_COMMAND = "close";
    private static final String MARK_MESSAGE_READ_COMMAND = "mark-message-read";
    private static final String MARK_MESSAGE_UNREAD_COMMAND = "mark-message-unread";
    private static final String NAVIGATE_COMMAND = "navigate-to";
    public static final String RUN_ACTIONS_COMMAND = "run-actions";
    private static final String RUN_ACTIONS_COMMAND_CALLBACK = "android-run-action-cb";
    public static final String RUN_BASIC_ACTIONS_COMMAND = "run-basic-actions";
    public static final String UA_ACTION_SCHEME = "uairship";
    private ActionRunner actionRunner;
    private Map authRequestCredentials;

    public UAWebViewClient()
    {
        this(ActionRunner.shared());
    }

    UAWebViewClient(ActionRunner actionrunner)
    {
        authRequestCredentials = new HashMap();
        actionRunner = actionrunner;
    }

    private String createJavascriptInterfaceWrapper(UAJavascriptInterface uajavascriptinterface)
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("var _UAirship = {};");
        stringbuilder.append(String.format("_UAirship.%s = function(){return '%s';};", new Object[] {
            "getDeviceModel", uajavascriptinterface.getDeviceModel()
        })).append(String.format("_UAirship.%s = function(){return '%s';};", new Object[] {
            "getMessageId", uajavascriptinterface.getMessageId()
        })).append(String.format("_UAirship.%s = function(){return '%s';};", new Object[] {
            "getMessageTitle", uajavascriptinterface.getMessageTitle()
        })).append(String.format("_UAirship.%s = function(){return '%s';};", new Object[] {
            "getMessageSentDate", uajavascriptinterface.getMessageSentDate()
        })).append(String.format("_UAirship.%s = function(){return %s;};", new Object[] {
            "getMessageSentDateMS", Long.valueOf(uajavascriptinterface.getMessageSentDateMS())
        })).append(String.format("_UAirship.%s = function(){return '%s';};", new Object[] {
            "getUserId", uajavascriptinterface.getUserId()
        }));
        stringbuilder.append("_UAirship.invoke = function(url){").append("var f = document.createElement('iframe');").append("f.style.display = 'none';").append("f.src = url;").append("document.body.appendChild(f);").append("f.parentNode.removeChild(f);").append("};");
        stringbuilder.append("_UAirship.close=function(){_UAirship.invoke('uairship://close');};");
        stringbuilder.append("_UAirship.actionCall=function(name, args, callback){").append("var url = 'uairship://android-run-action-cb/' + name + '/' + encodeURIComponent(args) +'/' + callback;").append("_UAirship.invoke(url);").append("};");
        stringbuilder.append("_UAirship.navigateTo=function(activity){_UAirship.invoke('uairship://navigate-to/' + activity);};");
        stringbuilder.append("_UAirship.markMessageRead=function(){").append("_UAirship.invoke('uairship://mark-message-read');").append(String.format("_UAirship.%s = function(){return %s;};", new Object[] {
            "isMessageRead", Boolean.valueOf(true)
        })).append("};");
        stringbuilder.append("_UAirship.markMessageUnread=function(){").append("_UAirship.invoke('uairship://mark-message-unread');").append(String.format("_UAirship.%s = function(){return %s;};", new Object[] {
            "isMessageRead", Boolean.valueOf(false)
        })).append("};");
        stringbuilder.append(String.format("_UAirship.%s = function(){return %s;};", new Object[] {
            "getViewHeight", Integer.valueOf(uajavascriptinterface.getViewHeight())
        })).append(String.format("_UAirship.%s = function(){return %s;};", new Object[] {
            "getViewWidth", Integer.valueOf(uajavascriptinterface.getViewWidth())
        })).append(String.format("_UAirship.%s = function(){return %s;};", new Object[] {
            "isMessageRead", Boolean.valueOf(uajavascriptinterface.isMessageRead())
        }));
        stringbuilder.append("if (typeof urbanairship === 'undefined') {urbanairship = Object.create(_UAirship);}");
        return stringbuilder.toString();
    }

    private Object getArgumentFromJSONString(String s)
        throws JSONException
    {
        if (s == null)
        {
            return null;
        }
        List list;
        try
        {
            list = JSONUtils.convertToList(new JSONArray(s));
        }
        catch (JSONException jsonexception)
        {
            return JSONUtils.convertToMap(new JSONObject(s));
        }
        return list;
    }

    private void runActions(Map map)
    {
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Iterator iterator1 = ((List)map.get(s)).iterator();
            while (iterator1.hasNext()) 
            {
                String s1 = (String)iterator1.next();
                try
                {
                    ActionArguments actionarguments = new ActionArguments(Situation.WEB_VIEW_INVOCATION, getArgumentFromJSONString(s1));
                    actionRunner.runAction(s, actionarguments);
                }
                catch (JSONException jsonexception)
                {
                    Logger.warn((new StringBuilder()).append("Invalid json. Unable to run action ").append(s).append(" with args: ").append(s1).toString(), jsonexception);
                }
            }
        }

    }

    private void runBasicActions(Map map)
    {
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Iterator iterator1 = ((List)map.get(s)).iterator();
            while (iterator1.hasNext()) 
            {
                String s1 = (String)iterator1.next();
                actionRunner.runAction(s, new ActionArguments(Situation.WEB_VIEW_INVOCATION, s1));
            }
        }

    }

    void addAuthRequestCredentials(String s, String s1, String s2)
    {
        authRequestCredentials.put(s, new Credentials(s1, s2));
    }

    public void onPageFinished(WebView webview, String s)
    {
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            Logger.info("Loading UrbanAirship Javascript interface.");
            s = null;
            if (webview instanceof RichPushMessageWebView)
            {
                s = ((RichPushMessageWebView)webview).getCurrentMessage();
            }
            s = createJavascriptInterfaceWrapper(new UAJavascriptInterface(webview, s));
            webview.loadUrl((new StringBuilder()).append("javascript:").append(s).toString());
        }
        Logger.info("Loading UrbanAirship native Javascript bridge.");
        s = NativeBridge.getJavaScriptSource();
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            webview.evaluateJavascript(s, null);
            return;
        } else
        {
            webview.loadUrl((new StringBuilder()).append("javascript:").append(s).toString());
            return;
        }
    }

    public void onReceivedHttpAuthRequest(WebView webview, HttpAuthHandler httpauthhandler, String s, String s1)
    {
        webview = (Credentials)authRequestCredentials.get(s);
        if (webview != null)
        {
            httpauthhandler.proceed(((Credentials) (webview)).username, ((Credentials) (webview)).password);
        }
    }

    void removeAuthRequestCredentials(String s)
    {
        authRequestCredentials.remove(s);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        Uri uri = Uri.parse(s);
        com.urbanairship.richpush.RichPushMessage richpushmessage = null;
        if (webview instanceof RichPushMessageWebView)
        {
            richpushmessage = ((RichPushMessageWebView)webview).getCurrentMessage();
        }
        if ("uairship".equals(uri.getScheme()))
        {
            if ("run-basic-actions".equals(uri.getHost()))
            {
                Logger.info((new StringBuilder()).append("Running run basic actions command for URL: ").append(s).toString());
                runBasicActions(UriUtils.getQueryParameters(uri));
                return true;
            }
            if ("run-actions".equals(uri.getHost()))
            {
                Logger.info((new StringBuilder()).append("Running run actions command for URL: ").append(s).toString());
                runActions(UriUtils.getQueryParameters(uri));
                return true;
            }
            if ("android-run-action-cb".equals(uri.getHost()))
            {
                Logger.info((new StringBuilder()).append("Running run actions command with callback for URL: ").append(s).toString());
                webview = new UAJavascriptInterface(webview, richpushmessage);
                s = uri.getPathSegments();
                if (s.size() == 3)
                {
                    Logger.info((new StringBuilder()).append("Action: ").append((String)s.get(0)).append(", Args: ").append((String)s.get(1)).append(", Callback: ").append((String)s.get(2)).toString());
                    webview.actionCall((String)s.get(0), (String)s.get(1), (String)s.get(2));
                } else
                {
                    Logger.error("Unable to run action, invalid number of arguments.");
                }
                return true;
            }
            if ("close".equals(uri.getHost()))
            {
                Logger.info((new StringBuilder()).append("Running close command for URL: ").append(s).toString());
                (new UAJavascriptInterface(webview, richpushmessage)).close();
                return true;
            }
            if ("navigate-to".equals(uri.getHost()))
            {
                Logger.info((new StringBuilder()).append("Running navigate command for URL: ").append(s).toString());
                webview = new UAJavascriptInterface(webview, richpushmessage);
                if (uri.getPathSegments().size() != 1)
                {
                    Logger.error("Unable to navigate to activity, invalid number of arguments.");
                } else
                {
                    webview.navigateTo((String)uri.getPathSegments().get(0));
                }
                return true;
            }
            if ("mark-message-read".equals(uri.getHost()))
            {
                Logger.info((new StringBuilder()).append("Running mark message read command for URL: ").append(s).toString());
                (new UAJavascriptInterface(webview, richpushmessage)).markMessageRead();
                return true;
            }
            if ("mark-message-unread".equals(uri.getHost()))
            {
                Logger.info((new StringBuilder()).append("Running mark message unread command for URL: ").append(s).toString());
                (new UAJavascriptInterface(webview, richpushmessage)).markMessageUnread();
                return true;
            }
            Logger.warn((new StringBuilder()).append("Unrecognized command: ").append(uri.getHost()).append(" for URL: ").append(s).toString());
        }
        return false;
    }
}
