// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.places;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.location.places.internal.zzq;

// Referenced classes of package com.google.android.gms.location.places:
//            PlacePhotoMetadata

public class PlacePhotoMetadataBuffer extends AbstractDataBuffer
{

    public PlacePhotoMetadataBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public PlacePhotoMetadata get(int i)
    {
        return new zzq(zzYX, i);
    }

    public volatile Object get(int i)
    {
        return get(i);
    }
}
