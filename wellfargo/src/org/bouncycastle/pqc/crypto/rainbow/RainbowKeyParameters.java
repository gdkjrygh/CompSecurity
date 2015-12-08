// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.crypto.rainbow;

import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

public class RainbowKeyParameters extends AsymmetricKeyParameter
{

    private int docLength;

    public RainbowKeyParameters(boolean flag, int i)
    {
        super(flag);
        docLength = i;
    }

    public int getDocLength()
    {
        return docLength;
    }
}
