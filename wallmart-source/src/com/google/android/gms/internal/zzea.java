// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzdz, zzef

public final class zzea
{

    public final long zzyA;
    public final String zzyB;
    public final int zzyC;
    public int zzyD;
    public int zzyE;
    public final List zzyu;
    public final long zzyv;
    public final List zzyw;
    public final List zzyx;
    public final List zzyy;
    public final String zzyz;

    public zzea(String s)
        throws JSONException
    {
        s = new JSONObject(s);
        if (zzb.zzM(2))
        {
            zzb.v((new StringBuilder()).append("Mediation Response JSON: ").append(s.toString(2)).toString());
        }
        JSONArray jsonarray = s.getJSONArray("ad_networks");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        int j = -1;
        for (int i = 0; i < jsonarray.length();)
        {
            zzdz zzdz1 = new zzdz(jsonarray.getJSONObject(i));
            arraylist.add(zzdz1);
            int k = j;
            if (j < 0)
            {
                k = j;
                if (zza(zzdz1))
                {
                    k = i;
                }
            }
            i++;
            j = k;
        }

        zzyD = j;
        zzyE = jsonarray.length();
        zzyu = Collections.unmodifiableList(arraylist);
        zzyz = s.getString("qdata");
        s = s.optJSONObject("settings");
        if (s != null)
        {
            zzyv = s.optLong("ad_network_timeout_millis", -1L);
            zzyw = zzp.zzbJ().zza(s, "click_urls");
            zzyx = zzp.zzbJ().zza(s, "imp_urls");
            zzyy = zzp.zzbJ().zza(s, "nofill_urls");
            long l = s.optLong("refresh", -1L);
            if (l > 0L)
            {
                l *= 1000L;
            } else
            {
                l = -1L;
            }
            zzyA = l;
            s = s.optJSONArray("rewards");
            if (s == null || s.length() == 0)
            {
                zzyB = null;
                zzyC = 0;
                return;
            } else
            {
                zzyB = s.getJSONObject(0).optString("rb_type");
                zzyC = s.getJSONObject(0).optInt("rb_amount");
                return;
            }
        } else
        {
            zzyv = -1L;
            zzyw = null;
            zzyx = null;
            zzyy = null;
            zzyA = -1L;
            zzyB = null;
            zzyC = 0;
            return;
        }
    }

    private boolean zza(zzdz zzdz1)
    {
        for (zzdz1 = zzdz1.zzym.iterator(); zzdz1.hasNext();)
        {
            if (((String)zzdz1.next()).equals("com.google.ads.mediation.admob.AdMobAdapter"))
            {
                return true;
            }
        }

        return false;
    }
}
