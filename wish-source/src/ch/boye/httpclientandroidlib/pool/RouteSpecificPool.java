// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.pool;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

// Referenced classes of package ch.boye.httpclientandroidlib.pool:
//            PoolEntry, PoolEntryFuture

abstract class RouteSpecificPool
{

    private final LinkedList available = new LinkedList();
    private final Set leased = new HashSet();
    private final LinkedList pending = new LinkedList();
    private final Object route;

    RouteSpecificPool(Object obj)
    {
        route = obj;
    }

    public PoolEntry add(Object obj)
    {
        obj = createEntry(obj);
        leased.add(obj);
        return ((PoolEntry) (obj));
    }

    protected abstract PoolEntry createEntry(Object obj);

    public void free(PoolEntry poolentry, boolean flag)
    {
        if (poolentry == null)
        {
            throw new IllegalArgumentException("Pool entry may not be null");
        }
        if (!leased.remove(poolentry))
        {
            throw new IllegalStateException((new StringBuilder()).append("Entry ").append(poolentry).append(" has not been leased from this pool").toString());
        }
        if (flag)
        {
            available.addFirst(poolentry);
        }
    }

    public int getAllocatedCount()
    {
        return available.size() + leased.size();
    }

    public int getAvailableCount()
    {
        return available.size();
    }

    public PoolEntry getFree(Object obj)
    {
label0:
        {
label1:
            {
                if (available.isEmpty())
                {
                    break label0;
                }
                if (obj == null)
                {
                    break label1;
                }
                Iterator iterator = available.iterator();
                PoolEntry poolentry1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label1;
                    }
                    poolentry1 = (PoolEntry)iterator.next();
                } while (!obj.equals(poolentry1.getState()));
                iterator.remove();
                leased.add(poolentry1);
                return poolentry1;
            }
            obj = available.iterator();
            PoolEntry poolentry;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                poolentry = (PoolEntry)((Iterator) (obj)).next();
            } while (poolentry.getState() != null);
            ((Iterator) (obj)).remove();
            leased.add(poolentry);
            return poolentry;
        }
        return null;
    }

    public PoolEntry getLastUsed()
    {
        if (!available.isEmpty())
        {
            return (PoolEntry)available.getLast();
        } else
        {
            return null;
        }
    }

    public int getLeasedCount()
    {
        return leased.size();
    }

    public int getPendingCount()
    {
        return pending.size();
    }

    public final Object getRoute()
    {
        return route;
    }

    public PoolEntryFuture nextPending()
    {
        return (PoolEntryFuture)pending.poll();
    }

    public void queue(PoolEntryFuture poolentryfuture)
    {
        if (poolentryfuture == null)
        {
            return;
        } else
        {
            pending.add(poolentryfuture);
            return;
        }
    }

    public boolean remove(PoolEntry poolentry)
    {
        if (poolentry == null)
        {
            throw new IllegalArgumentException("Pool entry may not be null");
        }
        return available.remove(poolentry) || leased.remove(poolentry);
    }

    public void shutdown()
    {
        for (Iterator iterator = pending.iterator(); iterator.hasNext(); ((PoolEntryFuture)iterator.next()).cancel(true)) { }
        pending.clear();
        for (Iterator iterator1 = available.iterator(); iterator1.hasNext(); ((PoolEntry)iterator1.next()).close()) { }
        available.clear();
        for (Iterator iterator2 = leased.iterator(); iterator2.hasNext(); ((PoolEntry)iterator2.next()).close()) { }
        leased.clear();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[route: ");
        stringbuilder.append(route);
        stringbuilder.append("][leased: ");
        stringbuilder.append(leased.size());
        stringbuilder.append("][available: ");
        stringbuilder.append(available.size());
        stringbuilder.append("][pending: ");
        stringbuilder.append(pending.size());
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public void unqueue(PoolEntryFuture poolentryfuture)
    {
        if (poolentryfuture == null)
        {
            return;
        } else
        {
            pending.remove(poolentryfuture);
            return;
        }
    }
}
