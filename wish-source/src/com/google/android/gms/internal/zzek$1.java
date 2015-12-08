// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzv;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzek, zzy, zzfs, 
//            zzgd

class zzyC
    implements zzbs
{

    final zzy zzyA;
    final b zzyB;
    final zzfs zzyC;
    final zzek zzyD;

    public void zza(zzgd zzgd, Map map)
    {
        zzyA.zzb("/nativeAdPreProcess", zzyB.zzyJ);
        try
        {
            zzgd = (String)map.get("success");
            if (!TextUtils.isEmpty(zzgd))
            {
                zzyC.zzc((new JSONObject(zzgd)).getJSONArray("ads").getJSONObject(0));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (zzgd zzgd)
        {
            zzb.zzb("Malformed native JSON response.", zzgd);
        }
        zzyD.zzv(0);
        zzv.zza(zzyD.zzek(), "Unable to set the ad state error!");
        zzyC.zzc(null);
    }

    b(zzek zzek1, zzy zzy1, b b, zzfs zzfs1)
    {
        zzyD = zzek1;
        zzyA = zzy1;
        zzyB = b;
        zzyC = zzfs1;
        super();
    }
}
