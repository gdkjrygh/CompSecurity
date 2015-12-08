// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.locations.adapters.policy;

import com.google.common.base.Preconditions;
import com.weather.dal2.locations.SavedLocation;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.weather.Weather.locations.adapters.policy:
//            LocationSelectedOnInitPolicy

public class AnyAlertEnabledLocationSelectedOnInitPolicy
    implements LocationSelectedOnInitPolicy
{

    private final List alertTypeList;

    public AnyAlertEnabledLocationSelectedOnInitPolicy(List list)
    {
        alertTypeList = (List)Preconditions.checkNotNull(list);
    }

    public boolean isSelected(SavedLocation savedlocation)
    {
        boolean flag1 = false;
        Iterator iterator = alertTypeList.iterator();
        boolean flag;
        do
        {
            flag = flag1;
            if (!iterator.hasNext())
            {
                break;
            }
            if (!savedlocation.hasAlert((com.weather.dal2.locations.SavedLocation.AlertType)iterator.next()))
            {
                continue;
            }
            flag = true;
            break;
        } while (true);
        return flag;
    }
}
