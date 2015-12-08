// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Enumeration;
import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            ac, ad, q

public final class ab
{

    private final String a;
    private final byte b[];
    private ad c[];
    private final q d;
    private Hashtable e;
    private final long f;

    public ab(String s, byte abyte0[], ad aad[], q q)
    {
        this(s, abyte0, aad, q, System.currentTimeMillis());
    }

    private ab(String s, byte abyte0[], ad aad[], q q, long l)
    {
        if (s == null && abyte0 == null)
        {
            throw new IllegalArgumentException("Text and bytes are null");
        } else
        {
            a = s;
            b = abyte0;
            c = aad;
            d = q;
            e = null;
            f = l;
            return;
        }
    }

    public final String a()
    {
        return a;
    }

    public final void a(ac ac1, Object obj)
    {
        if (e == null)
        {
            e = new Hashtable(3);
        }
        e.put(ac1, obj);
    }

    public final void a(Hashtable hashtable)
    {
        if (hashtable != null)
        {
            if (e == null)
            {
                e = hashtable;
            } else
            {
                Enumeration enumeration = hashtable.keys();
                while (enumeration.hasMoreElements()) 
                {
                    ac ac1 = (ac)enumeration.nextElement();
                    Object obj = hashtable.get(ac1);
                    e.put(ac1, obj);
                }
            }
        }
    }

    public final void a(ad aad[])
    {
        if (c == null)
        {
            c = aad;
        } else
        if (aad != null && aad.length > 0)
        {
            ad aad1[] = new ad[c.length + aad.length];
            System.arraycopy(c, 0, aad1, 0, c.length);
            System.arraycopy(aad, 0, aad1, c.length, aad.length);
            c = aad1;
            return;
        }
    }

    public final ad[] b()
    {
        return c;
    }

    public final q c()
    {
        return d;
    }

    public final Hashtable d()
    {
        return e;
    }

    public final String toString()
    {
        if (a == null)
        {
            return (new StringBuilder("[")).append(b.length).append(" bytes]").toString();
        } else
        {
            return a;
        }
    }
}
