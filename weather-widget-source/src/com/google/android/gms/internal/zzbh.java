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

    private final Object zzpc = new Object();
    private final int zzrC;
    private final int zzrD;
    private final int zzrE;
    private final zzbm zzrF;
    private ArrayList zzrG;
    private int zzrH;
    private int zzrI;
    private int zzrJ;
    private int zzrK;
    private String zzrL;

    public zzbh(int i, int j, int k, int l)
    {
        zzrG = new ArrayList();
        zzrH = 0;
        zzrI = 0;
        zzrJ = 0;
        zzrL = "";
        zzrC = i;
        zzrD = j;
        zzrE = k;
        zzrF = new zzbm(l);
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

    private void zzx(String s)
    {
        if (s == null || s.length() < zzrE)
        {
            return;
        }
        synchronized (zzpc)
        {
            zzrG.add(s);
            zzrH = zzrH + s.length();
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
            if (((zzbh) (obj)).zzcm() != null && ((zzbh) (obj)).zzcm().equals(zzcm()))
            {
                return true;
            }
        }
        return false;
    }

    public int getScore()
    {
        return zzrK;
    }

    public int hashCode()
    {
        return zzcm().hashCode();
    }

    public String toString()
    {
        return (new StringBuilder()).append("ActivityContent fetchId: ").append(zzrI).append(" score:").append(zzrK).append(" total_length:").append(zzrH).append("\n text: ").append(zza(zzrG, 200)).append("\n signture: ").append(zzrL).toString();
    }

    int zza(int i, int j)
    {
        return zzrC * i + zzrD * j;
    }

    public boolean zzcl()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzrJ == 0)
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

    public String zzcm()
    {
        return zzrL;
    }

    public void zzcn()
    {
        synchronized (zzpc)
        {
            zzrK = zzrK - 100;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzco()
    {
        synchronized (zzpc)
        {
            zzrJ = zzrJ - 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzcp()
    {
        synchronized (zzpc)
        {
            zzrJ = zzrJ + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzcq()
    {
        synchronized (zzpc)
        {
            int i = zza(zzrH, zzrI);
            if (i > zzrK)
            {
                zzrK = i;
                zzrL = zzrF.zza(zzrG);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    int zzcr()
    {
        return zzrH;
    }

    public void zzg(int i)
    {
        zzrI = i;
    }

    public void zzv(String s)
    {
        zzx(s);
        synchronized (zzpc)
        {
            if (zzrJ < 0)
            {
                zzb.zzaC("ActivityContent: negative number of WebViews.");
            }
            zzcq();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzw(String s)
    {
        zzx(s);
    }
}
