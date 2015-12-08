// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.protobuf.nano;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.protobuf.nano:
//            CodedOutputByteBufferNano, InvalidProtocolBufferNanoException, a, d

public abstract class c
{

    protected int dm;

    public c()
    {
        dm = -1;
    }

    public static final c a(c c1, byte abyte0[])
    {
        return b(c1, abyte0, 0, abyte0.length);
    }

    private static void a(c c1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = CodedOutputByteBufferNano.a(abyte0, 0, j);
            c1.a(((CodedOutputByteBufferNano) (abyte0)));
            abyte0.b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", c1);
        }
    }

    public static final boolean a(c c1, c c2)
    {
        boolean flag1 = false;
        boolean flag;
        if (c1 == c2)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (c1 != null)
            {
                flag = flag1;
                if (c2 != null)
                {
                    flag = flag1;
                    if (c1.getClass() == c2.getClass())
                    {
                        int i = c1.a();
                        flag = flag1;
                        if (c2.a() == i)
                        {
                            byte abyte0[] = new byte[i];
                            byte abyte1[] = new byte[i];
                            a(c1, abyte0, 0, i);
                            a(c2, abyte1, 0, i);
                            return Arrays.equals(abyte0, abyte1);
                        }
                    }
                }
            }
        }
        return flag;
    }

    public static final byte[] a(c c1)
    {
        byte abyte0[] = new byte[c1.a()];
        a(c1, abyte0, 0, abyte0.length);
        return abyte0;
    }

    private static c b(c c1, byte abyte0[], int i, int j)
    {
        try
        {
            abyte0 = com.google.protobuf.nano.a.a(abyte0, 0, j);
            c1.a(abyte0);
            abyte0.a(0);
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            throw c1;
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
        return c1;
    }

    public int a()
    {
        dm = 0;
        return 0;
    }

    public abstract c a(a a1);

    public abstract void a(CodedOutputByteBufferNano codedoutputbytebuffernano);

    public final int b()
    {
        if (dm < 0)
        {
            a();
        }
        return dm;
    }

    public String toString()
    {
        return d.a(this);
    }
}
