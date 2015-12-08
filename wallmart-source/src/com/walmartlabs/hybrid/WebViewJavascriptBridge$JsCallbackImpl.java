// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.hybrid;

import com.walmartlabs.utils.WLog;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;

// Referenced classes of package com.walmartlabs.hybrid:
//            WebViewJavascriptBridge

private class callbackIdJs
    implements callbackIdJs
{

    private final String callbackIdJs;
    final WebViewJavascriptBridge this$0;

    public void callbackToJs(Object obj)
    {
        try
        {
            obj = WebViewJavascriptBridge.access$000(WebViewJavascriptBridge.this).writeValueAsString(new ge(callbackIdJs, obj));
            WebViewJavascriptBridge.access$100(WebViewJavascriptBridge.this, ((String) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            WLog.e(WebViewJavascriptBridge.access$200(), "Failed to convert JsCallbackMessage object to JSON string", ((Throwable) (obj)));
        }
    }

    public ge(String s)
    {
        this$0 = WebViewJavascriptBridge.this;
        super();
        callbackIdJs = s;
    }
}
