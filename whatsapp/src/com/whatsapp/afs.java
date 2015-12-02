// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.ContentProducer;

// Referenced classes of package com.whatsapp:
//            App, gc, ir, a1h

class afs
    implements ContentProducer
{

    final String a;
    final String b;
    final gc c;

    afs(gc gc1, String s, String s1)
    {
        c = gc1;
        b = s;
        a = s1;
        super();
    }

    public void writeTo(OutputStream outputstream)
    {
        int k = App.am;
        byte abyte0[] = new byte[c.g];
        gc.a(outputstream, b);
        InputStream inputstream = c.b.b();
        inputstream.skip(c.f);
        int j = c.f + 0;
        int l;
        do
        {
            l = inputstream.read(abyte0, 0, c.g);
            int i = j;
            if (l >= 0)
            {
                j += l;
                outputstream.write(abyte0, 0, l);
                outputstream.flush();
                i = j;
                if (c.d != null)
                {
                    c.d.a(j);
                    i = j;
                }
            }
            if (Thread.currentThread().isInterrupted())
            {
                Thread.currentThread().interrupt();
                inputstream.close();
                outputstream.close();
                if (k == 0)
                {
                    break;
                }
            }
            j = i;
        } while (l >= 0);
        if (!Thread.currentThread().isInterrupted())
        {
            inputstream.close();
            gc.a(outputstream, a);
        }
    }
}
