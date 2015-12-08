// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.a.a.c;

import com.gau.a.a.e.b;
import java.io.DataInputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;

// Referenced classes of package com.gau.a.a.c:
//            b

public class a
    implements com.gau.a.a.c.b
{

    public a()
    {
    }

    public b a(com.gau.a.a.d.a a1, HttpResponse httpresponse)
    {
        a1 = httpresponse.getEntity();
        httpresponse = new DataInputStream(a1.getContent());
        if (a1.isChunked())
        {
            a1 = new StringBuffer();
            byte abyte0[] = new byte[1024];
            do
            {
                int i = httpresponse.read(abyte0);
                if (i == -1)
                {
                    break;
                }
                a1.append(new String(abyte0, 0, i));
            } while (true);
            a1 = a1.toString().getBytes();
        } else
        {
            long l = a1.getContentLength();
            if (l <= 0L)
            {
                return null;
            }
            a1 = new byte[(int)l];
            httpresponse.readFully(a1);
        }
        return new com.gau.a.a.e.a(1, a1);
    }
}
