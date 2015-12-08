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
//            zzm

private final class mState
{
    public class zza
        implements ServiceConnection
    {

        final zzm.zzb zzaee;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            java.util.HashMap hashmap = zzm.zza(zzaee.zzaed);
            hashmap;
            JVM INSTR monitorenter ;
            zzm.zzb.zza(zzaee, ibinder);
            zzm.zzb.zza(zzaee, componentname);
            for (Iterator iterator = com.google.android.gms.common.internal.zzm.zzb.zzb(zzaee).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_80;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzm.zzb.zza(zzaee, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            java.util.HashMap hashmap = zzm.zza(zzaee.zzaed);
            hashmap;
            JVM INSTR monitorenter ;
            zzm.zzb.zza(zzaee, null);
            zzm.zzb.zza(zzaee, componentname);
            for (Iterator iterator = com.google.android.gms.common.internal.zzm.zzb.zzb(zzaee).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzm.zzb.zza(zzaee, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public zza()
        {
            zzaee = zzm.zzb.this;
            super();
        }
    }


    private int mState;
    private IBinder zzacE;
    private ComponentName zzadY;
    private final zza zzadZ = new zza();
    private final Set zzaea = new HashSet();
    private boolean zzaeb;
    private final zza zzaec;
    final zzm zzaed;

    static int zza(zza.zzaee zzaee, int i)
    {
        zzaee.mState = i;
        return i;
    }

    static ComponentName zza(mState mstate, ComponentName componentname)
    {
        mstate.zzadY = componentname;
        return componentname;
    }

    static IBinder zza(zzadY zzady, IBinder ibinder)
    {
        zzady.zzacE = ibinder;
        return ibinder;
    }

    static zzacE zza(zzacE zzace)
    {
        return zzace.zzaec;
    }

    static Set zzb(zzaec zzaec1)
    {
        return zzaec1.zzaea;
    }

    public IBinder getBinder()
    {
        return zzacE;
    }

    public ComponentName getComponentName()
    {
        return zzadY;
    }

    public int getState()
    {
        return mState;
    }

    public boolean isBound()
    {
        return zzaeb;
    }

    public void zza(ServiceConnection serviceconnection, String s)
    {
        zzm.zzc(zzaed).zza(com.google.android.gms.common.internal.zzm.zzb(zzaed), serviceconnection, s, zzaec.zzoK());
        zzaea.add(serviceconnection);
    }

    public boolean zza(ServiceConnection serviceconnection)
    {
        return zzaea.contains(serviceconnection);
    }

    public void zzb(ServiceConnection serviceconnection, String s)
    {
        zzm.zzc(zzaed).zzb(com.google.android.gms.common.internal.zzm.zzb(zzaed), serviceconnection);
        zzaea.remove(serviceconnection);
    }

    public void zzcl(String s)
    {
        zzaeb = zzm.zzc(zzaed).zza(com.google.android.gms.common.internal.zzm.zzb(zzaed), s, zzaec.zzoK(), zzadZ, 129);
        if (zzaeb)
        {
            mState = 3;
            return;
        }
        try
        {
            zzm.zzc(zzaed).zza(com.google.android.gms.common.internal.zzm.zzb(zzaed), zzadZ);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    public void zzcm(String s)
    {
        zzm.zzc(zzaed).zza(com.google.android.gms.common.internal.zzm.zzb(zzaed), zzadZ);
        zzaeb = false;
        mState = 2;
    }

    public boolean zzoL()
    {
        return zzaea.isEmpty();
    }

    public zza.zzaee(zzm zzm1, zza.zzaee zzaee)
    {
        zzaed = zzm1;
        super();
        zzaec = zzaee;
        mState = 2;
    }
}
