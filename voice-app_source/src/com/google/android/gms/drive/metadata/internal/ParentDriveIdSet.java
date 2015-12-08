// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.drive.metadata.internal:
//            zzk, PartialDriveId

public class ParentDriveIdSet
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzk();
    final int zzCY;
    final List zzagJ;

    public ParentDriveIdSet()
    {
        this(1, ((List) (new ArrayList())));
    }

    ParentDriveIdSet(int i, List list)
    {
        zzCY = i;
        zzagJ = list;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzk.zza(this, parcel, i);
    }

    public Set zzC(long l)
    {
        HashSet hashset = new HashSet();
        for (Iterator iterator = zzagJ.iterator(); iterator.hasNext(); hashset.add(((PartialDriveId)iterator.next()).zzD(l))) { }
        return hashset;
    }

    public void zza(PartialDriveId partialdriveid)
    {
        zzagJ.add(partialdriveid);
    }

}
