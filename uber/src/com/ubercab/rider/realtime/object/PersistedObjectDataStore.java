// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.Client;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Trip;
import gju;
import hkv;
import hoi;
import java.util.Map;

// Referenced classes of package com.ubercab.rider.realtime.object:
//            ObjectDataStore

public class PersistedObjectDataStore extends ObjectDataStore
{

    static final String KEY_APP_CONFIG = "com.ubercab.realtime.object.APP_CONFIG";
    static final String KEY_CITY = "com.ubercab.realtime.object.CITY";
    static final String KEY_CLIENT = "com.ubercab.realtime.object.CLIENT";
    static final String KEY_CLIENT_STATUS = "com.ubercab.realtime.object.CLIENT_STATUS";
    static final String KEY_EYEBALL = "com.ubercab.realtime.object.EYEBALL";
    static final String KEY_TRIP = "com.ubercab.realtime.object.TRIP";
    private boolean enabled;
    private final hoi keyValueStore;

    PersistedObjectDataStore(hkv hkv, hoi hoi1, gju gju1)
    {
        super(hkv, gju1);
        keyValueStore = hoi1;
    }

    public static PersistedObjectDataStore newStore(hkv hkv, hoi hoi1)
    {
        return new PersistedObjectDataStore(hkv, hoi1, new gju());
    }

    private void putOrRemoveIfNeeded(String s, Object obj)
    {
        if (!enabled)
        {
            return;
        }
        if (obj != null)
        {
            keyValueStore.a(s, obj);
            return;
        } else
        {
            keyValueStore.a(s);
            return;
        }
    }

    public void enable()
    {
        enabled = true;
        commit(new _cls1());
    }

    protected void stream(City city)
    {
        putOrRemoveIfNeeded("com.ubercab.realtime.object.CITY", city);
        super.stream(city);
    }

    protected void stream(Client client)
    {
        putOrRemoveIfNeeded("com.ubercab.realtime.object.CLIENT", client);
        super.stream(client);
    }

    protected void stream(ClientStatus clientstatus)
    {
        putOrRemoveIfNeeded("com.ubercab.realtime.object.CLIENT_STATUS", clientstatus);
        super.stream(clientstatus);
    }

    protected void stream(Eyeball eyeball)
    {
        putOrRemoveIfNeeded("com.ubercab.realtime.object.EYEBALL", eyeball);
        super.stream(eyeball);
    }

    protected void stream(Trip trip)
    {
        putOrRemoveIfNeeded("com.ubercab.realtime.object.TRIP", trip);
        super.stream(trip);
    }

    protected void stream(Map map)
    {
        putOrRemoveIfNeeded("com.ubercab.realtime.object.APP_CONFIG", map);
        super.stream(map);
    }


    /* member class not found */
    class _cls1 {}

}
