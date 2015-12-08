// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.b;

import android.app.Activity;
import android.content.Context;
import com.google.gson.Gson;
import com.wf.wellsfargomobile.hcewallet.a.d;
import com.wf.wellsfargomobile.hcewallet.d.a;
import com.wf.wellsfargomobile.hcewallet.d.i;
import com.wf.wellsfargomobile.hcewallet.d.k;
import com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler;
import org.json.JSONException;
import org.json.JSONObject;

public class h extends BridgeExecuteHandler
{

    Context a;
    String b;
    boolean c;
    public String data;

    public h(Activity activity)
    {
        super(activity);
        c = true;
        a = activity.getApplicationContext();
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
        if (!c) goto _L2; else goto _L1
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
        b = payload.getAction();
        if (b != null && b.equalsIgnoreCase("updateTokens") && data != null && !data.equals(""))
        {
            Object obj = getTokenData(data);
            ((d) (obj)).c("3.15");
            obj = (new Gson()).toJson(obj);
            (new a(a)).a("updateTokens", ((String) (obj)));
            k.enableDisableAPDUService(a);
            c = true;
        }
    }

    public d getTokenData(String s)
    {
        d d1 = k.getCtDtFromstorage(a);
        try
        {
            s = (new JSONObject(s)).getJSONObject("request").getJSONObject("custDet").getJSONObject("tokens");
            if (s.has("ct"))
            {
                d1.b(i.checkNullString(s.optString("ct")));
            }
            if (s.has("dt"))
            {
                d1.a(i.checkNullString(s.optString("dt")));
            }
            if (s.has("guid"))
            {
                d1.d(i.checkNullString(s.optString("guid")));
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return d1;
        }
        return d1;
    }

    public com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler.Payload marshal(String s)
    {
        payload = super.marshal(s);
        try
        {
            s = new JSONObject(s);
            if (s.has("data"))
            {
                data = s.getJSONObject("data").toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return payload;
    }
}
