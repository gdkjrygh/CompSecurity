// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, zzo, zzf

public class OwnedByMeFilter extends AbstractFilter
{

    public static final zzo CREATOR = new zzo();
    final int zzCY;

    public OwnedByMeFilter()
    {
        this(1);
    }

    OwnedByMeFilter(int i)
    {
        zzCY = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzo.zza(this, parcel, i);
    }

    public Object zza(zzf zzf1)
    {
        return zzf1.zzqe();
    }

}
