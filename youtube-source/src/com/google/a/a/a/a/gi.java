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
//            gl, go, ge, gn, 
//            gj

public final class gi extends b
{

    public static final gi a[] = new gi[0];
    public gl b;
    public go c;
    public ge d;
    public gn e;
    public gj f;

    public gi()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
    }

    public final int a()
    {
        int j = 0;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(0x2cb7264, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x2d0d90a, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x2d9b8c1, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x323567a, e);
        }
        j = i;
        if (f != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x337ffc9, f);
        }
        i = j + com.google.protobuf.nano.f.a(dl);
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
                if (com.google.protobuf.nano.f.a(dl, a1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 375100194: 
                b = new gl();
                a1.a(b);
                break;

            case 377931858: 
                c = new go();
                a1.a(c);
                break;

            case 382584330: 
                d = new ge();
                a1.a(d);
                break;

            case 421180370: 
                e = new gn();
                a1.a(e);
                break;

            case 432012874: 
                f = new gj();
                a1.a(f);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x2cb7264, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x2d0d90a, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x2d9b8c1, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x323567a, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(0x337ffc9, f);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
