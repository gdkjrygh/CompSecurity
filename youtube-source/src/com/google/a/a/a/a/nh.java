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
//            gu, pn, my, ad, 
//            ep, qx, na, ae, 
//            mz, aj

public final class nh extends b
{

    public static final nh a[] = new nh[0];
    public gu b;
    public pn c;
    public my d;
    public ad e;
    public ep f;
    public qx g;
    public na h;
    public ae i;
    public mz j;
    public aj k;

    public nh()
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
    }

    public final int a()
    {
        int i1 = 0;
        if (b != null)
        {
            i1 = CodedOutputByteBufferNano.b(0x329aa9d, b) + 0;
        }
        int l = i1;
        if (c != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(0x329ef44, c);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(0x33449ad, d);
        }
        l = i1;
        if (e != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(0x34d6cf6, e);
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(0x37256f3, f);
        }
        l = i1;
        if (g != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(0x3742f13, g);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(0x39515b9, h);
        }
        l = i1;
        if (i != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(0x3a21c49, i);
        }
        i1 = l;
        if (j != null)
        {
            i1 = l + CodedOutputByteBufferNano.b(0x3a23626, j);
        }
        l = i1;
        if (k != null)
        {
            l = i1 + CodedOutputByteBufferNano.b(0x3b93ca7, k);
        }
        l += com.google.protobuf.nano.f.a(dl);
        dm = l;
        return l;
    }

    public final c a(a a1)
    {
        do
        {
            int l = a1.a();
            switch (l)
            {
            default:
                if (dl == null)
                {
                    dl = new ArrayList();
                }
                if (com.google.protobuf.nano.f.a(dl, a1, l))
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

            case 430067050: 
                d = new my();
                a1.a(d);
                break;

            case 443246514: 
                e = new ad();
                a1.a(e);
                break;

            case 462600090: 
                f = new ep();
                a1.a(f);
                break;

            case 463567002: 
                g = new qx();
                a1.a(g);
                break;

            case 480816586: 
                h = new na();
                a1.a(h);
                break;

            case 487645770: 
                i = new ae();
                a1.a(i);
                break;

            case 487698738: 
                j = new mz();
                a1.a(j);
                break;

            case 499770682: 
                k = new aj();
                a1.a(k);
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
            codedoutputbytebuffernano.a(0x33449ad, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x34d6cf6, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(0x37256f3, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(0x3742f13, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(0x39515b9, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(0x3a21c49, i);
        }
        if (j != null)
        {
            codedoutputbytebuffernano.a(0x3a23626, j);
        }
        if (k != null)
        {
            codedoutputbytebuffernano.a(0x3b93ca7, k);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
