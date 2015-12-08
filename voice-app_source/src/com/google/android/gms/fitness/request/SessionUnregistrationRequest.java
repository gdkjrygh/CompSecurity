// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzmu;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzz

public class SessionUnregistrationRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzz();
    private final PendingIntent mPendingIntent;
    private final int zzCY;
    private final String zzMZ;
    private final zzmu zzalN;

    SessionUnregistrationRequest(int i, PendingIntent pendingintent, IBinder ibinder, String s)
    {
        zzCY = i;
        mPendingIntent = pendingintent;
        if (ibinder == null)
        {
            pendingintent = null;
        } else
        {
            pendingintent = com.google.android.gms.internal.zzmu.zza.zzbF(ibinder);
        }
        zzalN = pendingintent;
        zzMZ = s;
    }

    public SessionUnregistrationRequest(PendingIntent pendingintent, zzmu zzmu1, String s)
    {
        zzCY = 4;
        mPendingIntent = pendingintent;
        zzalN = zzmu1;
        zzMZ = s;
    }

    private boolean zzb(SessionUnregistrationRequest sessionunregistrationrequest)
    {
        return zzt.equal(mPendingIntent, sessionunregistrationrequest.mPendingIntent);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SessionUnregistrationRequest) && zzb((SessionUnregistrationRequest)obj);
    }

    public String getPackageName()
    {
        return zzMZ;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            mPendingIntent
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("pendingIntent", mPendingIntent).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzz.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        if (zzalN == null)
        {
            return null;
        } else
        {
            return zzalN.asBinder();
        }
    }

    public PendingIntent zzrg()
    {
        return mPendingIntent;
    }

}
