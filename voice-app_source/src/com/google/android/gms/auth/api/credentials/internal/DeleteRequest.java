// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.auth.api.credentials.internal:
//            zze

public final class DeleteRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zze();
    final int zzCY;
    private final Credential zzPb;

    DeleteRequest(int i, Credential credential)
    {
        zzCY = i;
        zzPb = credential;
    }

    public DeleteRequest(Credential credential)
    {
        this(1, credential);
    }

    public int describeContents()
    {
        return 0;
    }

    public Credential getCredential()
    {
        return zzPb;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

}
