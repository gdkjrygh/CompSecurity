// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.wearable.DataEvent;
import com.google.android.gms.wearable.DataItem;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            zzae, zzx

public final class zzy extends zzc
    implements DataEvent
{

    private final int zzasz;

    public zzy(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        zzasz = j;
    }

    public Object freeze()
    {
        return zzCE();
    }

    public DataItem getDataItem()
    {
        return new zzae(zzYX, zzabg, zzasz);
    }

    public int getType()
    {
        return getInteger("event_type");
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
        return (new StringBuilder()).append("DataEventRef{ type=").append(s).append(", dataitem=").append(getDataItem()).append(" }").toString();
    }

    public DataEvent zzCE()
    {
        return new zzx(this);
    }
}
