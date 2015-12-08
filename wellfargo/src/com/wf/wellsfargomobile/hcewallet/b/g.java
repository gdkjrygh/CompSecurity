// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.b;

import android.app.Activity;
import android.content.Context;
import com.google.gson.Gson;
import com.wf.wellsfargomobile.hcewallet.a.e;
import com.wf.wellsfargomobile.hcewallet.d.a;
import com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler;
import org.json.JSONException;
import org.json.JSONObject;

public class g extends BridgeExecuteHandler
{

    Context a;
    private String b;

    public g(Activity activity)
    {
        super(activity);
        a = activity.getApplicationContext();
    }

    public String calculateReturn()
    {
        return null;
    }

    public void executeInternal()
    {
        if (payload.getAction().equalsIgnoreCase("wfWalletConnectData") && b != null && !b.equals(""))
        {
            e e1 = getWalletUrls(b);
            (new a(a)).a("wfWalletConnectData", (new Gson()).toJson(e1));
        }
    }

    public e getWalletUrls(String s)
    {
        String s1 = "";
        e e1 = new e();
        if (s == null || s.equals(""))
        {
            break MISSING_BLOCK_LABEL_577;
        }
        JSONObject jsonobject;
        try
        {
            jsonobject = (new JSONObject(s)).getJSONObject("request");
            if (jsonobject.has("protocol"))
            {
                s1 = (new StringBuilder()).append("").append(jsonobject.getString("protocol")).append("//").toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return e1;
        }
        s = s1;
        if (jsonobject.has("host"))
        {
            s = (new StringBuilder()).append(s1).append(jsonobject.getString("host")).toString();
        }
        s1 = s;
        if (jsonobject.has("port"))
        {
            s1 = (new StringBuilder()).append(s).append(":").append(jsonobject.getString("port")).toString();
        }
        if (jsonobject.has("showView"))
        {
            e1.b((new StringBuilder()).append(s1).append(jsonobject.getString("showView")).toString());
        }
        if (jsonobject.has("showSecureView"))
        {
            e1.c((new StringBuilder()).append(s1).append(jsonobject.getString("showSecureView")).toString());
        }
        if (jsonobject.has("wacAuthPayNow"))
        {
            e1.d((new StringBuilder()).append(s1).append(jsonobject.getString("wacAuthPayNow")).toString());
        }
        if (jsonobject.has("wacAuthWalletHome"))
        {
            e1.e((new StringBuilder()).append(s1).append(jsonobject.getString("wacAuthWalletHome")).toString());
        }
        if (jsonobject.has("ackDataStorage"))
        {
            e1.f((new StringBuilder()).append(s1).append(jsonobject.getString("ackDataStorage")).toString());
        }
        if (jsonobject.has("signOut"))
        {
            e1.a((new StringBuilder()).append(s1).append(jsonobject.getString("signOut")).toString());
        }
        if (jsonobject.has("updateTvl"))
        {
            e1.g((new StringBuilder()).append(s1).append(jsonobject.getString("updateTvl")).toString());
        }
        if (jsonobject.has("updateTvlAsync"))
        {
            e1.h((new StringBuilder()).append(s1).append(jsonobject.getString("updateTvlAsync")).toString());
        }
        if (jsonobject.has("updateTvlSecure"))
        {
            e1.i((new StringBuilder()).append(s1).append(jsonobject.getString("updateTvlSecure")).toString());
        }
        if (jsonobject.has("isValidSession"))
        {
            e1.j((new StringBuilder()).append(s1).append(jsonobject.getString("isValidSession")).toString());
        }
        if (jsonobject.has("activeSession"))
        {
            e1.k((new StringBuilder()).append(s1).append(jsonobject.getString("activeSession")).toString());
        }
        return e1;
    }

    public com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler.Payload marshal(String s)
    {
        payload = super.marshal(s);
        try
        {
            s = new JSONObject(s);
            if (s.has("data"))
            {
                b = s.getJSONObject("data").toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return payload;
    }
}
