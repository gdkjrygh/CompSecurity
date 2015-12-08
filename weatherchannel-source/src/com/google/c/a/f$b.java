// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.a;


// Referenced classes of package com.google.c.a:
//            e, f

static abstract class <init> extends Enum
    implements e
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/google/c/a/f$b, s);
    }

    public static eOf[] values()
    {
        return (eOf[])e.clone();
    }

    e a()
    {
        return this;
    }

    static 
    {
        a = new f.b("ALWAYS_TRUE", 0) {

            public boolean a(Object obj)
            {
                return true;
            }

            public String toString()
            {
                return "Predicates.alwaysTrue()";
            }

        };
        b = new f.b("ALWAYS_FALSE", 1) {

            public boolean a(Object obj)
            {
                return false;
            }

            public String toString()
            {
                return "Predicates.alwaysFalse()";
            }

        };
        c = new f.b("IS_NULL", 2) {

            public boolean a(Object obj)
            {
                return obj == null;
            }

            public String toString()
            {
                return "Predicates.isNull()";
            }

        };
        d = new f.b("NOT_NULL", 3) {

            public boolean a(Object obj)
            {
                return obj != null;
            }

            public String toString()
            {
                return "Predicates.notNull()";
            }

        };
        e = (new e[] {
            a, b, c, d
        });
    }

    private _cls4(String s, int i)
    {
        super(s, i);
    }

    t>(String s, int i, t> t>)
    {
        this(s, i);
    }
}
