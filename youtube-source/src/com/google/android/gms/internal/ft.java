// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            fs, fr, fl

public final class ft
    implements ServiceConnection
{

    final fs a;

    public ft(fs fs1)
    {
        a = fs1;
        super();
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        java.util.HashMap hashmap = fr.a(a.a);
        hashmap;
        JVM INSTR monitorenter ;
        fs.a(a, ibinder);
        fs.a(a, componentname);
        for (Iterator iterator = fs.a(a).iterator(); iterator.hasNext(); ((fl)iterator.next()).onServiceConnected(componentname, ibinder)) { }
        break MISSING_BLOCK_LABEL_76;
        componentname;
        throw componentname;
        fs.a(a, 1);
        hashmap;
        JVM INSTR monitorexit ;
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        java.util.HashMap hashmap = fr.a(a.a);
        hashmap;
        JVM INSTR monitorenter ;
        fs.a(a, null);
        fs.a(a, componentname);
        for (Iterator iterator = fs.a(a).iterator(); iterator.hasNext(); ((fl)iterator.next()).onServiceDisconnected(componentname)) { }
        break MISSING_BLOCK_LABEL_72;
        componentname;
        throw componentname;
        fs.a(a, 2);
        hashmap;
        JVM INSTR monitorexit ;
    }
}
