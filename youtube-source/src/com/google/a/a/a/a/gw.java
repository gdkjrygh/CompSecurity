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
//            dj, de, db, df, 
//            fm, fp, fq, fu

public final class gw extends b
{

    public static final gw a[] = new gw[0];
    public dj b;
    public de c;
    public db d;
    public df e;
    public fm f;
    public fp g;
    public fq h;
    public fu i;

    public gw()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
    }

    public final int a()
    {
        int k = 0;
        if (b != null)
        {
            k = CodedOutputByteBufferNano.b(0x3049143, b) + 0;
        }
        int j = k;
        if (c != null)
        {
            j = k + CodedOutputByteBufferNano.b(0x3064567, c);
        }
        k = j;
        if (d != null)
        {
            k = j + CodedOutputByteBufferNano.b(0x3070f41, d);
        }
        j = k;
        if (e != null)
        {
            j = k + CodedOutputByteBufferNano.b(0x32b52b9, e);
        }
        k = j;
        if (f != null)
        {
            k = j + CodedOutputByteBufferNano.b(0x3993a2b, f);
        }
        j = k;
        if (g != null)
        {
            j = k + CodedOutputByteBufferNano.b(0x3993a43, g);
        }
        k = j;
        if (h != null)
        {
            k = j + CodedOutputByteBufferNano.b(0x3993a4a, h);
        }
        j = k;
        if (i != null)
        {
            j = k + CodedOutputByteBufferNano.b(0x3993a79, i);
        }
        j += com.google.protobuf.nano.f.a(dl);
        dm = j;
        return j;
    }

    public final c a(a a1)
    {
        do
        {
            int j = a1.a();
            switch (j)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 405047834: 
                b = new dj();
                a1.a(b);
                break;

            case 405941050: 
                c = new de();
                a1.a(c);
                break;

            case 406354442: 
                d = new db();
                a1.a(d);
                break;

            case 425366986: 
                e = new df();
                a1.a(e);
                break;

            case 482988378: 
                f = new fm();
                a1.a(f);
                break;

            case 482988570: 
                g = new fp();
                a1.a(g);
                break;

            case 482988626: 
                h = new fq();
                a1.a(h);
                break;

            case 482989002: 
                i = new fu();
                a1.a(i);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x3049143, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x3064567, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x3070f41, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x32b52b9, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(0x3993a2b, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(0x3993a43, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(0x3993a4a, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(0x3993a79, i);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
