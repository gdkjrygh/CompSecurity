// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//            zzc

public class AccountChangeEventsResponse
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzc();
    final int mVersion;
    final List zzoB;

    AccountChangeEventsResponse(int i, List list)
    {
        mVersion = i;
        zzoB = (List)zzu.zzu(list);
    }

    public AccountChangeEventsResponse(List list)
    {
        mVersion = 1;
        zzoB = (List)zzu.zzu(list);
    }

    public int describeContents()
    {
        return 0;
    }

    public List getEvents()
    {
        return zzoB;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzc.zza(this, parcel, i);
    }

}
