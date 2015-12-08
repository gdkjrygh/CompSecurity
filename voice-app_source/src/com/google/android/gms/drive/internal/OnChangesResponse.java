// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.ChangeSequenceNumber;
import com.google.android.gms.drive.WriteAwareParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.drive.internal:
//            zzat

public class OnChangesResponse extends WriteAwareParcelable
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzat();
    final int zzCY;
    final DataHolder zzaga;
    final List zzagb;
    final ChangeSequenceNumber zzagc;
    final boolean zzagd;

    OnChangesResponse(int i, DataHolder dataholder, List list, ChangeSequenceNumber changesequencenumber, boolean flag)
    {
        zzCY = i;
        zzaga = dataholder;
        zzagb = list;
        zzagc = changesequencenumber;
        zzagd = flag;
    }

    public int describeContents()
    {
        return 0;
    }

    protected void zzI(Parcel parcel, int i)
    {
        zzat.zza(this, parcel, i | 1);
    }

}
