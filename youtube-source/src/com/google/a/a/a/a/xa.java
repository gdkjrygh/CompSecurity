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
import java.util.Arrays;

// Referenced classes of package com.google.a.a.a.a:
//            fk

public final class xa extends b
{

    public static final xa a[] = new xa[0];
    public fk b;
    public byte c[];

    public xa()
    {
        b = null;
        c = f.l;
    }

    public final int a()
    {
        int i = 0;
        if (b != null)
        {
            i = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int j = i;
        if (!Arrays.equals(c, f.l))
        {
            j = i + CodedOutputByteBufferNano.b(3, c);
        }
        i = j + f.a(dl);
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
                b = new fk();
                a1.a(b);
                break;

            case 26: // '\032'
                c = a1.g();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (!Arrays.equals(c, f.l))
        {
            codedoutputbytebuffernano.a(3, c);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
