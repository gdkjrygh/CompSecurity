// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.pool;

import java.util.concurrent.TimeUnit;

public abstract class PoolEntry
{

    private final Object conn;
    private final long created;
    private long expiry;
    private final String id;
    private final Object route;
    private volatile Object state;
    private long updated;
    private final long validUnit;

    public PoolEntry(String s, Object obj, Object obj1)
    {
        this(s, obj, obj1, 0L, TimeUnit.MILLISECONDS);
    }

    public PoolEntry(String s, Object obj, Object obj1, long l, TimeUnit timeunit)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("Route may not be null");
        }
        if (obj1 == null)
        {
            throw new IllegalArgumentException("Connection may not be null");
        }
        if (timeunit == null)
        {
            throw new IllegalArgumentException("Time unit may not be null");
        }
        id = s;
        route = obj;
        conn = obj1;
        created = System.currentTimeMillis();
        if (l > 0L)
        {
            validUnit = created + timeunit.toMillis(l);
        } else
        {
            validUnit = 0x7fffffffffffffffL;
        }
        expiry = validUnit;
    }

    public abstract void close();

    public Object getConnection()
    {
        return conn;
    }

    public long getCreated()
    {
        return created;
    }

    public long getExpiry()
    {
        this;
        JVM INSTR monitorenter ;
        long l = expiry;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public String getId()
    {
        return id;
    }

    public Object getRoute()
    {
        return route;
    }

    public Object getState()
    {
        return state;
    }

    public long getUpdated()
    {
        this;
        JVM INSTR monitorenter ;
        long l = updated;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public long getValidUnit()
    {
        return validUnit;
    }

    public abstract boolean isClosed();

    public boolean isExpired(long l)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = expiry;
        boolean flag;
        if (l >= l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void setState(Object obj)
    {
        state = obj;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[id:");
        stringbuilder.append(id);
        stringbuilder.append("][route:");
        stringbuilder.append(route);
        stringbuilder.append("][state:");
        stringbuilder.append(state);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void updateExpiry(long l, TimeUnit timeunit)
    {
        this;
        JVM INSTR monitorenter ;
        if (timeunit != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("Time unit may not be null");
        timeunit;
        this;
        JVM INSTR monitorexit ;
        throw timeunit;
        updated = System.currentTimeMillis();
        if (l <= 0L)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        l = updated + timeunit.toMillis(l);
_L1:
        expiry = Math.min(l, validUnit);
        this;
        JVM INSTR monitorexit ;
        return;
        l = 0x7fffffffffffffffL;
          goto _L1
    }
}
