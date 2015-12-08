// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;

import java.util.Arrays;

public class StatusMessage
{

    private String mDescription;
    private String mKey;
    private String mParameters[];
    private String mStatusSeverity;

    public StatusMessage()
    {
    }

    public String getDescription()
    {
        return mDescription;
    }

    public String getKey()
    {
        return mKey;
    }

    public String[] getParameters()
    {
        return mParameters;
    }

    public String getStatusSeverity()
    {
        return mStatusSeverity;
    }

    public void setDescription(String s)
    {
        mDescription = s;
    }

    public void setKey(String s)
    {
        mKey = s;
    }

    public void setParameters(String as[])
    {
        mParameters = as;
    }

    public void setStatusSeverity(String s)
    {
        mStatusSeverity = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("StatusMessage [mKey=").append(mKey).append(", mDescription=").append(mDescription).append(", mStatusSeverity=").append(mStatusSeverity).append(", mParameters=").append(Arrays.toString(mParameters)).append("]").toString();
    }
}
