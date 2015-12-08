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
//            ub, xi, xc, je, 
//            ss, sz, kj

public final class ak extends b
{

    public static final ak a[] = new ak[0];
    public ub b;
    public xi c;
    public xc d;
    public je e;
    public ss f;
    public sz g;
    public kj h;

    public ak()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
    }

    public final int a()
    {
        int j = 0;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(0x3080b8a, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x3084dbb, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x308c7d2, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x308ffc6, e);
        }
        j = i;
        if (f != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x30905d8, f);
        }
        i = j;
        if (g != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x3326ee1, g);
        }
        j = i;
        if (h != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x396214a, h);
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

            case 406871122: 
                b = new ub();
                a1.a(b);
                break;

            case 407006682: 
                c = new xi();
                a1.a(c);
                break;

            case 407256722: 
                d = new xc();
                a1.a(d);
                break;

            case 407371314: 
                e = new je();
                a1.a(e);
                break;

            case 407383746: 
                f = new ss();
                a1.a(f);
                break;

            case 429094666: 
                g = new sz();
                a1.a(g);
                break;

            case 481364562: 
                h = new kj();
                a1.a(h);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x3080b8a, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x3084dbb, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x308c7d2, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x308ffc6, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(0x30905d8, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(0x3326ee1, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(0x396214a, h);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
