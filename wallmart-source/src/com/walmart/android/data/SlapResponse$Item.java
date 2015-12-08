// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.data;


// Referenced classes of package com.walmart.android.data:
//            SlapResponse

public static class 
{

    public String id;
    public String name;
    public String productImageUrl;
    public String signingDesc;
    public String sizeDesc;
    public String upc;

    public String toString()
    {
        return (new StringBuilder()).append("Item [id=").append(id).append(", name=").append(name).append(", productImageUrl=").append(productImageUrl).append(", signingDesc=").append(signingDesc).append(", sizeDesc=").append(sizeDesc).append(", upc=").append(upc).append("]").toString();
    }

    public ()
    {
    }
}
