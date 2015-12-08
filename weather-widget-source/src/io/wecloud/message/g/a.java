// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.g;


public class a
{

    public byte a;
    private byte b[];
    private byte c[];

    public a()
    {
        b = new byte[4];
    }

    public a(byte byte0)
    {
        b = new byte[4];
        a = byte0;
    }

    public a(byte abyte0[], int i)
    {
        b = new byte[4];
        a = abyte0[0];
        System.arraycopy(abyte0, 1, b, 0, 4);
        c = new byte[i - 5];
        System.arraycopy(abyte0, 5, c, 0, i - 5);
    }

    public static byte[] a(int i)
    {
        return (new byte[] {
            (byte)(i >> 24), (byte)(i >> 16), (byte)(i >> 8), (byte)i
        });
    }

    public static int b(byte abyte0[])
    {
        if (abyte0.length < 4)
        {
            return 0;
        } else
        {
            return (abyte0[0] & 0xff) << 24 | (abyte0[1] & 0xff) << 16 | (abyte0[2] & 0xff) << 8 | abyte0[3] & 0xff;
        }
    }

    private void b(int i)
    {
        b = a(i);
    }

    public void a(byte abyte0[])
    {
        c = abyte0;
        b(abyte0.length);
    }

    public boolean a()
    {
        return b(b) == c.length;
    }

    public byte[] b()
    {
        byte abyte0[] = new byte[c.length + 5];
        abyte0[0] = a;
        System.arraycopy(b, 0, abyte0, 1, 4);
        System.arraycopy(c, 0, abyte0, 5, c.length);
        return abyte0;
    }

    public String c()
    {
        return new String(c, 0, c.length);
    }

    public int d()
    {
        return c.length + 5;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("[");
        stringbuffer.append(" command : ");
        stringbuffer.append(a);
        stringbuffer.append("; length : ");
        stringbuffer.append(b(b));
        stringbuffer.append("; data : ");
        stringbuffer.append(new String(c, 0, c.length));
        stringbuffer.append(" ]");
        return stringbuffer.toString();
    }
}
