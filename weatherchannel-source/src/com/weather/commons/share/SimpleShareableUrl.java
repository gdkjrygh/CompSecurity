// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.share;


// Referenced classes of package com.weather.commons.share:
//            ShareableUrl

public class SimpleShareableUrl
    implements ShareableUrl
{

    private final String title;
    private final String urlComponent;

    public SimpleShareableUrl(String s, String s1)
    {
        title = s;
        urlComponent = s1;
    }

    public String getTitle()
    {
        return title;
    }

    public String getUrl(String s)
    {
        return String.format(s, new Object[] {
            urlComponent
        });
    }
}
