// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.wallet.firstparty:
//            zze

public final class GetInstrumentsResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    String zzaJD[];
    byte zzaJE[][];
    private final int zzzH;

    GetInstrumentsResponse()
    {
        this(1, new String[0], new byte[0][]);
    }

    GetInstrumentsResponse(int i, String as[], byte abyte0[][])
    {
        zzzH = i;
        zzaJD = as;
        zzaJE = abyte0;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getVersionCode()
    {
        return zzzH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

}
