// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.a;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.c.a:
//            d

public class b
{
    public static final class a
    {

        private final b a;
        private final String b;

        public Appendable a(Appendable appendable, Iterator iterator)
            throws IOException
        {
            d.a(appendable);
            if (iterator.hasNext())
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                appendable.append(a.a(entry.getKey()));
                appendable.append(b);
                appendable.append(a.a(entry.getValue()));
                java.util.Map.Entry entry1;
                for (; iterator.hasNext(); appendable.append(a.a(entry1.getValue())))
                {
                    appendable.append(b.a(a));
                    entry1 = (java.util.Map.Entry)iterator.next();
                    appendable.append(a.a(entry1.getKey()));
                    appendable.append(b);
                }

            }
            return appendable;
        }

        public StringBuilder a(StringBuilder stringbuilder, Iterable iterable)
        {
            return a(stringbuilder, iterable.iterator());
        }

        public StringBuilder a(StringBuilder stringbuilder, Iterator iterator)
        {
            try
            {
                a(((Appendable) (stringbuilder)), iterator);
            }
            // Misplaced declaration of an exception variable
            catch (StringBuilder stringbuilder)
            {
                throw new AssertionError(stringbuilder);
            }
            return stringbuilder;
        }

        public StringBuilder a(StringBuilder stringbuilder, Map map)
        {
            return a(stringbuilder, ((Iterable) (map.entrySet())));
        }

        private a(b b1, String s)
        {
            a = b1;
            b = (String)d.a(s);
        }

    }


    private final String a;

    private b(b b1)
    {
        a = b1.a;
    }


    private b(String s)
    {
        a = (String)d.a(s);
    }

    public static b a(char c1)
    {
        return new b(String.valueOf(c1));
    }

    public static b a(String s)
    {
        return new b(s);
    }

    static String a(b b1)
    {
        return b1.a;
    }

    CharSequence a(Object obj)
    {
        d.a(obj);
        if (obj instanceof CharSequence)
        {
            return (CharSequence)obj;
        } else
        {
            return obj.toString();
        }
    }

    public b b(String s)
    {
        d.a(s);
        return new b(this, s) {

            final String a;
            final b b;

            CharSequence a(Object obj)
            {
                if (obj == null)
                {
                    return a;
                } else
                {
                    return b.a(obj);
                }
            }

            public b b(String s1)
            {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            
            {
                b = b.this;
                a = s;
                super(b2, null);
            }
        };
    }

    public a c(String s)
    {
        return new a(this, s);
    }
}
