// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.query.internal;

import android.os.Parcel;

// Referenced classes of package com.google.android.gms.drive.query.internal:
//            AbstractFilter, zzh, zzf

public class FullTextSearchFilter extends AbstractFilter
{

    public static final zzh CREATOR = new zzh();
    final String mValue;
    final int zzCY;

    FullTextSearchFilter(int i, String s)
    {
        zzCY = i;
        mValue = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public Object zza(zzf zzf1)
    {
        return zzf1.zzcC(mValue);
    }

}
