// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.measurement;

import com.comscore.analytics.Core;
import com.comscore.applications.AggregateMeasurement;
import com.comscore.metrics.Request;
import com.comscore.utils.CSLog;
import com.comscore.utils.Constants;
import com.comscore.utils.Date;
import com.comscore.utils.Storage;
import com.comscore.utils.task.TaskExecutor;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.comscore.measurement:
//            Measurement, Label, a

public class MeasurementDispatcher
{

    public static final String DAY_CHECK_COUNTER = "q_dcc";
    public static final String DAY_CHECK_OFFSET = "q_dcf";
    public static final long MILLIS_PER_DAY = 0x5265c00L;
    public static final long MILLIS_PER_SECOND = 1000L;
    Core a;
    protected AtomicLong b;
    protected AtomicInteger c;
    protected AtomicLong d;
    protected AtomicInteger e;
    protected AtomicInteger f;
    protected Object g;
    private AggregateMeasurement h;

    public MeasurementDispatcher(Core core)
    {
        h = null;
        g = new Object();
        c = new AtomicInteger(0);
        b = new AtomicLong(-1L);
        d = new AtomicLong(-1L);
        e = new AtomicInteger(0);
        f = new AtomicInteger(0);
        a = core;
    }

    private void a(AggregateMeasurement aggregatemeasurement)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (h != null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        h = aggregatemeasurement;
        h.formatLists();
_L2:
        return;
        h.aggregateLabels(aggregatemeasurement.getAggregateLabels());
        if (true) goto _L2; else goto _L1
_L1:
        aggregatemeasurement;
        obj;
        JVM INSTR monitorexit ;
        throw aggregatemeasurement;
    }

    static void a(MeasurementDispatcher measurementdispatcher, Measurement measurement)
    {
        measurementdispatcher.b(measurement);
    }

    private boolean a()
    {
        Storage storage;
        long l;
        boolean flag1;
        flag1 = false;
        storage = a.getStorage();
        l = Date.unixTime();
        if (l >= b.get()) goto _L2; else goto _L1
_L1:
        c.set(0);
        b.set(l);
        e.set(0);
        d.set(l);
        storage.set("q_dcc", Integer.toString(e.get(), 10));
        storage.set("q_dcf", Long.toString(d.get(), 10));
_L4:
        boolean flag = flag1;
        if (c.get() < 20)
        {
            flag = flag1;
            if (e.get() < 6000)
            {
                c.incrementAndGet();
                e.getAndIncrement();
                storage.set("q_dcc", Integer.toString(e.get(), 10));
                flag = true;
            }
        }
        return flag;
_L2:
        if (l - b.get() > 1000L)
        {
            c.set(0);
            b.set(l);
        }
        if (l - d.get() > 0x5265c00L)
        {
            e.set(0);
            d.set(l);
            storage.set("q_dcc", Integer.toString(e.get(), 10));
            storage.set("q_dcf", Long.toString(d.get(), 10));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void b(Measurement measurement)
    {
        if (a.isEnabled())
        {
            CSLog.d(this, (new StringBuilder()).append("sendMeasurmement: ").append(measurement.retrieveLabelsAsString(a.getMeasurementLabelOrder())).toString());
            addAggregateData(measurement);
            if (!(measurement instanceof AggregateMeasurement))
            {
                addEventCounter(measurement);
                a(measurement);
                (new Request(a, measurement)).send();
                return;
            }
        }
    }

    protected void a(Measurement measurement)
    {
        if (a.isEnabled())
        {
            measurement.setLabel(new Label("c12", a.getVisitorId(), Boolean.valueOf(false)));
            if (a.getCrossPublisherId() != null)
            {
                measurement.setLabel(new Label("ns_ak", a.getCrossPublisherId(), Boolean.valueOf(false)));
                return;
            }
        }
    }

    public void addAggregateData(Measurement measurement)
    {
        if (!a.isEnabled())
        {
            return;
        }
        synchronized (g)
        {
            if (!(measurement instanceof AggregateMeasurement))
            {
                break MISSING_BLOCK_LABEL_41;
            }
            a((AggregateMeasurement)measurement);
        }
        return;
        measurement;
        obj;
        JVM INSTR monitorexit ;
        throw measurement;
        if (h == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        for (Iterator iterator = h.getAggregateLabels().iterator(); iterator.hasNext(); measurement.setLabel((Label)iterator.next())) { }
        h = null;
        obj;
        JVM INSTR monitorexit ;
    }

    public void addEventCounter(Measurement measurement)
    {
        if (!a.isEnabled())
        {
            return;
        } else
        {
            f.getAndIncrement();
            measurement.setLabel(new Label("ns_ap_ec", String.valueOf(f), Boolean.valueOf(false)));
            return;
        }
    }

    public void loadEventData()
    {
        Storage storage;
        if (a.isEnabled())
        {
            if ((storage = a.getStorage()).has("q_dcc").booleanValue() && storage.has("q_dcf").booleanValue())
            {
                try
                {
                    int i = Integer.parseInt(storage.get("q_dcc"), 10);
                    long l = Long.parseLong(storage.get("q_dcf"), 10);
                    if (Date.unixTime() >= l)
                    {
                        e.set(i);
                        d.set(l);
                        return;
                    }
                }
                catch (NumberFormatException numberformatexception)
                {
                    if (Constants.DEBUG)
                    {
                        CSLog.e(this, "Unexpected error parsing storage data: ");
                        CSLog.printStackTrace(numberformatexception);
                        throw numberformatexception;
                    }
                }
            }
        }
    }

    public boolean sendMeasurmement(Measurement measurement, boolean flag)
    {
        while (!a.isEnabled() || measurement == null) 
        {
            return false;
        }
        if (!a() && a.getStorage() != null)
        {
            CSLog.d(this, "Data not sent");
            return false;
        } else
        {
            return a.getTaskExecutor().execute(new a(this, measurement), flag);
        }
    }
}
