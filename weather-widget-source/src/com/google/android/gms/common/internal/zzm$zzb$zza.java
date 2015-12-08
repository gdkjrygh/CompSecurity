// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzm

public class zzaee
    implements ServiceConnection
{

    final zzaee zzaee;

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        java.util.HashMap hashmap = zzm.zza(zzaee.d);
        hashmap;
        JVM INSTR monitorenter ;
        d(zzaee, ibinder);
        zzaee(zzaee, componentname);
        for (Iterator iterator = zzaee(zzaee).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
        break MISSING_BLOCK_LABEL_80;
        componentname;
        hashmap;
        JVM INSTR monitorexit ;
        throw componentname;
        d(zzaee, 1);
        hashmap;
        JVM INSTR monitorexit ;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        java.util.HashMap hashmap = zzm.zza(zzaee.d);
        hashmap;
        JVM INSTR monitorenter ;
        d(zzaee, null);
        zzaee(zzaee, componentname);
        for (Iterator iterator = zzaee(zzaee).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
        break MISSING_BLOCK_LABEL_76;
        componentname;
        hashmap;
        JVM INSTR monitorexit ;
        throw componentname;
        cted(zzaee, 2);
        hashmap;
        JVM INSTR monitorexit ;
    }

    public ( )
    {
        zzaee = ;
        super();
    }
}
