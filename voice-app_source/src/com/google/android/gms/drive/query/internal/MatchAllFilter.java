// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, zzl, zzf

public class MatchAllFilter extends AbstractFilter
{

    public static final zzl CREATOR = new zzl();
    final int zzCY;

    public MatchAllFilter()
    {
        this(1);
    }

    MatchAllFilter(int i)
    {
        zzCY = i;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzl.zza(this, parcel, i);
    }

    public Object zza(zzf zzf1)
    {
        return zzf1.zzqf();
    }

}
