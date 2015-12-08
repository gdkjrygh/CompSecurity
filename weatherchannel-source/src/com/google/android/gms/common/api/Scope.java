// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.common.api:
//            zzj

public final class Scope
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzj();
    final int zzCY;
    private final String zzXO;

    Scope(int i, String s)
    {
        zzu.zzh(s, "scopeUri must not be null or empty");
        zzCY = i;
        zzXO = s;
    }

    public Scope(String s)
    {
        this(1, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof Scope))
        {
            return false;
        } else
        {
            return zzXO.equals(((Scope)obj).zzXO);
        }
    }

    public int hashCode()
    {
        return zzXO.hashCode();
    }

    public String toString()
    {
        return zzXO;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj.zza(this, parcel, i);
    }

    public String zzmS()
    {
        return zzXO;
    }

}
