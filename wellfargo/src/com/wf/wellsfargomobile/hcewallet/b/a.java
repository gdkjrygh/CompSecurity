// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.b;

import android.app.Activity;
import android.content.Context;
import com.wf.wellsfargomobile.hcewallet.d.i;
import com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler;
import org.json.JSONException;
import org.json.JSONObject;

public class a extends BridgeExecuteHandler
{

    final String a = "CheckConnectivity";
    Context b;
    String c;

    public a(Activity activity)
    {
        super(activity);
        b = activity.getApplicationContext();
    }

    public JSONObject buildErrorJSON(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("ec", s);
        jsonobject.put("ecd", s1);
        return jsonobject;
    }

    public String calculateReturn()
    {
        JSONObject jsonobject;
        JSONObject jsonobject1;
        jsonobject = new JSONObject();
        jsonobject1 = new JSONObject();
        if (!i.isConnected(b)) goto _L2; else goto _L1
_L1:
        jsonobject1.put("success", true);
        jsonobject1.put("error", buildErrorJSON("", ""));
_L3:
        jsonobject.put("result", jsonobject1);
_L4:
        return jsonobject.toString();
_L2:
        jsonobject1.put("success", false);
        jsonobject1.put("error", buildErrorJSON("MB0002", "Device not connected to internet"));
          goto _L3
        JSONException jsonexception;
        jsonexception;
          goto _L4
    }

    public void executeInternal()
    {
        c = payload.getAction();
    }
}
