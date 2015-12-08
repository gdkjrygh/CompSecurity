// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.a.a;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.a.c.b.a.c;

// Referenced classes of package org.a.c.b.a.a:
//            f, a, g, e

class b
    implements c
{

    final a a;
    private final ArrayList b;
    private final List c;

    b(a a1, ArrayList arraylist, List list)
    {
        a = a1;
        b = arraylist;
        c = list;
        super();
    }

    public final boolean a()
    {
        return true;
    }

    public final boolean a(int i, byte abyte0[], byte abyte1[], byte abyte2[])
    {
        if (i != 65505)
        {
            b.add(new f(i, abyte0, abyte1, abyte2));
        } else
        if (!org.a.c.b.a.a.a.a(abyte2, org.a.c.b.a.a.a.c))
        {
            b.add(new f(i, abyte0, abyte1, abyte2));
        } else
        {
            abyte0 = new g(i, abyte0, abyte1, abyte2);
            b.add(abyte0);
            c.add(abyte0);
        }
        return true;
    }

    public final boolean a(byte abyte0[], InputStream inputstream)
    {
        b.add(new e(abyte0, inputstream));
        return true;
    }
}
