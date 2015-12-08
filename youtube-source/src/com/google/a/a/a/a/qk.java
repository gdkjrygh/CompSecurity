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

public final class qk extends b
{

    public static final qk a[] = new qk[0];
    public String b[];

    public qk()
    {
        b = f.j;
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
                String as[] = b;
                int k = as.length;
                int j = 0;
                for (i = ((flag1) ? 1 : 0); i < k; i++)
                {
                    j += CodedOutputByteBufferNano.a(as[i]);
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
                String as[] = new String[k + j];
                System.arraycopy(b, 0, as, 0, j);
                for (b = as; j < b.length - 1; j++)
                {
                    b[j] = a1.f();
                    a1.a();
                }

                b[j] = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            String as[] = b;
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(1, as[i]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
