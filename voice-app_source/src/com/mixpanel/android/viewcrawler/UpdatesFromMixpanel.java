// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import com.mixpanel.android.mpmetrics.Tweaks;
import org.json.JSONArray;

public interface UpdatesFromMixpanel
{

    public abstract Tweaks getTweaks();

    public abstract void setEventBindings(JSONArray jsonarray);

    public abstract void setVariants(JSONArray jsonarray);

    public abstract void startUpdates();
}
