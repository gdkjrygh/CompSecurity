// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.hash;

import java.io.Serializable;
import java.nio.charset.Charset;

// Referenced classes of package com.google.common.hash:
//            Funnels

private static class charsetCanonicalName
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final String charsetCanonicalName;

    private Object readResolve()
    {
        return Funnels.stringFunnel(Charset.forName(charsetCanonicalName));
    }

    (Charset charset)
    {
        charsetCanonicalName = charset.name();
    }
}
