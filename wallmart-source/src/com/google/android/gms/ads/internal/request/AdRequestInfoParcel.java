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
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzf, CapabilityParcel

public final class AdRequestInfoParcel
    implements SafeParcelable
{
    public static final class zza
    {

        public final ApplicationInfo applicationInfo;
        public final String zzDB;
        public final String zzDC;
        public final Bundle zzDD;
        public final int zzDE;
        public final Bundle zzDF;
        public final boolean zzDG;
        public final Messenger zzDH;
        public final int zzDI;
        public final int zzDJ;
        public final float zzDK;
        public final String zzDL;
        public final boolean zzDM;
        public final int zzDN;
        public final long zzDP;
        public final String zzDQ;
        public final List zzDR;
        public final List zzDS;
        public final CapabilityParcel zzDU;
        public final Bundle zzDx;
        public final AdRequestParcel zzDy;
        public final PackageInfo zzDz;
        public final String zzpY;
        public final String zzpZ;
        public final VersionInfoParcel zzqb;
        public final AdSizeParcel zzqf;
        public final NativeAdOptionsParcel zzqt;
        public final List zzqv;

        public zza(Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
                String s2, VersionInfoParcel versioninfoparcel, Bundle bundle1, List list, List list1, Bundle bundle2, boolean flag, 
                Messenger messenger, int i, int j, float f, String s3, boolean flag1, int k, 
                long l, String s4, List list2, String s5, NativeAdOptionsParcel nativeadoptionsparcel, CapabilityParcel capabilityparcel)
        {
            zzDx = bundle;
            zzDy = adrequestparcel;
            zzqf = adsizeparcel;
            zzpZ = s;
            applicationInfo = applicationinfo;
            zzDz = packageinfo;
            zzDB = s1;
            zzDC = s2;
            zzqb = versioninfoparcel;
            zzDD = bundle1;
            zzDG = flag;
            zzDH = messenger;
            zzDI = i;
            zzDJ = j;
            zzDK = f;
            if (list != null && list.size() > 0)
            {
                zzDE = 3;
                zzqv = list;
                zzDS = list1;
            } else
            {
                zzDE = 0;
                zzqv = null;
                zzDS = null;
            }
            zzDF = bundle2;
            zzDL = s3;
            zzDM = flag1;
            zzDN = k;
            zzDP = l;
            zzDQ = s4;
            zzDR = list2;
            zzpY = s5;
            zzqt = nativeadoptionsparcel;
            zzDU = capabilityparcel;
        }
    }


    public static final zzf CREATOR = new zzf();
    public final ApplicationInfo applicationInfo;
    public final int versionCode;
    public final String zzDA;
    public final String zzDB;
    public final String zzDC;
    public final Bundle zzDD;
    public final int zzDE;
    public final Bundle zzDF;
    public final boolean zzDG;
    public final Messenger zzDH;
    public final int zzDI;
    public final int zzDJ;
    public final float zzDK;
    public final String zzDL;
    public final boolean zzDM;
    public final int zzDN;
    public final String zzDO;
    public final long zzDP;
    public final String zzDQ;
    public final List zzDR;
    public final List zzDS;
    public final long zzDT;
    public final CapabilityParcel zzDU;
    public final Bundle zzDx;
    public final AdRequestParcel zzDy;
    public final PackageInfo zzDz;
    public final String zzpY;
    public final String zzpZ;
    public final VersionInfoParcel zzqb;
    public final AdSizeParcel zzqf;
    public final NativeAdOptionsParcel zzqt;
    public final List zzqv;

    AdRequestInfoParcel(int i, Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, 
            String s1, String s2, String s3, VersionInfoParcel versioninfoparcel, Bundle bundle1, int j, List list, 
            Bundle bundle2, boolean flag, Messenger messenger, int k, int l, float f, String s4, 
            boolean flag1, int i1, String s5, long l1, String s6, List list1, 
            String s7, NativeAdOptionsParcel nativeadoptionsparcel, List list2, long l2, CapabilityParcel capabilityparcel)
    {
        versionCode = i;
        zzDx = bundle;
        zzDy = adrequestparcel;
        zzqf = adsizeparcel;
        zzpZ = s;
        applicationInfo = applicationinfo;
        zzDz = packageinfo;
        zzDA = s1;
        zzDB = s2;
        zzDC = s3;
        zzqb = versioninfoparcel;
        zzDD = bundle1;
        zzDE = j;
        zzqv = list;
        if (list2 == null)
        {
            bundle = Collections.emptyList();
        } else
        {
            bundle = Collections.unmodifiableList(list2);
        }
        zzDS = bundle;
        zzDF = bundle2;
        zzDG = flag;
        zzDH = messenger;
        zzDI = k;
        zzDJ = l;
        zzDK = f;
        zzDL = s4;
        zzDM = flag1;
        zzDN = i1;
        zzDO = s5;
        zzDP = l1;
        zzDQ = s6;
        if (list1 == null)
        {
            bundle = Collections.emptyList();
        } else
        {
            bundle = Collections.unmodifiableList(list1);
        }
        zzDR = bundle;
        zzpY = s7;
        zzqt = nativeadoptionsparcel;
        zzDT = l2;
        zzDU = capabilityparcel;
    }

    public AdRequestInfoParcel(Bundle bundle, AdRequestParcel adrequestparcel, AdSizeParcel adsizeparcel, String s, ApplicationInfo applicationinfo, PackageInfo packageinfo, String s1, 
            String s2, String s3, VersionInfoParcel versioninfoparcel, Bundle bundle1, int i, List list, List list1, 
            Bundle bundle2, boolean flag, Messenger messenger, int j, int k, float f, String s4, 
            boolean flag1, int l, String s5, long l1, String s6, List list2, 
            String s7, NativeAdOptionsParcel nativeadoptionsparcel, long l2, CapabilityParcel capabilityparcel)
    {
        this(11, bundle, adrequestparcel, adsizeparcel, s, applicationinfo, packageinfo, s1, s2, s3, versioninfoparcel, bundle1, i, list, bundle2, flag, messenger, j, k, f, s4, flag1, l, s5, l1, s6, list2, s7, nativeadoptionsparcel, list1, l2, capabilityparcel);
    }

    public AdRequestInfoParcel(zza zza1, String s, String s1, long l)
    {
        this(zza1.zzDx, zza1.zzDy, zza1.zzqf, zza1.zzpZ, zza1.applicationInfo, zza1.zzDz, s, zza1.zzDB, zza1.zzDC, zza1.zzqb, zza1.zzDD, zza1.zzDE, zza1.zzqv, zza1.zzDS, zza1.zzDF, zza1.zzDG, zza1.zzDH, zza1.zzDI, zza1.zzDJ, zza1.zzDK, zza1.zzDL, zza1.zzDM, zza1.zzDN, s1, zza1.zzDP, zza1.zzDQ, zza1.zzDR, zza1.zzpY, zza1.zzqt, l, zza1.zzDU);
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
