// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;


// Referenced classes of package com.google.protobuf.nano:
//            InvalidProtocolBufferNanoException, c, f

public final class a
{

    private final byte a[];
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;

    private a(byte abyte0[], int i1, int j1)
    {
        g = 0x7fffffff;
        i = 64;
        j = 0x4000000;
        a = abyte0;
        b = i1;
        c = i1 + j1;
        e = i1;
    }

    public static a a(byte abyte0[], int i1, int j1)
    {
        return new a(abyte0, i1, j1);
    }

    private byte[] d(int i1)
    {
        if (i1 < 0)
        {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        if (e + i1 > g)
        {
            e(g - e);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i1 <= c - e)
        {
            byte abyte0[] = new byte[i1];
            System.arraycopy(a, e, abyte0, 0, i1);
            e = e + i1;
            return abyte0;
        } else
        {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
    }

    private void e(int i1)
    {
        if (i1 < 0)
        {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        if (e + i1 > g)
        {
            e(g - e);
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
        if (i1 <= c - e)
        {
            e = e + i1;
            return;
        } else
        {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        }
    }

    private int m()
    {
        int i1 = p();
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        i1 &= 0x7f;
        byte byte0 = p();
        if (byte0 >= 0)
        {
            return i1 | byte0 << 7;
        }
        i1 |= (byte0 & 0x7f) << 7;
        byte0 = p();
        if (byte0 >= 0)
        {
            return i1 | byte0 << 14;
        }
        i1 |= (byte0 & 0x7f) << 14;
        int k1 = p();
        if (k1 >= 0)
        {
            return i1 | k1 << 21;
        }
        byte0 = p();
        k1 = i1 | (k1 & 0x7f) << 21 | byte0 << 28;
        i1 = k1;
        if (byte0 < 0)
        {
            int j1 = 0;
label0:
            do
            {
label1:
                {
                    if (j1 >= 5)
                    {
                        break label1;
                    }
                    i1 = k1;
                    if (p() >= 0)
                    {
                        break label0;
                    }
                    j1++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    private long n()
    {
        int i1 = 0;
        long l1 = 0L;
        for (; i1 < 64; i1 += 7)
        {
            byte byte0 = p();
            l1 |= (long)(byte0 & 0x7f) << i1;
            if ((byte0 & 0x80) == 0)
            {
                return l1;
            }
        }

        throw InvalidProtocolBufferNanoException.malformedVarint();
    }

    private void o()
    {
        c = c + d;
        int i1 = c;
        if (i1 > g)
        {
            d = i1 - g;
            c = c - d;
            return;
        } else
        {
            d = 0;
            return;
        }
    }

    private byte p()
    {
        if (e == c)
        {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        } else
        {
            byte abyte0[] = a;
            int i1 = e;
            e = i1 + 1;
            return abyte0[i1];
        }
    }

    public final int a()
    {
        boolean flag;
        if (e == c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            f = 0;
            return 0;
        }
        f = m();
        if (f == 0)
        {
            throw InvalidProtocolBufferNanoException.invalidTag();
        } else
        {
            return f;
        }
    }

    public final void a(int i1)
    {
        if (f != i1)
        {
            throw InvalidProtocolBufferNanoException.invalidEndTag();
        } else
        {
            return;
        }
    }

    public final void a(c c1)
    {
        int i1 = m();
        if (h >= i)
        {
            throw InvalidProtocolBufferNanoException.recursionLimitExceeded();
        }
        if (i1 < 0)
        {
            throw InvalidProtocolBufferNanoException.negativeSize();
        }
        i1 += e;
        int j1 = g;
        if (i1 > j1)
        {
            throw InvalidProtocolBufferNanoException.truncatedMessage();
        } else
        {
            g = i1;
            o();
            h = h + 1;
            c1.a(this);
            a(0);
            h = h - 1;
            g = j1;
            o();
            return;
        }
    }

    public final byte[] a(int i1, int j1)
    {
        if (j1 == 0)
        {
            return f.l;
        } else
        {
            byte abyte0[] = new byte[j1];
            int k1 = b;
            System.arraycopy(a, k1 + i1, abyte0, 0, j1);
            return abyte0;
        }
    }

    public final long b()
    {
        return n();
    }

    public final boolean b(int i1)
    {
        switch (com.google.protobuf.nano.f.a(i1))
        {
        default:
            throw InvalidProtocolBufferNanoException.invalidWireType();

        case 0: // '\0'
            m();
            return true;

        case 1: // '\001'
            j();
            return true;

        case 2: // '\002'
            e(m());
            return true;

        case 3: // '\003'
            int j1;
            do
            {
                j1 = a();
            } while (j1 != 0 && b(j1));
            a(com.google.protobuf.nano.f.a(com.google.protobuf.nano.f.b(i1), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            i();
            return true;
        }
    }

    public final long c()
    {
        return n();
    }

    public final void c(int i1)
    {
        if (i1 > e - b)
        {
            throw new IllegalArgumentException((new StringBuilder("Position ")).append(i1).append(" is beyond current ").append(e - b).toString());
        }
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad position ")).append(i1).toString());
        } else
        {
            e = b + i1;
            return;
        }
    }

    public final int d()
    {
        return m();
    }

    public final boolean e()
    {
        return m() != 0;
    }

    public final String f()
    {
        int i1 = m();
        if (i1 <= c - e && i1 > 0)
        {
            String s = new String(a, e, i1, "UTF-8");
            e = i1 + e;
            return s;
        } else
        {
            return new String(d(i1), "UTF-8");
        }
    }

    public final byte[] g()
    {
        int i1 = m();
        if (i1 <= c - e && i1 > 0)
        {
            byte abyte0[] = new byte[i1];
            System.arraycopy(a, e, abyte0, 0, i1);
            e = i1 + e;
            return abyte0;
        } else
        {
            return d(i1);
        }
    }

    public final int h()
    {
        return m();
    }

    public final int i()
    {
        return p() & 0xff | (p() & 0xff) << 8 | (p() & 0xff) << 16 | (p() & 0xff) << 24;
    }

    public final long j()
    {
        int i1 = p();
        int j1 = p();
        int k1 = p();
        int l1 = p();
        int i2 = p();
        int j2 = p();
        int k2 = p();
        int l2 = p();
        long l3 = i1;
        return ((long)j1 & 255L) << 8 | l3 & 255L | ((long)k1 & 255L) << 16 | ((long)l1 & 255L) << 24 | ((long)i2 & 255L) << 32 | ((long)j2 & 255L) << 40 | ((long)k2 & 255L) << 48 | ((long)l2 & 255L) << 56;
    }

    public final int k()
    {
        if (g == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i1 = e;
            return g - i1;
        }
    }

    public final int l()
    {
        return e - b;
    }
}
