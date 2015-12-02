// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.jx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bh

public class DataLayer
{

    public static final Object OBJECT_NOT_PRESENT = new Object();
    public static boolean a;
    static final String aqQ[] = "gtm.lifetime".toString().split("\\.");
    private static final Pattern aqR = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap aqS;
    private final Map aqT;
    private final ReentrantLock aqU;
    private final LinkedList aqV;
    private final c aqW;
    private final CountDownLatch aqX;

    DataLayer()
    {
        this(((c) (new _cls1())));
    }

    DataLayer(c c1)
    {
        boolean flag = true;
        boolean flag1 = a;
        super();
        aqW = c1;
        aqS = new ConcurrentHashMap();
        aqT = new HashMap();
        aqU = new ReentrantLock();
        aqV = new LinkedList();
        aqX = new CountDownLatch(1);
        pv();
        if (jx.a != 0)
        {
            if (flag1)
            {
                flag = false;
            }
            a = flag;
        }
    }

    private void E(Map map)
    {
        aqU.lock();
        aqV.offer(map);
        if (aqU.getHoldCount() == 1)
        {
            pw();
        }
        F(map);
        aqU.unlock();
        return;
        map;
        aqU.unlock();
        throw map;
    }

    private void F(Map map)
    {
        Long long1 = G(map);
        if (long1 == null)
        {
            return;
        } else
        {
            map = I(map);
            map.remove("gtm.lifetime");
            aqW.a(map, long1.longValue());
            return;
        }
    }

    private Long G(Map map)
    {
        map = ((Map) (H(map)));
        if (map == null)
        {
            return null;
        } else
        {
            return cy(map.toString());
        }
    }

    private Object H(Map map)
    {
        boolean flag = a;
        String as[] = aqQ;
        int j = as.length;
        int i = 0;
        do
        {
            Object obj;
label0:
            {
                obj = map;
                if (i < j)
                {
                    obj = as[i];
                    boolean flag1;
                    try
                    {
                        flag1 = map instanceof Map;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Map map)
                    {
                        throw map;
                    }
                    if (flag1)
                    {
                        break label0;
                    }
                    obj = null;
                }
                return obj;
            }
            obj = ((Map)map).get(obj);
            i++;
            map = ((Map) (obj));
            if (flag)
            {
                return obj;
            }
        } while (true);
    }

    private List I(Map map)
    {
        ArrayList arraylist = new ArrayList();
        a(map, "", arraylist);
        return arraylist;
    }

    private void J(Map map)
    {
        boolean flag = a;
        Map map1 = aqT;
        map1;
        JVM INSTR monitorenter ;
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            a(c(s, map.get(s)), aqT);
        } while (!flag);
        map1;
        JVM INSTR monitorexit ;
        K(map);
        return;
        map;
        map1;
        JVM INSTR monitorexit ;
        throw map;
    }

    private void K(Map map)
    {
        boolean flag = a;
        Iterator iterator = aqS.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ((b)iterator.next()).C(map);
        } while (!flag);
    }

    static CountDownLatch a(DataLayer datalayer)
    {
        return datalayer.aqX;
    }

    static void a(DataLayer datalayer, Map map)
    {
        datalayer.E(map);
    }

    private void a(Map map, String s, Collection collection)
    {
        Iterator iterator;
        boolean flag;
        flag = a;
        iterator = map.entrySet().iterator();
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        Object obj = (new StringBuilder()).append(s);
        if (s.length() == 0)
        {
            map = "";
        } else
        {
            map = ".";
        }
        map = ((StringBuilder) (obj)).append(map).append((String)entry.getKey()).toString();
        if (!(entry.getValue() instanceof Map))
        {
            break MISSING_BLOCK_LABEL_124;
        }
        obj = (Map)entry.getValue();
        a(((Map) (obj)), ((String) (map)), collection);
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            if (!map.equals("gtm.lifetime"))
            {
                collection.add(new a(map, entry.getValue()));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw map;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        return;
        map;
        throw map;
    }

    static Long cy(String s)
    {
        Object obj;
        long l;
label0:
        {
            obj = aqR.matcher(s);
            try
            {
                if (((Matcher) (obj)).matches())
                {
                    break label0;
                }
                bh.U((new StringBuilder()).append("unknown _lifetime: ").append(s).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return null;
        }
        try
        {
            l = Long.parseLong(((Matcher) (obj)).group(1));
        }
        catch (NumberFormatException numberformatexception)
        {
            bh.W((new StringBuilder()).append("illegal number in _lifetime value: ").append(s).toString());
            l = 0L;
        }
        if (l <= 0L)
        {
            try
            {
                bh.U((new StringBuilder()).append("non-positive _lifetime: ").append(s).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return null;
        }
        obj = ((Matcher) (obj)).group(2);
        if (((String) (obj)).length() == 0)
        {
            return Long.valueOf(l);
        }
        break MISSING_BLOCK_LABEL_140;
        s;
        throw s;
        char c1;
        try
        {
            c1 = ((String) (obj)).charAt(0);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        switch (c1)
        {
        default:
            bh.W((new StringBuilder()).append("unknown units in _lifetime: ").append(s).toString());
            return null;

        case 115: // 's'
            return Long.valueOf(l * 1000L);

        case 109: // 'm'
            return Long.valueOf(l * 1000L * 60L);

        case 104: // 'h'
            return Long.valueOf(l * 1000L * 60L * 60L);

        case 100: // 'd'
            return Long.valueOf(l * 1000L * 60L * 60L * 24L);
        }
    }

    private void pv()
    {
        aqW.a(new _cls2());
    }

    private void pw()
    {
        int i = 0;
        do
        {
            Map map = (Map)aqV.poll();
            if (map != null)
            {
                J(map);
                i++;
                if (i > 500)
                {
                    aqV.clear();
                    throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                }
            } else
            {
                return;
            }
        } while (true);
    }

    void a(b b1)
    {
        aqS.put(b1, Integer.valueOf(0));
    }

    void a(Map map, Map map1)
    {
        Iterator iterator;
        boolean flag;
        flag = a;
        iterator = map.keySet().iterator();
_L2:
        String s;
        Object obj;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        obj = map.get(s);
        boolean flag1 = obj instanceof List;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        Object obj1;
        Object obj2;
        try
        {
            if (!(map1.get(s) instanceof List))
            {
                map1.put(s, new ArrayList());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            throw map;
        }
        obj1 = (List)obj;
        obj2 = (List)map1.get(s);
        b(((List) (obj1)), ((List) (obj2)));
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = obj instanceof Map;
        if (flag1)
        {
            try
            {
                if (!(map1.get(s) instanceof Map))
                {
                    map1.put(s, new HashMap());
                }
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                throw map;
            }
            obj1 = (Map)obj;
            obj2 = (Map)map1.get(s);
            try
            {
                a(((Map) (obj1)), ((Map) (obj2)));
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                throw map;
            }
            if (!flag)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        map1.put(s, obj);
        if (!flag) goto _L2; else goto _L1
_L1:
        return;
        map;
        throw map;
        map;
        try
        {
            throw map;
        }
        // Misplaced declaration of an exception variable
        catch (Map map) { }
        throw map;
    }

    void b(List list, List list1)
    {
        int i;
        boolean flag;
        flag = a;
        do
        {
            if (list1.size() >= list.size())
            {
                break;
            }
            list1.add(null);
        } while (!flag);
        i = 0;
_L2:
        Object obj;
        if (i >= list.size())
        {
            break MISSING_BLOCK_LABEL_224;
        }
        obj = list.get(i);
        boolean flag1 = obj instanceof List;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        Object obj1;
        Object obj2;
        try
        {
            if (!(list1.get(i) instanceof List))
            {
                list1.set(i, new ArrayList());
            }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list;
        }
        obj1 = (List)obj;
        obj2 = (List)list1.get(i);
        b(((List) (obj1)), ((List) (obj2)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        flag1 = obj instanceof Map;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        try
        {
            if (!(list1.get(i) instanceof Map))
            {
                list1.set(i, new HashMap());
            }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list;
        }
        obj1 = (Map)obj;
        obj2 = (Map)list1.get(i);
        a(((Map) (obj1)), ((Map) (obj2)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        try
        {
            if (obj != OBJECT_NOT_PRESENT)
            {
                list1.set(i, obj);
            }
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            throw list;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        return;
        list;
        throw list;
        list;
        try
        {
            throw list;
        }
        // Misplaced declaration of an exception variable
        catch (List list) { }
        throw list;
        list;
        throw list;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    Map c(String s, Object obj)
    {
        HashMap hashmap;
        String as[];
        int i;
        boolean flag;
        flag = a;
        hashmap = new HashMap();
        as = s.toString().split("\\.");
        i = 0;
        s = hashmap;
_L3:
        Object obj1;
        if (i >= as.length - 1)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        obj1 = new HashMap();
        s.put(as[i], obj1);
        i++;
        if (!flag) goto _L2; else goto _L1
_L1:
        ((Map) (obj1)).put(as[as.length - 1], obj);
        return hashmap;
_L2:
        s = ((String) (obj1));
          goto _L3
        obj1 = s;
          goto _L1
    }

    public void push(Map map)
    {
        try
        {
            aqX.await();
        }
        catch (InterruptedException interruptedexception)
        {
            bh.W("DataLayer.push: unexpected InterruptedException");
        }
        E(map);
    }

    public String toString()
    {
        boolean flag = a;
        Map map = aqT;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        Iterator iterator;
        obj = new StringBuilder();
        iterator = aqT.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            ((StringBuilder) (obj)).append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[] {
                entry.getKey(), entry.getValue()
            }));
        } while (!flag);
        obj = ((StringBuilder) (obj)).toString();
        map;
        JVM INSTR monitorexit ;
        return ((String) (obj));
        Exception exception;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }


    private class _cls1
        implements c
    {

        public void a(c.a a1)
        {
            class c.a
            {

                public abstract void h(List list);
            }

            a1.h(new ArrayList());
        }

        public void a(List list, long l)
        {
        }

        _cls1()
        {
        }
    }


    private class c
    {

        public abstract void a(a a1);

        public abstract void a(List list, long l);
    }


    private class b
    {

        public abstract void C(Map map);
    }


    private class a
    {

        public final String KP;
        public final Object wF;

        public boolean equals(Object obj)
        {
            if (obj instanceof a)
            {
                if (KP.equals(((a) (obj = (a)obj)).KP) && wF.equals(((a) (obj)).wF))
                {
                    return true;
                }
            }
            return false;
        }

        public int hashCode()
        {
            return Arrays.hashCode(new Integer[] {
                Integer.valueOf(KP.hashCode()), Integer.valueOf(wF.hashCode())
            });
        }

        public String toString()
        {
            return (new StringBuilder()).append("Key: ").append(KP).append(" value: ").append(wF.toString()).toString();
        }

        a(String s, Object obj)
        {
            KP = s;
            wF = obj;
        }
    }


    private class _cls2
        implements c.a
    {

        final DataLayer aqY;

        public void h(List list)
        {
            boolean flag = DataLayer.a;
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                a a1 = (a)list.next();
                DataLayer.a(aqY, aqY.c(a1.KP, a1.wF));
            } while (!flag);
            DataLayer.a(aqY).countDown();
        }

        _cls2()
        {
            aqY = DataLayer.this;
            super();
        }
    }

}
