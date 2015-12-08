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
//            rg, ab, qk

public final class qp extends b
{

    public static final qp a[] = new qp[0];
    public rg b;
    public ab c;
    public qk d;

    public qp()
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
            j = CodedOutputByteBufferNano.b(0x2fd0c96, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x2fd8fed, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x37b77df, d);
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

            case 401106098: 
                b = new rg();
                a1.a(b);
                break;

            case 401375082: 
                c = new ab();
                a1.a(c);
                break;

            case 467386106: 
                d = new qk();
                a1.a(d);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x2fd0c96, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x2fd8fed, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x37b77df, d);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
