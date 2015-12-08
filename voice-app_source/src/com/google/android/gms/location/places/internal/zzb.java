// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.AutocompletePrediction;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzt, AutocompletePredictionEntity

public class zzb extends zzt
    implements AutocompletePrediction
{

    public zzb(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public Object freeze()
    {
        return zzuL();
    }

    public String getDescription()
    {
        return zzB("ap_description", "");
    }

    public List getMatchedSubstrings()
    {
        return zza("ap_matched_subscriptions", AutocompletePredictionEntity.SubstringEntity.CREATOR, Collections.emptyList());
    }

    public String getPlaceId()
    {
        return zzB("ap_place_id", null);
    }

    public List getPlaceTypes()
    {
        return zza("ap_place_types", Collections.emptyList());
    }

    public AutocompletePrediction zzuL()
    {
        return AutocompletePredictionEntity.zza(getDescription(), getPlaceId(), getPlaceTypes(), getMatchedSubstrings(), zzuM());
    }

    public int zzuM()
    {
        return zzz("ap_personalization_type", 6);
    }
}
