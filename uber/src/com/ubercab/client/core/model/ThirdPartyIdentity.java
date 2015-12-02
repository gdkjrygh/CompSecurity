// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class ThirdPartyIdentity
    implements com.ubercab.rider.realtime.model.ThirdPartyIdentity
{

    private String id;
    private String token;
    private String type;

    public ThirdPartyIdentity()
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
            obj = (ThirdPartyIdentity)obj;
            if (id == null ? ((ThirdPartyIdentity) (obj)).id != null : !id.equals(((ThirdPartyIdentity) (obj)).id))
            {
                return false;
            }
            if (token == null ? ((ThirdPartyIdentity) (obj)).token != null : !token.equals(((ThirdPartyIdentity) (obj)).token))
            {
                return false;
            }
            if (type == null ? ((ThirdPartyIdentity) (obj)).type != null : !type.equals(((ThirdPartyIdentity) (obj)).type))
            {
                return false;
            }
        }
        return true;
    }

    public String getId()
    {
        return id;
    }

    public String getToken()
    {
        return token;
    }

    public String getType()
    {
        return type;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (id != null)
        {
            i = id.hashCode();
        } else
        {
            i = 0;
        }
        if (token != null)
        {
            j = token.hashCode();
        } else
        {
            j = 0;
        }
        if (type != null)
        {
            k = type.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }
}
