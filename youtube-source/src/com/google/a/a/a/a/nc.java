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
//            vh, q, nl, nk, 
//            ua

public final class nc extends b
{

    public static final nc a[] = new nc[0];
    public vh b;
    public q c;
    public nl d;
    public nk e;
    public ua f;

    public nc()
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
            j = CodedOutputByteBufferNano.b(0x2e9418f, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x34e3c37, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x3545bb1, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x3c3067d, e);
        }
        j = i;
        if (f != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x3c4062e, f);
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

            case 390728826: 
                b = new vh();
                a1.a(b);
                break;

            case 443670970: 
                c = new q();
                a1.a(c);
                break;

            case 446881162: 
                d = new nl();
                a1.a(d);
                break;

            case 504902634: 
                e = new nk();
                a1.a(e);
                break;

            case 505426290: 
                f = new ua();
                a1.a(f);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x2e9418f, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x34e3c37, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x3545bb1, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x3c3067d, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(0x3c4062e, f);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
