// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.service.pharmacylegacy;


public class HtmlContent
{

    private String mContent;
    private String mContentId;
    private String mResultCode;
    private String mResultMessage;

    public HtmlContent()
    {
    }

    public String getContent()
    {
        return mContent;
    }

    public String getContentId()
    {
        return mContentId;
    }

    public String getResultCode()
    {
        return mResultCode;
    }

    public String getResultMessage()
    {
        return mResultMessage;
    }

    public void setContent(String s)
    {
        mContent = s;
    }

    public void setContentId(String s)
    {
        mContentId = s;
    }

    public void setResultCode(String s)
    {
        mResultCode = s;
    }

    public void setResultMessage(String s)
    {
        mResultMessage = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("HtmlContent [mContentId=").append(mContentId).append(", mContent=").append(mContent).append(", mResultCode=").append(mResultCode).append(", mResultMessage=").append(mResultMessage).append("]").toString();
    }
}
