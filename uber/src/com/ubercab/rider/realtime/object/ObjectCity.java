// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.object;

import com.ubercab.rider.realtime.model.ProductGroup;
import com.ubercab.rider.realtime.model.VehicleView;
import hky;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.ubercab.rider.realtime.object:
//            Shape_ObjectCity

abstract class ObjectCity
    implements hky
{

    ObjectCity()
    {
    }

    public static ObjectCity create()
    {
        return new Shape_ObjectCity();
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
            if (productgroup.getGroupType() != null && productgroup.getGroupType().equals(s))
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
}
