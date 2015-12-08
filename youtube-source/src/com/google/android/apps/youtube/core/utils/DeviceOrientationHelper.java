// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import com.google.android.apps.youtube.common.fromguava.c;

// Referenced classes of package com.google.android.apps.youtube.core.utils:
//            j

public final class DeviceOrientationHelper extends OrientationEventListener
    implements android.os.Handler.Callback
{

    private final j a;
    private final Handler b;
    private final boolean c;
    private DeviceOrientation d;
    private int e;
    private boolean f;

    public DeviceOrientationHelper(Activity activity, j j1)
    {
        this(((Context) (activity)), activity.getWindowManager(), j1);
    }

    public DeviceOrientationHelper(Context context, WindowManager windowmanager, j j1)
    {
        boolean flag = true;
        super(context, 3);
        a = (j)com.google.android.apps.youtube.common.fromguava.c.a(j1, "listener cannot be null");
        int i = windowmanager.getDefaultDisplay().getRotation();
        int k = context.getResources().getConfiguration().orientation;
        if (i == 0 || i == 2)
        {
            if (k == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            c = flag;
        } else
        {
            if (k != 1)
            {
                flag = false;
            }
            c = flag;
        }
        b = new Handler(context.getMainLooper(), this);
    }

    public final boolean a()
    {
        return f;
    }

    public final void disable()
    {
        f = false;
        b.removeCallbacksAndMessages(null);
        super.disable();
    }

    public final void enable()
    {
        d = DeviceOrientation.UNKNOWN;
        e = -1;
        f = true;
        super.enable();
    }

    public final boolean handleMessage(Message message)
    {
        boolean flag;
        if (message.what == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (e == -1)
        {
            a.b(flag);
        } else
        {
            a.c(flag);
        }
        e = message.what;
        return true;
    }

    public final void onOrientationChanged(int i)
    {
        boolean flag = true;
        DeviceOrientation deviceorientation;
        if (i >= 0 && i <= 30 || i >= 330 && i < 360)
        {
            deviceorientation = DeviceOrientation.UPRIGHT;
        } else
        if (i >= 60 && i <= 120)
        {
            deviceorientation = DeviceOrientation.LEFTONTOP;
        } else
        if (i >= 150 && i <= 210)
        {
            deviceorientation = DeviceOrientation.BOTTOMUP;
        } else
        if (i >= 240 && i <= 300)
        {
            deviceorientation = DeviceOrientation.RIGHTONTOP;
        } else
        {
            deviceorientation = DeviceOrientation.UNKNOWN;
        }
        if (deviceorientation == d) goto _L2; else goto _L1
_L1:
        b.removeCallbacksAndMessages(null);
        if (deviceorientation == DeviceOrientation.UNKNOWN) goto _L2; else goto _L3
_L3:
        if (deviceorientation == DeviceOrientation.UPRIGHT || deviceorientation == DeviceOrientation.BOTTOMUP)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!c)
        {
            if (i == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
        }
        if (i != 0)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        if (e != -1) goto _L5; else goto _L4
_L4:
        b.sendEmptyMessage(i);
_L2:
        d = deviceorientation;
        return;
_L5:
        if (e != i)
        {
            b.sendEmptyMessageDelayed(i, 200L);
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    private class DeviceOrientation extends Enum
    {

        private static final DeviceOrientation $VALUES[];
        public static final DeviceOrientation BOTTOMUP;
        public static final DeviceOrientation LEFTONTOP;
        public static final DeviceOrientation RIGHTONTOP;
        public static final DeviceOrientation UNKNOWN;
        public static final DeviceOrientation UPRIGHT;

        public static DeviceOrientation valueOf(String s)
        {
            return (DeviceOrientation)Enum.valueOf(com/google/android/apps/youtube/core/utils/DeviceOrientationHelper$DeviceOrientation, s);
        }

        public static DeviceOrientation[] values()
        {
            return (DeviceOrientation[])$VALUES.clone();
        }

        static 
        {
            UNKNOWN = new DeviceOrientation("UNKNOWN", 0);
            UPRIGHT = new DeviceOrientation("UPRIGHT", 1);
            LEFTONTOP = new DeviceOrientation("LEFTONTOP", 2);
            BOTTOMUP = new DeviceOrientation("BOTTOMUP", 3);
            RIGHTONTOP = new DeviceOrientation("RIGHTONTOP", 4);
            $VALUES = (new DeviceOrientation[] {
                UNKNOWN, UPRIGHT, LEFTONTOP, BOTTOMUP, RIGHTONTOP
            });
        }

        private DeviceOrientation(String s, int i)
        {
            super(s, i);
        }
    }

}
