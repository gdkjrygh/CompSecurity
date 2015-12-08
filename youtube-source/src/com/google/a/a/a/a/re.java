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
//            gv, fr, et, ue, 
//            eq, gx

public final class re extends b
{

    public static final re a[] = new re[0];
    public gv b;
    public fr c;
    public et d;
    public ue e;
    public eq f;
    public gx g;

    public re()
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
            j = CodedOutputByteBufferNano.b(0x310c7ec, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x3167d42, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x350f2b9, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x374d3e7, e);
        }
        j = i;
        if (f != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x3885859, f);
        }
        i = j;
        if (g != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x38858a7, g);
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

            case 411451234: 
                b = new gv();
                a1.a(b);
                break;

            case 414444050: 
                c = new fr();
                a1.a(c);
                break;

            case 445093322: 
                d = new et();
                a1.a(d);
                break;

            case 463904570: 
                e = new ue();
                a1.a(e);
                break;

            case 474137290: 
                f = new eq();
                a1.a(f);
                break;

            case 474137914: 
                g = new gx();
                a1.a(g);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x310c7ec, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x3167d42, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x350f2b9, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x374d3e7, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(0x3885859, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(0x38858a7, g);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
