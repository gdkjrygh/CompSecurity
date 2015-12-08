// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.tls;

import java.util.Vector;

public class CertificateRequest
{

    private Vector certificateAuthorities;
    private short certificateTypes[];

    public CertificateRequest(short aword0[], Vector vector)
    {
        certificateTypes = aword0;
        certificateAuthorities = vector;
    }

    public Vector getCertificateAuthorities()
    {
        return certificateAuthorities;
    }

    public short[] getCertificateTypes()
    {
        return certificateTypes;
    }
}
