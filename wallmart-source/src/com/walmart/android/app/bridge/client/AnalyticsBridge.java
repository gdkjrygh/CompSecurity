// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge.client;

import android.os.Handler;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;
import com.walmartlabs.anivia.AniviaEventAsJson;
import com.walmartlabs.utils.WLog;
import io.theholygrail.jsbridge.JSWebView;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;

public class AnalyticsBridge
{

    public static final String NAMESPACE = "analytics";
    private static final String TAG = com/walmart/android/app/bridge/client/AnalyticsBridge.getSimpleName();
    Handler mHandler;
    ObjectMapper mObjectMapper;
    JSWebView mWebView;

    public AnalyticsBridge(JSWebView jswebview)
    {
        mWebView = jswebview;
        mObjectMapper = new ObjectMapper();
        mHandler = new Handler();
    }

    public void sendEvent(final String aniviaEventAsJson)
    {
        Object obj;
        WLog.d(TAG, (new StringBuilder()).append("sendEvent(): ").append(aniviaEventAsJson).toString());
        obj = null;
        Object obj1;
        obj1 = (ObjectNode)mObjectMapper.readTree(aniviaEventAsJson);
        ((ObjectNode) (obj1)).put("ets", System.currentTimeMillis());
        obj1 = mObjectMapper.writeValueAsString(obj1);
        aniviaEventAsJson = ((String) (obj1));
_L1:
        IOException ioexception;
        if (aniviaEventAsJson != null)
        {
            aniviaEventAsJson = new AniviaEventAsJson(aniviaEventAsJson);
        } else
        {
            aniviaEventAsJson = null;
        }
        mHandler.post(new Runnable() {

            final AnalyticsBridge this$0;
            final AniviaEventAsJson val$aniviaEventAsJson;

            public void run()
            {
                if (aniviaEventAsJson != null)
                {
                    MessageBus.getBus().post(aniviaEventAsJson);
                }
            }

            
            {
                this$0 = AnalyticsBridge.this;
                aniviaEventAsJson = aniviaeventasjson;
                super();
            }
        });
        return;
        ioexception;
        WLog.w(TAG, (new StringBuilder()).append("Could not create anivia event from input: ").append(aniviaEventAsJson).toString());
        aniviaEventAsJson = obj;
          goto _L1
    }

}
