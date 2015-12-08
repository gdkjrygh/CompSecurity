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
//            ks, kn, kl, ko, 
//            kk

public final class kr extends b
{

    public static final kr a[] = new kr[0];
    public ks b;
    public kn c;
    public kl d;
    public ko e;
    public kk f;

    public kr()
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
            j = CodedOutputByteBufferNano.b(0x3ba452a, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x3bbc7d4, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x3c0ddb7, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x3c0de10, e);
        }
        j = i;
        if (f != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x3c0df25, f);
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

            case 500312402: 
                b = new ks();
                a1.a(b);
                break;

            case 501104290: 
                c = new kn();
                a1.a(c);
                break;

            case 503770554: 
                d = new kl();
                a1.a(d);
                break;

            case 503771266: 
                e = new ko();
                a1.a(e);
                break;

            case 503773482: 
                f = new kk();
                a1.a(f);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x3ba452a, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x3bbc7d4, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x3c0ddb7, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x3c0de10, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(0x3c0df25, f);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
