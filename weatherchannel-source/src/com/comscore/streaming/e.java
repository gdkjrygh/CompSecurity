// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming;

import com.comscore.analytics.Core;
import com.comscore.applications.ApplicationMeasurement;
import com.comscore.applications.EventType;
import com.comscore.measurement.MeasurementDispatcher;
import java.util.HashMap;

// Referenced classes of package com.comscore.streaming:
//            StreamSense

class e
    implements Runnable
{

    final HashMap a;
    final String b;
    final StreamSense c;

    e(StreamSense streamsense, HashMap hashmap, String s)
    {
        c = streamsense;
        a = hashmap;
        b = s;
        super();
    }

    public void run()
    {
        ApplicationMeasurement applicationmeasurement = ApplicationMeasurement.newApplicationMeasurement(c.a, EventType.HIDDEN, a, b);
        c.a.getMeasurementDispatcher().sendMeasurmement(applicationmeasurement, false);
    }
}
