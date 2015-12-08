// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.type;


public final class AppStatsInstanceType extends Enum
{

    public static final AppStatsInstanceType INST_TYPE_BARCODE_CAPTURE;
    public static final AppStatsInstanceType INST_TYPE_BARCODE_READER;
    public static final AppStatsInstanceType INST_TYPE_FIELDS_CHANGED;
    public static final AppStatsInstanceType INST_TYPE_IMAGE_CAPTURE;
    public static final AppStatsInstanceType INST_TYPE_IMAGE_CLASSIFIER;
    public static final AppStatsInstanceType INST_TYPE_IMAGE_CREATED;
    public static final AppStatsInstanceType INST_TYPE_IMAGE_PROCESSOR;
    public static final AppStatsInstanceType INST_TYPE_IMAGE_REVIEW_EDIT;
    public static final AppStatsInstanceType INST_TYPE_KFS_SERVER;
    public static final AppStatsInstanceType INST_TYPE_KTA_SERVER;
    public static final AppStatsInstanceType INST_TYPE_OCR;
    public static final AppStatsInstanceType INST_TYPE_UNUSED;
    private static final String a = "AppStatsInstanceType";
    private static final AppStatsInstanceType c[];
    private final String b;

    private AppStatsInstanceType(String s, int i, String s1)
    {
        super(s, i);
        b = s1;
    }

    public static AppStatsInstanceType valueOf(String s)
    {
        return (AppStatsInstanceType)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/type/AppStatsInstanceType, s);
    }

    public static AppStatsInstanceType[] values()
    {
        return (AppStatsInstanceType[])c.clone();
    }

    public String getInstTypeDescrip()
    {
        return b;
    }

    static 
    {
        INST_TYPE_UNUSED = new AppStatsInstanceType("INST_TYPE_UNUSED", 0, "Unused");
        INST_TYPE_IMAGE_CLASSIFIER = new AppStatsInstanceType("INST_TYPE_IMAGE_CLASSIFIER", 1, "ImageClassifier");
        INST_TYPE_IMAGE_PROCESSOR = new AppStatsInstanceType("INST_TYPE_IMAGE_PROCESSOR", 2, "ImageProcessor");
        INST_TYPE_BARCODE_READER = new AppStatsInstanceType("INST_TYPE_BARCODE_READER", 3, "BarcodeReader");
        INST_TYPE_IMAGE_CAPTURE = new AppStatsInstanceType("INST_TYPE_IMAGE_CAPTURE", 4, "ImageCapture");
        INST_TYPE_IMAGE_REVIEW_EDIT = new AppStatsInstanceType("INST_TYPE_IMAGE_REVIEW_EDIT", 5, "ImageReviewEdit");
        INST_TYPE_BARCODE_CAPTURE = new AppStatsInstanceType("INST_TYPE_BARCODE_CAPTURE", 6, "BarcodeCapture");
        INST_TYPE_KFS_SERVER = new AppStatsInstanceType("INST_TYPE_KFS_SERVER", 7, "FrontOfficeServer");
        INST_TYPE_KTA_SERVER = new AppStatsInstanceType("INST_TYPE_KTA_SERVER", 8, "TotalAgilityServer");
        INST_TYPE_FIELDS_CHANGED = new AppStatsInstanceType("INST_TYPE_FIELDS_CHANGED", 9, "FieldsChanged");
        INST_TYPE_IMAGE_CREATED = new AppStatsInstanceType("INST_TYPE_IMAGE_CREATED", 10, "Image");
        INST_TYPE_OCR = new AppStatsInstanceType("INST_TYPE_OCR", 11, "OCR");
        c = (new AppStatsInstanceType[] {
            INST_TYPE_UNUSED, INST_TYPE_IMAGE_CLASSIFIER, INST_TYPE_IMAGE_PROCESSOR, INST_TYPE_BARCODE_READER, INST_TYPE_IMAGE_CAPTURE, INST_TYPE_IMAGE_REVIEW_EDIT, INST_TYPE_BARCODE_CAPTURE, INST_TYPE_KFS_SERVER, INST_TYPE_KTA_SERVER, INST_TYPE_FIELDS_CHANGED, 
            INST_TYPE_IMAGE_CREATED, INST_TYPE_OCR
        });
    }
}
