// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.nextpanel;

import android.content.Context;
import com.go.gl.view.GLRelativeLayout;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.gtp.nextlauncher.widget.nextpanel:
//            k, l

public abstract class Wall extends GLRelativeLayout
{

    protected ExecutorService mScheduledExecutorService;
    protected l mWallHoder;

    public Wall(Context context)
    {
        super(context);
        mScheduledExecutorService = Executors.newFixedThreadPool(3, new k(this));
    }

    public abstract void clearDrawable();

    public abstract void forceAnimationStop();

    public abstract void initDrawable();

    public void setWallHodler(l l)
    {
        mWallHoder = l;
    }

    public abstract boolean startForeAnimation(boolean flag);

    public abstract void startWeatherAnimaiton();
}
