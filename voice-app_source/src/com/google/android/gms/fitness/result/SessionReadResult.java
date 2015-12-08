// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.SessionDataSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.fitness.result:
//            zzj

public class SessionReadResult
    implements Result, SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    private final int zzCY;
    private final Status zzOt;
    private final List zzalQ;
    private final List zzamX;

    SessionReadResult(int i, List list, List list1, Status status)
    {
        zzCY = i;
        zzalQ = list;
        zzamX = Collections.unmodifiableList(list1);
        zzOt = status;
    }

    public SessionReadResult(List list, List list1, Status status)
    {
        zzCY = 3;
        zzalQ = list;
        zzamX = Collections.unmodifiableList(list1);
        zzOt = status;
    }

    public static SessionReadResult zzO(Status status)
    {
        return new SessionReadResult(new ArrayList(), new ArrayList(), status);
    }

    private boolean zzb(SessionReadResult sessionreadresult)
    {
        return zzOt.equals(sessionreadresult.zzOt) && zzt.equal(zzalQ, sessionreadresult.zzalQ) && zzt.equal(zzamX, sessionreadresult.zzamX);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return this == obj || (obj instanceof SessionReadResult) && zzb((SessionReadResult)obj);
    }

    public List getDataSet(Session session)
    {
        zzu.zzb(zzalQ.contains(session), "Attempting to read data for session %s which was not returned", new Object[] {
            session
        });
        ArrayList arraylist = new ArrayList();
        Iterator iterator = zzamX.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SessionDataSet sessiondataset = (SessionDataSet)iterator.next();
            if (zzt.equal(session, sessiondataset.getSession()))
            {
                arraylist.add(sessiondataset.zzqK());
            }
        } while (true);
        return arraylist;
    }

    public List getDataSet(Session session, DataType datatype)
    {
        zzu.zzb(zzalQ.contains(session), "Attempting to read data for session %s which was not returned", new Object[] {
            session
        });
        ArrayList arraylist = new ArrayList();
        Iterator iterator = zzamX.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            SessionDataSet sessiondataset = (SessionDataSet)iterator.next();
            if (zzt.equal(session, sessiondataset.getSession()) && datatype.equals(sessiondataset.zzqK().getDataType()))
            {
                arraylist.add(sessiondataset.zzqK());
            }
        } while (true);
        return arraylist;
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
            zzOt, zzalQ, zzamX
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("status", zzOt).zzg("sessions", zzalQ).zzg("sessionDataSets", zzamX).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

    public List zzry()
    {
        return zzamX;
    }

}
