// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.output;

import java.io.OutputStream;

// Referenced classes of package org.apache.commons.io.output:
//            ProxyOutputStream, ClosedOutputStream

public class CloseShieldOutputStream extends ProxyOutputStream
{

    public CloseShieldOutputStream(OutputStream outputstream)
    {
        super(outputstream);
    }

    public void close()
    {
        out = new ClosedOutputStream();
    }
}
