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
//            cb, sd, tr

public final class bc extends b
{

    public static final bc a[] = new bc[0];
    public cb b;
    public sd c;
    public tr d;

    public bc()
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
            j = CodedOutputByteBufferNano.b(0x30e0084, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x34da2d9, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x3c2c61f, d);
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

            case 409994274: 
                b = new cb();
                a1.a(b);
                break;

            case 443356874: 
                c = new sd();
                a1.a(c);
                break;

            case 504770810: 
                d = new tr();
                a1.a(d);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x30e0084, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x34da2d9, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x3c2c61f, d);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
