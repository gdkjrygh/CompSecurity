// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class Session
    implements com.ubercab.rider.realtime.model.Session
{

    private String sessionHash;

    public Session()
    {
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Session)obj;
            if (sessionHash == null ? ((Session) (obj)).sessionHash != null : !sessionHash.equals(((Session) (obj)).sessionHash))
            {
                return false;
            }
        }
        return true;
    }

    public String getSessionHash()
    {
        return sessionHash;
    }

    public int hashCode()
    {
        if (sessionHash != null)
        {
            return sessionHash.hashCode();
        } else
        {
            return 0;
        }
    }
}
