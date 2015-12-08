// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.f;


public final class o
{

    private static final Object a = new Object();
    private static char b[] = new char[24];

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

    public static void a(long l, StringBuilder stringbuilder)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        char ac[];
        if (b.length < 0)
        {
            b = new char[0];
        }
        ac = b;
        if (l != 0L) goto _L2; else goto _L1
_L1:
        int i;
        ac[0] = '0';
        i = 1;
_L9:
        stringbuilder.append(b, 0, i);
        obj;
        JVM INSTR monitorexit ;
        return;
_L10:
        int k1 = (int)(l % 1000L);
        i = (int)Math.floor(l / 1000L);
        if (i <= 0x15180) goto _L4; else goto _L3
_L3:
        int j = i / 0x15180;
        i -= j * 0x15180;
_L13:
        if (i <= 3600) goto _L6; else goto _L5
_L5:
        int k = i / 3600;
        i -= k * 3600;
_L12:
        if (i <= 60) goto _L8; else goto _L7
_L7:
        int j1 = i / 60;
        int i1;
        i1 = j1;
        i -= j1 * 60;
_L11:
        char c;
        ac[0] = c;
        j = a(ac, j, 'd', 1, false, 0);
        boolean flag;
        if (j != 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = a(ac, k, 'h', j, flag, 0);
        if (j != 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = a(ac, i1, 'm', j, flag, 0);
        if (j != 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = a(ac, k1, 'm', a(ac, i, 's', j, flag, 0), true, 0);
        ac[i] = 's';
        i++;
          goto _L9
_L15:
        l = -l;
        c = '-';
          goto _L10
        stringbuilder;
        throw stringbuilder;
_L8:
        i1 = 0;
          goto _L11
_L6:
        k = 0;
          goto _L12
_L4:
        j = 0;
          goto _L13
_L2:
        if (l <= 0L) goto _L15; else goto _L14
_L14:
        c = '+';
          goto _L10
    }

}
