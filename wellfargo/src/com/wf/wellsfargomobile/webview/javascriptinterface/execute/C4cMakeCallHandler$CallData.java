// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.webview.javascriptinterface.execute;


public class 
{

    private String dtmf;
    private String phoneNumber;

    public String getDtmf()
    {
        return dtmf;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setDtmf(String s)
    {
        dtmf = s;
    }

    public void setPhoneNumber(String s)
    {
        phoneNumber = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("CallData{phoneNumber='").append(phoneNumber).append('\'').append(", dtmf='").append(dtmf).append('\'').append('}').toString();
    }

    public ()
    {
    }
}
