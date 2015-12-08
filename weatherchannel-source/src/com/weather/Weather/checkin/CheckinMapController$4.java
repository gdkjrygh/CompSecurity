// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import android.util.Log;
import com.weather.checkin.provider.CheckinHistoryManager;
import com.weather.checkin.provider.CheckinHistoryRecord;
import com.weather.commons.analytics.checkin.CheckInSocialWeatherSummaryRecorder;
import com.weather.dal2.checkin.CheckinRequester;
import com.weather.dal2.locations.SavedLocation;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinMapController, CheckinIcon, CheckinClusterItem

class val.checkinId
    implements Runnable
{

    final CheckinMapController this$0;
    final String val$checkinId;
    final SavedLocation val$followMeLocation;
    final CheckinHistoryRecord val$historyRecord;
    final CheckinIcon val$icon;
    final CheckinClusterItem val$myCheckin;
    final int val$temperature;
    final int val$wxIconCode;

    public void run()
    {
        checkinHistoryManager.insertCheckin(val$historyRecord);
        if (!checkinRequester.postCheckin(val$myCheckin, val$followMeLocation, val$icon.getIconPhrase(), val$wxIconCode, val$temperature, val$checkinId))
        {
            Log.i("CheckinMapController", "Checkin creation failed");
            localyticsRecorder.incrementWeatherCheckinFailed();
            return;
        }
        try
        {
            localyticsRecorder.submittedWeatherCheckin();
            return;
        }
        catch (Exception exception)
        {
            Log.e("CheckinMapController", "Creating checkin failed", exception);
        }
        return;
    }

    WeatherSummaryRecorder()
    {
        this$0 = final_checkinmapcontroller;
        val$historyRecord = checkinhistoryrecord;
        val$myCheckin = checkinclusteritem;
        val$followMeLocation = savedlocation;
        val$icon = checkinicon;
        val$wxIconCode = i;
        val$temperature = j;
        val$checkinId = String.this;
        super();
    }
}
