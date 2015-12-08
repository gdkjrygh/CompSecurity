// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.common.fromguava.b;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.datalib.legacy.model:
//            a, VmapAdBreak, VastAd

public class AdPair
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final VastAd ad;
    private final VmapAdBreak adBreak;

    public AdPair(VmapAdBreak vmapadbreak, VastAd vastad)
    {
        adBreak = (VmapAdBreak)c.a(vmapadbreak);
        ad = vastad;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && getClass().equals(obj.getClass()))
        {
            obj = (AdPair)obj;
            if (b.a(adBreak, ((AdPair) (obj)).adBreak) && b.a(ad, ((AdPair) (obj)).ad))
            {
                return true;
            }
        }
        return false;
    }

    public VastAd getAd()
    {
        return ad;
    }

    public VmapAdBreak getAdBreak()
    {
        return adBreak;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(adBreak, 0);
        parcel.writeParcelable(ad, 0);
    }

}
