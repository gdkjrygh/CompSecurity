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
//            uy, ce, op, ka

public final class fg extends b
{

    public static final fg a[] = new fg[0];
    public uy b;
    public ce c;
    public op d;
    public ka e;

    public fg()
    {
        b = null;
        c = null;
        d = null;
        e = null;
    }

    public final int a()
    {
        int j = 0;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(0x303c1d6, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x303f243, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x3061cf4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x37c69c4, e);
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

            case 404623026: 
                b = new uy();
                a1.a(b);
                break;

            case 404722202: 
                c = new ce();
                a1.a(c);
                break;

            case 405858210: 
                d = new op();
                a1.a(d);
                break;

            case 467881506: 
                e = new ka();
                a1.a(e);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x303c1d6, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x303f243, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x3061cf4, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x37c69c4, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
