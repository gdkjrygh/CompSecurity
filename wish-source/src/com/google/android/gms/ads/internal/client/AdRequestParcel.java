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
//            zze, SearchAdRequestParcel

public final class AdRequestParcel
    implements SafeParcelable
{

    public static final zze CREATOR = new zze();
    public final Bundle extras;
    public final int versionCode;
    public final long zzpI;
    public final int zzpJ;
    public final List zzpK;
    public final boolean zzpL;
    public final int zzpM;
    public final boolean zzpN;
    public final String zzpO;
    public final SearchAdRequestParcel zzpP;
    public final Location zzpQ;
    public final String zzpR;
    public final Bundle zzpS;
    public final Bundle zzpT;
    public final List zzpU;
    public final String zzpV;

    public AdRequestParcel(int i, long l, Bundle bundle, int j, List list, boolean flag, 
            int k, boolean flag1, String s, SearchAdRequestParcel searchadrequestparcel, Location location, String s1, Bundle bundle1, 
            Bundle bundle2, List list1, String s2)
    {
        versionCode = i;
        zzpI = l;
        Bundle bundle3 = bundle;
        if (bundle == null)
        {
            bundle3 = new Bundle();
        }
        extras = bundle3;
        zzpJ = j;
        zzpK = list;
        zzpL = flag;
        zzpM = k;
        zzpN = flag1;
        zzpO = s;
        zzpP = searchadrequestparcel;
        zzpQ = location;
        zzpR = s1;
        zzpS = bundle1;
        zzpT = bundle2;
        zzpU = list1;
        zzpV = s2;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

}
