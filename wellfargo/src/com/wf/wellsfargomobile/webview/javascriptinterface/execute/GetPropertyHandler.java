// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute;

import android.app.Activity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wf.wellsfargomobile.util.v;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface.execute:
//            BridgeExecuteHandler, BridgeExecuteHandlerException

public class GetPropertyHandler extends BridgeExecuteHandler
{

    private static final String TAG = "GetPropertyHandler";
    private boolean executeFailed;
    private String prefKey;
    private String value;

    public GetPropertyHandler(Activity activity)
    {
        super(activity);
        executeFailed = false;
    }

    protected String calculateReturn()
    {
        if (executeFailed)
        {
            return "failed";
        } else
        {
            return (new StringBuilder()).append("{\"key\":\"").append(prefKey).append("\",").append("\"value\":\"").append(value).append("\"}").toString();
        }
    }

    protected void executeInternal()
    {
        KeyData keydata = (KeyData)(new GsonBuilder()).create().fromJson(payload.getData().toString(), com/wf/wellsfargomobile/webview/javascriptinterface/execute/GetPropertyHandler$KeyData);
        if (keydata == null)
        {
            executeFailed = true;
            throw new BridgeExecuteHandlerException("keyData ==  null");
        }
        if (keydata.getKey() == null)
        {
            executeFailed = true;
            throw new BridgeExecuteHandlerException("keyData.getKey() ==  null");
        } else
        {
            prefKey = keydata.getKey();
            value = v.c(prefKey);
            return;
        }
    }

    private class KeyData
    {

        private String key;

        public String getKey()
        {
            return key;
        }

        public void setKey(String s)
        {
            key = s;
        }

        public String toString()
        {
            return (new StringBuilder()).append("KeyData{key='").append(key).append('\'').append('}').toString();
        }

        public KeyData()
        {
        }
    }

}
