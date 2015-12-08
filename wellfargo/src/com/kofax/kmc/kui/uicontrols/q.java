// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols;

import com.kofax.kmc.ken.engines.data.Image;
import com.kofax.kmc.kui.uicontrols.appstats.ImgCaptureAppStatsClient;
import com.kofax.kmc.kui.uicontrols.data.PageDetectMode;
import com.kofax.kmc.kut.utilities.appstats.AppStatsClient;
import com.kofax.kmc.kut.utilities.appstats.PropChangeAppStatsClient;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsEventIDType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsInstanceType;
import com.kofax.kmc.kut.utilities.appstats.type.AppStatsPropertyType;
import com.kofax.kmc.kut.utilities.error.ErrorInfo;
import com.kofax.kmc.kut.utilities.error.KmcRuntimeException;
import com.squareup.otto.Bus;

class q
{

    private final String a = AppStatsClient.genInstanceId();
    private Bus b;
    private boolean c;
    private ImgCaptureAppStatsClient d;
    private PropChangeAppStatsClient e;
    private int f;
    private int g;
    private boolean h;
    private PageDetectMode i;
    private int j;
    private boolean k;
    private boolean l;
    private boolean m;

    public q(Bus bus)
    {
        c = false;
        d = new ImgCaptureAppStatsClient(a, AppStatsInstanceType.INST_TYPE_IMAGE_CAPTURE, true);
        e = new PropChangeAppStatsClient(a, AppStatsInstanceType.INST_TYPE_IMAGE_CAPTURE, false);
        f = -1;
        g = -1;
        h = false;
        i = PageDetectMode.OFF;
        j = -1;
        k = false;
        l = false;
        if (bus == null)
        {
            throw new IllegalArgumentException("bus cannot be null");
        } else
        {
            b = bus;
            b.register(this);
            return;
        }
    }

    public void a(BusEvents.ContinuousModeChangedEvent continuousmodechangedevent)
    {
        String s;
        String s1;
        if (h)
        {
            s = "ON";
        } else
        {
            s = "OFF";
        }
        if (continuousmodechangedevent.mode)
        {
            s1 = "ON";
        } else
        {
            s1 = "OFF";
        }
        e.logAppStats(AppStatsEventIDType.APP_STATS_PROPERTY_CHANGE_EVENT, AppStatsPropertyType.PROP_CONTINUOUS_CAPTURE_MODE, s, s1);
        h = continuousmodechangedevent.mode;
        return;
        Exception exception;
        exception;
        h = continuousmodechangedevent.mode;
        throw exception;
    }

    public void a(BusEvents.DetachedFromWindowEvent detachedfromwindowevent)
    {
        d.logAppStatsInstanceDismiss();
        b.unregister(this);
        b = null;
    }

    public void a(BusEvents.FocusChangedEvent focuschangedevent)
    {
        boolean flag1;
        boolean flag = m;
        flag1 = focuschangedevent.focused;
        if (flag == flag1)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        focuschangedevent = d;
        int i1;
        if (flag1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        focuschangedevent.setEventValue(i1);
        d.logAppStats(AppStatsEventIDType.APP_STATS_IMG_CAPTURE_FOCUS);
        m = flag1;
        return;
        focuschangedevent;
        m = flag1;
        throw focuschangedevent;
    }

    public void a(BusEvents.ForceCaptureRequestedEvent forcecapturerequestedevent)
    {
        if (forcecapturerequestedevent.isCaptureExperience)
        {
            forcecapturerequestedevent = AppStatsEventIDType.APP_STATS_IMG_EXP_CAPTURE_EVENT;
        } else
        {
            forcecapturerequestedevent = AppStatsEventIDType.APP_STATS_IMG_FORCE_CAPTURE_EVENT;
        }
        d.setEventValue(1);
        d.logAppStats(forcecapturerequestedevent);
    }

    public void a(BusEvents.ImageCapturedBusEvent imagecapturedbusevent)
    {
        d.setEventValue(1);
        d.logAppStats(AppStatsEventIDType.APP_STATS_IMG_CAPTURE_EVENT, imagecapturedbusevent.image.getImageID());
    }

    public void a(BusEvents.LevelChangedEvent levelchangedevent)
    {
        boolean flag1;
        boolean flag = l;
        flag1 = levelchangedevent.level;
        if (flag == flag1)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        levelchangedevent = d;
        int i1;
        if (flag1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        levelchangedevent.setEventValue(i1);
        d.logAppStats(AppStatsEventIDType.APP_STATS_IMG_CAPTURE_LEVELNESS);
        l = flag1;
        return;
        levelchangedevent;
        l = flag1;
        throw levelchangedevent;
    }

    public void a(BusEvents.PageDetectModeChangedEvent pagedetectmodechangedevent)
    {
        PageDetectMode pagedetectmode;
        pagedetectmode = i;
        pagedetectmodechangedevent = pagedetectmodechangedevent.mode;
        e.logAppStats(AppStatsEventIDType.APP_STATS_PROPERTY_CHANGE_EVENT, AppStatsPropertyType.PROP_PAGE_DETECT_MODE, pagedetectmode.name(), pagedetectmodechangedevent.name());
        i = pagedetectmodechangedevent;
        return;
        Exception exception;
        exception;
        i = pagedetectmodechangedevent;
        throw exception;
    }

    public void a(BusEvents.PageDetectionBusEvent pagedetectionbusevent)
    {
        d.setEventValue(1);
        d.logAppStats(AppStatsEventIDType.APP_STATS_IMG_CAPTURE_PAGEDETECT);
    }

    public void a(BusEvents.PitchThresholdChangedEvent pitchthresholdchangedevent)
    {
        int i1;
        int j1;
        i1 = f;
        j1 = pitchthresholdchangedevent.threshold;
        e.logAppStats(AppStatsEventIDType.APP_STATS_PROPERTY_CHANGE_EVENT, AppStatsPropertyType.PROP_TYPE_LEVEL_PITCH_THRESHOLD, Integer.toString(i1), Integer.toString(j1));
        f = pitchthresholdchangedevent.threshold;
        return;
        Exception exception;
        exception;
        f = pitchthresholdchangedevent.threshold;
        throw exception;
    }

    public void a(BusEvents.RollThresholdChangedEvent rollthresholdchangedevent)
    {
        int i1;
        int j1;
        i1 = g;
        j1 = rollthresholdchangedevent.threshold;
        e.logAppStats(AppStatsEventIDType.APP_STATS_PROPERTY_CHANGE_EVENT, AppStatsPropertyType.PROP_TYPE_LEVEL_PITCH_THRESHOLD, Integer.toString(i1), Integer.toString(j1));
        g = j1;
        return;
        rollthresholdchangedevent;
        g = j1;
        throw rollthresholdchangedevent;
    }

    public void a(BusEvents.SessionCreateEvent sessioncreateevent)
    {
        if (c)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_SESSION_CREATE_ERROR);
        } else
        {
            d.appStatsSessionCreate();
            e.appStatsSessionCreate(d.getInstanceId());
            c = true;
            return;
        }
    }

    public void a(BusEvents.SessionDismissEvent sessiondismissevent)
    {
        if (!c)
        {
            throw new KmcRuntimeException(ErrorInfo.KMC_GN_SESSION_DISMISS_ERROR);
        } else
        {
            d.appStatsSessionDismiss();
            c = false;
            return;
        }
    }

    public void a(BusEvents.StabilityChangedEvent stabilitychangedevent)
    {
        boolean flag = stabilitychangedevent.stable;
        if (flag == k)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        stabilitychangedevent = d;
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        stabilitychangedevent.setEventValue(i1);
        d.logAppStats(AppStatsEventIDType.APP_STATS_IMG_CAPTURE_STABILITY);
        k = flag;
        return;
        stabilitychangedevent;
        k = flag;
        throw stabilitychangedevent;
    }

    public void a(BusEvents.StabilityDelayChangedEvent stabilitydelaychangedevent)
    {
        int i1;
        int j1;
        i1 = j;
        j1 = stabilitydelaychangedevent.delay;
        e.logAppStats(AppStatsEventIDType.APP_STATS_PROPERTY_CHANGE_EVENT, AppStatsPropertyType.PROP_TYPE_STABILITY_THRESHOLD, Integer.toString(i1), Integer.toString(j1));
        j = j1;
        return;
        stabilitydelaychangedevent;
        j = j1;
        throw stabilitydelaychangedevent;
    }
}
