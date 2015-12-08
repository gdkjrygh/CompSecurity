// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.a;

import java.io.Serializable;

// Referenced classes of package com.google.c.a:
//            b, e

public final class f
{
    private static class a
        implements e, Serializable
    {

        private final Object a;

        public boolean a(Object obj)
        {
            return a.equals(obj);
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof a)
            {
                obj = (a)obj;
                return a.equals(((a) (obj)).a);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return a.hashCode();
        }

        public String toString()
        {
            return (new StringBuilder()).append("Predicates.equalTo(").append(a).append(")").toString();
        }

        private a(Object obj)
        {
            a = obj;
        }

    }

    static abstract class b extends Enum
        implements e
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final b e[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/google/c/a/f$b, s);
        }

        public static b[] values()
        {
            return (b[])e.clone();
        }

        e a()
        {
            return this;
        }

        static 
        {
            a = new b("ALWAYS_TRUE", 0) {

                public boolean a(Object obj)
                {
                    return true;
                }

                public String toString()
                {
                    return "Predicates.alwaysTrue()";
                }

            };
            b = new b("ALWAYS_FALSE", 1) {

                public boolean a(Object obj)
                {
                    return false;
                }

                public String toString()
                {
                    return "Predicates.alwaysFalse()";
                }

            };
            c = new b("IS_NULL", 2) {

                public boolean a(Object obj)
                {
                    return obj == null;
                }

                public String toString()
                {
                    return "Predicates.isNull()";
                }

            };
            d = new b("NOT_NULL", 3) {

                public boolean a(Object obj)
                {
                    return obj != null;
                }

                public String toString()
                {
                    return "Predicates.notNull()";
                }

            };
            e = (new b[] {
                a, b, c, d
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }

    }


    private static final com.google.c.a.b a = com.google.c.a.b.a(',');

    public static e a()
    {
        return b.c.a();
    }

    public static e a(Object obj)
    {
        if (obj == null)
        {
            return a();
        } else
        {
            return new a(obj);
        }
    }

}
