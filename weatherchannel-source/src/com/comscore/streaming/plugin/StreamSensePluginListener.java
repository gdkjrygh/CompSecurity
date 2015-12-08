// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming.plugin;

import com.comscore.streaming.StreamSenseEventType;
import com.comscore.streaming.StreamSenseState;
import java.util.HashMap;

public interface StreamSensePluginListener
{

    public abstract void onGetLabels(StreamSenseEventType streamsenseeventtype, HashMap hashmap);

    public abstract void onPostStateChange(StreamSenseState streamsensestate);

    public abstract void onPreStateChange(StreamSenseState streamsensestate);
}
