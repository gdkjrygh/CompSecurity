// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzac, zzo

public class ValidateAccountRequest
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzac();
    final IBinder zzSS;
    private final Scope zzST[];
    private final int zzUe;
    private final Bundle zzUf;
    private final String zzUg;
    final int zzzH;

    ValidateAccountRequest(int i, int j, IBinder ibinder, Scope ascope[], Bundle bundle, String s)
    {
        zzzH = i;
        zzUe = j;
        zzSS = ibinder;
        zzST = ascope;
        zzUf = bundle;
        zzUg = s;
    }

    public ValidateAccountRequest(zzo zzo1, Scope ascope[], String s, Bundle bundle)
    {
        if (zzo1 == null)
        {
            zzo1 = null;
        } else
        {
            zzo1 = zzo1.asBinder();
        }
        this(1, 0x6fd4e8, ((IBinder) (zzo1)), ascope, bundle, s);
    }

    public int describeContents()
    {
        return 0;
    }

    public String getCallingPackage()
    {
        return zzUg;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzac.zza(this, parcel, i);
    }

    public int zzmp()
    {
        return zzUe;
    }

    public Scope[] zzmq()
    {
        return zzST;
    }

    public Bundle zzmr()
    {
        return zzUf;
    }

}
