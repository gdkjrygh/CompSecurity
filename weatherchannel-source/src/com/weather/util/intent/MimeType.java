// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.intent;


public final class MimeType extends Enum
{

    private static final MimeType $VALUES[];
    public static final MimeType IMAGE;
    public static final MimeType TEXT;
    public static final MimeType TEXT_HTML;
    public static final MimeType TEXT_PLAIN;
    public static final MimeType VIDEO;
    private final String mimeString;

    private MimeType(String s, int i, String s1)
    {
        super(s, i);
        mimeString = s1;
    }

    public static MimeType valueOf(String s)
    {
        return (MimeType)Enum.valueOf(com/weather/util/intent/MimeType, s);
    }

    public static MimeType[] values()
    {
        return (MimeType[])$VALUES.clone();
    }

    public String getMimeString()
    {
        return mimeString;
    }

    static 
    {
        IMAGE = new MimeType("IMAGE", 0, "image/*");
        VIDEO = new MimeType("VIDEO", 1, "video/*");
        TEXT = new MimeType("TEXT", 2, "text/*");
        TEXT_PLAIN = new MimeType("TEXT_PLAIN", 3, "text/plain");
        TEXT_HTML = new MimeType("TEXT_HTML", 4, "text/html");
        $VALUES = (new MimeType[] {
            IMAGE, VIDEO, TEXT, TEXT_PLAIN, TEXT_HTML
        });
    }
}
