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

// Referenced classes of package com.google.a.a.a.a:
//            of, ef

public final class qy extends b
{

    public static final qy a[] = new qy[0];
    public of b;
    public ef c;

    public qy()
    {
        b = null;
        c = null;
    }

    public final int a()
    {
        int i = 0;
        if (b != null)
        {
            i = CodedOutputByteBufferNano.b(0x39db14d, b) + 0;
        }
        int j = i;
        if (c != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x3c32558, c);
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

            case 485329514: 
                b = new of();
                a1.a(b);
                break;

            case 504965826: 
                c = new ef();
                a1.a(c);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x39db14d, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x3c32558, c);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
