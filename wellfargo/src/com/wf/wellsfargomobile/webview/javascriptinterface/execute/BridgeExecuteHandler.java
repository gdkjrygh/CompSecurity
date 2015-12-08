// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute;

import android.app.Activity;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.webview.javascriptinterface.a.a;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface.execute:
//            BridgeExecuteHandlerException

public abstract class BridgeExecuteHandler
{

    private static final String TAG = "BridgeExecuteHandler";
    protected a bridgeCallBack;
    protected Payload payload;

    public BridgeExecuteHandler(Activity activity)
    {
        bridgeCallBack = (a)activity;
    }

    protected abstract String calculateReturn();

    public final String execute(String s)
    {
        boolean flag = false;
        payload = marshal(s);
        if (!validateNonce(payload.getNonce()))
        {
            break MISSING_BLOCK_LABEL_36;
        }
        executeInternal();
_L1:
        if (flag)
        {
            return "failed";
        } else
        {
            return calculateReturn();
        }
        try
        {
            throw new BridgeExecuteHandlerException("nonce validation failed");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("BridgeExecuteHandler", (new StringBuilder()).append("JS Bridge Handler execution failed: ").append(s.getMessage()).toString(), s);
        }
        logToJsConsole((new StringBuilder()).append("BridgeExecuteHandler:JS Bridge Handler execution failed: ").append(s.getMessage()).toString());
        flag = true;
          goto _L1
    }

    protected abstract void executeInternal();

    protected void logToJsConsole(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        s = s.replaceAll("\"", "'");
        stringbuilder.append("nativeapp.bridge.log(\"").append(s).append("\")");
        bridgeCallBack.logToJsConsole(stringbuilder.toString());
    }

    protected Payload marshal(String s)
    {
        payload = (Payload)(new GsonBuilder()).create().fromJson(s, com/wf/wellsfargomobile/webview/javascriptinterface/execute/BridgeExecuteHandler$Payload);
        return payload;
    }

    protected boolean validateNonce(String s)
    {
        return WFApp.e(s);
    }

    private class Payload
    {

        private String action;
        private Object data;
        private String nonce;
        private ResultCallBack resultCallback;

        public String getAction()
        {
            return action;
        }

        public Object getData()
        {
            return data;
        }

        public String getNonce()
        {
            return nonce;
        }

        public ResultCallBack getResultCallback()
        {
            return resultCallback;
        }

        public void setAction(String s)
        {
            action = s;
        }

        public void setData(String s)
        {
            data = s;
        }

        public void setNonce(String s)
        {
            nonce = s;
        }

        public void setResultCallback(ResultCallBack resultcallback)
        {
            resultCallback = resultcallback;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Payload{nonce='").append(nonce).append('\'').append(", action='").append(action).append('\'').append(", resultCallback='").append(resultCallback).append('\'').append(", data='").append(data).append('\'').append('}').toString();
        }

        public Payload()
        {
        }
    }

}
