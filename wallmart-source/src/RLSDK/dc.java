// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            v, ap

final class dc
{

    private static final char a[] = {
        ';', '<', '>', '@', '[', '\\', '}', '_', '`', '~', 
        '!', '\r', '\t', ',', ':', '\n', '-', '.', '$', '/', 
        '"', '|', '*', '(', ')', '?', '{', '}', '\''
    };
    private static final char b[] = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        '&', '\r', '\t', ',', ':', '#', '-', '.', '$', '/', 
        '+', '%', '*', '=', '^'
    };
    private static final String c[] = {
        "000000000000000000000000000000000000000000001", "000000000000000000000000000000000000000000900", "000000000000000000000000000000000000000810000", "000000000000000000000000000000000000729000000", "000000000000000000000000000000000656100000000", "000000000000000000000000000000590490000000000", "000000000000000000000000000531441000000000000", "000000000000000000000000478296900000000000000", "000000000000000000000430467210000000000000000", "000000000000000000387420489000000000000000000", 
        "000000000000000348678440100000000000000000000", "000000000000313810596090000000000000000000000", "000000000282429536481000000000000000000000000", "000000254186582832900000000000000000000000000", "000228767924549610000000000000000000000000000", "205891132094649000000000000000000000000000000"
    };

    private static int a(int i, int ai[], int j, StringBuffer stringbuffer)
    {
        if (i == 901)
        {
            i = 0;
            long l1 = 0L;
            char ac[] = new char[6];
            int ai1[] = new int[6];
            int l = 0;
            int k = j;
            j = i;
            do
            {
                if (k >= ai[0] || l != 0)
                {
                    break;
                }
                i = k + 1;
                k = ai[k];
                int i1;
                int j1;
                long l2;
                if (k < 900)
                {
                    ai1[j] = k;
                    j1 = j + 1;
                    l2 = l1 * 900L + (long)k;
                    i1 = l;
                } else
                if (k == 900 || k == 901 || k == 902 || k == 924 || k == 928 || k == 923 || k == 922)
                {
                    i--;
                    i1 = 1;
                    j1 = j;
                    l2 = l1;
                } else
                {
                    i1 = l;
                    j1 = j;
                    l2 = l1;
                }
                l = i1;
                j = j1;
                l1 = l2;
                k = i;
                if (j1 % 5 == 0)
                {
                    l = i1;
                    j = j1;
                    l1 = l2;
                    k = i;
                    if (j1 > 0)
                    {
                        j = 0;
                        l1 = l2;
                        for (; j < 6; j++)
                        {
                            ac[5 - j] = (char)(int)(l1 % 256L);
                            l1 >>= 8;
                        }

                        stringbuffer.append(ac);
                        j = 0;
                        l = i1;
                        k = i;
                    }
                }
            } while (true);
            i = (j / 5) * 5;
            do
            {
                l = k;
                if (i >= j)
                {
                    break;
                }
                stringbuffer.append((char)ai1[i]);
                i++;
            } while (true);
        } else
        {
            l = j;
            if (i == 924)
            {
                k = 0;
                l1 = 0L;
                i1 = 0;
                do
                {
                    l = j;
                    if (j >= ai[0])
                    {
                        break;
                    }
                    l = j;
                    if (i1 != 0)
                    {
                        break;
                    }
                    i = j + 1;
                    j = ai[j];
                    if (j < 900)
                    {
                        j1 = k + 1;
                        l2 = l1 * 900L + (long)j;
                        l = i1;
                    } else
                    if (j == 900 || j == 901 || j == 902 || j == 924 || j == 928 || j == 923 || j == 922)
                    {
                        i--;
                        l = 1;
                        l2 = l1;
                        j1 = k;
                    } else
                    {
                        l2 = l1;
                        l = i1;
                        j1 = k;
                    }
                    l1 = l2;
                    i1 = l;
                    k = j1;
                    j = i;
                    if (j1 % 5 == 0)
                    {
                        l1 = l2;
                        i1 = l;
                        k = j1;
                        j = i;
                        if (j1 > 0)
                        {
                            ac = new char[6];
                            j = 0;
                            for (l1 = l2; j < 6; l1 >>= 8)
                            {
                                ac[5 - j] = (char)(int)(255L & l1);
                                j++;
                            }

                            stringbuffer.append(ac);
                            i1 = l;
                            k = j1;
                            j = i;
                        }
                    }
                } while (true);
            }
        }
        return l;
    }

    private static int a(int ai[], int i, StringBuffer stringbuffer)
    {
        int ai1[];
        int ai2[];
        int j;
        int k;
        int j1;
        ai1 = new int[ai[0] << 1];
        ai2 = new int[ai[0] << 1];
        j1 = 0;
        k = 0;
        j = i;
_L13:
        int l;
        int k1;
        for (i = k; j < ai[0] && i == 0;)
        {
            k = j + 1;
            j = ai[j];
            if (j < 900)
            {
                ai1[j1] = j / 30;
                ai1[j1 + 1] = j % 30;
                j1 += 2;
                j = k;
            } else
            {
                switch (j)
                {
                default:
                    j = k;
                    break;

                case 900: 
                    j = k - 1;
                    i = 1;
                    break;

                case 901: 
                    j = k - 1;
                    i = 1;
                    break;

                case 902: 
                    j = k - 1;
                    i = 1;
                    break;

                case 913: 
                    ai1[j1] = 913;
                    j = k + 1;
                    ai2[j1] = ai[k];
                    j1++;
                    break;

                case 924: 
                    j = k - 1;
                    i = 1;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
        }

        l = 0;
        k = 0;
        k1 = 0;
_L10:
        if (k1 >= j1) goto _L2; else goto _L1
_L1:
        boolean flag;
        int l1;
        l1 = ai1[k1];
        flag = false;
        l;
        JVM INSTR tableswitch 0 5: default 296
    //                   0 332
    //                   1 475
    //                   2 618
    //                   3 780
    //                   4 865
    //                   5 909;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        char c1;
        int i1;
        i = l;
        i1 = k;
        c1 = flag;
_L11:
        if (c1 != 0)
        {
            stringbuffer.append(c1);
        }
        k1++;
        k = i1;
        l = i;
          goto _L10
_L4:
        if (l1 < 26)
        {
            c1 = (char)(l1 + 65);
            i1 = k;
            i = l;
        } else
        if (l1 == 26)
        {
            c1 = ' ';
            i1 = k;
            i = l;
        } else
        if (l1 == 27)
        {
            i = 1;
            c1 = flag;
            i1 = k;
        } else
        if (l1 == 28)
        {
            i = 2;
            c1 = flag;
            i1 = k;
        } else
        if (l1 == 29)
        {
            i = 5;
            c1 = flag;
            i1 = l;
        } else
        {
            c1 = flag;
            i1 = k;
            i = l;
            if (l1 == 913)
            {
                stringbuffer.append((char)ai2[k1]);
                c1 = flag;
                i1 = k;
                i = l;
            }
        }
          goto _L11
_L5:
        if (l1 < 26)
        {
            c1 = (char)(l1 + 97);
            i1 = k;
            i = l;
        } else
        if (l1 == 26)
        {
            c1 = ' ';
            i1 = k;
            i = l;
        } else
        if (l1 == 27)
        {
            i = 4;
            c1 = flag;
            i1 = l;
        } else
        if (l1 == 28)
        {
            i = 2;
            c1 = flag;
            i1 = k;
        } else
        if (l1 == 29)
        {
            i = 5;
            c1 = flag;
            i1 = l;
        } else
        {
            c1 = flag;
            i1 = k;
            i = l;
            if (l1 == 913)
            {
                stringbuffer.append((char)ai2[k1]);
                c1 = flag;
                i1 = k;
                i = l;
            }
        }
          goto _L11
_L6:
        if (l1 < 25)
        {
            c1 = b[l1];
            i1 = k;
            i = l;
        } else
        if (l1 == 25)
        {
            i = 3;
            c1 = flag;
            i1 = k;
        } else
        if (l1 == 26)
        {
            c1 = ' ';
            i1 = k;
            i = l;
        } else
        if (l1 == 27)
        {
            i = 1;
            c1 = flag;
            i1 = k;
        } else
        if (l1 == 28)
        {
            i = 0;
            c1 = flag;
            i1 = k;
        } else
        if (l1 == 29)
        {
            i = 5;
            c1 = flag;
            i1 = l;
        } else
        {
            c1 = flag;
            i1 = k;
            i = l;
            if (l1 == 913)
            {
                stringbuffer.append((char)ai2[k1]);
                c1 = flag;
                i1 = k;
                i = l;
            }
        }
          goto _L11
_L7:
        if (l1 < 29)
        {
            c1 = a[l1];
            i1 = k;
            i = l;
        } else
        if (l1 == 29)
        {
            i = 0;
            c1 = flag;
            i1 = k;
        } else
        {
            c1 = flag;
            i1 = k;
            i = l;
            if (l1 == 913)
            {
                stringbuffer.append((char)ai2[k1]);
                c1 = flag;
                i1 = k;
                i = l;
            }
        }
          goto _L11
_L8:
        if (l1 < 26)
        {
            c1 = (char)(l1 + 65);
            i = k;
            i1 = k;
        } else
        {
            if (l1 != 26)
            {
                break MISSING_BLOCK_LABEL_955;
            }
            c1 = ' ';
            i = k;
            i1 = k;
        }
          goto _L11
_L9:
        if (l1 < 29)
        {
            c1 = a[l1];
            i = k;
            i1 = k;
        } else
        {
            if (l1 != 29)
            {
                break MISSING_BLOCK_LABEL_955;
            }
            i = 0;
            c1 = flag;
            i1 = k;
        }
          goto _L11
_L2:
        return j;
        i = k;
        c1 = flag;
        i1 = k;
          goto _L11
        if (true) goto _L13; else goto _L12
_L12:
    }

    static ap a(int ai[])
        throws v
    {
        StringBuffer stringbuffer;
        int i;
        int j;
        stringbuffer = new StringBuffer(100);
        j = 2;
        i = ai[1];
_L7:
        if (j >= ai[0])
        {
            break MISSING_BLOCK_LABEL_159;
        }
        i;
        JVM INSTR lookupswitch 5: default 76
    //                   900: 102
    //                   901: 112
    //                   902: 123
    //                   913: 133
    //                   924: 144;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        i = a(ai, j - 1, stringbuffer);
_L8:
        if (i < ai.length)
        {
            j = i + 1;
            i = ai[i];
        } else
        {
            throw v.a();
        }
        if (true) goto _L7; else goto _L2
_L2:
        i = a(ai, j, stringbuffer);
          goto _L8
_L3:
        i = a(i, ai, j, stringbuffer);
          goto _L8
_L4:
        i = b(ai, j, stringbuffer);
          goto _L8
_L5:
        i = a(i, ai, j, stringbuffer);
          goto _L8
_L6:
        i = a(i, ai, j, stringbuffer);
          goto _L8
        return new ap(null, stringbuffer.toString(), null, null);
    }

    private static StringBuffer a(String s, String s1)
    {
        StringBuffer stringbuffer = new StringBuffer(5);
        StringBuffer stringbuffer1 = new StringBuffer(5);
        StringBuffer stringbuffer2 = new StringBuffer(s.length());
        for (int i = 0; i < s.length(); i++)
        {
            stringbuffer2.append('0');
        }

        int j = s.length() - 3;
        int k = 0;
        for (; j >= 0; j -= 3)
        {
            stringbuffer.setLength(0);
            stringbuffer.append(s.charAt(j));
            stringbuffer.append(s.charAt(j + 1));
            stringbuffer.append(s.charAt(j + 2));
            stringbuffer1.setLength(0);
            stringbuffer1.append(s1.charAt(j));
            stringbuffer1.append(s1.charAt(j + 1));
            stringbuffer1.append(s1.charAt(j + 2));
            int i1 = Integer.parseInt(stringbuffer.toString());
            int j1 = Integer.parseInt(stringbuffer1.toString());
            int l = (i1 + j1 + k) % 1000;
            k = (k + (i1 + j1)) / 1000;
            stringbuffer2.setCharAt(j + 2, (char)(l % 10 + 48));
            stringbuffer2.setCharAt(j + 1, (char)((l / 10) % 10 + 48));
            stringbuffer2.setCharAt(j, (char)(l / 100 + 48));
        }

        return stringbuffer2;
    }

    private static int b(int ai[], int i, StringBuffer stringbuffer)
    {
        int ai1[];
        int j;
        int k;
        int i1;
        j = 0;
        k = 0;
        ai1 = new int[15];
        i1 = i;
_L5:
        if (i1 >= ai[0] || k != 0) goto _L2; else goto _L1
_L1:
        i = i1 + 1;
        i1 = ai[i1];
        boolean flag = k;
        if (i == ai[0])
        {
            flag = true;
        }
        Object obj;
        StringBuffer stringbuffer1;
        String s;
        int l;
        int j1;
        int k1;
        if (i1 < 900)
        {
            ai1[j] = i1;
            l = j + 1;
        } else
        if (i1 == 900 || i1 == 901 || i1 == 924 || i1 == 928 || i1 == 923 || i1 == 922)
        {
            i--;
            flag = true;
            l = j;
        } else
        {
            l = j;
        }
        if (l % 15 == 0 || i1 == 902) goto _L4; else goto _L3
_L3:
        k = ((flag) ? 1 : 0);
        j = l;
        i1 = i;
        if (!flag) goto _L5; else goto _L4
_L4:
        j = 0;
        stringbuffer1 = null;
        while (j < l) 
        {
            s = c[l - j - 1];
            j1 = ai1[j];
            obj = new StringBuffer(s.length());
            for (k = 0; k < s.length(); k++)
            {
                ((StringBuffer) (obj)).append('0');
            }

            i1 = j1 / 100;
            k1 = j1 / 10;
            for (k = 0; k < j1 % 10; k++)
            {
                obj = a(((StringBuffer) (obj)).toString(), s);
            }

            for (k = 0; k < k1 % 10; k++)
            {
                obj = a(((StringBuffer) (obj)).toString(), (new StringBuilder()).append(s).append('0').toString().substring(1));
            }

            for (k = 0; k < i1; k++)
            {
                obj = a(((StringBuffer) (obj)).toString(), (new StringBuilder()).append(s).append("00").toString().substring(2));
            }

            if (stringbuffer1 != null)
            {
                obj = a(stringbuffer1.toString(), ((StringBuffer) (obj)).toString());
            }
            j++;
            stringbuffer1 = ((StringBuffer) (obj));
        }
        j = 0;
_L8:
        if (j >= stringbuffer1.length())
        {
            break MISSING_BLOCK_LABEL_511;
        }
        if (stringbuffer1.charAt(j) != '1') goto _L7; else goto _L6
_L6:
        obj = stringbuffer1.toString().substring(j + 1);
_L9:
        s = ((String) (obj));
        if (obj == null)
        {
            s = stringbuffer1.toString();
        }
        stringbuffer.append(s);
        j = 0;
        k = ((flag) ? 1 : 0);
        i1 = i;
          goto _L5
_L7:
        j++;
          goto _L8
_L2:
        return i1;
        obj = null;
          goto _L9
    }

}
