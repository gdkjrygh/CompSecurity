// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.encodings;

import java.security.PrivilegedAction;

// Referenced classes of package org.bouncycastle.crypto.encodings:
//            PKCS1Encoding

class this._cls0
    implements PrivilegedAction
{

    final PKCS1Encoding this$0;

    public Object run()
    {
        return System.getProperty("org.bouncycastle.pkcs1.strict");
    }

    ()
    {
        this$0 = PKCS1Encoding.this;
        super();
    }
}
