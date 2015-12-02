// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public final class gjw
{

    private final String a;

    private gjw(String s)
    {
        a = s;
    }

    public static gjw a(String s)
    {
        return new gjw(s);
    }

    private Appendable a(Appendable appendable, Iterator iterator)
    {
        if (iterator.hasNext())
        {
            appendable.append(a(iterator.next()));
            for (; iterator.hasNext(); appendable.append(a(iterator.next())))
            {
                appendable.append(a);
            }

        }
        return appendable;
    }

    private static CharSequence a(Object obj)
    {
        if (obj instanceof CharSequence)
        {
            return (CharSequence)obj;
        } else
        {
            return obj.toString();
        }
    }

    private String a(Iterator iterator)
    {
        return a(new StringBuilder(), iterator).toString();
    }

    private StringBuilder a(StringBuilder stringbuilder, Iterator iterator)
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

    private static Iterable b(Object obj, Object obj1, Object aobj[])
    {
        return new _cls1(aobj, obj, obj1);
    }

    public final String a(Iterable iterable)
    {
        return a(iterable.iterator());
    }

    public final transient String a(Object obj, Object obj1, Object aobj[])
    {
        return a(b(obj, obj1, aobj));
    }

    public final String a(Object aobj[])
    {
        return a(((Iterable) (Arrays.asList(aobj))));
    }

    /* member class not found */
    class _cls1 {}

}
