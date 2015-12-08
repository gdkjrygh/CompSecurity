// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzw, IAccountAccessor

public class ResolveAccountResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzw();
    final int zzCY;
    private boolean zzWY;
    private ConnectionResult zzYh;
    IBinder zzZO;
    private boolean zzabd;

    public ResolveAccountResponse(int i)
    {
        this(new ConnectionResult(i, null));
    }

    ResolveAccountResponse(int i, IBinder ibinder, ConnectionResult connectionresult, boolean flag, boolean flag1)
    {
        zzCY = i;
        zzZO = ibinder;
        zzYh = connectionresult;
        zzWY = flag;
        zzabd = flag1;
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
            if (!zzYh.equals(((ResolveAccountResponse) (obj)).zzYh) || !zznZ().equals(((ResolveAccountResponse) (obj)).zznZ()))
            {
                return false;
            }
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzw.zza(this, parcel, i);
    }

    public IAccountAccessor zznZ()
    {
        return IAccountAccessor.zza.zzaD(zzZO);
    }

    public ConnectionResult zzoa()
    {
        return zzYh;
    }

    public boolean zzob()
    {
        return zzWY;
    }

    public boolean zzoc()
    {
        return zzabd;
    }

}
