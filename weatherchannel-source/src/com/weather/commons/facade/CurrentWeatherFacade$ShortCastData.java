// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;


// Referenced classes of package com.weather.commons.facade:
//            CurrentWeatherFacade

private static class <init>
{

    private final String shortCastPhrase;
    private final String temp;

    public boolean hasValidData()
    {
        return shortCastPhrase != null && temp != null;
    }



    private (String s, String s1)
    {
        shortCastPhrase = s;
        temp = s1;
    }

    temp(String s, String s1, temp temp1)
    {
        this(s, s1);
    }
}
