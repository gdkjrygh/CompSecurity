// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.util.Date;

class CertStatus
{

    public static final int UNDETERMINED = 12;
    public static final int UNREVOKED = 11;
    int certStatus;
    Date revocationDate;

    CertStatus()
    {
        certStatus = 11;
        revocationDate = null;
    }

    public int getCertStatus()
    {
        return certStatus;
    }

    public Date getRevocationDate()
    {
        return revocationDate;
    }

    public void setCertStatus(int i)
    {
        certStatus = i;
    }

    public void setRevocationDate(Date date)
    {
        revocationDate = date;
    }
}
