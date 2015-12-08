// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.os.Parcel;

// Referenced classes of package android.support.v4.media.session:
//            ParcelableVolumeInfo

final class e
    implements android.os.Parcelable.Creator
{

    e()
    {
    }

    public ParcelableVolumeInfo a(Parcel parcel)
    {
        return new ParcelableVolumeInfo(parcel);
    }

    public ParcelableVolumeInfo[] a(int i)
    {
        return new ParcelableVolumeInfo[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
