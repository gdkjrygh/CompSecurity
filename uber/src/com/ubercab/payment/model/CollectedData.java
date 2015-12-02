// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.model;

import android.os.Parcelable;
import java.util.Map;

// Referenced classes of package com.ubercab.payment.model:
//            Shape_CollectedData

public abstract class CollectedData
    implements Parcelable
{

    public CollectedData()
    {
    }

    public static CollectedData create(Map map)
    {
        return (new Shape_CollectedData()).setData(map);
    }

    public abstract Map getData();

    abstract CollectedData setData(Map map);
}
