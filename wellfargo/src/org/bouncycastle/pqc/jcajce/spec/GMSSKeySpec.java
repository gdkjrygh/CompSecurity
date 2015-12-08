// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.KeySpec;
import org.bouncycastle.pqc.crypto.gmss.GMSSParameters;

public class GMSSKeySpec
    implements KeySpec
{

    private GMSSParameters gmssParameterSet;

    protected GMSSKeySpec(GMSSParameters gmssparameters)
    {
        gmssParameterSet = gmssparameters;
    }

    public GMSSParameters getParameters()
    {
        return gmssParameterSet;
    }
}
