// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;

// Referenced classes of package com.google.android.gms.nearby.sharing:
//            zza

public class AppContentReceivedResult
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    private int statusCode;
    private final int versionCode;
    private Uri zzaGj;

    private AppContentReceivedResult()
    {
        versionCode = 1;
    }

    AppContentReceivedResult(int i, Uri uri, int j)
    {
        versionCode = i;
        zzaGj = uri;
        statusCode = j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof AppContentReceivedResult))
            {
                return false;
            }
            obj = (AppContentReceivedResult)obj;
            if (!zzt.equal(zzaGj, ((AppContentReceivedResult) (obj)).zzaGj) || !zzt.equal(Integer.valueOf(statusCode), Integer.valueOf(((AppContentReceivedResult) (obj)).statusCode)))
            {
                return false;
            }
        }
        return true;
    }

    public int getStatusCode()
    {
        return statusCode;
    }

    int getVersionCode()
    {
        return versionCode;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            zzaGj, Integer.valueOf(statusCode)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    public Uri zzxc()
    {
        return zzaGj;
    }

}
