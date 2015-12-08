// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.events;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.WriteAwareParcelable;

// Referenced classes of package com.google.android.gms.drive.events:
//            DriveEvent, zzk

public class QueryResultEventParcelable extends WriteAwareParcelable
    implements DriveEvent
{

    public static final zzk CREATOR = new zzk();
    final int zzCY;
    final DataHolder zzWu;
    final boolean zzaei;
    final int zzaej;

    QueryResultEventParcelable(int i, DataHolder dataholder, boolean flag, int j)
    {
        zzCY = i;
        zzWu = dataholder;
        zzaei = flag;
        zzaej = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public int getType()
    {
        return 3;
    }

    public void zzI(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public DataHolder zzpx()
    {
        return zzWu;
    }

    public boolean zzpy()
    {
        return zzaei;
    }

    public int zzpz()
    {
        return zzaej;
    }

}
