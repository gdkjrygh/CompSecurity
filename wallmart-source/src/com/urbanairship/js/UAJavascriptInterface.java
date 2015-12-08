// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.js;

import android.os.Build;
import android.webkit.WebView;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;
import com.urbanairship.actions.ActionArguments;
import com.urbanairship.actions.ActionResult;
import com.urbanairship.actions.ActionRunner;
import com.urbanairship.actions.Situation;
import com.urbanairship.richpush.RichPushManager;
import com.urbanairship.richpush.RichPushMessage;
import com.urbanairship.richpush.RichPushUser;
import com.urbanairship.util.JSONUtils;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;

public class UAJavascriptInterface
{

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
    /* anonymous class not found */
    class _anm4 {}

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
            s = (new com.urbanairship.actions.ActionArguments.Builder()).setValue(s.get("value")).setSituation(Situation.WEB_VIEW_INVOCATION).addMetadata("com.urbanairship.RICH_PUSH_METADATA", message).create();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private void runActionCallback(String s, Object obj, String s1)
    {
        String s3 = String.format("'%s'", new Object[] {
            s1
        });
        String s2;
        if (s == null)
        {
            s = "null";
        } else
        {
            s = String.format("new Error('%s')", new Object[] {
                s
            });
        }
        s2 = "null";
        s1 = s2;
        if (obj != null)
        {
            s1 = new JSONObject();
            try
            {
                s1.put("value", obj);
                s1 = String.format("'%s'", new Object[] {
                    s1
                });
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Logger.info("Unable to encode JS result value");
                s1 = s2;
            }
        }
        s = String.format("UAirship.finishAction(%s, %s, %s);", new Object[] {
            s, s1, s3
        });
        webView.post(new _cls3(s));
    }

    public void actionCall(String s, String s1, String s2)
    {
        ActionArguments actionarguments = decodeArguments(s1);
        if (actionarguments == null)
        {
            Logger.info((new StringBuilder()).append("Invalid encoded arguments: ").append(s1).toString());
            runActionCallback("Unable to decode arguments payload", null, s2);
            return;
        } else
        {
            actionRunner.runAction(s, actionarguments, new _cls2(s, s2));
            return;
        }
    }

    public void close()
    {
        webView.post(new _cls1());
    }

    public String getDeviceModel()
    {
        return Build.MODEL;
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
        return UAirship.shared().getRichPushManager().getRichPushUser().getId();
    }




    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
