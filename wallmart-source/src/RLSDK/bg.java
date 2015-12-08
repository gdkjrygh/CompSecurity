// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;

import java.io.UnsupportedEncodingException;
import java.util.Vector;

// Referenced classes of package RLSDK:
//            v, al, ap

final class bg
{

    private static final char a[] = {
        '*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', 
        '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 
        'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 
        'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
    };
    private static final char b[] = {
        '!', '"', '#', '$', '%', '&', '\'', '(', ')', '*', 
        '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', 
        '?', '@', '[', '\\', ']', '^', '_'
    };
    private static final char c[] = {
        '*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', 
        '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 
        'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 
        'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };
    private static final char d[] = {
        '\'', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 
        'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 
        'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '{', '|', '}', 
        '~', '\177'
    };

    private static byte a(int i, int j)
    {
        i -= (j * 149) % 255 + 1;
        if (i < 0)
        {
            i += 256;
        }
        return (byte)i;
    }

    private static int a(al al1, StringBuffer stringbuffer, StringBuffer stringbuffer1)
        throws v
    {
        int i = 0;
_L2:
        int j;
        int k;
        k = al1.a(8);
        if (k == 0)
        {
            throw v.a();
        }
        if (k <= 128)
        {
            if (i != 0)
            {
                i = k + 128;
            } else
            {
                i = k;
            }
            stringbuffer.append((char)(i - 1));
            return 1;
        }
        if (k == 129)
        {
            return 0;
        }
        if (k > 229)
        {
            break; /* Loop/switch isn't completed */
        }
        j = k - 130;
        if (j < 10)
        {
            stringbuffer.append('0');
        }
        stringbuffer.append(j);
        j = i;
_L3:
        i = j;
        if (al1.a() <= 0)
        {
            return 1;
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (k == 230)
        {
            return 2;
        }
        if (k == 231)
        {
            return 6;
        }
        j = i;
        if (k != 232)
        {
            j = i;
            if (k != 233)
            {
                j = i;
                if (k != 234)
                {
                    if (k == 235)
                    {
                        j = 1;
                    } else
                    if (k == 236)
                    {
                        stringbuffer.append("[)>\03605\035");
                        stringbuffer1.insert(0, "\036\004");
                        j = i;
                    } else
                    {
label0:
                        {
                            if (k != 237)
                            {
                                break label0;
                            }
                            stringbuffer.append("[)>\03606\035");
                            stringbuffer1.insert(0, "\036\004");
                            j = i;
                        }
                    }
                }
            }
        }
          goto _L3
        continue; /* Loop/switch isn't completed */
        if (k == 238)
        {
            return 4;
        }
        if (k == 239)
        {
            return 3;
        }
        if (k == 240)
        {
            return 5;
        }
        j = i;
        if (k == 241) goto _L3; else goto _L4
_L4:
        j = i;
        if (k < 242) goto _L3; else goto _L5
_L5:
        if (k != 254)
        {
            break; /* Loop/switch isn't completed */
        }
        j = i;
        if (al1.a() == 0) goto _L3; else goto _L6
_L6:
        throw v.a();
        if (true) goto _L2; else goto _L7
_L7:
    }

    static ap a(byte abyte0[])
        throws v
    {
        Object obj;
        Vector vector;
        Object obj1;
        StringBuffer stringbuffer;
        int i;
        obj = new al(abyte0);
        obj1 = new StringBuffer(100);
        stringbuffer = new StringBuffer(0);
        vector = new Vector(1);
        i = 1;
_L2:
        if (i != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        i = a(((al) (obj)), ((StringBuffer) (obj1)), stringbuffer);
_L9:
        if (i == 0 || ((al) (obj)).a() <= 0)
        {
            if (stringbuffer.length() > 0)
            {
                ((StringBuffer) (obj1)).append(stringbuffer.toString());
            }
            obj1 = ((StringBuffer) (obj1)).toString();
            obj = vector;
            if (vector.isEmpty())
            {
                obj = null;
            }
            return new ap(abyte0, ((String) (obj1)), ((Vector) (obj)), null);
        }
        if (true) goto _L2; else goto _L1
_L1:
        i;
        JVM INSTR tableswitch 2 6: default 152
    //                   2 156
    //                   3 167
    //                   4 175
    //                   5 183
    //                   6 191;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_191;
_L3:
        throw v.a();
_L4:
        a(((al) (obj)), ((StringBuffer) (obj1)));
_L10:
        i = 1;
          goto _L9
_L5:
        b(((al) (obj)), ((StringBuffer) (obj1)));
          goto _L10
_L6:
        c(((al) (obj)), ((StringBuffer) (obj1)));
          goto _L10
_L7:
        d(((al) (obj)), ((StringBuffer) (obj1)));
          goto _L10
        a(((al) (obj)), ((StringBuffer) (obj1)), vector);
          goto _L10
    }

    private static void a(int i, int j, int ai[])
    {
        i = ((i << 8) + j) - 1;
        j = i / 1600;
        ai[0] = j;
        i -= j * 1600;
        j = i / 40;
        ai[1] = j;
        ai[2] = i - j * 40;
    }

    private static void a(al al1, StringBuffer stringbuffer)
        throws v
    {
        int ai[];
        int i;
        ai = new int[3];
        i = 0;
_L13:
        if (al1.a() != 8) goto _L2; else goto _L1
_L1:
        int j;
        return;
_L2:
        if ((j = al1.a(8)) == 254) goto _L1; else goto _L3
_L3:
        int k;
        a(j, al1.a(8), ai);
        k = 0;
        j = 0;
_L10:
        int l;
        if (k >= 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = ai[k];
        j;
        JVM INSTR tableswitch 0 3: default 96
    //                   0 100
    //                   1 212
    //                   2 252
    //                   3 334;
           goto _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_334;
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        throw v.a();
_L5:
        if (l < 3)
        {
            l++;
            j = i;
            i = l;
        } else
        if (l < a.length)
        {
            char c1 = a[l];
            if (i != 0)
            {
                stringbuffer.append((char)(c1 + 128));
                i = j;
                j = 0;
            } else
            {
                stringbuffer.append(c1);
                l = i;
                i = j;
                j = l;
            }
        } else
        {
            throw v.a();
        }
_L11:
        l = k + 1;
        k = i;
        i = j;
        j = k;
        k = l;
        if (true) goto _L10; else goto _L9
_L9:
        if (i != 0)
        {
            stringbuffer.append((char)(l + 128));
            i = 0;
        } else
        {
            stringbuffer.append(l);
        }
        j = i;
        i = 0;
          goto _L11
_L7:
        if (l < b.length)
        {
            char c2 = b[l];
            if (i != 0)
            {
                stringbuffer.append((char)(c2 + 128));
                i = 0;
            } else
            {
                stringbuffer.append(c2);
            }
        } else
        {
            if (l == 27)
            {
                throw v.a();
            }
            if (l == 30)
            {
                i = 1;
            } else
            {
                throw v.a();
            }
        }
        j = i;
        i = 0;
          goto _L11
        if (i != 0)
        {
            stringbuffer.append((char)(l + 224));
            i = 0;
        } else
        {
            stringbuffer.append((char)(l + 96));
        }
        j = i;
        i = 0;
          goto _L11
        if (al1.a() > 0) goto _L13; else goto _L12
_L12:
    }

    private static void a(al al1, StringBuffer stringbuffer, Vector vector)
        throws v
    {
        int i;
        int j;
        j = 3;
        i = a(al1.a(8), 2);
        if (i != 0) goto _L2; else goto _L1
_L1:
        i = al1.a() / 8;
_L4:
        if (i < 0)
        {
            throw v.a();
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (i >= 250)
        {
            i = (i - 249) * 250 + a(al1.a(8), 3);
            j = 4;
        }
        if (true) goto _L4; else goto _L3
_L3:
        byte abyte0[] = new byte[i];
        for (int k = 0; k < i;)
        {
            if (al1.a() < 8)
            {
                throw v.a();
            }
            abyte0[k] = a(al1.a(8), j);
            k++;
            j++;
        }

        vector.addElement(abyte0);
        try
        {
            stringbuffer.append(new String(abyte0, "ISO8859_1"));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (al al1)
        {
            throw new RuntimeException((new StringBuilder("Platform does not support required encoding: ")).append(al1).toString());
        }
    }

    private static void b(al al1, StringBuffer stringbuffer)
        throws v
    {
        int ai[];
        int i;
        boolean flag;
        ai = new int[3];
        i = 0;
        flag = false;
_L13:
        if (al1.a() != 8) goto _L2; else goto _L1
_L1:
        int j;
        return;
_L2:
        if ((j = al1.a(8)) == 254) goto _L1; else goto _L3
_L3:
        a(j, al1.a(8), ai);
        j = 0;
_L10:
        int k;
        if (j >= 3)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = ai[j];
        i;
        JVM INSTR tableswitch 0 3: default 96
    //                   0 100
    //                   1 172
    //                   2 208
    //                   3 286;
           goto _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_286;
_L6:
        break; /* Loop/switch isn't completed */
_L4:
        throw v.a();
_L5:
        if (k < 3)
        {
            i = k + 1;
        } else
        if (k < c.length)
        {
            char c1 = c[k];
            if (flag)
            {
                stringbuffer.append((char)(c1 + 128));
                flag = false;
            } else
            {
                stringbuffer.append(c1);
            }
        } else
        {
            throw v.a();
        }
_L11:
        j++;
        if (true) goto _L10; else goto _L9
_L9:
        if (flag)
        {
            stringbuffer.append((char)(k + 128));
            flag = false;
        } else
        {
            stringbuffer.append(k);
        }
        i = 0;
          goto _L11
_L7:
        if (k < b.length)
        {
            char c2 = b[k];
            if (flag)
            {
                stringbuffer.append((char)(c2 + 128));
                flag = false;
            } else
            {
                stringbuffer.append(c2);
            }
        } else
        {
            if (k == 27)
            {
                throw v.a();
            }
            if (k == 30)
            {
                flag = true;
            } else
            {
                throw v.a();
            }
        }
        i = 0;
          goto _L11
        if (k < d.length)
        {
            char c3 = d[k];
            if (flag)
            {
                stringbuffer.append((char)(c3 + 128));
                flag = false;
            } else
            {
                stringbuffer.append(c3);
            }
            i = 0;
        } else
        {
            throw v.a();
        }
          goto _L11
        if (al1.a() > 0) goto _L13; else goto _L12
_L12:
    }

    private static void c(al al1, StringBuffer stringbuffer)
        throws v
    {
        int ai[] = new int[3];
_L5:
        if (al1.a() != 8) goto _L2; else goto _L1
_L1:
        int i;
        return;
_L2:
        if ((i = al1.a(8)) == 254) goto _L1; else goto _L3
_L3:
        a(i, al1.a(8), ai);
        i = 0;
        while (i < 3) 
        {
            int j = ai[i];
            if (j == 0)
            {
                stringbuffer.append('\r');
            } else
            if (j == 1)
            {
                stringbuffer.append('*');
            } else
            if (j == 2)
            {
                stringbuffer.append('>');
            } else
            if (j == 3)
            {
                stringbuffer.append(' ');
            } else
            if (j < 14)
            {
                stringbuffer.append((char)(j + 44));
            } else
            if (j < 40)
            {
                stringbuffer.append((char)(j + 51));
            } else
            {
                throw v.a();
            }
            i++;
        }
        if (al1.a() <= 0)
        {
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private static void d(al al1, StringBuffer stringbuffer)
    {
        boolean flag = false;
        do
        {
            if (al1.a() <= 16)
            {
                return;
            }
            for (int i = 0; i < 4; i++)
            {
                int j = al1.a(6);
                if (j == 31)
                {
                    flag = true;
                }
                if (flag)
                {
                    continue;
                }
                if ((j & 0x20) == 0)
                {
                    j |= 0x40;
                }
                stringbuffer.append(j);
            }

        } while (!flag && al1.a() > 0);
    }

}
