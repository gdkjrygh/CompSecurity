// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.zzr;

// Referenced classes of package com.google.android.gms.location.places:
//            PlacesStatusCodes, Place

public class PlaceBuffer extends AbstractDataBuffer
    implements Result
{

    private final Context mContext;
    private final Status zzQA;
    private final String zzaDy;

    public PlaceBuffer(DataHolder dataholder, Context context)
    {
        super(dataholder);
        mContext = context;
        zzQA = PlacesStatusCodes.zzhg(dataholder.getStatusCode());
        if (dataholder != null && dataholder.zznP() != null)
        {
            zzaDy = dataholder.zznP().getString("com.google.android.gms.location.places.PlaceBuffer.ATTRIBUTIONS_EXTRA_KEY");
            return;
        } else
        {
            zzaDy = null;
            return;
        }
    }

    public Place get(int i)
    {
        return new zzr(zzYX, i, mContext);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }

    public CharSequence getAttributions()
    {
        return zzaDy;
    }

    public Status getStatus()
    {
        return zzQA;
    }
}
