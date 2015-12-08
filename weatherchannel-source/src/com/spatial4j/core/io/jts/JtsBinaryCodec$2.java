// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.io.jts;

import com.vividsolutions.jts.d.c;
import java.io.DataOutput;
import java.io.IOException;

// Referenced classes of package com.spatial4j.core.io.jts:
//            JtsBinaryCodec

final class a
    implements c
{

    private boolean a;
    private DataOutput b;

    public final void a(byte abyte0[], int i)
        throws IOException
    {
        if (a)
        {
            a = false;
            if (i != 1 || abyte0[0] != 0)
            {
                throw new IllegalStateException("Unexpected WKB byte order mark");
            }
        } else
        {
            b.write(abyte0, 0, i);
        }
    }

    (JtsBinaryCodec jtsbinarycodec, DataOutput dataoutput)
    {
        b = dataoutput;
        super();
        a = true;
    }
}
