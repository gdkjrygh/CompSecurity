// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            VmapAdBreak, VastAd, AdPair

final class a
    implements android.os.Parcelable.Creator
{

    a()
    {
    }

    public final Object createFromParcel(Parcel parcel)
    {
        VmapAdBreak vmapadbreak = (VmapAdBreak)parcel.readParcelable(com/google/android/apps/youtube/datalib/legacy/model/VmapAdBreak.getClassLoader());
        parcel = (VastAd)parcel.readParcelable(com/google/android/apps/youtube/datalib/legacy/model/VastAd.getClassLoader());
        if (vmapadbreak == null && parcel == null)
        {
            return null;
        } else
        {
            return new AdPair(vmapadbreak, parcel);
        }
    }

    public final volatile Object[] newArray(int i)
    {
        return new AdPair[i];
    }
}
