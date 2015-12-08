// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.c.a;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.c.a:
//            b, d

public static final class <init>
{

    private final b a;
    private final String b;

    public Appendable a(Appendable appendable, Iterator iterator)
        throws IOException
    {
        d.a(appendable);
        if (iterator.hasNext())
        {
            java.util.Entry entry = (java.util.Entry)iterator.next();
            appendable.append(a.a(entry.getKey()));
            appendable.append(b);
            appendable.append(a.a(entry.getValue()));
            java.util.Entry entry1;
            for (; iterator.hasNext(); appendable.append(a.a(entry1.getValue())))
            {
                appendable.append(com.google.c.a.b.a(a));
                entry1 = (java.util.Entry)iterator.next();
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

    private lder(b b1, String s)
    {
        a = b1;
        b = (String)d.a(s);
    }

    b(b b1, String s, b b2)
    {
        this(b1, s);
    }
}
