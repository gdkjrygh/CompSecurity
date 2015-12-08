// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.micro;

import java.io.InputStream;
import java.util.Vector;

// Referenced classes of package com.google.protobuf.micro:
//            InvalidProtocolBufferMicroException, c, d, a

public final class b
{

    private final byte a[];
    private int b;
    private int c;
    private int d;
    private final InputStream e = null;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    private b(byte abyte0[], int l, int i1)
    {
        h = 0x7fffffff;
        j = 64;
        k = 0x4000000;
        a = abyte0;
        b = l + i1;
        d = l;
    }

    public static b a(byte abyte0[], int l, int i1)
    {
        return new b(abyte0, l, i1);
    }

    private boolean a(boolean flag)
    {
        if (d < b)
        {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        if (g + b == h)
        {
            if (flag)
            {
                throw InvalidProtocolBufferMicroException.truncatedMessage();
            } else
            {
                return false;
            }
        }
        g = g + b;
        d = 0;
        int l;
        if (e == null)
        {
            l = -1;
        } else
        {
            l = e.read(a);
        }
        b = l;
        if (b == 0 || b < -1)
        {
            throw new IllegalStateException((new StringBuilder("InputStream#read(byte[]) returned invalid result: ")).append(b).append("\nThe InputStream implementation is buggy.").toString());
        }
        if (b == -1)
        {
            b = 0;
            if (flag)
            {
                throw InvalidProtocolBufferMicroException.truncatedMessage();
            } else
            {
                return false;
            }
        }
        h();
        l = g + b + c;
        if (l > k || l < 0)
        {
            throw InvalidProtocolBufferMicroException.sizeLimitExceeded();
        } else
        {
            return true;
        }
    }

    private byte[] c(int l)
    {
        if (l < 0)
        {
            throw InvalidProtocolBufferMicroException.negativeSize();
        }
        if (g + d + l > h)
        {
            d(h - g - d);
            throw InvalidProtocolBufferMicroException.truncatedMessage();
        }
        if (l <= b - d)
        {
            byte abyte0[] = new byte[l];
            System.arraycopy(a, d, abyte0, 0, l);
            d = d + l;
            return abyte0;
        }
        if (l < 4096)
        {
            byte abyte1[] = new byte[l];
            int i1 = b - d;
            System.arraycopy(a, d, abyte1, 0, i1);
            d = b;
            a(true);
            while (l - i1 > b) 
            {
                System.arraycopy(a, 0, abyte1, i1, b);
                i1 += b;
                d = b;
                a(true);
            }
            System.arraycopy(a, 0, abyte1, i1, l - i1);
            d = l - i1;
            return abyte1;
        }
        int k2 = d;
        int l2 = b;
        g = g + b;
        d = 0;
        b = 0;
        Vector vector = new Vector();
        int i2;
        for (int j1 = l - (l2 - k2); j1 > 0; j1 -= i2)
        {
            byte abyte2[] = new byte[Math.min(j1, 4096)];
            int j2;
            for (int l1 = 0; l1 < abyte2.length; l1 += j2)
            {
                if (e == null)
                {
                    j2 = -1;
                } else
                {
                    j2 = e.read(abyte2, l1, abyte2.length - l1);
                }
                if (j2 == -1)
                {
                    throw InvalidProtocolBufferMicroException.truncatedMessage();
                }
                g = g + j2;
            }

            i2 = abyte2.length;
            vector.addElement(abyte2);
        }

        byte abyte3[] = new byte[l];
        int k1 = l2 - k2;
        System.arraycopy(a, k2, abyte3, 0, k1);
        for (l = 0; l < vector.size(); l++)
        {
            byte abyte4[] = (byte[])vector.elementAt(l);
            System.arraycopy(abyte4, 0, abyte3, k1, abyte4.length);
            k1 += abyte4.length;
        }

        return abyte3;
    }

    private void d(int l)
    {
        if (l < 0)
        {
            throw InvalidProtocolBufferMicroException.negativeSize();
        }
        if (g + d + l > h)
        {
            d(h - g - d);
            throw InvalidProtocolBufferMicroException.truncatedMessage();
        }
        if (l <= b - d)
        {
            d = d + l;
        } else
        {
            int i1 = b - d;
            g = g + i1;
            d = 0;
            b = 0;
            while (i1 < l) 
            {
                int j1;
                if (e == null)
                {
                    j1 = -1;
                } else
                {
                    j1 = (int)e.skip(l - i1);
                }
                if (j1 <= 0)
                {
                    throw InvalidProtocolBufferMicroException.truncatedMessage();
                }
                i1 += j1;
                g = j1 + g;
            }
        }
    }

    private int g()
    {
        int l = i();
        if (l < 0) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        l &= 0x7f;
        byte byte0 = i();
        if (byte0 >= 0)
        {
            return l | byte0 << 7;
        }
        l |= (byte0 & 0x7f) << 7;
        byte0 = i();
        if (byte0 >= 0)
        {
            return l | byte0 << 14;
        }
        l |= (byte0 & 0x7f) << 14;
        int j1 = i();
        if (j1 >= 0)
        {
            return l | j1 << 21;
        }
        byte0 = i();
        j1 = l | (j1 & 0x7f) << 21 | byte0 << 28;
        l = j1;
        if (byte0 < 0)
        {
            int i1 = 0;
label0:
            do
            {
label1:
                {
                    if (i1 >= 5)
                    {
                        break label1;
                    }
                    l = j1;
                    if (i() >= 0)
                    {
                        break label0;
                    }
                    i1++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw InvalidProtocolBufferMicroException.malformedVarint();
    }

    private void h()
    {
        b = b + c;
        int l = g + b;
        if (l > h)
        {
            c = l - h;
            b = b - c;
            return;
        } else
        {
            c = 0;
            return;
        }
    }

    private byte i()
    {
        if (d == b)
        {
            a(true);
        }
        byte abyte0[] = a;
        int l = d;
        d = l + 1;
        return abyte0[l];
    }

    public final int a()
    {
        boolean flag;
        if (d == b && !a(false))
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
        f = g();
        if (f == 0)
        {
            throw InvalidProtocolBufferMicroException.invalidTag();
        } else
        {
            return f;
        }
    }

    public final void a(int l)
    {
        if (f != l)
        {
            throw InvalidProtocolBufferMicroException.invalidEndTag();
        } else
        {
            return;
        }
    }

    public final void a(c c1)
    {
        int l = g();
        if (i >= j)
        {
            throw InvalidProtocolBufferMicroException.recursionLimitExceeded();
        }
        if (l < 0)
        {
            throw InvalidProtocolBufferMicroException.negativeSize();
        }
        l += g + d;
        int i1 = h;
        if (l > i1)
        {
            throw InvalidProtocolBufferMicroException.truncatedMessage();
        } else
        {
            h = l;
            h();
            i = i + 1;
            c1.a(this);
            a(0);
            i = i - 1;
            h = i1;
            h();
            return;
        }
    }

    public final long b()
    {
        int l = 0;
        long l1 = 0L;
        for (; l < 64; l += 7)
        {
            byte byte0 = i();
            l1 |= (long)(byte0 & 0x7f) << l;
            if ((byte0 & 0x80) == 0)
            {
                return l1;
            }
        }

        throw InvalidProtocolBufferMicroException.malformedVarint();
    }

    public final boolean b(int l)
    {
        switch (com.google.protobuf.micro.d.a(l))
        {
        default:
            throw InvalidProtocolBufferMicroException.invalidWireType();

        case 0: // '\0'
            g();
            return true;

        case 1: // '\001'
            l = i();
            int i1 = i();
            int k1 = i();
            int l1 = i();
            int i2 = i();
            int j2 = i();
            int k2 = i();
            int l2 = i();
            long l3 = l;
            l3 = i1;
            l3 = k1;
            l3 = l1;
            l3 = i2;
            l3 = j2;
            l3 = k2;
            l3 = l2;
            return true;

        case 2: // '\002'
            d(g());
            return true;

        case 3: // '\003'
            int j1;
            do
            {
                j1 = a();
            } while (j1 != 0 && b(j1));
            a(com.google.protobuf.micro.d.a(com.google.protobuf.micro.d.b(l), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            i();
            i();
            i();
            i();
            return true;
        }
    }

    public final int c()
    {
        return g();
    }

    public final boolean d()
    {
        return g() != 0;
    }

    public final String e()
    {
        int l = g();
        if (l <= b - d && l > 0)
        {
            String s = new String(a, d, l, "UTF-8");
            d = l + d;
            return s;
        } else
        {
            return new String(c(l), "UTF-8");
        }
    }

    public final a f()
    {
        int l = g();
        if (l <= b - d && l > 0)
        {
            a a1 = com.google.protobuf.micro.a.a(a, d, l);
            d = l + d;
            return a1;
        } else
        {
            return com.google.protobuf.micro.a.a(c(l));
        }
    }
}
