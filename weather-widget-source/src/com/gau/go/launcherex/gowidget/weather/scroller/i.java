// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.scroller;


// Referenced classes of package com.gau.go.launcherex.gowidget.weather.scroller:
//            h

public interface i
{

    public abstract h getScreenScroller();

    public abstract int getScrollX();

    public abstract int getScrollY();

    public abstract void onFlingIntercepted();

    public abstract void onFlingStart();

    public abstract void onScreenChanged(int j, int k);

    public abstract void onScrollChanged(int j, int k);

    public abstract void onScrollFinish(int j);

    public abstract void onScrollStart();

    public abstract void postInvalidate();

    public abstract void scrollBy(int j, int k);

    public abstract void setScreenScroller(h h);
}
