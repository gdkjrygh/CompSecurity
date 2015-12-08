// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.content.Context;
import java.lang.reflect.Field;

// Referenced classes of package com.urbanairship:
//            Options, LocationOptions, Logger, PropertyName

public class AirshipConfigOptions extends Options
{
    public static final class TransportType extends Enum
    {

        private static final TransportType $VALUES[];
        public static final TransportType GCM;
        public static final TransportType HELIUM;
        public static final TransportType HYBRID;

        public static TransportType valueOf(String s)
        {
            return (TransportType)Enum.valueOf(com/urbanairship/AirshipConfigOptions$TransportType, s);
        }

        public static TransportType[] values()
        {
            return (TransportType[])$VALUES.clone();
        }

        static 
        {
            HELIUM = new TransportType("HELIUM", 0);
            GCM = new TransportType("GCM", 1);
            HYBRID = new TransportType("HYBRID", 2);
            $VALUES = (new TransportType[] {
                HELIUM, GCM, HYBRID
            });
        }

        private TransportType(String s, int i)
        {
            super(s, i);
        }
    }


    public boolean analyticsEnabled;
    public String analyticsServer;
    public String developmentAppKey;
    public String developmentAppSecret;
    public int developmentLogLevel;
    public String gcmSender;
    public String hostURL;
    public boolean inProduction;
    public String landingPageContentURL;
    public LocationOptions locationOptions;
    public int minSdkVersion;
    public String productionAppKey;
    public String productionAppSecret;
    public int productionLogLevel;
    public boolean pushServiceEnabled;
    public boolean richPushEnabled;
    public String transport;

    public AirshipConfigOptions()
    {
        hostURL = "https://device-api.urbanairship.com/";
        analyticsServer = "https://combine.urbanairship.com/";
        landingPageContentURL = "https://dl.urbanairship.com/aaa/";
        inProduction = false;
        pushServiceEnabled = true;
        richPushEnabled = false;
        analyticsEnabled = true;
        locationOptions = new LocationOptions();
        developmentLogLevel = 3;
        productionLogLevel = 6;
        minSdkVersion = 4;
    }

    private boolean isLogLevelValid(int i)
    {
        switch (i)
        {
        default:
            return false;

        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            return true;
        }
    }

    public static AirshipConfigOptions loadDefaultOptions(Context context)
    {
        AirshipConfigOptions airshipconfigoptions = new AirshipConfigOptions();
        airshipconfigoptions.loadFromProperties(context);
        airshipconfigoptions.locationOptions.loadFromProperties(context);
        return airshipconfigoptions;
    }

    public String getAppKey()
    {
        if (inProduction)
        {
            return productionAppKey;
        } else
        {
            return developmentAppKey;
        }
    }

    public String getAppSecret()
    {
        if (inProduction)
        {
            return productionAppSecret;
        } else
        {
            return developmentAppSecret;
        }
    }

    public String getDefaultPropertiesFilename()
    {
        return "airshipconfig.properties";
    }

    public int getLoggerLevel()
    {
        if (inProduction)
        {
            return productionLogLevel;
        } else
        {
            return developmentLogLevel;
        }
    }

    public TransportType getTransport()
    {
        if (TransportType.GCM.toString().equalsIgnoreCase(transport))
        {
            return TransportType.GCM;
        }
        if (TransportType.HELIUM.toString().equalsIgnoreCase(transport))
        {
            return TransportType.HELIUM;
        }
        if (TransportType.HYBRID.toString().equalsIgnoreCase(transport))
        {
            return TransportType.HYBRID;
        } else
        {
            return TransportType.GCM;
        }
    }

    public boolean isValid()
    {
        Object obj;
        AirshipConfigOptions airshipconfigoptions;
        boolean flag;
        flag = true;
        airshipconfigoptions = new AirshipConfigOptions();
        boolean flag1;
        if (inProduction)
        {
            obj = "production";
        } else
        {
            obj = "development";
        }
        if (getAppKey() == null || getAppKey().length() == 0 || getAppKey().indexOf(' ') > 0)
        {
            Logger.error((new StringBuilder()).append("AirshipConfigOptions: ").append(getAppKey()).append(" is not a valid ").append(((String) (obj))).append(" app key").toString());
            flag = false;
        }
        if (getAppSecret() == null || getAppSecret().length() == 0 || getAppSecret().indexOf(' ') > 0)
        {
            Logger.error((new StringBuilder()).append("AirshipConfigOptions: ").append(getAppSecret()).append(" is not a valid ").append(((String) (obj))).append(" app secret").toString());
            flag = false;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        obj = getClass().getFields();
        if (obj.length >= 0)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        obj = obj[0];
        flag1 = ((Field) (obj)).isAnnotationPresent(com/urbanairship/PropertyName);
        if (!flag1)
        {
            try
            {
                Logger.error((new StringBuilder()).append("The public field '").append(((Field) (obj)).getName()).append("' is missing an annotation").toString());
                Logger.error("AirshipConfigOptions appears to be obfuscated. If using Proguard, add the following to your proguard.cfg:");
                Logger.error("\t-keepattributes *Annotation*");
            }
            catch (SecurityException securityexception) { }
        }
        if (inProduction)
        {
            if (!isLogLevelValid(productionLogLevel))
            {
                Logger.error((new StringBuilder()).append(productionLogLevel).append(" is not a valid log level. Falling back to ").append(airshipconfigoptions.productionLogLevel).append(" ERROR.").toString());
                productionLogLevel = airshipconfigoptions.productionLogLevel;
            }
        } else
        if (!isLogLevelValid(developmentLogLevel))
        {
            Logger.error((new StringBuilder()).append(developmentLogLevel).append(" is not a valid log level. Falling back to ").append(airshipconfigoptions.developmentLogLevel).append(" DEBUG.").toString());
            developmentLogLevel = airshipconfigoptions.developmentLogLevel;
            return flag;
        }
        return flag;
    }
}
