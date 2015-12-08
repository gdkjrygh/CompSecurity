// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.locations;

import com.weather.Weather.locations.adapters.LocationListAdapter;

// Referenced classes of package com.weather.Weather.locations:
//            LocationManagerActivity

class this._cls0
    implements Runnable
{

    final LocationManagerActivity this$0;

    public void run()
    {
        LocationManagerActivity.access$000(LocationManagerActivity.this).updateData(LocationManagerActivity.access$300(LocationManagerActivity.this));
    }

    er()
    {
        this$0 = LocationManagerActivity.this;
        super();
    }
}
