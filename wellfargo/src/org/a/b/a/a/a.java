// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.a.b.a.a;

import org.a.b.a.a.a.c;

// Referenced classes of package org.a.b.a.a:
//            b, g

public class a
{

    private final String a;
    private final b b;
    private final c c;

    public a(String s, c c1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Name may not be null");
        }
        if (c1 == null)
        {
            throw new IllegalArgumentException("Body may not be null");
        } else
        {
            a = s;
            c = c1;
            b = new b();
            a(c1);
            b(c1);
            c(c1);
            return;
        }
    }

    public String a()
    {
        return a;
    }

    public void a(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Field name may not be null");
        } else
        {
            b.a(new g(s, s1));
            return;
        }
    }

    protected void a(c c1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("form-data; name=\"");
        stringbuilder.append(a());
        stringbuilder.append("\"");
        if (c1.b() != null)
        {
            stringbuilder.append("; filename=\"");
            stringbuilder.append(c1.b());
            stringbuilder.append("\"");
        }
        a("Content-Disposition", stringbuilder.toString());
    }

    public c b()
    {
        return c;
    }

    protected void b(c c1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(c1.a());
        if (c1.c() != null)
        {
            stringbuilder.append("; charset=");
            stringbuilder.append(c1.c());
        }
        a("Content-Type", stringbuilder.toString());
    }

    public b c()
    {
        return b;
    }

    protected void c(c c1)
    {
        a("Content-Transfer-Encoding", c1.d());
    }
}
