// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;


// Referenced classes of package com.walmart.android.app.shop.map:
//            MappedData, AisleSection

public static class _cls9
{

    private AisleSection mAisleSection;
    private Object mSourceData;
    private int mSourcePosition;

    public MappedData build()
    {
        if (mAisleSection != null && mSourceData != null)
        {
            return new MappedData(this, null);
        } else
        {
            return null;
        }
    }

    public mSourceData setAisleSection(AisleSection aislesection)
    {
        mAisleSection = aislesection;
        return this;
    }

    public mAisleSection setSourceData(Object obj)
    {
        mSourceData = obj;
        return this;
    }

    public mSourceData setSourcePosition(int i)
    {
        mSourcePosition = i;
        return this;
    }




    public _cls9()
    {
    }
}
