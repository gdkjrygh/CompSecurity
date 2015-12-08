// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.webview.javascriptinterface.execute:
//            BridgeExecuteHandler, BridgeExecuteHandlerException

public class C4cMakeCallHandler extends BridgeExecuteHandler
{

    private static final String TAG = "C4cMakeCallHandler";
    private CallData callData;
    private boolean executeFailed;

    public C4cMakeCallHandler(Activity activity)
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
            return "";
        }
    }

    protected void executeInternal()
    {
        if (callData == null)
        {
            executeFailed = true;
            throw new BridgeExecuteHandlerException("callData ==  null");
        }
        if (callData.getPhoneNumber() == null)
        {
            executeFailed = true;
            throw new BridgeExecuteHandlerException("callData.getPhoneNumber() ==  null");
        }
        if (callData.getDtmf() == null)
        {
            executeFailed = true;
            throw new BridgeExecuteHandlerException("callData.getDtmf() == null");
        } else
        {
            Intent intent = new Intent("android.intent.action.CALL");
            intent.setData(Uri.parse((new StringBuilder()).append("tel:").append(callData.getPhoneNumber()).append(",,").append(callData.getDtmf()).toString()));
            intent.setFlags(0x10000000);
            WFApp.g.startActivity(intent);
            return;
        }
    }

    protected BridgeExecuteHandler.Payload marshal(String s)
    {
        s = super.marshal(s);
        callData = (CallData)(new GsonBuilder()).create().fromJson(s.getData().toString(), com/wf/wellsfargomobile/webview/javascriptinterface/execute/C4cMakeCallHandler$CallData);
        return s;
    }

    private class CallData
    {

        private String dtmf;
        private String phoneNumber;

        public String getDtmf()
        {
            return dtmf;
        }

        public String getPhoneNumber()
        {
            return phoneNumber;
        }

        public void setDtmf(String s)
        {
            dtmf = s;
        }

        public void setPhoneNumber(String s)
        {
            phoneNumber = s;
        }

        public String toString()
        {
            return (new StringBuilder()).append("CallData{phoneNumber='").append(phoneNumber).append('\'').append(", dtmf='").append(dtmf).append('\'').append('}').toString();
        }

        public CallData()
        {
        }
    }

}
