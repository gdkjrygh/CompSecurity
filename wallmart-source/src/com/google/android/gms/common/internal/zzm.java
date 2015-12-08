// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.google.android.gms.common.stats.zzb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzl, zzx, zzw

final class zzm extends zzl
    implements android.os.Handler.Callback
{
    private static final class zza
    {

        private final String zzOj;
        private final ComponentName zzadY;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof zza))
                {
                    return false;
                }
                obj = (zza)obj;
                if (!zzw.equal(zzOj, ((zza) (obj)).zzOj) || !zzw.equal(zzadY, ((zza) (obj)).zzadY))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return zzw.hashCode(new Object[] {
                zzOj, zzadY
            });
        }

        public String toString()
        {
            if (zzOj == null)
            {
                return zzadY.flattenToString();
            } else
            {
                return zzOj;
            }
        }

        public Intent zzoK()
        {
            if (zzOj != null)
            {
                return (new Intent(zzOj)).setPackage("com.google.android.gms");
            } else
            {
                return (new Intent()).setComponent(zzadY);
            }
        }

        public zza(ComponentName componentname)
        {
            zzOj = null;
            zzadY = (ComponentName)zzx.zzv(componentname);
        }

        public zza(String s)
        {
            zzOj = zzx.zzcs(s);
            zzadY = null;
        }
    }

    private final class zzb
    {

        private int mState;
        private IBinder zzacE;
        private ComponentName zzadY;
        private final zza zzadZ = new zza(this);
        private final Set zzaea = new HashSet();
        private boolean zzaeb;
        private final zza zzaec;
        final zzm zzaed;

        static int zza(zzb zzb1, int i)
        {
            zzb1.mState = i;
            return i;
        }

        static ComponentName zza(zzb zzb1, ComponentName componentname)
        {
            zzb1.zzadY = componentname;
            return componentname;
        }

        static IBinder zza(zzb zzb1, IBinder ibinder)
        {
            zzb1.zzacE = ibinder;
            return ibinder;
        }

        static zza zza(zzb zzb1)
        {
            return zzb1.zzaec;
        }

        static Set zzb(zzb zzb1)
        {
            return zzb1.zzaea;
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

        public zzb(zza zza1)
        {
            zzaed = zzm.this;
            super();
            zzaec = zza1;
            mState = 2;
        }
    }

    public class zzb.zza
        implements ServiceConnection
    {

        final zzb zzaee;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            HashMap hashmap = zzm.zza(zzaee.zzaed);
            hashmap;
            JVM INSTR monitorenter ;
            zzb.zza(zzaee, ibinder);
            zzb.zza(zzaee, componentname);
            for (Iterator iterator = com.google.android.gms.common.internal.zzb.zzb(zzaee).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_80;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzb.zza(zzaee, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            HashMap hashmap = zzm.zza(zzaee.zzaed);
            hashmap;
            JVM INSTR monitorenter ;
            zzb.zza(zzaee, null);
            zzb.zza(zzaee, componentname);
            for (Iterator iterator = com.google.android.gms.common.internal.zzb.zzb(zzaee).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzb.zza(zzaee, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public zzb.zza(zzb zzb1)
        {
            zzaee = zzb1;
            super();
        }
    }


    private final Handler mHandler;
    private final HashMap zzadV = new HashMap();
    private final com.google.android.gms.common.stats.zzb zzadW = com.google.android.gms.common.stats.zzb.zzpD();
    private final long zzadX = 5000L;
    private final Context zzqO;

    zzm(Context context)
    {
        zzqO = context.getApplicationContext();
        mHandler = new Handler(context.getMainLooper(), this);
    }

    static HashMap zza(zzm zzm1)
    {
        return zzm1.zzadV;
    }

    private boolean zza(zza zza1, ServiceConnection serviceconnection, String s)
    {
        com.google.android.gms.common.internal.zzx.zzb(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = zzadV;
        hashmap;
        JVM INSTR monitorenter ;
        zzb zzb1 = (zzb)zzadV.get(zza1);
        if (zzb1 != null) goto _L2; else goto _L1
_L1:
        zzb1 = new zzb(zza1);
        zzb1.zza(serviceconnection, s);
        zzb1.zzcl(s);
        zzadV.put(zza1, zzb1);
        zza1 = zzb1;
_L7:
        boolean flag = zza1.isBound();
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        mHandler.removeMessages(0, zzb1);
        if (zzb1.zza(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to bind a GmsServiceConnection that was already connected before.  config=").append(zza1).toString());
        }
        break MISSING_BLOCK_LABEL_136;
        zza1;
        hashmap;
        JVM INSTR monitorexit ;
        throw zza1;
        zzb1.zza(serviceconnection, s);
        zzb1.getState();
        JVM INSTR tableswitch 1 2: default 206
    //                   1 172
    //                   2 194;
           goto _L3 _L4 _L5
_L4:
        serviceconnection.onServiceConnected(zzb1.getComponentName(), zzb1.getBinder());
        zza1 = zzb1;
        continue; /* Loop/switch isn't completed */
_L5:
        zzb1.zzcl(s);
        zza1 = zzb1;
        continue; /* Loop/switch isn't completed */
_L3:
        zza1 = zzb1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Context zzb(zzm zzm1)
    {
        return zzm1.zzqO;
    }

    private void zzb(zza zza1, ServiceConnection serviceconnection, String s)
    {
        com.google.android.gms.common.internal.zzx.zzb(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = zzadV;
        hashmap;
        JVM INSTR monitorenter ;
        zzb zzb1 = (zzb)zzadV.get(zza1);
        if (zzb1 != null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        throw new IllegalStateException((new StringBuilder()).append("Nonexistent connection status for service config: ").append(zza1).toString());
        zza1;
        hashmap;
        JVM INSTR monitorexit ;
        throw zza1;
        if (!zzb1.zza(serviceconnection))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=").append(zza1).toString());
        }
        zzb1.zzb(serviceconnection, s);
        if (zzb1.zzoL())
        {
            zza1 = mHandler.obtainMessage(0, zzb1);
            mHandler.sendMessageDelayed(zza1, zzadX);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    static com.google.android.gms.common.stats.zzb zzc(zzm zzm1)
    {
        return zzm1.zzadW;
    }

    public boolean handleMessage(Message message)
    {
        zzb zzb1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            zzb1 = (zzb)message.obj;
            break;
        }
        synchronized (zzadV)
        {
            if (zzb1.zzoL())
            {
                if (zzb1.isBound())
                {
                    zzb1.zzcm("GmsClientSupervisor");
                }
                zzadV.remove(zzb.zza(zzb1));
            }
        }
        return true;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean zza(ComponentName componentname, ServiceConnection serviceconnection, String s)
    {
        return zza(new zza(componentname), serviceconnection, s);
    }

    public boolean zza(String s, ServiceConnection serviceconnection, String s1)
    {
        return zza(new zza(s), serviceconnection, s1);
    }

    public void zzb(ComponentName componentname, ServiceConnection serviceconnection, String s)
    {
        zzb(new zza(componentname), serviceconnection, s);
    }

    public void zzb(String s, ServiceConnection serviceconnection, String s1)
    {
        zzb(new zza(s), serviceconnection, s1);
    }
}
