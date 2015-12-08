// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.common.api:
//            zzm

public final class Scope
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzm();
    final int mVersionCode;
    private final String zzaaC;

    Scope(int i, String s)
    {
        zzx.zzh(s, "scopeUri must not be null or empty");
        mVersionCode = i;
        zzaaC = s;
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
            return zzaaC.equals(((Scope)obj).zzaaC);
        }
    }

    public int hashCode()
    {
        return zzaaC.hashCode();
    }

    public String toString()
    {
        return zzaaC;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzm.zza(this, parcel, i);
    }

    public String zznG()
    {
        return zzaaC;
    }

}
