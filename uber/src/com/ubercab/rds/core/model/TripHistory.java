// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rds.core.model;

import android.os.Parcelable;
import java.util.List;

// Referenced classes of package com.ubercab.rds.core.model:
//            Shape_TripHistory

public abstract class TripHistory
    implements Parcelable
{

    public TripHistory()
    {
    }

    public static TripHistory create()
    {
        return new Shape_TripHistory();
    }

    public abstract List getTrips();

    public abstract TripHistory setTrips(List list);
}
