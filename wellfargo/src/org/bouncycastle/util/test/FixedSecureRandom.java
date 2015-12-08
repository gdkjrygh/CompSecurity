// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.util.test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;

public class FixedSecureRandom extends SecureRandom
{

    private byte _data[];
    private int _index;
    private int _intPad;

    public FixedSecureRandom(boolean flag, byte abyte0[])
    {
        this(flag, new byte[][] {
            abyte0
        });
    }

    public FixedSecureRandom(boolean flag, byte abyte0[][])
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        int i = 0;
        while (i != abyte0.length) 
        {
            try
            {
                bytearrayoutputstream.write(abyte0[i]);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[][])
            {
                throw new IllegalArgumentException("can't save value array.");
            }
            i++;
        }
        _data = bytearrayoutputstream.toByteArray();
        if (flag)
        {
            _intPad = _data.length % 4;
        }
    }

    public FixedSecureRandom(byte abyte0[])
    {
        this(false, new byte[][] {
            abyte0
        });
    }

    public FixedSecureRandom(byte abyte0[][])
    {
        this(false, abyte0);
    }

    private int nextValue()
    {
        byte abyte0[] = _data;
        int i = _index;
        _index = i + 1;
        return abyte0[i] & 0xff;
    }

    public boolean isExhausted()
    {
        return _index == _data.length;
    }

    public void nextBytes(byte abyte0[])
    {
        System.arraycopy(_data, _index, abyte0, 0, abyte0.length);
        _index = _index + abyte0.length;
    }

    public int nextInt()
    {
        int i = 0 | nextValue() << 24 | nextValue() << 16;
        if (_intPad == 2)
        {
            _intPad = _intPad - 1;
        } else
        {
            i |= nextValue() << 8;
        }
        if (_intPad == 1)
        {
            _intPad = _intPad - 1;
            return i;
        } else
        {
            return i | nextValue();
        }
    }

    public long nextLong()
    {
        return 0L | (long)nextValue() << 56 | (long)nextValue() << 48 | (long)nextValue() << 40 | (long)nextValue() << 32 | (long)nextValue() << 24 | (long)nextValue() << 16 | (long)nextValue() << 8 | (long)nextValue();
    }
}
