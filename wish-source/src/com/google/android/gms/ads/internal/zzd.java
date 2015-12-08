// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzap;
import com.google.android.gms.internal.zzat;
import com.google.android.gms.internal.zzfk;
import com.google.android.gms.internal.zzg;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

class zzd
    implements zzg, Runnable
{

    private zza.zzb zzmw;
    private final List zznq = new Vector();
    private final AtomicReference zznr = new AtomicReference();
    CountDownLatch zzns;

    public zzd(zza.zzb zzb1)
    {
        zzns = new CountDownLatch(1);
        zzmw = zzb1;
        if (zzj.zzbJ().zzfk())
        {
            zzfk.zza(this);
            return;
        } else
        {
            run();
            return;
        }
    }

    private void zzaH()
    {
        if (zznq.isEmpty())
        {
            return;
        }
        Iterator iterator = zznq.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object aobj[] = (Object[])iterator.next();
            if (aobj.length == 1)
            {
                ((zzg)zznr.get()).zza((MotionEvent)aobj[0]);
            } else
            if (aobj.length == 3)
            {
                ((zzg)zznr.get()).zza(((Integer)aobj[0]).intValue(), ((Integer)aobj[1]).intValue(), ((Integer)aobj[2]).intValue());
            }
        } while (true);
        zznq.clear();
    }

    private Context zzk(Context context)
    {
        Context context1;
        if (((Boolean)zzat.zzrq.get()).booleanValue())
        {
            if ((context1 = context.getApplicationContext()) != null)
            {
                return context1;
            }
        }
        return context;
    }

    public void run()
    {
        Exception exception;
        boolean flag;
        if (((Boolean)zzat.zzry.get()).booleanValue() && !zzmw.zzmJ.zzCL)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        zza(zzb(zzmw.zzmJ.zzCI, zzk(zzmw.zzmH), flag));
        zzns.countDown();
        zzmw = null;
        return;
        exception;
        zzns.countDown();
        zzmw = null;
        throw exception;
    }

    public String zza(Context context)
    {
        if (zzaG())
        {
            zzg zzg1 = (zzg)zznr.get();
            if (zzg1 != null)
            {
                zzaH();
                return zzg1.zza(zzk(context));
            }
        }
        return "";
    }

    public String zza(Context context, String s)
    {
        if (zzaG())
        {
            zzg zzg1 = (zzg)zznr.get();
            if (zzg1 != null)
            {
                zzaH();
                return zzg1.zza(zzk(context), s);
            }
        }
        return "";
    }

    public void zza(int i, int j, int k)
    {
        zzg zzg1 = (zzg)zznr.get();
        if (zzg1 != null)
        {
            zzaH();
            zzg1.zza(i, j, k);
            return;
        } else
        {
            zznq.add(((Object) (new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
            })));
            return;
        }
    }

    public void zza(MotionEvent motionevent)
    {
        zzg zzg1 = (zzg)zznr.get();
        if (zzg1 != null)
        {
            zzaH();
            zzg1.zza(motionevent);
            return;
        } else
        {
            zznq.add(((Object) (new Object[] {
                motionevent
            })));
            return;
        }
    }

    protected void zza(zzg zzg1)
    {
        zznr.set(zzg1);
    }

    protected boolean zzaG()
    {
        try
        {
            zzns.await();
        }
        catch (InterruptedException interruptedexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Interrupted during GADSignals creation.", interruptedexception);
            return false;
        }
        return true;
    }

    protected zzg zzb(String s, Context context, boolean flag)
    {
        return com.google.android.gms.internal.zzj.zza(s, context, flag);
    }
}
