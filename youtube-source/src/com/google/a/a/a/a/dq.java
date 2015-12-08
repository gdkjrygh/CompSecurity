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
//            qq, it, tf, qu, 
//            fr, os, kb, rv

public final class dq extends b
{

    public static final dq a[] = new dq[0];
    public qq b;
    public it c;
    public tf d;
    public qu e;
    public fr f;
    public os g;
    public kb h;
    public rv i;

    public dq()
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
            k = CodedOutputByteBufferNano.b(0x2f1c7f5, b) + 0;
        }
        int j = k;
        if (c != null)
        {
            j = k + CodedOutputByteBufferNano.b(0x2fdec06, c);
        }
        k = j;
        if (d != null)
        {
            k = j + CodedOutputByteBufferNano.b(0x307e1fa, d);
        }
        j = k;
        if (e != null)
        {
            j = k + CodedOutputByteBufferNano.b(0x31618db, e);
        }
        k = j;
        if (f != null)
        {
            k = j + CodedOutputByteBufferNano.b(0x3167d42, f);
        }
        j = k;
        if (g != null)
        {
            j = k + CodedOutputByteBufferNano.b(0x3425de4, g);
        }
        k = j;
        if (h != null)
        {
            k = j + CodedOutputByteBufferNano.b(0x39255a1, h);
        }
        j = k;
        if (i != null)
        {
            j = k + CodedOutputByteBufferNano.b(0x3b0b8f0, i);
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

            case 395198378: 
                b = new qq();
                a1.a(b);
                break;

            case 401563698: 
                c = new it();
                a1.a(c);
                break;

            case 406786002: 
                d = new tf();
                a1.a(d);
                break;

            case 414238426: 
                e = new qu();
                a1.a(e);
                break;

            case 414444050: 
                f = new fr();
                a1.a(f);
                break;

            case 437448482: 
                g = new os();
                a1.a(g);
                break;

            case 479374602: 
                h = new kb();
                a1.a(h);
                break;

            case 495306626: 
                i = new rv();
                a1.a(i);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(0x2f1c7f5, b);
        }
        if (c != null)
        {
            codedoutputbytebuffernano.a(0x2fdec06, c);
        }
        if (d != null)
        {
            codedoutputbytebuffernano.a(0x307e1fa, d);
        }
        if (e != null)
        {
            codedoutputbytebuffernano.a(0x31618db, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(0x3167d42, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(0x3425de4, g);
        }
        if (h != null)
        {
            codedoutputbytebuffernano.a(0x39255a1, h);
        }
        if (i != null)
        {
            codedoutputbytebuffernano.a(0x3b0b8f0, i);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
