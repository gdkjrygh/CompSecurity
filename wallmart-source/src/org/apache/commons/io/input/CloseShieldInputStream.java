// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;

import java.io.InputStream;

// Referenced classes of package org.apache.commons.io.input:
//            ProxyInputStream, ClosedInputStream

public class CloseShieldInputStream extends ProxyInputStream
{

    public CloseShieldInputStream(InputStream inputstream)
    {
        super(inputstream);
    }

    public void close()
    {
        in = new ClosedInputStream();
    }
}
