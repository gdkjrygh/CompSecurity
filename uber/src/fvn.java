// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.ProductGroup;
import com.ubercab.rider.realtime.model.VehicleView;
import com.ubercab.rider.realtime.response.Promotion;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class fvn
{

    final Set a = new HashSet();
    private final gju b;
    private final gmg c;
    private final fim d;

    public fvn(gju gju1, gmg gmg1, fim fim1)
    {
        b = gju1;
        c = gmg1;
        d = fim1;
    }

    private void a(Promotion promotion, String s, String s1)
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        long l;
        long l1;
        try
        {
            promotion = simpledateformat.parse(promotion.getEndsAt().substring(0, 20));
        }
        // Misplaced declaration of an exception variable
        catch (Promotion promotion)
        {
            ijg.d(promotion, "Parse exception", new Object[0]);
            return;
        }
        l = promotion.getTime();
        l1 = gju.a();
        if (Long.valueOf(l).longValue() < Long.valueOf(l1).longValue())
        {
            d.a(s1);
            a(s, s1);
        }
    }

    private void a(String s, String s1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((fvo)iterator.next()).a(s, s1)) { }
    }

    public final void a(fvo fvo1)
    {
        a.add(fvo1);
    }

    public final void a(List list, City city)
    {
        Object obj = null;
        if (c.a(dbf.bb)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator;
        iterator = list.iterator();
        list = null;
_L10:
        if (!iterator.hasNext()) goto _L1; else goto _L3
_L3:
        if (!"eats".equals(((ProductGroup)iterator.next()).getGroupType()))
        {
            break MISSING_BLOCK_LABEL_194;
        }
        if (city.getVehicleViews() == null) goto _L1; else goto _L4
_L4:
        Iterator iterator1 = city.getVehicleViews().values().iterator();
_L8:
        if (!iterator1.hasNext()) goto _L6; else goto _L5
_L5:
        VehicleView vehicleview = (VehicleView)iterator1.next();
        if (!vehicleview.getEnableVehicleInventoryView()) goto _L8; else goto _L7
_L7:
        obj = vehicleview.getId();
        list = vehicleview.getUuid();
_L11:
        if (obj == null || list == null) goto _L1; else goto _L9
_L9:
        Promotion promotion = d.b(list);
        if (promotion == null)
        {
            a(((String) (obj)), ((String) (list)));
            return;
        }
        a(promotion, ((String) (obj)), ((String) (list)));
_L12:
        Object obj1 = obj;
        obj = list;
        list = ((List) (obj1));
          goto _L10
_L6:
        List list1 = list;
        list = ((List) (obj));
        obj = list1;
          goto _L11
        List list2 = list;
        list = ((List) (obj));
        obj = list2;
          goto _L12
    }

    public final void b(fvo fvo1)
    {
        a.remove(fvo1);
    }
}
