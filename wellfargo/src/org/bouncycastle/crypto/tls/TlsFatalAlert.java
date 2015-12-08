// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.io.IOException;

public class TlsFatalAlert extends IOException
{

    private static final long serialVersionUID = 0x31be09cba4aa0800L;
    private short alertDescription;

    public TlsFatalAlert(short word0)
    {
        alertDescription = word0;
    }

    public short getAlertDescription()
    {
        return alertDescription;
    }
}
