// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzip

public class zzfb
{

    private final zzip zzoL;
    private final String zzzX;

    public zzfb(zzip zzip1)
    {
        this(zzip1, "");
    }

    public zzfb(zzip zzip1, String s)
    {
        zzoL = zzip1;
        zzzX = s;
    }

    public void zza(int i, int j, int k, int l, float f, int i1)
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("width", i).put("height", j).put("maxSizeWidth", k).put("maxSizeHeight", l).put("density", f).put("rotation", i1);
            zzoL.zzb("onScreenInfoChanged", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error occured while obtaining screen information.", jsonexception);
        }
    }

    public void zzah(String s)
    {
        try
        {
            s = (new JSONObject()).put("message", s).put("action", zzzX);
            zzoL.zzb("onError", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error occurred while dispatching error event.", s);
        }
    }

    public void zzai(String s)
    {
        try
        {
            s = (new JSONObject()).put("js", s);
            zzoL.zzb("onReadyEventReceived", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error occured while dispatching ready Event.", s);
        }
    }

    public void zzaj(String s)
    {
        try
        {
            s = (new JSONObject()).put("state", s);
            zzoL.zzb("onStateChanged", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error occured while dispatching state change.", s);
        }
    }

    public void zzb(int i, int j, int k, int l)
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("x", i).put("y", j).put("width", k).put("height", l);
            zzoL.zzb("onSizeChanged", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error occured while dispatching size change.", jsonexception);
        }
    }

    public void zzc(int i, int j, int k, int l)
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("x", i).put("y", j).put("width", k).put("height", l);
            zzoL.zzb("onDefaultPositionReceived", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error occured while dispatching default position.", jsonexception);
        }
    }
}
