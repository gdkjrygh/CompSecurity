// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a.a;

import a.a.a.a.a;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package a.a.a.a.a:
//            d

public class c
{

    private static final ThreadLocal a = new ThreadLocal();
    private final int b;
    private int c;

    public c()
    {
        c = 0;
        b = 37;
        c = 17;
    }

    public c(int i, int j)
    {
        c = 0;
        if (i % 2 == 0)
        {
            throw new IllegalArgumentException("HashCodeBuilder requires an odd initial value");
        }
        if (j % 2 == 0)
        {
            throw new IllegalArgumentException("HashCodeBuilder requires an odd multiplier");
        } else
        {
            b = j;
            c = i;
            return;
        }
    }

    public static transient int a(int i, int j, Object obj, boolean flag, Class class1, String as[])
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("The object to build a hash code for must not be null");
        }
        c c1 = new c(i, j);
        Class class2 = obj.getClass();
        a(obj, class2, c1, flag, as);
        for (; class2.getSuperclass() != null && class2 != class1; a(obj, class2, c1, flag, as))
        {
            class2 = class2.getSuperclass();
        }

        return c1.b();
    }

    public static transient int a(Object obj, String as[])
    {
        return a(17, 37, obj, false, null, as);
    }

    static Set a()
    {
        return (Set)a.get();
    }

    private static void a(Object obj, Class class1, c c1, boolean flag, String as[])
    {
        if (a(obj))
        {
            return;
        }
        int j;
        b(obj);
        class1 = class1.getDeclaredFields();
        AccessibleObject.setAccessible(class1, true);
        j = class1.length;
        int i = 0;
_L2:
        Field field;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        field = class1[i];
        if (a.a.a.a.a.b(as, field.getName()) || field.getName().indexOf('$') != -1)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        if (Modifier.isTransient(field.getModifiers()))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        boolean flag1 = Modifier.isStatic(field.getModifiers());
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        c1.d(field.get(obj));
        i++;
        if (true) goto _L2; else goto _L1
        class1;
        throw new InternalError("Unexpected IllegalAccessException");
        class1;
        c(obj);
        throw class1;
_L1:
        c(obj);
        return;
    }

    static boolean a(Object obj)
    {
        Set set = a();
        return set != null && set.contains(new d(obj));
    }

    static void b(Object obj)
    {
        a/a/a/a/a/c;
        JVM INSTR monitorenter ;
        if (a() == null)
        {
            a.set(new HashSet());
        }
        a/a/a/a/a/c;
        JVM INSTR monitorexit ;
        a().add(new d(obj));
        return;
        obj;
        a/a/a/a/a/c;
        JVM INSTR monitorexit ;
        throw obj;
    }

    static void c(Object obj)
    {
        Set set = a();
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        set.remove(new d(obj));
        a/a/a/a/a/c;
        JVM INSTR monitorenter ;
        obj = a();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        if (((Set) (obj)).isEmpty())
        {
            a.remove();
        }
        a/a/a/a/a/c;
        JVM INSTR monitorexit ;
        return;
        obj;
        a/a/a/a/a/c;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public c a(byte byte0)
    {
        c = c * b + byte0;
        return this;
    }

    public c a(char c1)
    {
        c = c * b + c1;
        return this;
    }

    public c a(double d1)
    {
        return a(Double.doubleToLongBits(d1));
    }

    public c a(float f)
    {
        c = c * b + Float.floatToIntBits(f);
        return this;
    }

    public c a(int i)
    {
        c = c * b + i;
        return this;
    }

    public c a(long l)
    {
        c = c * b + (int)(l >> 32 ^ l);
        return this;
    }

    public c a(short word0)
    {
        c = c * b + word0;
        return this;
    }

    public c a(boolean flag)
    {
        int j = c;
        int k = b;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        c = i + k * j;
        return this;
    }

    public c a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            c = c * b;
        } else
        {
            int j = abyte0.length;
            int i = 0;
            while (i < j) 
            {
                a(abyte0[i]);
                i++;
            }
        }
        return this;
    }

    public c a(char ac[])
    {
        if (ac == null)
        {
            c = c * b;
        } else
        {
            int j = ac.length;
            int i = 0;
            while (i < j) 
            {
                a(ac[i]);
                i++;
            }
        }
        return this;
    }

    public c a(double ad[])
    {
        if (ad == null)
        {
            c = c * b;
        } else
        {
            int j = ad.length;
            int i = 0;
            while (i < j) 
            {
                a(ad[i]);
                i++;
            }
        }
        return this;
    }

    public c a(float af[])
    {
        if (af == null)
        {
            c = c * b;
        } else
        {
            int j = af.length;
            int i = 0;
            while (i < j) 
            {
                a(af[i]);
                i++;
            }
        }
        return this;
    }

    public c a(int ai[])
    {
        if (ai == null)
        {
            c = c * b;
        } else
        {
            int j = ai.length;
            int i = 0;
            while (i < j) 
            {
                a(ai[i]);
                i++;
            }
        }
        return this;
    }

    public c a(long al[])
    {
        if (al == null)
        {
            c = c * b;
        } else
        {
            int j = al.length;
            int i = 0;
            while (i < j) 
            {
                a(al[i]);
                i++;
            }
        }
        return this;
    }

    public c a(Object aobj[])
    {
        if (aobj == null)
        {
            c = c * b;
        } else
        {
            int j = aobj.length;
            int i = 0;
            while (i < j) 
            {
                d(aobj[i]);
                i++;
            }
        }
        return this;
    }

    public c a(short aword0[])
    {
        if (aword0 == null)
        {
            c = c * b;
        } else
        {
            int j = aword0.length;
            int i = 0;
            while (i < j) 
            {
                a(aword0[i]);
                i++;
            }
        }
        return this;
    }

    public c a(boolean aflag[])
    {
        if (aflag == null)
        {
            c = c * b;
        } else
        {
            int j = aflag.length;
            int i = 0;
            while (i < j) 
            {
                a(aflag[i]);
                i++;
            }
        }
        return this;
    }

    public int b()
    {
        return c;
    }

    public c d(Object obj)
    {
        if (obj == null)
        {
            c = c * b;
            return this;
        }
        if (obj.getClass().isArray())
        {
            if (obj instanceof long[])
            {
                a((long[])(long[])obj);
                return this;
            }
            if (obj instanceof int[])
            {
                a((int[])(int[])obj);
                return this;
            }
            if (obj instanceof short[])
            {
                a((short[])(short[])obj);
                return this;
            }
            if (obj instanceof char[])
            {
                a((char[])(char[])obj);
                return this;
            }
            if (obj instanceof byte[])
            {
                a((byte[])(byte[])obj);
                return this;
            }
            if (obj instanceof double[])
            {
                a((double[])(double[])obj);
                return this;
            }
            if (obj instanceof float[])
            {
                a((float[])(float[])obj);
                return this;
            }
            if (obj instanceof boolean[])
            {
                a((boolean[])(boolean[])obj);
                return this;
            } else
            {
                a((Object[])(Object[])obj);
                return this;
            }
        } else
        {
            c = c * b + obj.hashCode();
            return this;
        }
    }

    public int hashCode()
    {
        return b();
    }

}
