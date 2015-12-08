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

public class b
{

    private static final ThreadLocal a = new ThreadLocal();
    private boolean b;

    public b()
    {
        b = true;
    }

    static a.a.a.a.b.b a(Object obj, Object obj1)
    {
        return a.a.a.a.b.b.a(new d(obj), new d(obj1));
    }

    static Set a()
    {
        return (Set)a.get();
    }

    private static void a(Object obj, Object obj1, Class class1, b b1, boolean flag, String as[])
    {
        if (b(obj, obj1))
        {
            return;
        }
        c(obj, obj1);
        class1 = class1.getDeclaredFields();
        AccessibleObject.setAccessible(class1, true);
        int i = 0;
_L1:
        if (i >= class1.length || !b1.b)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        Field field = class1[i];
        if (a.a.a.a.a.b(as, field.getName()) || field.getName().indexOf('$') != -1)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (Modifier.isTransient(field.getModifiers()))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        boolean flag1 = Modifier.isStatic(field.getModifiers());
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        b1.e(field.get(obj), field.get(obj1));
        i++;
          goto _L1
        class1;
        throw new InternalError("Unexpected IllegalAccessException");
        class1;
        d(obj, obj1);
        throw class1;
        d(obj, obj1);
        return;
    }

    public static transient boolean a(Object obj, Object obj1, boolean flag, Class class1, String as[])
    {
        Object obj2;
        Object obj3;
        if (obj == obj1)
        {
            return true;
        }
        if (obj == null || obj1 == null)
        {
            return false;
        }
        obj3 = obj.getClass();
        obj2 = obj1.getClass();
        if (!((Class) (obj3)).isInstance(obj1)) goto _L2; else goto _L1
_L1:
        if (((Class) (obj2)).isInstance(obj))
        {
            obj2 = obj3;
        }
        obj3 = new b();
        if (!((Class) (obj2)).isArray()) goto _L4; else goto _L3
_L3:
        ((b) (obj3)).e(obj, obj1);
_L8:
        return ((b) (obj3)).b();
_L2:
        if (((Class) (obj2)).isInstance(obj))
        {
            if (!((Class) (obj3)).isInstance(obj1))
            {
                obj2 = obj3;
            }
        } else
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        a(obj, obj1, ((Class) (obj2)), ((b) (obj3)), flag, as);
_L6:
        if (((Class) (obj2)).getSuperclass() == null || obj2 == class1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = ((Class) (obj2)).getSuperclass();
        a(obj, obj1, ((Class) (obj2)), ((b) (obj3)), flag, as);
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
        obj;
        return false;
        if (true) goto _L10; else goto _L9
_L10:
        break MISSING_BLOCK_LABEL_47;
_L9:
    }

    public static transient boolean a(Object obj, Object obj1, String as[])
    {
        return a(obj, obj1, false, null, as);
    }

    static boolean b(Object obj, Object obj1)
    {
        Set set = a();
        obj = a(obj, obj1);
        obj1 = a.a.a.a.b.b.a(((a.a.a.a.b.b) (obj)).a(), ((a.a.a.a.b.b) (obj)).b());
        return set != null && (set.contains(obj) || set.contains(obj1));
    }

    static void c(Object obj, Object obj1)
    {
        a/a/a/a/a/b;
        JVM INSTR monitorenter ;
        if (a() == null)
        {
            a.set(new HashSet());
        }
        a/a/a/a/a/b;
        JVM INSTR monitorexit ;
        a().add(a(obj, obj1));
        return;
        obj;
        a/a/a/a/a/b;
        JVM INSTR monitorexit ;
        throw obj;
    }

    static void d(Object obj, Object obj1)
    {
        Set set = a();
        if (set == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        set.remove(a(obj, obj1));
        a/a/a/a/a/b;
        JVM INSTR monitorenter ;
        obj = a();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (((Set) (obj)).isEmpty())
        {
            a.remove();
        }
        a/a/a/a/a/b;
        JVM INSTR monitorexit ;
        return;
        obj;
        a/a/a/a/a/b;
        JVM INSTR monitorexit ;
        throw obj;
    }

    public b a(byte byte0, byte byte1)
    {
        if (!b)
        {
            return this;
        }
        boolean flag;
        if (byte0 == byte1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        return this;
    }

    public b a(char c1, char c2)
    {
        if (!b)
        {
            return this;
        }
        boolean flag;
        if (c1 == c2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        return this;
    }

    public b a(double d1, double d2)
    {
        if (!b)
        {
            return this;
        } else
        {
            return a(Double.doubleToLongBits(d1), Double.doubleToLongBits(d2));
        }
    }

    public b a(float f, float f1)
    {
        if (!b)
        {
            return this;
        } else
        {
            return a(Float.floatToIntBits(f), Float.floatToIntBits(f1));
        }
    }

    public b a(int i, int j)
    {
        if (!b)
        {
            return this;
        }
        boolean flag;
        if (i == j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        return this;
    }

    public b a(long l, long l1)
    {
        if (!b)
        {
            return this;
        }
        boolean flag;
        if (l == l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        return this;
    }

    public b a(short word0, short word1)
    {
        if (!b)
        {
            return this;
        }
        boolean flag;
        if (word0 == word1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        return this;
    }

    public b a(boolean flag, boolean flag1)
    {
        if (!b)
        {
            return this;
        }
        if (flag == flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        return this;
    }

    public b a(byte abyte0[], byte abyte1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (b && abyte0 != abyte1)
        {
            if (abyte0 == null || abyte1 == null)
            {
                a(false);
                return this;
            }
            if (abyte0.length != abyte1.length)
            {
                a(false);
                return this;
            }
            while (i < abyte0.length && b) 
            {
                a(abyte0[i], abyte1[i]);
                i++;
            }
        }
        return this;
    }

    public b a(char ac[], char ac1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (b && ac != ac1)
        {
            if (ac == null || ac1 == null)
            {
                a(false);
                return this;
            }
            if (ac.length != ac1.length)
            {
                a(false);
                return this;
            }
            while (i < ac.length && b) 
            {
                a(ac[i], ac1[i]);
                i++;
            }
        }
        return this;
    }

    public b a(double ad[], double ad1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (b && ad != ad1)
        {
            if (ad == null || ad1 == null)
            {
                a(false);
                return this;
            }
            if (ad.length != ad1.length)
            {
                a(false);
                return this;
            }
            while (i < ad.length && b) 
            {
                a(ad[i], ad1[i]);
                i++;
            }
        }
        return this;
    }

    public b a(float af[], float af1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (b && af != af1)
        {
            if (af == null || af1 == null)
            {
                a(false);
                return this;
            }
            if (af.length != af1.length)
            {
                a(false);
                return this;
            }
            while (i < af.length && b) 
            {
                a(af[i], af1[i]);
                i++;
            }
        }
        return this;
    }

    public b a(int ai[], int ai1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (b && ai != ai1)
        {
            if (ai == null || ai1 == null)
            {
                a(false);
                return this;
            }
            if (ai.length != ai1.length)
            {
                a(false);
                return this;
            }
            while (i < ai.length && b) 
            {
                a(ai[i], ai1[i]);
                i++;
            }
        }
        return this;
    }

    public b a(long al[], long al1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (b && al != al1)
        {
            if (al == null || al1 == null)
            {
                a(false);
                return this;
            }
            if (al.length != al1.length)
            {
                a(false);
                return this;
            }
            while (i < al.length && b) 
            {
                a(al[i], al1[i]);
                i++;
            }
        }
        return this;
    }

    public b a(Object aobj[], Object aobj1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (b && aobj != aobj1)
        {
            if (aobj == null || aobj1 == null)
            {
                a(false);
                return this;
            }
            if (aobj.length != aobj1.length)
            {
                a(false);
                return this;
            }
            while (i < aobj.length && b) 
            {
                e(aobj[i], aobj1[i]);
                i++;
            }
        }
        return this;
    }

    public b a(short aword0[], short aword1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (b && aword0 != aword1)
        {
            if (aword0 == null || aword1 == null)
            {
                a(false);
                return this;
            }
            if (aword0.length != aword1.length)
            {
                a(false);
                return this;
            }
            while (i < aword0.length && b) 
            {
                a(aword0[i], aword1[i]);
                i++;
            }
        }
        return this;
    }

    public b a(boolean aflag[], boolean aflag1[])
    {
        int i;
        i = 0;
        break MISSING_BLOCK_LABEL_2;
        if (b && aflag != aflag1)
        {
            if (aflag == null || aflag1 == null)
            {
                a(false);
                return this;
            }
            if (aflag.length != aflag1.length)
            {
                a(false);
                return this;
            }
            while (i < aflag.length && b) 
            {
                a(aflag[i], aflag1[i]);
                i++;
            }
        }
        return this;
    }

    protected void a(boolean flag)
    {
        b = flag;
    }

    public boolean b()
    {
        return b;
    }

    public b e(Object obj, Object obj1)
    {
        while (!b || obj == obj1) 
        {
            return this;
        }
        if (obj == null || obj1 == null)
        {
            a(false);
            return this;
        }
        if (!obj.getClass().isArray())
        {
            b = obj.equals(obj1);
            return this;
        }
        if (obj.getClass() != obj1.getClass())
        {
            a(false);
            return this;
        }
        if (obj instanceof long[])
        {
            a((long[])(long[])obj, (long[])(long[])obj1);
            return this;
        }
        if (obj instanceof int[])
        {
            a((int[])(int[])obj, (int[])(int[])obj1);
            return this;
        }
        if (obj instanceof short[])
        {
            a((short[])(short[])obj, (short[])(short[])obj1);
            return this;
        }
        if (obj instanceof char[])
        {
            a((char[])(char[])obj, (char[])(char[])obj1);
            return this;
        }
        if (obj instanceof byte[])
        {
            a((byte[])(byte[])obj, (byte[])(byte[])obj1);
            return this;
        }
        if (obj instanceof double[])
        {
            a((double[])(double[])obj, (double[])(double[])obj1);
            return this;
        }
        if (obj instanceof float[])
        {
            a((float[])(float[])obj, (float[])(float[])obj1);
            return this;
        }
        if (obj instanceof boolean[])
        {
            a((boolean[])(boolean[])obj, (boolean[])(boolean[])obj1);
            return this;
        } else
        {
            a((Object[])(Object[])obj, (Object[])(Object[])obj1);
            return this;
        }
    }

}
