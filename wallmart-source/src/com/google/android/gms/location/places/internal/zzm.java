// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import android.content.Context;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.Place;
import com.google.android.gms.location.places.PlaceLikelihood;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzt, zzr, PlaceImpl, PlaceLikelihoodEntity

public class zzm extends zzt
    implements PlaceLikelihood
{

    private final Context mContext;

    public zzm(DataHolder dataholder, int i, Context context)
    {
        super(dataholder, i);
        mContext = context;
    }

    public Object freeze()
    {
        return zzwt();
    }

    public float getLikelihood()
    {
        return zzb("place_likelihood", -1F);
    }

    public Place getPlace()
    {
        return new zzr(zzYX, zzabg, mContext);
    }

    public PlaceLikelihood zzwt()
    {
        return PlaceLikelihoodEntity.zza((PlaceImpl)getPlace().freeze(), getLikelihood());
    }
}
