// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.beacons.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.weather.beacons.analytics.Analytics;

// Referenced classes of package com.weather.beacons.view:
//            ViewGroupWithEntryBeacon

public class RelativeLayoutWithEntryBeacon extends RelativeLayout
    implements ViewGroupWithEntryBeacon
{

    private final String entryBeaconString;

    public RelativeLayoutWithEntryBeacon(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.getTheme().obtainStyledAttributes(attributeset, com.weather.ads2.R.styleable.RelativeLayoutWithEntryBeacon, 0, 0);
        entryBeaconString = context.getString(com.weather.ads2.R.styleable.RelativeLayoutWithEntryBeacon_entry_beacon);
        context.recycle();
    }

    public RelativeLayoutWithEntryBeacon(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        context = context.obtainStyledAttributes(attributeset, com.weather.ads2.R.styleable.RelativeLayoutWithEntryBeacon, i, 0);
        entryBeaconString = context.getString(com.weather.ads2.R.styleable.RelativeLayoutWithEntryBeacon_entry_beacon);
        context.recycle();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (entryBeaconString != null)
        {
            Analytics.trackState(entryBeaconString, null);
        }
    }
}
