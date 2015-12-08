// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.crashlytics.android.internal:
//            aA, aD, ay

final class az extends aA
{

    private InputStream a;
    private OutputStream b;
    private ay c;

    az(ay ay1, Closeable closeable, boolean flag, InputStream inputstream, OutputStream outputstream)
    {
        c = ay1;
        a = inputstream;
        b = outputstream;
        super(closeable, flag);
    }

    public final Object a()
        throws aD, IOException
    {
        byte abyte0[] = new byte[ay.a(c)];
        do
        {
            int i = a.read(abyte0);
            if (i != -1)
            {
                b.write(abyte0, 0, i);
            } else
            {
                return c;
            }
        } while (true);
    }
}
