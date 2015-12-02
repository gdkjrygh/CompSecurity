// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.shoppingcart.model;


// Referenced classes of package com.ubercab.client.feature.shoppingcart.model:
//            BadgeColor

public class Badge
{

    BadgeColor backgroundColor;
    BadgeColor foregroundColor;
    BadgeColor iconColor;
    String iconUrl;
    String text;

    public Badge()
    {
    }

    public BadgeColor getBackgroundColor()
    {
        return backgroundColor;
    }

    public BadgeColor getForegroundColor()
    {
        return foregroundColor;
    }

    public BadgeColor getIconColor()
    {
        return iconColor;
    }

    public String getIconUrl()
    {
        return iconUrl;
    }

    public String getText()
    {
        return text;
    }

    public void setIconUrl(String s)
    {
        iconUrl = s;
    }

    public void setText(String s)
    {
        text = s;
    }
}
