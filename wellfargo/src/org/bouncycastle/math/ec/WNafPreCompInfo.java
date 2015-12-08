// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;


// Referenced classes of package org.bouncycastle.math.ec:
//            PreCompInfo, ECPoint

class WNafPreCompInfo
    implements PreCompInfo
{

    private ECPoint preComp[];
    private ECPoint twiceP;

    WNafPreCompInfo()
    {
        preComp = null;
        twiceP = null;
    }

    protected ECPoint[] getPreComp()
    {
        return preComp;
    }

    protected ECPoint getTwiceP()
    {
        return twiceP;
    }

    protected void setPreComp(ECPoint aecpoint[])
    {
        preComp = aecpoint;
    }

    protected void setTwiceP(ECPoint ecpoint)
    {
        twiceP = ecpoint;
    }
}
