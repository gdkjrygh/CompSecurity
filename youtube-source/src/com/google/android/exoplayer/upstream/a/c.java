// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.upstream.a;

import com.google.android.exoplayer.e.a;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class c
{

    private final Cipher a;
    private final int b;
    private final byte c[];
    private final byte d[];
    private int e;

    public c(int i, byte abyte0[], long l, long l1)
    {
        int j;
        try
        {
            a = Cipher.getInstance("AES/CTR/NoPadding");
            b = a.getBlockSize();
            c = new byte[b];
            d = new byte[b];
            long l2 = l1 / (long)b;
            j = (int)(l1 % (long)b);
            a.init(i, new SecretKeySpec(abyte0, a.getAlgorithm().split("/")[0]), new IvParameterSpec(ByteBuffer.allocate(16).putLong(l).putLong(l2).array()));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        a(new byte[j], 0, j);
    }

    private int b(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        try
        {
            i = a.update(abyte0, i, j, abyte1, k);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new RuntimeException(abyte0);
        }
        return i;
    }

    public final void a(byte abyte0[], int i, int j)
    {
        a(abyte0, i, j, abyte0, i);
    }

    public final void a(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int j1;
        boolean flag;
        boolean flag2;
        flag2 = true;
        flag = false;
        int l = j;
        j1 = i;
        j = k;
        i = l;
_L4:
        if (e <= 0) goto _L2; else goto _L1
_L1:
        abyte1[j] = (byte)(abyte0[j1] ^ d[b - e]);
        j++;
        j1++;
        e = e - 1;
        k = i - 1;
        i = k;
        if (k != 0) goto _L4; else goto _L3
_L3:
        return;
_L2:
        int i1 = b(abyte0, j1, i, abyte1, j);
        if (i != i1)
        {
            k = i - i1;
            boolean flag1;
            if (k < b)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            com.google.android.exoplayer.e.a.b(flag1);
            e = b - k;
            if (b(c, 0, e, d, 0) == b)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            com.google.android.exoplayer.e.a.b(flag1);
            i = j + i1;
            j = ((flag) ? 1 : 0);
            while (j < k) 
            {
                abyte1[i] = d[j];
                j++;
                i++;
            }
        }
        if (true) goto _L3; else goto _L5
_L5:
    }
}
