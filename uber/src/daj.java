// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.model.Ping;
import com.ubercab.client.core.model.event.ApiResponseEvent;
import com.ubercab.client.core.model.event.AppConfigEvent;
import com.ubercab.client.core.model.event.CityEvent;
import com.ubercab.client.core.model.event.ClientEvent;
import com.ubercab.client.core.model.event.ErrorObjectEvent;
import com.ubercab.client.core.model.event.FareInfoEvent;
import com.ubercab.client.core.model.event.FareSplitEvent;
import com.ubercab.client.core.model.event.ForceUpgradeUrlEvent;
import com.ubercab.client.core.model.event.IsForceUpgradeEvent;
import com.ubercab.client.core.model.event.MapFittingMobileAppDelayWindowMsEvent;
import com.ubercab.client.core.model.event.NearbyVehiclesEvent;
import com.ubercab.client.core.model.event.NoPingEvent;
import com.ubercab.client.core.model.event.SessionEvent;
import com.ubercab.client.core.model.event.TripEvent;

public final class daj
{

    private long a;
    private final cev b;
    private final gju c;
    private Ping d;

    public daj(cev cev1, gju gju1)
    {
        d = new Ping();
        gjz.a(cev1);
        gjz.a(gju1);
        b = cev1;
        c = gju1;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        d = null;
        a = 0L;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Ping ping)
    {
        this;
        JVM INSTR monitorenter ;
        Ping ping1;
        long l;
        ping1 = d;
        l = a;
        d = ping;
        a = gju.b();
        if (ping != null) goto _L2; else goto _L1
_L1:
        b.c(new NoPingEvent());
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (a == l && gjx.a(d, ping1))
        {
            continue; /* Loop/switch isn't completed */
        }
        b.c(new dar(ping, a));
        ping = ping1;
        if (ping1 != null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        ping = new Ping();
        if (!gjx.a(d.getApiResponse(), ping.getApiResponse()))
        {
            b.c(new ApiResponseEvent(d.getApiResponse()));
        }
        if (!gjx.a(d.getAppConfig(), ping.getAppConfig()))
        {
            b.c(new AppConfigEvent(d.getAppConfig()));
        }
        if (!gjx.a(d.getCity(), ping.getCity()))
        {
            b.c(new CityEvent(d.getCity()));
        }
        if (!gjx.a(d.getClient(), ping.getClient()))
        {
            b.c(new ClientEvent(d.getClient()));
        }
        if (!gjx.a(d.getErrorObj(), ping.getErrorObj()))
        {
            b.c(new ErrorObjectEvent(d.getErrorObj()));
        }
        if (!gjx.a(d.getFareInfo(), ping.getFareInfo()))
        {
            b.c(new FareInfoEvent(d.getFareInfo()));
        }
        if (!gjx.a(d.getFareSplit(), ping.getFareSplit()))
        {
            b.c(new FareSplitEvent(d.getFareSplit()));
        }
        if (!gjx.a(d.getForceUpgradeUrl(), ping.getForceUpgradeUrl()))
        {
            b.c(new ForceUpgradeUrlEvent(d.getForceUpgradeUrl()));
        }
        if (!gjx.a(Boolean.valueOf(d.isForceUpgrade()), Boolean.valueOf(ping.isForceUpgrade())))
        {
            b.c(new IsForceUpgradeEvent(d.isForceUpgrade()));
        }
        if (!gjx.a(Integer.valueOf(d.getMapFittingMobileAppDelayWindowMs()), Integer.valueOf(ping.getMapFittingMobileAppDelayWindowMs())))
        {
            b.c(new MapFittingMobileAppDelayWindowMsEvent(d.getMapFittingMobileAppDelayWindowMs()));
        }
        if (!gjx.a(d.getNearbyVehicles(), ping.getNearbyVehicles()))
        {
            b.c(new NearbyVehiclesEvent(d.getNearbyVehicles()));
        }
        if (!gjx.a(d.getSession(), ping.getSession()))
        {
            b.c(new SessionEvent(d.getSession()));
        }
        if (!gjx.a(d.getTrip(), ping.getTrip()))
        {
            b.c(new TripEvent(d.getTrip()));
        }
        if (true) goto _L4; else goto _L3
_L3:
        ping;
        throw ping;
    }

    public final Ping b()
    {
        this;
        JVM INSTR monitorenter ;
        Ping ping = d;
        this;
        JVM INSTR monitorexit ;
        return ping;
        Exception exception;
        exception;
        throw exception;
    }

    public final long c()
    {
        this;
        JVM INSTR monitorenter ;
        long l = a;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        if (d == null) goto _L2; else goto _L1
_L1:
        long l;
        long l1;
        l = gju.b();
        l1 = a;
        if (l - l1 < 300L) goto _L3; else goto _L2
_L2:
        boolean flag = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public final void e()
    {
        b.a(this);
    }

    public final ApiResponseEvent produceApiResponseEvent()
    {
        if (d())
        {
            return null;
        } else
        {
            return new ApiResponseEvent(d.getApiResponse());
        }
    }

    public final AppConfigEvent produceAppConfigEvent()
    {
        if (d())
        {
            return null;
        } else
        {
            return new AppConfigEvent(d.getAppConfig());
        }
    }

    public final CityEvent produceCityEvent()
    {
        if (d())
        {
            return null;
        } else
        {
            return new CityEvent(d.getCity());
        }
    }

    public final ClientEvent produceClientEvent()
    {
        if (d())
        {
            return null;
        } else
        {
            return new ClientEvent(d.getClient());
        }
    }

    public final ErrorObjectEvent produceErrorObjEvent()
    {
        if (d())
        {
            return null;
        } else
        {
            return new ErrorObjectEvent(d.getErrorObj());
        }
    }

    public final FareInfoEvent produceFareInfoEvent()
    {
        if (d())
        {
            return null;
        } else
        {
            return new FareInfoEvent(d.getFareInfo());
        }
    }

    public final FareSplitEvent produceFareSplitEvent()
    {
        if (d())
        {
            return null;
        } else
        {
            return new FareSplitEvent(d.getFareSplit());
        }
    }

    public final ForceUpgradeUrlEvent produceForceUpgradeUrlEvent()
    {
        if (d())
        {
            return null;
        } else
        {
            return new ForceUpgradeUrlEvent(d.getForceUpgradeUrl());
        }
    }

    public final IsForceUpgradeEvent produceIsForceUpgradeEvent()
    {
        if (d())
        {
            return null;
        } else
        {
            return new IsForceUpgradeEvent(d.isForceUpgrade());
        }
    }

    public final MapFittingMobileAppDelayWindowMsEvent produceMapFittingMobileAppDelayWindowMsEvent()
    {
        if (d())
        {
            return null;
        } else
        {
            return new MapFittingMobileAppDelayWindowMsEvent(d.getMapFittingMobileAppDelayWindowMs());
        }
    }

    public final NearbyVehiclesEvent produceNearbyVehiclesEvent()
    {
        if (d())
        {
            return null;
        } else
        {
            return new NearbyVehiclesEvent(d.getNearbyVehicles());
        }
    }

    public final NoPingEvent produceNoPingEvent()
    {
        if (d())
        {
            return new NoPingEvent();
        } else
        {
            return null;
        }
    }

    public final dar producePingEvent()
    {
        if (d())
        {
            return null;
        } else
        {
            return new dar(d, a);
        }
    }

    public final SessionEvent produceSessionEvent()
    {
        if (d())
        {
            return null;
        } else
        {
            return new SessionEvent(d.getSession());
        }
    }

    public final TripEvent produceTripEvent()
    {
        if (d())
        {
            return null;
        } else
        {
            return new TripEvent(d.getTrip());
        }
    }
}
