// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            ProfileResponseError

public final class Shape_ProfileResponseError extends ProfileResponseError
{

    private String code;
    private String message;

    Shape_ProfileResponseError()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (ProfileResponseError)obj;
            if (((ProfileResponseError) (obj)).getCode() == null ? getCode() != null : !((ProfileResponseError) (obj)).getCode().equals(getCode()))
            {
                return false;
            }
            if (((ProfileResponseError) (obj)).getMessage() == null ? getMessage() != null : !((ProfileResponseError) (obj)).getMessage().equals(getMessage()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getCode()
    {
        return code;
    }

    public final String getMessage()
    {
        return message;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (code == null)
        {
            i = 0;
        } else
        {
            i = code.hashCode();
        }
        if (message != null)
        {
            j = message.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    final ProfileResponseError setCode(String s)
    {
        code = s;
        return this;
    }

    final ProfileResponseError setMessage(String s)
    {
        message = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("ProfileResponseError{code=")).append(code).append(", message=").append(message).append("}").toString();
    }
}
