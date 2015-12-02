// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            jx, np, ni, nc

public class nj
{

    private final np Ee;
    private ContentProviderClient agS;
    private boolean agT;
    private HashMap agU;
    private final Context mContext;

    public nj(Context context, np np1)
    {
        agS = null;
        agT = false;
        agU = new HashMap();
        mContext = context;
        Ee = np1;
    }

    private b a(LocationListener locationlistener, Looper looper)
    {
        b b1;
        b b2;
        HashMap hashmap;
        if (looper == null)
        {
            try
            {
                jx.b(Looper.myLooper(), "Can't create handler inside thread that has not called Looper.prepare()");
            }
            // Misplaced declaration of an exception variable
            catch (LocationListener locationlistener)
            {
                throw locationlistener;
            }
        }
        hashmap = agU;
        hashmap;
        JVM INSTR monitorenter ;
        b2 = (b)agU.get(locationlistener);
        b1 = b2;
        if (b2 != null)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        b1 = new b(locationlistener, looper);
        agU.put(locationlistener, b1);
        hashmap;
        JVM INSTR monitorexit ;
        return b1;
        locationlistener;
        hashmap;
        JVM INSTR monitorexit ;
        throw locationlistener;
    }

    public void S(boolean flag)
    {
        Ee.dS();
        ((ni)Ee.hw()).S(flag);
        agT = flag;
    }

    public void a(LocationListener locationlistener)
    {
        Ee.dS();
        jx.b(locationlistener, "Invalid null listener");
        HashMap hashmap = agU;
        hashmap;
        JVM INSTR monitorenter ;
        locationlistener = (b)agU.remove(locationlistener);
        boolean flag;
        if (agS == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        flag = agU.isEmpty();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        agS.release();
        agS = null;
        if (locationlistener == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        locationlistener.release();
        ((ni)Ee.hw()).a(locationlistener);
        hashmap;
        JVM INSTR monitorexit ;
        return;
        locationlistener;
        try
        {
            throw locationlistener;
        }
        // Misplaced declaration of an exception variable
        catch (LocationListener locationlistener) { }
        finally { }
        throw locationlistener;
        hashmap;
        JVM INSTR monitorexit ;
        throw locationlistener;
        locationlistener;
        throw locationlistener;
    }

    public void a(LocationRequest locationrequest, LocationListener locationlistener, Looper looper)
    {
        Ee.dS();
        locationlistener = a(locationlistener, looper);
        ((ni)Ee.hw()).a(locationrequest, locationlistener);
    }

    public Location nl()
    {
        Ee.dS();
        Location location;
        try
        {
            location = ((ni)Ee.hw()).bZ(mContext.getPackageName());
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
        return location;
    }

    public void nm()
    {
        boolean flag;
        try
        {
            flag = agT;
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw illegalstateexception;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        S(false);
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new IllegalStateException(remoteexception);
    }

    public void removeAllListeners()
    {
        int i = nc.a;
        HashMap hashmap = agU;
        hashmap;
        JVM INSTR monitorenter ;
        Iterator iterator = agU.values().iterator();
_L2:
        b b1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        b1 = (b)iterator.next();
        if (b1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ((ni)Ee.hw()).a(b1);
        if (i == 0) goto _L2; else goto _L1
_L1:
        agU.clear();
        hashmap;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        throw obj;
        obj;
        hashmap;
        JVM INSTR monitorexit ;
        try
        {
            throw obj;
        }
        catch (RemoteException remoteexception)
        {
            throw new IllegalStateException(remoteexception);
        }
    }

    private class b extends com.google.android.gms.location.b.a
    {
        private class a extends Handler
        {

            private final LocationListener agV;

            public void handleMessage(Message message)
            {
                message.what;
                JVM INSTR tableswitch 1 1: default 24
            //                           1 33;
                   goto _L1 _L2
_L1:
                Log.e("LocationClientHelper", "unknown message in LocationHandler.handleMessage");
_L3:
                return;
_L2:
                message = new Location((Location)message.obj);
                agV.onLocationChanged(message);
                if (nc.a == 0) goto _L3; else goto _L1
            }

            public a(LocationListener locationlistener)
            {
                agV = locationlistener;
            }

            public a(LocationListener locationlistener, Looper looper)
            {
                super(looper);
                agV = locationlistener;
            }
        }


        private Handler agW;

        public void onLocationChanged(Location location)
        {
            if (agW == null)
            {
                Log.e("LocationClientHelper", "Received a location in client after calling removeLocationUpdates.");
                return;
            } else
            {
                Message message = Message.obtain();
                message.what = 1;
                message.obj = location;
                agW.sendMessage(message);
                return;
            }
        }

        public void release()
        {
            agW = null;
        }

        b(LocationListener locationlistener, Looper looper)
        {
            if (looper == null)
            {
                locationlistener = new a(locationlistener);
            } else
            {
                locationlistener = new a(locationlistener, looper);
            }
            agW = locationlistener;
        }
    }

}
