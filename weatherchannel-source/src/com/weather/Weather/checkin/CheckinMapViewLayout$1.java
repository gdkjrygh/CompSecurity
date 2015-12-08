// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.checkin;

import com.weather.dal2.locations.FollowMeSnapshot;
import com.weather.util.lbs.LbsUtil;

// Referenced classes of package com.weather.Weather.checkin:
//            CheckinMapViewLayout, CheckinMapController

class this._cls0
    implements com.google.android.gms.maps.uttonClickListener
{

    final CheckinMapViewLayout this$0;

    public boolean onMyLocationButtonClick()
    {
        com.weather.dal2.locations.SavedLocation savedlocation = (new FollowMeSnapshot()).getLocation();
        if (savedlocation != null && LbsUtil.getInstance().isLbsEnabledForAppAndDevice())
        {
            moveMapToLocation(savedlocation);
            controller.setActionBarToFollowMe();
        }
        return true;
    }

    uttonClickListener()
    {
        this$0 = CheckinMapViewLayout.this;
        super();
    }
}
