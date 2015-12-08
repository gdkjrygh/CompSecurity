// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.hcewallet.b;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.wf.wellsfargomobile.hcewallet.d.d;
import com.wf.wellsfargomobile.locations.k;
import com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler;
import java.util.Observable;
import java.util.Observer;
import org.json.JSONException;
import org.json.JSONObject;

public class c extends BridgeExecuteHandler
    implements Observer
{

    Context a;
    String b;
    Activity c;
    boolean d;
    double e;
    double f;
    boolean g;
    private final k h;
    private String i;

    public c(Activity activity)
    {
        super(activity);
        d = false;
        g = true;
        a = activity.getApplicationContext();
        c = activity;
        h = new k(activity, 30000L);
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
        if (d) goto _L2; else goto _L1
_L1:
        jsonobject1.put("success", true);
        jsonobject1.put("error", buildErrorJSON("", ""));
_L3:
        JSONObject jsonobject2 = new JSONObject();
        jsonobject2.put("lat", e);
        jsonobject2.put("lon", f);
        JSONObject jsonobject3 = new JSONObject();
        jsonobject3.put("location", jsonobject2);
        jsonobject1.put("custDet", jsonobject3);
        jsonobject.put("result", jsonobject1);
_L4:
        return jsonobject.toString();
_L2:
label0:
        {
            jsonobject1.put("success", false);
            if (g)
            {
                break label0;
            }
            jsonobject1.put("error", buildErrorJSON("MB0003", "GPS enabled but no location available"));
        }
          goto _L3
        jsonobject1.put("error", buildErrorJSON("MB0001", "System error"));
          goto _L3
        JSONException jsonexception;
        jsonexception;
          goto _L4
    }

    public void checkLocationProviders(d d1)
    {
        if (h.a())
        {
            return;
        }
        LocationManager locationmanager = (LocationManager)c.getSystemService("location");
        Boolean boolean1 = Boolean.valueOf(locationmanager.isProviderEnabled("gps"));
        if (!Boolean.valueOf(locationmanager.isProviderEnabled("network")).booleanValue() && !boolean1.booleanValue() || !boolean1.booleanValue() && d1 == d.d)
        {
            g = false;
            d = true;
            return;
        } else
        {
            h.b();
            h.addObserver(this);
            return;
        }
    }

    public void executeInternal()
    {
        b = payload.getAction();
        if (b == null || !b.equalsIgnoreCase("retrieveLocation") || i == null || i.equals(""))
        {
            break MISSING_BLOCK_LABEL_77;
        }
        checkLocationProviders(com.wf.wellsfargomobile.hcewallet.d.d.valueOf((new JSONObject(i)).getJSONObject("request").optString("pression")));
        return;
        JSONException jsonexception;
        jsonexception;
    }

    public com.wf.wellsfargomobile.webview.javascriptinterface.execute.BridgeExecuteHandler.Payload marshal(String s)
    {
        payload = super.marshal(s);
        try
        {
            s = new JSONObject(s);
            if (s.has("data"))
            {
                i = s.getJSONObject("data").toString();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return payload;
    }

    public void update(Observable observable, Object obj)
    {
        if (!(obj instanceof Location))
        {
            break MISSING_BLOCK_LABEL_50;
        }
        d = false;
        observable = (Location)obj;
        e = observable.getLatitude();
        f = observable.getLongitude();
        if (h.a())
        {
            h.c();
        }
        return;
        observable;
        if (h.a())
        {
            h.c();
        }
        throw observable;
    }
}
