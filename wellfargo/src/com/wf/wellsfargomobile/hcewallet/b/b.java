// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.b;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.wf.wellsfargomobile.hcewallet.d.i;
import com.wf.wellsfargomobile.hcewallet.service.HCEWalletHostApduService;
import com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler;
import org.json.JSONException;
import org.json.JSONObject;

public class b extends BridgeExecuteHandler
{

    public static boolean NFC_OFF = false;
    Context a;
    String b;
    private String c;
    private Activity d;

    public b(Activity activity)
    {
        super(activity);
        c = "";
        d = activity;
        a = activity.getApplicationContext();
    }

    public static String buildJson(boolean flag, String s, String s1)
    {
        JSONObject jsonobject;
        JSONObject jsonobject1;
        JSONObject jsonobject2;
        jsonobject1 = new JSONObject();
        jsonobject = new JSONObject();
        jsonobject2 = new JSONObject();
        if (!flag) goto _L2; else goto _L1
_L1:
        jsonobject2.put("success", true);
        jsonobject1.put("ec", "");
        jsonobject1.put("ecd", "");
_L3:
        jsonobject2.put("error", jsonobject1);
        jsonobject.put("result", jsonobject2);
_L4:
        return jsonobject.toString();
_L2:
        jsonobject2.put("success", false);
        jsonobject1.put("ec", s);
        jsonobject1.put("ecd", s1);
          goto _L3
        s;
          goto _L4
    }

    public String calculateReturn()
    {
        if (b != null && b.equalsIgnoreCase("CHECK_STATUS"))
        {
            if (!i.isNfcEnabled(a) && !i.isDefaultPaymentApp(a))
            {
                return buildJson(false, "MB0006", "NFC not enabled and WFWallet not default HCE WFWALLET");
            }
            if (!i.isNfcEnabled(a))
            {
                return buildJson(false, "MB0004", "NFC not enabled");
            }
            if (!i.isDefaultPaymentApp(a))
            {
                return buildJson(false, "MB0005", "WFWallet not default HCE WFWALLET");
            } else
            {
                return buildJson(true, "", "");
            }
        } else
        {
            return null;
        }
    }

    public void executeInternal()
    {
        b = payload.getAction();
        if (b.equalsIgnoreCase("defaultWalletWithHce") && c != null)
        {
            parseJSONString(c);
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

    public void parseJSONString(String s)
    {
        try
        {
            b = (new JSONObject(s)).getJSONObject("request").getString("action");
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        if (b != null && b.equalsIgnoreCase("MAKE_DEFAULT"))
        {
            i.navigateToNFCSettings(a);
            NFC_OFF = true;
        } else
        if (b != null && b.equalsIgnoreCase("MAKE_DEFAULT_WITH_MESSAGE"))
        {
            s = new Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
            s.putExtra("category", "payment");
            s.putExtra("component", new ComponentName(a, com/wf/wellsfargomobile/hcewallet/service/HCEWalletHostApduService.getCanonicalName()));
            d.startActivityForResult(s, 10001);
            return;
        }
    }

}
