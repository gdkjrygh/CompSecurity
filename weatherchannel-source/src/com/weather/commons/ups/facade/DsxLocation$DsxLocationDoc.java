// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.facade;


// Referenced classes of package com.weather.commons.ups.facade:
//            DsxLocation

public static class <init>
{

    private final String address;
    private final String loc;
    private final String nickname;
    private final int position;
    private final String tag;

    public String getAddress()
    {
        return address;
    }

    public String getLoc()
    {
        return loc;
    }

    public String getNickname()
    {
        return nickname;
    }

    public int getPosition()
    {
        return position;
    }

    public String getTag()
    {
        return tag;
    }

    public ()
    {
        address = null;
        loc = "";
        nickname = null;
        position = 0;
        tag = null;
    }

    private tag(String s, String s1, String s2, int i, String s3)
    {
        address = s;
        loc = s1;
        nickname = s2;
        position = i;
        tag = s3;
    }

    tag(String s, String s1, String s2, int i, String s3, tag tag1)
    {
        this(s, s1, s2, i, s3);
    }
}
