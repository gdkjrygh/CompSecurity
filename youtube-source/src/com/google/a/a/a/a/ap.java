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
//            ca, ok

public final class ap extends b
{

    public static final ap a[] = new ap[0];
    public ca b;
    public ok c;

    public ap()
    {
        b = null;
        c = null;
    }

    public final int a()
    {
        int i = 0;
        if (b != null)
        {
            i = CodedOutputByteBufferNano.b(0x366e635, b) + 0;
        }
        int j = i;
        if (c != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x3c3f206, c);
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

            case 456602026: 
                b = new ca();
                a1.a(b);
                break;

            case 505385010: 
                c = new ok();
                a1.a(c);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x366e635, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x3c3f206, c);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
