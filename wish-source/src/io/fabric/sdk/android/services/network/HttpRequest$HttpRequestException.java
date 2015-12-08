// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.network;

import java.io.IOException;

// Referenced classes of package io.fabric.sdk.android.services.network:
//            HttpRequest

public static class  extends RuntimeException
{

    private static final long serialVersionUID = 0xefc1aa7964bcfdc9L;

    public IOException getCause()
    {
        return (IOException)super.getCause();
    }

    public volatile Throwable getCause()
    {
        return getCause();
    }

    protected (IOException ioexception)
    {
        super(ioexception);
    }
}
