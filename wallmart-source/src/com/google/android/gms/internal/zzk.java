// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzd, zza, zzl, zzs, 
//            zzo, zzi, zzm, zzr

public abstract class zzk
    implements Comparable
{
    public static final class zza extends Enum
    {

        public static final zza zzT;
        public static final zza zzU;
        public static final zza zzV;
        public static final zza zzW;
        private static final zza zzX[];

        public static zza valueOf(String s)
        {
            return (zza)Enum.valueOf(com/google/android/gms/internal/zzk$zza, s);
        }

        public static zza[] values()
        {
            return (zza[])zzX.clone();
        }

        static 
        {
            zzT = new zza("LOW", 0);
            zzU = new zza("NORMAL", 1);
            zzV = new zza("HIGH", 2);
            zzW = new zza("IMMEDIATE", 3);
            zzX = (new zza[] {
                zzT, zzU, zzV, zzW
            });
        }

        private zza(String s, int i)
        {
            super(s, i);
        }
    }


    private final zzs.zza zzD;
    private final int zzE;
    private final String zzF;
    private final int zzG;
    private final zzm.zza zzH;
    private Integer zzI;
    private zzl zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private long zzN;
    private zzo zzO;
    private zzb.zza zzP;

    public zzk(int i, String s, zzm.zza zza1)
    {
        zzs.zza zza2;
        if (zzs.zza.zzak)
        {
            zza2 = new zzs.zza();
        } else
        {
            zza2 = null;
        }
        zzD = zza2;
        zzK = true;
        zzL = false;
        zzM = false;
        zzN = 0L;
        zzP = null;
        zzE = i;
        zzF = s;
        zzH = zza1;
        zza(new zzd());
        zzG = zzb(s);
    }

    private byte[] zza(Map map, String s)
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        try
        {
            for (map = map.entrySet().iterator(); map.hasNext(); stringbuilder.append('&'))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                stringbuilder.append(URLEncoder.encode((String)entry.getKey(), s));
                stringbuilder.append('=');
                stringbuilder.append(URLEncoder.encode((String)entry.getValue(), s));
            }

        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw new RuntimeException((new StringBuilder()).append("Encoding not supported: ").append(s).toString(), map);
        }
        map = stringbuilder.toString().getBytes(s);
        return map;
    }

    private static int zzb(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            s = Uri.parse(s);
            if (s != null)
            {
                s = s.getHost();
                if (s != null)
                {
                    return s.hashCode();
                }
            }
        }
        return 0;
    }

    static zzs.zza zzd(zzk zzk1)
    {
        return zzk1.zzD;
    }

    public int compareTo(Object obj)
    {
        return zzc((zzk)obj);
    }

    public Map getHeaders()
        throws com.google.android.gms.internal.zza
    {
        return Collections.emptyMap();
    }

    public int getMethod()
    {
        return zzE;
    }

    public String getUrl()
    {
        return zzF;
    }

    public boolean isCanceled()
    {
        return zzL;
    }

    public String toString()
    {
        String s1 = (new StringBuilder()).append("0x").append(Integer.toHexString(zzg())).toString();
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (zzL)
        {
            s = "[X] ";
        } else
        {
            s = "[ ] ";
        }
        return stringbuilder.append(s).append(getUrl()).append(" ").append(s1).append(" ").append(zzs()).append(" ").append(zzI).toString();
    }

    public final zzk zza(int i)
    {
        zzI = Integer.valueOf(i);
        return this;
    }

    public zzk zza(zzb.zza zza1)
    {
        zzP = zza1;
        return this;
    }

    public zzk zza(zzl zzl1)
    {
        zzJ = zzl1;
        return this;
    }

    public zzk zza(zzo zzo1)
    {
        zzO = zzo1;
        return this;
    }

    protected abstract zzm zza(zzi zzi1);

    protected abstract void zza(Object obj);

    protected zzr zzb(zzr zzr1)
    {
        return zzr1;
    }

    public int zzc(zzk zzk1)
    {
        zza zza1 = zzs();
        zza zza2 = zzk1.zzs();
        if (zza1 == zza2)
        {
            return zzI.intValue() - zzk1.zzI.intValue();
        } else
        {
            return zza2.ordinal() - zza1.ordinal();
        }
    }

    public void zzc(zzr zzr1)
    {
        if (zzH != null)
        {
            zzH.zze(zzr1);
        }
    }

    public void zzc(String s)
    {
        if (zzs.zza.zzak)
        {
            zzD.zza(s, Thread.currentThread().getId());
        } else
        if (zzN == 0L)
        {
            zzN = SystemClock.elapsedRealtime();
            return;
        }
    }

    void zzd(String s)
    {
        if (zzJ != null)
        {
            zzJ.zzf(this);
        }
        if (!zzs.zza.zzak) goto _L2; else goto _L1
_L1:
        long l = Thread.currentThread().getId();
        if (Looper.myLooper() == Looper.getMainLooper()) goto _L4; else goto _L3
_L3:
        (new Handler(Looper.getMainLooper())).post(new Runnable(s, l) {

            final String zzQ;
            final long zzR;
            final zzk zzS;

            public void run()
            {
                zzk.zzd(zzS).zza(zzQ, zzR);
                zzk.zzd(zzS).zzd(((Object)this).toString());
            }

            
            {
                zzS = zzk.this;
                zzQ = s;
                zzR = l;
                super();
            }
        });
_L6:
        return;
_L4:
        zzD.zza(s, l);
        zzD.zzd(toString());
        return;
_L2:
        long l1 = SystemClock.elapsedRealtime() - zzN;
        if (l1 >= 3000L)
        {
            com.google.android.gms.internal.zzs.zzb("%d ms: %s", new Object[] {
                Long.valueOf(l1), toString()
            });
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int zzg()
    {
        return zzG;
    }

    public String zzh()
    {
        return getUrl();
    }

    public zzb.zza zzi()
    {
        return zzP;
    }

    protected Map zzj()
        throws com.google.android.gms.internal.zza
    {
        return zzn();
    }

    protected String zzk()
    {
        return zzo();
    }

    public String zzl()
    {
        return zzp();
    }

    public byte[] zzm()
        throws com.google.android.gms.internal.zza
    {
        Map map = zzj();
        if (map != null && map.size() > 0)
        {
            return zza(map, zzk());
        } else
        {
            return null;
        }
    }

    protected Map zzn()
        throws com.google.android.gms.internal.zza
    {
        return null;
    }

    protected String zzo()
    {
        return "UTF-8";
    }

    public String zzp()
    {
        return (new StringBuilder()).append("application/x-www-form-urlencoded; charset=").append(zzo()).toString();
    }

    public byte[] zzq()
        throws com.google.android.gms.internal.zza
    {
        Map map = zzn();
        if (map != null && map.size() > 0)
        {
            return zza(map, zzo());
        } else
        {
            return null;
        }
    }

    public final boolean zzr()
    {
        return zzK;
    }

    public zza zzs()
    {
        return zza.zzU;
    }

    public final int zzt()
    {
        return zzO.zzd();
    }

    public zzo zzu()
    {
        return zzO;
    }

    public void zzv()
    {
        zzM = true;
    }

    public boolean zzw()
    {
        return zzM;
    }
}
