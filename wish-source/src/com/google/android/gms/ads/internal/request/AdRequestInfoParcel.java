// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzf

public final class AdRequestInfoParcel
    implements SafeParcelable
{
    public static final class zza
    {

        public final ApplicationInfo applicationInfo;
        public final String zzmG;
        public final VersionInfoParcel zzmJ;
        public final AdSizeParcel zzmP;
        public final List zzmZ;
        public final Bundle zzyV;
        public final AdRequestParcel zzyW;
        public final PackageInfo zzyX;
        public final String zzyZ;
        public final String zzza;
        public final Bundle zzzb;
        public final int zzzc;
        public final Bundle zzzd;
        public final boolean zzze;
        public final Messenger zzzf;
        public final int zzzg;
        public final int zzzh;
        public final float zzzi;
        public final String zzzj;
        public final boolean zzzk;
        public final int zzzl;
        public final long zzzn;
        public final String zzzo;
        public final List zzzp;

        public zza(Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
                String s2, VersionInfoParcel versioninfoparcel, Bundle bundle1, List list, Bundle bundle2, boolean flag, Messenger messenger, 
                int i, int j, float f, String s3, boolean flag1, int k, long l, String s4, List list1)
        {
            zzyV = bundle;
            zzyW = adrequestparcel;
            zzmP = adsizeparcel;
            zzmG = s;
            applicationInfo = applicationinfo;
            zzyX = packageinfo;
            zzyZ = s1;
            zzza = s2;
            zzmJ = versioninfoparcel;
            zzzb = bundle1;
            zzze = flag;
            zzzf = messenger;
            zzzg = i;
            zzzh = j;
            zzzi = f;
            if (list != null && list.size() > 0)
            {
                zzzc = 2;
                zzmZ = list;
            } else
            {
                zzzc = 0;
                zzmZ = null;
            }
            zzzd = bundle2;
            zzzj = s3;
            zzzk = flag1;
            zzzl = k;
            zzzn = l;
            zzzo = s4;
            zzzp = list1;
        }
    }


    public static final zzf CREATOR = new zzf();
    public final ApplicationInfo applicationInfo;
    public final int versionCode;
    public final String zzmG;
    public final VersionInfoParcel zzmJ;
    public final AdSizeParcel zzmP;
    public final List zzmZ;
    public final Bundle zzyV;
    public final AdRequestParcel zzyW;
    public final PackageInfo zzyX;
    public final String zzyY;
    public final String zzyZ;
    public final String zzza;
    public final Bundle zzzb;
    public final int zzzc;
    public final Bundle zzzd;
    public final boolean zzze;
    public final Messenger zzzf;
    public final int zzzg;
    public final int zzzh;
    public final float zzzi;
    public final String zzzj;
    public final boolean zzzk;
    public final int zzzl;
    public final String zzzm;
    public final long zzzn;
    public final String zzzo;
    public final List zzzp;

    AdRequestInfoParcel(int i, Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
            String s1, String s2, String s3, VersionInfoParcel versioninfoparcel, Bundle bundle1, int j, List list, 
            Bundle bundle2, boolean flag, Messenger messenger, int k, int l, float f, String s4, 
            boolean flag1, int i1, String s5, long l1, String s6, List list1)
    {
        versionCode = i;
        zzyV = bundle;
        zzyW = adrequestparcel;
        zzmP = adsizeparcel;
        zzmG = s;
        applicationInfo = applicationinfo;
        zzyX = packageinfo;
        zzyY = s1;
        zzyZ = s2;
        zzza = s3;
        zzmJ = versioninfoparcel;
        zzzb = bundle1;
        zzzc = j;
        zzmZ = list;
        zzzd = bundle2;
        zzze = flag;
        zzzf = messenger;
        zzzg = k;
        zzzh = l;
        zzzi = f;
        zzzj = s4;
        zzzk = flag1;
        zzzl = i1;
        zzzm = s5;
        zzzn = l1;
        zzzo = s6;
        if (list1 == null)
        {
            bundle = Collections.emptyList();
        } else
        {
            bundle = Collections.unmodifiableList(list1);
        }
        zzzp = bundle;
    }

    public AdRequestInfoParcel(Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, String s3, VersionInfoParcel versioninfoparcel, Bundle bundle1, int i, List list, Bundle bundle2, 
            boolean flag, Messenger messenger, int j, int k, float f, String s4, boolean flag1, 
            int l, String s5, long l1, String s6, List list1)
    {
        this(9, bundle, adrequestparcel, adsizeparcel, s, applicationinfo, packageinfo, s1, s2, s3, versioninfoparcel, bundle1, i, list, bundle2, flag, messenger, j, k, f, s4, flag1, l, s5, l1, s6, list1);
    }

    public AdRequestInfoParcel(zza zza1, String s, String s1)
    {
        this(zza1.zzyV, zza1.zzyW, zza1.zzmP, zza1.zzmG, zza1.applicationInfo, zza1.zzyX, s, zza1.zzyZ, zza1.zzza, zza1.zzmJ, zza1.zzzb, zza1.zzzc, zza1.zzmZ, zza1.zzzd, zza1.zzze, zza1.zzzf, zza1.zzzg, zza1.zzzh, zza1.zzzi, zza1.zzzj, zza1.zzzk, zza1.zzzl, s1, zza1.zzzn, zza1.zzzo, zza1.zzzp);
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
