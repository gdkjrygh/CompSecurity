// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import gju;
import hjh;
import hjj;
import hkq;
import hkt;
import hkv;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.ubercab.rider.realtime.object:
//            ObjectCity, ObjectClient, ObjectClientStatus, ObjectEyeball, 
//            ObjectTrip

public class ObjectDataStore extends hkt
{

    private Map appConfig;
    private ObjectCity city;
    private ObjectClient client;
    private ObjectClientStatus clientStatus;
    private final gju clock;
    private final hkq data = new InternalData(null);
    private List experiments;
    private ObjectEyeball eyeball;
    private Long lastTransactionTimeMillis;
    private ObjectTrip trip;
    private boolean updateAppConfig;
    private boolean updateCity;
    private boolean updateClient;
    private boolean updateClientStatus;
    private boolean updateExperiments;
    private boolean updateEyeball;
    private boolean updateTrip;

    ObjectDataStore(hkv hkv, gju gju1)
    {
        super(hkv);
        clock = gju1;
    }

    public static ObjectDataStore newStore(hkv hkv)
    {
        return new ObjectDataStore(hkv, new gju());
    }

    public void commit(hjj hjj1)
    {
        lastTransactionTimeMillis = Long.valueOf(gju.a());
        hjj1.call(data);
        if (updateAppConfig)
        {
            stream(appConfig);
            updateAppConfig = false;
        }
        if (updateCity)
        {
            stream(city);
            updateCity = false;
        }
        if (updateClient)
        {
            stream(client);
            updateClient = false;
        }
        if (updateClientStatus)
        {
            stream(clientStatus);
            updateClientStatus = false;
        }
        if (updateExperiments)
        {
            stream(experiments);
            updateExperiments = false;
        }
        if (updateEyeball)
        {
            stream(eyeball);
            updateEyeball = false;
        }
        if (updateTrip)
        {
            stream(trip);
            updateTrip = false;
        }
        streamTransaction();
    }

    public volatile hjh getData()
    {
        return getData();
    }

    public hkq getData()
    {
        return data;
    }

    public Long getLastTransactionTimeMillis()
    {
        return lastTransactionTimeMillis;
    }



/*
    static ObjectEyeball access$1002(ObjectDataStore objectdatastore, ObjectEyeball objecteyeball)
    {
        objectdatastore.eyeball = objecteyeball;
        return objecteyeball;
    }

*/


/*
    static boolean access$102(ObjectDataStore objectdatastore, boolean flag)
    {
        objectdatastore.updateAppConfig = flag;
        return flag;
    }

*/


/*
    static boolean access$1102(ObjectDataStore objectdatastore, boolean flag)
    {
        objectdatastore.updateExperiments = flag;
        return flag;
    }

*/



/*
    static List access$1202(ObjectDataStore objectdatastore, List list)
    {
        objectdatastore.experiments = list;
        return list;
    }

*/


/*
    static boolean access$1302(ObjectDataStore objectdatastore, boolean flag)
    {
        objectdatastore.updateTrip = flag;
        return flag;
    }

*/



/*
    static ObjectTrip access$1402(ObjectDataStore objectdatastore, ObjectTrip objecttrip)
    {
        objectdatastore.trip = objecttrip;
        return objecttrip;
    }

*/



/*
    static Map access$202(ObjectDataStore objectdatastore, Map map)
    {
        objectdatastore.appConfig = map;
        return map;
    }

*/


/*
    static boolean access$302(ObjectDataStore objectdatastore, boolean flag)
    {
        objectdatastore.updateCity = flag;
        return flag;
    }

*/



/*
    static ObjectCity access$402(ObjectDataStore objectdatastore, ObjectCity objectcity)
    {
        objectdatastore.city = objectcity;
        return objectcity;
    }

*/


/*
    static boolean access$502(ObjectDataStore objectdatastore, boolean flag)
    {
        objectdatastore.updateClient = flag;
        return flag;
    }

*/



/*
    static ObjectClient access$602(ObjectDataStore objectdatastore, ObjectClient objectclient)
    {
        objectdatastore.client = objectclient;
        return objectclient;
    }

*/


/*
    static boolean access$702(ObjectDataStore objectdatastore, boolean flag)
    {
        objectdatastore.updateClientStatus = flag;
        return flag;
    }

*/



/*
    static ObjectClientStatus access$802(ObjectDataStore objectdatastore, ObjectClientStatus objectclientstatus)
    {
        objectdatastore.clientStatus = objectclientstatus;
        return objectclientstatus;
    }

*/


/*
    static boolean access$902(ObjectDataStore objectdatastore, boolean flag)
    {
        objectdatastore.updateEyeball = flag;
        return flag;
    }

*/

    /* member class not found */
    class InternalData {}

}
