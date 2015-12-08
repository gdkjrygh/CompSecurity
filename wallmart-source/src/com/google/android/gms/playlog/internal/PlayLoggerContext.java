// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            zze

public class PlayLoggerContext
    implements SafeParcelable
{

    public static final zze CREATOR = new zze();
    public final String packageName;
    public final int versionCode;
    public final int zzaKR;
    public final int zzaKS;
    public final String zzaKT;
    public final String zzaKU;
    public final boolean zzaKV;
    public final String zzaKW;
    public final boolean zzaKX;
    public final int zzaKY;

    public PlayLoggerContext(int i, String s, int j, int k, String s1, String s2, boolean flag, 
            String s3, boolean flag1, int l)
    {
        versionCode = i;
        packageName = s;
        zzaKR = j;
        zzaKS = k;
        zzaKT = s1;
        zzaKU = s2;
        zzaKV = flag;
        zzaKW = s3;
        zzaKX = flag1;
        zzaKY = l;
    }

    public PlayLoggerContext(String s, int i, int j, String s1, String s2, boolean flag)
    {
        versionCode = 1;
        packageName = (String)zzx.zzv(s);
        zzaKR = i;
        zzaKS = j;
        zzaKW = null;
        zzaKT = s1;
        zzaKU = s2;
        zzaKV = flag;
        zzaKX = false;
        zzaKY = 0;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof PlayLoggerContext)
            {
                if (versionCode != ((PlayLoggerContext) (obj = (PlayLoggerContext)obj)).versionCode || !packageName.equals(((PlayLoggerContext) (obj)).packageName) || zzaKR != ((PlayLoggerContext) (obj)).zzaKR || zzaKS != ((PlayLoggerContext) (obj)).zzaKS || !zzw.equal(zzaKW, ((PlayLoggerContext) (obj)).zzaKW) || !zzw.equal(zzaKT, ((PlayLoggerContext) (obj)).zzaKT) || !zzw.equal(zzaKU, ((PlayLoggerContext) (obj)).zzaKU) || zzaKV != ((PlayLoggerContext) (obj)).zzaKV || zzaKX != ((PlayLoggerContext) (obj)).zzaKX || zzaKY != ((PlayLoggerContext) (obj)).zzaKY)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Integer.valueOf(versionCode), packageName, Integer.valueOf(zzaKR), Integer.valueOf(zzaKS), zzaKW, zzaKT, zzaKU, Boolean.valueOf(zzaKV), Boolean.valueOf(zzaKX), Integer.valueOf(zzaKY)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PlayLoggerContext[");
        stringbuilder.append("versionCode=").append(versionCode).append(',');
        stringbuilder.append("package=").append(packageName).append(',');
        stringbuilder.append("packageVersionCode=").append(zzaKR).append(',');
        stringbuilder.append("logSource=").append(zzaKS).append(',');
        stringbuilder.append("logSourceName=").append(zzaKW).append(',');
        stringbuilder.append("uploadAccount=").append(zzaKT).append(',');
        stringbuilder.append("loggingId=").append(zzaKU).append(',');
        stringbuilder.append("logAndroidId=").append(zzaKV).append(',');
        stringbuilder.append("isAnonymous=").append(zzaKX).append(',');
        stringbuilder.append("qosTier=").append(zzaKY);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

}
