// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.f;
import java.util.ArrayList;

public final class qc extends b
{

    public static final qc a[] = new qc[0];
    public byte b[][];

    public qc()
    {
        b = f.k;
    }

    public final int a()
    {
        boolean flag = false;
        boolean flag1 = false;
        int i = ((flag) ? 1 : 0);
        if (b != null)
        {
            i = ((flag) ? 1 : 0);
            if (b.length > 0)
            {
                byte abyte0[][] = b;
                int k = abyte0.length;
                int j = 0;
                for (i = ((flag1) ? 1 : 0); i < k; i++)
                {
                    j += CodedOutputByteBufferNano.a(abyte0[i]);
                }

                i = j + 0 + b.length * 1;
            }
        }
        i += f.a(dl);
        dm = i;
        return i;
    }

    public final c a(a a1)
    {
        do
        {
            int i = a1.a();
            switch (i)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (f.a(dl, a1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k = f.a(a1, 10);
                int j = b.length;
                byte abyte0[][] = new byte[k + j][];
                System.arraycopy(b, 0, abyte0, 0, j);
                for (b = abyte0; j < b.length - 1; j++)
                {
                    b[j] = a1.g();
                    a1.a();
                }

                b[j] = a1.g();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            byte abyte0[][] = b;
            int j = abyte0.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(1, abyte0[i]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
