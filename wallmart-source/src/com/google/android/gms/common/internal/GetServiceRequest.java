// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzi, zza, zzp

public class GetServiceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzi();
    final int version;
    final int zzadn;
    int zzado;
    String zzadp;
    IBinder zzadq;
    Scope zzadr[];
    Bundle zzads;
    Account zzadt;

    public GetServiceRequest(int i)
    {
        version = 2;
        zzado = GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        zzadn = i;
    }

    GetServiceRequest(int i, int j, int k, String s, IBinder ibinder, Scope ascope[], Bundle bundle, 
            Account account)
    {
        version = i;
        zzadn = j;
        zzado = k;
        zzadp = s;
        if (i < 2)
        {
            zzadt = zzaG(ibinder);
        } else
        {
            zzadq = ibinder;
            zzadt = account;
        }
        zzadr = ascope;
        zzads = bundle;
    }

    private Account zzaG(IBinder ibinder)
    {
        Account account = null;
        if (ibinder != null)
        {
            account = zza.zzb(zzp.zza.zzaH(ibinder));
        }
        return account;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.zza(this, parcel, i);
    }

    public GetServiceRequest zzb(Account account)
    {
        zzadt = account;
        return this;
    }

    public GetServiceRequest zzc(zzp zzp1)
    {
        if (zzp1 != null)
        {
            zzadq = zzp1.asBinder();
        }
        return this;
    }

    public GetServiceRequest zzck(String s)
    {
        zzadp = s;
        return this;
    }

    public GetServiceRequest zzd(Collection collection)
    {
        zzadr = (Scope[])collection.toArray(new Scope[collection.size()]);
        return this;
    }

    public GetServiceRequest zzg(Bundle bundle)
    {
        zzads = bundle;
        return this;
    }

}
