// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;

import org.spongycastle.util.Memoable;
import org.spongycastle.util.MemoableResetException;
import org.spongycastle.util.Pack;

// Referenced classes of package org.spongycastle.crypto.digests:
//            LongDigest, GeneralDigest

public class SHA512tDigest extends LongDigest
{

    private static final String z[];
    private long H1t;
    private long H2t;
    private long H3t;
    private long H4t;
    private long H5t;
    private long H6t;
    private long H7t;
    private long H8t;
    private int digestLength;

    public SHA512tDigest(int i)
    {
        if (i >= 512)
        {
            throw new IllegalArgumentException(z[2]);
        }
        if (i % 8 != 0)
        {
            try
            {
                throw new IllegalArgumentException(z[4]);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }
        if (i == 384)
        {
            try
            {
                throw new IllegalArgumentException(z[3]);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        } else
        {
            digestLength = i / 8;
            tIvGenerate(digestLength * 8);
            reset();
            return;
        }
    }

    public SHA512tDigest(SHA512tDigest sha512tdigest)
    {
        super(sha512tdigest);
        digestLength = sha512tdigest.digestLength;
        reset(sha512tdigest);
    }

    public SHA512tDigest(byte abyte0[])
    {
        this(readDigestLength(abyte0));
        restoreState(abyte0);
    }

    private static void intToBigEndian(int i, byte abyte0[], int j, int k)
    {
        boolean flag = GeneralDigest.a;
        k = Math.min(4, k);
        do
        {
            k--;
            if (k < 0)
            {
                break;
            }
            abyte0[j + k] = (byte)(i >>> (3 - k) * 8);
        } while (!flag);
    }

    private static void longToBigEndian(long l, byte abyte0[], int i, int j)
    {
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        int k = (int)(l >>> 32);
        try
        {
            intToBigEndian(k, abyte0, i, j);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (j <= 4)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        intToBigEndian((int)(0xffffffffL & l), abyte0, i + 4, j - 4);
    }

    private static int readDigestLength(byte abyte0[])
    {
        return Pack.bigEndianToInt(abyte0, abyte0.length - 4);
    }

    private void tIvGenerate(int i)
    {
        boolean flag = GeneralDigest.a;
        H1 = 0xcfac43c256196cadL;
        H2 = 0x1ec20b20216f029eL;
        H3 = 0x99cb56d75b315d8eL;
        H4 = 0xea509ffab89354L;
        H5 = 0xf4abf7da08432774L;
        H6 = 0x3ea0cd298e9bc9baL;
        H7 = 0xba267c0e5ee418ceL;
        H8 = 0xfe4568bcb6db84dcL;
        update((byte)83);
        update((byte)72);
        update((byte)65);
        update((byte)45);
        update((byte)53);
        update((byte)49);
        update((byte)50);
        update((byte)47);
        if (i > 100)
        {
            update((byte)(i / 100 + 48));
            i %= 100;
            update((byte)(i / 10 + 48));
            i %= 10;
            byte byte0 = (byte)(i + 48);
            int j;
            try
            {
                update(byte0);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_219;
            }
        }
        j = i;
        if (i > 10)
        {
            update((byte)(i / 10 + 48));
            j = i % 10;
            byte0 = (byte)(j + 48);
            try
            {
                update(byte0);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_219;
            }
        }
        update((byte)(j + 48));
        finish();
        H1t = H1;
        H2t = H2;
        H3t = H3;
        H4t = H4;
        H5t = H5;
        H6t = H6;
        H7t = H7;
        H8t = H8;
        return;
    }

    public Memoable copy()
    {
        return new SHA512tDigest(this);
    }

    public int doFinal(byte abyte0[], int i)
    {
        finish();
        longToBigEndian(H1, abyte0, i, digestLength);
        longToBigEndian(H2, abyte0, i + 8, digestLength - 8);
        longToBigEndian(H3, abyte0, i + 16, digestLength - 16);
        longToBigEndian(H4, abyte0, i + 24, digestLength - 24);
        longToBigEndian(H5, abyte0, i + 32, digestLength - 32);
        longToBigEndian(H6, abyte0, i + 40, digestLength - 40);
        longToBigEndian(H7, abyte0, i + 48, digestLength - 48);
        longToBigEndian(H8, abyte0, i + 56, digestLength - 56);
        reset();
        return digestLength;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(z[0]).append(Integer.toString(digestLength * 8)).toString();
    }

    public int getDigestSize()
    {
        return digestLength;
    }

    public byte[] getEncodedState()
    {
        int i = getEncodedStateSize();
        byte abyte0[] = new byte[i + 4];
        populateState(abyte0);
        Pack.intToBigEndian(digestLength * 8, abyte0, i);
        return abyte0;
    }

    public void reset()
    {
        super.reset();
        H1 = H1t;
        H2 = H2t;
        H3 = H3t;
        H4 = H4t;
        H5 = H5t;
        H6 = H6t;
        H7 = H7t;
        H8 = H8t;
    }

    public void reset(Memoable memoable)
    {
        memoable = (SHA512tDigest)memoable;
        try
        {
            if (digestLength != ((SHA512tDigest) (memoable)).digestLength)
            {
                throw new MemoableResetException(z[1]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Memoable memoable)
        {
            throw memoable;
        }
        super.copyIn(memoable);
        H1t = ((SHA512tDigest) (memoable)).H1t;
        H2t = ((SHA512tDigest) (memoable)).H2t;
        H3t = ((SHA512tDigest) (memoable)).H3t;
        H4t = ((SHA512tDigest) (memoable)).H4t;
        H5t = ((SHA512tDigest) (memoable)).H5t;
        H6t = ((SHA512tDigest) (memoable)).H6t;
        H7t = ((SHA512tDigest) (memoable)).H7t;
        H8t = ((SHA512tDigest) (memoable)).H8t;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "wO>@}\0255P".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        char ac[];
        char c;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "@n\030\b;PK\032\003/Po_\004&Ew\017\037'Tu\026\f<A'\026\003hKs\027\b:".toCharArray();
            j = obj1.length;
            i = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 228
    //                   0 251
    //                   1 258
    //                   2 265
    //                   3 272;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_272;
_L1:
        byte0 = 72;
_L7:
        obj[i] = (char)(byte0 ^ c);
        i++;
          goto _L6
_L2:
        byte0 = 36;
          goto _L7
_L3:
        byte0 = 7;
          goto _L7
_L4:
        byte0 = 127;
          goto _L7
        byte0 = 109;
          goto _L7
_L13:
        byte byte0;
        if (j <= i)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "Fn\013!-J`\013\005hGf\021\003'P'\035\bh\032:_Xy\026".toCharArray();
            j = obj2.length;
            i = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c = obj1[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 320
    //                   0 343
    //                   1 350
    //                   2 357
    //                   3 364;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_364;
_L8:
        byte1 = 72;
_L14:
        obj1[i] = (char)(byte1 ^ c);
        i++;
          goto _L13
_L9:
        byte1 = 36;
          goto _L14
_L10:
        byte1 = 7;
          goto _L14
_L11:
        byte1 = 127;
          goto _L14
        byte1 = 109;
          goto _L14
_L20:
        byte byte1;
        if (j <= i)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "Fn\013!-J`\013\005hGf\021\003'P'\035\bh\027?KM=Wb_>\000e4GYhMi\f\031-Ec".toCharArray();
            j = obj3.length;
            i = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c = obj2[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 412
    //                   0 435
    //                   1 442
    //                   2 449
    //                   3 456;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_456;
_L15:
        byte2 = 72;
_L21:
        obj2[i] = (char)(byte2 ^ c);
        i++;
          goto _L20
_L16:
        byte2 = 36;
          goto _L21
_L17:
        byte2 = 7;
          goto _L21
_L18:
        byte2 = 127;
          goto _L21
        byte2 = 109;
          goto _L21
_L27:
        byte byte2;
        if (j <= i)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            ac = "Fn\013!-J`\013\005hJb\032\t;\004s\020M*A'\036M%Qk\013\0048Hb_\002.\004?".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c = obj3[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 504
    //                   0 527
    //                   1 534
    //                   2 541
    //                   3 548;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_548;
_L22:
        byte3 = 72;
_L28:
        obj3[i] = (char)(byte3 ^ c);
        i++;
          goto _L27
_L23:
        byte3 = 36;
          goto _L28
_L24:
        byte3 = 7;
          goto _L28
_L25:
        byte3 = 127;
          goto _L28
        byte3 = 109;
          goto _L28
_L35:
        byte byte3;
        if (j <= i)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, (new String(ac)).intern()
            });
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 596
    //                   0 620
    //                   1 627
    //                   2 634
    //                   3 641;
           goto _L29 _L30 _L31 _L32 _L33
_L30:
        break; /* Loop/switch isn't completed */
_L33:
        break MISSING_BLOCK_LABEL_641;
_L29:
        byte byte4 = 72;
_L36:
        ac[i] = (char)(byte4 ^ c);
        i++;
        if (true) goto _L35; else goto _L34
_L34:
        byte4 = 36;
          goto _L36
_L31:
        byte4 = 7;
          goto _L36
_L32:
        byte4 = 127;
          goto _L36
        byte4 = 109;
          goto _L36
    }
}
