// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrx, zzsa

public final class zzrq
{
    public static class zza extends IOException
    {

        zza(int i, int j)
        {
            super((new StringBuilder()).append("CodedOutputStream was writing to a flat byte array and ran out of space (pos ").append(i).append(" limit ").append(j).append(").").toString());
        }
    }


    private final ByteBuffer zzbbZ;

    private zzrq(ByteBuffer bytebuffer)
    {
        zzbbZ = bytebuffer;
    }

    private zzrq(byte abyte0[], int i, int j)
    {
        this(ByteBuffer.wrap(abyte0, i, j));
    }

    public static zzrq zzA(byte abyte0[])
    {
        return zzb(abyte0, 0, abyte0.length);
    }

    public static int zzB(int i, int j)
    {
        return zzlv(i) + zzls(j);
    }

    public static int zzC(int i, int j)
    {
        return zzlv(i) + zzlt(j);
    }

    public static int zzC(byte abyte0[])
    {
        return zzlx(abyte0.length) + abyte0.length;
    }

    public static int zzY(long l)
    {
        return zzab(l);
    }

    public static int zzZ(long l)
    {
        return zzab(zzad(l));
    }

    private static int zza(CharSequence charsequence, int i)
    {
        int i1 = charsequence.length();
        int j = 0;
        while (i < i1) 
        {
            char c = charsequence.charAt(i);
            int k;
            if (c < '\u0800')
            {
                j += 127 - c >>> 31;
                k = i;
            } else
            {
                int l = j + 2;
                k = i;
                j = l;
                if ('\uD800' <= c)
                {
                    k = i;
                    j = l;
                    if (c <= '\uDFFF')
                    {
                        if (Character.codePointAt(charsequence, i) < 0x10000)
                        {
                            throw new IllegalArgumentException((new StringBuilder()).append("Unpaired surrogate at index ").append(i).toString());
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

    private static int zza(CharSequence charsequence, byte abyte0[], int i, int j)
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
            char c2 = charsequence.charAt(j);
            if (c2 >= '\200')
            {
                break;
            }
            abyte0[i + j] = (byte)c2;
            j++;
        } while (true);
        if (j == l1)
        {
            return i + l1;
        }
        i += j;
_L2:
        char c;
        if (j >= l1)
        {
            break MISSING_BLOCK_LABEL_479;
        }
        c = charsequence.charAt(j);
        if (c >= '\200' || i >= i2)
        {
            break; /* Loop/switch isn't completed */
        }
        int k = i + 1;
        abyte0[i] = (byte)c;
        i = k;
_L3:
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c < '\u0800' && i <= i2 - 2)
        {
            int l = i + 1;
            abyte0[i] = (byte)(c >>> 6 | 0x3c0);
            i = l + 1;
            abyte0[l] = (byte)(c & 0x3f | 0x80);
        } else
        if ((c < '\uD800' || '\uDFFF' < c) && i <= i2 - 3)
        {
            int i1 = i + 1;
            abyte0[i] = (byte)(c >>> 12 | 0x1e0);
            int j2 = i1 + 1;
            abyte0[i1] = (byte)(c >>> 6 & 0x3f | 0x80);
            i = j2 + 1;
            abyte0[j2] = (byte)(c & 0x3f | 0x80);
        } else
        {
label0:
            {
                char c1;
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
                        c1 = charsequence.charAt(j);
                        if (Character.isSurrogatePair(c, c1))
                        {
                            break label1;
                        }
                        j1 = j;
                    }
                    throw new IllegalArgumentException((new StringBuilder()).append("Unpaired surrogate at index ").append(j1 - 1).toString());
                }
                int k1 = Character.toCodePoint(c, c1);
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
        throw new ArrayIndexOutOfBoundsException((new StringBuilder()).append("Failed writing ").append(c).append(" at index ").append(i).toString());
        return i;
    }

    private static void zza(CharSequence charsequence, ByteBuffer bytebuffer)
    {
        if (bytebuffer.isReadOnly())
        {
            throw new ReadOnlyBufferException();
        }
        if (bytebuffer.hasArray())
        {
            try
            {
                bytebuffer.position(zza(charsequence, bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining()) - bytebuffer.arrayOffset());
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
            zzb(charsequence, bytebuffer);
            return;
        }
    }

    public static int zzab(long l)
    {
        if ((-128L & l) == 0L)
        {
            return 1;
        }
        if ((-16384L & l) == 0L)
        {
            return 2;
        }
        if ((0xffffffffffe00000L & l) == 0L)
        {
            return 3;
        }
        if ((0xfffffffff0000000L & l) == 0L)
        {
            return 4;
        }
        if ((0xfffffff800000000L & l) == 0L)
        {
            return 5;
        }
        if ((0xfffffc0000000000L & l) == 0L)
        {
            return 6;
        }
        if ((0xfffe000000000000L & l) == 0L)
        {
            return 7;
        }
        if ((0xff00000000000000L & l) == 0L)
        {
            return 8;
        }
        return (0x8000000000000000L & l) != 0L ? 10 : 9;
    }

    public static long zzad(long l)
    {
        return l << 1 ^ l >> 63;
    }

    public static int zzax(boolean flag)
    {
        return 1;
    }

    public static int zzb(int i, double d)
    {
        return zzlv(i) + zzj(d);
    }

    public static int zzb(int i, zzrx zzrx1)
    {
        return zzlv(i) * 2 + zzd(zzrx1);
    }

    public static int zzb(int i, byte abyte0[])
    {
        return zzlv(i) + zzC(abyte0);
    }

    public static zzrq zzb(byte abyte0[], int i, int j)
    {
        return new zzrq(abyte0, i, j);
    }

    private static void zzb(CharSequence charsequence, ByteBuffer bytebuffer)
    {
        int i;
        int l;
        l = charsequence.length();
        i = 0;
_L2:
        char c;
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        c = charsequence.charAt(i);
        if (c >= '\200')
        {
            break; /* Loop/switch isn't completed */
        }
        bytebuffer.put((byte)c);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (c < '\u0800')
        {
            bytebuffer.put((byte)(c >>> 6 | 0x3c0));
            bytebuffer.put((byte)(c & 0x3f | 0x80));
        } else
        if (c < '\uD800' || '\uDFFF' < c)
        {
            bytebuffer.put((byte)(c >>> 12 | 0x1e0));
            bytebuffer.put((byte)(c >>> 6 & 0x3f | 0x80));
            bytebuffer.put((byte)(c & 0x3f | 0x80));
        } else
        {
            char c1;
label0:
            {
                int j = i;
                if (i + 1 != charsequence.length())
                {
                    i++;
                    c1 = charsequence.charAt(i);
                    if (Character.isSurrogatePair(c, c1))
                    {
                        break label0;
                    }
                    j = i;
                }
                throw new IllegalArgumentException((new StringBuilder()).append("Unpaired surrogate at index ").append(j - 1).toString());
            }
            int k = Character.toCodePoint(c, c1);
            bytebuffer.put((byte)(k >>> 18 | 0xf0));
            bytebuffer.put((byte)(k >>> 12 & 0x3f | 0x80));
            bytebuffer.put((byte)(k >>> 6 & 0x3f | 0x80));
            bytebuffer.put((byte)(k & 0x3f | 0x80));
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static int zzc(int i, float f)
    {
        return zzlv(i) + zzj(f);
    }

    public static int zzc(int i, zzrx zzrx1)
    {
        return zzlv(i) + zze(zzrx1);
    }

    public static int zzc(int i, boolean flag)
    {
        return zzlv(i) + zzax(flag);
    }

    private static int zzc(CharSequence charsequence)
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
            k = i + zza(charsequence, j);
        }
        if (k < l)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("UTF-8 length does not fit in int: ").append((long)k + 0x100000000L).toString());
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

    public static int zzd(int i, long l)
    {
        return zzlv(i) + zzY(l);
    }

    public static int zzd(zzrx zzrx1)
    {
        return zzrx1.zzDx();
    }

    public static int zze(int i, long l)
    {
        return zzlv(i) + zzZ(l);
    }

    public static int zze(zzrx zzrx1)
    {
        int i = zzrx1.zzDx();
        return i + zzlx(i);
    }

    public static int zzfy(String s)
    {
        int i = zzc(s);
        return i + zzlx(i);
    }

    public static int zzj(double d)
    {
        return 8;
    }

    public static int zzj(float f)
    {
        return 4;
    }

    public static int zzl(int i, String s)
    {
        return zzlv(i) + zzfy(s);
    }

    public static int zzls(int i)
    {
        if (i >= 0)
        {
            return zzlx(i);
        } else
        {
            return 10;
        }
    }

    public static int zzlt(int i)
    {
        return zzlx(zzlz(i));
    }

    public static int zzlv(int i)
    {
        return zzlx(zzsa.zzE(i, 0));
    }

    public static int zzlx(int i)
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

    public static int zzlz(int i)
    {
        return i << 1 ^ i >> 31;
    }

    public void zzA(int i, int j)
        throws IOException
    {
        zzD(i, 0);
        zzlr(j);
    }

    public void zzB(byte abyte0[])
        throws IOException
    {
        zzlw(abyte0.length);
        zzD(abyte0);
    }

    public void zzD(int i, int j)
        throws IOException
    {
        zzlw(zzsa.zzE(i, j));
    }

    public void zzD(byte abyte0[])
        throws IOException
    {
        zzc(abyte0, 0, abyte0.length);
    }

    public int zzDi()
    {
        return zzbbZ.remaining();
    }

    public void zzDj()
    {
        if (zzDi() != 0)
        {
            throw new IllegalStateException("Did not write as much data as expected.");
        } else
        {
            return;
        }
    }

    public void zzW(long l)
        throws IOException
    {
        zzaa(l);
    }

    public void zzX(long l)
        throws IOException
    {
        zzaa(zzad(l));
    }

    public void zza(int i, double d)
        throws IOException
    {
        zzD(i, 1);
        zzi(d);
    }

    public void zza(int i, zzrx zzrx1)
        throws IOException
    {
        zzD(i, 2);
        zzc(zzrx1);
    }

    public void zza(int i, byte abyte0[])
        throws IOException
    {
        zzD(i, 2);
        zzB(abyte0);
    }

    public void zzaa(long l)
        throws IOException
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                zzlu((int)l);
                return;
            }
            zzlu((int)l & 0x7f | 0x80);
            l >>>= 7;
        } while (true);
    }

    public void zzac(long l)
        throws IOException
    {
        zzlu((int)l & 0xff);
        zzlu((int)(l >> 8) & 0xff);
        zzlu((int)(l >> 16) & 0xff);
        zzlu((int)(l >> 24) & 0xff);
        zzlu((int)(l >> 32) & 0xff);
        zzlu((int)(l >> 40) & 0xff);
        zzlu((int)(l >> 48) & 0xff);
        zzlu((int)(l >> 56) & 0xff);
    }

    public void zzaw(boolean flag)
        throws IOException
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        zzlu(i);
    }

    public void zzb(byte byte0)
        throws IOException
    {
        if (!zzbbZ.hasRemaining())
        {
            throw new zza(zzbbZ.position(), zzbbZ.limit());
        } else
        {
            zzbbZ.put(byte0);
            return;
        }
    }

    public void zzb(int i, float f)
        throws IOException
    {
        zzD(i, 5);
        zzi(f);
    }

    public void zzb(int i, long l)
        throws IOException
    {
        zzD(i, 0);
        zzW(l);
    }

    public void zzb(int i, String s)
        throws IOException
    {
        zzD(i, 2);
        zzfx(s);
    }

    public void zzb(int i, boolean flag)
        throws IOException
    {
        zzD(i, 0);
        zzaw(flag);
    }

    public void zzb(zzrx zzrx1)
        throws IOException
    {
        zzrx1.zza(this);
    }

    public void zzc(int i, long l)
        throws IOException
    {
        zzD(i, 0);
        zzX(l);
    }

    public void zzc(zzrx zzrx1)
        throws IOException
    {
        zzlw(zzrx1.zzDw());
        zzrx1.zza(this);
    }

    public void zzc(byte abyte0[], int i, int j)
        throws IOException
    {
        if (zzbbZ.remaining() >= j)
        {
            zzbbZ.put(abyte0, i, j);
            return;
        } else
        {
            throw new zza(zzbbZ.position(), zzbbZ.limit());
        }
    }

    public void zzfx(String s)
        throws IOException
    {
        try
        {
            int i = zzlx(s.length());
            if (i == zzlx(s.length() * 3))
            {
                int j = zzbbZ.position();
                zzbbZ.position(j + i);
                zza(s, zzbbZ);
                int k = zzbbZ.position();
                zzbbZ.position(j);
                zzlw(k - j - i);
                zzbbZ.position(k);
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new zza(zzbbZ.position(), zzbbZ.limit());
        }
        zzlw(zzc(s));
        zza(s, zzbbZ);
        return;
    }

    public void zzi(double d)
        throws IOException
    {
        zzac(Double.doubleToLongBits(d));
    }

    public void zzi(float f)
        throws IOException
    {
        zzly(Float.floatToIntBits(f));
    }

    public void zzlq(int i)
        throws IOException
    {
        if (i >= 0)
        {
            zzlw(i);
            return;
        } else
        {
            zzaa(i);
            return;
        }
    }

    public void zzlr(int i)
        throws IOException
    {
        zzlw(zzlz(i));
    }

    public void zzlu(int i)
        throws IOException
    {
        zzb((byte)i);
    }

    public void zzlw(int i)
        throws IOException
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                zzlu(i);
                return;
            }
            zzlu(i & 0x7f | 0x80);
            i >>>= 7;
        } while (true);
    }

    public void zzly(int i)
        throws IOException
    {
        zzlu(i & 0xff);
        zzlu(i >> 8 & 0xff);
        zzlu(i >> 16 & 0xff);
        zzlu(i >> 24 & 0xff);
    }

    public void zzz(int i, int j)
        throws IOException
    {
        zzD(i, 0);
        zzlq(j);
    }
}
