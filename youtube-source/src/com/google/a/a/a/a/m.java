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

public final class m extends b
{

    public static final m a[] = new m[0];
    public int b;
    public int c;
    public int d;
    public String e;

    public m()
    {
        b = 0;
        c = 0;
        d = 0;
        e = "";
    }

    public final int a()
    {
        int j = 0;
        if (b != 0)
        {
            j = CodedOutputByteBufferNano.d(1, b) + 0;
        }
        int i = j;
        if (c != 0)
        {
            i = j + CodedOutputByteBufferNano.d(2, c);
        }
        j = i;
        if (d != 0)
        {
            j = i + CodedOutputByteBufferNano.d(3, d);
        }
        i = j;
        if (!e.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(5, e);
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

            case 8: // '\b'
                int j = a1.d();
                if (j == 0 || j == 1 || j == 2 || j == 3 || j == 4 || j == 5 || j == 6 || j == 7 || j == 8 || j == 9 || j == 10 || j == 11 || j == 12 || j == 13)
                {
                    b = j;
                } else
                {
                    b = 0;
                }
                break;

            case 16: // '\020'
                int k = a1.d();
                if (k == 0 || k == 1 || k == 2 || k == 3 || k == 4 || k == 5 || k == 6 || k == 7 || k == 8 || k == 9 || k == 10 || k == 11 || k == 12 || k == 13)
                {
                    c = k;
                } else
                {
                    c = 0;
                }
                break;

            case 24: // '\030'
                int l = a1.d();
                if (l == 0 || l == 1 || l == 2 || l == 3)
                {
                    d = l;
                } else
                {
                    d = 0;
                }
                break;

            case 42: // '*'
                e = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != 0)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (c != 0)
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (d != 0)
        {
            codedoutputbytebuffernano.a(3, d);
        }
        if (!e.equals(""))
        {
            codedoutputbytebuffernano.a(5, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
