// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class gqj
{

    public static final int ERROR_LOGOUT = 0;
    public static final String MESSAGE_TYPE_ERROR = "Error";
    public static final String MESSAGE_TYPE_OK = "OK";
    public static final String MESSAGE_TYPE_RETRY = "Retry";
    public static final String MESSAGE_TYPE_UPGRADE = "Upgrade";
    String description;
    Integer errorCode;
    String messageType;

    public gqj()
    {
    }

    public String getDescription()
    {
        if (description != null)
        {
            return description;
        } else
        {
            return "";
        }
    }

    public Integer getErrorCode()
    {
        return errorCode;
    }

    public String getMessageType()
    {
        if (messageType != null)
        {
            return messageType;
        } else
        {
            return "";
        }
    }

    public void setMessageType(String s)
    {
        messageType = s;
    }
}
