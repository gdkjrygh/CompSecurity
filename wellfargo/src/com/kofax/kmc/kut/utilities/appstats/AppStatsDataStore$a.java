// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats;


final class n extends Enum
{

    public static final m a;
    public static final m b;
    public static final m c;
    public static final m d;
    public static final m e;
    public static final m f;
    public static final m g;
    public static final m h;
    public static final m i;
    public static final m j;
    public static final m k;
    public static final m l;
    public static final m m;
    private static final m o[];
    private String n;

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/AppStatsDataStore$a, s);
    }

    public static n[] values()
    {
        return (n[])o.clone();
    }

    public String a()
    {
        return n;
    }

    static 
    {
        a = new <init>("DAO_CLASS_ENVIRONMENT_EVENT", 0, "com.kofax.kmc.kut.utilities.appstats.dao.EnvironmentEventDao");
        b = new <init>("DAO_CLASS_ERROR_LOG_EVENT", 1, "com.kofax.kmc.kut.utilities.appstats.dao.ErrorLogEventDao");
        c = new <init>("DAO_CLASS_DOCUMENT_EVENT", 2, "com.kofax.kmc.kut.utilities.appstats.dao.DocumentEventDao");
        d = new <init>("DAO_CLASS_SESSION_EVENT", 3, "com.kofax.kmc.kut.utilities.appstats.dao.SessEventDao");
        e = new <init>("DAO_CLASS_IMAGE", 4, "com.kofax.kmc.kut.utilities.appstats.dao.ImageDao");
        f = new <init>("DAO_CLASS_EVENT_INSTANCE", 5, "com.kofax.kmc.kut.utilities.appstats.dao.EventInstanceDao");
        g = new <init>("DAO_CLASS_IMG_CLASSIFIER_EVENT", 6, "com.kofax.kmc.kut.utilities.appstats.dao.ImgClassificationEventDao");
        h = new <init>("DAO_CLASS_IMG_CLASSIFIER_EVENT_ALT", 7, "com.kofax.kmc.kut.utilities.appstats.dao.ImgClassificationEventAltDao");
        i = new <init>("DAO_CLASS_IMG_CAPTURE_EVENT", 8, "com.kofax.kmc.kut.utilities.appstats.dao.ImgCaptureEventDao");
        j = new <init>("DAO_CLASS_PROPERTY_CHANGE_EVENT", 9, "com.kofax.kmc.kut.utilities.appstats.dao.PropertyChangeEventDao");
        k = new <init>("DAO_CLASS_IMG_FIELD_CHANGED_EVENT", 10, "com.kofax.kmc.kut.utilities.appstats.dao.FieldEventDao");
        l = new <init>("DAO_CLASS_IMAGE_PROCESSED_EVENT", 11, "com.kofax.kmc.kut.utilities.appstats.dao.ImageProcessEventDao");
        m = new <init>("DAO_CLASS_OCR_EVENT", 12, "com.kofax.kmc.kut.utilities.appstats.dao.OCREventDao");
        o = (new o[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m
        });
    }

    private (String s, int i1, String s1)
    {
        super(s, i1);
        n = s1;
    }
}
