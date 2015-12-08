// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.fitness.data:
//            zzq, Session, DataSet

public class SessionDataSet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzq();
    final int zzCY;
    private final Session zzajJ;
    private final DataSet zzakO;

    SessionDataSet(int i, Session session, DataSet dataset)
    {
        zzCY = i;
        zzajJ = session;
        zzakO = dataset;
    }

    private boolean zza(SessionDataSet sessiondataset)
    {
        return zzt.equal(zzajJ, sessiondataset.zzajJ) && zzt.equal(zzakO, sessiondataset.zzakO);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof SessionDataSet) && zza((SessionDataSet)obj);
    }

    public Session getSession()
    {
        return zzajJ;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzajJ, zzakO
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("session", zzajJ).zzg("dataSet", zzakO).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzq.zza(this, parcel, i);
    }

    public DataSet zzqK()
    {
        return zzakO;
    }

}
