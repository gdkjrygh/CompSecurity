// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.dsx;

import com.weather.dal2.data.Record;

// Referenced classes of package com.weather.dal2.dsx:
//            RecordSets

public abstract class DsxRecord
    implements Record
{

    public static final char SLASH = 47;
    protected final String id = null;
    protected Integer status;

    public DsxRecord()
    {
    }

    public String getId()
    {
        return id;
    }

    public String getLocationIdentifier()
    {
        int i = id.lastIndexOf('/');
        return id.substring(i + 1);
    }

    public Integer getStatus()
    {
        return status;
    }

    public abstract void normalize();

    protected void postParsingInitializer(RecordSets recordsets)
    {
    }
}
