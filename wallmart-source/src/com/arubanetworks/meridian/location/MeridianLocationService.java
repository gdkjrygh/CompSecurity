// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arubanetworks.meridian.location;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import com.arubanetworks.meridian.editor.EditorKey;
import com.arubanetworks.meridian.internal.util.Dev;
import com.arubanetworks.meridian.internal.util.Strings;
import com.arubanetworks.meridian.log.MeridianLogger;
import com.arubanetworks.meridian.requests.ClientLocationDataRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.arubanetworks.meridian.location:
//            MeridianLocation, LocationProvider, ClientLocationData, b, 
//            BeaconLocationProvider, a

public class MeridianLocationService extends Service
    implements LocationProvider.a
{
    public class LocationManagerBinder extends Binder
    {

        final MeridianLocationService a;
        private final List b = new CopyOnWriteArrayList();

        private void a(MeridianLocation meridianlocation)
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext(); ((LocationServiceListener)iterator.next()).onLocationUpdate(meridianlocation)) { }
        }

        static void a(LocationManagerBinder locationmanagerbinder, MeridianLocation meridianlocation)
        {
            locationmanagerbinder.a(meridianlocation);
        }

        static void a(LocationManagerBinder locationmanagerbinder, Throwable throwable)
        {
            locationmanagerbinder.a(throwable);
        }

        private void a(Throwable throwable)
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext(); ((LocationServiceListener)iterator.next()).onLocationError(throwable)) { }
        }

        public MeridianLocation getLastKnownLocation()
        {
            return MeridianLocationService.e(a);
        }

        public void registerListener(LocationServiceListener locationservicelistener)
        {
            if (locationservicelistener != null)
            {
                b.add(locationservicelistener);
            }
        }

        public void setAppKey(EditorKey editorkey)
        {
            while (editorkey == MeridianLocationService.b(a) || MeridianLocationService.b(a) != null && editorkey != null && editorkey.getId().equals(MeridianLocationService.b(a).getId())) 
            {
                return;
            }
            MeridianLocationService.d(a);
            MeridianLocationService.a(a, null);
            MeridianLocationService.b(a, editorkey);
            MeridianLocationService.a(a, MeridianLocationService.b(a), MeridianLocationService.c(a));
        }

        public void unregisterListener(LocationServiceListener locationservicelistener)
        {
            b.remove(locationservicelistener);
        }

        public LocationManagerBinder()
        {
            a = MeridianLocationService.this;
            super();
        }
    }

    public static interface LocationServiceListener
    {

        public abstract void onLocationError(Throwable throwable);

        public abstract void onLocationUpdate(MeridianLocation meridianlocation);

        public abstract void onRequestBluetooth();

        public abstract void onRequestGPS();

        public abstract void onRequestWiFi();
    }

    private class a
    {

        final MeridianLocationService a;
        private long b;

        void a()
        {
            b = 2000L;
        }

        long b()
        {
            long l = Math.min(b * 2L, 30000L);
            b = l;
            return l;
        }

        private a()
        {
            a = MeridianLocationService.this;
            super();
            a();
        }

    }


    private static final MeridianLogger a;
    private final boolean b = false;
    private final LocationManagerBinder c = new LocationManagerBinder();
    private EditorKey d;
    private MeridianLocation e;
    private final ArrayList f = new ArrayList();
    private ClientLocationDataRequest g;
    private ClientLocationData h;
    private boolean i;
    private final BroadcastReceiver j = new BroadcastReceiver() {

        final MeridianLocationService a;

        public void onReceive(Context context, Intent intent)
        {
            String s;
            byte byte0;
            s = intent.getAction();
            byte0 = -1;
            s.hashCode();
            JVM INSTR lookupswitch 3: default 48
        //                       -1875733435: 77
        //                       -1530327060: 92
        //                       -511271086: 107;
               goto _L1 _L2 _L3 _L4
_L1:
            byte0;
            JVM INSTR tableswitch 0 2: default 76
        //                       0 122
        //                       1 137
        //                       2 153;
               goto _L5 _L6 _L7 _L8
_L5:
            return;
_L2:
            if (s.equals("android.net.wifi.WIFI_STATE_CHANGED"))
            {
                byte0 = 0;
            }
            continue; /* Loop/switch isn't completed */
_L3:
            if (s.equals("android.bluetooth.adapter.action.STATE_CHANGED"))
            {
                byte0 = 1;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (s.equals("android.location.MODE_CHANGED"))
            {
                byte0 = 2;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            MeridianLocationService.a(a, intent.getIntExtra("wifi_state", 4));
            return;
_L7:
            MeridianLocationService.b(a, intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10));
            return;
_L8:
            if (android.os.Build.VERSION.SDK_INT < 19) goto _L5; else goto _L9
_L9:
            boolean flag = Dev.isLocationEnabled(context);
            if (MeridianLocationService.a(a) == flag) goto _L5; else goto _L10
_L10:
            MeridianLocationService.a(a, flag);
            if (MeridianLocationService.a(a))
            {
                MeridianLocationService.a(a, MeridianLocationService.b(a), MeridianLocationService.c(a));
                return;
            }
            MeridianLocationService.d(a);
            return;
            if (true) goto _L1; else goto _L11
_L11:
        }

            
            {
                a = MeridianLocationService.this;
                super();
            }
    };

    public MeridianLocationService()
    {
        d = null;
        h = null;
        i = true;
    }

    static ClientLocationData a(MeridianLocationService meridianlocationservice, ClientLocationData clientlocationdata)
    {
        meridianlocationservice.h = clientlocationdata;
        return clientlocationdata;
    }

    private MeridianLocation a(EditorKey editorkey)
    {
        if (editorkey != null) goto _L2; else goto _L1
_L1:
        File file;
        return null;
_L2:
        if (!(file = new File(getApplicationContext().getCacheDir(), "cached_locations")).exists()) goto _L1; else goto _L3
_L3:
        ObjectInputStream objectinputstream = new ObjectInputStream(new FileInputStream(file));
        Object obj = objectinputstream;
        HashMap hashmap = (HashMap)objectinputstream.readObject();
        obj = hashmap;
        if (objectinputstream == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        objectinputstream.close();
        obj = hashmap;
_L4:
        Exception exception;
        IOException ioexception;
        if (obj != null)
        {
            editorkey = (MeridianLocation)((HashMap) (obj)).get(editorkey.getId());
        } else
        {
            editorkey = null;
        }
        return editorkey;
        obj;
        a.e("Error getting cached location", ((Throwable) (obj)));
        obj = hashmap;
          goto _L4
        exception;
        objectinputstream = null;
_L7:
        obj = objectinputstream;
        file.delete();
        obj = objectinputstream;
        a.e("Error getting cached location, deleting file", exception);
        if (objectinputstream == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        objectinputstream.close();
        obj = null;
          goto _L4
        obj;
        a.e("Error getting cached location", ((Throwable) (obj)));
        obj = null;
          goto _L4
        editorkey;
        obj = null;
_L6:
        if (obj != null)
        {
            try
            {
                ((ObjectInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception)
            {
                a.e("Error getting cached location", ioexception);
            }
        }
        throw editorkey;
        editorkey;
        if (true) goto _L6; else goto _L5
_L5:
        exception;
          goto _L7
    }

    static MeridianLocation a(MeridianLocationService meridianlocationservice, MeridianLocation meridianlocation)
    {
        meridianlocationservice.e = meridianlocation;
        return meridianlocation;
    }

    static MeridianLogger a()
    {
        return a;
    }

    static ClientLocationDataRequest a(MeridianLocationService meridianlocationservice, ClientLocationDataRequest clientlocationdatarequest)
    {
        meridianlocationservice.g = clientlocationdatarequest;
        return clientlocationdatarequest;
    }

    private void a(int k)
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((LocationProvider)iterator.next()).wifiStateChanged(k)) { }
    }

    private void a(EditorKey editorkey, ClientLocationData clientlocationdata)
    {
        if (editorkey == null)
        {
            return;
        }
        if (e == null)
        {
            e = a(editorkey);
        }
        if (clientlocationdata == null)
        {
            b(editorkey);
            return;
        } else
        {
            a(clientlocationdata);
            return;
        }
    }

    private void a(EditorKey editorkey, MeridianLocation meridianlocation)
    {
        Object obj;
        Object obj3;
        Object obj4;
        obj = null;
        obj4 = null;
        obj3 = null;
        if (meridianlocation != null && editorkey != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ObjectInputStream objectinputstream;
        File file;
        file = new File(getApplicationContext().getCacheDir(), "cached_locations");
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_355;
        }
        objectinputstream = new ObjectInputStream(new FileInputStream(file));
        ObjectInputStream objectinputstream1;
        ObjectInputStream objectinputstream2;
        objectinputstream1 = objectinputstream;
        obj = obj4;
        objectinputstream2 = objectinputstream;
        Object obj1 = (HashMap)objectinputstream.readObject();
_L4:
        objectinputstream1 = objectinputstream;
        obj = obj4;
        objectinputstream2 = objectinputstream;
        file.delete();
_L9:
        Object obj2;
        obj2 = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        objectinputstream1 = objectinputstream;
        obj = obj4;
        objectinputstream2 = objectinputstream;
        obj2 = new HashMap();
        objectinputstream1 = objectinputstream;
        obj = obj4;
        objectinputstream2 = objectinputstream;
        ((HashMap) (obj2)).put(editorkey.getId(), meridianlocation);
        objectinputstream1 = objectinputstream;
        obj = obj4;
        objectinputstream2 = objectinputstream;
        editorkey = new ObjectOutputStream(new FileOutputStream(file));
        editorkey.writeObject(obj2);
        if (objectinputstream == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        objectinputstream.close();
        if (editorkey == null) goto _L1; else goto _L3
_L3:
        try
        {
            editorkey.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (EditorKey editorkey)
        {
            a.e("Error caching location data", editorkey);
        }
        return;
        obj1;
        objectinputstream1 = objectinputstream;
        obj = obj4;
        objectinputstream2 = objectinputstream;
        a.e("Error caching location data", ((Throwable) (obj1)));
        obj1 = null;
          goto _L4
        editorkey;
        objectinputstream = null;
        meridianlocation = obj3;
_L8:
        objectinputstream1 = objectinputstream;
        obj = meridianlocation;
        a.e("Error caching location data", editorkey);
        if (objectinputstream == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        objectinputstream.close();
        if (meridianlocation == null) goto _L1; else goto _L5
_L5:
        try
        {
            meridianlocation.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (EditorKey editorkey)
        {
            a.e("Error caching location data", editorkey);
        }
        return;
        editorkey;
        objectinputstream = null;
_L7:
        if (objectinputstream == null)
        {
            break MISSING_BLOCK_LABEL_294;
        }
        objectinputstream.close();
        if (obj != null)
        {
            try
            {
                ((ObjectOutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (MeridianLocation meridianlocation)
            {
                a.e("Error caching location data", meridianlocation);
            }
        }
        throw editorkey;
        editorkey;
        objectinputstream = objectinputstream1;
        continue; /* Loop/switch isn't completed */
        meridianlocation;
        obj = editorkey;
        editorkey = meridianlocation;
        if (true) goto _L7; else goto _L6
_L6:
        editorkey;
        objectinputstream = objectinputstream2;
        meridianlocation = obj3;
          goto _L8
        IOException ioexception;
        ioexception;
        meridianlocation = editorkey;
        editorkey = ioexception;
          goto _L8
        obj1 = null;
        objectinputstream = null;
          goto _L9
    }

    private void a(ClientLocationData clientlocationdata)
    {
        if (!f.isEmpty())
        {
            throw new IllegalStateException("There are active location providers already listening");
        }
        if (Dev.isLocationEnabled(getApplicationContext()))
        {
            if (clientlocationdata.getBeaconPlacemarks().size() > 0)
            {
                if (!Dev.hasBLE(getApplicationContext()))
                {
                    a.w("The Device lacks support for BLE, not listening for Beacons");
                } else
                if (!Dev.hasBLEPermission(getApplicationContext()))
                {
                    a.w("The Package lacks the BLUETOOTH and BLUETOOTH_ADMIN permissions, not starting BeaconLocationProvider");
                } else
                {
                    a.d("We have beacons and this device supports beacons; using BeaconLocationProvider");
                    f.add(new BeaconLocationProvider(clientlocationdata, this));
                }
            }
            if (clientlocationdata.getOutdoorAreas().size() > 0 && Dev.hasGPS(getApplicationContext()))
            {
                a.d("We have outdoor areas; using SystemLocationProvider");
                f.add(new b(getApplicationContext(), clientlocationdata, this));
            }
            if (!Strings.isNullOrEmpty(clientlocationdata.getLocationsServer()))
            {
                if (!Dev.hasWiFi(getApplicationContext()))
                {
                    a.w("The Device lacks support for WiFi, not listening for RTLS Server");
                } else
                if (!Dev.hasWiFiPermission(getApplicationContext()))
                {
                    a.w("The Package lacks the ACCESS_WIFI_STATE and CHANGE_WIFI_STATE permissions, not starting RTLSLocationProvider");
                } else
                {
                    a.d("We have a location server; using RTLSLocationProvider");
                    f.add(new com.arubanetworks.meridian.location.a(getApplicationContext(), clientlocationdata, this));
                }
            }
            if (e != null && e.getAgeMillis() < 0x927c0L)
            {
                (new Handler()).postDelayed(new Runnable() {

                    final MeridianLocationService a;

                    public void run()
                    {
                        MeridianLocationService.a().d((new StringBuilder()).append("Updating delegate with previously-cached location: ").append(MeridianLocationService.e(a)).toString());
                        LocationManagerBinder.a(MeridianLocationService.f(a), MeridianLocationService.e(a));
                    }

            
            {
                a = MeridianLocationService.this;
                super();
            }
                }, 0L);
                return;
            }
        }
    }

    static void a(MeridianLocationService meridianlocationservice, int k)
    {
        meridianlocationservice.a(k);
    }

    static void a(MeridianLocationService meridianlocationservice, EditorKey editorkey)
    {
        meridianlocationservice.b(editorkey);
    }

    static void a(MeridianLocationService meridianlocationservice, EditorKey editorkey, ClientLocationData clientlocationdata)
    {
        meridianlocationservice.a(editorkey, clientlocationdata);
    }

    static boolean a(MeridianLocationService meridianlocationservice)
    {
        return meridianlocationservice.i;
    }

    static boolean a(MeridianLocationService meridianlocationservice, boolean flag)
    {
        meridianlocationservice.i = flag;
        return flag;
    }

    static EditorKey b(MeridianLocationService meridianlocationservice)
    {
        return meridianlocationservice.d;
    }

    static EditorKey b(MeridianLocationService meridianlocationservice, EditorKey editorkey)
    {
        meridianlocationservice.d = editorkey;
        return editorkey;
    }

    private void b()
    {
        if (g != null)
        {
            g.cancel();
            g = null;
        }
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((LocationProvider)iterator.next()).shutdown()) { }
        f.clear();
        a(d, e);
    }

    private void b(int k)
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((LocationProvider)iterator.next()).bluetoothStateChanged(k)) { }
    }

    private void b(EditorKey editorkey)
    {
        a a1 = new a();
        g = (new com.arubanetworks.meridian.requests.ClientLocationDataRequest.Builder()).setAppId(editorkey.getId()).setListener(new com.arubanetworks.meridian.requests.MeridianRequest.Listener(editorkey, a1) {

            final EditorKey a;
            final a b;
            final MeridianLocationService c;

            public void a(JSONObject jsonobject)
            {
                try
                {
                    jsonobject = ClientLocationData.fromJSONObject(jsonobject, a);
                    if (jsonobject.getBeaconPlacemarks() != null)
                    {
                        MeridianLocationService.a().d("Fetched %d beacons.", new Object[] {
                            Integer.valueOf(jsonobject.getBeaconPlacemarks().size())
                        });
                    }
                    MeridianLocationService.a(c, jsonobject);
                    b.a();
                    MeridianLocationService.b(c, MeridianLocationService.c(c));
                    MeridianLocationService.a(c, null);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject)
                {
                    MeridianLocationService.a().w("Error parsing JSON for client location data", jsonobject);
                }
                MeridianLocationService.a(c, null);
            /* block-local class not found */
            class _cls1 {}

                (new Handler()).postDelayed(new _cls1(), b.b());
            }

            public void onResponse(Object obj)
            {
                a((JSONObject)obj);
            }

            
            {
                c = MeridianLocationService.this;
                a = editorkey;
                b = a1;
                super();
            }
        }).setErrorListener(new com.arubanetworks.meridian.requests.MeridianRequest.ErrorListener(editorkey, a1) {

            final EditorKey a;
            final a b;
            final MeridianLocationService c;

            public void onError(Throwable throwable)
            {
                MeridianLocationService.a(c, null);
            /* block-local class not found */
            class _cls1 {}

                (new Handler()).postDelayed(new _cls1(), b.b());
            }

            
            {
                c = MeridianLocationService.this;
                a = editorkey;
                b = a1;
                super();
            }
        }).build();
        g.sendRequest();
    }

    static void b(MeridianLocationService meridianlocationservice, int k)
    {
        meridianlocationservice.b(k);
    }

    static void b(MeridianLocationService meridianlocationservice, ClientLocationData clientlocationdata)
    {
        meridianlocationservice.a(clientlocationdata);
    }

    static ClientLocationData c(MeridianLocationService meridianlocationservice)
    {
        return meridianlocationservice.h;
    }

    private void c()
    {
        i = Dev.isLocationEnabled(getApplicationContext());
        IntentFilter intentfilter = new IntentFilter();
        if (Dev.hasWiFi(getApplicationContext()) && Dev.hasWiFiPermission(getApplicationContext()))
        {
            intentfilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        }
        if (Dev.hasBLE(getApplicationContext()) && Dev.hasBLEPermission(getApplicationContext()))
        {
            intentfilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
        }
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            intentfilter.addAction("android.location.MODE_CHANGED");
        }
        registerReceiver(j, intentfilter);
    }

    private void d()
    {
        unregisterReceiver(j);
    }

    static void d(MeridianLocationService meridianlocationservice)
    {
        meridianlocationservice.b();
    }

    private MeridianLocation e()
    {
        Object obj1;
        obj1 = null;
        if (e != null)
        {
            a.d("Current location from %s is %d seconds old.", new Object[] {
                e.getProvider(), Long.valueOf(e.getAgeMillis() / 1000L)
            });
        }
        if (e != null && e.getAgeMillis() <= 3000L) goto _L2; else goto _L1
_L1:
        LocationProvider locationprovider;
        Iterator iterator;
        iterator = f.iterator();
        locationprovider = null;
_L5:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        LocationProvider locationprovider1 = (LocationProvider)iterator.next();
        if (locationprovider1.getLocation() != null)
        {
            Object obj = locationprovider1;
            if (locationprovider != null)
            {
                if (locationprovider1.getLocation().getAgeMillis() < locationprovider.getLocation().getAgeMillis())
                {
                    obj = locationprovider1;
                } else
                {
                    obj = locationprovider;
                }
            }
            locationprovider = ((LocationProvider) (obj));
        }
        if (true) goto _L5; else goto _L4
_L4:
        a.d((new StringBuilder()).append("Selecting provider with most recent location: ").append(locationprovider).toString());
        obj = obj1;
        if (locationprovider != null)
        {
            obj = locationprovider.getLocation();
        }
_L7:
        return ((MeridianLocation) (obj));
_L2:
        if (e != null && e.getProvider() != null)
        {
            a.d((new StringBuilder()).append("Using current provider: ").append(e.getProvider()).toString());
            return e.getProvider().getLocation();
        }
        obj = obj1;
        if (e != null)
        {
            return e;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    static MeridianLocation e(MeridianLocationService meridianlocationservice)
    {
        return meridianlocationservice.e;
    }

    static LocationManagerBinder f(MeridianLocationService meridianlocationservice)
    {
        return meridianlocationservice.c;
    }

    public static Intent getIntent(Context context)
    {
        return new Intent(context, com/arubanetworks/meridian/location/MeridianLocationService);
    }

    public IBinder onBind(Intent intent)
    {
        return c;
    }

    public void onCreate()
    {
        super.onCreate();
        c();
        a(d, h);
    }

    public void onDestroy()
    {
        d();
        b();
        super.onDestroy();
    }

    public void onLocationError(LocationProvider locationprovider, Throwable throwable)
    {
        a.d("Location provider %s error: %s", new Object[] {
            locationprovider, throwable
        });
        LocationManagerBinder.a(c, throwable);
    }

    public void onLocationUpdate(LocationProvider locationprovider, MeridianLocation meridianlocation)
    {
        a.d("%s updated to location %s", new Object[] {
            locationprovider, meridianlocation
        });
        locationprovider = e();
        if (locationprovider != null && !locationprovider.equals(e))
        {
            meridianlocation = c;
            e = locationprovider;
            LocationManagerBinder.a(meridianlocation, locationprovider);
        }
    }

    public void onNeedBluetoothEnabled(LocationProvider locationprovider)
    {
    }

    public void onNeedWifiEnabled(LocationProvider locationprovider)
    {
    }

    static 
    {
        a = MeridianLogger.forTag("MeridianLocationService").andFeature(com.arubanetworks.meridian.log.MeridianLogger.Feature.LOCATION);
    }
}
