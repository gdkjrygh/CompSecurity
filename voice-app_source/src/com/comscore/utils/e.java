// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import com.comscore.analytics.Core;
import com.comscore.measurement.Measurement;

// Referenced classes of package com.comscore.utils:
//            OfflineMeasurementsCache

class e
    implements Runnable
{

    final Measurement a;
    final OfflineMeasurementsCache b;

    e(OfflineMeasurementsCache offlinemeasurementscache, Measurement measurement)
    {
        b = offlinemeasurementscache;
        a = measurement;
        super();
    }

    public void run()
    {
        b.saveEvent(a.retrieveLabelsAsString(b.a.getMeasurementLabelOrder()));
    }
}
