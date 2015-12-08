// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.zzo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.internal:
//            zzhc, zzhd

public class zzhb
{
    private static final class zza
    {

        private long zzFC;
        private long zzFD;

        public Bundle toBundle()
        {
            Bundle bundle = new Bundle();
            bundle.putLong("topen", zzFC);
            bundle.putLong("tclose", zzFD);
            return bundle;
        }

        public long zzfS()
        {
            return zzFD;
        }

        public void zzfT()
        {
            zzFD = SystemClock.elapsedRealtime();
        }

        public void zzfU()
        {
            zzFC = SystemClock.elapsedRealtime();
        }

        public zza()
        {
            zzFC = -1L;
            zzFD = -1L;
        }
    }


    private boolean zzDY;
    private long zzFA;
    private long zzFB;
    private final LinkedList zzFt;
    private final String zzFu;
    private final String zzFv;
    private long zzFw;
    private long zzFx;
    private long zzFy;
    private long zzFz;
    private final zzhc zzpv;
    private final Object zzqt;

    public zzhb(zzhc zzhc1, String s, String s1)
    {
        zzqt = new Object();
        zzFw = -1L;
        zzFx = -1L;
        zzDY = false;
        zzFy = -1L;
        zzFz = 0L;
        zzFA = -1L;
        zzFB = -1L;
        zzpv = zzhc1;
        zzFu = s;
        zzFv = s1;
        zzFt = new LinkedList();
    }

    public zzhb(String s, String s1)
    {
        this(zzo.zzby(), s, s1);
    }

    public Bundle toBundle()
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        ArrayList arraylist;
        obj1 = new Bundle();
        ((Bundle) (obj1)).putString("seq_num", zzFu);
        ((Bundle) (obj1)).putString("slotid", zzFv);
        ((Bundle) (obj1)).putBoolean("ismediation", zzDY);
        ((Bundle) (obj1)).putLong("treq", zzFA);
        ((Bundle) (obj1)).putLong("tresponse", zzFB);
        ((Bundle) (obj1)).putLong("timp", zzFx);
        ((Bundle) (obj1)).putLong("tload", zzFy);
        ((Bundle) (obj1)).putLong("pcc", zzFz);
        ((Bundle) (obj1)).putLong("tfetch", zzFw);
        arraylist = new ArrayList();
        for (Iterator iterator = zzFt.iterator(); iterator.hasNext(); arraylist.add(((zza)iterator.next()).toBundle())) { }
        break MISSING_BLOCK_LABEL_158;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        ((Bundle) (obj1)).putParcelableArrayList("tclick", arraylist);
        obj;
        JVM INSTR monitorexit ;
        return ((Bundle) (obj1));
    }

    public void zzfP()
    {
        synchronized (zzqt)
        {
            if (zzFB != -1L && zzFx == -1L)
            {
                zzFx = SystemClock.elapsedRealtime();
                zzpv.zza(this);
            }
            zzpv.zzfX().zzfP();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzfQ()
    {
        synchronized (zzqt)
        {
            if (zzFB != -1L)
            {
                zza zza1 = new zza();
                zza1.zzfU();
                zzFt.add(zza1);
                zzFz = zzFz + 1L;
                zzpv.zzfX().zzfQ();
                zzpv.zza(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzfR()
    {
        synchronized (zzqt)
        {
            if (zzFB != -1L && !zzFt.isEmpty())
            {
                zza zza1 = (zza)zzFt.getLast();
                if (zza1.zzfS() == -1L)
                {
                    zza1.zzfT();
                    zzpv.zza(this);
                }
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzh(AdRequestParcel adrequestparcel)
    {
        synchronized (zzqt)
        {
            zzFA = SystemClock.elapsedRealtime();
            zzpv.zzfX().zzb(adrequestparcel, zzFA);
        }
        return;
        adrequestparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adrequestparcel;
    }

    public void zzl(long l)
    {
        synchronized (zzqt)
        {
            zzFB = l;
            if (zzFB != -1L)
            {
                zzpv.zza(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzm(long l)
    {
        synchronized (zzqt)
        {
            if (zzFB != -1L)
            {
                zzFw = l;
                zzpv.zza(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzy(boolean flag)
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        if (zzFB == -1L)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        zzFy = SystemClock.elapsedRealtime();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        zzFx = zzFy;
        zzpv.zza(this);
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzz(boolean flag)
    {
        synchronized (zzqt)
        {
            if (zzFB != -1L)
            {
                zzDY = flag;
                zzpv.zza(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
