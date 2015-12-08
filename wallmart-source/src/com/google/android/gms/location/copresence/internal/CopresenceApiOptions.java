// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.copresence.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.location.copresence.internal:
//            zza

public final class CopresenceApiOptions
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    public static final CopresenceApiOptions zzaCp = new CopresenceApiOptions(true, null);
    final int mVersionCode;
    public final boolean zzaCq;
    public final String zzaCr;

    CopresenceApiOptions(int i, boolean flag, String s)
    {
        mVersionCode = i;
        zzaCq = flag;
        zzaCr = s;
    }

    public CopresenceApiOptions(boolean flag, String s)
    {
        this(1, flag, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

}
