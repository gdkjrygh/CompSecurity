// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.whatsapp.protocol:
//            b9, bz, bv, c4, 
//            bp, c_, bg, b0, 
//            bj, b1, cw

public class co
    implements b9, bz
{

    private static final String z[];
    String a[];
    byte b[];
    bj c;
    boolean d;
    long e;
    InputStream f;
    String g[];
    int h;
    InputStream i;

    public co(InputStream inputstream, String as[], String as1[])
    {
        b = new byte[255];
        h = 0;
        e = 0L;
        d = true;
        if (inputstream != null)
        {
            inputstream = new bv(inputstream);
        } else
        {
            inputstream = null;
        }
        f = inputstream;
        g = as;
        a = as1;
        e = System.currentTimeMillis();
    }

    public co(String as[], String as1[])
    {
        this(null, as, as1);
    }

    private int a(int j)
    {
        int k;
label0:
        {
            int l = c4.F;
            if (j == 0)
            {
                k = 0;
                if (l == 0)
                {
                    break label0;
                }
            }
            if (j == 248)
            {
                k = b(i);
                if (l == 0)
                {
                    break label0;
                }
            }
            if (j == 249)
            {
                k = e(i);
                if (l == 0)
                {
                    break label0;
                }
            }
            throw new bp((new StringBuilder()).append(z[2]).append(j).toString(), d());
        }
        return k;
    }

    private String a()
    {
        return b(i.read());
    }

    private String a(int j, int k)
    {
        String s;
label0:
        {
            j = j * 256 + k;
            if (j >= 0 && j < a.length)
            {
                s = a[j];
                if (c4.F == 0)
                {
                    break label0;
                }
            }
            s = null;
        }
        if (s == null)
        {
            throw new bp(z[3], d());
        } else
        {
            return s;
        }
    }

    public static void a(byte abyte0[], int j, InputStream inputstream)
    {
        int l = c4.F;
        int k = 0;
        do
        {
            if (k >= j)
            {
                break;
            }
            k += inputstream.read(abyte0, k, j - k);
        } while (l == 0);
    }

    public static void a(byte abyte0[], InputStream inputstream)
    {
        a(abyte0, abyte0.length, inputstream);
    }

    private static byte[] a(InputStream inputstream)
    {
        int j;
        int k;
        int l;
        k = 0;
        l = c4.F;
        int i1 = b(inputstream);
        byte abyte0[];
        if ((i1 & 0x80) != 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        i1 &= 0x7f;
        abyte0 = new byte[i1];
        a(abyte0, inputstream);
        if (j != 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        i1 = i1 * 2 - j;
        inputstream = new byte[i1];
        j = k;
_L6:
        if (j >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        k = (1 - j % 2) * 4;
        k = (abyte0[j / 2] & 15 << k) >> k;
        k;
        JVM INSTR tableswitch 0 11: default 152
    //                   0 192
    //                   1 192
    //                   2 192
    //                   3 192
    //                   4 192
    //                   5 192
    //                   6 192
    //                   7 192
    //                   8 192
    //                   9 192
    //                   10 205
    //                   11 205;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L3 _L3
_L1:
        throw new bp((new StringBuilder()).append(z[1]).append(k).toString());
_L2:
        inputstream[j] = (byte)(k + 48);
        if (l == 0)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        inputstream[j] = (byte)((k - 10) + 45);
        if (l != 0) goto _L1; else goto _L4
_L4:
        j++;
        if (l == 0) goto _L6; else goto _L5
_L5:
        return inputstream;
    }

    private static int b(InputStream inputstream)
    {
        return inputstream.read();
    }

    private c_ b()
    {
        int j = a(i.read());
        int k = i.read();
        if (k == 2)
        {
            return null;
        }
        String s = b(k);
        if (j == 0 || s == null)
        {
            throw new bp(z[15], d());
        }
        b0 ab0[] = e(((j - 2) + j % 2) / 2);
        if (j % 2 == 1)
        {
            return new c_(s, ab0);
        }
        j = i.read();
        if (i(j))
        {
            return new c_(s, ab0, g(j));
        }
        if (j == 252)
        {
            byte abyte0[] = new byte[b(i)];
            a(abyte0, i);
            return new c_(s, ab0, abyte0);
        }
        if (j == 253)
        {
            byte abyte1[] = new byte[d(i)];
            a(abyte1, i);
            return new c_(s, ab0, abyte1);
        }
        if (j == 254)
        {
            byte abyte2[] = new byte[c(i)];
            a(abyte2, i);
            return new c_(s, ab0, abyte2);
        }
        if (j == 255)
        {
            return new c_(s, ab0, a(i));
        } else
        {
            return new c_(s, ab0, b(j));
        }
    }

    private String b(int j)
    {
        if (j == -1)
        {
            throw new bp(z[8], d());
        }
        Object obj;
        if (j > 2 && j < 236)
        {
            obj = c(j);
        } else
        {
            String s;
            switch (j)
            {
            default:
                throw new bp(z[10], d());

            case 236: 
            case 237: 
            case 238: 
            case 239: 
                return a(j - 236, b(i));

            case 0: // '\0'
                return null;

            case 252: 
                obj = new byte[b(i)];
                a(((byte []) (obj)), i);
                return bg.a(((byte []) (obj)));

            case 253: 
                obj = new byte[d(i)];
                a(((byte []) (obj)), i);
                return bg.a(((byte []) (obj)));

            case 254: 
                obj = new byte[c(i)];
                a(((byte []) (obj)), i);
                return bg.a(((byte []) (obj)));

            case 255: 
                return bg.a(a(i));

            case 250: 
                obj = a();
                s = a();
                break;
            }
            if (obj != null && s != null)
            {
                return (new StringBuilder()).append(((String) (obj))).append("@").append(s).toString();
            }
            obj = s;
            if (s == null)
            {
                throw new bp(z[9], d());
            }
        }
        return ((String) (obj));
    }

    private static int c(InputStream inputstream)
    {
        inputstream.read();
        int j = inputstream.read();
        return j << 16 | j << 24 | inputstream.read() << 8 | inputstream.read();
    }

    private String c(int j)
    {
        String s;
label0:
        {
            if (j >= 0 && j < g.length)
            {
                s = g[j];
                if (c4.F == 0)
                {
                    break label0;
                }
            }
            s = null;
        }
        if (s == null)
        {
            throw new bp(z[4], d());
        } else
        {
            return s;
        }
    }

    private static int d(InputStream inputstream)
    {
        return ((inputstream.read() & 0xf) << 16) + (inputstream.read() << 8) + inputstream.read();
    }

    private void d(int j)
    {
        if (b.length < j)
        {
            b = new byte[Math.max((b.length * 3) / 2, j)];
        }
        h = j;
        a(b, j, f);
        i = new ByteArrayInputStream(b, 0, j);
    }

    private static int e(InputStream inputstream)
    {
        return (inputstream.read() << 8) + inputstream.read();
    }

    private b0[] e(int j)
    {
        int l = c4.F;
        b0 ab0[] = new b0[j];
        int k = 0;
        do
        {
            if (k >= j)
            {
                break;
            }
            ab0[k] = new b0(a(), a());
            k++;
        } while (l == 0);
        return ab0;
    }

    private void f(int j)
    {
        j = c4.F;
        InputStream inputstream = c.a(i);
        b1 b1_1 = new b1();
        byte abyte0[] = new byte[8192];
        do
        {
            int k = inputstream.read(abyte0, 0, abyte0.length);
            if (k == -1)
            {
                break;
            }
            b1_1.write(abyte0, 0, k);
        } while (j == 0);
        b = b1_1.a();
        i = new ByteArrayInputStream(b, 0, b1_1.b());
    }

    private c_[] g(int j)
    {
        int k = c4.F;
        int l = a(j);
        c_ ac_[] = new c_[l];
        j = 0;
        do
        {
            if (j >= l)
            {
                break;
            }
            ac_[j] = b();
            j++;
        } while (k == 0);
        return ac_;
    }

    private void h(int j)
    {
        int k = c4.F;
        if (c == null)
        {
            throw new bp(z[12]);
        }
        byte abyte0[] = new byte[4];
        System.arraycopy(b, j - 4, abyte0, 0, 4);
        c.b(b, 0, j - 4);
        byte abyte1[] = c.b();
        j = 0;
        do
        {
            if (j >= 4)
            {
                break;
            }
            if (abyte0[j] != abyte1[j])
            {
                throw new bp(z[11]);
            }
            j++;
        } while (k == 0);
        i.skip(0);
    }

    private boolean i(int j)
    {
        return j == 248 || j == 0 || j == 249;
    }

    public c_ a(byte abyte0[])
    {
        b = new byte[abyte0.length];
        a(b, abyte0.length, ((InputStream) (new ByteArrayInputStream(abyte0, 0, abyte0.length))));
        i = new ByteArrayInputStream(abyte0, 0, abyte0.length);
        e = System.currentTimeMillis();
        return b();
    }

    public void a()
    {
        d(cw.b(cw.a(f)));
        int j = a(i.read());
        if (i.read() != 1)
        {
            throw new bp(z[0], d());
        } else
        {
            e((j % 2 + (j - 2)) / 2);
            return;
        }
    }

    public void a(bj bj1)
    {
        c = bj1;
    }

    public void b()
    {
        d = false;
    }

    public c_ c()
    {
        int j;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag = false;
        j = cw.a(f);
        flag3 = cw.d(j);
        flag1 = cw.a(j);
        flag2 = cw.c(j);
        j = cw.b(j);
        d(j);
        e = System.currentTimeMillis();
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        int k;
        d = false;
        h(j);
        k = c4.F;
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_105;
        }
        flag3 = d;
        if (!flag3)
        {
            try
            {
                throw new bp(z[14]);
            }
            catch (IOException ioexception)
            {
                throw ioexception;
            }
        }
        break MISSING_BLOCK_LABEL_105;
        IOException ioexception1;
        ioexception1;
        throw ioexception1;
        ioexception1;
        throw ioexception1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        f(j);
        Object obj;
        try
        {
            obj = b();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (!flag2)
            {
                try
                {
                    throw obj;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw obj;
                }
            }
            obj = null;
        }
_L2:
        if (flag2)
        {
            StringBuilder stringbuilder;
            try
            {
                stringbuilder = (new StringBuilder()).append(z[13]);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (obj != null)
            {
                flag = true;
            }
            throw new bp(stringbuilder.append(flag).toString());
        } else
        {
            return ((c_) (obj));
        }
        obj;
        throw obj;
        obj;
        if (!flag2)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String d()
    {
        int k = c4.F;
        if (b == null)
        {
            return z[7];
        }
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(z[5]).append(Integer.toString(h)).append('<');
        int j = 0;
        do
        {
            if (j >= h)
            {
                break;
            }
            if (j > 0)
            {
                stringbuffer.append(z[6]);
            }
            stringbuffer.append(Integer.toString(b[j] & 0xff));
            j++;
        } while (k == 0);
        stringbuffer.append('>');
        return stringbuffer.toString();
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int j;
        as = new String[16];
        obj = "Kk\027G\020Zz\tES}G5g2cL4v2|GGK\035\016`\023P\026O~4V\022\\g";
        byte0 = -1;
        j = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[j] = ((String) (obj));
                obj = "Lr\003\002\035Gq\005N\026\016";
                j = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[j] = ((String) (obj));
                obj = "G}\021C\037GwGN\032]gGQ\032TvGK\035\016a\002C\027bz\024V Gi\002\030SZ|\fG\035\016";
                j = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[j] = ((String) (obj));
                obj = "G}\021C\037GwGV\034Ev\t\r\037K}\000V\033\016z\t\002\026Vg\002L\027KwGE\026ZG\bI\026@";
                j = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[j] = ((String) (obj));
                obj = "G}\021C\037GwGV\034Ev\t\r\037K}\000V\033\016z\t\002\024Kg3M\030K}";
                j = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[j] = ((String) (obj));
                j = 5;
                obj = "]z\035GS\0233";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[j] = ((String) (obj));
                j = 6;
                obj = "\0023";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[j] = ((String) (obj));
                j = 7;
                obj = "@f\013N";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[j] = ((String) (obj));
                j = 8;
                obj = "\003\"GV\034Ev\t\002\032@3\025G\022J@\023P\032@t";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[j] = ((String) (obj));
                j = 9;
                obj = "\\v\006F Za\016L\024\016p\bW\037J}@VS\\v\004M\035]g\025W\020Z3\rK\027";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[j] = ((String) (obj));
                j = 10;
                obj = "\\v\006F Za\016L\024\016p\bW\037J}@VSCr\023A\033\016g\bI\026@";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[j] = ((String) (obj));
                j = 11;
                obj = "Cr\004\002\036G`\nC\007M{";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[j] = ((String) (obj));
                j = 12;
                obj = "k}\004P\n^g\002FSL\177\bA\030\0023\005W\007\016}\b\002\020Gc\017G\001\016r\021C\032Br\005N\026";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[j] = ((String) (obj));
                j = 13;
                obj = "]v\025T\026\\3\024V\022@i\006\002\025\\r\000O\026@g\006V\032A}GL\034Z3\016O\003Bv\nG\035Zv\003\fS^r\025Q\026J.";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[j] = ((String) (obj));
                j = 14;
                obj = "{}\006A\020Kc\023C\021BvGW\035K}\004P\n^g\002FSL\177\bA\030";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[j] = ((String) (obj));
                j = 15;
                obj = "@v\037V'\\v\002\002\000Kv\024\002C\016\177\016Q\007\016|\025\002\035[\177\013\002\007Ot";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[j] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 432
    //                   0 455
    //                   1 462
    //                   2 469
    //                   3 476;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_476;
_L3:
        byte byte1 = 115;
_L9:
        obj[k] = (char)(byte1 ^ c1);
        k++;
          goto _L8
_L4:
        byte1 = 46;
          goto _L9
_L5:
        byte1 = 19;
          goto _L9
_L6:
        byte1 = 103;
          goto _L9
        byte1 = 34;
          goto _L9
    }
}
