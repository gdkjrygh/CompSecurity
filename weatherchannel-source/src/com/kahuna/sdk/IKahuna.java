// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.content.Context;
import java.util.Map;

// Referenced classes of package com.kahuna.sdk:
//            PushNotConfiguredException, EmptyCredentialsException, IKahunaUserCredentials, KahunaInAppMessageListener

public interface IKahuna
{

    public abstract void checkPush(Context context)
        throws PushNotConfiguredException;

    public abstract IKahunaUserCredentials createUserCredentials();

    public abstract void disableKahunaGenerateNotifications();

    public abstract void disableKahunaPushLaunchApp();

    public abstract void disableLocationServices(int i);

    public abstract void disablePush();

    public abstract void enableKahunaGenerateNotifications();

    public abstract void enableKahunaPushLaunchApp();

    public abstract void enableLocationServices(int i);

    public abstract void enablePush();

    public abstract void forceDebugBuild();

    public abstract boolean getIsPushEnabled();

    public abstract String getKahunaDeviceId();

    public abstract String getPushToken();

    public abstract Map getUserAttributes();

    public abstract IKahunaUserCredentials getUserCredentials();

    public abstract void login(IKahunaUserCredentials ikahunausercredentials)
        throws EmptyCredentialsException;

    public abstract void logout();

    public abstract void onAppCreate(Context context, String s, String s1);

    public abstract void registerInAppMessageListener(KahunaInAppMessageListener kahunainappmessagelistener);

    public abstract void setDebugMode(boolean flag);

    public abstract void setIconResourceId(int i);

    public abstract void setPushReceiver(Class class1);

    public abstract void setUserAttributes(Map map);

    public abstract void start();

    public abstract void stop();

    public abstract void trackEvent(String s);

    public abstract void trackEvent(String s, int i, int j);

    public abstract void unregisterInAppMessageListener();
}
