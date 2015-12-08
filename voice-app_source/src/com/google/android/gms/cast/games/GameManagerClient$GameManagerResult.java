// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.games;

import com.google.android.gms.common.api.Result;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast.games:
//            GameManagerClient

public static interface 
    extends Result
{

    public abstract JSONObject getExtraMessageData();

    public abstract String getPlayerId();

    public abstract long getRequestId();
}
