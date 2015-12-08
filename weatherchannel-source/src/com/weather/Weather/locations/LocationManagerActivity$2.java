// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.locations;

import android.view.View;
import com.weather.Weather.locations.adapters.LocationListAdapter;

// Referenced classes of package com.weather.Weather.locations:
//            LocationManagerActivity

class this._cls0
    implements android.view.anagerActivity._cls2
{

    final LocationManagerActivity this$0;

    public void onClick(View view)
    {
        LocationManagerActivity.access$000(LocationManagerActivity.this).addFollowMeLocationToFixedLocationsIfAllowed(LocationManagerActivity.this);
    }

    er()
    {
        this$0 = LocationManagerActivity.this;
        super();
    }
}
