// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzx;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzgf, zzbb, zzie, 
//            zzip

class zzDa
    implements zzdg
{

    final zzbb zzCY;
    final b zzCZ;
    final zzie zzDa;
    final zzgf zzDb;

    public void zza(zzip zzip, Map map)
    {
        zzCY.zzb("/nativeAdPreProcess", zzCZ.zzDk);
        try
        {
            zzip = (String)map.get("success");
            if (!TextUtils.isEmpty(zzip))
            {
                zzDa.zzf((new JSONObject(zzip)).getJSONArray("ads").getJSONObject(0));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (zzip zzip)
        {
            zzb.zzb("Malformed native JSON response.", zzip);
        }
        zzDb.zzB(0);
        zzx.zza(zzDb.zzft(), "Unable to set the ad state error!");
        zzDa.zzf(null);
    }

    b(zzgf zzgf1, zzbb zzbb1, b b, zzie zzie1)
    {
        zzDb = zzgf1;
        zzCY = zzbb1;
        zzCZ = b;
        zzDa = zzie1;
        super();
    }
}
