// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import com.google.android.apps.youtube.datalib.innertube.model.PlayerResponse;
import com.google.android.apps.youtube.datalib.legacy.model.VastAd;
import com.google.android.apps.youtube.datalib.legacy.model.VmapAdBreak;
import java.util.List;
import java.util.Map;

public interface AdsClient
{

    public abstract VastAd a(VmapAdBreak vmapadbreak, String s, Map map);

    public abstract List a(PlayerResponse playerresponse, String s);

    public abstract void a(int i);

    public abstract void a(VastAd vastad);

    public abstract List b(PlayerResponse playerresponse, String s);
}
