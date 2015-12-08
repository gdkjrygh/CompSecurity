// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.locations.adapters.policy;

import com.google.common.base.Preconditions;
import com.weather.dal2.locations.SavedLocation;

// Referenced classes of package com.weather.Weather.locations.adapters.policy:
//            LocationSelectedOnInitPolicy

public class AlertEnabledLocationSelectedOnInitPolicy
    implements LocationSelectedOnInitPolicy
{

    private final com.weather.dal2.locations.SavedLocation.AlertType alertType;

    public AlertEnabledLocationSelectedOnInitPolicy(com.weather.dal2.locations.SavedLocation.AlertType alerttype)
    {
        alertType = (com.weather.dal2.locations.SavedLocation.AlertType)Preconditions.checkNotNull(alerttype);
    }

    public boolean isSelected(SavedLocation savedlocation)
    {
        return savedlocation.hasAlert(alertType);
    }
}
