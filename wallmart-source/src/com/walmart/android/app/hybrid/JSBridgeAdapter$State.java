// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;


// Referenced classes of package com.walmart.android.app.hybrid:
//            JSBridgeAdapter

public static class showCart
{

    public String backTitle;
    public String pageLoadUrl;
    public String shareText;
    public String shareTitle;
    public boolean showCart;
    public boolean showSearch;
    public String title;

    public String toString()
    {
        return (new StringBuilder()).append("State{pageLoadUrl='").append(pageLoadUrl).append('\'').append(", title='").append(title).append('\'').append(", backTitle='").append(backTitle).append('\'').append(", shareText='").append(shareText).append('\'').append(", shareTitle='").append(shareTitle).append('\'').append(", showSearch=").append(showSearch).append(", showCart=").append(showCart).append('}').toString();
    }

    public ()
    {
    }

    public ( )
    {
        title = .title;
        backTitle = .backTitle;
        shareText = .shareText;
        shareTitle = .shareTitle;
        showSearch = .showSearch;
        showCart = .showCart;
    }
}
