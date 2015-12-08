// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;


// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            TemperatureCubeView

class ac
    implements Runnable
{

    final float a;
    final float b;
    final boolean c;
    final TemperatureCubeView d;

    ac(TemperatureCubeView temperaturecubeview, float f, float f1, boolean flag)
    {
        d = temperaturecubeview;
        a = f;
        b = f1;
        c = flag;
        super();
    }

    public void run()
    {
        d.startAnimating(a, b, c);
    }
}
