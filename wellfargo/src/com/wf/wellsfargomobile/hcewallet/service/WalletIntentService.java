// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import com.wf.wellsfargomobile.WFApp;
import com.wf.wellsfargomobile.d.a;
import com.wf.wellsfargomobile.d.c;
import com.wf.wellsfargomobile.d.e;
import com.wf.wellsfargomobile.hcewallet.a.d;
import com.wf.wellsfargomobile.hcewallet.d.g;
import com.wf.wellsfargomobile.hcewallet.d.i;
import com.wf.wellsfargomobile.hcewallet.d.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WalletIntentService extends IntentService
{

    public WalletIntentService()
    {
        super("WalletIntentService");
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj = intent.getExtras();
        ((Bundle) (obj)).getInt("WALLET_INTENT_SERVICE_CD");
        JVM INSTR tableswitch 1001 1006: default 48
    //                   1001 49
    //                   1002 1304
    //                   1003 454
    //                   1004 695
    //                   1005 901
    //                   1006 1180;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        return;
_L2:
        intent = ((Bundle) (obj)).getString("WAC_SIGN_ON_KEY");
        Object obj1 = ((Bundle) (obj)).getString("WAC_VIEW_ID");
        Object obj2 = new LinkedHashMap();
        ((Map) (obj2)).put("wac", intent);
        intent = i.getCTDTVid(getApplicationContext());
        ((Map) (obj2)).put("ct", intent.b());
        ((Map) (obj2)).put("dt", intent.a());
        ((Map) (obj2)).put("vid", obj1);
        ((Map) (obj2)).put("lat", "");
        ((Map) (obj2)).put("lon", "");
        ((Map) (obj2)).put("av", "3.15");
        ((Map) (obj2)).put("os", "Android");
        ((Map) (obj2)).put("osVer", String.valueOf(android.os.Build.VERSION.RELEASE));
        obj = WFApp.o();
        intent = ((Intent) (obj));
        if (obj == null)
        {
            WFApp.d(UUID.randomUUID().toString());
            intent = WFApp.o();
        }
        ((Map) (obj2)).put("nonce", intent);
        intent = new JSONObject();
        obj = new JSONObject();
        Object obj3 = new JSONArray();
        JSONException jsonexception2;
        JSONException jsonexception3;
        try
        {
            ((JSONObject) (obj)).put("network", "VISA");
            ((JSONObject) (obj)).put("deviceInfo", k.getDeviceInfo());
            ((JSONArray) (obj3)).put(obj);
            intent.put("deviceDetails", obj3);
        }
        catch (JSONException jsonexception1) { }
        ((Map) (obj2)).put("deviceDetails", intent.toString());
        intent = new JSONObject();
        obj = new JSONArray();
        for (obj3 = k.getAllTokenRelatedData(null).iterator(); ((Iterator) (obj3)).hasNext(); ((JSONArray) (obj)).put((JSONObject)((Iterator) (obj3)).next())) { }
        try
        {
            intent.put("ptks", obj);
        }
        catch (JSONException jsonexception) { }
        ((Map) (obj2)).put("ptks", intent.toString());
        intent = (new a(c.b, i.getWalletURL(g.c, getApplicationContext()), ((Map) (obj2)), null, getApplicationContext())).b().b().toString();
        obj = new Intent("WAC_SIGN_ON_COMPLETE");
        ((Intent) (obj)).putExtra("WAC_SIGN_ON_COMPLETE_PAYLOAD", intent);
        ((Intent) (obj)).putExtra("WAC_VIEW_ID", ((String) (obj1)));
        LocalBroadcastManager.getInstance(this).sendBroadcast(((Intent) (obj)));
        return;
_L4:
        intent = new LinkedHashMap();
        obj = new JSONObject();
        obj1 = new JSONArray();
        for (obj2 = k.getAllTokenRelatedData(null).iterator(); ((Iterator) (obj2)).hasNext(); ((JSONArray) (obj1)).put((JSONObject)((Iterator) (obj2)).next())) { }
        try
        {
            ((JSONObject) (obj)).put("ptks", obj1);
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception2) { }
        intent.put("ptks", ((JSONObject) (obj)).toString());
        obj = i.getCTDTVid(getApplicationContext());
        intent.put("ct", ((d) (obj)).b());
        intent.put("dt", ((d) (obj)).a());
        intent = (new a(c.b, i.getWalletURL(g.e, getApplicationContext()), intent, null, getApplicationContext())).b().b().toString();
        try
        {
            intent = (new JSONObject(intent)).getJSONObject("result");
            obj = intent.getString("success");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return;
        }
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((String) (obj)).equalsIgnoreCase("true")) goto _L1; else goto _L8
_L8:
        if (obj == null) goto _L1; else goto _L9
_L9:
        if (!((String) (obj)).equalsIgnoreCase("false")) goto _L1; else goto _L10
_L10:
        intent = intent.getJSONObject("error");
        intent.optString("ec");
        intent.optString("ecd");
        intent.optString("ect");
        intent.optString("vid");
        return;
_L5:
        intent = new LinkedHashMap();
        obj = ((Bundle) (obj)).getString("nonce");
        obj1 = new JSONObject();
        obj2 = new JSONArray();
        for (obj3 = k.getAllTokenRelatedData(null).iterator(); ((Iterator) (obj3)).hasNext(); ((JSONArray) (obj2)).put((JSONObject)((Iterator) (obj3)).next())) { }
        try
        {
            ((JSONObject) (obj1)).put("ptks", obj2);
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception3) { }
        intent.put("ptks", ((JSONObject) (obj1)).toString());
        obj1 = i.getCTDTVid(getApplicationContext());
        intent.put("ct", ((d) (obj1)).b());
        intent.put("dt", ((d) (obj1)).a());
        intent.put("nonce", obj);
        intent = (new a(c.b, i.getWalletURL(g.f, getApplicationContext()), intent, null, getApplicationContext())).b().b().toString();
        obj = new Intent("WALLET_SIGN_OFF_COMPLETE");
        ((Intent) (obj)).putExtra("WALLET_SIGN_OFF_COMPLETE_PAYLOAD", intent);
        LocalBroadcastManager.getInstance(this).sendBroadcast(((Intent) (obj)));
        return;
_L6:
        intent = ((Bundle) (obj)).getParcelableArrayList("TOKEN_KEY_ARR");
        obj = new LinkedHashMap();
        obj1 = new JSONObject();
        obj2 = new JSONArray();
        for (obj3 = k.getAllTokenRelatedData(intent).iterator(); ((Iterator) (obj3)).hasNext(); ((JSONArray) (obj2)).put((JSONObject)((Iterator) (obj3)).next())) { }
        try
        {
            ((JSONObject) (obj1)).put("ptks", obj2);
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception3) { }
        ((Map) (obj)).put("ptks", ((JSONObject) (obj1)).toString());
        obj1 = i.getCTDTVid(getApplicationContext());
        ((Map) (obj)).put("ct", ((d) (obj1)).b());
        ((Map) (obj)).put("dt", ((d) (obj1)).a());
        if (intent != null && intent.size() > 0)
        {
            intent = i.getWalletURL(g.h, getApplicationContext());
        } else
        {
            intent = i.getWalletURL(g.g, getApplicationContext());
        }
        intent = (new a(c.b, intent, ((Map) (obj)), null, getApplicationContext())).b().b().toString();
        try
        {
            intent = (new JSONObject(intent)).getJSONObject("result");
            obj = intent.getString("success");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return;
        }
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (((String) (obj)).equalsIgnoreCase("true")) goto _L1; else goto _L11
_L11:
        if (obj == null) goto _L1; else goto _L12
_L12:
        if (!((String) (obj)).equalsIgnoreCase("false")) goto _L1; else goto _L13
_L13:
        intent = intent.getJSONObject("error");
        intent.getString("ec");
        intent.getString("ecd");
        intent.getString("ect");
        intent.getString("vid");
        return;
_L7:
        intent = new LinkedHashMap();
        obj = i.getCTDTVid(getApplicationContext());
        intent.put("ct", ((d) (obj)).b());
        intent.put("dt", ((d) (obj)).a());
        intent.put("guid", ((d) (obj)).d());
        intent = (new a(c.b, i.getWalletURL(g.j, getApplicationContext()), intent, null, getApplicationContext())).b().b().toString();
        obj = new Intent("WALLET_ACTIVE_SESSION_CHECK_COMPLETE");
        ((Intent) (obj)).putExtra("WALLET_ACTIVE_SESSION_CHECK_COMPLETE_PAYLOAD", intent);
        LocalBroadcastManager.getInstance(this).sendBroadcast(((Intent) (obj)));
        return;
_L3:
        obj1 = new LinkedHashMap();
        intent = ((Bundle) (obj)).getString("HCE_WALLET_VIEW_ID");
        obj = (new a(c.b, i.getWalletURL(g.k, getApplicationContext()), ((Map) (obj1)), null, getApplicationContext())).b().b().toString();
        obj1 = new Intent("WALLET_ACTIVE_SESSION_CHECK_COMPLETE");
        ((Intent) (obj1)).putExtra("WALLET_ACTIVE_SESSION_CHECK_COMPLETE_PAYLOAD", ((String) (obj)));
        ((Intent) (obj1)).putExtra("HCE_WALLET_VIEW_ID", intent);
        LocalBroadcastManager.getInstance(this).sendBroadcast(((Intent) (obj1)));
        return;
    }
}
