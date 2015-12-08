// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.e.a;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

// Referenced classes of package com.google.e.a:
//            b

public final class com.google.e.a.a
{
    public static class a extends IOException
    {

        a(int i, int j)
        {
            String s = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space (pos ");
            super((new StringBuilder(String.valueOf(s).length() + 31)).append(s).append(i).append(" limit ").append(j).append(").").toString());
        }
    }


    private final ByteBuffer a;

    private com.google.e.a.a(ByteBuffer bytebuffer)
    {
        a = bytebuffer;
        a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private com.google.e.a.a(byte abyte0[], int i, int j)
    {
        this(ByteBuffer.wrap(abyte0, i, j));
    }

    private static int a(CharSequence charsequence)
    {
_L2:
        int j;
        int k = i;
        if (j < l)
        {
            k = charsequence.charAt(j);
            if (k < 2048)
            {
                j++;
                i = (127 - k >>> 31) + i;
                continue; /* Loop/switch isn't completed */
            }
            k = i + a(charsequence, j);
        }
        if (k < l)
        {
            long l1 = k;
            throw new IllegalArgumentException((new StringBuilder(54)).append("UTF-8 length does not fit in int: ").append(l1 + 0x100000000L).toString());
        } else
        {
            return k;
        }
        int l = charsequence.length();
        int i;
        for (i = 0; i < l && charsequence.charAt(i) < '\200'; i++) { }
        j = i;
        i = l;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static int a(CharSequence charsequence, int i)
    {
        int i1 = charsequence.length();
        int j = 0;
        while (i < i1) 
        {
            char c1 = charsequence.charAt(i);
            int k;
            if (c1 < '\u0800')
            {
                j += 127 - c1 >>> 31;
                k = i;
            } else
            {
                int l = j + 2;
                k = i;
                j = l;
                if ('\uD800' <= c1)
                {
                    k = i;
                    j = l;
                    if (c1 <= '\uDFFF')
                    {
                        if (Character.codePointAt(charsequence, i) < 0x10000)
                        {
                            throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(i).toString());
                        }
                        k = i + 1;
                        j = l;
                    }
                }
            }
            i = k + 1;
        }
        return j;
    }

    private static int a(CharSequence charsequence, byte abyte0[], int i, int j)
    {
        int l1;
        int i2;
        l1 = charsequence.length();
        boolean flag = false;
        i2 = i + j;
        j = ((flag) ? 1 : 0);
        do
        {
            if (j >= l1 || j + i >= i2)
            {
                break;
            }
            char c3 = charsequence.charAt(j);
            if (c3 >= '\200')
            {
                break;
            }
            abyte0[i + j] = (byte)c3;
            j++;
        } while (true);
        if (j == l1)
        {
            return i + l1;
        }
        i += j;
_L2:
        char c1;
        if (j >= l1)
        {
            break MISSING_BLOCK_LABEL_483;
        }
        c1 = charsequence.charAt(j);
        if (c1 >= '\200' || i >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        int k = i + 1;
        abyte0[i] = (byte)c1;
        i = k;
_L3:
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c1 < '\u0800' && i <= i2 - 2)
        {
            int l = i + 1;
            abyte0[i] = (byte)(c1 >>> 6 | 0x3c0);
            i = l + 1;
            abyte0[l] = (byte)(c1 & 0x3f | 0x80);
        } else
        if ((c1 < '\uD800' || '\uDFFF' < c1) && i <= i2 - 3)
        {
            int i1 = i + 1;
            abyte0[i] = (byte)(c1 >>> 12 | 0x1e0);
            int j2 = i1 + 1;
            abyte0[i1] = (byte)(c1 >>> 6 & 0x3f | 0x80);
            i = j2 + 1;
            abyte0[j2] = (byte)(c1 & 0x3f | 0x80);
        } else
        {
label0:
            {
                char c2;
label1:
                {
                    if (i > i2 - 4)
                    {
                        break label0;
                    }
                    int j1 = j;
                    if (j + 1 != charsequence.length())
                    {
                        j++;
                        c2 = charsequence.charAt(j);
                        if (Character.isSurrogatePair(c1, c2))
                        {
                            break label1;
                        }
                        j1 = j;
                    }
                    throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(j1 - 1).toString());
                }
                int k1 = Character.toCodePoint(c1, c2);
                int k2 = i + 1;
                abyte0[i] = (byte)(k1 >>> 18 | 0xf0);
                i = k2 + 1;
                abyte0[k2] = (byte)(k1 >>> 12 & 0x3f | 0x80);
                k2 = i + 1;
                abyte0[i] = (byte)(k1 >>> 6 & 0x3f | 0x80);
                i = k2 + 1;
                abyte0[k2] = (byte)(k1 & 0x3f | 0x80);
            }
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
        throw new ArrayIndexOutOfBoundsException((new StringBuilder(37)).append("Failed writing ").append(c1).append(" at index ").append(i).toString());
        return i;
    }

    public static com.google.e.a.a a(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public static com.google.e.a.a a(byte abyte0[], int i, int j)
    {
        return new com.google.e.a.a(abyte0, i, j);
    }

    private static void a(CharSequence charsequence, ByteBuffer bytebuffer)
    {
        if (bytebuffer.isReadOnly())
        {
            throw new ReadOnlyBufferException();
        }
        if (bytebuffer.hasArray())
        {
            try
            {
                bytebuffer.position(a(charsequence, bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining()) - bytebuffer.arrayOffset());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (CharSequence charsequence)
            {
                bytebuffer = new BufferOverflowException();
            }
            bytebuffer.initCause(charsequence);
            throw bytebuffer;
        } else
        {
            b(charsequence, bytebuffer);
            return;
        }
    }

    private static void b(CharSequence charsequence, ByteBuffer bytebuffer)
    {
        int i;
        int l;
        l = charsequence.length();
        i = 0;
_L2:
        char c1;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        c1 = charsequence.charAt(i);
        if (c1 >= '\200')
        {
            break; /* Loop/switch isn't completed */
        }
        bytebuffer.put((byte)c1);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c1 < '\u0800')
        {
            bytebuffer.put((byte)(c1 >>> 6 | 0x3c0));
            bytebuffer.put((byte)(c1 & 0x3f | 0x80));
        } else
        if (c1 < '\uD800' || '\uDFFF' < c1)
        {
            bytebuffer.put((byte)(c1 >>> 12 | 0x1e0));
            bytebuffer.put((byte)(c1 >>> 6 & 0x3f | 0x80));
            bytebuffer.put((byte)(c1 & 0x3f | 0x80));
        } else
        {
            char c2;
label0:
            {
                int j = i;
                if (i + 1 != charsequence.length())
                {
                    i++;
                    c2 = charsequence.charAt(i);
                    if (Character.isSurrogatePair(c1, c2))
                    {
                        break label0;
                    }
                    j = i;
                }
                throw new IllegalArgumentException((new StringBuilder(39)).append("Unpaired surrogate at index ").append(j - 1).toString());
            }
            int k = Character.toCodePoint(c1, c2);
            bytebuffer.put((byte)(k >>> 18 | 0xf0));
            bytebuffer.put((byte)(k >>> 12 & 0x3f | 0x80));
            bytebuffer.put((byte)(k >>> 6 & 0x3f | 0x80));
            bytebuffer.put((byte)(k & 0x3f | 0x80));
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static int c(int i)
    {
        if ((i & 0xffffff80) == 0)
        {
            return 1;
        }
        if ((i & 0xffffc000) == 0)
        {
            return 2;
        }
        if ((0xffe00000 & i) == 0)
        {
            return 3;
        }
        return (0xf0000000 & i) != 0 ? 5 : 4;
    }

    public int a()
    {
        return a.remaining();
    }

    public void a(byte byte0)
        throws IOException
    {
        if (!a.hasRemaining())
        {
            throw new a(a.position(), a.limit());
        } else
        {
            a.put(byte0);
            return;
        }
    }

    public void a(int i)
        throws IOException
    {
        a((byte)i);
    }

    public void a(int i, int j)
        throws IOException
    {
        b(com.google.e.a.b.a(i, j));
    }

    public void a(int i, long l)
        throws IOException
    {
        a(i, 0);
        a(l);
    }

    public void a(int i, String s)
        throws IOException
    {
        a(i, 2);
        a(s);
    }

    public void a(long l)
        throws IOException
    {
        b(l);
    }

    public void a(String s)
        throws IOException
    {
        a a1;
        int i;
        int j;
        i = c(s.length());
        if (i != c(s.length() * 3))
        {
            break MISSING_BLOCK_LABEL_152;
        }
        j = a.position();
        if (a.remaining() < i)
        {
            throw new a(i + j, a.limit());
        }
        try
        {
            a.position(j + i);
            a(((CharSequence) (s)), a);
            int k = a.position();
            a.position(j);
            b(k - j - i);
            a.position(k);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a1 = new a(a.position(), a.limit());
            a1.initCause(s);
            throw a1;
        }
        b(a(((CharSequence) (s))));
        a(((CharSequence) (s)), a);
        return;
    }

    public void b(int i)
        throws IOException
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                a(i);
                return;
            }
            a(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public void b(long l)
        throws IOException
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                a((int)l);
                return;
            }
            a((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }
}
