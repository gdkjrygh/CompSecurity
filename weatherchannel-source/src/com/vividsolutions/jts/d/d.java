// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vividsolutions.jts.d;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.vividsolutions.jts.d:
//            c

public final class d
    implements c
{

    private OutputStream a;

    public d(OutputStream outputstream)
    {
        a = outputstream;
    }

    public final void a(byte abyte0[], int i)
        throws IOException
    {
        a.write(abyte0, 0, i);
    }
}
