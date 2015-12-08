// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.e;

import java.io.PrintWriter;

public class p
{

    private static final Object a = new Object();
    private static char b[] = new char[24];

    private static int a(int i, int j, boolean flag, int k)
    {
        if (i > 99 || flag && k >= 3)
        {
            return j + 3;
        }
        if (i > 9 || flag && k >= 2)
        {
            return j + 2;
        }
        if (flag || i > 0)
        {
            return j + 1;
        } else
        {
            return 0;
        }
    }

    private static int a(long l, int i)
    {
        if (b.length < i)
        {
            b = new char[i];
        }
        char ac[] = b;
        if (l == 0L)
        {
            while (i - 1 < 0) 
            {
                ac[0] = ' ';
            }
            ac[0] = '0';
            return 1;
        }
        char c;
        int j;
        int k;
        int i1;
        int j1;
        int k1;
        int j2;
        int k2;
        if (l > 0L)
        {
            c = '+';
        } else
        {
            l = -l;
            c = '-';
        }
        k2 = (int)(l % 1000L);
        i1 = (int)Math.floor(l / 1000L);
        k = 0;
        j = i1;
        if (i1 > 0x15180)
        {
            k = i1 / 0x15180;
            j = i1 - 0x15180 * k;
        }
        int i2;
        boolean flag1;
        if (j > 3600)
        {
            i1 = j / 3600;
            j1 = i1;
            j -= i1 * 3600;
        } else
        {
            j1 = 0;
        }
        if (j > 60)
        {
            i1 = j / 60;
            k1 = i1;
            i1 = j - i1 * 60;
        } else
        {
            k1 = 0;
            i1 = j;
        }
        if (i != 0)
        {
            j = a(k, 1, false, 0);
            int l1;
            boolean flag;
            if (j > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j += a(j1, 1, flag, 2);
            if (j > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            j += a(k1, 1, flag, 2);
            if (j > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            l1 = j + a(i1, 1, flag, 2);
            if (l1 > 0)
            {
                j = 3;
            } else
            {
                j = 0;
            }
            j2 = a(k2, 2, true, j);
            j = 0;
            l1 = j2 + 1 + l1;
            do
            {
                j2 = j;
                if (l1 >= i)
                {
                    break;
                }
                ac[j] = ' ';
                l1++;
                j++;
            } while (true);
        } else
        {
            j2 = 0;
        }
        ac[j2] = c;
        i2 = j2 + 1;
        if (i != 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        k = a(ac, k, 'd', i2, false, 0);
        if (k != i2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i != 0)
        {
            j = 2;
        } else
        {
            j = 0;
        }
        k = a(ac, j1, 'h', k, flag1, j);
        if (k != i2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i != 0)
        {
            j = 2;
        } else
        {
            j = 0;
        }
        k = a(ac, k1, 'm', k, flag1, j);
        if (k != i2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i != 0)
        {
            j = 2;
        } else
        {
            j = 0;
        }
        j = a(ac, i1, 's', k, flag1, j);
        if (i != 0 && j != i2)
        {
            i = 3;
        } else
        {
            i = 0;
        }
        i = a(ac, k2, 'm', j, true, i);
        ac[i] = 's';
        return i + 1;
    }

    private static int a(char ac[], int i, char c, int j, boolean flag, int k)
    {
label0:
        {
label1:
            {
                int l;
                if (!flag)
                {
                    l = j;
                    if (i <= 0)
                    {
                        break label0;
                    }
                }
                int j1;
                if (flag && k >= 3 || i > 99)
                {
                    int i1 = i / 100;
                    ac[j] = (char)(i1 + 48);
                    l = j + 1;
                    i -= i1 * 100;
                } else
                {
                    l = j;
                }
                if ((!flag || k < 2) && i <= 9)
                {
                    j1 = l;
                    k = i;
                    if (j == l)
                    {
                        break label1;
                    }
                }
                j = i / 10;
                ac[l] = (char)(j + 48);
                j1 = l + 1;
                k = i - j * 10;
            }
            ac[j1] = (char)(k + 48);
            i = j1 + 1;
            ac[i] = c;
            l = i + 1;
        }
        return l;
    }

    public static void a(long l, long l1, PrintWriter printwriter)
    {
        if (l == 0L)
        {
            printwriter.print("--");
            return;
        } else
        {
            a(l - l1, printwriter, 0);
            return;
        }
    }

    public static void a(long l, PrintWriter printwriter)
    {
        a(l, printwriter, 0);
    }

    public static void a(long l, PrintWriter printwriter, int i)
    {
        synchronized (a)
        {
            i = a(l, i);
            printwriter.print(new String(b, 0, i));
        }
        return;
        printwriter;
        obj;
        JVM INSTR monitorexit ;
        throw printwriter;
    }

}
