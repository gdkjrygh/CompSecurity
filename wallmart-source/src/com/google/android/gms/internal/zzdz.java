// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzef

public final class zzdz
{

    public final String zzyk;
    public final String zzyl;
    public final List zzym;
    public final String zzyn;
    public final String zzyo;
    public final List zzyp;
    public final List zzyq;
    public final String zzyr;
    public final List zzys;
    public final List zzyt;

    public zzdz(JSONObject jsonobject)
        throws JSONException
    {
        Object obj1 = null;
        super();
        zzyl = jsonobject.getString("id");
        Object obj = jsonobject.getJSONArray("adapters");
        ArrayList arraylist = new ArrayList(((JSONArray) (obj)).length());
        for (int i = 0; i < ((JSONArray) (obj)).length(); i++)
        {
            arraylist.add(((JSONArray) (obj)).getString(i));
        }

        zzym = Collections.unmodifiableList(arraylist);
        zzyn = jsonobject.optString("allocation_id", null);
        zzyp = zzp.zzbJ().zza(jsonobject, "clickurl");
        zzyq = zzp.zzbJ().zza(jsonobject, "imp_urls");
        zzys = zzp.zzbJ().zza(jsonobject, "video_start_urls");
        zzyt = zzp.zzbJ().zza(jsonobject, "video_complete_urls");
        obj = jsonobject.optJSONObject("ad");
        if (obj != null)
        {
            obj = ((JSONObject) (obj)).toString();
        } else
        {
            obj = null;
        }
        zzyk = ((String) (obj));
        obj = jsonobject.optJSONObject("data");
        if (obj != null)
        {
            jsonobject = ((JSONObject) (obj)).toString();
        } else
        {
            jsonobject = null;
        }
        zzyr = jsonobject;
        jsonobject = obj1;
        if (obj != null)
        {
            jsonobject = ((JSONObject) (obj)).optString("class_name");
        }
        zzyo = jsonobject;
    }
}
