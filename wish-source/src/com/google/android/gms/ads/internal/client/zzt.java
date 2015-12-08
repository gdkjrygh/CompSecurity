// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzj

public final class zzt
{
    public static final class zza
    {

        private Date zzi;
        private Location zzm;
        private final HashSet zzqA = new HashSet();
        private String zzql;
        private int zzqm;
        private boolean zzqn;
        private final Bundle zzqo = new Bundle();
        private String zzqq;
        private String zzqr;
        private int zzqt;
        private final Bundle zzqv = new Bundle();
        private final HashSet zzqx = new HashSet();
        private final HashMap zzqy = new HashMap();
        private final HashSet zzqz = new HashSet();

        static Date zza(zza zza1)
        {
            return zza1.zzi;
        }

        static String zzb(zza zza1)
        {
            return zza1.zzql;
        }

        static int zzc(zza zza1)
        {
            return zza1.zzqm;
        }

        static HashSet zzd(zza zza1)
        {
            return zza1.zzqx;
        }

        static Location zze(zza zza1)
        {
            return zza1.zzm;
        }

        static boolean zzf(zza zza1)
        {
            return zza1.zzqn;
        }

        static Bundle zzg(zza zza1)
        {
            return zza1.zzqo;
        }

        static HashMap zzh(zza zza1)
        {
            return zza1.zzqy;
        }

        static String zzi(zza zza1)
        {
            return zza1.zzqq;
        }

        static String zzj(zza zza1)
        {
            return zza1.zzqr;
        }

        static int zzk(zza zza1)
        {
            return zza1.zzqt;
        }

        static HashSet zzl(zza zza1)
        {
            return zza1.zzqz;
        }

        static Bundle zzm(zza zza1)
        {
            return zza1.zzqv;
        }

        static HashSet zzn(zza zza1)
        {
            return zza1.zzqA;
        }

        public void zza(Location location)
        {
            zzm = location;
        }

        public void zza(Class class1, Bundle bundle)
        {
            zzqo.putBundle(class1.getName(), bundle);
        }

        public void zza(Date date)
        {
            zzi = date;
        }

        public void zzi(int i)
        {
            zzqm = i;
        }

        public void zzl(boolean flag)
        {
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            zzqt = i;
        }

        public void zzt(String s)
        {
            zzqx.add(s);
        }

        public void zzu(String s)
        {
            zzqz.add(s);
        }

        public void zzv(String s)
        {
            zzqz.remove(s);
        }

        public zza()
        {
            zzqm = -1;
            zzqn = false;
            zzqt = -1;
        }
    }


    public static final String DEVICE_ID_EMULATOR = zzj.zzbJ().zzai("emulator");
    private final Date zzi;
    private final Set zzk;
    private final Location zzm;
    private final String zzql;
    private final int zzqm;
    private final boolean zzqn;
    private final Bundle zzqo;
    private final Map zzqp;
    private final String zzqq;
    private final String zzqr;
    private final SearchAdRequest zzqs;
    private final int zzqt;
    private final Set zzqu;
    private final Bundle zzqv;
    private final Set zzqw;

    public zzt(zza zza1)
    {
        this(zza1, null);
    }

    public zzt(zza zza1, SearchAdRequest searchadrequest)
    {
        zzi = com.google.android.gms.ads.internal.client.zza.zza(zza1);
        zzql = zza.zzb(zza1);
        zzqm = zza.zzc(zza1);
        zzk = Collections.unmodifiableSet(zza.zzd(zza1));
        zzm = zza.zze(zza1);
        zzqn = zza.zzf(zza1);
        zzqo = zza.zzg(zza1);
        zzqp = Collections.unmodifiableMap(zza.zzh(zza1));
        zzqq = zza.zzi(zza1);
        zzqr = zza.zzj(zza1);
        zzqs = searchadrequest;
        zzqt = zza.zzk(zza1);
        zzqu = Collections.unmodifiableSet(zza.zzl(zza1));
        zzqv = zza.zzm(zza1);
        zzqw = Collections.unmodifiableSet(zza.zzn(zza1));
    }

    public Date getBirthday()
    {
        return zzi;
    }

    public String getContentUrl()
    {
        return zzql;
    }

    public Bundle getCustomTargeting()
    {
        return zzqv;
    }

    public int getGender()
    {
        return zzqm;
    }

    public Set getKeywords()
    {
        return zzk;
    }

    public Location getLocation()
    {
        return zzm;
    }

    public boolean getManualImpressionsEnabled()
    {
        return zzqn;
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return zzqo.getBundle(class1.getName());
    }

    public String getPublisherProvidedId()
    {
        return zzqq;
    }

    public boolean isTestDevice(Context context)
    {
        return zzqu.contains(zzj.zzbJ().zzC(context));
    }

    public String zzbN()
    {
        return zzqr;
    }

    public SearchAdRequest zzbO()
    {
        return zzqs;
    }

    public Map zzbP()
    {
        return zzqp;
    }

    public Bundle zzbQ()
    {
        return zzqo;
    }

    public int zzbR()
    {
        return zzqt;
    }

    public Set zzbS()
    {
        return zzqw;
    }

}
