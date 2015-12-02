// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google:
//            dt, a3, bR

public final class e1
{

    private dt a;

    private e1()
    {
    }

    static e1 a()
    {
        return c();
    }

    private static e1 c()
    {
        e1 e1_1 = new e1();
        e1_1.a = new dt(null);
        return e1_1;
    }

    public e1 a(int i)
    {
        if (dt.b(a) == null)
        {
            dt.c(a, new ArrayList());
        }
        dt.b(a).add(Integer.valueOf(i));
        return this;
    }

    public e1 a(long l)
    {
        if (dt.a(a) == null)
        {
            dt.a(a, new ArrayList());
        }
        dt.a(a).add(Long.valueOf(l));
        return this;
    }

    public e1 a(a3 a3)
    {
        if (dt.d(a) == null)
        {
            dt.b(a, new ArrayList());
        }
        dt.d(a).add(a3);
        return this;
    }

    public e1 a(bR br)
    {
        if (dt.e(a) == null)
        {
            dt.d(a, new ArrayList());
        }
        dt.e(a).add(br);
        return this;
    }

    public e1 a(dt dt1)
    {
        if (!dt.a(dt1).isEmpty())
        {
            if (dt.a(a) == null)
            {
                dt.a(a, new ArrayList());
            }
            dt.a(a).addAll(dt.a(dt1));
        }
        if (!dt.b(dt1).isEmpty())
        {
            if (dt.b(a) == null)
            {
                dt.c(a, new ArrayList());
            }
            dt.b(a).addAll(dt.b(dt1));
        }
        if (!dt.c(dt1).isEmpty())
        {
            if (dt.c(a) == null)
            {
                dt.e(a, new ArrayList());
            }
            dt.c(a).addAll(dt.c(dt1));
        }
        if (!dt.d(dt1).isEmpty())
        {
            if (dt.d(a) == null)
            {
                dt.b(a, new ArrayList());
            }
            dt.d(a).addAll(dt.d(dt1));
        }
        if (!dt.e(dt1).isEmpty())
        {
            if (dt.e(a) == null)
            {
                dt.d(a, new ArrayList());
            }
            dt.e(a).addAll(dt.e(dt1));
        }
        return this;
    }

    public dt b()
    {
        dt dt1;
        if (dt.a(a) == null)
        {
            dt.a(a, Collections.emptyList());
        } else
        {
            dt.a(a, Collections.unmodifiableList(dt.a(a)));
        }
        if (dt.b(a) == null)
        {
            dt.c(a, Collections.emptyList());
        } else
        {
            dt.c(a, Collections.unmodifiableList(dt.b(a)));
        }
        if (dt.c(a) == null)
        {
            dt.e(a, Collections.emptyList());
        } else
        {
            dt.e(a, Collections.unmodifiableList(dt.c(a)));
        }
        if (dt.d(a) == null)
        {
            dt.b(a, Collections.emptyList());
        } else
        {
            dt.b(a, Collections.unmodifiableList(dt.d(a)));
        }
        if (dt.e(a) == null)
        {
            dt.d(a, Collections.emptyList());
        } else
        {
            dt.d(a, Collections.unmodifiableList(dt.e(a)));
        }
        dt1 = a;
        a = null;
        return dt1;
    }

    public e1 b(long l)
    {
        if (dt.c(a) == null)
        {
            dt.e(a, new ArrayList());
        }
        dt.c(a).add(Long.valueOf(l));
        return this;
    }
}
