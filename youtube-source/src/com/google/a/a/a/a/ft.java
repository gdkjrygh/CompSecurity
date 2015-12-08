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
//            dj, de, db, fm, 
//            fp, fu

public final class ft extends b
{

    public static final ft a[] = new ft[0];
    public dj b;
    public de c;
    public db d;
    public fm e;
    public fp f;
    public fu g;

    public ft()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
    }

    public final int a()
    {
        int j = 0;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(0x3049143, b) + 0;
        }
        int i = j;
        if (c != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x3064567, c);
        }
        j = i;
        if (d != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x3070f41, d);
        }
        i = j;
        if (e != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x3993a2b, e);
        }
        j = i;
        if (f != null)
        {
            j = i + CodedOutputByteBufferNano.b(0x3993a43, f);
        }
        i = j;
        if (g != null)
        {
            i = j + CodedOutputByteBufferNano.b(0x3993a79, g);
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

            case 482988378: 
                e = new fm();
                a1.a(e);
                break;

            case 482988570: 
                f = new fp();
                a1.a(f);
                break;

            case 482989002: 
                g = new fu();
                a1.a(g);
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
            codedoutputbytebuffernano.a(0x3993a2b, e);
        }
        if (f != null)
        {
            codedoutputbytebuffernano.a(0x3993a43, f);
        }
        if (g != null)
        {
            codedoutputbytebuffernano.a(0x3993a79, g);
        }
        com.google.protobuf.nano.f.a(dl, codedoutputbytebuffernano);
    }

}
