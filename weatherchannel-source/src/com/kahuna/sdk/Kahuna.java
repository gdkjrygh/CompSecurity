// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;


// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, IKahuna

public final class Kahuna extends KahunaCommon
{

    public static final String ACTION_PUSH_CLICKED = "com.kahuna.sdk.push.clicked";
    public static final String ACTION_PUSH_RECEIVED = "com.kahuna.sdk.push.received";
    public static final String EXTRA_LANDING_DICTIONARY_ID = "landing_extras_id";
    public static final String EXTRA_PUSH_MESSAGE = "alert";
    public static final int LOCATION_REGION_MONITORING_OPTION = 1;
    private static IKahuna mInstance = new Kahuna();

    private Kahuna()
    {
    }

    private static void createNewInstanceForTest()
    {
        mInstance = new Kahuna();
    }

    public static IKahuna getInstance()
    {
        return mInstance;
    }

}
