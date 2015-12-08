// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.Locale;

// Referenced classes of package com.google.android.gms.internal:
//            zzhu

public final class zzgr
{
    public static final class zza
    {

        private int zzDI;
        private int zzDJ;
        private float zzDK;
        private int zzFB;
        private boolean zzFC;
        private boolean zzFD;
        private String zzFE;
        private String zzFF;
        private boolean zzFG;
        private boolean zzFH;
        private boolean zzFI;
        private boolean zzFJ;
        private String zzFK;
        private String zzFL;
        private int zzFM;
        private int zzFN;
        private int zzFO;
        private int zzFP;
        private int zzFQ;
        private int zzFR;
        private double zzFS;
        private boolean zzFT;
        private boolean zzFU;
        private int zzFV;
        private String zzFW;

        private void zzA(Context context)
        {
            context = (AudioManager)context.getSystemService("audio");
            zzFB = context.getMode();
            zzFI = context.isMusicActive();
            zzFJ = context.isSpeakerphoneOn();
            zzFM = context.getStreamVolume(3);
            zzFQ = context.getRingerMode();
            zzFR = context.getStreamVolume(2);
        }

        private void zzB(Context context)
        {
            boolean flag = false;
            context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (context != null)
            {
                int i = context.getIntExtra("status", -1);
                int j = context.getIntExtra("level", -1);
                int k = context.getIntExtra("scale", -1);
                zzFS = (float)j / (float)k;
                if (i == 2 || i == 5)
                {
                    flag = true;
                }
                zzFT = flag;
                return;
            } else
            {
                zzFS = -1D;
                zzFT = false;
                return;
            }
        }

        private void zzC(Context context)
        {
            zzFW = Build.FINGERPRINT;
        }

        private static int zza(Context context, ConnectivityManager connectivitymanager, PackageManager packagemanager)
        {
label0:
            {
                int i = -2;
                if (zzp.zzbx().zza(packagemanager, context.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
                {
                    context = connectivitymanager.getActiveNetworkInfo();
                    if (context == null)
                    {
                        break label0;
                    }
                    i = context.getType();
                }
                return i;
            }
            return -1;
        }

        private static ResolveInfo zza(PackageManager packagemanager, String s)
        {
            return packagemanager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)), 0x10000);
        }

        private static String zza(PackageManager packagemanager)
        {
            Object obj = zza(packagemanager, "market://details?id=com.google.android.gms.ads");
            if (obj != null) goto _L2; else goto _L1
_L1:
            return null;
_L2:
            if ((obj = ((ResolveInfo) (obj)).activityInfo) == null) goto _L1; else goto _L3
_L3:
            try
            {
                packagemanager = packagemanager.getPackageInfo(((ActivityInfo) (obj)).packageName, 0);
            }
            // Misplaced declaration of an exception variable
            catch (PackageManager packagemanager)
            {
                return null;
            }
            if (packagemanager == null) goto _L1; else goto _L4
_L4:
            packagemanager = (new StringBuilder()).append(((PackageInfo) (packagemanager)).versionCode).append(".").append(((ActivityInfo) (obj)).packageName).toString();
            return packagemanager;
        }

        private void zza(Context context, PackageManager packagemanager)
        {
            TelephonyManager telephonymanager = (TelephonyManager)context.getSystemService("phone");
            ConnectivityManager connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
            zzFE = telephonymanager.getNetworkOperator();
            zzFN = zza(context, connectivitymanager, packagemanager);
            zzFO = telephonymanager.getNetworkType();
            zzFP = telephonymanager.getPhoneType();
            if (android.os.Build.VERSION.SDK_INT >= 16)
            {
                zzFU = connectivitymanager.isActiveNetworkMetered();
                if (connectivitymanager.getActiveNetworkInfo() != null)
                {
                    zzFV = connectivitymanager.getActiveNetworkInfo().getDetailedState().ordinal();
                    return;
                } else
                {
                    zzFV = -1;
                    return;
                }
            } else
            {
                zzFU = false;
                zzFV = -1;
                return;
            }
        }

        public zzgr zzfN()
        {
            return new zzgr(zzFB, zzFC, zzFD, zzFE, zzFF, zzFG, zzFH, zzFI, zzFJ, zzFK, zzFL, zzFM, zzFN, zzFO, zzFP, zzFQ, zzFR, zzDK, zzDI, zzDJ, zzFS, zzFT, zzFU, zzFV, zzFW);
        }

        public zza(Context context)
        {
            boolean flag1 = true;
            super();
            PackageManager packagemanager = context.getPackageManager();
            zzA(context);
            zza(context, packagemanager);
            zzB(context);
            Locale locale = Locale.getDefault();
            boolean flag;
            if (zza(packagemanager, "geo:0,0?q=donuts") != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzFC = flag;
            if (zza(packagemanager, "http://www.google.com") != null)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            zzFD = flag;
            zzFF = locale.getCountry();
            zzFG = zzk.zzcE().zzgH();
            zzFH = GooglePlayServicesUtil.zzag(context);
            zzFK = locale.getLanguage();
            zzFL = zza(packagemanager);
            context = context.getResources();
            if (context != null)
            {
                if ((context = context.getDisplayMetrics()) != null)
                {
                    zzDK = ((DisplayMetrics) (context)).density;
                    zzDI = ((DisplayMetrics) (context)).widthPixels;
                    zzDJ = ((DisplayMetrics) (context)).heightPixels;
                    return;
                }
            }
        }

        public zza(Context context, zzgr zzgr1)
        {
            PackageManager packagemanager = context.getPackageManager();
            zzA(context);
            zza(context, packagemanager);
            zzB(context);
            zzC(context);
            zzFC = zzgr1.zzFC;
            zzFD = zzgr1.zzFD;
            zzFF = zzgr1.zzFF;
            zzFG = zzgr1.zzFG;
            zzFH = zzgr1.zzFH;
            zzFK = zzgr1.zzFK;
            zzFL = zzgr1.zzFL;
            zzDK = zzgr1.zzDK;
            zzDI = zzgr1.zzDI;
            zzDJ = zzgr1.zzDJ;
        }
    }


    public final int zzDI;
    public final int zzDJ;
    public final float zzDK;
    public final int zzFB;
    public final boolean zzFC;
    public final boolean zzFD;
    public final String zzFE;
    public final String zzFF;
    public final boolean zzFG;
    public final boolean zzFH;
    public final boolean zzFI;
    public final boolean zzFJ;
    public final String zzFK;
    public final String zzFL;
    public final int zzFM;
    public final int zzFN;
    public final int zzFO;
    public final int zzFP;
    public final int zzFQ;
    public final int zzFR;
    public final double zzFS;
    public final boolean zzFT;
    public final boolean zzFU;
    public final int zzFV;
    public final String zzFW;

    zzgr(int i, boolean flag, boolean flag1, String s, String s1, boolean flag2, boolean flag3, 
            boolean flag4, boolean flag5, String s2, String s3, int j, int k, int l, 
            int i1, int j1, int k1, float f, int l1, int i2, double d, boolean flag6, boolean flag7, int j2, String s4)
    {
        zzFB = i;
        zzFC = flag;
        zzFD = flag1;
        zzFE = s;
        zzFF = s1;
        zzFG = flag2;
        zzFH = flag3;
        zzFI = flag4;
        zzFJ = flag5;
        zzFK = s2;
        zzFL = s3;
        zzFM = j;
        zzFN = k;
        zzFO = l;
        zzFP = i1;
        zzFQ = j1;
        zzFR = k1;
        zzDK = f;
        zzDI = l1;
        zzDJ = i2;
        zzFS = d;
        zzFT = flag6;
        zzFU = flag7;
        zzFV = j2;
        zzFW = s4;
    }
}
