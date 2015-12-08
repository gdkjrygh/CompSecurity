// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            zzbm

public class zzbh
{

    private final Object zzqt = new Object();
    private final int zzrj;
    private final int zzrk;
    private final int zzrl;
    private final zzbm zzrm;
    private ArrayList zzrn;
    private int zzro;
    private int zzrp;
    private int zzrq;
    private int zzrr;
    private String zzrs;

    public zzbh(int i, int j, int k, int l)
    {
        zzrn = new ArrayList();
        zzro = 0;
        zzrp = 0;
        zzrq = 0;
        zzrs = "";
        zzrj = i;
        zzrk = j;
        zzrl = k;
        zzrm = new zzbm(l);
    }

    private String zza(ArrayList arraylist, int i)
    {
        if (arraylist.isEmpty())
        {
            arraylist = "";
        } else
        {
            Object obj = new StringBuffer();
            arraylist = arraylist.iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break;
                }
                ((StringBuffer) (obj)).append((String)arraylist.next());
                ((StringBuffer) (obj)).append(' ');
            } while (((StringBuffer) (obj)).length() <= i);
            ((StringBuffer) (obj)).deleteCharAt(((StringBuffer) (obj)).length() - 1);
            obj = ((StringBuffer) (obj)).toString();
            arraylist = ((ArrayList) (obj));
            if (((String) (obj)).length() >= i)
            {
                return ((String) (obj)).substring(0, i);
            }
        }
        return arraylist;
    }

    private void zzw(String s)
    {
        if (s == null || s.length() < zzrl)
        {
            return;
        }
        synchronized (zzqt)
        {
            zzrn.add(s);
            zzro = zzro + s.length();
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof zzbh)
        {
            if (obj == this)
            {
                return true;
            }
            obj = (zzbh)obj;
            if (((zzbh) (obj)).zzci() != null && ((zzbh) (obj)).zzci().equals(zzci()))
            {
                return true;
            }
        }
        return false;
    }

    public int getScore()
    {
        return zzrr;
    }

    public int hashCode()
    {
        return zzci().hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("ActivityContent fetchId: ").append(zzrp).append(" score:").append(zzrr).append(" total_length:").append(zzro).append("\n text: ").append(zza(zzrn, 200)).append("\n signture: ").append(zzrs).toString();
    }

    int zza(int i, int j)
    {
        return zzrj * i + zzrk * j;
    }

    public boolean zzch()
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzrq == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String zzci()
    {
        return zzrs;
    }

    public void zzcj()
    {
        synchronized (zzqt)
        {
            zzrr = zzrr - 100;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzck()
    {
        synchronized (zzqt)
        {
            zzrq = zzrq - 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzcl()
    {
        synchronized (zzqt)
        {
            zzrq = zzrq + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzcm()
    {
        synchronized (zzqt)
        {
            int i = zza(zzro, zzrp);
            if (i > zzrr)
            {
                zzrr = i;
                zzrs = zzrm.zza(zzrn);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    int zzcn()
    {
        return zzro;
    }

    public void zzg(int i)
    {
        zzrp = i;
    }

    public void zzu(String s)
    {
        zzw(s);
        synchronized (zzqt)
        {
            if (zzrq < 0)
            {
                zzb.zzay("ActivityContent: negative number of WebViews.");
            }
            zzcm();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzv(String s)
    {
        zzw(s);
    }
}
