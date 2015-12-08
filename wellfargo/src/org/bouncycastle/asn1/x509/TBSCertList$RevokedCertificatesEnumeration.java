// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x509;

import java.util.Enumeration;

// Referenced classes of package org.bouncycastle.asn1.x509:
//            TBSCertList

class en
    implements Enumeration
{

    private final Enumeration en;
    final TBSCertList this$0;

    public boolean hasMoreElements()
    {
        return en.hasMoreElements();
    }

    public Object nextElement()
    {
        return en(en.nextElement());
    }

    (Enumeration enumeration)
    {
        this$0 = TBSCertList.this;
        super();
        en = enumeration;
    }
}
