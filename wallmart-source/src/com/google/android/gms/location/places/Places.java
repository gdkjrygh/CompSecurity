// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.location.places.internal.zzc;
import com.google.android.gms.location.places.internal.zzi;

// Referenced classes of package com.google.android.gms.location.places:
//            GeoDataApi, PlaceDetectionApi

public class Places
{

    public static final Api GEO_DATA_API;
    public static final GeoDataApi GeoDataApi = new zzc();
    public static final Api PLACE_DETECTION_API;
    public static final PlaceDetectionApi PlaceDetectionApi = new zzi();
    public static final com.google.android.gms.common.api.Api.zzc zzaDN;
    public static final com.google.android.gms.common.api.Api.zzc zzaDO;

    private Places()
    {
    }

    static 
    {
        zzaDN = new com.google.android.gms.common.api.Api.zzc();
        zzaDO = new com.google.android.gms.common.api.Api.zzc();
        GEO_DATA_API = new Api("Places.GEO_DATA_API", new com.google.android.gms.location.places.internal.zzd.zza(null, null), zzaDN);
        PLACE_DETECTION_API = new Api("Places.PLACE_DETECTION_API", new com.google.android.gms.location.places.internal.zzj.zza(null, null), zzaDO);
    }
}
