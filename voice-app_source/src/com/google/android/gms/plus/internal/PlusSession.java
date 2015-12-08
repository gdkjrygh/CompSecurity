// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.plus.internal:
//            zzh, PlusCommonExtras

public class PlusSession
    implements SafeParcelable
{

    public static final zzh CREATOR = new zzh();
    private final int zzCY;
    private final String zzOx;
    private final String zzTO;
    private final PlusCommonExtras zzaHA;
    private final String zzaHu[];
    private final String zzaHv[];
    private final String zzaHw[];
    private final String zzaHx;
    private final String zzaHy;
    private final String zzaHz;

    PlusSession(int i, String s, String as[], String as1[], String as2[], String s1, String s2, 
            String s3, String s4, PlusCommonExtras pluscommonextras)
    {
        zzCY = i;
        zzOx = s;
        zzaHu = as;
        zzaHv = as1;
        zzaHw = as2;
        zzaHx = s1;
        zzaHy = s2;
        zzTO = s3;
        zzaHz = s4;
        zzaHA = pluscommonextras;
    }

    public PlusSession(String s, String as[], String as1[], String as2[], String s1, String s2, String s3, 
            PlusCommonExtras pluscommonextras)
    {
        zzCY = 1;
        zzOx = s;
        zzaHu = as;
        zzaHv = as1;
        zzaHw = as2;
        zzaHx = s1;
        zzaHy = s2;
        zzTO = s3;
        zzaHz = null;
        zzaHA = pluscommonextras;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof PlusSession)
        {
            if (zzCY == ((PlusSession) (obj = (PlusSession)obj)).zzCY && zzt.equal(zzOx, ((PlusSession) (obj)).zzOx) && Arrays.equals(zzaHu, ((PlusSession) (obj)).zzaHu) && Arrays.equals(zzaHv, ((PlusSession) (obj)).zzaHv) && Arrays.equals(zzaHw, ((PlusSession) (obj)).zzaHw) && zzt.equal(zzaHx, ((PlusSession) (obj)).zzaHx) && zzt.equal(zzaHy, ((PlusSession) (obj)).zzaHy) && zzt.equal(zzTO, ((PlusSession) (obj)).zzTO) && zzt.equal(zzaHz, ((PlusSession) (obj)).zzaHz) && zzt.equal(zzaHA, ((PlusSession) (obj)).zzaHA))
            {
                return true;
            }
        }
        return false;
    }

    public String getAccountName()
    {
        return zzOx;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public int hashCode()
    {
        return zzt.hashCode(new Object[] {
            Integer.valueOf(zzCY), zzOx, zzaHu, zzaHv, zzaHw, zzaHx, zzaHy, zzTO, zzaHz, zzaHA
        });
    }

    public String toString()
    {
        return zzt.zzt(this).zzg("versionCode", Integer.valueOf(zzCY)).zzg("accountName", zzOx).zzg("requestedScopes", zzaHu).zzg("visibleActivities", zzaHv).zzg("requiredFeatures", zzaHw).zzg("packageNameForAuth", zzaHx).zzg("callingPackageName", zzaHy).zzg("applicationName", zzTO).zzg("extra", zzaHA.toString()).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzh.zza(this, parcel, i);
    }

    public String zzlB()
    {
        return zzTO;
    }

    public String zzxA()
    {
        return zzaHx;
    }

    public String zzxB()
    {
        return zzaHy;
    }

    public String zzxC()
    {
        return zzaHz;
    }

    public PlusCommonExtras zzxD()
    {
        return zzaHA;
    }

    public Bundle zzxE()
    {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(com/google/android/gms/plus/internal/PlusCommonExtras.getClassLoader());
        zzaHA.zzy(bundle);
        return bundle;
    }

    public String[] zzxx()
    {
        return zzaHu;
    }

    public String[] zzxy()
    {
        return zzaHv;
    }

    public String[] zzxz()
    {
        return zzaHw;
    }

}
