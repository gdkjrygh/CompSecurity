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
//            li, pd, pe, lj

public final class ot extends b
{

    public static final ot a[] = new ot[0];
    public li b;
    public pd c;
    public pe d;
    public lj e;

    public ot()
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
            j = CodedOutputByteBufferNano.b(0x31a2ee9, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x31a2eed, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x3af2bec, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x3af2c08, e);
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

            case 416380746: 
                b = new li();
                a1.a(b);
                break;

            case 416380778: 
                c = new pd();
                a1.a(c);
                break;

            case 494493538: 
                d = new pe();
                a1.a(d);
                break;

            case 494493762: 
                e = new lj();
                a1.a(e);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x31a2ee9, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x31a2eed, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x3af2bec, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x3af2c08, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
