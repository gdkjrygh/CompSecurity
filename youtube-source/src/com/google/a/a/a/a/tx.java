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

public final class tx extends b
{

    public static final tx a[] = new tx[0];
    public String b;
    public int c;

    public tx()
    {
        b = "";
        c = 0;
    }

    public final int a()
    {
        int i = 0;
        if (!b.equals(""))
        {
            i = CodedOutputByteBufferNano.b(3, b) + 0;
        }
        int j = i;
        if (c != 0)
        {
            j = i + CodedOutputByteBufferNano.d(5, c);
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

            case 26: // '\032'
                b = a1.f();
                break;

            case 40: // '('
                int j = a1.d();
                if (j == 0 || j == 1 || j == 2)
                {
                    c = j;
                } else
                {
                    c = 0;
                }
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (!b.equals(""))
        {
            codedoutputbytebuffernano.a(3, b);
        }
        if (c != 0)
        {
            codedoutputbytebuffernano.a(5, c);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
