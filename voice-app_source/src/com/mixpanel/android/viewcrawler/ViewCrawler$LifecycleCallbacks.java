// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.app.Activity;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import com.mixpanel.android.mpmetrics.MPConfig;
import java.util.Locale;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            ViewCrawler, FlipGesture, EditState

private class init>
    implements android.app.llbacks, er
{

    private final sendMessage mEmulatorConnector;
    private final FlipGesture mFlipGesture = new FlipGesture(this);
    final ViewCrawler this$0;

    private void installConnectionSensor(Activity activity)
    {
        if (isInEmulator() && !ViewCrawler.access$2(ViewCrawler.this).getDisableEmulatorBindingUI())
        {
            mEmulatorConnector.tart();
        } else
        if (!ViewCrawler.access$2(ViewCrawler.this).getDisableGestureBindingUI())
        {
            activity = (SensorManager)activity.getSystemService("sensor");
            android.hardware.Sensor sensor = activity.getDefaultSensor(1);
            activity.registerListener(mFlipGesture, sensor, 3);
            return;
        }
    }

    private boolean isInEmulator()
    {
        while (!Build.HARDWARE.equals("goldfish") || !Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic") || !Build.PRODUCT.contains("sdk") || !Build.MODEL.toLowerCase(Locale.US).contains("sdk")) 
        {
            return false;
        }
        return true;
    }

    private void uninstallConnectionSensor(Activity activity)
    {
        if (isInEmulator() && !ViewCrawler.access$2(ViewCrawler.this).getDisableEmulatorBindingUI())
        {
            mEmulatorConnector.top();
        } else
        if (!ViewCrawler.access$2(ViewCrawler.this).getDisableGestureBindingUI())
        {
            ((SensorManager)activity.getSystemService("sensor")).unregisterListener(mFlipGesture);
            return;
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public void onActivityDestroyed(Activity activity)
    {
    }

    public void onActivityPaused(Activity activity)
    {
        ViewCrawler.access$1(ViewCrawler.this).remove(activity);
        if (ViewCrawler.access$1(ViewCrawler.this).isEmpty())
        {
            uninstallConnectionSensor(activity);
        }
    }

    public void onActivityResumed(Activity activity)
    {
        installConnectionSensor(activity);
        ViewCrawler.access$1(ViewCrawler.this).add(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public void onActivityStarted(Activity activity)
    {
    }

    public void onActivityStopped(Activity activity)
    {
    }

    public void onFlipGesture()
    {
        android.os.Message message = ViewCrawler.access$0(ViewCrawler.this).obtainMessage(1);
        ViewCrawler.access$0(ViewCrawler.this).sendMessage(message);
    }

    public er()
    {
        this$0 = ViewCrawler.this;
        super();
        mEmulatorConnector = new init>(ViewCrawler.this);
    }
}
