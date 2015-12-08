// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.zzp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.internal:
//            zzhl, zzhm

public class zzhk
{
    private static final class zza
    {

        private long zzGW;
        private long zzGX;

        public Bundle toBundle()
        {
            Bundle bundle = new Bundle();
            bundle.putLong("topen", zzGW);
            bundle.putLong("tclose", zzGX);
            return bundle;
        }

        public long zzfW()
        {
            return zzGX;
        }

        public void zzfX()
        {
            zzGX = SystemClock.elapsedRealtime();
        }

        public void zzfY()
        {
            zzGW = SystemClock.elapsedRealtime();
        }

        public zza()
        {
            zzGW = -1L;
            zzGX = -1L;
        }
    }


    private boolean zzFm;
    private final LinkedList zzGN;
    private final String zzGO;
    private final String zzGP;
    private long zzGQ;
    private long zzGR;
    private long zzGS;
    private long zzGT;
    private long zzGU;
    private long zzGV;
    private final zzhl zzpN;
    private final Object zzpc;

    public zzhk(zzhl zzhl1, String s, String s1)
    {
        zzpc = new Object();
        zzGQ = -1L;
        zzGR = -1L;
        zzFm = false;
        zzGS = -1L;
        zzGT = 0L;
        zzGU = -1L;
        zzGV = -1L;
        zzpN = zzhl1;
        zzGO = s;
        zzGP = s1;
        zzGN = new LinkedList();
    }

    public zzhk(String s, String s1)
    {
        this(zzp.zzbA(), s, s1);
    }

    public Bundle toBundle()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        ArrayList arraylist;
        obj1 = new Bundle();
        ((Bundle) (obj1)).putString("seq_num", zzGO);
        ((Bundle) (obj1)).putString("slotid", zzGP);
        ((Bundle) (obj1)).putBoolean("ismediation", zzFm);
        ((Bundle) (obj1)).putLong("treq", zzGU);
        ((Bundle) (obj1)).putLong("tresponse", zzGV);
        ((Bundle) (obj1)).putLong("timp", zzGR);
        ((Bundle) (obj1)).putLong("tload", zzGS);
        ((Bundle) (obj1)).putLong("pcc", zzGT);
        ((Bundle) (obj1)).putLong("tfetch", zzGQ);
        arraylist = new ArrayList();
        for (Iterator iterator = zzGN.iterator(); iterator.hasNext(); arraylist.add(((zza)iterator.next()).toBundle())) { }
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

    public void zzfT()
    {
        synchronized (zzpc)
        {
            if (zzGV != -1L && zzGR == -1L)
            {
                zzGR = SystemClock.elapsedRealtime();
                zzpN.zza(this);
            }
            zzpN.zzgb().zzfT();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzfU()
    {
        synchronized (zzpc)
        {
            if (zzGV != -1L)
            {
                zza zza1 = new zza();
                zza1.zzfY();
                zzGN.add(zza1);
                zzGT = zzGT + 1L;
                zzpN.zzgb().zzfU();
                zzpN.zza(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzfV()
    {
        synchronized (zzpc)
        {
            if (zzGV != -1L && !zzGN.isEmpty())
            {
                zza zza1 = (zza)zzGN.getLast();
                if (zza1.zzfW() == -1L)
                {
                    zza1.zzfX();
                    zzpN.zza(this);
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
        synchronized (zzpc)
        {
            zzGU = SystemClock.elapsedRealtime();
            zzpN.zzgb().zzb(adrequestparcel, zzGU);
        }
        return;
        adrequestparcel;
        obj;
        JVM INSTR monitorexit ;
        throw adrequestparcel;
    }

    public void zzl(long l)
    {
        synchronized (zzpc)
        {
            zzGV = l;
            if (zzGV != -1L)
            {
                zzpN.zza(this);
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
        synchronized (zzpc)
        {
            if (zzGV != -1L)
            {
                zzGQ = l;
                zzpN.zza(this);
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
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzGV == -1L)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        zzGS = SystemClock.elapsedRealtime();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        zzGR = zzGS;
        zzpN.zza(this);
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
        synchronized (zzpc)
        {
            if (zzGV != -1L)
            {
                zzFm = flag;
                zzpN.zza(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
