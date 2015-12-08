// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzkx;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.wallet.wobs:
//            zzc

public final class LabelValueRow
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    private final int zzCY;
    String zzaSx;
    String zzaSy;
    ArrayList zzaSz;

    LabelValueRow()
    {
        zzCY = 1;
        zzaSz = zzkx.zzoP();
    }

    LabelValueRow(int i, String s, String s1, ArrayList arraylist)
    {
        zzCY = i;
        zzaSx = s;
        zzaSy = s1;
        zzaSz = arraylist;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

}
