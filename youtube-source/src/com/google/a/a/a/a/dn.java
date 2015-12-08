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
//            gu, pn, pq, my, 
//            ad, ep, qx, na, 
//            ae, mz, aj

public final class dn extends b
{

    public static final dn a[] = new dn[0];
    public gu b;
    public pn c;
    public pq d;
    public my e;
    public ad f;
    public ep g;
    public qx h;
    public na i;
    public ae j;
    public mz k;
    public aj l;

    public dn()
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
    }

    public final int a()
    {
        int j1 = 0;
        if (b != null)
        {
            j1 = CodedOutputByteBufferNano.b(0x329aa9d, b) + 0;
        }
        int i1 = j1;
        if (c != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(0x329ef44, c);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(0x329fb79, d);
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(0x33449ad, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(0x34d6cf6, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(0x37256f3, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(0x3742f13, h);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(0x39515b9, i);
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(0x3a21c49, j);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + CodedOutputByteBufferNano.b(0x3a23626, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + CodedOutputByteBufferNano.b(0x3b93ca7, l);
        }
        i1 = j1 + com.google.protobuf.nano.f.a(dl);
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

            case 424498410: 
                b = new gu();
                a1.a(b);
                break;

            case 424639010: 
                c = new pn();
                a1.a(c);
                break;

            case 424664010: 
                d = new pq();
                a1.a(d);
                break;

            case 430067050: 
                e = new my();
                a1.a(e);
                break;

            case 443246514: 
                f = new ad();
                a1.a(f);
                break;

            case 462600090: 
                g = new ep();
                a1.a(g);
                break;

            case 463567002: 
                h = new qx();
                a1.a(h);
                break;

            case 480816586: 
                i = new na();
                a1.a(i);
                break;

            case 487645770: 
                j = new ae();
                a1.a(j);
                break;

            case 487698738: 
                k = new mz();
                a1.a(k);
                break;

            case 499770682: 
                l = new aj();
                a1.a(l);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x329aa9d, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x329ef44, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x329fb79, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x33449ad, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(0x34d6cf6, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(0x37256f3, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(0x3742f13, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(0x39515b9, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(0x3a21c49, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(0x3a23626, k);
        }
        if (l != null)
        {
            codedoutputbytebuffernano.a(0x3b93ca7, l);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
