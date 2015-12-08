// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.NTRUEncryptionParameters;

public class IndexGenerator
{

    private int N;
    private BitString buf;
    private int c;
    private int counter;
    private int hLen;
    private Digest hashAlg;
    private boolean initialized;
    private int minCallsR;
    private int remLen;
    private byte seed[];
    private int totLen;

    IndexGenerator(byte abyte0[], NTRUEncryptionParameters ntruencryptionparameters)
    {
        seed = abyte0;
        N = ntruencryptionparameters.N;
        c = ntruencryptionparameters.c;
        minCallsR = ntruencryptionparameters.minCallsR;
        totLen = 0;
        remLen = 0;
        counter = 0;
        hashAlg = ntruencryptionparameters.hashAlg;
        hLen = hashAlg.getDigestSize();
        initialized = false;
    }

    private void appendHash(BitString bitstring, byte abyte0[])
    {
        hashAlg.update(seed, 0, seed.length);
        putInt(hashAlg, counter);
        hashAlg.doFinal(abyte0, 0);
        bitstring.appendBits(abyte0);
    }

    private static byte[] copyOf(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[i];
        if (i >= abyte0.length)
        {
            i = abyte0.length;
        }
        System.arraycopy(abyte0, 0, abyte1, 0, i);
        return abyte1;
    }

    private void putInt(Digest digest, int i)
    {
        digest.update((byte)(i >> 24));
        digest.update((byte)(i >> 16));
        digest.update((byte)(i >> 8));
        digest.update((byte)i);
    }

    int nextIndex()
    {
        if (!initialized)
        {
            buf = new BitString();
            byte abyte0[] = new byte[hashAlg.getDigestSize()];
            for (; counter < minCallsR; counter = counter + 1)
            {
                appendHash(buf, abyte0);
            }

            totLen = minCallsR * 8 * hLen;
            remLen = totLen;
            initialized = true;
        }
        do
        {
            totLen = totLen + c;
            BitString bitstring = buf.getTrailing(remLen);
            int j;
            if (remLen < c)
            {
                int i = c - remLen;
                int k = counter;
                int l = ((hLen + i) - 1) / hLen;
                byte abyte1[] = new byte[hashAlg.getDigestSize()];
                do
                {
                    if (counter >= k + l)
                    {
                        break;
                    }
                    appendHash(bitstring, abyte1);
                    counter = counter + 1;
                    if (i > hLen * 8)
                    {
                        i -= hLen * 8;
                    }
                } while (true);
                remLen = hLen * 8 - i;
                buf = new BitString();
                buf.appendBits(abyte1);
            } else
            {
                remLen = remLen - c;
            }
            j = bitstring.getLeadingAsInt(c);
        } while (j >= (1 << c) - (1 << c) % N);
        return j % N;
    }


    private class BitString
    {

        byte bytes[];
        int lastByteBits;
        int numBytes;

        public void appendBits(byte byte0)
        {
            if (numBytes == bytes.length)
            {
                bytes = IndexGenerator.copyOf(bytes, bytes.length * 2);
            }
            if (numBytes == 0)
            {
                numBytes = 1;
                bytes[0] = byte0;
                lastByteBits = 8;
                return;
            }
            if (lastByteBits == 8)
            {
                byte abyte0[] = bytes;
                int i = numBytes;
                numBytes = i + 1;
                abyte0[i] = byte0;
                return;
            } else
            {
                int j = lastByteBits;
                byte abyte1[] = bytes;
                int k = numBytes - 1;
                abyte1[k] = (byte)(abyte1[k] | (byte0 & 0xff) << lastByteBits);
                abyte1 = bytes;
                k = numBytes;
                numBytes = k + 1;
                abyte1[k] = (byte)((byte0 & 0xff) >> 8 - j);
                return;
            }
        }

        void appendBits(byte abyte0[])
        {
            for (int i = 0; i != abyte0.length; i++)
            {
                appendBits(abyte0[i]);
            }

        }

        public byte[] getBytes()
        {
            return Arrays.clone(bytes);
        }

        public int getLeadingAsInt(int i)
        {
            int j = ((numBytes - 1) * 8 + lastByteBits) - i;
            i = j / 8;
            j %= 8;
            int k = (bytes[i] & 0xff) >>> j;
            j = 8 - j;
            for (i++; i < numBytes; i++)
            {
                k |= (bytes[i] & 0xff) << j;
                j += 8;
            }

            return k;
        }

        public BitString getTrailing(int i)
        {
            BitString bitstring = new BitString();
            bitstring.numBytes = (i + 7) / 8;
            bitstring.bytes = new byte[bitstring.numBytes];
            for (int j = 0; j < bitstring.numBytes; j++)
            {
                bitstring.bytes[j] = bytes[j];
            }

            bitstring.lastByteBits = i % 8;
            if (bitstring.lastByteBits == 0)
            {
                bitstring.lastByteBits = 8;
                return bitstring;
            } else
            {
                i = 32 - bitstring.lastByteBits;
                bitstring.bytes[bitstring.numBytes - 1] = (byte)((bitstring.bytes[bitstring.numBytes - 1] << i) >>> i);
                return bitstring;
            }
        }

        public BitString()
        {
            bytes = new byte[4];
        }
    }

}
