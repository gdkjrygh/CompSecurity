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
//            gc, ga, fy, gd

public final class gm extends b
{

    public static final gm a[] = new gm[0];
    public gc b;
    public ga c;
    public fy d;
    public gd e;

    public gm()
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
            j = CodedOutputByteBufferNano.b(0x309eeb1, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x309f1e0, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x314520e, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x3c09723, e);
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

            case 407860618: 
                b = new gc();
                a1.a(b);
                break;

            case 407867138: 
                c = new ga();
                a1.a(c);
                break;

            case 413306994: 
                d = new fy();
                a1.a(d);
                break;

            case 503626010: 
                e = new gd();
                a1.a(e);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x309eeb1, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x309f1e0, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x314520e, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x3c09723, e);
        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
