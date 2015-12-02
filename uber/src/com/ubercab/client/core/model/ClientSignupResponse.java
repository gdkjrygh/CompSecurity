// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public class ClientSignupResponse
{

    String email;
    String error;
    String first_name;
    String last_name;
    String mobile;
    String token;
    String uuid;

    public ClientSignupResponse()
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
            obj = (ClientSignupResponse)obj;
            if (email == null ? ((ClientSignupResponse) (obj)).email != null : !email.equals(((ClientSignupResponse) (obj)).email))
            {
                return false;
            }
            if (error == null ? ((ClientSignupResponse) (obj)).error != null : !error.equals(((ClientSignupResponse) (obj)).error))
            {
                return false;
            }
            if (first_name == null ? ((ClientSignupResponse) (obj)).first_name != null : !first_name.equals(((ClientSignupResponse) (obj)).first_name))
            {
                return false;
            }
            if (last_name == null ? ((ClientSignupResponse) (obj)).last_name != null : !last_name.equals(((ClientSignupResponse) (obj)).last_name))
            {
                return false;
            }
            if (mobile == null ? ((ClientSignupResponse) (obj)).mobile != null : !mobile.equals(((ClientSignupResponse) (obj)).mobile))
            {
                return false;
            }
            if (token == null ? ((ClientSignupResponse) (obj)).token != null : !token.equals(((ClientSignupResponse) (obj)).token))
            {
                return false;
            }
            if (uuid == null ? ((ClientSignupResponse) (obj)).uuid != null : !uuid.equals(((ClientSignupResponse) (obj)).uuid))
            {
                return false;
            }
        }
        return true;
    }

    public String getEmail()
    {
        return email;
    }

    public String getErrorMessage()
    {
        return error;
    }

    public String getFirstName()
    {
        return first_name;
    }

    public String getLastName()
    {
        return last_name;
    }

    public String getMobile()
    {
        return mobile;
    }

    public String getToken()
    {
        return token;
    }

    public String getUuid()
    {
        return uuid;
    }

    public int hashCode()
    {
        int k1 = 0;
        int i;
        int j;
        int k;
        int l;
        int i1;
        int j1;
        if (error != null)
        {
            i = error.hashCode();
        } else
        {
            i = 0;
        }
        if (uuid != null)
        {
            j = uuid.hashCode();
        } else
        {
            j = 0;
        }
        if (email != null)
        {
            k = email.hashCode();
        } else
        {
            k = 0;
        }
        if (mobile != null)
        {
            l = mobile.hashCode();
        } else
        {
            l = 0;
        }
        if (first_name != null)
        {
            i1 = first_name.hashCode();
        } else
        {
            i1 = 0;
        }
        if (last_name != null)
        {
            j1 = last_name.hashCode();
        } else
        {
            j1 = 0;
        }
        if (token != null)
        {
            k1 = token.hashCode();
        }
        return (j1 + (i1 + (l + (k + (j + i * 31) * 31) * 31) * 31) * 31) * 31 + k1;
    }

    public boolean isPending()
    {
        return error != null && !error.isEmpty();
    }

    public void setEmail(String s)
    {
        email = s;
    }

    public void setErrorMessage(String s)
    {
        error = s;
    }

    public void setFirstName(String s)
    {
        first_name = s;
    }

    public void setLastName(String s)
    {
        last_name = s;
    }

    public void setMobile(String s)
    {
        mobile = s;
    }

    public void setToken(String s)
    {
        token = s;
    }

    public void setUuid(String s)
    {
        uuid = s;
    }
}
