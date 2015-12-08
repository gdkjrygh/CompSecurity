// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.AbstractPendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.zzht;
import com.google.android.gms.internal.zzhv;
import com.google.android.gms.internal.zzml;
import com.google.android.gms.internal.zzmp;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcb, zzcn, zzcm, zzbe, 
//            zzs, zzbg, zzo, zzcd, 
//            TagManager, ContainerHolder, Container

public class zzp extends AbstractPendingResult
{
    private class zzd
        implements zzo.zza
    {

        final zzp zzaCL;

        private zzd()
        {
            zzaCL = zzp.this;
            super();
        }

    }

    static interface zze
        extends Releasable
    {

        public abstract void zzdE(String s);
    }

    static interface zzf
        extends Releasable
    {
    }


    private final Context mContext;
    private final Looper zzPx;
    private final zzcd zzaCA;
    private final int zzaCB;
    private zzf zzaCC;
    private zzml zzaCD;
    private volatile zzo zzaCE;
    private com.google.android.gms.internal.zzc.zzj zzaCG;
    private String zzaCH;
    private zze zzaCI;
    private final String zzaCk;
    private final TagManager zzaCw;
    private final zzd zzaCz;
    private final zzht zznR;

    zzp(Context context, TagManager tagmanager, Looper looper, String s, int i, zzf zzf1, zze zze1, 
            zzml zzml1, zzht zzht, zzcd zzcd)
    {
        Looper looper1;
        if (looper == null)
        {
            looper1 = Looper.getMainLooper();
        } else
        {
            looper1 = looper;
        }
        super(looper1);
        mContext = context;
        zzaCw = tagmanager;
        context = looper;
        if (looper == null)
        {
            context = Looper.getMainLooper();
        }
        zzPx = context;
        zzaCk = s;
        zzaCB = i;
        zzaCC = zzf1;
        zzaCI = zze1;
        zzaCD = zzml1;
        zzaCz = new zzd();
        zzaCG = new com.google.android.gms.internal.zzc.zzj();
        zznR = zzht;
        zzaCA = zzcd;
        if (zzwy())
        {
            zzdB(zzcb.zzxj().zzxl());
        }
    }

    public zzp(Context context, TagManager tagmanager, Looper looper, String s, int i, zzs zzs1)
    {
        this(context, tagmanager, looper, s, i, ((zzf) (new zzcn(context, s))), ((zze) (new zzcm(context, s, zzs1))), new zzml(context), zzhv.zznc(), ((zzcd) (new zzbe(30, 0xdbba0L, 5000L, "refreshing", zzhv.zznc()))));
        zzaCD.zzem(zzs1.zzwB());
    }

    static zzo zza(zzp zzp1, zzo zzo1)
    {
        zzp1.zzaCE = zzo1;
        return zzo1;
    }

    static String zza(zzp zzp1)
    {
        return zzp1.zzaCk;
    }

    static TagManager zzb(zzp zzp1)
    {
        return zzp1.zzaCw;
    }

    static Looper zzc(zzp zzp1)
    {
        return zzp1.zzPx;
    }

    static Context zzd(zzp zzp1)
    {
        return zzp1.mContext;
    }

    static zzo zzf(zzp zzp1)
    {
        return zzp1.zzaCE;
    }

    private boolean zzwy()
    {
        zzcb zzcb1 = zzcb.zzxj();
        return (zzcb1.zzxk() == zzcb.zza.zzaEv || zzcb1.zzxk() == zzcb.zza.zzaEw) && zzaCk.equals(zzcb1.getContainerId());
    }

    protected Result createFailedResult(Status status)
    {
        return zzaO(status);
    }

    public void load(String s)
    {
        Integer integer;
        if (zzaCB != -1)
        {
            integer = Integer.valueOf(zzaCB);
        } else
        {
            integer = null;
        }
        zzaCD.zza(zzaCk, integer, s, new com.google.android.gms.internal.zzml.zza(s) {

            final String zzaCK;
            final zzp zzaCL;

            public void zza(zzmp zzmp1)
            {
                if (zzmp1.getStatus() != Status.zzQU)
                {
                    zzbg.zzak((new StringBuilder()).append("Load request failed for the container ").append(zzp.zza(zzaCL)).toString());
                    zzaCL.setResult(zzaCL.zzaO(Status.zzQW));
                    return;
                }
                com.google.android.gms.internal.zzmq.zzc zzc1 = zzmp1.zzyk().zzyo();
                if (zzc1 == null)
                {
                    zzbg.zzak("Response doesn't have the requested container");
                    zzaCL.setResult(zzaCL.zzaO(new Status(8, "Response doesn't have the requested container", null)));
                    return;
                } else
                {
                    long l = zzmp1.zzyk().zzyp();
                    zzp.zza(zzaCL, new zzo(zzp.zzb(zzaCL), zzp.zzc(zzaCL), new Container(zzp.zzd(zzaCL), zzp.zzb(zzaCL).getDataLayer(), zzp.zza(zzaCL), l, zzc1), new zzo.zza(this) {

                        final _cls1 zzaCM;

            
            {
                zzaCM = _pcls1;
                super();
            }
                    }));
                    zzaCL.setResult(zzp.zzf(zzaCL));
                    return;
                }
            }

            
            {
                zzaCL = zzp.this;
                zzaCK = s;
                super();
            }
        });
    }

    protected ContainerHolder zzaO(Status status)
    {
        if (zzaCE != null)
        {
            return zzaCE;
        }
        if (status == Status.zzQX)
        {
            zzbg.zzak("timer expired: setting result to failure");
        }
        return new zzo(status);
    }

    void zzdB(String s)
    {
        this;
        JVM INSTR monitorenter ;
        zzaCH = s;
        if (zzaCI != null)
        {
            zzaCI.zzdE(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
