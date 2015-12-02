// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class idv
{

    private static final idv a = new idv();
    private static final Object b = new Serializable() {

        private static final long serialVersionUID = 1L;

        public final String toString()
        {
            return "Notification=>Completed";
        }

    };
    private static final Object c = new Serializable() {

        private static final long serialVersionUID = 2L;

        public final String toString()
        {
            return "Notification=>NULL";
        }

    };

    private idv()
    {
    }

    public static idv a()
    {
        return a;
    }

    public static Object a(Object obj)
    {
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = c;
        }
        return obj1;
    }

    public static Object a(Throwable throwable)
    {
        return new idw(throwable);
    }

    public static boolean a(icg icg1, Object obj)
    {
        if (obj == b)
        {
            icg1.a();
            return true;
        }
        if (obj == c)
        {
            icg1.a(null);
            return false;
        }
        if (obj != null)
        {
            if (obj.getClass() == idw)
            {
                icg1.a(idw.a((idw)obj));
                return true;
            } else
            {
                icg1.a(obj);
                return false;
            }
        } else
        {
            throw new IllegalArgumentException("The lite notification can not be null");
        }
    }

    public static Object b()
    {
        return b;
    }

    public static boolean b(Object obj)
    {
        return obj == b;
    }

    public static boolean c(Object obj)
    {
        return obj instanceof idw;
    }

    public static Object d(Object obj)
    {
        Object obj1 = obj;
        if (obj == c)
        {
            obj1 = null;
        }
        return obj1;
    }

    public static Throwable e(Object obj)
    {
        return idw.a((idw)obj);
    }

}
