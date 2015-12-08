// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.stats.zzb;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzl

private final class mState
{
    public class zza
        implements ServiceConnection
    {

        final zzl.zzb zzaaU;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            java.util.HashMap hashmap = zzl.zza(zzaaU.zzaaT);
            hashmap;
            JVM INSTR monitorenter ;
            zzl.zzb.zza(zzaaU, ibinder);
            zzl.zzb.zza(zzaaU, componentname);
            for (Iterator iterator = com.google.android.gms.common.internal.zzl.zzb.zzb(zzaaU).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_80;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzl.zzb.zza(zzaaU, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            java.util.HashMap hashmap = zzl.zza(zzaaU.zzaaT);
            hashmap;
            JVM INSTR monitorenter ;
            zzl.zzb.zza(zzaaU, null);
            zzl.zzb.zza(zzaaU, componentname);
            for (Iterator iterator = com.google.android.gms.common.internal.zzl.zzb.zzb(zzaaU).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzl.zzb.zza(zzaaU, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public zza()
        {
            zzaaU = zzl.zzb.this;
            super();
        }
    }


    private int mState;
    private IBinder zzZQ;
    private ComponentName zzaaO;
    private final zza zzaaP = new zza();
    private final Set zzaaQ = new HashSet();
    private boolean zzaaR;
    private final zza zzaaS;
    final zzl zzaaT;

    static int zza(zza.zzaaU zzaau, int i)
    {
        zzaau.mState = i;
        return i;
    }

    static ComponentName zza(mState mstate, ComponentName componentname)
    {
        mstate.zzaaO = componentname;
        return componentname;
    }

    static IBinder zza(zzaaO zzaao, IBinder ibinder)
    {
        zzaao.zzZQ = ibinder;
        return ibinder;
    }

    static zzZQ zza(zzZQ zzzq)
    {
        return zzzq.zzaaS;
    }

    static Set zzb(zzaaS zzaas)
    {
        return zzaas.zzaaQ;
    }

    public IBinder getBinder()
    {
        return zzZQ;
    }

    public ComponentName getComponentName()
    {
        return zzaaO;
    }

    public int getState()
    {
        return mState;
    }

    public boolean isBound()
    {
        return zzaaR;
    }

    public void zza(ServiceConnection serviceconnection, String s)
    {
        zzl.zzc(zzaaT).zza(com.google.android.gms.common.internal.zzl.zzb(zzaaT), serviceconnection, s, zzaaS.zznV());
        zzaaQ.add(serviceconnection);
    }

    public boolean zza(ServiceConnection serviceconnection)
    {
        return zzaaQ.contains(serviceconnection);
    }

    public void zzb(ServiceConnection serviceconnection, String s)
    {
        zzl.zzc(zzaaT).zzb(com.google.android.gms.common.internal.zzl.zzb(zzaaT), serviceconnection);
        zzaaQ.remove(serviceconnection);
    }

    public void zzcc(String s)
    {
        zzaaR = zzl.zzc(zzaaT).zza(com.google.android.gms.common.internal.zzl.zzb(zzaaT), s, zzaaS.zznV(), zzaaP, 129);
        if (zzaaR)
        {
            mState = 3;
            return;
        }
        try
        {
            zzl.zzc(zzaaT).zza(com.google.android.gms.common.internal.zzl.zzb(zzaaT), zzaaP);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void zzcd(String s)
    {
        zzl.zzc(zzaaT).zza(com.google.android.gms.common.internal.zzl.zzb(zzaaT), zzaaP);
        zzaaR = false;
        mState = 2;
    }

    public boolean zznW()
    {
        return zzaaQ.isEmpty();
    }

    public zza.zzaaU(zzl zzl1, zza.zzaaU zzaau)
    {
        zzaaT = zzl1;
        super();
        zzaaS = zzaau;
        mState = 2;
    }
}
