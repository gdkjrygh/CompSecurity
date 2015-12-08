// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.common.fromguava;

import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.android.apps.youtube.common.fromguava:
//            c

public final class a
{

    public static long a(InputStream inputstream, OutputStream outputstream)
    {
        c.a(inputstream);
        c.a(outputstream);
        byte abyte0[] = new byte[4096];
        long l = 0L;
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                outputstream.write(abyte0, 0, i);
                l += i;
            } else
            {
                return l;
            }
        } while (true);
    }
}
