// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.interfaces;

import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

public interface GOST3410Params
{

    public abstract String getDigestParamSetOID();

    public abstract String getEncryptionParamSetOID();

    public abstract String getPublicKeyParamSetOID();

    public abstract GOST3410PublicKeyParameterSetSpec getPublicKeyParameters();
}
