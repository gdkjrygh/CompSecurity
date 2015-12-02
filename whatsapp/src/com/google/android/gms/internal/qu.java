// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            qw

public final class qu
{

    public static final Object azg = new Object();

    public static boolean equals(int ai[], int ai1[])
    {
        if (ai == null || ai.length == 0)
        {
            return ai1 == null || ai1.length == 0;
        } else
        {
            return Arrays.equals(ai, ai1);
        }
    }

    public static boolean equals(Object aobj[], Object aobj1[])
    {
        int i;
        int j;
        int i1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag2 = false;
        boolean flag3 = qw.a;
        int k;
        int l;
        if (aobj == null)
        {
            k = 0;
        } else
        {
            k = aobj.length;
        }
        if (aobj1 == null)
        {
            l = 0;
        } else
        {
            l = aobj1.length;
        }
        j = 0;
        i = 0;
_L7:
        i1 = i;
        if (i < k)
        {
            i1 = i;
            if (aobj[i] == null)
            {
                i1 = i + 1;
                i = i1;
                if (!flag3)
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
        }
        do
        {
            i = j;
            if (j >= l)
            {
                break;
            }
            i = j;
            if (aobj1[j] != null)
            {
                break;
            }
            i = j + 1;
            j = i;
        } while (!flag3);
        if (i1 >= k)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (i >= l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j == 0 || !flag) goto _L2; else goto _L1
_L1:
        flag1 = true;
_L4:
        return flag1;
_L2:
        flag1 = flag2;
        if (j != flag) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
        if (!aobj[i1].equals(aobj1[i])) goto _L4; else goto _L5
_L5:
        i1++;
        j = i + 1;
        i = i1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static int hashCode(int ai[])
    {
        if (ai == null || ai.length == 0)
        {
            return 0;
        } else
        {
            return Arrays.hashCode(ai);
        }
    }

    public static int hashCode(Object aobj[])
    {
        int i = 0;
        boolean flag = qw.a;
        int j;
        int k;
        int l;
        if (aobj == null)
        {
            k = 0;
        } else
        {
            k = aobj.length;
        }
        l = 0;
        do
        {
            j = i;
            if (l >= k)
            {
                break;
            }
            Object obj = aobj[l];
            j = i;
            if (obj != null)
            {
                j = i * 31 + obj.hashCode();
            }
            l++;
            i = j;
        } while (!flag);
        return j;
    }

}
