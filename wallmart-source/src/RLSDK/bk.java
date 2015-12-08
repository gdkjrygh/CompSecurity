// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.util.Hashtable;

// Referenced classes of package RLSDK:
//            bu, y, aj, ad, 
//            q, ab

public final class bk extends bu
{

    private static final char a[] = "0123456789-$:/.+ABCDTN".toCharArray();
    private static final int b[] = {
        3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 
        12, 24, 69, 81, 84, 21, 26, 41, 11, 14, 
        26, 41
    };
    private static final char c[] = {
        'E', '*', 'A', 'B', 'C', 'D', 'T', 'N'
    };

    public bk()
    {
    }

    private static char a(int ai[])
    {
        int k2 = ai.length;
        int j = 0x7fffffff;
        int l = 0;
        int i = 0;
        int k;
        do
        {
            k = i;
            if (l >= k2)
            {
                break;
            }
            k = j;
            if (ai[l] < j)
            {
                k = ai[l];
            }
            int k1 = i;
            if (ai[l] > i)
            {
                k1 = ai[l];
            }
            l++;
            j = k;
            i = k1;
        } while (true);
        do
        {
            int i1 = 0;
            i = 0;
            int l1;
            int i2;
            for (l1 = 0; i1 < k2; l1 = i2)
            {
                int j2 = i;
                i2 = l1;
                if (ai[i1] > k)
                {
                    j2 = i | 1 << k2 - 1 - i1;
                    i2 = l1 + 1;
                }
                i1++;
                i = j2;
            }

            if (l1 == 2 || l1 == 3)
            {
                for (int j1 = 0; j1 < b.length; j1++)
                {
                    if (b[j1] == i)
                    {
                        return a[j1];
                    }
                }

            }
            i = k - 1;
            k = i;
        } while (i > j);
        return '!';
    }

    private static boolean a(char ac[], char c1)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        flag = flag1;
        if (ac == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L7:
        flag = flag1;
        if (i >= ac.length) goto _L2; else goto _L3
_L3:
        if (ac[i] != c1) goto _L5; else goto _L4
_L4:
        flag = true;
_L2:
        return flag;
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static int[] a(aj aj1)
        throws y
    {
        int ai[];
        int i;
        boolean flag;
        int j;
        int k;
        int i1;
        int j1;
        i1 = aj1.b;
        for (i = 0; i < i1 && !aj1.a(i); i++) { }
        ai = new int[7];
        j1 = ai.length;
        flag = false;
        j = 0;
        k = i;
_L2:
        if (k >= i1)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        if (!(aj1.a(k) ^ flag))
        {
            break; /* Loop/switch isn't completed */
        }
        ai[j] = ai[j] + 1;
_L3:
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        if (j != j1 - 1)
        {
            break MISSING_BLOCK_LABEL_212;
        }
label0:
        {
            if (a(c, a(ai)) && aj1.a(Math.max(0, i - (k - i) / 2), i))
            {
                return (new int[] {
                    i, k
                });
            }
            break label0;
        }
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        int l = i + (ai[0] + ai[1]);
        for (i = 2; i < j1; i++)
        {
            ai[i - 2] = ai[i];
        }

        ai[j1 - 2] = 0;
        ai[j1 - 1] = 0;
        j--;
        i = l;
_L4:
        ai[j] = 1;
        flag ^= true;
          goto _L3
        j++;
          goto _L4
        throw y.a();
          goto _L3
    }

    public final ab a(int i, aj aj1, Hashtable hashtable)
        throws y
    {
        hashtable = a(aj1);
        hashtable[1] = 0;
        int j = hashtable[1];
        int i2;
        for (i2 = aj1.b; j < i2 && !aj1.a(j); j++) { }
        Object obj = new StringBuffer();
        do
        {
            int ai[] = new int[7];
            int[] _tmp = ai;
            ai[0] = 0;
            ai[1] = 0;
            ai[2] = 0;
            ai[3] = 0;
            ai[4] = 0;
            ai[5] = 0;
            ai[6] = 0;
            a(aj1, j, ai);
            char c1 = a(ai);
            if (c1 == '!')
            {
                throw y.a();
            }
            ((StringBuffer) (obj)).append(c1);
            int l = 0;
            int k = j;
            for (; l < ai.length; l++)
            {
                k += ai[l];
            }

            for (; k < i2 && !aj1.a(k); k++) { }
            if (k >= i2)
            {
                int k1 = 0;
                for (int i1 = 0; i1 < ai.length; i1++)
                {
                    k1 += ai[i1];
                }

                if (k != i2 && (k - j - k1) / 2 < k1)
                {
                    throw y.a();
                }
                if (((StringBuffer) (obj)).length() < 2)
                {
                    throw y.a();
                }
                char c2 = ((StringBuffer) (obj)).charAt(0);
                if (!a(c, c2))
                {
                    throw y.a();
                }
                int l1;
                for (int j1 = 1; j1 < ((StringBuffer) (obj)).length(); j1 = l1 + 1)
                {
                    l1 = j1;
                    if (((StringBuffer) (obj)).charAt(j1) != c2)
                    {
                        continue;
                    }
                    l1 = j1;
                    if (j1 + 1 != ((StringBuffer) (obj)).length())
                    {
                        ((StringBuffer) (obj)).delete(j1 + 1, ((StringBuffer) (obj)).length() - 1);
                        l1 = ((StringBuffer) (obj)).length();
                    }
                }

                if (((StringBuffer) (obj)).length() > 6)
                {
                    ((StringBuffer) (obj)).deleteCharAt(((StringBuffer) (obj)).length() - 1);
                    ((StringBuffer) (obj)).deleteCharAt(0);
                    float f = (float)(hashtable[1] + hashtable[0]) / 2.0F;
                    float f1 = (float)(j + k) / 2.0F;
                    aj1 = ((StringBuffer) (obj)).toString();
                    hashtable = new ad(f, i);
                    obj = new ad(f1, i);
                    q q1 = q.b;
                    return new ab(aj1, null, new ad[] {
                        hashtable, obj
                    }, q1);
                } else
                {
                    throw y.a();
                }
            }
            j = k;
        } while (true);
    }

}
