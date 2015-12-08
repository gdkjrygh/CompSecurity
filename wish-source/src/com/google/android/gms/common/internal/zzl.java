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
//            zzk, zzv, zzu

final class zzl extends zzk
    implements android.os.Handler.Callback
{
    private static final class zza
    {

        private final ComponentName zzTP;
        private final String zzso;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof zza))
                {
                    return false;
                }
                obj = (zza)obj;
                if (!zzu.equal(zzso, ((zza) (obj)).zzso) || !zzu.equal(zzTP, ((zza) (obj)).zzTP))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return zzu.hashCode(new Object[] {
                zzso, zzTP
            });
        }

        public String toString()
        {
            if (zzso == null)
            {
                return zzTP.flattenToString();
            } else
            {
                return zzso;
            }
        }

        public Intent zzmh()
        {
            if (zzso != null)
            {
                return (new Intent(zzso)).setPackage("com.google.android.gms");
            } else
            {
                return (new Intent()).setComponent(zzTP);
            }
        }

        public zza(ComponentName componentname)
        {
            zzso = null;
            zzTP = (ComponentName)zzv.zzr(componentname);
        }

        public zza(String s)
        {
            zzso = zzv.zzbS(s);
            zzTP = null;
        }
    }

    private final class zzb
    {

        private int mState;
        private IBinder zzSU;
        private ComponentName zzTP;
        private final zza zzTQ = new zza(this);
        private final Set zzTR = new HashSet();
        private boolean zzTS;
        private final zza zzTT;
        final zzl zzTU;

        static int zza(zzb zzb1, int i)
        {
            zzb1.mState = i;
            return i;
        }

        static ComponentName zza(zzb zzb1, ComponentName componentname)
        {
            zzb1.zzTP = componentname;
            return componentname;
        }

        static IBinder zza(zzb zzb1, IBinder ibinder)
        {
            zzb1.zzSU = ibinder;
            return ibinder;
        }

        static zza zza(zzb zzb1)
        {
            return zzb1.zzTT;
        }

        static Set zzb(zzb zzb1)
        {
            return zzb1.zzTR;
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

        public zzb(zza zza1)
        {
            zzTU = zzl.this;
            super();
            zzTT = zza1;
            mState = 2;
        }
    }

    public class zzb.zza
        implements ServiceConnection
    {

        final zzb zzTV;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            HashMap hashmap = zzl.zza(zzTV.zzTU);
            hashmap;
            JVM INSTR monitorenter ;
            zzb.zza(zzTV, ibinder);
            zzb.zza(zzTV, componentname);
            for (Iterator iterator = com.google.android.gms.common.internal.zzb.zzb(zzTV).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceConnected(componentname, ibinder)) { }
            break MISSING_BLOCK_LABEL_80;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzb.zza(zzTV, 1);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            HashMap hashmap = zzl.zza(zzTV.zzTU);
            hashmap;
            JVM INSTR monitorenter ;
            zzb.zza(zzTV, null);
            zzb.zza(zzTV, componentname);
            for (Iterator iterator = com.google.android.gms.common.internal.zzb.zzb(zzTV).iterator(); iterator.hasNext(); ((ServiceConnection)iterator.next()).onServiceDisconnected(componentname)) { }
            break MISSING_BLOCK_LABEL_76;
            componentname;
            hashmap;
            JVM INSTR monitorexit ;
            throw componentname;
            zzb.zza(zzTV, 2);
            hashmap;
            JVM INSTR monitorexit ;
        }

        public zzb.zza(zzb zzb1)
        {
            zzTV = zzb1;
            super();
        }
    }


    private final Handler mHandler;
    private final HashMap zzTM = new HashMap();
    private final com.google.android.gms.common.stats.zzb zzTN = com.google.android.gms.common.stats.zzb.zzna();
    private final long zzTO = 5000L;
    private final Context zzoh;

    zzl(Context context)
    {
        zzoh = context.getApplicationContext();
        mHandler = new Handler(context.getMainLooper(), this);
    }

    static HashMap zza(zzl zzl1)
    {
        return zzl1.zzTM;
    }

    private boolean zza(zza zza1, ServiceConnection serviceconnection, String s)
    {
        com.google.android.gms.common.internal.zzv.zzb(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = zzTM;
        hashmap;
        JVM INSTR monitorenter ;
        zzb zzb1 = (zzb)zzTM.get(zza1);
        if (zzb1 != null) goto _L2; else goto _L1
_L1:
        zzb1 = new zzb(zza1);
        zzb1.zza(serviceconnection, s);
        zzb1.zzbM(s);
        zzTM.put(zza1, zzb1);
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
        zzb1.zzbM(s);
        zza1 = zzb1;
        continue; /* Loop/switch isn't completed */
_L3:
        zza1 = zzb1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static Context zzb(zzl zzl1)
    {
        return zzl1.zzoh;
    }

    private void zzb(zza zza1, ServiceConnection serviceconnection, String s)
    {
        com.google.android.gms.common.internal.zzv.zzb(serviceconnection, "ServiceConnection must not be null");
        HashMap hashmap = zzTM;
        hashmap;
        JVM INSTR monitorenter ;
        zzb zzb1 = (zzb)zzTM.get(zza1);
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
        if (zzb1.zzmi())
        {
            zza1 = mHandler.obtainMessage(0, zzb1);
            mHandler.sendMessageDelayed(zza1, zzTO);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    static com.google.android.gms.common.stats.zzb zzc(zzl zzl1)
    {
        return zzl1.zzTN;
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
        synchronized (zzTM)
        {
            if (zzb1.zzmi())
            {
                if (zzb1.isBound())
                {
                    zzb1.zzbN("GmsClientSupervisor");
                }
                zzTM.remove(zzb.zza(zzb1));
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
