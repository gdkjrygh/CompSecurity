// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.aspectj.runtime.internal;


public final class Conversions
{

    private Conversions()
    {
    }

    public static Object booleanObject(boolean flag)
    {
        return new Boolean(flag);
    }

    public static boolean booleanValue(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (obj instanceof Boolean)
        {
            return ((Boolean)obj).booleanValue();
        } else
        {
            throw new ClassCastException(obj.getClass().getName() + " can not be converted to boolean");
        }
    }

    public static Object byteObject(byte byte0)
    {
        return new Byte(byte0);
    }

    public static byte byteValue(Object obj)
    {
        if (obj == null)
        {
            return 0;
        }
        if (obj instanceof Number)
        {
            return ((Number)obj).byteValue();
        } else
        {
            throw new ClassCastException(obj.getClass().getName() + " can not be converted to byte");
        }
    }

    public static Object charObject(char c)
    {
        return new Character(c);
    }

    public static char charValue(Object obj)
    {
        if (obj == null)
        {
            return '\0';
        }
        if (obj instanceof Character)
        {
            return ((Character)obj).charValue();
        } else
        {
            throw new ClassCastException(obj.getClass().getName() + " can not be converted to char");
        }
    }

    public static Object doubleObject(double d)
    {
        return new Double(d);
    }

    public static double doubleValue(Object obj)
    {
        if (obj == null)
        {
            return 0.0D;
        }
        if (obj instanceof Number)
        {
            return ((Number)obj).doubleValue();
        } else
        {
            throw new ClassCastException(obj.getClass().getName() + " can not be converted to double");
        }
    }

    public static Object floatObject(float f)
    {
        return new Float(f);
    }

    public static float floatValue(Object obj)
    {
        if (obj == null)
        {
            return 0.0F;
        }
        if (obj instanceof Number)
        {
            return ((Number)obj).floatValue();
        } else
        {
            throw new ClassCastException(obj.getClass().getName() + " can not be converted to float");
        }
    }

    public static Object intObject(int i)
    {
        return new Integer(i);
    }

    public static int intValue(Object obj)
    {
        if (obj == null)
        {
            return 0;
        }
        if (obj instanceof Number)
        {
            return ((Number)obj).intValue();
        } else
        {
            throw new ClassCastException(obj.getClass().getName() + " can not be converted to int");
        }
    }

    public static Object longObject(long l)
    {
        return new Long(l);
    }

    public static long longValue(Object obj)
    {
        if (obj == null)
        {
            return 0L;
        }
        if (obj instanceof Number)
        {
            return ((Number)obj).longValue();
        } else
        {
            throw new ClassCastException(obj.getClass().getName() + " can not be converted to long");
        }
    }

    public static Object shortObject(short word0)
    {
        return new Short(word0);
    }

    public static short shortValue(Object obj)
    {
        if (obj == null)
        {
            return 0;
        }
        if (obj instanceof Number)
        {
            return ((Number)obj).shortValue();
        } else
        {
            throw new ClassCastException(obj.getClass().getName() + " can not be converted to short");
        }
    }

    public static Object voidObject()
    {
        return null;
    }

    public static Object voidValue(Object obj)
    {
        if (obj != null);
        return obj;
    }
}
