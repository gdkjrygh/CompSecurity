// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;
import com.urbanairship.BaseManager;
import com.urbanairship.Logger;
import com.urbanairship.PendingResult;
import com.urbanairship.PreferenceDataStore;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.Analytics;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.urbanairship.location:
//            LocationPreferences, LocationService, LocationListener, LocationRequestOptions

public class UALocationManager extends BaseManager
{

    private boolean isBound;
    private boolean isSubscribed;
    private List locationListeners;
    private final Messenger messenger = new Messenger(new IncomingHandler(Looper.getMainLooper()));
    private int nextSingleLocationRequestId;
    LocationPreferences preferences;
    private ServiceConnection serviceConnection;
    private Messenger serviceMessenger;
    private SparseArray singleLocationRequests;

    public UALocationManager(Context context, PreferenceDataStore preferencedatastore)
    {
        nextSingleLocationRequestId = 1;
        singleLocationRequests = new SparseArray();
        locationListeners = new ArrayList();
        serviceConnection = new _cls1();
        preferences = new LocationPreferences(preferencedatastore);
    /* block-local class not found */
    class IncomingHandler {}

        preferences.setListener(new _cls2());
    }

    private void bindService()
    {
        this;
        JVM INSTR monitorenter ;
        if (isBound) goto _L2; else goto _L1
_L1:
        Context context;
        Logger.info("Binding to location service.");
        context = UAirship.getApplicationContext();
        if (!context.bindService(new Intent(context, com/urbanairship/location/LocationService), serviceConnection, 1)) goto _L4; else goto _L3
_L3:
        isBound = true;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        Logger.error("Unable to bind to location service. Check that the location service is added to the manifest.");
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    private static boolean isAppForegrounded()
    {
        Analytics analytics = UAirship.shared().getAnalytics();
        return analytics != null && analytics.isAppInForeground();
    }

    private void onServiceConnected(IBinder ibinder)
    {
        this;
        JVM INSTR monitorenter ;
        serviceMessenger = new Messenger(ibinder);
        ibinder = singleLocationRequests;
        ibinder;
        JVM INSTR monitorenter ;
        int i = 0;
_L2:
        if (i >= singleLocationRequests.size())
        {
            break; /* Loop/switch isn't completed */
        }
    /* block-local class not found */
    class SingleLocationRequest {}

        ((SingleLocationRequest)singleLocationRequests.valueAt(i)).sendLocationRequest();
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        ibinder;
        JVM INSTR monitorexit ;
        updateServiceConnection();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        ibinder;
        JVM INSTR monitorexit ;
        throw exception;
        ibinder;
        this;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    private void onServiceDisconnected()
    {
        this;
        JVM INSTR monitorenter ;
        serviceMessenger = null;
        isSubscribed = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean sendMessage(int i, int j, Bundle bundle)
    {
        if (serviceMessenger == null)
        {
            return false;
        }
        Message message = Message.obtain(null, i, j, 0);
        if (bundle != null)
        {
            message.setData(bundle);
        }
        message.replyTo = messenger;
        try
        {
            serviceMessenger.send(message);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            Logger.info("Remote exception when sending message to location service");
            return false;
        }
        return true;
    }

    public static UALocationManager shared()
    {
        return UAirship.shared().getLocationManager();
    }

    private void subscribeUpdates()
    {
        this;
        JVM INSTR monitorenter ;
        if (!isSubscribed && sendMessage(1, 0, null))
        {
            Logger.info("Subscribed to continuous location updates.");
            isSubscribed = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void unbindService()
    {
        this;
        JVM INSTR monitorenter ;
        if (isBound)
        {
            Logger.info("Unbinding to location service.");
            UAirship.getApplicationContext().unbindService(serviceConnection);
            isBound = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void unsubscribeUpdates()
    {
        this;
        JVM INSTR monitorenter ;
        if (isSubscribed)
        {
            Logger.info("Unsubscribed from continuous location updates.");
            sendMessage(2, 0, null);
            isSubscribed = false;
            updateServiceConnection();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void updateServiceConnection()
    {
        this;
        JVM INSTR monitorenter ;
        Context context;
        boolean flag;
        flag = isLocationUpdatesNeeded();
        context = UAirship.getApplicationContext();
        if (!flag) goto _L2; else goto _L1
_L1:
        Intent intent = new Intent(context, com/urbanairship/location/LocationService);
        intent.setAction("com.urbanairship.location.ACTION_START_UPDATES");
        if (context.startService(intent) == null)
        {
            Logger.error("Unable to start location service. Check that the location service is added to the manifest.");
        }
_L5:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        if (locationListeners.isEmpty())
        {
            break MISSING_BLOCK_LABEL_115;
        }
        if (!isBound) goto _L4; else goto _L3
_L3:
        subscribeUpdates();
_L6:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Intent intent1 = new Intent(context, com/urbanairship/location/LocationService);
        intent1.setAction("com.urbanairship.location.ACTION_STOP_UPDATES");
        context.startService(intent1);
          goto _L5
        Exception exception;
        exception;
        throw exception;
_L4:
        bindService();
          goto _L6
        unsubscribeUpdates();
        if (singleLocationRequests.size() == 0)
        {
            unbindService();
        }
          goto _L6
    }

    public void addLocationListener(LocationListener locationlistener)
    {
        synchronized (locationListeners)
        {
            locationListeners.add(locationlistener);
            updateServiceConnection();
        }
        return;
        locationlistener;
        list;
        JVM INSTR monitorexit ;
        throw locationlistener;
    }

    public LocationRequestOptions getLocationRequestOptions()
    {
        LocationRequestOptions locationrequestoptions1 = preferences.getLocationRequestOptions();
        LocationRequestOptions locationrequestoptions = locationrequestoptions1;
        if (locationrequestoptions1 == null)
        {
            locationrequestoptions = (new LocationRequestOptions.Builder()).create();
        }
        return locationrequestoptions;
    }

    LocationPreferences getPreferences()
    {
        return preferences;
    }

    protected void init()
    {
        (new Handler(Looper.getMainLooper())).postDelayed(new _cls3(), 1000L);
    }

    public boolean isBackgroundLocationAllowed()
    {
        return preferences.isBackgroundLocationAllowed();
    }

    public boolean isLocationUpdatesEnabled()
    {
        return preferences.isLocationUpdatesEnabled();
    }

    boolean isLocationUpdatesNeeded()
    {
        while (!isLocationUpdatesEnabled() || !isBackgroundLocationAllowed() && !isAppForegrounded()) 
        {
            return false;
        }
        return true;
    }

    public void removeLocationListener(LocationListener locationlistener)
    {
        synchronized (locationListeners)
        {
            locationListeners.remove(locationlistener);
            updateServiceConnection();
        }
        return;
        locationlistener;
        list;
        JVM INSTR monitorexit ;
        throw locationlistener;
    }

    public PendingResult requestSingleLocation()
    {
        return requestSingleLocation(getLocationRequestOptions());
    }

    public PendingResult requestSingleLocation(LocationRequestOptions locationrequestoptions)
    {
        if (locationrequestoptions == null)
        {
            throw new IllegalArgumentException("Location request options cannot be null or invalid");
        }
        synchronized (singleLocationRequests)
        {
            int i = nextSingleLocationRequestId;
            nextSingleLocationRequestId = i + 1;
            locationrequestoptions = new SingleLocationRequest(i, locationrequestoptions);
            singleLocationRequests.put(i, locationrequestoptions);
        }
        this;
        JVM INSTR monitorenter ;
        if (isBound)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        bindService();
_L1:
        this;
        JVM INSTR monitorexit ;
        return locationrequestoptions;
        locationrequestoptions;
        sparsearray;
        JVM INSTR monitorexit ;
        throw locationrequestoptions;
        locationrequestoptions.sendLocationRequest();
          goto _L1
        locationrequestoptions;
        this;
        JVM INSTR monitorexit ;
        throw locationrequestoptions;
    }

    public void setBackgroundLocationAllowed(boolean flag)
    {
        preferences.setBackgroundLocationAllowed(flag);
    }

    public void setLocationRequestOptions(LocationRequestOptions locationrequestoptions)
    {
        preferences.setLocationRequestOptions(locationrequestoptions);
    }

    public void setLocationUpdatesEnabled(boolean flag)
    {
        preferences.setLocationUpdatesEnabled(flag);
    }







    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
