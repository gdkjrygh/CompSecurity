// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;


// Referenced classes of package org.bouncycastle.crypto.engines:
//            RFC3394WrapEngine, AESEngine

public class AESWrapEngine extends RFC3394WrapEngine
{

    public AESWrapEngine()
    {
        super(new AESEngine());
    }
}
