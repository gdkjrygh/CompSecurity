// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.wxdata.exceptions;


// Referenced classes of package com.wsi.android.framework.wxdata.exceptions:
//            ParseException

public class XmlParseException extends ParseException
{

    private static final long serialVersionUID = 0x117c07e89e21277dL;

    public XmlParseException(String s)
    {
        super(s);
    }

    public XmlParseException(String s, Throwable throwable)
    {
        super(s, throwable);
    }

    public XmlParseException(Throwable throwable)
    {
        super(throwable);
    }
}
