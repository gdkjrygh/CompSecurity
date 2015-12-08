// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzid

public class zzeu
{

    private final zzid zzoA;
    private final String zzzd;

    public zzeu(zzid zzid1)
    {
        this(zzid1, "");
    }

    public zzeu(zzid zzid1, String s)
    {
        zzoA = zzid1;
        zzzd = s;
    }

    public void zza(int i, int j, int k, int l, float f, int i1)
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("width", i).put("height", j).put("maxSizeWidth", k).put("maxSizeHeight", l).put("density", f).put("rotation", i1);
            zzoA.zzb("onScreenInfoChanged", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error occured while obtaining screen information.", jsonexception);
        }
    }

    public void zzae(String s)
    {
        try
        {
            s = (new JSONObject()).put("message", s).put("action", zzzd);
            zzoA.zzb("onError", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error occurred while dispatching error event.", s);
        }
    }

    public void zzaf(String s)
    {
        try
        {
            s = (new JSONObject()).put("js", s);
            zzoA.zzb("onReadyEventReceived", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error occured while dispatching ready Event.", s);
        }
    }

    public void zzag(String s)
    {
        try
        {
            s = (new JSONObject()).put("state", s);
            zzoA.zzb("onStateChanged", s);
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
            zzoA.zzb("onSizeChanged", jsonobject);
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
            zzoA.zzb("onDefaultPositionReceived", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzb("Error occured while dispatching default position.", jsonexception);
        }
    }
}
