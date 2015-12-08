// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.b;

import android.app.Activity;
import android.content.Context;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.hcewallet.d.k;
import com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class d extends BridgeExecuteHandler
{

    Context a;

    public d(Activity activity)
    {
        super(activity);
        a = activity.getApplicationContext();
    }

    public String buildJsonForRetrieveData(boolean flag, String s, String s1)
    {
        JSONObject jsonobject;
        JSONObject jsonobject1;
        JSONObject jsonobject2;
        JSONArray jsonarray;
        JSONObject jsonobject3;
        JSONArray jsonarray1;
        JSONObject jsonobject4;
        JSONObject jsonobject5;
        jsonobject = new JSONObject();
        jsonobject1 = new JSONObject();
        jsonobject5 = new JSONObject();
        jsonobject2 = new JSONObject();
        jsonobject4 = new JSONObject();
        jsonarray = new JSONArray();
        jsonobject3 = new JSONObject();
        jsonarray1 = new JSONArray();
        if (!flag) goto _L2; else goto _L1
_L1:
        jsonobject1.put("success", true);
        jsonobject5.put("ec", "");
        jsonobject5.put("ecd", "");
        jsonobject1.put("error", jsonobject5);
        s1 = k.getCtDtFromstorage(a);
        if (s1.b() == null) goto _L4; else goto _L3
_L3:
        s = s1.b();
_L6:
        jsonobject4.put("ct", s);
        if (s1.a() == null)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        s = s1.a();
_L8:
        jsonobject4.put("dt", s);
        jsonobject2.put("tokens", jsonobject4);
        jsonobject2.put("av", "3.15");
        jsonobject2.put("os", "Android");
        jsonobject2.put("osVer", android.os.Build.VERSION.RELEASE);
        for (s = k.getAllTokenRelatedData(null).iterator(); s.hasNext(); jsonarray.put((JSONObject)s.next())) { }
          goto _L5
_L7:
        return jsonobject.toString();
_L4:
        s = "";
          goto _L6
_L5:
        try
        {
            jsonobject2.put("ptks", jsonarray);
            jsonobject3.put("network", "VISA");
            jsonobject3.put("deviceInfo", k.getDeviceInfo());
            jsonarray1.put(jsonobject3);
            jsonobject2.put("deviceDetails", jsonarray1);
            jsonobject1.put("custDet", jsonobject2);
            jsonobject.put("result", jsonobject1);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
          goto _L7
_L2:
        jsonobject1.put("success", false);
        jsonobject5.put("ec", s);
        jsonobject5.put("ecd", s1);
        jsonobject.put("result", jsonobject1);
          goto _L7
        s = "";
          goto _L8
    }

    public String calculateReturn()
    {
        if (WFApp.a() == null)
        {
            return buildJsonForRetrieveData(false, "", "");
        } else
        {
            return buildJsonForRetrieveData(true, "", "");
        }
    }

    public void executeInternal()
    {
        WFApp.a("RetrieveWalletData");
        if (!payload.getAction().equalsIgnoreCase("retrieveWalletData"));
    }
}
