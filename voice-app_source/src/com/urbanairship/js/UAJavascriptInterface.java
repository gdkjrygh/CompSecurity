// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.js;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.actions.ActionArguments;
import com.urbanairship.actions.ActionCompletionCallback;
import com.urbanairship.actions.ActionResult;
import com.urbanairship.actions.ActionRunner;
import com.urbanairship.actions.Situation;
import com.urbanairship.richpush.RichPushManager;
import com.urbanairship.richpush.RichPushMessage;
import com.urbanairship.richpush.RichPushUser;
import com.urbanairship.util.JSONUtils;
import com.urbanairship.util.UAStringUtil;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

public class UAJavascriptInterface
{

    public static final String DEPRECATED_JAVASCRIPT_IDENTIFIER = "urbanairship";
    public static final String JAVASCRIPT_IDENTIFIER = "_UAirship";
    private static SimpleDateFormat dateFormatter;
    private final ActionRunner actionRunner;
    private final RichPushMessage message;
    private final WebView webView;

    public UAJavascriptInterface(WebView webview)
    {
        this(webview, ActionRunner.shared(), null);
    }

    UAJavascriptInterface(WebView webview, ActionRunner actionrunner, RichPushMessage richpushmessage)
    {
        webView = webview;
        actionRunner = actionrunner;
        message = richpushmessage;
    }

    public UAJavascriptInterface(WebView webview, RichPushMessage richpushmessage)
    {
        this(webview, ActionRunner.shared(), richpushmessage);
    }

    private String createErrorMessageFromResult(String s, ActionResult actionresult)
    {
        static class _cls4
        {

            static final int $SwitchMap$com$urbanairship$actions$ActionResult$Status[];

            static 
            {
                $SwitchMap$com$urbanairship$actions$ActionResult$Status = new int[com.urbanairship.actions.ActionResult.Status.values().length];
                try
                {
                    $SwitchMap$com$urbanairship$actions$ActionResult$Status[com.urbanairship.actions.ActionResult.Status.ACTION_NOT_FOUND.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$urbanairship$actions$ActionResult$Status[com.urbanairship.actions.ActionResult.Status.REJECTED_ARGUMENTS.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$urbanairship$actions$ActionResult$Status[com.urbanairship.actions.ActionResult.Status.EXECUTION_ERROR.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4..SwitchMap.com.urbanairship.actions.ActionResult.Status[actionresult.getStatus().ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return String.format("Action %s not found", new Object[] {
                s
            });

        case 2: // '\002'
            return String.format("Action %s rejected its arguments", new Object[] {
                s
            });

        case 3: // '\003'
            break;
        }
        if (actionresult.getException() != null)
        {
            return actionresult.getException().getMessage();
        } else
        {
            return String.format("Action %s failed with unspecified error", new Object[] {
                s
            });
        }
    }

    private ActionArguments decodeArguments(String s)
    {
        try
        {
            s = JSONUtils.convertToMap(new JSONObject(s));
            s = new ActionArguments(Situation.WEB_VIEW_INVOCATION, s.get("value"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private void runActionCallback(final String finishAction, Object obj, String s)
    {
        String s2 = String.format("'%s'", new Object[] {
            s
        });
        String s1;
        if (finishAction == null)
        {
            finishAction = "null";
        } else
        {
            finishAction = String.format("new Error('%s')", new Object[] {
                finishAction
            });
        }
        s1 = "null";
        s = s1;
        if (obj != null)
        {
            s = new JSONObject();
            try
            {
                s.put("value", obj);
                s = String.format("'%s'", new Object[] {
                    s
                });
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logger.info("Unable to encode JS result value");
                s = s1;
            }
        }
        finishAction = String.format("UAirship.finishAction(%s, %s, %s);", new Object[] {
            finishAction, s, s2
        });
        webView.post(new Runnable() {

            final UAJavascriptInterface this$0;
            final String val$finishAction;

            public void run()
            {
                if (android.os.Build.VERSION.SDK_INT >= 19)
                {
                    webView.evaluateJavascript(finishAction, null);
                    return;
                } else
                {
                    webView.loadUrl((new StringBuilder()).append("javascript:").append(finishAction).toString());
                    return;
                }
            }

            
            {
                this$0 = UAJavascriptInterface.this;
                finishAction = s;
                super();
            }
        });
    }

    public void actionCall(final String name, String s, final String callbackKey)
    {
        ActionArguments actionarguments = decodeArguments(s);
        if (actionarguments == null)
        {
            Logger.info((new StringBuilder()).append("Invalid encoded arguments: ").append(s).toString());
            runActionCallback("Unable to decode arguments payload", null, callbackKey);
            return;
        } else
        {
            actionRunner.runAction(name, actionarguments, new ActionCompletionCallback() {

                final UAJavascriptInterface this$0;
                final String val$callbackKey;
                final String val$name;

                public void onFinish(ActionResult actionresult)
                {
                    String s1 = createErrorMessageFromResult(name, actionresult);
                    runActionCallback(s1, actionresult.getValue(), callbackKey);
                }

            
            {
                this$0 = UAJavascriptInterface.this;
                name = s;
                callbackKey = s1;
                super();
            }
            });
            return;
        }
    }

    public void close()
    {
        webView.post(new Runnable() {

            final UAJavascriptInterface this$0;

            public void run()
            {
                webView.getRootView().dispatchKeyEvent(new KeyEvent(0, 4));
                webView.getRootView().dispatchKeyEvent(new KeyEvent(1, 4));
            }

            
            {
                this$0 = UAJavascriptInterface.this;
                super();
            }
        });
    }

    public String getDeviceModel()
    {
        return Build.MODEL;
    }

    public String getDeviceOrientation()
    {
        switch (webView.getResources().getConfiguration().orientation)
        {
        default:
            return "undefined";

        case 2: // '\002'
            return "landscape";

        case 1: // '\001'
            return "portrait";
        }
    }

    public String getMessageId()
    {
        if (message != null)
        {
            return message.getMessageId();
        } else
        {
            return null;
        }
    }

    public String getMessageSentDate()
    {
        if (message == null)
        {
            return null;
        }
        if (dateFormatter == null)
        {
            dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.US);
            dateFormatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        return dateFormatter.format(message.getSentDate());
    }

    public long getMessageSentDateMS()
    {
        if (message != null)
        {
            return message.getSentDateMS();
        } else
        {
            return -1L;
        }
    }

    public String getMessageTitle()
    {
        if (message != null)
        {
            return message.getTitle();
        } else
        {
            return null;
        }
    }

    public String getUserId()
    {
        return RichPushManager.shared().getRichPushUser().getId();
    }

    public int getViewHeight()
    {
        return webView.getHeight();
    }

    public int getViewWidth()
    {
        return webView.getWidth();
    }

    public boolean isMessageRead()
    {
        return message != null && message.isRead();
    }

    public void markMessageRead()
    {
        if (message != null)
        {
            message.markRead();
        }
    }

    public void markMessageUnread()
    {
        if (message != null)
        {
            message.markUnread();
        }
    }

    public void navigateTo(String s)
    {
        if (UAStringUtil.isEmpty(s))
        {
            return;
        }
        Intent intent;
        try
        {
            intent = new Intent(UAirship.shared().getApplicationContext(), Class.forName(s));
            intent.addFlags(0x4000000);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            Logger.error((new StringBuilder()).append("No class found for name ").append(s).toString());
            return;
        }
        try
        {
            webView.getContext().startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.error("Activity not found", s);
        }
    }



}
