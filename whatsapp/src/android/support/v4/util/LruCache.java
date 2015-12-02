// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.util;

import android.support.v4.app.Fragment;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LruCache
{

    public static boolean a;
    private static final String z[];
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final LinkedHashMap map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException(z[3]);
        } else
        {
            maxSize = i;
            map = new LinkedHashMap(0, 0.75F, true);
            return;
        }
    }

    private int safeSizeOf(Object obj, Object obj1)
    {
        int i = sizeOf(obj, obj1);
        if (i < 0)
        {
            try
            {
                throw new IllegalStateException((new StringBuilder()).append(z[5]).append(obj).append("=").append(obj1).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            return i;
        }
    }

    protected Object create(Object obj)
    {
        return null;
    }

    protected void entryRemoved(boolean flag, Object obj, Object obj1, Object obj2)
    {
    }

    public final void evictAll()
    {
        trimToSize(-1);
    }

    public final Object get(Object obj)
    {
        if (obj == null)
        {
            try
            {
                throw new NullPointerException(z[4]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        this;
        JVM INSTR monitorenter ;
        Object obj1 = map.get(obj);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        hitCount = hitCount + 1;
        this;
        JVM INSTR monitorexit ;
        return obj1;
        missCount = missCount + 1;
        this;
        JVM INSTR monitorexit ;
        obj1 = create(obj);
        if (obj1 == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_78;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        this;
        JVM INSTR monitorenter ;
        Object obj2;
        createCount = createCount + 1;
        obj2 = map.put(obj, obj1);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_124;
        }
        boolean flag;
        map.put(obj, obj2);
        flag = a;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        size = size + safeSizeOf(obj, obj1);
        this;
        JVM INSTR monitorexit ;
        if (obj2 != null)
        {
            try
            {
                entryRemoved(false, obj, obj1, obj2);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return obj2;
        } else
        {
            trimToSize(maxSize);
            return obj1;
        }
        obj;
        try
        {
            throw obj;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally { }
        throw obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final int maxSize()
    {
        this;
        JVM INSTR monitorenter ;
        int i = maxSize;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public final Object put(Object obj, Object obj1)
    {
        boolean flag;
        flag = a;
        if (obj == null || obj1 == null)
        {
            try
            {
                throw new NullPointerException(z[2]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        this;
        JVM INSTR monitorenter ;
        Object obj2;
        putCount = putCount + 1;
        size = size + safeSizeOf(obj, obj1);
        obj2 = map.put(obj, obj1);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        size = size - safeSizeOf(obj, obj2);
        this;
        JVM INSTR monitorexit ;
        if (obj2 != null)
        {
            try
            {
                entryRemoved(false, obj, obj2, obj1);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        trimToSize(maxSize);
        if (flag)
        {
            Fragment.a++;
        }
        return obj2;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final Object remove(Object obj)
    {
        if (obj == null)
        {
            try
            {
                throw new NullPointerException(z[1]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        this;
        JVM INSTR monitorenter ;
        Object obj1 = map.remove(obj);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        size = size - safeSizeOf(obj, obj1);
        this;
        JVM INSTR monitorexit ;
        if (obj1 != null)
        {
            try
            {
                entryRemoved(false, obj, obj1, null);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        return obj1;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public final int size()
    {
        this;
        JVM INSTR monitorenter ;
        int i = size;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    protected int sizeOf(Object obj, Object obj1)
    {
        return 1;
    }

    public final Map snapshot()
    {
        this;
        JVM INSTR monitorenter ;
        LinkedHashMap linkedhashmap = new LinkedHashMap(map);
        this;
        JVM INSTR monitorexit ;
        return linkedhashmap;
        Exception exception;
        exception;
        throw exception;
    }

    public final String toString()
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        boolean flag1;
        flag1 = a;
        i = hitCount;
        j = missCount;
        i += j;
        if (i == 0) goto _L2; else goto _L1
_L1:
        i = (hitCount * 100) / i;
_L4:
        String s;
        s = String.format(z[6], new Object[] {
            Integer.valueOf(maxSize), Integer.valueOf(hitCount), Integer.valueOf(missCount), Integer.valueOf(i)
        });
        i = Fragment.a;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        Object obj;
        if (!flag1)
        {
            flag = true;
        }
        a = flag;
        this;
        JVM INSTR monitorexit ;
        return s;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        i = 0;
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        throw obj;
        obj;
        throw obj;
    }

    public void trimToSize(int i)
    {
        boolean flag = a;
_L2:
        this;
        JVM INSTR monitorenter ;
        int j = size;
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (!map.isEmpty())
        {
            break MISSING_BLOCK_LABEL_86;
        }
        j = size;
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        throw new IllegalStateException((new StringBuilder()).append(getClass().getName()).append(z[0]).toString());
        Object obj;
        obj;
        throw obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        throw obj;
        boolean flag1;
        if (size <= i)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        flag1 = map.isEmpty();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        this;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1;
        Object obj2;
        obj2 = (java.util.Map.Entry)map.entrySet().iterator().next();
        obj1 = ((java.util.Map.Entry) (obj2)).getKey();
        obj2 = ((java.util.Map.Entry) (obj2)).getValue();
        map.remove(obj1);
        size = size - safeSizeOf(obj1, obj2);
        evictionCount = evictionCount + 1;
        this;
        JVM INSTR monitorexit ;
        entryRemoved(true, obj1, obj2, null);
        if (!flag) goto _L2; else goto _L1
_L1:
        return;
        obj1;
        throw obj1;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "!#n/_@6/|\032f#''_\177?u!Sa7'<Tl?i&S|$b;N/\"b&Oc$tt";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "d5~u\0072pi Vc";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "d5~u\0072pi Vcp{)\032y1k _/m:uTz<k";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "b1\177\006Su5'i\007/`";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "d5~u\0072pi Vc";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "A5`4Nf&buIf*bo\032";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "C\"r\026[l8b\016Wn(T<@jm\"1\026g9s&\007*4+8S|#b&\007*4+=S{\002f!_2ucp\037R";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 236
    //                   0 259
    //                   1 266
    //                   2 273
    //                   3 280;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_280;
_L3:
        byte byte1 = 58;
_L9:
        obj[j] = (char)(byte1 ^ c);
        j++;
          goto _L8
_L4:
        byte1 = 15;
          goto _L9
_L5:
        byte1 = 80;
          goto _L9
_L6:
        byte1 = 7;
          goto _L9
        byte1 = 85;
          goto _L9
    }
}
