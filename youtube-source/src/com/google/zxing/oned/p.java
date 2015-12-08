// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.a;
import com.google.zxing.f;
import com.google.zxing.g;
import com.google.zxing.h;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.zxing.oned:
//            k, o, g

public abstract class p extends k
{

    static final int b[] = {
        1, 1, 1
    };
    static final int c[] = {
        1, 1, 1, 1, 1
    };
    static final int d[][];
    static final int e[][];
    private final StringBuilder a = new StringBuilder(20);
    private final o f = new o();
    private final com.google.zxing.oned.g g = new com.google.zxing.oned.g();

    protected p()
    {
    }

    static int a(a a1, int ai[], int i, int ai1[][])
    {
        a(a1, i, ai);
        int j = 122;
        int l = -1;
        int j1 = ai1.length;
        for (i = 0; i < j1; i++)
        {
            int i1 = a(ai, ai1[i], 179);
            if (i1 < j)
            {
                l = i;
                j = i1;
            }
        }

        if (l >= 0)
        {
            return l;
        } else
        {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    static int[] a(a a1)
    {
        int ai2[] = new int[b.length];
        int i = 0;
        int ai[] = null;
        boolean flag = false;
        do
        {
            if (flag)
            {
                break;
            }
            Arrays.fill(ai2, 0, b.length, 0);
            int ai1[] = a(a1, i, false, b, ai2);
            int l = ai1[0];
            int j = ai1[1];
            int i1 = l - (j - l);
            i = j;
            ai = ai1;
            if (i1 >= 0)
            {
                flag = a1.a(i1, l, false);
                i = j;
                ai = ai1;
            }
        } while (true);
        return ai;
    }

    static int[] a(a a1, int i, boolean flag, int ai[])
    {
        return a(a1, i, flag, ai, new int[ai.length]);
    }

    private static int[] a(a a1, int i, boolean flag, int ai[], int ai1[])
    {
        int j1 = ai.length;
        int k1 = a1.a();
        int j;
        int l;
        if (flag)
        {
            i = a1.d(i);
        } else
        {
            i = a1.c(i);
        }
        j = 0;
        l = i;
        while (l < k1) 
        {
            int i1;
            if (a1.a(l) ^ flag)
            {
                ai1[j] = ai1[j] + 1;
                i1 = j;
                j = i;
            } else
            {
                if (j == j1 - 1)
                {
                    if (a(ai1, ai, 179) < 122)
                    {
                        return (new int[] {
                            i, l
                        });
                    }
                    i1 = i + (ai1[0] + ai1[1]);
                    System.arraycopy(ai1, 2, ai1, 0, j1 - 2);
                    ai1[j1 - 2] = 0;
                    ai1[j1 - 1] = 0;
                    i = j - 1;
                    j = i1;
                } else
                {
                    i1 = j + 1;
                    j = i;
                    i = i1;
                }
                ai1[i] = 1;
                if (!flag)
                {
                    flag = true;
                    i1 = i;
                } else
                {
                    flag = false;
                    i1 = i;
                }
            }
            l++;
            i = j;
            j = i1;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    protected abstract int a(a a1, int ai[], StringBuilder stringbuilder);

    public f a(int i, a a1, Map map)
    {
        return a(i, a1, a(a1), map);
    }

    public f a(int i, a a1, int ai[], Map map)
    {
        int ai1[];
        Object obj;
        int j;
        int l;
        if (map == null)
        {
            map = null;
        } else
        {
            map = (h)map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        }
        if (map != null)
        {
            map.a(new g((float)(ai[0] + ai[1]) / 2.0F, i));
        }
        obj = a;
        ((StringBuilder) (obj)).setLength(0);
        j = a(a1, ai, ((StringBuilder) (obj)));
        if (map != null)
        {
            map.a(new g(j, i));
        }
        ai1 = a(a1, j);
        if (map != null)
        {
            map.a(new g((float)(ai1[0] + ai1[1]) / 2.0F, i));
        }
        j = ai1[1];
        l = (j - ai1[0]) + j;
        if (l >= a1.a() || !a1.a(j, l, false))
        {
            throw NotFoundException.getNotFoundInstance();
        }
        map = ((StringBuilder) (obj)).toString();
        if (!a(((String) (map))))
        {
            throw ChecksumException.getChecksumInstance();
        }
        float f1 = (float)(ai[1] + ai[0]) / 2.0F;
        float f2 = (float)(ai1[1] + ai1[0]) / 2.0F;
        obj = b();
        ai = new f(map, null, new g[] {
            new g(f1, i), new g(f2, i)
        }, ((BarcodeFormat) (obj)));
        try
        {
            a1 = f.a(i, a1, ai1[1]);
            ai.a(ResultMetadataType.UPC_EAN_EXTENSION, a1.a());
            ai.a(a1.e());
            ai.a(a1.c());
        }
        // Misplaced declaration of an exception variable
        catch (a a1) { }
        if (obj == BarcodeFormat.EAN_13 || obj == BarcodeFormat.UPC_A)
        {
            a1 = g.a(map);
            if (a1 != null)
            {
                ai.a(ResultMetadataType.POSSIBLE_COUNTRY, a1);
            }
        }
        return ai;
    }

    boolean a(String s)
    {
        boolean flag1 = false;
        int i1 = s.length();
        boolean flag = flag1;
        if (i1 != 0)
        {
            int i = i1 - 2;
            int l = 0;
            for (; i >= 0; i -= 2)
            {
                int k1 = s.charAt(i) - 48;
                if (k1 < 0 || k1 > 9)
                {
                    throw FormatException.getFormatInstance();
                }
                l += k1;
            }

            l *= 3;
            for (int j = i1 - 1; j >= 0; j -= 2)
            {
                int j1 = s.charAt(j) - 48;
                if (j1 < 0 || j1 > 9)
                {
                    throw FormatException.getFormatInstance();
                }
                l += j1;
            }

            flag = flag1;
            if (l % 10 == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    int[] a(a a1, int i)
    {
        return a(a1, i, false, b);
    }

    abstract BarcodeFormat b();

    static 
    {
        int ai[] = {
            3, 2, 1, 1
        };
        int ai2[] = {
            1, 2, 3, 1
        };
        int ai4[] = {
            1, 2, 1, 3
        };
        d = (new int[][] {
            ai, new int[] {
                2, 2, 2, 1
            }, new int[] {
                2, 1, 2, 2
            }, new int[] {
                1, 4, 1, 1
            }, new int[] {
                1, 1, 3, 2
            }, ai2, new int[] {
                1, 1, 1, 4
            }, new int[] {
                1, 3, 1, 2
            }, ai4, new int[] {
                3, 1, 1, 2
            }
        });
        e = new int[20][];
        System.arraycopy(d, 0, e, 0, 10);
        for (int i = 10; i < 20; i++)
        {
            int ai1[] = d[i - 10];
            int ai3[] = new int[ai1.length];
            for (int j = 0; j < ai1.length; j++)
            {
                ai3[j] = ai1[ai1.length - j - 1];
            }

            e[i] = ai3;
        }

    }
}
