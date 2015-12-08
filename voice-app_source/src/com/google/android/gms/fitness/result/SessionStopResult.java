// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzk

public class SessionStopResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    private final int zzCY;
    private final Status zzOt;
    private final List zzalQ;

    SessionStopResult(int i, Status status, List list)
    {
        zzCY = i;
        zzOt = status;
        zzalQ = Collections.unmodifiableList(list);
    }

    public SessionStopResult(Status status, List list)
    {
        zzCY = 3;
        zzOt = status;
        zzalQ = Collections.unmodifiableList(list);
    }

    public static SessionStopResult zzP(Status status)
    {
        return new SessionStopResult(status, Collections.emptyList());
    }

    private boolean zzb(SessionStopResult sessionstopresult)
    {
        return zzOt.equals(sessionstopresult.zzOt) && zzt.equal(zzalQ, sessionstopresult.zzalQ);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SessionStopResult) && zzb((SessionStopResult)obj);
    }

    public List getSessions()
    {
        return zzalQ;
    }

    public Status getStatus()
    {
        return zzOt;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzOt, zzalQ
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("status", zzOt).zzg("sessions", zzalQ).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

}
