// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzl, zzx, zzf, ValidateAccountRequest, 
//            zzs, GetServiceRequest, zzp

public abstract class zzj
    implements com.google.android.gms.common.api.Api.zzb, zzk.zza
{
    private abstract class zza extends zzc
    {

        public final int statusCode;
        public final Bundle zzadG;
        final zzj zzadH;

        protected void zzc(Boolean boolean1)
        {
            Object obj = null;
            if (boolean1 != null) goto _L2; else goto _L1
_L1:
            zzj.zza(zzadH, 1, null);
_L4:
            return;
_L2:
            switch (statusCode)
            {
            default:
                zzj.zza(zzadH, 1, null);
                boolean1 = obj;
                if (zzadG != null)
                {
                    boolean1 = (PendingIntent)zzadG.getParcelable("pendingIntent");
                }
                zzi(new ConnectionResult(statusCode, boolean1));
                return;

            case 0: // '\0'
                if (!zzoD())
                {
                    zzj.zza(zzadH, 1, null);
                    zzi(new ConnectionResult(8, null));
                    return;
                }
                break;

            case 10: // '\n'
                zzj.zza(zzadH, 1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected abstract void zzi(ConnectionResult connectionresult);

        protected abstract boolean zzoD();

        protected void zzoE()
        {
        }

        protected void zzs(Object obj)
        {
            zzc((Boolean)obj);
        }

        protected zza(int i, Bundle bundle)
        {
            zzadH = zzj.this;
            super(Boolean.valueOf(true));
            statusCode = i;
            zzadG = bundle;
        }
    }

    final class zzb extends Handler
    {

        final zzj zzadH;

        private void zza(Message message)
        {
            message = (zzc)message.obj;
            message.zzoE();
            message.unregister();
        }

        private boolean zzb(Message message)
        {
            return message.what == 2 || message.what == 1 || message.what == 5 || message.what == 6;
        }

        public void handleMessage(Message message)
        {
            if (zzadH.zzadE.get() != message.arg1)
            {
                if (zzb(message))
                {
                    zza(message);
                }
                return;
            }
            if ((message.what == 1 || message.what == 5 || message.what == 6) && !zzadH.isConnecting())
            {
                zza(message);
                return;
            }
            if (message.what == 3)
            {
                message = new ConnectionResult(message.arg2, null);
                zzj.zza(zzadH).zza(message);
                zzadH.onConnectionFailed(message);
                return;
            }
            if (message.what == 4)
            {
                zzj.zza(zzadH, 4, null);
                if (zzj.zzb(zzadH) != null)
                {
                    zzj.zzb(zzadH).onConnectionSuspended(message.arg2);
                }
                zzadH.onConnectionSuspended(message.arg2);
                zzj.zza(zzadH, 4, 1, null);
                return;
            }
            if (message.what == 2 && !zzadH.isConnected())
            {
                zza(message);
                return;
            }
            if (zzb(message))
            {
                ((zzc)message.obj).zzoF();
                return;
            } else
            {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
                return;
            }
        }

        public zzb(Looper looper)
        {
            zzadH = zzj.this;
            super(looper);
        }
    }

    protected abstract class zzc
    {

        private Object mListener;
        final zzj zzadH;
        private boolean zzadI;

        public void unregister()
        {
            zzoG();
            synchronized (zzj.zzc(zzadH))
            {
                zzj.zzc(zzadH).remove(this);
            }
            return;
            exception;
            arraylist;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected abstract void zzoE();

        public void zzoF()
        {
            this;
            JVM INSTR monitorenter ;
            Object obj;
            obj = mListener;
            if (zzadI)
            {
                Log.w("GmsClient", (new StringBuilder()).append("Callback proxy ").append(this).append(" being reused. This is not safe.").toString());
            }
            this;
            JVM INSTR monitorexit ;
            Object obj1;
            if (obj != null)
            {
                try
                {
                    zzs(obj);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    zzoE();
                    throw obj1;
                }
            } else
            {
                zzoE();
            }
            this;
            JVM INSTR monitorenter ;
            zzadI = true;
            this;
            JVM INSTR monitorexit ;
            unregister();
            return;
            obj1;
            this;
            JVM INSTR monitorexit ;
            throw obj1;
            obj1;
            this;
            JVM INSTR monitorexit ;
            throw obj1;
        }

        public void zzoG()
        {
            this;
            JVM INSTR monitorenter ;
            mListener = null;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            this;
            JVM INSTR monitorexit ;
            throw exception;
        }

        protected abstract void zzs(Object obj);

        public zzc(Object obj)
        {
            zzadH = zzj.this;
            super();
            mListener = obj;
            zzadI = false;
        }
    }

    public static final class zzd extends zzr.zza
    {

        private zzj zzadJ;
        private final int zzadK;

        private void zzoH()
        {
            zzadJ = null;
        }

        public void zza(int i, IBinder ibinder, Bundle bundle)
        {
            zzx.zzb(zzadJ, "onPostInitComplete can be called only once per call to getRemoteService");
            zzadJ.zza(i, ibinder, bundle, zzadK);
            zzoH();
        }

        public void zzb(int i, Bundle bundle)
        {
            zzx.zzb(zzadJ, "onAccountValidationComplete can be called only once per call to validateAccount");
            zzadJ.zza(i, bundle, zzadK);
            zzoH();
        }

        public zzd(zzj zzj1, int i)
        {
            zzadJ = zzj1;
            zzadK = i;
        }
    }

    public final class zze
        implements ServiceConnection
    {

        final zzj zzadH;
        private final int zzadK;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            zzx.zzb(ibinder, "Expecting a valid IBinder");
            zzj.zza(zzadH, zzs.zza.zzaK(ibinder));
            zzadH.zzbA(zzadK);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            zzadH.mHandler.sendMessage(zzadH.mHandler.obtainMessage(4, zzadK, 1));
        }

        public zze(int i)
        {
            zzadH = zzj.this;
            super();
            zzadK = i;
        }
    }

    protected class zzf
        implements com.google.android.gms.common.api.GoogleApiClient.zza
    {

        final zzj zzadH;

        public void zza(ConnectionResult connectionresult)
        {
            if (connectionresult.isSuccess())
            {
                zzadH.zza(null, zzj.zzd(zzadH));
            } else
            if (zzj.zze(zzadH) != null)
            {
                zzj.zze(zzadH).onConnectionFailed(connectionresult);
                return;
            }
        }

        public void zzb(ConnectionResult connectionresult)
        {
            throw new IllegalStateException("Legacy GmsClient received onReportAccountValidation callback.");
        }

        public zzf()
        {
            zzadH = zzj.this;
            super();
        }
    }

    protected final class zzg extends zza
    {

        final zzj zzadH;
        public final IBinder zzadL;

        protected void zzi(ConnectionResult connectionresult)
        {
            if (zzj.zze(zzadH) != null)
            {
                zzj.zze(zzadH).onConnectionFailed(connectionresult);
            }
            zzadH.onConnectionFailed(connectionresult);
        }

        protected boolean zzoD()
        {
            String s;
            try
            {
                s = zzadL.getInterfaceDescriptor();
            }
            catch (RemoteException remoteexception)
            {
                Log.w("GmsClient", "service probably died");
                return false;
            }
            if (!zzadH.zzfB().equals(s))
            {
                Log.e("GmsClient", (new StringBuilder()).append("service descriptor mismatch: ").append(zzadH.zzfB()).append(" vs. ").append(s).toString());
            } else
            {
                IInterface iinterface = zzadH.zzV(zzadL);
                if (iinterface != null && zzj.zza(zzadH, 2, 3, iinterface))
                {
                    Bundle bundle = zzadH.zzmw();
                    if (zzj.zzb(zzadH) != null)
                    {
                        zzj.zzb(zzadH).onConnected(bundle);
                    }
                    return true;
                }
            }
            return false;
        }

        public zzg(int i, IBinder ibinder, Bundle bundle)
        {
            zzadH = zzj.this;
            super(i, bundle);
            zzadL = ibinder;
        }
    }

    protected final class zzh extends zza
    {

        final zzj zzadH;

        protected void zzi(ConnectionResult connectionresult)
        {
            zzj.zza(zzadH).zza(connectionresult);
            zzadH.onConnectionFailed(connectionresult);
        }

        protected boolean zzoD()
        {
            zzj.zza(zzadH).zza(ConnectionResult.zzYi);
            return true;
        }

        public zzh()
        {
            zzadH = zzj.this;
            super(0, null);
        }
    }

    protected final class zzi extends zza
    {

        final zzj zzadH;

        protected void zzi(ConnectionResult connectionresult)
        {
            zzj.zza(zzadH).zzb(connectionresult);
            zzadH.onConnectionFailed(connectionresult);
        }

        protected boolean zzoD()
        {
            zzj.zza(zzadH).zzb(ConnectionResult.zzYi);
            return true;
        }

        public zzi(int i, Bundle bundle)
        {
            zzadH = zzj.this;
            super(i, bundle);
        }
    }


    public static final String zzadF[] = {
        "service_esmobile", "service_googleme"
    };
    private final Context mContext;
    final Handler mHandler;
    private final Account zzOY;
    private final Looper zzYV;
    private final com.google.android.gms.common.internal.zzf zzZH;
    private final GoogleApiAvailability zzZi;
    private final Set zzZp;
    private int zzadA;
    private final com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks zzadB;
    private final com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener zzadC;
    private final int zzadD;
    protected AtomicInteger zzadE;
    private final zzl zzadu;
    private zzs zzadv;
    private com.google.android.gms.common.api.GoogleApiClient.zza zzadw;
    private IInterface zzadx;
    private final ArrayList zzady;
    private zze zzadz;
    private final Object zzpc;

    protected zzj(Context context, Looper looper, int i, com.google.android.gms.common.internal.zzf zzf1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        this(context, looper, zzl.zzak(context), GoogleApiAvailability.getInstance(), i, zzf1, (com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)zzx.zzv(connectioncallbacks), (com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)zzx.zzv(onconnectionfailedlistener));
    }

    protected zzj(Context context, Looper looper, zzl zzl1, GoogleApiAvailability googleapiavailability, int i, com.google.android.gms.common.internal.zzf zzf1, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, 
            com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        zzpc = new Object();
        zzady = new ArrayList();
        zzadA = 1;
        zzadE = new AtomicInteger(0);
        mContext = (Context)zzx.zzb(context, "Context must not be null");
        zzYV = (Looper)zzx.zzb(looper, "Looper must not be null");
        zzadu = (zzl)zzx.zzb(zzl1, "Supervisor must not be null");
        zzZi = (GoogleApiAvailability)zzx.zzb(googleapiavailability, "API availability must not be null");
        mHandler = new zzb(looper);
        zzadD = i;
        zzZH = (com.google.android.gms.common.internal.zzf)zzx.zzv(zzf1);
        zzOY = zzf1.getAccount();
        zzZp = zzb(zzf1.zzoj());
        zzadB = connectioncallbacks;
        zzadC = onconnectionfailedlistener;
    }

    static com.google.android.gms.common.api.GoogleApiClient.zza zza(zzj zzj1)
    {
        return zzj1.zzadw;
    }

    static zzs zza(zzj zzj1, zzs zzs1)
    {
        zzj1.zzadv = zzs1;
        return zzs1;
    }

    static void zza(zzj zzj1, int i, IInterface iinterface)
    {
        zzj1.zzb(i, iinterface);
    }

    private boolean zza(int i, int j, IInterface iinterface)
    {
label0:
        {
            synchronized (zzpc)
            {
                if (zzadA == i)
                {
                    break label0;
                }
            }
            return false;
        }
        zzb(j, iinterface);
        obj;
        JVM INSTR monitorexit ;
        return true;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    static boolean zza(zzj zzj1, int i, int j, IInterface iinterface)
    {
        return zzj1.zza(i, j, iinterface);
    }

    static com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks zzb(zzj zzj1)
    {
        return zzj1.zzadB;
    }

    private Set zzb(Set set)
    {
        Set set1 = zza(set);
        if (set1 == null)
        {
            return set1;
        }
        for (Iterator iterator = set1.iterator(); iterator.hasNext();)
        {
            if (!set.contains((Scope)iterator.next()))
            {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }

        return set1;
    }

    private void zzb(int i, IInterface iinterface)
    {
        boolean flag2 = true;
        Object obj;
        boolean flag;
        boolean flag1;
        if (i == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (iinterface != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag != flag1)
        {
            flag2 = false;
        }
        zzx.zzZ(flag2);
        obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        zzadA = i;
        zzadx = iinterface;
        zzc(i, iinterface);
        i;
        JVM INSTR tableswitch 1 3: default 109
    //                   1 102
    //                   2 83
    //                   3 95;
           goto _L1 _L2 _L3 _L4
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
_L3:
        zzov();
          goto _L1
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
_L4:
        zzou();
          goto _L1
_L2:
        zzow();
          goto _L1
    }

    static ArrayList zzc(zzj zzj1)
    {
        return zzj1.zzady;
    }

    static Set zzd(zzj zzj1)
    {
        return zzj1.zzZp;
    }

    static com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener zze(zzj zzj1)
    {
        return zzj1.zzadC;
    }

    private void zzov()
    {
        if (zzadz != null)
        {
            Log.e("GmsClient", (new StringBuilder()).append("Calling connect() while still connected, missing disconnect() for ").append(zzfA()).toString());
            zzadu.zzb(zzfA(), zzadz, zzot());
            zzadE.incrementAndGet();
        }
        zzadz = new zze(zzadE.get());
        if (!zzadu.zza(zzfA(), zzadz, zzot()))
        {
            Log.e("GmsClient", (new StringBuilder()).append("unable to connect to service: ").append(zzfA()).toString());
            mHandler.sendMessage(mHandler.obtainMessage(3, zzadE.get(), 9));
        }
    }

    private void zzow()
    {
        if (zzadz != null)
        {
            zzadu.zzb(zzfA(), zzadz, zzot());
            zzadz = null;
        }
    }

    public void disconnect()
    {
        zzadE.incrementAndGet();
        ArrayList arraylist = zzady;
        arraylist;
        JVM INSTR monitorenter ;
        int j = zzady.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((zzc)zzady.get(i)).zzoG();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        zzady.clear();
        arraylist;
        JVM INSTR monitorexit ;
        zzb(1, null);
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        int i;
        synchronized (zzpc)
        {
            i = zzadA;
            as = zzadx;
        }
        printwriter.append(s).append("mConnectState=");
        i;
        JVM INSTR tableswitch 1 4: default 64
    //                   1 127
    //                   2 97
    //                   3 107
    //                   4 117;
           goto _L1 _L2 _L3 _L4 _L5
_L2:
        break MISSING_BLOCK_LABEL_127;
_L1:
        printwriter.print("UNKNOWN");
_L6:
        printwriter.append(" mService=");
        if (as == null)
        {
            printwriter.println("null");
            return;
        } else
        {
            printwriter.append(zzfB()).append("@").println(Integer.toHexString(System.identityHashCode(as.asBinder())));
            return;
        }
        s;
        filedescriptor;
        JVM INSTR monitorexit ;
        throw s;
_L3:
        printwriter.print("CONNECTING");
          goto _L6
_L4:
        printwriter.print("CONNECTED");
          goto _L6
_L5:
        printwriter.print("DISCONNECTING");
          goto _L6
        printwriter.print("DISCONNECTED");
          goto _L6
    }

    public final Context getContext()
    {
        return mContext;
    }

    public final Looper getLooper()
    {
        return zzYV;
    }

    public boolean isConnected()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzadA == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean isConnecting()
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (zzadA == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void onConnectionFailed(ConnectionResult connectionresult)
    {
    }

    protected void onConnectionSuspended(int i)
    {
    }

    protected abstract IInterface zzV(IBinder ibinder);

    protected Set zza(Set set)
    {
        return set;
    }

    protected void zza(int i, Bundle bundle, int j)
    {
        mHandler.sendMessage(mHandler.obtainMessage(5, j, -1, new zzi(i, bundle)));
    }

    protected void zza(int i, IBinder ibinder, Bundle bundle, int j)
    {
        mHandler.sendMessage(mHandler.obtainMessage(1, j, -1, new zzg(i, ibinder, bundle)));
    }

    public void zza(com.google.android.gms.common.api.GoogleApiClient.zza zza1)
    {
        zzadw = (com.google.android.gms.common.api.GoogleApiClient.zza)zzx.zzb(zza1, "Connection progress callbacks cannot be null.");
        zzb(2, null);
    }

    public void zza(zzp zzp)
    {
        Bundle bundle = zzoB();
        zzp = new ValidateAccountRequest(zzp, (Scope[])zzZp.toArray(new Scope[zzZp.size()]), mContext.getPackageName(), bundle);
        try
        {
            zzadv.zza(new zzd(this, zzadE.get()), zzp);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzp zzp)
        {
            Log.w("GmsClient", "service died");
            zzbz(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzp zzp)
        {
            Log.w("GmsClient", "Remote exception occurred", zzp);
        }
    }

    public void zza(zzp zzp, Set set)
    {
        Object obj;
        try
        {
            obj = zzli();
            obj = (new GetServiceRequest(zzadD)).zzck(mContext.getPackageName()).zzg(((Bundle) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (zzp zzp)
        {
            Log.w("GmsClient", "service died");
            zzbz(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (zzp zzp)
        {
            Log.w("GmsClient", "Remote exception occurred", zzp);
            return;
        }
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        ((GetServiceRequest) (obj)).zzd(set);
        if (!zzlm()) goto _L2; else goto _L1
_L1:
        ((GetServiceRequest) (obj)).zzb(zzog()).zzc(zzp);
_L4:
        zzadv.zza(new zzd(this, zzadE.get()), ((GetServiceRequest) (obj)));
        return;
_L2:
        if (zzoC())
        {
            ((GetServiceRequest) (obj)).zzb(zzOY);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void zzbA(int i)
    {
        mHandler.sendMessage(mHandler.obtainMessage(6, i, -1, new zzh()));
    }

    public void zzbz(int i)
    {
        mHandler.sendMessage(mHandler.obtainMessage(4, zzadE.get(), i));
    }

    protected void zzc(int i, IInterface iinterface)
    {
    }

    protected abstract String zzfA();

    protected abstract String zzfB();

    protected Bundle zzli()
    {
        return new Bundle();
    }

    public boolean zzlm()
    {
        return false;
    }

    public Bundle zzmw()
    {
        return null;
    }

    public final IInterface zzoA()
        throws DeadObjectException
    {
        Object obj = zzpc;
        obj;
        JVM INSTR monitorenter ;
        if (zzadA == 4)
        {
            throw new DeadObjectException();
        }
        break MISSING_BLOCK_LABEL_28;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        zzoz();
        IInterface iinterface;
        boolean flag;
        if (zzadx != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "Client is connected but service is null");
        iinterface = zzadx;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
    }

    protected Bundle zzoB()
    {
        return null;
    }

    public boolean zzoC()
    {
        return false;
    }

    public final Account zzog()
    {
        if (zzOY != null)
        {
            return zzOY;
        } else
        {
            return new Account("<<default account>>", "com.google");
        }
    }

    protected final String zzot()
    {
        return zzZH.zzom();
    }

    protected void zzou()
    {
    }

    public void zzox()
    {
        int i = zzZi.isGooglePlayServicesAvailable(mContext);
        if (i != 0)
        {
            zzb(1, null);
            zzadw = new zzf();
            mHandler.sendMessage(mHandler.obtainMessage(3, zzadE.get(), i));
            return;
        } else
        {
            zza(new zzf());
            return;
        }
    }

    protected final com.google.android.gms.common.internal.zzf zzoy()
    {
        return zzZH;
    }

    protected final void zzoz()
    {
        if (!isConnected())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

}
