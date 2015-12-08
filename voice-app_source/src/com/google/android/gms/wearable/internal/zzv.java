// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

public class zzv
    implements DataEvent
{

    private int zzSq;
    private DataItem zzaUl;

    public zzv(DataEvent dataevent)
    {
        zzSq = dataevent.getType();
        zzaUl = (DataItem)dataevent.getDataItem().freeze();
    }

    public Object freeze()
    {
        return zzBc();
    }

    public DataItem getDataItem()
    {
        return zzaUl;
    }

    public int getType()
    {
        return zzSq;
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

    public DataEvent zzBc()
    {
        return this;
    }
}
