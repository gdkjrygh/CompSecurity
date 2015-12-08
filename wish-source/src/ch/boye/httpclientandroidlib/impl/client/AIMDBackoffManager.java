// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;

import ch.boye.httpclientandroidlib.client.BackoffManager;
import ch.boye.httpclientandroidlib.conn.routing.HttpRoute;
import ch.boye.httpclientandroidlib.pool.ConnPoolControl;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            SystemClock, Clock

public class AIMDBackoffManager
    implements BackoffManager
{

    private double backoffFactor;
    private int cap;
    private final Clock clock;
    private final ConnPoolControl connPerRoute;
    private long coolDown;
    private final Map lastRouteBackoffs;
    private final Map lastRouteProbes;

    public AIMDBackoffManager(ConnPoolControl connpoolcontrol)
    {
        this(connpoolcontrol, ((Clock) (new SystemClock())));
    }

    AIMDBackoffManager(ConnPoolControl connpoolcontrol, Clock clock1)
    {
        coolDown = 5000L;
        backoffFactor = 0.5D;
        cap = 2;
        clock = clock1;
        connPerRoute = connpoolcontrol;
        lastRouteProbes = new HashMap();
        lastRouteBackoffs = new HashMap();
    }

    private int getBackedOffPoolSize(int i)
    {
        if (i <= 1)
        {
            return 1;
        } else
        {
            return (int)Math.floor(backoffFactor * (double)i);
        }
    }

    private Long getLastUpdate(Map map, HttpRoute httproute)
    {
        httproute = (Long)map.get(httproute);
        map = httproute;
        if (httproute == null)
        {
            map = Long.valueOf(0L);
        }
        return map;
    }

    public void backOff(HttpRoute httproute)
    {
        int i;
        long l;
label0:
        {
            synchronized (connPerRoute)
            {
                i = connPerRoute.getMaxPerRoute(httproute);
                Long long1 = getLastUpdate(lastRouteBackoffs, httproute);
                l = clock.getCurrentTime();
                if (l - long1.longValue() >= coolDown)
                {
                    break label0;
                }
            }
            return;
        }
        connPerRoute.setMaxPerRoute(httproute, getBackedOffPoolSize(i));
        lastRouteBackoffs.put(httproute, Long.valueOf(l));
        connpoolcontrol;
        JVM INSTR monitorexit ;
        return;
        httproute;
        connpoolcontrol;
        JVM INSTR monitorexit ;
        throw httproute;
    }

    public void probe(HttpRoute httproute)
    {
        ConnPoolControl connpoolcontrol = connPerRoute;
        connpoolcontrol;
        JVM INSTR monitorenter ;
        int i;
        i = connPerRoute.getMaxPerRoute(httproute);
        if (i < cap)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        i = cap;
_L1:
        long l;
        Long long1 = getLastUpdate(lastRouteProbes, httproute);
        Long long2 = getLastUpdate(lastRouteBackoffs, httproute);
        l = clock.getCurrentTime();
        if (l - long1.longValue() < coolDown || l - long2.longValue() < coolDown)
        {
            return;
        }
        connPerRoute.setMaxPerRoute(httproute, i);
        lastRouteProbes.put(httproute, Long.valueOf(l));
        return;
        httproute;
        connpoolcontrol;
        JVM INSTR monitorexit ;
        throw httproute;
        i++;
          goto _L1
    }

    public void setBackoffFactor(double d)
    {
        if (d <= 0.0D || d >= 1.0D)
        {
            throw new IllegalArgumentException("backoffFactor must be 0.0 < f < 1.0");
        } else
        {
            backoffFactor = d;
            return;
        }
    }

    public void setCooldownMillis(long l)
    {
        if (coolDown <= 0L)
        {
            throw new IllegalArgumentException("cooldownMillis must be positive");
        } else
        {
            coolDown = l;
            return;
        }
    }

    public void setPerHostConnectionCap(int i)
    {
        if (i < 1)
        {
            throw new IllegalArgumentException("perHostConnectionCap must be >= 1");
        } else
        {
            cap = i;
            return;
        }
    }
}
