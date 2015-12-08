// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.urbanairship.Logger;
import com.urbanairship.js.UAJavascriptInterface;
import com.urbanairship.richpush.RichPushManager;
import com.urbanairship.richpush.RichPushMessage;
import com.urbanairship.richpush.RichPushUser;
import java.util.HashMap;
import org.apache.http.Header;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.impl.auth.BasicScheme;

// Referenced classes of package com.urbanairship.widget:
//            UAWebView

public class RichPushMessageWebView extends UAWebView
{

    private RichPushMessage currentMessage;

    public RichPushMessageWebView(Context context)
    {
        super(context);
    }

    public RichPushMessageWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public RichPushMessageWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public RichPushMessage getCurrentMessage()
    {
        return currentMessage;
    }

    public void loadRichPushMessage(RichPushMessage richpushmessage)
    {
        onPreLoad();
        if (richpushmessage == null)
        {
            Logger.warn("Unable to load null message into RichPushMessageWebView");
            return;
        }
        currentMessage = richpushmessage;
        loadUrbanAirshipJavascriptInterface(richpushmessage);
        Object obj = RichPushManager.shared().getRichPushUser();
        setClientAuthRequest(richpushmessage.getMessageBodyUrl(), ((RichPushUser) (obj)).getId(), ((RichPushUser) (obj)).getPassword());
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            obj = BasicScheme.authenticate(new UsernamePasswordCredentials(((RichPushUser) (obj)).getId(), ((RichPushUser) (obj)).getPassword()), "UTF-8", false);
            HashMap hashmap = new HashMap();
            hashmap.put(((Header) (obj)).getName(), ((Header) (obj)).getValue());
            loadUrl(richpushmessage.getMessageBodyUrl(), hashmap);
            return;
        } else
        {
            loadUrl(richpushmessage.getMessageBodyUrl());
            return;
        }
    }

    protected void loadUrbanAirshipJavascriptInterface(RichPushMessage richpushmessage)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            richpushmessage = new UAJavascriptInterface(this, richpushmessage);
            removeJavascriptInterface("urbanairship");
            addJavascriptInterface(richpushmessage, "urbanairship");
            removeJavascriptInterface("_UAirship");
            addJavascriptInterface(richpushmessage, "_UAirship");
        }
    }
}
