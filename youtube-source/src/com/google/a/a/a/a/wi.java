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
//            jw, jn, js, jr, 
//            ju, jp

public final class wi extends b
{

    public static final wi a[] = new wi[0];
    public jw b;
    public jn c;
    public js d;
    public jr e;
    public ju f;
    public jp g;

    public wi()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
    }

    public final int a()
    {
        int j = 0;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(0x30905bb, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x309bf19, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x309c027, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x342dd8c, e);
        }
        j = i;
        if (f != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x36a6bde, f);
        }
        i = j;
        if (g != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x38e6c6c, g);
        }
        i += com.google.protobuf.nano.f.a(dl);
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

            case 407383514: 
                b = new jw();
                a1.a(b);
                break;

            case 407763146: 
                c = new jn();
                a1.a(c);
                break;

            case 407765306: 
                d = new js();
                a1.a(d);
                break;

            case 437709922: 
                e = new jr();
                a1.a(e);
                break;

            case 458448626: 
                f = new ju();
                a1.a(f);
                break;

            case 477324130: 
                g = new jp();
                a1.a(g);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x30905bb, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x309bf19, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x309c027, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x342dd8c, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(0x36a6bde, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(0x38e6c6c, g);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
