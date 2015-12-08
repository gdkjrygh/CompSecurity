// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.personalized;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.location.places.PlacesStatusCodes;

// Referenced classes of package com.google.android.gms.location.places.personalized:
//            PlaceUserData

public final class zzd extends com.google.android.gms.common.data.zzd
    implements Result
{

    private final Status zzQA;

    public zzd(DataHolder dataholder)
    {
        this(dataholder, PlacesStatusCodes.zzhg(dataholder.getStatusCode()));
    }

    private zzd(DataHolder dataholder, Status status)
    {
        super(dataholder, PlaceUserData.CREATOR);
        boolean flag;
        if (dataholder == null || dataholder.getStatusCode() == status.getStatusCode())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzZ(flag);
        zzQA = status;
    }

    public static zzd zzaT(Status status)
    {
        return new zzd(null, status);
    }

    public Status getStatus()
    {
        return zzQA;
    }
}
