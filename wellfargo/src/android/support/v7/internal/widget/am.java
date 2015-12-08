// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;


public class am
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;

    public am()
    {
        a = 0;
        b = 0;
        c = 0x80000000;
        d = 0x80000000;
        e = 0;
        f = 0;
        g = false;
        h = false;
    }

    public int a()
    {
        return a;
    }

    public void a(int i, int j)
    {
        c = i;
        d = j;
        h = true;
        if (g)
        {
            if (j != 0x80000000)
            {
                a = j;
            }
            if (i != 0x80000000)
            {
                b = i;
            }
        } else
        {
            if (i != 0x80000000)
            {
                a = i;
            }
            if (j != 0x80000000)
            {
                b = j;
                return;
            }
        }
    }

    public void a(boolean flag)
    {
        if (flag == g)
        {
            return;
        }
        g = flag;
        if (h)
        {
            if (flag)
            {
                int i;
                if (d != 0x80000000)
                {
                    i = d;
                } else
                {
                    i = e;
                }
                a = i;
                if (c != 0x80000000)
                {
                    i = c;
                } else
                {
                    i = f;
                }
                b = i;
                return;
            }
            int j;
            if (c != 0x80000000)
            {
                j = c;
            } else
            {
                j = e;
            }
            a = j;
            if (d != 0x80000000)
            {
                j = d;
            } else
            {
                j = f;
            }
            b = j;
            return;
        } else
        {
            a = e;
            b = f;
            return;
        }
    }

    public int b()
    {
        return b;
    }

    public void b(int i, int j)
    {
        h = false;
        if (i != 0x80000000)
        {
            e = i;
            a = i;
        }
        if (j != 0x80000000)
        {
            f = j;
            b = j;
        }
    }

    public int c()
    {
        if (g)
        {
            return b;
        } else
        {
            return a;
        }
    }

    public int d()
    {
        if (g)
        {
            return a;
        } else
        {
            return b;
        }
    }
}
