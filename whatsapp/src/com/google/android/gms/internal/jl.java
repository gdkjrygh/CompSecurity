// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            jx, jm, jn, qw, 
//            jt

public abstract class jl
    implements com.google.android.gms.common.api.Api.a, jm.b
{

    public static final String MP[] = {
        "service_esmobile", "service_googleme"
    };
    private final Looper JF;
    private final jm JS;
    private IInterface MJ;
    private final ArrayList MK = new ArrayList();
    private f ML;
    private int MM;
    private final String MN[];
    boolean MO;
    private final Context mContext;
    private final Object mH = new Object();
    final Handler mHandler;

    protected jl(Context context, Looper looper, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener, String as[])
    {
        MM = 1;
        MO = false;
        mContext = (Context)jx.i(context);
        JF = (Looper)jx.b(looper, "Looper must not be null");
        JS = new jm(context, looper, this);
        mHandler = new a(looper);
        c(as);
        MN = as;
        registerConnectionCallbacks((com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks)jx.i(connectioncallbacks));
        registerConnectionFailedListener((com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener)jx.i(onconnectionfailedlistener));
    }

    static f a(jl jl1, f f)
    {
        jl1.ML = f;
        return f;
    }

    static jm a(jl jl1)
    {
        return jl1.JS;
    }

    private void a(int i, IInterface iinterface)
    {
        boolean flag2 = true;
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
        jx.L(flag2);
        synchronized (mH)
        {
            MM = i;
            MJ = iinterface;
        }
        return;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    static void a(jl jl1, int i, IInterface iinterface)
    {
        jl1.a(i, iinterface);
    }

    private boolean a(int i, int j, IInterface iinterface)
    {
label0:
        {
            synchronized (mH)
            {
                if (MM == i)
                {
                    break label0;
                }
            }
            return false;
        }
        a(j, iinterface);
        obj;
        JVM INSTR monitorexit ;
        return true;
        iinterface;
        obj;
        JVM INSTR monitorexit ;
        throw iinterface;
    }

    static boolean a(jl jl1, int i, int j, IInterface iinterface)
    {
        return jl1.a(i, j, iinterface);
    }

    static ArrayList b(jl jl1)
    {
        return jl1.MK;
    }

    static f c(jl jl1)
    {
        return jl1.ML;
    }

    static Context d(jl jl1)
    {
        return jl1.mContext;
    }

    protected final void N(IBinder ibinder)
    {
        try
        {
            a(jt.a.Q(ibinder), new e());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            Log.w("GmsClient", "service died");
            aD(1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBinder ibinder)
        {
            Log.w("GmsClient", "Remote exception occurred", ibinder);
        }
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        mHandler.sendMessage(mHandler.obtainMessage(1, new h(i, ibinder, bundle)));
    }

    protected abstract void a(jt jt, e e1);

    public void aD(int i)
    {
        mHandler.sendMessage(mHandler.obtainMessage(4, Integer.valueOf(i)));
    }

    protected abstract String bK();

    protected abstract String bL();

    protected void c(String as[])
    {
    }

    public void connect()
    {
        int i;
        MO = true;
        a(2, ((IInterface) (null)));
        i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(mContext);
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        a(1, ((IInterface) (null)));
        mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(i)));
_L1:
        return;
        IllegalStateException illegalstateexception;
        illegalstateexception;
        throw illegalstateexception;
        try
        {
            if (ML != null)
            {
                Log.e("GmsClient", (new StringBuilder()).append("Calling connect() while still connected, missing disconnect() for ").append(bK()).toString());
                jn.J(mContext).b(bK(), ML);
            }
        }
        catch (IllegalStateException illegalstateexception2)
        {
            throw illegalstateexception2;
        }
        ML = new f();
        if (!jn.J(mContext).a(bK(), ML))
        {
            try
            {
                Log.e("GmsClient", (new StringBuilder()).append("unable to connect to service: ").append(bK()).toString());
                mHandler.sendMessage(mHandler.obtainMessage(3, Integer.valueOf(9)));
                return;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                throw illegalstateexception1;
            }
        }
          goto _L1
    }

    protected final void dS()
    {
        try
        {
            if (!isConnected())
            {
                throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
    }

    public void disconnect()
    {
        boolean flag;
        flag = qw.a;
        MO = false;
        ArrayList arraylist = MK;
        arraylist;
        JVM INSTR monitorenter ;
        int j = MK.size();
        int i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        ((b)MK.get(i)).hz();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        MK.clear();
        arraylist;
        JVM INSTR monitorexit ;
        Exception exception;
        try
        {
            a(1, ((IInterface) (null)));
            if (ML != null)
            {
                jn.J(mContext).b(bK(), ML);
                ML = null;
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Bundle fX()
    {
        return null;
    }

    public boolean gN()
    {
        return MO;
    }

    public final Context getContext()
    {
        return mContext;
    }

    public final IInterface hw()
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        if (MM == 4)
        {
            throw new DeadObjectException();
        }
        break MISSING_BLOCK_LABEL_28;
        Object obj1;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        IInterface iinterface;
        dS();
        iinterface = MJ;
        boolean flag;
        if (iinterface != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "Client is connected but service is null");
        iinterface = MJ;
        obj;
        JVM INSTR monitorexit ;
        return iinterface;
        iinterface;
        throw iinterface;
    }

    public boolean isConnected()
    {
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (MM == 3)
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
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (MM == 2)
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

    protected abstract IInterface l(IBinder ibinder);

    public void registerConnectionCallbacks(com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks)
    {
        JS.registerConnectionCallbacks(connectioncallbacks);
    }

    public void registerConnectionFailedListener(com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
    {
        JS.registerConnectionFailedListener(onconnectionfailedlistener);
    }


    private class a extends Handler
    {

        final jl MQ;

        public void handleMessage(Message message)
        {
            if (message.what == 1 && !MQ.isConnecting())
            {
                message = (b)message.obj;
                message.hx();
                message.unregister();
                return;
            }
            if (message.what == 3)
            {
                jl.a(MQ).b(new ConnectionResult(((Integer)message.obj).intValue(), null));
                return;
            }
            if (message.what == 4)
            {
                jl.a(MQ, 4, null);
                jl.a(MQ).aE(((Integer)message.obj).intValue());
                jl.a(MQ, 4, 1, null);
                return;
            }
            if (message.what == 2 && !MQ.isConnected())
            {
                message = (b)message.obj;
                message.hx();
                message.unregister();
                return;
            }
            if (message.what == 2 || message.what == 1)
            {
                ((b)message.obj).hy();
                return;
            } else
            {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
                return;
            }
        }

        public a(Looper looper)
        {
            MQ = jl.this;
            super(looper);
        }
    }


    private class e extends js.a
    {

        private jl MT;

        public void b(int i, IBinder ibinder, Bundle bundle)
        {
            jx.b("onPostInitComplete can be called only once per call to getServiceFromBroker", MT);
            MT.a(i, ibinder, bundle);
            MT = null;
        }

        public e()
        {
            MT = jl.this;
        }
    }


    private class h extends b
    {
        private class b
        {

            final jl MQ;
            private boolean MR;
            private Object mListener;

            protected abstract void g(Object obj);

            protected abstract void hx();

            public void hy()
            {
                this;
                JVM INSTR monitorenter ;
                Object obj = mListener;
                if (MR)
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
                        g(obj);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1)
                    {
                        hx();
                        throw obj1;
                    }
                } else
                {
                    hx();
                }
                this;
                JVM INSTR monitorenter ;
                MR = true;
                this;
                JVM INSTR monitorexit ;
                unregister();
                return;
                obj1;
                throw obj1;
                obj1;
                this;
                JVM INSTR monitorexit ;
                throw obj1;
                obj1;
                this;
                JVM INSTR monitorexit ;
                throw obj1;
            }

            public void hz()
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

            public void unregister()
            {
                hz();
                synchronized (jl.b(MQ))
                {
                    jl.b(MQ).remove(this);
                }
                return;
                exception;
                arraylist;
                JVM INSTR monitorexit ;
                throw exception;
            }

            public b(Object obj)
            {
                MQ = jl.this;
                super();
                mListener = obj;
                MR = false;
            }
        }


        final jl MQ;
        public final Bundle MV;
        public final IBinder MW;
        public final int statusCode;

        protected void b(Boolean boolean1)
        {
            if (boolean1 != null) goto _L2; else goto _L1
_L1:
            jl.a(MQ, 1, null);
_L7:
            return;
            boolean1;
            throw boolean1;
_L2:
            statusCode;
            JVM INSTR lookupswitch 2: default 48
        //                       0: 146
        //                       10: 278;
               goto _L3 _L4 _L5
_L5:
            break; /* Loop/switch isn't completed */
_L3:
            if (MV != null)
            {
                boolean1 = (PendingIntent)MV.getParcelable("pendingIntent");
            } else
            {
                boolean1 = null;
            }
            try
            {
                if (jl.c(MQ) != null)
                {
                    jn.J(jl.d(MQ)).b(MQ.bK(), jl.c(MQ));
                    jl.a(MQ, null);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Boolean boolean1)
            {
                throw boolean1;
            }
            jl.a(MQ, 1, null);
            jl.a(MQ).b(new ConnectionResult(statusCode, boolean1));
            return;
_L4:
            boolean1 = MW.getInterfaceDescriptor();
            if (!MQ.bL().equals(boolean1))
            {
                break MISSING_BLOCK_LABEL_207;
            }
            boolean1 = MQ.l(MW);
            if (boolean1 != null)
            {
                try
                {
                    jl.a(MQ, 3, boolean1);
                    jl.a(MQ).dU();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Boolean boolean1) { }
            }
            jn.J(jl.d(MQ)).b(MQ.bK(), jl.c(MQ));
            jl.a(MQ, null);
            jl.a(MQ, 1, null);
            jl.a(MQ).b(new ConnectionResult(8, null));
            if (!qw.a) goto _L7; else goto _L6
_L6:
            jl.a(MQ, 1, null);
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            boolean1;
            throw boolean1;
        }

        protected void g(Object obj)
        {
            b((Boolean)obj);
        }

        protected void hx()
        {
        }

        public h(int i, IBinder ibinder, Bundle bundle)
        {
            MQ = jl.this;
            super(Boolean.valueOf(true));
            statusCode = i;
            MW = ibinder;
            MV = bundle;
        }
    }


    private class f
        implements ServiceConnection
    {

        final jl MQ;

        public void onServiceConnected(ComponentName componentname, IBinder ibinder)
        {
            MQ.N(ibinder);
        }

        public void onServiceDisconnected(ComponentName componentname)
        {
            MQ.mHandler.sendMessage(MQ.mHandler.obtainMessage(4, Integer.valueOf(1)));
        }

        public f()
        {
            MQ = jl.this;
            super();
        }
    }

}
