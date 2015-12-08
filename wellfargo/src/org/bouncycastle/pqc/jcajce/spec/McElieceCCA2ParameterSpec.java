// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;

public class McElieceCCA2ParameterSpec
    implements AlgorithmParameterSpec
{

    public static final String DEFAULT_MD = "SHA256";
    private String mdName;

    public McElieceCCA2ParameterSpec()
    {
        this("SHA256");
    }

    public McElieceCCA2ParameterSpec(String s)
    {
        mdName = s;
    }

    public String getMDName()
    {
        return mdName;
    }
}
