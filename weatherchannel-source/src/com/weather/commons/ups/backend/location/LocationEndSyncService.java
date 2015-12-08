// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend.location;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import com.weather.commons.push.PushService;
import com.weather.commons.ups.backend.AbnormalHttpResponseException;
import com.weather.commons.ups.facade.DsxLocation;
import com.weather.dal2.locations.FixedLocations;
import com.weather.dal2.locations.SavedLocation;
import com.weather.dal2.locations.SavedLocationsSnapshot;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

// Referenced classes of package com.weather.commons.ups.backend.location:
//            UpsLocationManager

public class LocationEndSyncService extends IntentService
{

    public static final int SYNC_RESULT_FAILURE = 0;
    public static final int SYNC_RESULT_SUCCESS = 1;
    private static final String TAG = "LocationEndSyncService";
    final UpsLocationManager upsLocationManager = UpsLocationManager.getInstance();

    public LocationEndSyncService()
    {
        super("LocationEndSyncService");
    }

    private void deleteUnusedRemoteLocations(List list, List list1)
        throws AbnormalHttpResponseException, com.weather.util.net.HttpRequest.HttpRequestException
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            DsxLocation dsxlocation = (DsxLocation)list.next();
            if (!existsLocally(dsxlocation, list1))
            {
                upsLocationManager.deleteLocation(dsxlocation);
            }
        } while (true);
    }

    private boolean existsLocally(DsxLocation dsxlocation, List list)
    {
        dsxlocation = dsxlocation.getDoc().getLoc();
        for (list = list.iterator(); list.hasNext();)
        {
            SavedLocation savedlocation = (SavedLocation)list.next();
            if (dsxlocation.equals(savedlocation.getLatLong()) || dsxlocation.equals(savedlocation.getKeyTypeCountry()))
            {
                return true;
            }
        }

        return false;
    }

    private DsxLocation findRemoteEquivalent(List list, SavedLocation savedlocation)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            DsxLocation dsxlocation = (DsxLocation)list.next();
            String s = dsxlocation.getDoc().getLoc();
            if (s.equals(savedlocation.getLatLong()) || s.equals(savedlocation.getKeyTypeCountry()))
            {
                return dsxlocation;
            }
        }

        return null;
    }

    private void sendSyncResultMessage(int i)
    {
        Intent intent = new Intent(getString(com.weather.commons.R.string.sync_task_result));
        intent.putExtra("sync_result", i);
        sendBroadcast(intent);
    }

    protected void onHandleIntent(Intent intent)
    {
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1;
        List list;
        List list1;
        int i;
        boolean flag;
        String s;
        Object obj;
        Iterator iterator;
        SavedLocation savedlocation;
        try
        {
            intent = new SavedLocationsSnapshot();
            list = upsLocationManager.getUserProfileLocationsFromDsx();
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            sendSyncResultMessage(0);
            Log.w("LocationEndSyncService", intent.toString(), intent);
            return;
        }
        i = 0;
        list1 = intent.getFixedLocations();
        iterator = list1.iterator();
_L14:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        savedlocation = (SavedLocation)iterator.next();
        intent = findRemoteEquivalent(list, savedlocation);
        if (intent != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = savedlocation.getAddress();
        if (!flag) goto _L6; else goto _L5
_L5:
        obj = intent.getDoc();
        obj1 = intent.getId();
        intent = s;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        s = ((com.weather.commons.ups.facade.DsxLocation.DsxLocationDoc) (obj)).getAddress();
        intent = s;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        FixedLocations.getInstance().setAddress(savedlocation, s);
        intent = s;
        obj = ((com.weather.commons.ups.facade.DsxLocation.DsxLocationDoc) (obj)).getLoc();
        s = ((String) (obj1));
_L12:
        obj1 = savedlocation.getTags();
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        if (!((Set) (obj1)).isEmpty()) goto _L9; else goto _L8
_L13:
        intent = new DsxLocation(s, intent, ((String) (obj)), savedlocation.getNickname(), i, ((String) (obj1)));
        if (flag) goto _L11; else goto _L10
_L10:
        upsLocationManager.addLocation(intent);
        break MISSING_BLOCK_LABEL_306;
_L6:
        obj = UUID.randomUUID().toString();
        intent = s;
        if (s == null)
        {
            intent = "";
        }
        obj1 = savedlocation.getKeyTypeCountry();
        s = ((String) (obj));
        obj = obj1;
          goto _L12
_L9:
        obj1 = (String)((Set) (obj1)).iterator().next();
          goto _L13
_L11:
        upsLocationManager.updateLocation(intent);
        break MISSING_BLOCK_LABEL_306;
_L4:
        deleteUnusedRemoteLocations(list, list1);
        if (!PushService.startPushService(com.weather.commons.push.PushService.ServicesSet.ALL_SERVICES))
        {
            sendSyncResultMessage(0);
            return;
        }
          goto _L1
_L8:
        obj1 = null;
          goto _L13
        i++;
          goto _L14
    }
}
