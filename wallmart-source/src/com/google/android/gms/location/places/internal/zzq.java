// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.PlacePhotoMetadata;

// Referenced classes of package com.google.android.gms.location.places.internal:
//            zzt, zzp

public class zzq extends zzt
    implements PlacePhotoMetadata
{

    private final String zzaET = getString("photo_fife_url");

    public zzq(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public Object freeze()
    {
        return zzwu();
    }

    public CharSequence getAttributions()
    {
        return zzD("photo_attributions", null);
    }

    public int getMaxHeight()
    {
        return zzA("photo_max_height", 0);
    }

    public int getMaxWidth()
    {
        return zzA("photo_max_width", 0);
    }

    public PendingResult getPhoto(GoogleApiClient googleapiclient)
    {
        return getScaledPhoto(googleapiclient, getMaxWidth(), getMaxHeight());
    }

    public PendingResult getScaledPhoto(GoogleApiClient googleapiclient, int i, int j)
    {
        return zzwu().getScaledPhoto(googleapiclient, i, j);
    }

    public PlacePhotoMetadata zzwu()
    {
        return new zzp(zzaET, getMaxWidth(), getMaxHeight(), getAttributions(), zzabg);
    }
}
