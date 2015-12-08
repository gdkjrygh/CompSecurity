// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.util;

import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.google.android.apps.ytremote.util:
//            c

public final class Join
{

    private static Appendable a(Appendable appendable, String s, Iterator iterator)
    {
        c.a(appendable);
        c.a(s);
        if (iterator.hasNext())
        {
            try
            {
                a(appendable, iterator.next());
                for (; iterator.hasNext(); a(appendable, iterator.next()))
                {
                    appendable.append(s);
                }

            }
            // Misplaced declaration of an exception variable
            catch (Appendable appendable)
            {
                throw new JoinException(appendable, null);
            }
        }
        return appendable;
    }

    public static String a(String s, Iterable iterable)
    {
        iterable = iterable.iterator();
        StringBuilder stringbuilder = new StringBuilder();
        a(((Appendable) (stringbuilder)), s, ((Iterator) (iterable)));
        return stringbuilder.toString();
    }

    private static void a(Appendable appendable, Object obj)
    {
        if (obj instanceof CharSequence)
        {
            obj = (CharSequence)obj;
        } else
        {
            obj = String.valueOf(obj);
        }
        appendable.append(((CharSequence) (obj)));
    }

    private class JoinException extends RuntimeException
    {

        private static final long serialVersionUID = 1L;

        private JoinException(IOException ioexception)
        {
            super(ioexception);
        }

        JoinException(IOException ioexception, a a1)
        {
            this(ioexception);
        }
    }

}
