// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.signin.internal:
//            zzc

public class CheckServerAuthResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    final int zzCY;
    final boolean zzaJY;
    final List zzaJZ;

    CheckServerAuthResult(int i, boolean flag, List list)
    {
        zzCY = i;
        zzaJY = flag;
        zzaJZ = list;
    }

    public CheckServerAuthResult(boolean flag, Set set)
    {
        this(1, flag, zzf(set));
    }

    private static List zzf(Set set)
    {
        if (set == null)
        {
            return Collections.emptyList();
        } else
        {
            return Collections.unmodifiableList(new ArrayList(set));
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

}
