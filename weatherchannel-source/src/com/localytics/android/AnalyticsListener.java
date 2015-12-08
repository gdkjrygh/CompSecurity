// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import java.util.Map;

public interface AnalyticsListener
    extends BaseHandler.BaseListener
{

    public abstract void localyticsDidTagEvent(String s, Map map, long l);

    public abstract void localyticsSessionDidOpen(boolean flag, boolean flag1, boolean flag2);

    public abstract void localyticsSessionWillClose();

    public abstract void localyticsSessionWillOpen(boolean flag, boolean flag1, boolean flag2);
}
