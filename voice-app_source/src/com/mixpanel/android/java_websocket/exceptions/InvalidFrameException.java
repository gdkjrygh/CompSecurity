// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.exceptions;


// Referenced classes of package com.mixpanel.android.java_websocket.exceptions:
//            InvalidDataException

public class InvalidFrameException extends InvalidDataException
{

    private static final long serialVersionUID = 0x82def852b5c003d9L;

    public InvalidFrameException()
    {
        super(1002);
    }

    public InvalidFrameException(String s)
    {
        super(1002, s);
    }

    public InvalidFrameException(String s, Throwable throwable)
    {
        super(1002, s, throwable);
    }

    public InvalidFrameException(Throwable throwable)
    {
        super(1002, throwable);
    }
}
