// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ftd extends Enum
{

    public static final ftd a;
    public static final ftd b;
    public static final ftd c;
    public static final ftd d;
    public static final ftd e;
    public static final ftd f;
    public static final ftd g;
    public static final ftd h;
    private static final ftd j[];
    private final String i;

    private ftd(String s, int k, String s1)
    {
        super(s, k);
        i = s1;
    }

    public static ftd valueOf(String s)
    {
        return (ftd)Enum.valueOf(ftd, s);
    }

    public static ftd[] values()
    {
        return (ftd[])j.clone();
    }

    public final String a()
    {
        return i;
    }

    static 
    {
        a = new ftd("SOURCE_UNDEFINED", 0, "undefined");
        b = new ftd("SOURCE_LOCATION_SEARCH", 1, "search");
        c = new ftd("SOURCE_SNAPPED", 2, "snapped");
        d = new ftd("SOURCE_EXTERNAL", 3, "external_app");
        e = new ftd("SOURCE_DEVICE", 4, "device");
        f = new ftd("SOURCE_USER_MANUAL", 5, "manual");
        g = new ftd("SOURCE_HOTSPOT", 6, "hotspot");
        h = new ftd("SOURCE_VENUE", 7, "venue");
        j = (new ftd[] {
            a, b, c, d, e, f, g, h
        });
    }
}
