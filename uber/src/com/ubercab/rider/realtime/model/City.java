// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.model;

import java.util.List;
import java.util.Map;

// Referenced classes of package com.ubercab.rider.realtime.model:
//            ProductGroup, VehicleView

public interface City
{

    public abstract ProductGroup findFirstProductGroupByType(String s);

    public abstract ProductGroup findProductGroupByUuid(String s);

    public abstract VehicleView findVehicleViewById(String s);

    public abstract String getCityId();

    public abstract String getCityName();

    public abstract String getCountryIso2();

    public abstract String getCurrencyCode();

    public abstract String getDefaultVehicleViewId();

    public abstract String getFareSplitFeeString();

    public abstract List getMessages();

    public abstract List getProductGroups();

    public abstract Map getVehicleViews();

    public abstract List getVehicleViewsOrder();
}
