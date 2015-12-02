// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.client.core.model.vehicleview.Shape_VehicleView;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.NearbyVehicle;
import com.ubercab.rider.realtime.model.ProductGroup;
import com.ubercab.rider.realtime.model.VehicleView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class geg
{

    static final geh a;
    private final String b;
    private final geh c;
    private Map d;
    private Map e;
    private final List f = new CopyOnWriteArrayList();

    private geg(String s, geh geh1)
    {
        b = s;
        c = geh1;
    }

    private static String a(geh geh1, VehicleView vehicleview, Map map)
    {
        final class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[geh.values().length];
                try
                {
                    a[geh.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[geh.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[geh.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls4.a[geh1.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 60
    //                   2 69
    //                   3 122;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown strategy: ")).append(geh1).toString());
_L2:
        map = vehicleview.getId();
_L9:
        return map;
_L3:
        String s = vehicleview.getParentId();
        if (TextUtils.isEmpty(s)) goto _L6; else goto _L5
_L5:
        geh1 = s;
        if (map.containsKey(s)) goto _L7; else goto _L6
_L6:
        geh1 = vehicleview.getId();
_L7:
        map = geh1;
        if (!(vehicleview instanceof Shape_VehicleView)) goto _L9; else goto _L8
_L8:
        ((Shape_VehicleView)vehicleview).setGroupId(geh1);
        return geh1;
_L4:
        if (TextUtils.isEmpty(vehicleview.getGroupId()))
        {
            return vehicleview.getId();
        } else
        {
            return vehicleview.getGroupId();
        }
    }

    public static List a(City city, Map map, Map map1, String s)
    {
        Object obj = city.getVehicleViewsOrder();
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = new ArrayList();
        }
        Map map2 = city.getVehicleViews();
        obj = map2;
        if (map2 == null)
        {
            obj = new HashMap();
        }
        obj1 = a(((List) (obj1)), ((Map) (obj)).values());
        s = d(s);
        obj1 = a(((List) (obj1)), ((Map) (obj)));
        return a(a(city.getProductGroups(), ((List) (obj1))), ((Map) (obj)), map, map1, ((geh) (s)));
    }

    private static List a(List list, Collection collection)
    {
        list = new ArrayList(list);
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            VehicleView vehicleview = (VehicleView)collection.next();
            if (vehicleview.getLinkedVehicleViewId() != null)
            {
                list.remove(vehicleview.getLinkedVehicleViewId());
            }
        } while (true);
        return list;
    }

    private static List a(List list, List list1)
    {
        if (list == null || list.isEmpty())
        {
            return list1;
        }
        HashMap hashmap = new HashMap();
        ProductGroup productgroup;
        for (list = list.iterator(); list.hasNext(); hashmap.put(productgroup.getUuid(), productgroup))
        {
            productgroup = (ProductGroup)list.next();
        }

        list = new ArrayList();
        list1 = list1.iterator();
        do
        {
            if (!list1.hasNext())
            {
                break;
            }
            VehicleView vehicleview = (VehicleView)list1.next();
            if (!TextUtils.isEmpty(vehicleview.getProductGroupUuid()))
            {
                ProductGroup productgroup1 = (ProductGroup)hashmap.get(vehicleview.getProductGroupUuid());
                if (productgroup1 == null || fte.a(productgroup1.getGroupType()))
                {
                    list.add(vehicleview);
                }
            } else
            {
                list.add(vehicleview);
            }
        } while (true);
        return list;
    }

    private static List a(List list, Map map)
    {
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext(); arraylist.add(map.get((String)list.next()))) { }
        return arraylist;
    }

    private static List a(List list, Map map, Map map1, Map map2, geh geh1)
    {
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        Object obj;
        for (list = list.iterator(); list.hasNext(); ((geg) (obj)).a(map2))
        {
            VehicleView vehicleview = (VehicleView)list.next();
            obj = a(geh1, vehicleview, map);
            if (!linkedhashmap.containsKey(obj))
            {
                linkedhashmap.put(obj, new geg(((String) (obj)), geh1));
            }
            obj = (geg)linkedhashmap.get(obj);
            ((geg) (obj)).a(vehicleview);
            ((geg) (obj)).b(map1);
        }

        return new ArrayList(linkedhashmap.values());
    }

    static Map a(geg geg1)
    {
        return geg1.d;
    }

    private void a(VehicleView vehicleview)
    {
        if (!b(vehicleview))
        {
            throw new IllegalArgumentException(String.format("[%s / %s] does not belong in %s for %s", new Object[] {
                vehicleview.getId(), vehicleview.getGroupId(), b, c
            }));
        }
        if (geh.b == c && b.equals(vehicleview.getId()))
        {
            f.add(0, vehicleview);
            return;
        } else
        {
            f.add(vehicleview);
            return;
        }
    }

    private void a(Map map)
    {
        e = map;
    }

    private void b(Map map)
    {
        d = map;
    }

    private boolean b(VehicleView vehicleview)
    {
        _cls4.a[c.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 38
    //                   2 52
    //                   3 86;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L2:
        return b.equals(vehicleview.getId());
_L3:
        if (b.equals(vehicleview.getId()) || b.equals(vehicleview.getParentId()))
        {
            return true;
        }
          goto _L1
_L4:
        if (TextUtils.isEmpty(vehicleview.getGroupId()))
        {
            return b.equals(vehicleview.getId());
        } else
        {
            return b.equals(vehicleview.getGroupId());
        }
    }

    private static geh d(String s)
    {
        byte byte0;
        if (s == null)
        {
            return geh.c;
        }
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 3: default 48
    //                   -1897640665: 80
    //                   1442898095: 108
    //                   2022204538: 94;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_108;
_L5:
        switch (byte0)
        {
        default:
            return geh.c;

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return geh.b;

        case 2: // '\002'
            return geh.a;
        }
_L2:
        if (s.equals("stacked"))
        {
            byte0 = 0;
        }
          goto _L5
_L4:
        if (s.equals("stacked_use_parent"))
        {
            byte0 = 1;
        }
          goto _L5
        if (s.equals("stacked_use_group"))
        {
            byte0 = 2;
        }
          goto _L5
    }

    private VehicleView e(String s)
    {
        return (VehicleView)gki.d(f, f(s)).d();
    }

    private gka f(String s)
    {
        return new gka(s) {

            final String a;
            final geg b;

            private boolean a(VehicleView vehicleview)
            {
                return vehicleview.getId().equals(a);
            }

            public final boolean apply(Object obj)
            {
                return a((VehicleView)obj);
            }

            
            {
                b = geg.this;
                a = s;
                super();
            }
        };
    }

    public final String a()
    {
        return c().getId();
    }

    public final boolean a(String s)
    {
        return gki.b(f, f(s));
    }

    public final int b(String s)
    {
        return gki.e(f, f(s));
    }

    public final String b()
    {
        VehicleView vehicleview = c();
        if (f.isEmpty())
        {
            return null;
        }
        if (c != geh.a)
        {
            return vehicleview.getDescription();
        }
        if (!TextUtils.isEmpty(vehicleview.getGroupDisplayName()))
        {
            return vehicleview.getGroupDisplayName();
        } else
        {
            return vehicleview.getDescription();
        }
    }

    public final VehicleView c()
    {
        switch (_cls4.a[c.ordinal()])
        {
        default:
            return e(b);

        case 3: // '\003'
            break;
        }
        if (f.isEmpty())
        {
            return null;
        } else
        {
            return (VehicleView)f.get(0);
        }
    }

    public final boolean c(String s)
    {
        if (e != null)
        {
            s = (NearbyVehicle)e.get(s);
        } else
        {
            s = null;
        }
        return s != null && s.getVehiclePaths() != null && !s.getVehiclePaths().isEmpty();
    }

    public final boolean d()
    {
        return gki.c(f, new gka() {

            final geg a;

            private boolean a(VehicleView vehicleview)
            {
                DynamicFare dynamicfare;
                if (geg.a(a) != null)
                {
                    dynamicfare = (DynamicFare)geg.a(a).get(vehicleview.getId());
                } else
                {
                    dynamicfare = null;
                }
                return dynamicfare != null && dynamicfare.getMultiplier() > 1.0F && vehicleview.getAllowedToSurge();
            }

            public final boolean apply(Object obj)
            {
                return a((VehicleView)obj);
            }

            
            {
                a = geg.this;
                super();
            }
        });
    }

    public final boolean e()
    {
        return gki.b(f, new gka() {

            final geg a;

            private boolean a(VehicleView vehicleview)
            {
                return a.c(vehicleview.getId());
            }

            public final boolean apply(Object obj)
            {
                return a((VehicleView)obj);
            }

            
            {
                a = geg.this;
                super();
            }
        });
    }

    public final boolean f()
    {
        return f.size() > 1;
    }

    public final List g()
    {
        return f;
    }

    static 
    {
        a = geh.b;
    }
}
