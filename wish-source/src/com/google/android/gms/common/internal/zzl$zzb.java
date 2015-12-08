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

        final zzl.zzb zzTV;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            java.util.HashMap hashmap = zzl.zza(zzTV.zzTU);
            hashmap;
            JVM INSTR monitorenter ;
            zzl.zzb.zza(zzTV, ibinder);
            zzl.zzb.zza(zzTV, componentname);
            for (Iterator iterator = com.google.android.gms.common.internal.zzl.zzb.zzb(zzTV).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_80;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzl.zzb.zza(zzTV, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            java.util.HashMap hashmap = zzl.zza(zzTV.zzTU);
            hashmap;
            JVM INSTR monitorenter ;
            zzl.zzb.zza(zzTV, null);
            zzl.zzb.zza(zzTV, componentname);
            for (Iterator iterator = com.google.android.gms.common.internal.zzl.zzb.zzb(zzTV).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzl.zzb.zza(zzTV, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public zza()
        {
            zzTV = zzl.zzb.this;
            super();
        }
    }


    private int mState;
    private IBinder zzSU;
    private ComponentName zzTP;
    private final zza zzTQ = new zza();
    private final Set zzTR = new HashSet();
    private boolean zzTS;
    private final zza zzTT;
    final zzl zzTU;

    static int zza(zza.zzTV zztv, int i)
    {
        zztv.mState = i;
        return i;
    }

    static ComponentName zza(mState mstate, ComponentName componentname)
    {
        mstate.zzTP = componentname;
        return componentname;
    }

    static IBinder zza(zzTP zztp, IBinder ibinder)
    {
        zztp.zzSU = ibinder;
        return ibinder;
    }

    static zzSU zza(zzSU zzsu)
    {
        return zzsu.zzTT;
    }

    static Set zzb(zzTT zztt)
    {
        return zztt.zzTR;
    }

    public IBinder getBinder()
    {
        return zzSU;
    }

    public ComponentName getComponentName()
    {
        return zzTP;
    }

    public int getState()
    {
        return mState;
    }

    public boolean isBound()
    {
        return zzTS;
    }

    public void zza(ServiceConnection serviceconnection, String s)
    {
        zzl.zzc(zzTU).zza(com.google.android.gms.common.internal.zzl.zzb(zzTU), serviceconnection, s, zzTT.zzmh());
        zzTR.add(serviceconnection);
    }

    public boolean zza(ServiceConnection serviceconnection)
    {
        return zzTR.contains(serviceconnection);
    }

    public void zzb(ServiceConnection serviceconnection, String s)
    {
        zzl.zzc(zzTU).zzb(com.google.android.gms.common.internal.zzl.zzb(zzTU), serviceconnection);
        zzTR.remove(serviceconnection);
    }

    public void zzbM(String s)
    {
        zzTS = zzl.zzc(zzTU).zza(com.google.android.gms.common.internal.zzl.zzb(zzTU), s, zzTT.zzmh(), zzTQ, 129);
        if (zzTS)
        {
            mState = 3;
            return;
        } else
        {
            zzl.zzc(zzTU).zza(com.google.android.gms.common.internal.zzl.zzb(zzTU), zzTQ);
            return;
        }
    }

    public void zzbN(String s)
    {
        zzl.zzc(zzTU).zza(com.google.android.gms.common.internal.zzl.zzb(zzTU), zzTQ);
        zzTS = false;
        mState = 2;
    }

    public boolean zzmi()
    {
        return zzTR.isEmpty();
    }

    public zza.zzTV(zzl zzl1, zza.zzTV zztv)
    {
        zzTU = zzl1;
        super();
        zzTT = zztv;
        mState = 2;
    }
}
