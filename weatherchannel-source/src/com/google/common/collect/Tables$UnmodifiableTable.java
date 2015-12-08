// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ForwardingTable, Tables, Table, Maps

private static class delegate extends ForwardingTable
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Table _flddelegate;

    public Set cellSet()
    {
        return Collections.unmodifiableSet(super.cellSet());
    }

    public void clear()
    {
        throw new UnsupportedOperationException();
    }

    public Map column(Object obj)
    {
        return Collections.unmodifiableMap(super.column(obj));
    }

    public Set columnKeySet()
    {
        return Collections.unmodifiableSet(super.columnKeySet());
    }

    public Map columnMap()
    {
        com.google.common.base.Function function = Tables.access$000();
        return Collections.unmodifiableMap(Maps.transformValues(super.columnMap(), function));
    }

    protected Table _mthdelegate()
    {
        return _flddelegate;
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    public Object put(Object obj, Object obj1, Object obj2)
    {
        throw new UnsupportedOperationException();
    }

    public void putAll(Table table)
    {
        throw new UnsupportedOperationException();
    }

    public Object remove(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public Map row(Object obj)
    {
        return Collections.unmodifiableMap(super.row(obj));
    }

    public Set rowKeySet()
    {
        return Collections.unmodifiableSet(super.rowKeySet());
    }

    public Map rowMap()
    {
        com.google.common.base.Function function = Tables.access$000();
        return Collections.unmodifiableMap(Maps.transformValues(super.rowMap(), function));
    }

    public Collection values()
    {
        return Collections.unmodifiableCollection(super.values());
    }

    (Table table)
    {
        _flddelegate = (Table)Preconditions.checkNotNull(table);
    }
}
