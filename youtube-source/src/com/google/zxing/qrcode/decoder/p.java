// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.b;

// Referenced classes of package com.google.zxing.qrcode.decoder:
//            r, q, n, ErrorCorrectionLevel

public final class p
{

    private static final int a[] = {
        31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 0x10b78, 
        0x1145d, 0x12a17, 0x13532, 0x149a6, 0x15683, 0x168c9, 0x177ec, 0x18ec4, 0x191e1, 0x1afab, 
        0x1b08e, 0x1cc1a, 0x1d33f, 0x1ed75, 0x1f250, 0x209d5, 0x216f0, 0x228ba, 0x2379f, 0x24b0b, 
        0x2542e, 0x26a64, 0x27541, 0x28c69
    };
    private static final p b[] = f();
    private final int c;
    private final int d[];
    private final r e[];
    private final int f;

    private transient p(int i, int ai[], r ar[])
    {
        boolean flag = false;
        super();
        c = i;
        d = ai;
        e = ar;
        int l = ar[0].a();
        ai = ar[0].b();
        int i1 = ai.length;
        int j = 0;
        for (i = ((flag) ? 1 : 0); i < i1; i++)
        {
            ar = ai[i];
            int k = ar.a();
            j += (ar.b() + l) * k;
        }

        f = j;
    }

    public static p a(int i)
    {
        if (i % 4 != 1)
        {
            throw FormatException.getFormatInstance();
        }
        p p1;
        try
        {
            p1 = b(i - 17 >> 2);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw FormatException.getFormatInstance();
        }
        return p1;
    }

    public static p b(int i)
    {
        if (i <= 0 || i > 40)
        {
            throw new IllegalArgumentException();
        } else
        {
            return b[i - 1];
        }
    }

    static p c(int i)
    {
        int j = 0;
        int k = 0x7fffffff;
        int i1 = 0;
        while (j < a.length) 
        {
            int l = a[j];
            if (l == i)
            {
                return b(j + 7);
            }
            int j1 = n.a(i, l);
            l = k;
            if (j1 < k)
            {
                i1 = j + 7;
                l = j1;
            }
            j++;
            k = l;
        }
        if (k <= 3)
        {
            return b(i1);
        } else
        {
            return null;
        }
    }

    private static p[] f()
    {
        Object obj = new r(7, new q[] {
            new q(1, 19)
        });
        Object obj1 = new r(10, new q[] {
            new q(1, 16)
        });
        Object obj2 = new r(13, new q[] {
            new q(1, 13)
        });
        Object obj3 = new r(17, new q[] {
            new q(1, 9)
        });
        obj = new p(1, new int[0], new r[] {
            obj, obj1, obj2, obj3
        });
        obj1 = new r(10, new q[] {
            new q(1, 34)
        });
        obj2 = new r(16, new q[] {
            new q(1, 28)
        });
        obj3 = new r(22, new q[] {
            new q(1, 22)
        });
        Object obj4 = new r(28, new q[] {
            new q(1, 16)
        });
        obj1 = new p(2, new int[] {
            6, 18
        }, new r[] {
            obj1, obj2, obj3, obj4
        });
        obj2 = new r(15, new q[] {
            new q(1, 55)
        });
        obj3 = new r(26, new q[] {
            new q(1, 44)
        });
        obj4 = new r(18, new q[] {
            new q(2, 17)
        });
        Object obj5 = new r(22, new q[] {
            new q(2, 13)
        });
        obj2 = new p(3, new int[] {
            6, 22
        }, new r[] {
            obj2, obj3, obj4, obj5
        });
        obj3 = new r(20, new q[] {
            new q(1, 80)
        });
        obj4 = new r(18, new q[] {
            new q(2, 32)
        });
        obj5 = new r(26, new q[] {
            new q(2, 24)
        });
        Object obj6 = new r(16, new q[] {
            new q(4, 9)
        });
        obj3 = new p(4, new int[] {
            6, 26
        }, new r[] {
            obj3, obj4, obj5, obj6
        });
        obj4 = new r(26, new q[] {
            new q(1, 108)
        });
        obj5 = new r(24, new q[] {
            new q(2, 43)
        });
        obj6 = new r(18, new q[] {
            new q(2, 15), new q(2, 16)
        });
        Object obj7 = new r(22, new q[] {
            new q(2, 11), new q(2, 12)
        });
        obj4 = new p(5, new int[] {
            6, 30
        }, new r[] {
            obj4, obj5, obj6, obj7
        });
        obj5 = new r(18, new q[] {
            new q(2, 68)
        });
        obj6 = new r(16, new q[] {
            new q(4, 27)
        });
        obj7 = new r(24, new q[] {
            new q(4, 19)
        });
        Object obj8 = new r(28, new q[] {
            new q(4, 15)
        });
        obj5 = new p(6, new int[] {
            6, 34
        }, new r[] {
            obj5, obj6, obj7, obj8
        });
        obj6 = new r(20, new q[] {
            new q(2, 78)
        });
        obj7 = new r(18, new q[] {
            new q(4, 31)
        });
        obj8 = new r(18, new q[] {
            new q(2, 14), new q(4, 15)
        });
        Object obj9 = new r(26, new q[] {
            new q(4, 13), new q(1, 14)
        });
        obj6 = new p(7, new int[] {
            6, 22, 38
        }, new r[] {
            obj6, obj7, obj8, obj9
        });
        obj7 = new r(24, new q[] {
            new q(2, 97)
        });
        obj8 = new r(22, new q[] {
            new q(2, 38), new q(2, 39)
        });
        obj9 = new r(22, new q[] {
            new q(4, 18), new q(2, 19)
        });
        Object obj10 = new r(26, new q[] {
            new q(4, 14), new q(2, 15)
        });
        obj7 = new p(8, new int[] {
            6, 24, 42
        }, new r[] {
            obj7, obj8, obj9, obj10
        });
        obj8 = new r(30, new q[] {
            new q(2, 116)
        });
        obj9 = new r(22, new q[] {
            new q(3, 36), new q(2, 37)
        });
        obj10 = new r(20, new q[] {
            new q(4, 16), new q(4, 17)
        });
        Object obj11 = new r(24, new q[] {
            new q(4, 12), new q(4, 13)
        });
        obj8 = new p(9, new int[] {
            6, 26, 46
        }, new r[] {
            obj8, obj9, obj10, obj11
        });
        obj9 = new r(18, new q[] {
            new q(2, 68), new q(2, 69)
        });
        obj10 = new r(26, new q[] {
            new q(4, 43), new q(1, 44)
        });
        obj11 = new r(24, new q[] {
            new q(6, 19), new q(2, 20)
        });
        Object obj12 = new r(28, new q[] {
            new q(6, 15), new q(2, 16)
        });
        obj9 = new p(10, new int[] {
            6, 28, 50
        }, new r[] {
            obj9, obj10, obj11, obj12
        });
        obj10 = new r(20, new q[] {
            new q(4, 81)
        });
        obj11 = new r(30, new q[] {
            new q(1, 50), new q(4, 51)
        });
        obj12 = new r(28, new q[] {
            new q(4, 22), new q(4, 23)
        });
        Object obj13 = new r(24, new q[] {
            new q(3, 12), new q(8, 13)
        });
        obj10 = new p(11, new int[] {
            6, 30, 54
        }, new r[] {
            obj10, obj11, obj12, obj13
        });
        obj11 = new r(24, new q[] {
            new q(2, 92), new q(2, 93)
        });
        obj12 = new r(22, new q[] {
            new q(6, 36), new q(2, 37)
        });
        obj13 = new r(26, new q[] {
            new q(4, 20), new q(6, 21)
        });
        Object obj14 = new r(28, new q[] {
            new q(7, 14), new q(4, 15)
        });
        obj11 = new p(12, new int[] {
            6, 32, 58
        }, new r[] {
            obj11, obj12, obj13, obj14
        });
        obj12 = new r(26, new q[] {
            new q(4, 107)
        });
        obj13 = new r(22, new q[] {
            new q(8, 37), new q(1, 38)
        });
        obj14 = new r(24, new q[] {
            new q(8, 20), new q(4, 21)
        });
        Object obj15 = new r(22, new q[] {
            new q(12, 11), new q(4, 12)
        });
        obj12 = new p(13, new int[] {
            6, 34, 62
        }, new r[] {
            obj12, obj13, obj14, obj15
        });
        obj13 = new r(30, new q[] {
            new q(3, 115), new q(1, 116)
        });
        obj14 = new r(24, new q[] {
            new q(4, 40), new q(5, 41)
        });
        obj15 = new r(20, new q[] {
            new q(11, 16), new q(5, 17)
        });
        Object obj16 = new r(24, new q[] {
            new q(11, 12), new q(5, 13)
        });
        obj13 = new p(14, new int[] {
            6, 26, 46, 66
        }, new r[] {
            obj13, obj14, obj15, obj16
        });
        obj14 = new r(22, new q[] {
            new q(5, 87), new q(1, 88)
        });
        obj15 = new r(24, new q[] {
            new q(5, 41), new q(5, 42)
        });
        obj16 = new r(30, new q[] {
            new q(5, 24), new q(7, 25)
        });
        Object obj17 = new r(24, new q[] {
            new q(11, 12), new q(7, 13)
        });
        obj14 = new p(15, new int[] {
            6, 26, 48, 70
        }, new r[] {
            obj14, obj15, obj16, obj17
        });
        obj15 = new r(24, new q[] {
            new q(5, 98), new q(1, 99)
        });
        obj16 = new r(28, new q[] {
            new q(7, 45), new q(3, 46)
        });
        obj17 = new r(24, new q[] {
            new q(15, 19), new q(2, 20)
        });
        Object obj18 = new r(30, new q[] {
            new q(3, 15), new q(13, 16)
        });
        obj15 = new p(16, new int[] {
            6, 26, 50, 74
        }, new r[] {
            obj15, obj16, obj17, obj18
        });
        obj16 = new r(28, new q[] {
            new q(1, 107), new q(5, 108)
        });
        obj17 = new r(28, new q[] {
            new q(10, 46), new q(1, 47)
        });
        obj18 = new r(28, new q[] {
            new q(1, 22), new q(15, 23)
        });
        Object obj19 = new r(28, new q[] {
            new q(2, 14), new q(17, 15)
        });
        obj16 = new p(17, new int[] {
            6, 30, 54, 78
        }, new r[] {
            obj16, obj17, obj18, obj19
        });
        obj17 = new r(30, new q[] {
            new q(5, 120), new q(1, 121)
        });
        obj18 = new r(26, new q[] {
            new q(9, 43), new q(4, 44)
        });
        obj19 = new r(28, new q[] {
            new q(17, 22), new q(1, 23)
        });
        Object obj20 = new r(28, new q[] {
            new q(2, 14), new q(19, 15)
        });
        obj17 = new p(18, new int[] {
            6, 30, 56, 82
        }, new r[] {
            obj17, obj18, obj19, obj20
        });
        obj18 = new r(28, new q[] {
            new q(3, 113), new q(4, 114)
        });
        obj19 = new r(26, new q[] {
            new q(3, 44), new q(11, 45)
        });
        obj20 = new r(26, new q[] {
            new q(17, 21), new q(4, 22)
        });
        Object obj21 = new r(26, new q[] {
            new q(9, 13), new q(16, 14)
        });
        obj18 = new p(19, new int[] {
            6, 30, 58, 86
        }, new r[] {
            obj18, obj19, obj20, obj21
        });
        obj19 = new r(28, new q[] {
            new q(3, 107), new q(5, 108)
        });
        obj20 = new r(26, new q[] {
            new q(3, 41), new q(13, 42)
        });
        obj21 = new r(30, new q[] {
            new q(15, 24), new q(5, 25)
        });
        Object obj22 = new r(28, new q[] {
            new q(15, 15), new q(10, 16)
        });
        obj19 = new p(20, new int[] {
            6, 34, 62, 90
        }, new r[] {
            obj19, obj20, obj21, obj22
        });
        obj20 = new r(28, new q[] {
            new q(4, 116), new q(4, 117)
        });
        obj21 = new r(26, new q[] {
            new q(17, 42)
        });
        obj22 = new r(28, new q[] {
            new q(17, 22), new q(6, 23)
        });
        Object obj23 = new r(30, new q[] {
            new q(19, 16), new q(6, 17)
        });
        obj20 = new p(21, new int[] {
            6, 28, 50, 72, 94
        }, new r[] {
            obj20, obj21, obj22, obj23
        });
        obj21 = new r(28, new q[] {
            new q(2, 111), new q(7, 112)
        });
        obj22 = new r(28, new q[] {
            new q(17, 46)
        });
        obj23 = new r(30, new q[] {
            new q(7, 24), new q(16, 25)
        });
        Object obj24 = new r(24, new q[] {
            new q(34, 13)
        });
        obj21 = new p(22, new int[] {
            6, 26, 50, 74, 98
        }, new r[] {
            obj21, obj22, obj23, obj24
        });
        obj22 = new r(30, new q[] {
            new q(4, 121), new q(5, 122)
        });
        obj23 = new r(28, new q[] {
            new q(4, 47), new q(14, 48)
        });
        obj24 = new r(30, new q[] {
            new q(11, 24), new q(14, 25)
        });
        Object obj25 = new r(30, new q[] {
            new q(16, 15), new q(14, 16)
        });
        obj22 = new p(23, new int[] {
            6, 30, 54, 78, 102
        }, new r[] {
            obj22, obj23, obj24, obj25
        });
        obj23 = new r(30, new q[] {
            new q(6, 117), new q(4, 118)
        });
        obj24 = new r(28, new q[] {
            new q(6, 45), new q(14, 46)
        });
        obj25 = new r(30, new q[] {
            new q(11, 24), new q(16, 25)
        });
        Object obj26 = new r(30, new q[] {
            new q(30, 16), new q(2, 17)
        });
        obj23 = new p(24, new int[] {
            6, 28, 54, 80, 106
        }, new r[] {
            obj23, obj24, obj25, obj26
        });
        obj24 = new r(26, new q[] {
            new q(8, 106), new q(4, 107)
        });
        obj25 = new r(28, new q[] {
            new q(8, 47), new q(13, 48)
        });
        obj26 = new r(30, new q[] {
            new q(7, 24), new q(22, 25)
        });
        Object obj27 = new r(30, new q[] {
            new q(22, 15), new q(13, 16)
        });
        obj24 = new p(25, new int[] {
            6, 32, 58, 84, 110
        }, new r[] {
            obj24, obj25, obj26, obj27
        });
        obj25 = new r(28, new q[] {
            new q(10, 114), new q(2, 115)
        });
        obj26 = new r(28, new q[] {
            new q(19, 46), new q(4, 47)
        });
        obj27 = new r(28, new q[] {
            new q(28, 22), new q(6, 23)
        });
        Object obj28 = new r(30, new q[] {
            new q(33, 16), new q(4, 17)
        });
        obj25 = new p(26, new int[] {
            6, 30, 58, 86, 114
        }, new r[] {
            obj25, obj26, obj27, obj28
        });
        obj26 = new r(30, new q[] {
            new q(8, 122), new q(4, 123)
        });
        obj27 = new r(28, new q[] {
            new q(22, 45), new q(3, 46)
        });
        obj28 = new r(30, new q[] {
            new q(8, 23), new q(26, 24)
        });
        Object obj29 = new r(30, new q[] {
            new q(12, 15), new q(28, 16)
        });
        obj26 = new p(27, new int[] {
            6, 34, 62, 90, 118
        }, new r[] {
            obj26, obj27, obj28, obj29
        });
        obj27 = new r(30, new q[] {
            new q(3, 117), new q(10, 118)
        });
        obj28 = new r(28, new q[] {
            new q(3, 45), new q(23, 46)
        });
        obj29 = new r(30, new q[] {
            new q(4, 24), new q(31, 25)
        });
        Object obj30 = new r(30, new q[] {
            new q(11, 15), new q(31, 16)
        });
        obj27 = new p(28, new int[] {
            6, 26, 50, 74, 98, 122
        }, new r[] {
            obj27, obj28, obj29, obj30
        });
        obj28 = new r(30, new q[] {
            new q(7, 116), new q(7, 117)
        });
        obj29 = new r(28, new q[] {
            new q(21, 45), new q(7, 46)
        });
        obj30 = new r(30, new q[] {
            new q(1, 23), new q(37, 24)
        });
        Object obj31 = new r(30, new q[] {
            new q(19, 15), new q(26, 16)
        });
        obj28 = new p(29, new int[] {
            6, 30, 54, 78, 102, 126
        }, new r[] {
            obj28, obj29, obj30, obj31
        });
        obj29 = new r(30, new q[] {
            new q(5, 115), new q(10, 116)
        });
        obj30 = new r(28, new q[] {
            new q(19, 47), new q(10, 48)
        });
        obj31 = new r(30, new q[] {
            new q(15, 24), new q(25, 25)
        });
        Object obj32 = new r(30, new q[] {
            new q(23, 15), new q(25, 16)
        });
        obj29 = new p(30, new int[] {
            6, 26, 52, 78, 104, 130
        }, new r[] {
            obj29, obj30, obj31, obj32
        });
        obj30 = new r(30, new q[] {
            new q(13, 115), new q(3, 116)
        });
        obj31 = new r(28, new q[] {
            new q(2, 46), new q(29, 47)
        });
        obj32 = new r(30, new q[] {
            new q(42, 24), new q(1, 25)
        });
        Object obj33 = new r(30, new q[] {
            new q(23, 15), new q(28, 16)
        });
        obj30 = new p(31, new int[] {
            6, 30, 56, 82, 108, 134
        }, new r[] {
            obj30, obj31, obj32, obj33
        });
        obj31 = new r(30, new q[] {
            new q(17, 115)
        });
        obj32 = new r(28, new q[] {
            new q(10, 46), new q(23, 47)
        });
        obj33 = new r(30, new q[] {
            new q(10, 24), new q(35, 25)
        });
        Object obj34 = new r(30, new q[] {
            new q(19, 15), new q(35, 16)
        });
        obj31 = new p(32, new int[] {
            6, 34, 60, 86, 112, 138
        }, new r[] {
            obj31, obj32, obj33, obj34
        });
        obj32 = new r(30, new q[] {
            new q(17, 115), new q(1, 116)
        });
        obj33 = new r(28, new q[] {
            new q(14, 46), new q(21, 47)
        });
        obj34 = new r(30, new q[] {
            new q(29, 24), new q(19, 25)
        });
        Object obj35 = new r(30, new q[] {
            new q(11, 15), new q(46, 16)
        });
        obj32 = new p(33, new int[] {
            6, 30, 58, 86, 114, 142
        }, new r[] {
            obj32, obj33, obj34, obj35
        });
        obj33 = new r(30, new q[] {
            new q(13, 115), new q(6, 116)
        });
        obj34 = new r(28, new q[] {
            new q(14, 46), new q(23, 47)
        });
        obj35 = new r(30, new q[] {
            new q(44, 24), new q(7, 25)
        });
        Object obj36 = new r(30, new q[] {
            new q(59, 16), new q(1, 17)
        });
        obj33 = new p(34, new int[] {
            6, 34, 62, 90, 118, 146
        }, new r[] {
            obj33, obj34, obj35, obj36
        });
        obj34 = new r(30, new q[] {
            new q(12, 121), new q(7, 122)
        });
        obj35 = new r(28, new q[] {
            new q(12, 47), new q(26, 48)
        });
        obj36 = new r(30, new q[] {
            new q(39, 24), new q(14, 25)
        });
        Object obj37 = new r(30, new q[] {
            new q(22, 15), new q(41, 16)
        });
        obj34 = new p(35, new int[] {
            6, 30, 54, 78, 102, 126, 150
        }, new r[] {
            obj34, obj35, obj36, obj37
        });
        obj35 = new r(30, new q[] {
            new q(6, 121), new q(14, 122)
        });
        obj36 = new r(28, new q[] {
            new q(6, 47), new q(34, 48)
        });
        obj37 = new r(30, new q[] {
            new q(46, 24), new q(10, 25)
        });
        Object obj38 = new r(30, new q[] {
            new q(2, 15), new q(64, 16)
        });
        obj35 = new p(36, new int[] {
            6, 24, 50, 76, 102, 128, 154
        }, new r[] {
            obj35, obj36, obj37, obj38
        });
        obj36 = new r(30, new q[] {
            new q(17, 122), new q(4, 123)
        });
        obj37 = new r(28, new q[] {
            new q(29, 46), new q(14, 47)
        });
        obj38 = new r(30, new q[] {
            new q(49, 24), new q(10, 25)
        });
        r r1 = new r(30, new q[] {
            new q(24, 15), new q(46, 16)
        });
        obj36 = new p(37, new int[] {
            6, 28, 54, 80, 106, 132, 158
        }, new r[] {
            obj36, obj37, obj38, r1
        });
        obj37 = new r(30, new q[] {
            new q(4, 122), new q(18, 123)
        });
        obj38 = new r(28, new q[] {
            new q(13, 46), new q(32, 47)
        });
        r1 = new r(30, new q[] {
            new q(48, 24), new q(14, 25)
        });
        r r2 = new r(30, new q[] {
            new q(42, 15), new q(32, 16)
        });
        obj37 = new p(38, new int[] {
            6, 32, 58, 84, 110, 136, 162
        }, new r[] {
            obj37, obj38, r1, r2
        });
        obj38 = new r(30, new q[] {
            new q(20, 117), new q(4, 118)
        });
        r1 = new r(28, new q[] {
            new q(40, 47), new q(7, 48)
        });
        r2 = new r(30, new q[] {
            new q(43, 24), new q(22, 25)
        });
        r r3 = new r(30, new q[] {
            new q(10, 15), new q(67, 16)
        });
        obj38 = new p(39, new int[] {
            6, 26, 54, 82, 110, 138, 166
        }, new r[] {
            obj38, r1, r2, r3
        });
        r1 = new r(30, new q[] {
            new q(19, 118), new q(6, 119)
        });
        r2 = new r(28, new q[] {
            new q(18, 47), new q(31, 48)
        });
        r3 = new r(30, new q[] {
            new q(34, 24), new q(34, 25)
        });
        r r4 = new r(30, new q[] {
            new q(20, 15), new q(61, 16)
        });
        return (new p[] {
            obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, 
            obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, 
            obj20, obj21, obj22, obj23, obj24, obj25, obj26, obj27, obj28, obj29, 
            obj30, obj31, obj32, obj33, obj34, obj35, obj36, obj37, obj38, new p(40, new int[] {
                6, 30, 58, 86, 114, 142, 170
            }, new r[] {
                r1, r2, r3, r4
            })
        });
    }

    public final int a()
    {
        return c;
    }

    public final r a(ErrorCorrectionLevel errorcorrectionlevel)
    {
        return e[errorcorrectionlevel.ordinal()];
    }

    public final int[] b()
    {
        return d;
    }

    public final int c()
    {
        return f;
    }

    public final int d()
    {
        return c * 4 + 17;
    }

    final b e()
    {
        int k = d();
        b b1 = new b(k);
        b1.a(0, 0, 9, 9);
        b1.a(k - 8, 0, 8, 9);
        b1.a(0, k - 8, 9, 8);
        int l = d.length;
        for (int i = 0; i < l; i++)
        {
            int i1 = d[i];
            for (int j = 0; j < l; j++)
            {
                if ((i != 0 || j != 0 && j != l - 1) && (i != l - 1 || j != 0))
                {
                    b1.a(d[j] - 2, i1 - 2, 5, 5);
                }
            }

        }

        b1.a(6, 9, 1, k - 17);
        b1.a(9, 6, k - 17, 1);
        if (c > 6)
        {
            b1.a(k - 11, 0, 3, 6);
            b1.a(0, k - 11, 6, 3);
        }
        return b1;
    }

    public final String toString()
    {
        return String.valueOf(c);
    }

}
