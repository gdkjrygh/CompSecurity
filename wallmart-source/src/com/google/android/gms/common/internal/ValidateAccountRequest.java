// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzad, zzp

public class ValidateAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzad();
    final int mVersionCode;
    final IBinder zzacC;
    private final Scope zzacD[];
    private final int zzaeq;
    private final Bundle zzaer;
    private final String zzaes;

    ValidateAccountRequest(int i, int j, IBinder ibinder, Scope ascope[], Bundle bundle, String s)
    {
        mVersionCode = i;
        zzaeq = j;
        zzacC = ibinder;
        zzacD = ascope;
        zzaer = bundle;
        zzaes = s;
    }

    public ValidateAccountRequest(zzp zzp1, Scope ascope[], String s, Bundle bundle)
    {
        int i = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        if (zzp1 == null)
        {
            zzp1 = null;
        } else
        {
            zzp1 = zzp1.asBinder();
        }
        this(1, i, ((IBinder) (zzp1)), ascope, bundle, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCallingPackage()
    {
        return zzaes;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzad.zza(this, parcel, i);
    }

    public int zzoS()
    {
        return zzaeq;
    }

    public Scope[] zzoT()
    {
        return zzacD;
    }

    public Bundle zzoU()
    {
        return zzaer;
    }

}
