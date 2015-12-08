// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzz, zzp

public class ResolveAccountResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzz();
    final int mVersionCode;
    private boolean zzZF;
    private ConnectionResult zzaaV;
    IBinder zzacC;
    private boolean zzaen;

    public ResolveAccountResponse(int i)
    {
        this(new ConnectionResult(i, null));
    }

    ResolveAccountResponse(int i, IBinder ibinder, ConnectionResult connectionresult, boolean flag, boolean flag1)
    {
        mVersionCode = i;
        zzacC = ibinder;
        zzaaV = connectionresult;
        zzZF = flag;
        zzaen = flag1;
    }

    public ResolveAccountResponse(ConnectionResult connectionresult)
    {
        this(1, null, connectionresult, false, false);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ResolveAccountResponse))
            {
                return false;
            }
            obj = (ResolveAccountResponse)obj;
            if (!zzaaV.equals(((ResolveAccountResponse) (obj)).zzaaV) || !zzoO().equals(((ResolveAccountResponse) (obj)).zzoO()))
            {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzz.zza(this, parcel, i);
    }

    public zzp zzoO()
    {
        return zzp.zza.zzaH(zzacC);
    }

    public ConnectionResult zzoP()
    {
        return zzaaV;
    }

    public boolean zzoQ()
    {
        return zzZF;
    }

    public boolean zzoR()
    {
        return zzaen;
    }

}
