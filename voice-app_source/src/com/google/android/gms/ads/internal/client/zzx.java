// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzk, zzl

public final class zzx
{
    public static final class zza
    {

        private Date zzaQ;
        private Location zzaU;
        private String zzsB;
        private int zzsC;
        private boolean zzsD;
        private final Bundle zzsE = new Bundle();
        private String zzsG;
        private String zzsH;
        private int zzsJ;
        private final Bundle zzsL = new Bundle();
        private final HashSet zzsN = new HashSet();
        private final HashMap zzsO = new HashMap();
        private final HashSet zzsP = new HashSet();
        private final HashSet zzsQ = new HashSet();

        static Date zza(zza zza1)
        {
            return zza1.zzaQ;
        }

        static String zzb(zza zza1)
        {
            return zza1.zzsB;
        }

        static int zzc(zza zza1)
        {
            return zza1.zzsC;
        }

        static HashSet zzd(zza zza1)
        {
            return zza1.zzsN;
        }

        static Location zze(zza zza1)
        {
            return zza1.zzaU;
        }

        static boolean zzf(zza zza1)
        {
            return zza1.zzsD;
        }

        static Bundle zzg(zza zza1)
        {
            return zza1.zzsE;
        }

        static HashMap zzh(zza zza1)
        {
            return zza1.zzsO;
        }

        static String zzi(zza zza1)
        {
            return zza1.zzsG;
        }

        static String zzj(zza zza1)
        {
            return zza1.zzsH;
        }

        static int zzk(zza zza1)
        {
            return zza1.zzsJ;
        }

        static HashSet zzl(zza zza1)
        {
            return zza1.zzsP;
        }

        static Bundle zzm(zza zza1)
        {
            return zza1.zzsL;
        }

        static HashSet zzn(zza zza1)
        {
            return zza1.zzsQ;
        }

        public void zzE(String s)
        {
            zzsN.add(s);
        }

        public void zzF(String s)
        {
            zzsP.add(s);
        }

        public void zzG(String s)
        {
            zzsP.remove(s);
        }

        public void zzH(String s)
        {
            zzsB = s;
        }

        public void zzI(String s)
        {
            zzsG = s;
        }

        public void zzJ(String s)
        {
            zzsH = s;
        }

        public void zzK(String s)
        {
            zzsQ.add(s);
        }

        public void zza(Location location)
        {
            zzaU = location;
        }

        public void zza(NetworkExtras networkextras)
        {
            if (networkextras instanceof AdMobExtras)
            {
                zza(com/google/ads/mediation/admob/AdMobAdapter, ((AdMobExtras)networkextras).getExtras());
                return;
            } else
            {
                zzsO.put(networkextras.getClass(), networkextras);
                return;
            }
        }

        public void zza(Class class1, Bundle bundle)
        {
            zzsE.putBundle(class1.getName(), bundle);
        }

        public void zza(Date date)
        {
            zzaQ = date;
        }

        public void zzb(Class class1, Bundle bundle)
        {
            if (zzsE.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null)
            {
                zzsE.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
            }
            zzsE.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter").putBundle(class1.getName(), bundle);
        }

        public void zzb(String s, String s1)
        {
            zzsL.putString(s, s1);
        }

        public void zzj(boolean flag)
        {
            zzsD = flag;
        }

        public void zzk(boolean flag)
        {
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            zzsJ = i;
        }

        public void zzm(int i)
        {
            zzsC = i;
        }

        public zza()
        {
            zzsC = -1;
            zzsD = false;
            zzsJ = -1;
        }
    }


    public static final String DEVICE_ID_EMULATOR = zzk.zzcA().zzax("emulator");
    private final Date zzaQ;
    private final Set zzaS;
    private final Location zzaU;
    private final String zzsB;
    private final int zzsC;
    private final boolean zzsD;
    private final Bundle zzsE;
    private final Map zzsF;
    private final String zzsG;
    private final String zzsH;
    private final SearchAdRequest zzsI;
    private final int zzsJ;
    private final Set zzsK;
    private final Bundle zzsL;
    private final Set zzsM;

    public zzx(zza zza1)
    {
        this(zza1, null);
    }

    public zzx(zza zza1, SearchAdRequest searchadrequest)
    {
        zzaQ = com.google.android.gms.ads.internal.client.zza.zza(zza1);
        zzsB = zza.zzb(zza1);
        zzsC = zza.zzc(zza1);
        zzaS = Collections.unmodifiableSet(zza.zzd(zza1));
        zzaU = zza.zze(zza1);
        zzsD = zza.zzf(zza1);
        zzsE = zza.zzg(zza1);
        zzsF = Collections.unmodifiableMap(zza.zzh(zza1));
        zzsG = zza.zzi(zza1);
        zzsH = zza.zzj(zza1);
        zzsI = searchadrequest;
        zzsJ = zza.zzk(zza1);
        zzsK = Collections.unmodifiableSet(zza.zzl(zza1));
        zzsL = zza.zzm(zza1);
        zzsM = Collections.unmodifiableSet(zza.zzn(zza1));
    }

    public static void updateCorrelator()
    {
        zzk.zzcC().zzcG();
    }

    public Date getBirthday()
    {
        return zzaQ;
    }

    public String getContentUrl()
    {
        return zzsB;
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        Bundle bundle = zzsE.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null)
        {
            return bundle.getBundle(class1.getClass().getName());
        } else
        {
            return null;
        }
    }

    public Bundle getCustomTargeting()
    {
        return zzsL;
    }

    public int getGender()
    {
        return zzsC;
    }

    public Set getKeywords()
    {
        return zzaS;
    }

    public Location getLocation()
    {
        return zzaU;
    }

    public boolean getManualImpressionsEnabled()
    {
        return zzsD;
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return (NetworkExtras)zzsF.get(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return zzsE.getBundle(class1.getName());
    }

    public String getPublisherProvidedId()
    {
        return zzsG;
    }

    public boolean isTestDevice(Context context)
    {
        return zzsK.contains(zzk.zzcA().zzO(context));
    }

    public String zzcH()
    {
        return zzsH;
    }

    public SearchAdRequest zzcI()
    {
        return zzsI;
    }

    public Map zzcJ()
    {
        return zzsF;
    }

    public Bundle zzcK()
    {
        return zzsE;
    }

    public int zzcL()
    {
        return zzsJ;
    }

    public Set zzcM()
    {
        return zzsM;
    }

}
