// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.zzmu;

// Referenced classes of package com.google.android.gms.fitness.request:
//            zzx

public class SessionStartRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzx();
    private final int zzCY;
    private final String zzMZ;
    private final Session zzajJ;
    private final zzmu zzalN;

    SessionStartRequest(int i, Session session, IBinder ibinder, String s)
    {
        zzCY = i;
        zzajJ = session;
        if (ibinder == null)
        {
            session = null;
        } else
        {
            session = com.google.android.gms.internal.zzmu.zza.zzbF(ibinder);
        }
        zzalN = session;
        zzMZ = s;
    }

    public SessionStartRequest(Session session, zzmu zzmu1, String s)
    {
        zzu.zzb(session.isOngoing(), "Cannot start a session which has already ended");
        zzCY = 2;
        zzajJ = session;
        zzalN = zzmu1;
        zzMZ = s;
    }

    private boolean zzb(SessionStartRequest sessionstartrequest)
    {
        return zzt.equal(zzajJ, sessionstartrequest.zzajJ);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof SessionStartRequest) && zzb((SessionStartRequest)obj);
    }

    public String getPackageName()
    {
        return zzMZ;
    }

    public Session getSession()
    {
        return zzajJ;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzajJ
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("session", zzajJ).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzx.zza(this, parcel, i);
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

}
