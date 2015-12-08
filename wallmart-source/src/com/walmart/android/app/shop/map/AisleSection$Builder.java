// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.shop.map;


// Referenced classes of package com.walmart.android.app.shop.map:
//            AisleSection

public static class 
{

    private String mDepartment;
    private String mName;
    private float mPosition[];

    public AisleSection build()
    {
        if (mDepartment != null && mName != null && mPosition != null && mPosition.length == 2)
        {
            return new AisleSection(this, null);
        } else
        {
            return null;
        }
    }

    public mPosition setDepartment(String s)
    {
        mDepartment = s;
        return this;
    }

    public mDepartment setName(String s)
    {
        mName = s;
        return this;
    }

    public mName setPosition(float af[])
    {
        mPosition = af;
        return this;
    }




    public ()
    {
    }
}
