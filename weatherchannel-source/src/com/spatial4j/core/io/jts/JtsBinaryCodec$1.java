// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spatial4j.core.io.jts;

import com.vividsolutions.jts.d.b;
import java.io.DataInput;
import java.io.IOException;

// Referenced classes of package com.spatial4j.core.io.jts:
//            JtsBinaryCodec

final class a
    implements b
{

    private boolean a;
    private DataInput b;

    public final void a(byte abyte0[])
        throws IOException
    {
        if (a)
        {
            if (abyte0.length != 1)
            {
                throw new IllegalStateException((new StringBuilder("Expected initial read of one byte, not: ")).append(abyte0.length).toString());
            } else
            {
                abyte0[0] = 0;
                a = false;
                return;
            }
        } else
        {
            b.readFully(abyte0);
            return;
        }
    }

    (JtsBinaryCodec jtsbinarycodec, DataInput datainput)
    {
        b = datainput;
        super();
        a = true;
    }
}
