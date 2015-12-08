// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.hcewallet.service.WalletIntentService;
import com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler;
import org.json.JSONException;
import org.json.JSONObject;

public class i extends BridgeExecuteHandler
{

    Context a;
    String b;
    private String c;
    private Activity d;

    public i(Activity activity)
    {
        super(activity);
        a = activity.getApplicationContext();
        d = activity;
    }

    public String calculateReturn()
    {
        return null;
    }

    public void callAcknowledgeService()
    {
        Intent intent = new Intent(d, com/wf/wellsfargomobile/hcewallet/service/WalletIntentService);
        intent.putExtra("WALLET_INTENT_SERVICE_CD", 1003);
        d.startService(intent);
    }

    public void executeInternal()
    {
        b = payload.getAction();
        if (!b.equalsIgnoreCase("updatePaymentData") || c == null || c.equals(""))
        {
            break MISSING_BLOCK_LABEL_203;
        }
        JSONObject jsonobject;
        String s;
        try
        {
            jsonobject = new JSONObject(c);
            if (jsonobject.has("request"))
            {
                com.wf.wellsfargomobile.hcewallet.d.i.parsePaymentDataJSON(jsonobject.getJSONObject("request").getJSONObject("custDet").toString(), a);
                callAcknowledgeService();
                return;
            }
        }
        catch (JSONException jsonexception)
        {
            return;
        }
        if (!jsonobject.has("results"))
        {
            break MISSING_BLOCK_LABEL_203;
        }
        jsonobject = jsonobject.getJSONObject("results");
        s = com.wf.wellsfargomobile.hcewallet.d.i.checkNullString(jsonobject.optString("success"));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        if (s.equals("true"))
        {
            WFApp.q = true;
            com.wf.wellsfargomobile.hcewallet.d.i.parsePaymentDataJSON(jsonobject.getJSONObject("custDet").toString(), a);
            callAcknowledgeService();
            return;
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        if (!s.equals("false"))
        {
            break MISSING_BLOCK_LABEL_203;
        }
        s = com.wf.wellsfargomobile.hcewallet.d.i.checkNullString(jsonobject.optString("ec"));
        com.wf.wellsfargomobile.hcewallet.d.i.checkNullString(jsonobject.optString("ecd"));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        if (s.equals("TS0003"))
        {
            WFApp.q = false;
        }
    }

    public com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler.Payload marshal(String s)
    {
        payload = super.marshal(s);
        try
        {
            s = new JSONObject(s);
            if (s.has("data"))
            {
                c = s.getJSONObject("data").toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return payload;
    }
}
