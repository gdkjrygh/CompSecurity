// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.common.a;

// Referenced classes of package com.google.zxing.oned.rss.expanded.decoders:
//            CurrentParsingState, o, n, l, 
//            m, q

final class r
{

    private final a a;
    private final CurrentParsingState b = new CurrentParsingState();
    private final StringBuilder c = new StringBuilder();

    r(a a1)
    {
        a = a1;
    }

    static int a(a a1, int i, int j)
    {
        int i1 = 0;
        if (j > 32)
        {
            throw new IllegalArgumentException("extractNumberValueFromBitArray can't handle more than 32 bits");
        }
        for (int k = 0; k < j;)
        {
            int j1 = i1;
            if (a1.a(i + k))
            {
                j1 = i1 | 1 << j - k - 1;
            }
            k++;
            i1 = j1;
        }

        return i1;
    }

    private l a()
    {
_L6:
        int j = b.a();
        if (j + 7 <= a.a()) goto _L2; else goto _L1
_L1:
        Object obj;
        int i;
        boolean flag;
        if (j + 4 <= a.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L3:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        i = b.a();
        if (i + 7 > a.a())
        {
            i = a(i, 4);
            if (i == 0)
            {
                obj = new o(a.a(), 10, 10);
            } else
            {
                obj = new o(a.a(), i - 1, 10);
            }
        } else
        {
            j = a(i, 7);
            obj = new o(i + 7, (j - 8) / 11, (j - 8) % 11);
        }
        b.a(((o) (obj)).e());
        if (((o) (obj)).c())
        {
            if (((o) (obj)).d())
            {
                obj = new n(b.a(), c.toString());
            } else
            {
                obj = new n(b.a(), c.toString(), ((o) (obj)).b());
            }
            return new l(((n) (obj)), true);
        }
        break MISSING_BLOCK_LABEL_295;
_L2:
        i = j;
_L4:
label0:
        {
            if (i >= j + 3)
            {
                break MISSING_BLOCK_LABEL_191;
            }
            if (!a.a(i))
            {
                break label0;
            }
            flag = true;
        }
          goto _L3
        i++;
          goto _L4
        flag = a.a(j + 3);
          goto _L3
        c.append(((o) (obj)).a());
        if (((o) (obj)).d())
        {
            return new l(new n(b.a(), c.toString()), true);
        }
        c.append(((o) (obj)).b());
        if (true) goto _L6; else goto _L5
_L5:
        j = b.a();
        if (j + 1 <= a.a()) goto _L8; else goto _L7
_L7:
        i = 0;
_L10:
        if (i != 0)
        {
            b.e();
            b.b(4);
        }
        return new l(false);
_L8:
        i = 0;
        do
        {
            if (i >= 4 || i + j >= a.a())
            {
                break;
            }
            if (a.a(j + i))
            {
                i = 0;
                continue; /* Loop/switch isn't completed */
            }
            i++;
        } while (true);
        i = 1;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private boolean a(int i)
    {
        if (i + 1 <= a.a()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = 0;
_L6:
        if (j >= 5 || j + i >= a.a())
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (j != 2) goto _L4; else goto _L3
_L3:
        if (!a.a(i + 2)) goto _L1; else goto _L5
_L5:
        j++;
          goto _L6
_L4:
        if (!a.a(i + j)) goto _L5; else goto _L7
_L7:
        return false;
        return true;
    }

    private l b()
    {
_L34:
        int i = b.a();
        if (i + 5 > a.a()) goto _L2; else goto _L1
_L1:
        int j = a(i, 5);
        if (j < 5 || j >= 16) goto _L4; else goto _L3
_L3:
        i = 1;
_L6:
        m m1;
        if (i == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i = b.a();
        j = a(i, 5);
        if (j == 15)
        {
            m1 = new m(i + 5, '$');
        } else
        if (j >= 5 && j < 15)
        {
            m1 = new m(i + 5, (char)((j + 48) - 5));
        } else
        {
            j = a(i, 7);
            if (j >= 64 && j < 90)
            {
                m1 = new m(i + 7, (char)(j + 1));
            } else
            {
label0:
                {
                    if (j < 90 || j >= 116)
                    {
                        break label0;
                    }
                    m1 = new m(i + 7, (char)(j + 7));
                }
            }
        }
_L31:
        b.a(m1.e());
        if (m1.b())
        {
            return new l(new n(b.a(), c.toString()), true);
        }
        break MISSING_BLOCK_LABEL_608;
_L4:
        if (i + 7 > a.a()) goto _L2; else goto _L5
_L5:
label1:
        {
            j = a(i, 7);
            if (j < 64 || j >= 116)
            {
                break label1;
            }
            i = 1;
        }
          goto _L6
        if (i + 8 > a.a()) goto _L2; else goto _L7
_L7:
        i = a(i, 8);
        if (i < 232 || i >= 253) goto _L2; else goto _L8
_L8:
        i = 1;
          goto _L6
_L2:
        i = 0;
          goto _L6
        j = a(i, 8);
        j;
        JVM INSTR tableswitch 232 252: default 444
    //                   232 469
    //                   233 488
    //                   234 494
    //                   235 500
    //                   236 506
    //                   237 512
    //                   238 518
    //                   239 524
    //                   240 530
    //                   241 536
    //                   242 542
    //                   243 548
    //                   244 554
    //                   245 560
    //                   246 566
    //                   247 572
    //                   248 578
    //                   249 584
    //                   250 590
    //                   251 596
    //                   252 602;
           goto _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30
_L30:
        break MISSING_BLOCK_LABEL_602;
_L9:
        throw new IllegalArgumentException((new StringBuilder("Decoding invalid ISO/IEC 646 value: ")).append(j).toString());
_L10:
        char c1 = '!';
_L32:
        m1 = new m(i + 8, c1);
          goto _L31
_L11:
        c1 = '"';
          goto _L32
_L12:
        c1 = '%';
          goto _L32
_L13:
        c1 = '&';
          goto _L32
_L14:
        c1 = '\'';
          goto _L32
_L15:
        c1 = '(';
          goto _L32
_L16:
        c1 = ')';
          goto _L32
_L17:
        c1 = '*';
          goto _L32
_L18:
        c1 = '+';
          goto _L32
_L19:
        c1 = ',';
          goto _L32
_L20:
        c1 = '-';
          goto _L32
_L21:
        c1 = '.';
          goto _L32
_L22:
        c1 = '/';
          goto _L32
_L23:
        c1 = ':';
          goto _L32
_L24:
        c1 = ';';
          goto _L32
_L25:
        c1 = '<';
          goto _L32
_L26:
        c1 = '=';
          goto _L32
_L27:
        c1 = '>';
          goto _L32
_L28:
        c1 = '?';
          goto _L32
_L29:
        c1 = '_';
          goto _L32
        c1 = ' ';
          goto _L32
        c.append(m1.a());
        if (true) goto _L34; else goto _L33
_L33:
        if (!b(b.a())) goto _L36; else goto _L35
_L35:
        b.b(3);
        b.d();
_L38:
        return new l(false);
_L36:
        if (a(b.a()))
        {
            if (b.a() + 5 < a.a())
            {
                b.b(5);
            } else
            {
                b.a(a.a());
            }
            b.e();
        }
        if (true) goto _L38; else goto _L37
_L37:
    }

    private boolean b(int i)
    {
        if (i + 3 <= a.a()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j = i;
label0:
        do
        {
label1:
            {
                if (j >= i + 3)
                {
                    break label1;
                }
                if (a.a(j))
                {
                    break label0;
                }
                j++;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
        return true;
    }

    final int a(int i, int j)
    {
        return a(a, i, j);
    }

    final n a(int i, String s)
    {
        c.setLength(0);
        if (s != null)
        {
            c.append(s);
        }
        b.a(i);
_L9:
        int j;
        j = b.a();
        if (!b.b())
        {
            break MISSING_BLOCK_LABEL_608;
        }
_L21:
        i = b.a();
        if (i + 5 > a.a()) goto _L2; else goto _L1
_L1:
        int k = a(i, 5);
        if (k < 5 || k >= 16) goto _L4; else goto _L3
_L3:
        i = 1;
_L12:
        if (i == 0) goto _L6; else goto _L5
_L5:
        boolean flag;
        i = b.a();
        int i1 = a(i, 5);
        if (i1 == 15)
        {
            s = new m(i + 5, '$');
        } else
        if (i1 >= 5 && i1 < 15)
        {
            s = new m(i + 5, (char)((i1 + 48) - 5));
        } else
        {
label0:
            {
                j1 = a(i, 6);
                if (j1 < 32 || j1 >= 58)
                {
                    break label0;
                }
                s = new m(i + 6, (char)(j1 + 33));
            }
        }
_L19:
        b.a(s.e());
        if (!s.b()) goto _L8; else goto _L7
_L7:
        s = new l(new n(b.a(), c.toString()), true);
_L22:
        flag = s.b();
_L23:
        if (j != b.a())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0 && !flag || flag)
        {
            s = s.a();
            char c1;
            int j1;
            if (s != null && s.b())
            {
                return new n(b.a(), c.toString(), s.c());
            } else
            {
                return new n(b.a(), c.toString());
            }
        }
          goto _L9
_L4:
        if (i + 6 > a.a()) goto _L2; else goto _L10
_L10:
        i = a(i, 6);
        if (i < 16 || i >= 63) goto _L2; else goto _L11
_L11:
        i = 1;
          goto _L12
_L2:
        i = 0;
          goto _L12
        j1;
        JVM INSTR tableswitch 58 62: default 416
    //                   58 441
    //                   59 460
    //                   60 466
    //                   61 472
    //                   62 478;
           goto _L13 _L14 _L15 _L16 _L17 _L18
_L18:
        break MISSING_BLOCK_LABEL_478;
_L13:
        throw new IllegalStateException((new StringBuilder("Decoding invalid alphanumeric value: ")).append(j1).toString());
_L14:
        c1 = '*';
_L20:
        s = new m(i + 6, c1);
          goto _L19
_L15:
        c1 = ',';
          goto _L20
_L16:
        c1 = '-';
          goto _L20
_L17:
        c1 = '.';
          goto _L20
        c1 = '/';
          goto _L20
_L8:
        c.append(s.a());
          goto _L21
_L6:
        if (b(b.a()))
        {
            b.b(3);
            b.d();
        } else
        if (a(b.a()))
        {
            if (b.a() + 5 < a.a())
            {
                b.b(5);
            } else
            {
                b.a(a.a());
            }
            b.f();
        }
        s = new l(false);
          goto _L22
        if (b.c())
        {
            s = b();
            flag = s.b();
        } else
        {
            s = a();
            flag = s.b();
        }
          goto _L23
    }

    final String a(StringBuilder stringbuilder, int i)
    {
        String s = null;
        do
        {
            n n1 = a(i, s);
            s = com.google.zxing.oned.rss.expanded.decoders.q.a(n1.a());
            if (s != null)
            {
                stringbuilder.append(s);
            }
            if (n1.b())
            {
                s = String.valueOf(n1.c());
            } else
            {
                s = null;
            }
            if (i != n1.e())
            {
                i = n1.e();
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }
}
