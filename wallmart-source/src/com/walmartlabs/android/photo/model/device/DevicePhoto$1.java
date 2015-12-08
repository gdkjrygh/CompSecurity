// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.model.device;

import android.os.Parcel;

// Referenced classes of package com.walmartlabs.android.photo.model.device:
//            DevicePhoto

static final class 
    implements android.os.ator
{

    public DevicePhoto createFromParcel(Parcel parcel)
    {
        return new DevicePhoto(parcel, null);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public DevicePhoto[] newArray(int i)
    {
        return new DevicePhoto[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
