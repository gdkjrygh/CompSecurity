// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzf, SearchAdRequestParcel

public final class AdRequestParcel
    implements SafeParcelable
{

    public static final zzf CREATOR = new zzf();
    public final Bundle extras;
    public final int versionCode;
    public final long zzrX;
    public final int zzrY;
    public final List zzrZ;
    public final boolean zzsa;
    public final int zzsb;
    public final boolean zzsc;
    public final String zzsd;
    public final SearchAdRequestParcel zzse;
    public final Location zzsf;
    public final String zzsg;
    public final Bundle zzsh;
    public final Bundle zzsi;
    public final List zzsj;
    public final String zzsk;

    public AdRequestParcel(int i, long l, Bundle bundle, int j, List list, boolean flag, 
            int k, boolean flag1, String s, SearchAdRequestParcel searchadrequestparcel, Location location, String s1, Bundle bundle1, 
            Bundle bundle2, List list1, String s2)
    {
        versionCode = i;
        zzrX = l;
        Bundle bundle3 = bundle;
        if (bundle == null)
        {
            bundle3 = new Bundle();
        }
        extras = bundle3;
        zzrY = j;
        zzrZ = list;
        zzsa = flag;
        zzsb = k;
        zzsc = flag1;
        zzsd = s;
        zzse = searchadrequestparcel;
        zzsf = location;
        zzsg = s1;
        zzsh = bundle1;
        zzsi = bundle2;
        zzsj = list1;
        zzsk = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

}
