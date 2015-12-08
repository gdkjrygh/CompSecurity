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
//            ba, fh, oi, sm

public final class an extends b
{

    public static final an a[] = new an[0];
    public ba b;
    public fh c;
    public oi d;
    public sm e;

    public an()
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
            j = CodedOutputByteBufferNano.b(0x2c42002, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x2fe8b38, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x32ce059, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x3ce028d, e);
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

            case 371261458: 
                b = new ba();
                a1.a(b);
                break;

            case 401889730: 
                c = new fh();
                a1.a(c);
                break;

            case 426181322: 
                d = new oi();
                a1.a(d);
                break;

            case 510661738: 
                e = new sm();
                a1.a(e);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x2c42002, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x2fe8b38, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x32ce059, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x3ce028d, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
