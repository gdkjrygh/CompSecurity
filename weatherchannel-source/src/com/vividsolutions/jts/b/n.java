// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.b;


// Referenced classes of package com.vividsolutions.jts.b:
//            s

public final class n
{

    s a[];

    public n(int i)
    {
        a = new s[2];
        a[0] = new s(-1);
        a[1] = new s(-1);
    }

    public n(int i, int j)
    {
        a = new s[2];
        a[0] = new s(-1);
        a[1] = new s(-1);
        a[i].a[0] = j;
    }

    public n(int i, int j, int k)
    {
        a = new s[2];
        a[0] = new s(-1, -1, -1);
        a[1] = new s(-1, -1, -1);
    }

    public n(int i, int j, int k, int l)
    {
        a = new s[2];
        a[0] = new s(-1, -1, -1);
        a[1] = new s(-1, -1, -1);
        s s1 = a[i];
        s1.a[0] = 1;
        s1.a[1] = k;
        s1.a[2] = l;
    }

    public n(n n1)
    {
        a = new s[2];
        a[0] = new s(n1.a[0]);
        a[1] = new s(n1.a[1]);
    }

    public static n a(n n1)
    {
        n n2 = new n(-1);
        for (int i = 0; i < 2; i++)
        {
            n2.b(i, n1.a(i));
        }

        return n2;
    }

    public final int a(int i)
    {
        return a[i].a(0);
    }

    public final int a(int i, int j)
    {
        return a[i].a(j);
    }

    public final void a()
    {
        a[0].c();
        a[1].c();
    }

    public final void a(int i, int j, int k)
    {
        a[i].a[j] = k;
    }

    public final int b()
    {
        int i = 0;
        if (!a[0].a())
        {
            i = 1;
        }
        int j = i;
        if (!a[1].a())
        {
            j = i + 1;
        }
        return j;
    }

    public final void b(int i, int j)
    {
        a[i].a[0] = j;
    }

    public final void b(n n1)
    {
        int i = 0;
        while (i < 2) 
        {
            if (a[i] == null && n1.a[i] != null)
            {
                a[i] = new s(n1.a[i]);
            } else
            {
                s s1 = a[i];
                s s2 = n1.a[i];
                if (s2.a.length > s1.a.length)
                {
                    s1.a = (new int[] {
                        s1.a[0], -1, -1
                    });
                }
                int j = 0;
                while (j < s1.a.length) 
                {
                    if (s1.a[j] == -1 && j < s2.a.length)
                    {
                        s1.a[j] = s2.a[j];
                    }
                    j++;
                }
            }
            i++;
        }
    }

    public final boolean b(int i)
    {
        return a[i].a();
    }

    public final void c(int i, int j)
    {
        a[i].b(j);
    }

    public final boolean c()
    {
        boolean flag = false;
        if (a[0].b() || a[1].b())
        {
            flag = true;
        }
        return flag;
    }

    public final boolean c(int i)
    {
        return a[i].b();
    }

    public final void d(int i, int j)
    {
        s s1 = a[i];
        for (i = 0; i < s1.a.length; i++)
        {
            if (s1.a[i] == -1)
            {
                s1.a[i] = j;
            }
        }

    }

    public final boolean d(int i)
    {
        return a[i].a.length == 1;
    }

    public final void e(int i)
    {
        if (a[i].b())
        {
            a[i] = new s(a[i].a[0]);
        }
    }

    public final boolean e(int i, int j)
    {
        s s1 = a[i];
        for (i = 0; i < s1.a.length; i++)
        {
            if (s1.a[i] != 2)
            {
                return false;
            }
        }

        return true;
    }

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (a[0] != null)
        {
            stringbuffer.append("A:");
            stringbuffer.append(a[0].toString());
        }
        if (a[1] != null)
        {
            stringbuffer.append(" B:");
            stringbuffer.append(a[1].toString());
        }
        return stringbuffer.toString();
    }
}
