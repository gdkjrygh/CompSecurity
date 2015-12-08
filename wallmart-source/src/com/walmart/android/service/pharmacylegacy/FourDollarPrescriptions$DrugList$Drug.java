// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.pharmacylegacy;


// Referenced classes of package com.walmart.android.service.pharmacylegacy:
//            FourDollarPrescriptions

public static class 
{

    private String mName;
    private String mQty30Day;
    private String mQty60Day;

    public String getName()
    {
        return mName;
    }

    public String getQty30Day()
    {
        return mQty30Day;
    }

    public String getQty60Day()
    {
        return mQty60Day;
    }

    public void setName(String s)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s.trim();
        }
        mName = s1;
    }

    public void setQty30Day(String s)
    {
        mQty30Day = s;
    }

    public void setQty60Day(String s)
    {
        mQty60Day = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Drug [mName=").append(mName).append(", mQty30Day=").append(mQty30Day).append(", mQty60Day=").append(mQty60Day).append("]").toString();
    }


    public ()
    {
    }
}
