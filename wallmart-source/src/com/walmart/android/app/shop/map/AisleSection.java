// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;

import java.util.Arrays;

public class AisleSection
{
    public static class Builder
    {

        private String mDepartment;
        private String mName;
        private float mPosition[];

        public AisleSection build()
        {
            if (mDepartment != null && mName != null && mPosition != null && mPosition.length == 2)
            {
                return new AisleSection(this);
            } else
            {
                return null;
            }
        }

        public Builder setDepartment(String s)
        {
            mDepartment = s;
            return this;
        }

        public Builder setName(String s)
        {
            mName = s;
            return this;
        }

        public Builder setPosition(float af[])
        {
            mPosition = af;
            return this;
        }




        public Builder()
        {
        }
    }


    private final String mDepartment;
    private final String mName;
    private final float mPosition[];

    private AisleSection(Builder builder)
    {
        mDepartment = builder.mDepartment;
        mName = builder.mName;
        mPosition = builder.mPosition;
    }


    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (getClass() != obj.getClass())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (AisleSection)obj;
        if (mDepartment == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!mDepartment.equals(((AisleSection) (obj)).mDepartment))
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (mName.equals(((AisleSection) (obj)).mName))
        {
            return Arrays.equals(mPosition, ((AisleSection) (obj)).mPosition);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (((AisleSection) (obj)).mDepartment != null)
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public String getDepartment()
    {
        return mDepartment;
    }

    public String getName()
    {
        return mName;
    }

    public float[] getPosition()
    {
        return mPosition;
    }

    public int hashCode()
    {
        int i;
        if (mDepartment != null)
        {
            i = mDepartment.hashCode();
        } else
        {
            i = 0;
        }
        return (i * 31 + mName.hashCode()) * 31 + Arrays.hashCode(mPosition);
    }
}
