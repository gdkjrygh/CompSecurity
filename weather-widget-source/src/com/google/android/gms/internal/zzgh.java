// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.ads.internal.formats.zza;
import com.google.android.gms.ads.internal.formats.zze;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzgf, zzih, zzcj

public class zzgh
    implements zzgf.zza
{

    private final boolean zzDl;
    private final boolean zzDm;

    public zzgh(boolean flag, boolean flag1)
    {
        zzDl = flag;
        zzDm = flag1;
    }

    public com.google.android.gms.ads.internal.formats.zzh.zza zza(zzgf zzgf1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        return zzc(zzgf1, jsonobject);
    }

    public zze zzc(zzgf zzgf1, JSONObject jsonobject)
        throws JSONException, InterruptedException, ExecutionException
    {
        Object obj = zzgf1.zza(jsonobject, "images", true, zzDl, zzDm);
        zzih zzih1 = zzgf1.zza(jsonobject, "secondary_image", false, zzDl);
        zzgf1 = zzgf1.zze(jsonobject);
        ArrayList arraylist = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); arraylist.add(((zzih)((Iterator) (obj)).next()).get())) { }
        return new zze(jsonobject.getString("headline"), arraylist, jsonobject.getString("body"), (zzcj)zzih1.get(), jsonobject.getString("call_to_action"), jsonobject.getString("advertiser"), (zza)zzgf1.get(), new Bundle());
    }
}
