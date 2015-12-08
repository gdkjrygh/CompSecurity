// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.exceptions;


// Referenced classes of package com.wsi.android.framework.wxdata.exceptions:
//            WxFrameworkException

public abstract class ParseException extends WxFrameworkException
{

    private static final long serialVersionUID = 0x85e95011f579bed9L;

    public ParseException(String s)
    {
        super(s);
    }

    public ParseException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public ParseException(Throwable throwable)
    {
        super(throwable);
    }
}
