// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzh, zza, IAccountAccessor

public class GetServiceRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzh();
    final int version;
    final int zzaad;
    int zzaae;
    String zzaaf;
    IBinder zzaag;
    Scope zzaah[];
    Bundle zzaai;
    Account zzaaj;

    public GetServiceRequest(int i)
    {
        version = 2;
        zzaae = GooglePlayServicesUtil.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        zzaad = i;
    }

    GetServiceRequest(int i, int j, int k, String s, IBinder ibinder, Scope ascope[], Bundle bundle, 
            Account account)
    {
        version = i;
        zzaad = j;
        zzaae = k;
        zzaaf = s;
        if (i < 2)
        {
            zzaaj = zzaC(ibinder);
        } else
        {
            zzaag = ibinder;
            zzaaj = account;
        }
        zzaah = ascope;
        zzaai = bundle;
    }

    private Account zzaC(IBinder ibinder)
    {
        Account account = null;
        if (ibinder != null)
        {
            account = zza.zza(IAccountAccessor.zza.zzaD(ibinder));
        }
        return account;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public GetServiceRequest zzb(Account account)
    {
        zzaaj = account;
        return this;
    }

    public GetServiceRequest zzb(IAccountAccessor iaccountaccessor)
    {
        if (iaccountaccessor != null)
        {
            zzaag = iaccountaccessor.asBinder();
        }
        return this;
    }

    public GetServiceRequest zzb(Collection collection)
    {
        zzaah = (Scope[])collection.toArray(new Scope[collection.size()]);
        return this;
    }

    public GetServiceRequest zzcb(String s)
    {
        zzaaf = s;
        return this;
    }

    public GetServiceRequest zzf(Bundle bundle)
    {
        zzaai = bundle;
        return this;
    }

}
