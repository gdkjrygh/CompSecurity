// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.internal.zzmt;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzy

public class SessionStopRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzy();
    private final String mName;
    private final int zzCY;
    private final String zzMZ;
    private final String zzakL;
    private final zzmt zzamJ;

    SessionStopRequest(int i, String s, String s1, IBinder ibinder, String s2)
    {
        zzCY = i;
        mName = s;
        zzakL = s1;
        if (ibinder == null)
        {
            s = null;
        } else
        {
            s = com.google.android.gms.internal.zzmt.zza.zzbE(ibinder);
        }
        zzamJ = s;
        zzMZ = s2;
    }

    public SessionStopRequest(String s, String s1, zzmt zzmt1, String s2)
    {
        zzCY = 2;
        mName = s;
        zzakL = s1;
        zzamJ = zzmt1;
        zzMZ = s2;
    }

    private boolean zzb(SessionStopRequest sessionstoprequest)
    {
        return zzt.equal(mName, sessionstoprequest.mName) && zzt.equal(zzakL, sessionstoprequest.zzakL);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof SessionStopRequest) && zzb((SessionStopRequest)obj);
    }

    public String getIdentifier()
    {
        return zzakL;
    }

    public String getName()
    {
        return mName;
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
            mName, zzakL
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("name", mName).zzg("identifier", zzakL).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzy.zza(this, parcel, i);
    }

    public IBinder zzqU()
    {
        if (zzamJ == null)
        {
            return null;
        } else
        {
            return zzamJ.asBinder();
        }
    }

}
