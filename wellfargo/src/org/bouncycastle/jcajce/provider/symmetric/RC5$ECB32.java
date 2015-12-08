// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.engines.RC532Engine;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

public class lockCipher extends BaseBlockCipher
{

    public lockCipher()
    {
        super(new RC532Engine());
    }
}
