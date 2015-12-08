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
//            vu, vl, vs

public final class vo extends b
{

    public static final vo a[] = new vo[0];
    public vu b;
    public vl c;
    public vs d;

    public vo()
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
            j = CodedOutputByteBufferNano.b(0x3c57395, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x3c5a4e1, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x3c67185, d);
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

            case 506174634: 
                b = new vu();
                a1.a(b);
                break;

            case 506275594: 
                c = new vl();
                a1.a(c);
                break;

            case 506694698: 
                d = new vs();
                a1.a(d);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x3c57395, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x3c5a4e1, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x3c67185, d);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
