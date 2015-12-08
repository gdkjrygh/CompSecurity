// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import com.google.common.base.Preconditions;
import java.nio.charset.Charset;

// Referenced classes of package com.google.common.hash:
//            AbstractStreamingHashFunction, Hasher, HashFunction, HashCode, 
//            PrimitiveSink, Funnel

abstract class AbstractCompositeHashFunction extends AbstractStreamingHashFunction
{

    private static final long serialVersionUID = 0L;
    final HashFunction functions[];

    transient AbstractCompositeHashFunction(HashFunction ahashfunction[])
    {
        int j = ahashfunction.length;
        for (int i = 0; i < j; i++)
        {
            Preconditions.checkNotNull(ahashfunction[i]);
        }

        functions = ahashfunction;
    }

    abstract HashCode makeHash(Hasher ahasher[]);

    public Hasher newHasher()
    {
        final Hasher hashers[] = new Hasher[functions.length];
        for (int i = 0; i < hashers.length; i++)
        {
            hashers[i] = functions[i].newHasher();
        }

        return new Hasher() {

            final AbstractCompositeHashFunction this$0;
            final Hasher val$hashers[];

            public HashCode hash()
            {
                return makeHash(hashers);
            }

            public Hasher putBoolean(boolean flag)
            {
                Hasher ahasher[] = hashers;
                int k = ahasher.length;
                for (int j = 0; j < k; j++)
                {
                    ahasher[j].putBoolean(flag);
                }

                return this;
            }

            public volatile PrimitiveSink putBoolean(boolean flag)
            {
                return putBoolean(flag);
            }

            public Hasher putByte(byte byte0)
            {
                Hasher ahasher[] = hashers;
                int k = ahasher.length;
                for (int j = 0; j < k; j++)
                {
                    ahasher[j].putByte(byte0);
                }

                return this;
            }

            public volatile PrimitiveSink putByte(byte byte0)
            {
                return putByte(byte0);
            }

            public Hasher putBytes(byte abyte0[])
            {
                Hasher ahasher[] = hashers;
                int k = ahasher.length;
                for (int j = 0; j < k; j++)
                {
                    ahasher[j].putBytes(abyte0);
                }

                return this;
            }

            public Hasher putBytes(byte abyte0[], int j, int k)
            {
                Hasher ahasher[] = hashers;
                int i1 = ahasher.length;
                for (int l = 0; l < i1; l++)
                {
                    ahasher[l].putBytes(abyte0, j, k);
                }

                return this;
            }

            public volatile PrimitiveSink putBytes(byte abyte0[])
            {
                return putBytes(abyte0);
            }

            public volatile PrimitiveSink putBytes(byte abyte0[], int j, int k)
            {
                return putBytes(abyte0, j, k);
            }

            public Hasher putChar(char c)
            {
                Hasher ahasher[] = hashers;
                int k = ahasher.length;
                for (int j = 0; j < k; j++)
                {
                    ahasher[j].putChar(c);
                }

                return this;
            }

            public volatile PrimitiveSink putChar(char c)
            {
                return putChar(c);
            }

            public Hasher putDouble(double d)
            {
                Hasher ahasher[] = hashers;
                int k = ahasher.length;
                for (int j = 0; j < k; j++)
                {
                    ahasher[j].putDouble(d);
                }

                return this;
            }

            public volatile PrimitiveSink putDouble(double d)
            {
                return putDouble(d);
            }

            public Hasher putFloat(float f)
            {
                Hasher ahasher[] = hashers;
                int k = ahasher.length;
                for (int j = 0; j < k; j++)
                {
                    ahasher[j].putFloat(f);
                }

                return this;
            }

            public volatile PrimitiveSink putFloat(float f)
            {
                return putFloat(f);
            }

            public Hasher putInt(int j)
            {
                Hasher ahasher[] = hashers;
                int l = ahasher.length;
                for (int k = 0; k < l; k++)
                {
                    ahasher[k].putInt(j);
                }

                return this;
            }

            public volatile PrimitiveSink putInt(int j)
            {
                return putInt(j);
            }

            public Hasher putLong(long l)
            {
                Hasher ahasher[] = hashers;
                int k = ahasher.length;
                for (int j = 0; j < k; j++)
                {
                    ahasher[j].putLong(l);
                }

                return this;
            }

            public volatile PrimitiveSink putLong(long l)
            {
                return putLong(l);
            }

            public Hasher putObject(Object obj, Funnel funnel)
            {
                Hasher ahasher[] = hashers;
                int k = ahasher.length;
                for (int j = 0; j < k; j++)
                {
                    ahasher[j].putObject(obj, funnel);
                }

                return this;
            }

            public Hasher putShort(short word0)
            {
                Hasher ahasher[] = hashers;
                int k = ahasher.length;
                for (int j = 0; j < k; j++)
                {
                    ahasher[j].putShort(word0);
                }

                return this;
            }

            public volatile PrimitiveSink putShort(short word0)
            {
                return putShort(word0);
            }

            public Hasher putString(CharSequence charsequence, Charset charset)
            {
                Hasher ahasher[] = hashers;
                int k = ahasher.length;
                for (int j = 0; j < k; j++)
                {
                    ahasher[j].putString(charsequence, charset);
                }

                return this;
            }

            public volatile PrimitiveSink putString(CharSequence charsequence, Charset charset)
            {
                return putString(charsequence, charset);
            }

            public Hasher putUnencodedChars(CharSequence charsequence)
            {
                Hasher ahasher[] = hashers;
                int k = ahasher.length;
                for (int j = 0; j < k; j++)
                {
                    ahasher[j].putUnencodedChars(charsequence);
                }

                return this;
            }

            public volatile PrimitiveSink putUnencodedChars(CharSequence charsequence)
            {
                return putUnencodedChars(charsequence);
            }

            
            {
                this$0 = AbstractCompositeHashFunction.this;
                hashers = ahasher;
                super();
            }
        };
    }
}
