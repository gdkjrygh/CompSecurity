// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.a;


public interface com.vividsolutions.jts.a.b
{
    public static final class a
        implements com.vividsolutions.jts.a.b
    {

        public final boolean a(int i)
        {
            return i > 0;
        }

        public a()
        {
        }
    }

    public static final class b
        implements com.vividsolutions.jts.a.b
    {

        public final boolean a(int i)
        {
            return i % 2 == 1;
        }

        public b()
        {
        }
    }

    public static final class c
        implements com.vividsolutions.jts.a.b
    {

        public final boolean a(int i)
        {
            return i == 1;
        }

        public c()
        {
        }
    }

    public static final class d
        implements com.vividsolutions.jts.a.b
    {

        public final boolean a(int i)
        {
            return i > 1;
        }

        public d()
        {
        }
    }


    public static final com.vividsolutions.jts.a.b a = new b();
    public static final com.vividsolutions.jts.a.b b = a;

    public abstract boolean a(int i);

    
    {
        new a();
        new d();
        new c();
    }
}
