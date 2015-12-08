// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import java.io.InputStream;
import org.apache.http.HttpEntity;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            ay

public final class ba extends ay
{

    public ba()
    {
    }

    private static byte[] b(HttpEntity httpentity)
    {
        InputStream inputstream;
        int i;
        int k;
        if (httpentity == null)
        {
            return null;
        }
        inputstream = httpentity.getContent();
        int j = (int)httpentity.getContentLength();
        int l;
        if (j < 0)
        {
            i = 16384;
        } else
        {
            i = j;
        }
        httpentity = new byte[i];
        i = 0;
_L2:
        k = inputstream.read(httpentity, i, httpentity.length - i);
        if (k == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        k = i + k;
        l = httpentity.length;
        i = k;
        if (k != l)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k == j)
        {
            inputstream.close();
            return httpentity;
        }
        byte abyte0[];
        abyte0 = new byte[httpentity.length << 1];
        System.arraycopy(httpentity, 0, abyte0, 0, httpentity.length);
        httpentity = abyte0;
        i = k;
        if (true) goto _L2; else goto _L1
_L1:
        inputstream.close();
        byte abyte1[] = new byte[i];
        System.arraycopy(httpentity, 0, abyte1, 0, i);
        return abyte1;
        httpentity;
        inputstream.close();
        throw httpentity;
    }

    protected final Object a(HttpEntity httpentity)
    {
        return b(httpentity);
    }
}
