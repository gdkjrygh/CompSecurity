// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.c.b.b;

import java.util.ArrayList;
import org.a.c.b;
import org.a.c.b.b.a.e;
import org.a.c.b.b.a.j;

// Referenced classes of package org.a.c.b.b:
//            e, i, d, a

public class c extends org.a.c.b.b.e
    implements j
{

    public final int a;
    public final ArrayList b;
    public final int c;
    private a g;

    public c(int k, ArrayList arraylist, int l, int i1)
    {
        super(l, arraylist.size() * 12 + 2 + 4);
        g = null;
        a = k;
        b = arraylist;
        c = i1;
    }

    public static final String a(int k)
    {
        switch (k)
        {
        default:
            return "Bad Type";

        case -1: 
            return "Unknown";

        case 0: // '\0'
            return "Root";

        case 1: // '\001'
            return "Sub";

        case 2: // '\002'
            return "Thumbnail";

        case -2: 
            return "Exif";

        case -3: 
            return "Gps";

        case -4: 
            return "Interoperability";
        }
    }

    private i a(e e1)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        i k = null;
_L4:
        return k;
_L2:
        int i1 = 0;
        do
        {
            if (i1 >= b.size())
            {
                return null;
            }
            i l = (i)b.get(i1);
            k = l;
            if (l.c == e1.b)
            {
                continue;
            }
            i1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final ArrayList a()
    {
        return new ArrayList(b);
    }

    public final void a(a a1)
    {
        g = a1;
    }

    public final boolean b()
    {
        return a(au) != null;
    }

    public final d c()
    {
        i k = a(au);
        i l = a(av);
        if (k != null && l != null)
        {
            return new d(this, k.d()[0], l.d()[0]);
        } else
        {
            throw new b("Couldn't find image data.");
        }
    }

    public final a d()
    {
        return g;
    }
}
