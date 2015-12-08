// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.credentials.internal:
//            zzi

public final class SaveRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    final int mVersionCode;
    private final Credential zzRx;

    SaveRequest(int i, Credential credential)
    {
        mVersionCode = i;
        zzRx = credential;
    }

    public SaveRequest(Credential credential)
    {
        this(1, credential);
    }

    public int describeContents()
    {
        return 0;
    }

    public Credential getCredential()
    {
        return zzRx;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

}
