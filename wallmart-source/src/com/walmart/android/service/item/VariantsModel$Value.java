// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.item;

import java.util.Locale;

// Referenced classes of package com.walmart.android.service.item:
//            VariantsModel

public static class mSwatchUrl
    implements Comparable
{

    private final String mName;
    private final int mRank;
    private final String mSwatchUrl;
    private String mType;

    public int compareTo(mSwatchUrl mswatchurl)
    {
        return mRank - mswatchurl.mRank;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((compareTo)obj);
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        obj = (compareTo)obj;
        if (!mName.equals(((mName) (obj)).mName))
        {
            return false;
        }
        if (mType == null) goto _L4; else goto _L3
_L3:
        if (mType.equals(((mType) (obj)).mType)) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (((mType) (obj)).mType == null)
        {
            return true;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public String getName()
    {
        return mName;
    }

    public String getSwatchUrl()
    {
        return mSwatchUrl;
    }

    public String getType()
    {
        return mType;
    }

    public String getVariantTypeId()
    {
        return mType;
    }

    public int hashCode()
    {
        int j = mName.hashCode();
        int i;
        if (mType != null)
        {
            i = mType.hashCode();
        } else
        {
            i = 0;
        }
        return j * 31 + i;
    }

    void setType(String s)
    {
        mType = s;
    }

    public String toString()
    {
        return String.format(Locale.US, "%s/%s", new Object[] {
            mType, mName
        });
    }


    public (String s, int i, String s1)
    {
        this(null, s, i, s1);
    }

    public <init>(String s, String s1, int i, String s2)
    {
        mType = s;
        mName = s1;
        mRank = i;
        mSwatchUrl = s2;
    }
}
