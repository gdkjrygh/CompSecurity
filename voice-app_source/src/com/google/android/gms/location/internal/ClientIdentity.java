// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzc

public class ClientIdentity
    implements SafeParcelable
{

    public static final zzc CREATOR = new zzc();
    public final String packageName;
    public final int uid;
    private final int zzCY;

    ClientIdentity(int i, int j, String s)
    {
        zzCY = i;
        uid = j;
        packageName = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ClientIdentity)
        {
            if (((ClientIdentity) (obj = (ClientIdentity)obj)).uid == uid && zzt.equal(((ClientIdentity) (obj)).packageName, packageName))
            {
                return true;
            }
        }
        return false;
    }

    int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return uid;
    }

    public String toString()
    {
        return String.format("%d:%s", new Object[] {
            Integer.valueOf(uid), packageName
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

}
