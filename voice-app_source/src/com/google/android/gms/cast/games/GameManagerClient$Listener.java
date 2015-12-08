// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.games;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast.games:
//            GameManagerClient, GameManagerState

public static interface 
{

    public abstract void onGameMessageReceived(String s, JSONObject jsonobject);

    public abstract void onStateChanged(GameManagerState gamemanagerstate, GameManagerState gamemanagerstate1);
}
