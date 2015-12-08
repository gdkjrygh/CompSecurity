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
//            it, ev, iq, rd, 
//            da, os, dl, lt, 
//            lw, cx, mu, d

public final class qt extends b
{

    public static final qt a[] = new qt[0];
    public it b;
    public ev c;
    public iq d;
    public rd e;
    public da f;
    public os g;
    public dl h;
    public lt i;
    public lw j;
    public cx k;
    public mu l;
    public d m;

    public qt()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
    }

    public final int a()
    {
        int j1 = 0;
        if (b != null)
        {
            j1 = CodedOutputByteBufferNano.b(0x2fdec06, b) + 0;
        }
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(0x2ff8ca1, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(0x3161856, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(0x31717cb, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(0x317f2bb, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(0x3425de4, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(0x34f1549, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(0x396e0c9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(0x399c073, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(0x3b67ec1, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(0x3b6c655, l);
        }
        i1 = j1;
        if (m != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(0x3c7eeec, m);
        }
        i1 += com.google.protobuf.nano.f.a(dl);
        dm = i1;
        return i1;
    }

    public final c a(a a1)
    {
        do
        {
            int i1 = a1.a();
            switch (i1)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 401563698: 
                b = new it();
                a1.a(b);
                break;

            case 402416906: 
                c = new ev();
                a1.a(c);
                break;

            case 414237362: 
                d = new iq();
                a1.a(d);
                break;

            case 414760538: 
                e = new rd();
                a1.a(e);
                break;

            case 415208922: 
                f = new da();
                a1.a(f);
                break;

            case 437448482: 
                g = new os();
                a1.a(g);
                break;

            case 444115530: 
                h = new dl();
                a1.a(h);
                break;

            case 481756746: 
                i = new lt();
                a1.a(i);
                break;

            case 483263386: 
                j = new lw();
                a1.a(j);
                break;

            case 498333194: 
                k = new cx();
                a1.a(k);
                break;

            case 498479786: 
                l = new mu();
                a1.a(l);
                break;

            case 507475810: 
                m = new d();
                a1.a(m);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x2fdec06, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x2ff8ca1, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x3161856, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x31717cb, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(0x317f2bb, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(0x3425de4, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(0x34f1549, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(0x396e0c9, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(0x399c073, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(0x3b67ec1, k);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(0x3b6c655, l);
        }
        if (m != null)
        {
            codedoutputbytebuffernano.a(0x3c7eeec, m);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
