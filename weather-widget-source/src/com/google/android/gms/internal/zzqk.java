// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.tagmanager.zzbg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzqr, zzlo, zzqn, zzqi, 
//            zzqm, zzlm, zzqz, zzqx, 
//            zzqo, zzql, zzqq

public class zzqk
{
    public static interface zza
    {

        public abstract void zza(zzqo zzqo);
    }

    class zzb extends zzqx
    {

        final zzqk zzaTD;
        private final zza zzaTE;

        protected zzqx.zzb zza(zzqi zzqi1)
        {
            return null;
        }

        protected void zza(zzqo zzqo1)
        {
            zzqo.zza zza1 = zzqo1.zzBw();
            zzaTD.zza(zza1);
            if (zza1.getStatus() == Status.zzaaD && zza1.zzBx() == zzqo.zza.zza.zzaTO && zza1.zzBy() != null && zza1.zzBy().length > 0)
            {
                zzqk.zza(zzaTD).zze(zza1.zzBz().zzBr(), zza1.zzBy());
                zzbg.v("Resource successfully load from Network.");
                zzaTE.zza(zzqo1);
                return;
            }
            StringBuilder stringbuilder = (new StringBuilder()).append("Response status: ");
            if (zza1.getStatus().isSuccess())
            {
                zzqo1 = "SUCCESS";
            } else
            {
                zzqo1 = "FAILURE";
            }
            zzbg.v(stringbuilder.append(zzqo1).toString());
            if (zza1.getStatus().isSuccess())
            {
                zzbg.v((new StringBuilder()).append("Response source: ").append(zza1.zzBx().toString()).toString());
                zzbg.v((new StringBuilder()).append("Response size: ").append(zza1.zzBy().length).toString());
            }
            zzaTD.zza(zza1.zzBz(), zzaTE);
        }

        zzb(zzqn zzqn1, zzql zzql, zza zza1)
        {
            zzaTD = zzqk.this;
            super(zzqn1, zzql);
            zzaTE = zza1;
        }
    }

    static class zzc
    {

        private Object mData;
        private Status zzQA;
        private long zzaTF;

        public long zzBu()
        {
            return zzaTF;
        }

        public void zzQ(Object obj)
        {
            mData = obj;
        }

        public void zzU(long l)
        {
            zzaTF = l;
        }

        public void zzbh(Status status)
        {
            zzQA = status;
        }

        public zzc(Status status, Object obj, long l)
        {
            zzQA = status;
            mData = obj;
            zzaTF = l;
        }
    }


    private final Context mContext;
    private String zzaPw;
    private final Map zzaTA;
    private final zzqr zzaTy;
    Map zzaTz;
    private final zzlm zzpO;

    public zzqk(Context context)
    {
        this(context, ((Map) (new HashMap())), new zzqr(context), zzlo.zzpN());
    }

    zzqk(Context context, Map map, zzqr zzqr1, zzlm zzlm1)
    {
        zzaPw = null;
        zzaTz = new HashMap();
        mContext = context;
        zzpO = zzlm1;
        zzaTy = zzqr1;
        zzaTA = map;
    }

    static zzqr zza(zzqk zzqk1)
    {
        return zzqk1.zzaTy;
    }

    private void zza(zzqn zzqn1, zza zza1)
    {
        boolean flag = true;
        zzqn1 = zzqn1.zzBv();
        if (zzqn1.size() != 1)
        {
            flag = false;
        }
        zzx.zzZ(flag);
        zza((zzqi)zzqn1.get(0), zza1);
    }

    void zza(zzqi zzqi1, zza zza1)
    {
        zzaTy.zza(zzqi1.zzBr(), zzqi1.zzBp(), zzqm.zzaTG, new zzqq(zzqi1, zza1) {

            final zzqi zzaTB;
            final zza zzaTC;
            final zzqk zzaTD;

            public void zza(Status status, Object obj, Integer integer, long l)
            {
                if (status.isSuccess())
                {
                    if (integer == zzqr.zzaUg)
                    {
                        status = zzqo.zza.zza.zzaTQ;
                    } else
                    {
                        status = zzqo.zza.zza.zzaTP;
                    }
                    status = new zzqo.zza(Status.zzaaD, zzaTB, null, (zzqp.zzc)obj, status, l);
                } else
                {
                    status = new zzqo.zza(new Status(16, (new StringBuilder()).append("There is no valid resource for the container: ").append(zzaTB.getContainerId()).toString()), null, zzqo.zza.zza.zzaTP);
                }
                zzaTC.zza(new zzqo(status));
            }

            
            {
                zzaTD = zzqk.this;
                zzaTB = zzqi1;
                zzaTC = zza1;
                super();
            }
        });
    }

    void zza(zzqn zzqn1, zza zza1, zzqx zzqx)
    {
        Iterator iterator = zzqn1.zzBv().iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            zzqi zzqi1 = (zzqi)iterator.next();
            zzc zzc1 = (zzc)zzaTz.get(zzqi1.getContainerId());
            long l;
            if (zzc1 != null)
            {
                l = zzc1.zzBu();
            } else
            {
                l = zzaTy.zzfp(zzqi1.getContainerId());
            }
            if (l + 0xdbba0L < zzpO.currentTimeMillis())
            {
                flag = true;
            }
        } while (true);
        if (flag)
        {
            zzqz zzqz1 = (zzqz)zzaTA.get(zzqn1.getId());
            zza1 = zzqz1;
            if (zzqz1 == null)
            {
                if (zzaPw == null)
                {
                    zza1 = new zzqz();
                } else
                {
                    zza1 = new zzqz(zzaPw);
                }
                zzaTA.put(zzqn1.getId(), zza1);
            }
            zza1.zza(mContext, zzqn1, 0L, zzqx);
            return;
        } else
        {
            zza(zzqn1, zza1);
            return;
        }
    }

    void zza(zzqo.zza zza1)
    {
        Object obj = zza1.zzBz().getContainerId();
        Status status = zza1.getStatus();
        zza1 = zza1.zzBA();
        if (zzaTz.containsKey(obj))
        {
            obj = (zzc)zzaTz.get(obj);
            ((zzc) (obj)).zzU(zzpO.currentTimeMillis());
            if (status == Status.zzaaD)
            {
                ((zzc) (obj)).zzbh(status);
                ((zzc) (obj)).zzQ(zza1);
            }
            return;
        } else
        {
            zzaTz.put(obj, new zzc(status, zza1, zzpO.currentTimeMillis()));
            return;
        }
    }

    public void zza(String s, Integer integer, String s1, zza zza1)
    {
        s = (new zzqn()).zzb(new zzqi(s, integer, s1, false));
        zza(((zzqn) (s)), zza1, ((zzqx) (new zzb(s, zzqm.zzaTG, zza1))));
    }

    public void zzfj(String s)
    {
        zzaPw = s;
    }
}
