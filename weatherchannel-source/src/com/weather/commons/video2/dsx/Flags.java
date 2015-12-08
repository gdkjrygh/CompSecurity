// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.video2.dsx;

import com.weather.util.parsing.Validation;
import com.weather.util.parsing.ValidationException;
import org.json.JSONException;
import org.json.JSONObject;

public class Flags
{

    private static final String FIELD_NAME_MOBILE_APPS = "Mobile Apps";
    private static final Flags defaultInstance;
    private final boolean facebook;
    private final boolean googlePlus;
    private final boolean littleWeb;
    private final boolean twitter;
    private final boolean youTube;

    private Flags(boolean flag, boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5)
        throws ValidationException
    {
        Validation.validateTrue("Mobile Apps", flag);
        facebook = flag1;
        twitter = flag2;
        youTube = flag3;
        googlePlus = flag4;
        littleWeb = flag5;
    }

    public static Flags fromJson(JSONObject jsonobject)
        throws JSONException, ValidationException
    {
        return new Flags(jsonobject.getBoolean("Mobile Apps"), jsonobject.optBoolean("Facebook", true), jsonobject.optBoolean("Twitter", true), jsonobject.optBoolean("YouTube", true), jsonobject.optBoolean("Google+", true), jsonobject.optBoolean("Little Web", true));
    }

    public static Flags getDefault()
    {
        return defaultInstance;
    }

    public boolean getFacebook()
    {
        return facebook;
    }

    public boolean getGooglePlus()
    {
        return googlePlus;
    }

    public boolean getLittleWeb()
    {
        return littleWeb;
    }

    public boolean getTwitter()
    {
        return twitter;
    }

    public boolean getYouTube()
    {
        return youTube;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Flags{facebook=").append(facebook).append(", twitter=").append(twitter).append(", youTube=").append(youTube).append(", googlePlus=").append(googlePlus).append(", littleWeb=").append(littleWeb).append('}').toString();
    }

    static 
    {
        try
        {
            defaultInstance = new Flags(true, true, true, true, true, true);
        }
        catch (ValidationException validationexception)
        {
            throw new RuntimeException(validationexception);
        }
    }
}
