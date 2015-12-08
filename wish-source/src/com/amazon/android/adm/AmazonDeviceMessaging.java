// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.android.adm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.amazon.compatibility.enforcer.CompatibilityChecker;
import com.amazon.compatibility.enforcer.CompatibilityStatus;
import com.amazon.device.messaging.ADM;
import com.amazon.device.messaging.ADMRegistrationException;
import com.amazon.device.messaging.ApiFlavor;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.amazon.android.adm:
//            ADMProvider, BuildConfig

public class AmazonDeviceMessaging
{

    public static final String ERROR_INVALID_PARAMETERS = "INVALID_PARAMETERS";
    public static final String ERROR_INVALID_SENDER = "INVALID_SENDER";
    public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
    public static final String ERROR_NOT_SUPPORTED = "NOT_SUPPORTED";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    private static final String EXTRA_SPECIAL_MESSAGE = "message_type";
    public static final String MESSAGE_TYPE_DELETED = "deleted_messages";
    public static final String MESSAGE_TYPE_MESSAGE = "normal_message";
    public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";
    private static final String TAG = com/amazon/android/adm/AmazonDeviceMessaging.getSimpleName();
    private static ClassLoader sClassLoader = com/amazon/android/adm/AmazonDeviceMessaging.getClassLoader();
    private static AmazonDeviceMessaging sInstance = null;
    private final ADMProvider mADMProvider;
    private final boolean mSupported;

    protected AmazonDeviceMessaging()
    {
        mSupported = true;
        mADMProvider = new ADMProvider(null);
    }

    private AmazonDeviceMessaging(Context context)
    {
        mSupported = isSupported(context);
        mADMProvider = new ADMProvider(context);
    }

    private boolean areAdmClassesOnClasspath()
    {
        try
        {
            sClassLoader.loadClass("com.amazon.device.messaging.ADM");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            Log.e(TAG, "Required ADM classes not loaded");
            return false;
        }
        return true;
    }

    private boolean areCompatibilityCheckerClassesLoaded()
    {
        try
        {
            sClassLoader.loadClass("com.amazon.compatibility.enforcer.CompatibilityChecker");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            Log.e(TAG, "Required CompatibilityChecker classes not loaded");
            return false;
        }
        return true;
    }

    private boolean areRequiredPackagesInstalled(Context context)
    {
        while (!areCompatibilityCheckerClassesLoaded() || (new CompatibilityChecker(context)).check() != CompatibilityStatus.Compatible) 
        {
            return false;
        }
        return true;
    }

    private static Bundle getApplicationMetaData(Context context)
    {
        try
        {
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException(context);
        }
        return context;
    }

    public static AmazonDeviceMessaging getInstance(Context context)
    {
        com/amazon/android/adm/AmazonDeviceMessaging;
        JVM INSTR monitorenter ;
        if (sInstance == null)
        {
            verifyAdmClientVersionDefinedCorrectly(context);
            verifyRequiredPackageVersionMetadataDefinedCorrectly(context);
            sInstance = new AmazonDeviceMessaging(context);
        }
        context = sInstance;
        com/amazon/android/adm/AmazonDeviceMessaging;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    private boolean isSupported(Context context)
    {
        return areRequiredPackagesInstalled(context) && areAdmClassesOnClasspath();
    }

    private IOException sanitizeRegistrationException(IOException ioexception)
    {
        if (!(ioexception instanceof ADMRegistrationException))
        {
            return ioexception;
        }
        static class _cls1
        {

            static final int $SwitchMap$com$amazon$device$messaging$ADMRegistrationException$ErrorCode[];

            static 
            {
                $SwitchMap$com$amazon$device$messaging$ADMRegistrationException$ErrorCode = new int[com.amazon.device.messaging.ADMRegistrationException.ErrorCode.values().length];
                try
                {
                    $SwitchMap$com$amazon$device$messaging$ADMRegistrationException$ErrorCode[com.amazon.device.messaging.ADMRegistrationException.ErrorCode.MainThread.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$amazon$device$messaging$ADMRegistrationException$ErrorCode[com.amazon.device.messaging.ADMRegistrationException.ErrorCode.ServiceNotAvailable.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$amazon$device$messaging$ADMRegistrationException$ErrorCode[com.amazon.device.messaging.ADMRegistrationException.ErrorCode.InvalidParameters.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$amazon$device$messaging$ADMRegistrationException$ErrorCode[com.amazon.device.messaging.ADMRegistrationException.ErrorCode.InvalidSender.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.amazon.device.messaging.ADMRegistrationException.ErrorCode[((ADMRegistrationException)ioexception).getErrorCode().ordinal()])
        {
        default:
            return ioexception;

        case 1: // '\001'
            return new IOException("MAIN_THREAD", ioexception);

        case 2: // '\002'
            return new IOException("SERVICE_NOT_AVAILABLE", ioexception);

        case 3: // '\003'
            return new IOException("INVALID_PARAMETERS", ioexception);

        case 4: // '\004'
            return new IOException("INVALID_SENDER", ioexception);
        }
    }

    private void throwIfAdmNotSupported()
        throws IOException
    {
        if (!isSupported())
        {
            throw new IOException("NOT_SUPPORTED");
        } else
        {
            return;
        }
    }

    private static void verifyAdmClientVersionDefinedCorrectly(Context context)
    {
        verifyResourceMetaDataDefinedCorrectly(context, "amazon.device.messaging.client.version", "amazon_device_messaging_client_version", 177);
    }

    private static void verifyIntegerMetaDataDefinedCorrectly(Context context, String s, int i)
    {
        context = getApplicationMetaData(context);
        if (context == null || !context.containsKey(s))
        {
            throw new IllegalStateException(String.format("A required meta-data tag in your AndroidManifest.xml is missing.%nThe following should have been defined within your <application> element:%n<meta-data android:name=\"%s\" android:value=\"%d\" />%n%nDo you have manifest merging enabled?", new Object[] {
                s, Integer.valueOf(i)
            }));
        }
        int j = context.getInt(s);
        if (j != i)
        {
            throw new IllegalStateException(String.format("A meta-data tag in your AndroidManifest.xml has an incorrect value.%nExpected %d but found %d.%nThe following should have been defined within your <application> element:%n<meta-data android:name=\"%s\" android:value=\"%d\" />%n%nDo you have manifest merging enabled?", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), s, Integer.valueOf(i)
            }));
        } else
        {
            return;
        }
    }

    private static void verifyRequiredPackageVersionMetadataDefinedCorrectly(Context context)
    {
        java.util.Map.Entry entry;
        for (Iterator iterator = BuildConfig.REQUIRED_PACKAGE_VERSIONS.entrySet().iterator(); iterator.hasNext(); verifyIntegerMetaDataDefinedCorrectly(context, (new StringBuilder()).append("required_amazon_package:").append((String)entry.getKey()).toString(), ((Integer)entry.getValue()).intValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

    }

    private static void verifyResourceMetaDataDefinedCorrectly(Context context, String s, String s1, int i)
    {
        context = getApplicationMetaData(context);
        if (context == null || !context.containsKey(s))
        {
            throw new IllegalStateException(String.format("A required meta-data tag in your AndroidManifest.xml is missing.%nThe following should have been defined within your <application> element:%n<meta-data android:name=\"%s\" android:value=\"@integer/%s\" />%n%nDo you have manifest merging enabled?", new Object[] {
                s, s1
            }));
        }
        int j = context.getInt(s);
        if (j != i)
        {
            throw new IllegalStateException(String.format("A meta-data tag in your AndroidManifest.xml has an incorrect value.%nExpected %d but found %d.%nThe following should have been defined within your <application> element:%n<meta-data android:name=\"%s\" android:value=\"@integer/%s\" />%n%nDo you have manifest merging enabled?", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), s, s1
            }));
        } else
        {
            return;
        }
    }

    public void close()
    {
    }

    public String getMessageType(Intent intent)
    {
        if (!"com.amazon.device.messaging.intent.RECEIVE".equals(intent.getAction()))
        {
            return null;
        }
        if (!intent.hasExtra("message_type"))
        {
            return "normal_message";
        } else
        {
            return intent.getStringExtra("message_type");
        }
    }

    public String getRegistrationId()
    {
        if (!isSupported())
        {
            Log.e(TAG, "ADM is not supported; returning null, so that the call to register throw");
            return null;
        } else
        {
            return ((ADM)mADMProvider.get()).getRegistrationId(ApiFlavor.ADM);
        }
    }

    public boolean isSupported()
    {
        return mSupported;
    }

    public transient String register(String as[])
        throws IOException
    {
        throwIfAdmNotSupported();
        try
        {
            as = ((ADM)mADMProvider.get()).register(ApiFlavor.ADM, as);
        }
        // Misplaced declaration of an exception variable
        catch (String as[])
        {
            throw sanitizeRegistrationException(as);
        }
        return as;
    }

    public void unregister()
        throws IOException
    {
        throwIfAdmNotSupported();
        try
        {
            ((ADM)mADMProvider.get()).unregister(ApiFlavor.ADM);
            return;
        }
        catch (IOException ioexception)
        {
            throw sanitizeRegistrationException(ioexception);
        }
    }

}
