// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzt;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            zze

public class PlayLoggerContext
    implements SafeParcelable
{

    public static final zze CREATOR = new zze();
    public final String packageName;
    public final int versionCode;
    public final int zzaGP;
    public final int zzaGQ;
    public final String zzaGR;
    public final String zzaGS;
    public final boolean zzaGT;
    public final String zzaGU;
    public final boolean zzaGV;

    public PlayLoggerContext(int i, String s, int j, int k, String s1, String s2, boolean flag, 
            String s3, boolean flag1)
    {
        versionCode = i;
        packageName = s;
        zzaGP = j;
        zzaGQ = k;
        zzaGR = s1;
        zzaGS = s2;
        zzaGT = flag;
        zzaGU = s3;
        zzaGV = flag1;
    }

    public PlayLoggerContext(String s, int i, int j, String s1, String s2, boolean flag)
    {
        versionCode = 1;
        packageName = (String)zzu.zzu(s);
        zzaGP = i;
        zzaGQ = j;
        zzaGU = null;
        zzaGR = s1;
        zzaGS = s2;
        zzaGT = flag;
        zzaGV = false;
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
                if (versionCode != ((PlayLoggerContext) (obj = (PlayLoggerContext)obj)).versionCode || !packageName.equals(((PlayLoggerContext) (obj)).packageName) || zzaGP != ((PlayLoggerContext) (obj)).zzaGP || zzaGQ != ((PlayLoggerContext) (obj)).zzaGQ || !zzt.equal(zzaGU, ((PlayLoggerContext) (obj)).zzaGU) || !zzt.equal(zzaGR, ((PlayLoggerContext) (obj)).zzaGR) || !zzt.equal(zzaGS, ((PlayLoggerContext) (obj)).zzaGS) || zzaGT != ((PlayLoggerContext) (obj)).zzaGT || zzaGV != ((PlayLoggerContext) (obj)).zzaGV)
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
        return zzt.hashCode(new Object[] {
            Integer.valueOf(versionCode), packageName, Integer.valueOf(zzaGP), Integer.valueOf(zzaGQ), zzaGU, zzaGR, zzaGS, Boolean.valueOf(zzaGT), Boolean.valueOf(zzaGV)
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("PlayLoggerContext[");
        stringbuilder.append("versionCode=").append(versionCode).append(',');
        stringbuilder.append("package=").append(packageName).append(',');
        stringbuilder.append("packageVersionCode=").append(zzaGP).append(',');
        stringbuilder.append("logSource=").append(zzaGQ).append(',');
        stringbuilder.append("logSourceName=").append(zzaGU).append(',');
        stringbuilder.append("uploadAccount=").append(zzaGR).append(',');
        stringbuilder.append("loggingId=").append(zzaGS).append(',');
        stringbuilder.append("logAndroidId=").append(zzaGT).append(',');
        stringbuilder.append("isAnonymous=").append(zzaGV);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zze.zza(this, parcel, i);
    }

}
