// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.a;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.a:
//            e, f, g

public class l extends e
    implements f
{

    private final e b[];
    private final int c[];
    private final boolean d;

    public transient l(e ae[])
    {
        com.google.android.apps.youtube.common.fromguava.c.a(ae);
        LinkedList linkedlist = new LinkedList();
        int k = ae.length;
        for (int i = 0; i < k; i++)
        {
            e e2 = ae[i];
            if (e2 != null)
            {
                linkedlist.add(e2);
            }
        }

        b = (e[])linkedlist.toArray(new e[linkedlist.size()]);
        c = new int[ae.length];
        a(0, true);
        ae = b;
        k = ae.length;
        int j = 0;
        boolean flag = true;
        while (j < k) 
        {
            e e1 = ae[j];
            e1.a(this);
            if (flag && e1.c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j++;
        }
        d = flag;
    }

    private void a(int i, boolean flag)
    {
        int j = c(i);
        do
        {
            if (i >= b.length)
            {
                break;
            }
            j += b[i].g();
            if (!flag && j == c[i])
            {
                break;
            }
            c[i] = j;
            i++;
        } while (true);
    }

    private int c(int i)
    {
        if (i == 0)
        {
            return 0;
        } else
        {
            return c[i - 1];
        }
    }

    private int d(int i)
    {
        int j = Arrays.binarySearch(c, i);
        if (j >= 0)
        {
            int k;
            do
            {
                k = j + 1;
                j = k;
            } while (c[k] == i);
            return k;
        } else
        {
            return ~j;
        }
    }

    public final View a(int i, View view, ViewGroup viewgroup)
    {
        int j;
        boolean flag;
        if (i >= 0 && i < b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "position out of bounds");
        j = d(i);
        return b[j].a(i - c(j), view, viewgroup);
    }

    public final Object a(int i)
    {
        int j;
        boolean flag;
        if (i >= 0 && i < b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "position out of bounds");
        j = d(i);
        return b[j].a(i - c(j));
    }

    public final void a(e e1)
    {
        int i = 0;
        do
        {
label0:
            {
                if (i < b.length)
                {
                    if (e1 != b[i])
                    {
                        break label0;
                    }
                    a(i, false);
                    f();
                }
                return;
            }
            i++;
        } while (true);
    }

    protected final void a(Set set)
    {
        for (int i = 0; i < b.length; i++)
        {
            b[i].a(set);
        }

    }

    public final int b()
    {
        return c(b.length);
    }

    public boolean b(int i)
    {
        int j;
        boolean flag;
        if (i >= 0 && i < b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "position out of bounds");
        j = d(i);
        return b[j].b(i - c(j));
    }

    public final boolean c()
    {
        return d;
    }

    public final g e(int i)
    {
        int j;
        boolean flag;
        if (i >= 0 && i < b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "position out of bounds");
        j = d(i);
        return b[j].e(i - c(j));
    }

    public final long f(int i)
    {
        boolean flag;
        if (i >= 0 && i < b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.a(flag, "position out of bounds");
        if (d)
        {
            int j = d(i);
            return b[j].f(i - c(j));
        } else
        {
            return (long)i;
        }
    }
}
