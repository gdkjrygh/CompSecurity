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
//            gi, py

public final class gh extends b
{

    public static final gh a[] = new gh[0];
    public py b;
    public String c;
    public gi d[];

    public gh()
    {
        b = null;
        c = "";
        d = com.google.a.a.a.a.gi.a;
    }

    public final int a()
    {
        boolean flag = false;
        int i;
        int j;
        int k;
        if (b != null)
        {
            j = CodedOutputByteBufferNano.b(1, b) + 0;
        } else
        {
            j = 0;
        }
        i = j;
        if (!c.equals(""))
        {
            i = j + CodedOutputByteBufferNano.b(3, c);
        }
        k = i;
        if (d != null)
        {
            gi agi[] = d;
            int l = agi.length;
            j = ((flag) ? 1 : 0);
            do
            {
                k = i;
                if (j >= l)
                {
                    break;
                }
                i += CodedOutputByteBufferNano.b(4, agi[j]);
                j++;
            } while (true);
        }
        i = k + f.a(dl);
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

            case 10: // '\n'
                b = new py();
                a1.a(b);
                break;

            case 26: // '\032'
                c = a1.f();
                break;

            case 34: // '"'
                int k = f.a(a1, 34);
                gi agi[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                agi = new gi[k + j];
                if (d != null)
                {
                    System.arraycopy(d, 0, agi, 0, j);
                }
                for (d = agi; j < d.length - 1; j++)
                {
                    d[j] = new gi();
                    a1.a(d[j]);
                    a1.a();
                }

                d[j] = new gi();
                a1.a(d[j]);
                break;
            }
        } while (true);
    }

    public final void a(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null)
        {
            codedoutputbytebuffernano.a(1, b);
        }
        if (!c.equals(""))
        {
            codedoutputbytebuffernano.a(3, c);
        }
        if (d != null)
        {
            gi agi[] = d;
            int j = agi.length;
            for (int i = 0; i < j; i++)
            {
                codedoutputbytebuffernano.a(4, agi[i]);
            }

        }
        f.a(dl, codedoutputbytebuffernano);
    }

}
