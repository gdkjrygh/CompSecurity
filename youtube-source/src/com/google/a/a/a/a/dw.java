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

public final class dw extends b
{

    public static final dw a[] = new dw[0];
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    public dw()
    {
        b = "";
        c = "";
        d = "";
        e = "";
        f = "";
        g = "";
    }

    public final int a()
    {
        int j = 0;
        if (!b.equals(""))
        {
            j = CodedOutputByteBufferNano.b(1, b) + 0;
        }
        int i = j;
        if (!c.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(2, c);
        }
        j = i;
        if (!d.equals(""))
        {
            j = i + CodedOutputByteBufferNano.b(4, d);
        }
        i = j;
        if (!e.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(6, e);
        }
        j = i;
        if (!f.equals(""))
        {
            j = i + CodedOutputByteBufferNano.b(7, f);
        }
        i = j;
        if (!g.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(8, g);
        }
        i += com.google.protobuf.nano.f.a(dl);
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

            case 10: // '\n'
                b = a1.f();
                break;

            case 18: // '\022'
                c = a1.f();
                break;

            case 34: // '"'
                d = a1.f();
                break;

            case 50: // '2'
                e = a1.f();
                break;

            case 58: // ':'
                f = a1.f();
                break;

            case 66: // 'B'
                g = a1.f();
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (!b.equals(""))
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(2, c);
        }
        if (!d.equals(""))
        {
            codedoutputbytebuffernano.a(4, d);
        }
        if (!e.equals(""))
        {
            codedoutputbytebuffernano.a(6, e);
        }
        if (!f.equals(""))
        {
            codedoutputbytebuffernano.a(7, f);
        }
        if (!g.equals(""))
        {
            codedoutputbytebuffernano.a(8, g);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
