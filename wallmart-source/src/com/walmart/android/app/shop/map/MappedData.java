// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;


// Referenced classes of package com.walmart.android.app.shop.map:
//            AisleSection

public class MappedData
{
    public static class Builder
    {

        private AisleSection mAisleSection;
        private Object mSourceData;
        private int mSourcePosition;

        public MappedData build()
        {
            if (mAisleSection != null && mSourceData != null)
            {
                return new MappedData(this);
            } else
            {
                return null;
            }
        }

        public Builder setAisleSection(AisleSection aislesection)
        {
            mAisleSection = aislesection;
            return this;
        }

        public Builder setSourceData(Object obj)
        {
            mSourceData = obj;
            return this;
        }

        public Builder setSourcePosition(int i)
        {
            mSourcePosition = i;
            return this;
        }




        public Builder()
        {
        }
    }


    private final AisleSection mAisleSection;
    private final Object mSourceData;
    private final int mSourcePosition;

    private MappedData(Builder builder)
    {
        mSourcePosition = builder.mSourcePosition;
        mAisleSection = builder.mAisleSection;
        mSourceData = builder.mSourceData;
    }


    public AisleSection getAisleSection()
    {
        return mAisleSection;
    }

    public Object getSourceData()
    {
        return mSourceData;
    }

    public int getSourcePosition()
    {
        return mSourcePosition;
    }
}
