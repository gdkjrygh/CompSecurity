// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzed

public final class zzdx
{

    public final String zzxA;
    public final List zzxB;
    public final List zzxC;
    public final String zzxs;
    public final String zzxt;
    public final List zzxu;
    public final String zzxv;
    public final String zzxw;
    public final List zzxx;
    public final List zzxy;
    public final String zzxz;

    public zzdx(JSONObject jsonobject)
        throws JSONException
    {
        Object obj1 = null;
        super();
        zzxt = jsonobject.getString("id");
        Object obj = jsonobject.getJSONArray("adapters");
        ArrayList arraylist = new ArrayList(((JSONArray) (obj)).length());
        for (int i = 0; i < ((JSONArray) (obj)).length(); i++)
        {
            arraylist.add(((JSONArray) (obj)).getString(i));
        }

        zzxu = Collections.unmodifiableList(arraylist);
        zzxv = jsonobject.optString("allocation_id", null);
        zzxx = zzo.zzbG().zza(jsonobject, "clickurl");
        zzxy = zzo.zzbG().zza(jsonobject, "imp_urls");
        zzxB = zzo.zzbG().zza(jsonobject, "video_start_urls");
        zzxC = zzo.zzbG().zza(jsonobject, "video_complete_urls");
        obj = jsonobject.optJSONObject("ad");
        if (obj != null)
        {
            obj = ((JSONObject) (obj)).toString();
        } else
        {
            obj = null;
        }
        zzxs = ((String) (obj));
        obj = jsonobject.optJSONObject("data");
        if (obj != null)
        {
            jsonobject = ((JSONObject) (obj)).toString();
        } else
        {
            jsonobject = null;
        }
        zzxz = jsonobject;
        if (obj != null && !((JSONObject) (obj)).isNull("equivalent_ad_network_id"))
        {
            zzxA = ((JSONObject) (obj)).optString("equivalent_ad_network_id", zzxt);
        } else
        {
            zzxA = zzxt;
        }
        jsonobject = obj1;
        if (obj != null)
        {
            jsonobject = ((JSONObject) (obj)).optString("class_name");
        }
        zzxw = jsonobject;
    }
}
