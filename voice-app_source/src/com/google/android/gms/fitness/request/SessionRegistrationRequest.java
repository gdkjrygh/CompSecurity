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
//            zzw

public class SessionRegistrationRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzw();
    private final PendingIntent mPendingIntent;
    private final int zzCY;
    private final String zzMZ;
    private final zzmu zzalN;
    private final int zzamI;

    SessionRegistrationRequest(int i, PendingIntent pendingintent, IBinder ibinder, String s, int j)
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
        zzamI = j;
    }

    public SessionRegistrationRequest(PendingIntent pendingintent, zzmu zzmu1, String s, int i)
    {
        zzCY = 5;
        mPendingIntent = pendingintent;
        zzalN = zzmu1;
        zzMZ = s;
        zzamI = i;
    }

    private boolean zzb(SessionRegistrationRequest sessionregistrationrequest)
    {
        return zzamI == sessionregistrationrequest.zzamI && zzt.equal(mPendingIntent, sessionregistrationrequest.mPendingIntent);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SessionRegistrationRequest) && zzb((SessionRegistrationRequest)obj);
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
            mPendingIntent, Integer.valueOf(zzamI)
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("pendingIntent", mPendingIntent).zzg("sessionRegistrationOption", Integer.valueOf(zzamI)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzw.zza(this, parcel, i);
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

    public int zzrp()
    {
        return zzamI;
    }

}
