// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

// Referenced classes of package com.google.android.gms.location.internal:
//            zzc

public class ClientIdentity
    implements SafeParcelable
{

    public static final zzc CREATOR = new zzc();
    private final int mVersionCode;
    public final String packageName;
    public final int uid;

    ClientIdentity(int i, int j, String s)
    {
        mVersionCode = i;
        uid = j;
        packageName = s;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null || !(obj instanceof ClientIdentity))
            {
                return false;
            }
            obj = (ClientIdentity)obj;
            if (((ClientIdentity) (obj)).uid != uid || !zzw.equal(((ClientIdentity) (obj)).packageName, packageName))
            {
                return false;
            }
        }
        return true;
    }

    int getVersionCode()
    {
        return mVersionCode;
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
