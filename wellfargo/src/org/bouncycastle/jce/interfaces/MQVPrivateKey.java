// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.interfaces;

import java.security.PrivateKey;
import java.security.PublicKey;

public interface MQVPrivateKey
    extends PrivateKey
{

    public abstract PrivateKey getEphemeralPrivateKey();

    public abstract PublicKey getEphemeralPublicKey();

    public abstract PrivateKey getStaticPrivateKey();
}
