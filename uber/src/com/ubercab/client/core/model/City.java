// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rider.realtime.model.ProductGroup;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_City

public abstract class City
    implements com.ubercab.rider.realtime.model.City
{

    List productGroups;
    Map vehicleViews;

    public City()
    {
    }

    static City create()
    {
        return new Shape_City();
    }

    public ProductGroup findFirstProductGroupByType(String s)
    {
        Object obj = getProductGroups();
        if (obj == null || ((List) (obj)).size() == 0)
        {
            return null;
        }
        if (s.isEmpty())
        {
            return (ProductGroup)((List) (obj)).get(0);
        }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            ProductGroup productgroup = (ProductGroup)((Iterator) (obj)).next();
            if (productgroup.getGroupType().equals(s))
            {
                return productgroup;
            }
        }

        return null;
    }

    public ProductGroup findProductGroupByUuid(String s)
    {
        Object obj = getProductGroups();
        if (s.isEmpty() || obj == null || ((List) (obj)).isEmpty())
        {
            return null;
        }
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext();)
        {
            ProductGroup productgroup = (ProductGroup)((Iterator) (obj)).next();
            if (s.equals(productgroup.getUuid()))
            {
                return productgroup;
            }
        }

        return null;
    }

    public VehicleView findVehicleViewById(String s)
    {
        Map map = getVehicleViews();
        if (s != null && map != null)
        {
            return (VehicleView)map.get(s);
        } else
        {
            return null;
        }
    }

    public abstract String getCityId();

    public abstract String getCityName();

    public abstract String getCountryIso2();

    public abstract String getCurrencyCode();

    public abstract String getDefaultVehicleViewId();

    public abstract String getFareSplitFeeString();

    public abstract List getMessages();

    public List getProductGroups()
    {
        if (productGroups != null)
        {
            return new ArrayList(productGroups);
        } else
        {
            return null;
        }
    }

    public Map getVehicleViews()
    {
        if (vehicleViews != null)
        {
            return new HashMap(vehicleViews);
        } else
        {
            return null;
        }
    }

    public abstract List getVehicleViewsOrder();

    public abstract City setCityId(String s);

    abstract City setCityName(String s);

    abstract City setCountryIso2(String s);

    abstract City setCurrencyCode(String s);

    abstract City setDefaultVehicleViewId(String s);

    public abstract City setFareSplitFeeString(String s);

    public abstract City setMessages(List list);

    public City setProductGroups(List list)
    {
        productGroups = list;
        return this;
    }

    public City setVehicleViews(Map map)
    {
        vehicleViews = map;
        return this;
    }

    abstract City setVehicleViewsOrder(List list);
}
