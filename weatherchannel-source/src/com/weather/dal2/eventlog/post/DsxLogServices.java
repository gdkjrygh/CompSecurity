// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.dal2.eventlog.post;

import com.weather.dal2.aws.services.AmazonServices;
import com.weather.dal2.config.DalConfig;
import com.weather.dal2.config.DalConfigManager;

public class DsxLogServices
{

    private final DalConfig dalConfig;

    public DsxLogServices()
    {
        this(DalConfigManager.INSTANCE.getDalConfig());
    }

    public DsxLogServices(DalConfig dalconfig)
    {
        dalConfig = dalconfig;
    }

    private AmazonServices getBucket(com.weather.dal2.config.DalConfig.AwsConfig awsconfig)
    {
        return AmazonServices.newS3Bucket(awsconfig);
    }

    private AmazonServices getQueue(com.weather.dal2.config.DalConfig.AwsConfig awsconfig)
    {
        return AmazonServices.newQueue(awsconfig);
    }

    public AmazonServices getAmazonService(String s)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 48
    //                   -1449884825: 110
    //                   -1152371458: 82
    //                   -383633873: 124
    //                   -98774381: 96;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_124;
_L6:
        switch (byte0)
        {
        default:
            return null;

        case 0: // '\0'
            return getQueue(dalConfig.getAwsLocationUpdateConfig());

        case 1: // '\001'
            return getBucket(dalConfig.getAwsWarningsConfig());

        case 2: // '\002'
            return getBucket(dalConfig.getAwsErrorsConfig());

        case 3: // '\003'
            return getBucket(dalConfig.getAwsTimesStampConfig());
        }
_L3:
        if (s.equals("LocationUpdate"))
        {
            byte0 = 0;
        }
          goto _L6
_L5:
        if (s.equals("AndroidWarningLogV2"))
        {
            byte0 = 1;
        }
          goto _L6
_L2:
        if (s.equals("AndroidErrorLogV2"))
        {
            byte0 = 2;
        }
          goto _L6
        if (s.equals("AndroidGeocodeRequestsV2"))
        {
            byte0 = 3;
        }
          goto _L6
    }
}
