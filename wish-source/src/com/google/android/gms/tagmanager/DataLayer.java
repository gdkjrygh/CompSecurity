// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Arrays;
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
//            zzbg

public class DataLayer
{
    static final class zza
    {

        public final Object zzCM;
        public final String zzra;

        public boolean equals(Object obj)
        {
            if (obj instanceof zza)
            {
                if (zzra.equals(((zza) (obj = (zza)obj)).zzra) && zzCM.equals(((zza) (obj)).zzCM))
                {
                    return true;
                }
            }
            return false;
        }

        public int hashCode()
        {
            return Arrays.hashCode(new Integer[] {
                Integer.valueOf(zzra.hashCode()), Integer.valueOf(zzCM.hashCode())
            });
        }

        public String toString()
        {
            return (new StringBuilder()).append("Key: ").append(zzra).append(" value: ").append(zzCM.toString()).toString();
        }

        zza(String s, Object obj)
        {
            zzra = s;
            zzCM = obj;
        }
    }

    static interface zzb
    {

        public abstract void zzE(Map map);
    }

    static interface zzc
    {

        public abstract void zza(zza zza1);

        public abstract void zza(List list, long l);

        public abstract void zzdH(String s);
    }

    public static interface zzc.zza
    {

        public abstract void zzp(List list);
    }


    public static final Object OBJECT_NOT_PRESENT = new Object();
    static final String zzaCR[] = "gtm.lifetime".toString().split("\\.");
    private static final Pattern zzaCS = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap zzaCT;
    private final Map zzaCU;
    private final ReentrantLock zzaCV;
    private final LinkedList zzaCW;
    private final zzc zzaCX;
    private final CountDownLatch zzaCY;

    DataLayer()
    {
        this(new zzc() {

            public void zza(zzc.zza zza1)
            {
                zza1.zzp(new ArrayList());
            }

            public void zza(List list, long l)
            {
            }

            public void zzdH(String s)
            {
            }

        });
    }

    DataLayer(zzc zzc1)
    {
        zzaCX = zzc1;
        zzaCT = new ConcurrentHashMap();
        zzaCU = new HashMap();
        zzaCV = new ReentrantLock();
        zzaCW = new LinkedList();
        zzaCY = new CountDownLatch(1);
        zzwC();
    }

    public static transient Map mapOf(Object aobj[])
    {
        if (aobj.length % 2 != 0)
        {
            throw new IllegalArgumentException("expected even number of key-value pairs");
        }
        HashMap hashmap = new HashMap();
        for (int i = 0; i < aobj.length; i += 2)
        {
            if (!(aobj[i] instanceof String))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("key is not a string: ").append(aobj[i]).toString());
            }
            hashmap.put((String)aobj[i], aobj[i + 1]);
        }

        return hashmap;
    }

    private void zzG(Map map)
    {
        zzaCV.lock();
        zzaCW.offer(map);
        if (zzaCV.getHoldCount() == 1)
        {
            zzwD();
        }
        zzH(map);
        zzaCV.unlock();
        return;
        map;
        zzaCV.unlock();
        throw map;
    }

    private void zzH(Map map)
    {
        Long long1 = zzI(map);
        if (long1 == null)
        {
            return;
        } else
        {
            map = zzK(map);
            map.remove("gtm.lifetime");
            zzaCX.zza(map, long1.longValue());
            return;
        }
    }

    private Long zzI(Map map)
    {
        map = ((Map) (zzJ(map)));
        if (map == null)
        {
            return null;
        } else
        {
            return zzdG(map.toString());
        }
    }

    private Object zzJ(Map map)
    {
        String as[] = zzaCR;
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
                    if (map instanceof Map)
                    {
                        break label0;
                    }
                    obj = null;
                }
                return obj;
            }
            map = ((Map) (((Map)map).get(obj)));
            i++;
        } while (true);
    }

    private List zzK(Map map)
    {
        ArrayList arraylist = new ArrayList();
        zza(map, "", arraylist);
        return arraylist;
    }

    private void zzL(Map map)
    {
        Map map1 = zzaCU;
        map1;
        JVM INSTR monitorenter ;
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); zzc(zzi(s, map.get(s)), zzaCU))
        {
            s = (String)iterator.next();
        }

        break MISSING_BLOCK_LABEL_69;
        map;
        map1;
        JVM INSTR monitorexit ;
        throw map;
        map1;
        JVM INSTR monitorexit ;
        zzM(map);
        return;
    }

    private void zzM(Map map)
    {
        for (Iterator iterator = zzaCT.keySet().iterator(); iterator.hasNext(); ((zzb)iterator.next()).zzE(map)) { }
    }

    static CountDownLatch zza(DataLayer datalayer)
    {
        return datalayer.zzaCY;
    }

    static void zza(DataLayer datalayer, Map map)
    {
        datalayer.zzG(map);
    }

    private void zza(Map map, String s, Collection collection)
    {
        Iterator iterator = map.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            StringBuilder stringbuilder = (new StringBuilder()).append(s);
            if (s.length() == 0)
            {
                map = "";
            } else
            {
                map = ".";
            }
            map = stringbuilder.append(map).append((String)entry.getKey()).toString();
            if (entry.getValue() instanceof Map)
            {
                zza((Map)entry.getValue(), ((String) (map)), collection);
            } else
            if (!map.equals("gtm.lifetime"))
            {
                collection.add(new zza(map, entry.getValue()));
            }
        } while (true);
    }

    static Long zzdG(String s)
    {
        Object obj = zzaCS.matcher(s);
        if (!((Matcher) (obj)).matches())
        {
            zzbg.zzal((new StringBuilder()).append("unknown _lifetime: ").append(s).toString());
            return null;
        }
        long l;
        try
        {
            l = Long.parseLong(((Matcher) (obj)).group(1));
        }
        catch (NumberFormatException numberformatexception)
        {
            zzbg.zzan((new StringBuilder()).append("illegal number in _lifetime value: ").append(s).toString());
            l = 0L;
        }
        if (l <= 0L)
        {
            zzbg.zzal((new StringBuilder()).append("non-positive _lifetime: ").append(s).toString());
            return null;
        }
        obj = ((Matcher) (obj)).group(2);
        if (((String) (obj)).length() == 0)
        {
            return Long.valueOf(l);
        }
        switch (((String) (obj)).charAt(0))
        {
        default:
            zzbg.zzan((new StringBuilder()).append("unknown units in _lifetime: ").append(s).toString());
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

    private void zzwC()
    {
        zzaCX.zza(new zzc.zza() {

            final DataLayer zzaCZ;

            public void zzp(List list)
            {
                zza zza1;
                for (list = list.iterator(); list.hasNext(); DataLayer.zza(zzaCZ, zzaCZ.zzi(zza1.zzra, zza1.zzCM)))
                {
                    zza1 = (zza)list.next();
                }

                DataLayer.zza(zzaCZ).countDown();
            }

            
            {
                zzaCZ = DataLayer.this;
                super();
            }
        });
    }

    private void zzwD()
    {
        int i = 0;
        do
        {
            Map map = (Map)zzaCW.poll();
            if (map != null)
            {
                zzL(map);
                i++;
                if (i > 500)
                {
                    zzaCW.clear();
                    throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                }
            } else
            {
                return;
            }
        } while (true);
    }

    public Object get(String s)
    {
        Map map = zzaCU;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        String as[];
        int j;
        obj = zzaCU;
        as = s.split("\\.");
        j = as.length;
        int i;
        s = ((String) (obj));
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = as[i];
        if (s instanceof Map)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        map;
        JVM INSTR monitorexit ;
        return null;
        s = ((String) (((Map)s).get(obj)));
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        map;
        JVM INSTR monitorexit ;
        return null;
        map;
        JVM INSTR monitorexit ;
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void push(String s, Object obj)
    {
        push(zzi(s, obj));
    }

    public void push(Map map)
    {
        try
        {
            zzaCY.await();
        }
        catch (InterruptedException interruptedexception)
        {
            zzbg.zzan("DataLayer.push: unexpected InterruptedException");
        }
        zzG(map);
    }

    public void pushEvent(String s, Map map)
    {
        map = new HashMap(map);
        map.put("event", s);
        push(map);
    }

    public String toString()
    {
        Map map = zzaCU;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new StringBuilder();
        java.util.Map.Entry entry;
        for (Iterator iterator = zzaCU.entrySet().iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[] {
    entry.getKey(), entry.getValue()
})))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_93;
        obj;
        map;
        JVM INSTR monitorexit ;
        throw obj;
        obj = ((StringBuilder) (obj)).toString();
        map;
        JVM INSTR monitorexit ;
        return ((String) (obj));
    }

    void zza(zzb zzb1)
    {
        zzaCT.put(zzb1, Integer.valueOf(0));
    }

    void zzb(List list, List list1)
    {
        for (; list1.size() < list.size(); list1.add(null)) { }
        int i = 0;
        while (i < list.size()) 
        {
            Object obj = list.get(i);
            if (obj instanceof List)
            {
                if (!(list1.get(i) instanceof List))
                {
                    list1.set(i, new ArrayList());
                }
                zzb((List)obj, (List)list1.get(i));
            } else
            if (obj instanceof Map)
            {
                if (!(list1.get(i) instanceof Map))
                {
                    list1.set(i, new HashMap());
                }
                zzc((Map)obj, (Map)list1.get(i));
            } else
            if (obj != OBJECT_NOT_PRESENT)
            {
                list1.set(i, obj);
            }
            i++;
        }
    }

    void zzc(Map map, Map map1)
    {
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Object obj = map.get(s);
            if (obj instanceof List)
            {
                if (!(map1.get(s) instanceof List))
                {
                    map1.put(s, new ArrayList());
                }
                zzb((List)obj, (List)map1.get(s));
            } else
            if (obj instanceof Map)
            {
                if (!(map1.get(s) instanceof Map))
                {
                    map1.put(s, new HashMap());
                }
                zzc((Map)obj, (Map)map1.get(s));
            } else
            {
                map1.put(s, obj);
            }
        }

    }

    void zzdF(String s)
    {
        push(s, null);
        zzaCX.zzdH(s);
    }

    Map zzi(String s, Object obj)
    {
        HashMap hashmap = new HashMap();
        String as[] = s.toString().split("\\.");
        int i = 0;
        HashMap hashmap1;
        for (s = hashmap; i < as.length - 1; s = hashmap1)
        {
            hashmap1 = new HashMap();
            s.put(as[i], hashmap1);
            i++;
        }

        s.put(as[as.length - 1], obj);
        return hashmap;
    }

}
