// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public class zzx
    implements DataEvent
{

    private int zzUS;
    private DataItem zzbam;

    public zzx(DataEvent dataevent)
    {
        zzUS = dataevent.getType();
        zzbam = (DataItem)dataevent.getDataItem().freeze();
    }

    public Object freeze()
    {
        return zzCE();
    }

    public DataItem getDataItem()
    {
        return zzbam;
    }

    public int getType()
    {
        return zzUS;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public String toString()
    {
        String s;
        if (getType() == 1)
        {
            s = "changed";
        } else
        if (getType() == 2)
        {
            s = "deleted";
        } else
        {
            s = "unknown";
        }
        return (new StringBuilder()).append("DataEventEntity{ type=").append(s).append(", dataitem=").append(getDataItem()).append(" }").toString();
    }

    public DataEvent zzCE()
    {
        return this;
    }
}
