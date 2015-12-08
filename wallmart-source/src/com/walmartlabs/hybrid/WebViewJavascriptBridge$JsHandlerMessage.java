// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.hybrid;


// Referenced classes of package com.walmartlabs.hybrid:
//            WebViewJavascriptBridge

public static class callbackId
{

    public String callbackId;
    public Object data;
    public String handlerName;

    public (String s, Object obj, String s1)
    {
        handlerName = s;
        data = obj;
        callbackId = s1;
    }
}
