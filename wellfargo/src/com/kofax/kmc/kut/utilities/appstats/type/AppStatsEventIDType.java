// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kut.utilities.appstats.type;


public final class AppStatsEventIDType extends Enum
{

    public static final AppStatsEventIDType APP_STATS_BAR_CAPTURE_EVENT;
    public static final AppStatsEventIDType APP_STATS_BAR_READER_START_EVENT;
    public static final AppStatsEventIDType APP_STATS_BAR_READER_STOP_EVENT;
    public static final AppStatsEventIDType APP_STATS_BEGIN_SESSION_EVENT;
    public static final AppStatsEventIDType APP_STATS_CLASSIFY_START_EVENT;
    public static final AppStatsEventIDType APP_STATS_CLASSIFY_STOP_EVENT;
    public static final AppStatsEventIDType APP_STATS_DOCUMENT_CREATE_EVENT;
    public static final AppStatsEventIDType APP_STATS_DOCUMENT_UPDATE_EVENT;
    public static final AppStatsEventIDType APP_STATS_END_SESSION_EVENT;
    public static final AppStatsEventIDType APP_STATS_ENVIRONMENT_CHANGED_EVENT;
    public static final AppStatsEventIDType APP_STATS_ERROR_LOG_EVENT;
    public static final AppStatsEventIDType APP_STATS_FIELD_CHANGED;
    public static final AppStatsEventIDType APP_STATS_FIELD_CHANGE_EVENT;
    public static final AppStatsEventIDType APP_STATS_IMAGE_ADD_TO_DOCUMENT;
    public static final AppStatsEventIDType APP_STATS_IMAGE_CREATED;
    public static final AppStatsEventIDType APP_STATS_IMG_CAPTURE_EVENT;
    public static final AppStatsEventIDType APP_STATS_IMG_CAPTURE_FOCUS;
    public static final AppStatsEventIDType APP_STATS_IMG_CAPTURE_LEVELNESS;
    public static final AppStatsEventIDType APP_STATS_IMG_CAPTURE_PAGEDETECT;
    public static final AppStatsEventIDType APP_STATS_IMG_CAPTURE_STABILITY;
    public static final AppStatsEventIDType APP_STATS_IMG_EXP_CAPTURE_EVENT;
    public static final AppStatsEventIDType APP_STATS_IMG_FORCE_CAPTURE_EVENT;
    public static final AppStatsEventIDType APP_STATS_IMG_PROCESSING_START_EVENT;
    public static final AppStatsEventIDType APP_STATS_IMG_PROCESSING_STOP_EVENT;
    public static final AppStatsEventIDType APP_STATS_IMG_PROC_START_EVENT;
    public static final AppStatsEventIDType APP_STATS_IMG_PROC_STOP_EVENT;
    public static final AppStatsEventIDType APP_STATS_IMG_REVIEW_MOVE_EVENT;
    public static final AppStatsEventIDType APP_STATS_KFS_KTA_SERVER_START_EVENT;
    public static final AppStatsEventIDType APP_STATS_KFS_KTA_SERVER_STOP_EVENT;
    public static final AppStatsEventIDType APP_STATS_LOG_SESSION_EVENT;
    public static final AppStatsEventIDType APP_STATS_OCR_START_EVENT;
    public static final AppStatsEventIDType APP_STATS_OCR_STOP_EVENT;
    public static final AppStatsEventIDType APP_STATS_PROPERTY_CHANGE_EVENT;
    public static final AppStatsEventIDType APP_STATS_UNKNOWN_EVENT;
    private static final AppStatsEventIDType b[];
    private final String a;

    private AppStatsEventIDType(String s, int i, String s1)
    {
        super(s, i);
        a = s1;
    }

    public static AppStatsEventIDType valueOf(String s)
    {
        return (AppStatsEventIDType)Enum.valueOf(com/kofax/kmc/kut/utilities/appstats/type/AppStatsEventIDType, s);
    }

    public static AppStatsEventIDType[] values()
    {
        return (AppStatsEventIDType[])b.clone();
    }

    public String getEventTypeDescription()
    {
        return a;
    }

    static 
    {
        APP_STATS_UNKNOWN_EVENT = new AppStatsEventIDType("APP_STATS_UNKNOWN_EVENT", 0, "Unknown");
        APP_STATS_ERROR_LOG_EVENT = new AppStatsEventIDType("APP_STATS_ERROR_LOG_EVENT", 1, "ErrorLog");
        APP_STATS_ENVIRONMENT_CHANGED_EVENT = new AppStatsEventIDType("APP_STATS_ENVIRONMENT_CHANGED_EVENT", 2, "EnvironmentChanged");
        APP_STATS_FIELD_CHANGE_EVENT = new AppStatsEventIDType("APP_STATS_FIELD_CHANGE_EVENT", 3, "");
        APP_STATS_CLASSIFY_START_EVENT = new AppStatsEventIDType("APP_STATS_CLASSIFY_START_EVENT", 4, "");
        APP_STATS_CLASSIFY_STOP_EVENT = new AppStatsEventIDType("APP_STATS_CLASSIFY_STOP_EVENT", 5, "");
        APP_STATS_IMG_PROC_START_EVENT = new AppStatsEventIDType("APP_STATS_IMG_PROC_START_EVENT", 6, "");
        APP_STATS_IMG_PROC_STOP_EVENT = new AppStatsEventIDType("APP_STATS_IMG_PROC_STOP_EVENT", 7, "");
        APP_STATS_BAR_READER_START_EVENT = new AppStatsEventIDType("APP_STATS_BAR_READER_START_EVENT", 8, "");
        APP_STATS_BAR_READER_STOP_EVENT = new AppStatsEventIDType("APP_STATS_BAR_READER_STOP_EVENT", 9, "");
        APP_STATS_BAR_CAPTURE_EVENT = new AppStatsEventIDType("APP_STATS_BAR_CAPTURE_EVENT", 10, "BarcodeCapture");
        APP_STATS_IMG_REVIEW_MOVE_EVENT = new AppStatsEventIDType("APP_STATS_IMG_REVIEW_MOVE_EVENT", 11, "Review");
        APP_STATS_KFS_KTA_SERVER_START_EVENT = new AppStatsEventIDType("APP_STATS_KFS_KTA_SERVER_START_EVENT", 12, "ServerStart");
        APP_STATS_KFS_KTA_SERVER_STOP_EVENT = new AppStatsEventIDType("APP_STATS_KFS_KTA_SERVER_STOP_EVENT", 13, "ServerStop");
        APP_STATS_PROPERTY_CHANGE_EVENT = new AppStatsEventIDType("APP_STATS_PROPERTY_CHANGE_EVENT", 14, "PropertyChanged");
        APP_STATS_IMG_CAPTURE_EVENT = new AppStatsEventIDType("APP_STATS_IMG_CAPTURE_EVENT", 15, "Capture");
        APP_STATS_IMG_CAPTURE_FOCUS = new AppStatsEventIDType("APP_STATS_IMG_CAPTURE_FOCUS", 16, "Focus");
        APP_STATS_IMG_CAPTURE_STABILITY = new AppStatsEventIDType("APP_STATS_IMG_CAPTURE_STABILITY", 17, "Stability");
        APP_STATS_IMG_CAPTURE_LEVELNESS = new AppStatsEventIDType("APP_STATS_IMG_CAPTURE_LEVELNESS", 18, "Levelness");
        APP_STATS_IMG_CAPTURE_PAGEDETECT = new AppStatsEventIDType("APP_STATS_IMG_CAPTURE_PAGEDETECT", 19, "PageDetect");
        APP_STATS_FIELD_CHANGED = new AppStatsEventIDType("APP_STATS_FIELD_CHANGED", 20, "FieldChangedEvent");
        APP_STATS_BEGIN_SESSION_EVENT = new AppStatsEventIDType("APP_STATS_BEGIN_SESSION_EVENT", 21, "BeginSessionEvent");
        APP_STATS_LOG_SESSION_EVENT = new AppStatsEventIDType("APP_STATS_LOG_SESSION_EVENT", 22, "LogSessionEvent");
        APP_STATS_END_SESSION_EVENT = new AppStatsEventIDType("APP_STATS_END_SESSION_EVENT", 23, "EndSessionEvent");
        APP_STATS_DOCUMENT_CREATE_EVENT = new AppStatsEventIDType("APP_STATS_DOCUMENT_CREATE_EVENT", 24, "DocumentCreateEvent");
        APP_STATS_DOCUMENT_UPDATE_EVENT = new AppStatsEventIDType("APP_STATS_DOCUMENT_UPDATE_EVENT", 25, "DocumentUpdateEvent");
        APP_STATS_IMAGE_CREATED = new AppStatsEventIDType("APP_STATS_IMAGE_CREATED", 26, "ImageCreated");
        APP_STATS_IMAGE_ADD_TO_DOCUMENT = new AppStatsEventIDType("APP_STATS_IMAGE_ADD_TO_DOCUMENT", 27, "ImageAddedToDocument");
        APP_STATS_IMG_PROCESSING_START_EVENT = new AppStatsEventIDType("APP_STATS_IMG_PROCESSING_START_EVENT", 28, "ImageProcessorStartEvent");
        APP_STATS_IMG_PROCESSING_STOP_EVENT = new AppStatsEventIDType("APP_STATS_IMG_PROCESSING_STOP_EVENT", 29, "ImageProcessorStopEvent");
        APP_STATS_IMG_FORCE_CAPTURE_EVENT = new AppStatsEventIDType("APP_STATS_IMG_FORCE_CAPTURE_EVENT", 30, "ForceCapture");
        APP_STATS_IMG_EXP_CAPTURE_EVENT = new AppStatsEventIDType("APP_STATS_IMG_EXP_CAPTURE_EVENT", 31, "CaptureExperienceCapture");
        APP_STATS_OCR_STOP_EVENT = new AppStatsEventIDType("APP_STATS_OCR_STOP_EVENT", 32, "OCRStop");
        APP_STATS_OCR_START_EVENT = new AppStatsEventIDType("APP_STATS_OCR_START_EVENT", 33, "OCRStart");
        b = (new AppStatsEventIDType[] {
            APP_STATS_UNKNOWN_EVENT, APP_STATS_ERROR_LOG_EVENT, APP_STATS_ENVIRONMENT_CHANGED_EVENT, APP_STATS_FIELD_CHANGE_EVENT, APP_STATS_CLASSIFY_START_EVENT, APP_STATS_CLASSIFY_STOP_EVENT, APP_STATS_IMG_PROC_START_EVENT, APP_STATS_IMG_PROC_STOP_EVENT, APP_STATS_BAR_READER_START_EVENT, APP_STATS_BAR_READER_STOP_EVENT, 
            APP_STATS_BAR_CAPTURE_EVENT, APP_STATS_IMG_REVIEW_MOVE_EVENT, APP_STATS_KFS_KTA_SERVER_START_EVENT, APP_STATS_KFS_KTA_SERVER_STOP_EVENT, APP_STATS_PROPERTY_CHANGE_EVENT, APP_STATS_IMG_CAPTURE_EVENT, APP_STATS_IMG_CAPTURE_FOCUS, APP_STATS_IMG_CAPTURE_STABILITY, APP_STATS_IMG_CAPTURE_LEVELNESS, APP_STATS_IMG_CAPTURE_PAGEDETECT, 
            APP_STATS_FIELD_CHANGED, APP_STATS_BEGIN_SESSION_EVENT, APP_STATS_LOG_SESSION_EVENT, APP_STATS_END_SESSION_EVENT, APP_STATS_DOCUMENT_CREATE_EVENT, APP_STATS_DOCUMENT_UPDATE_EVENT, APP_STATS_IMAGE_CREATED, APP_STATS_IMAGE_ADD_TO_DOCUMENT, APP_STATS_IMG_PROCESSING_START_EVENT, APP_STATS_IMG_PROCESSING_STOP_EVENT, 
            APP_STATS_IMG_FORCE_CAPTURE_EVENT, APP_STATS_IMG_EXP_CAPTURE_EVENT, APP_STATS_OCR_STOP_EVENT, APP_STATS_OCR_START_EVENT
        });
    }
}
