// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.exceptions;


// Referenced classes of package com.wsi.android.framework.wxdata.exceptions:
//            WxFrameworkException

public class DataRequestException extends WxFrameworkException
{

    private static final long serialVersionUID = 0x20d941359f7cda1dL;

    public DataRequestException(String s)
    {
        super(s);
    }

    public DataRequestException(String s, Throwable throwable)
    {
        super(s, throwable);
    }
}
