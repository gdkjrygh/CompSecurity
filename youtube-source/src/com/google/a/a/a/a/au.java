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
//            uc, bx, oq

public final class au extends b
{

    public static final au a[] = new au[0];
    public uc b;
    public bx c;
    public oq d;

    public au()
    {
        b = null;
        c = null;
        d = null;
    }

    public final int a()
    {
        int j = 0;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(0x2da9690, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x31a40a8, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x3c8cc39, d);
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

            case 383038594: 
                b = new uc();
                a1.a(b);
                break;

            case 416417090: 
                c = new bx();
                a1.a(c);
                break;

            case 507929034: 
                d = new oq();
                a1.a(d);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x2da9690, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x31a40a8, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x3c8cc39, d);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
