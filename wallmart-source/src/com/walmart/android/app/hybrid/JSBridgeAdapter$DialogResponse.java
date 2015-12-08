// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.hybrid:
//            JSBridgeAdapter

public static class selectedItem
{

    public static final String ACTION_CANCEL = "cancel";
    public static final String ACTION_NEUTRAL = "neutral";
    public static final String ACTION_OK = "ok";
    public String action;
    public int selectedItem;
    public ArrayList selectedItems;

    public (String s)
    {
        action = s;
        selectedItem = -1;
    }

    public selectedItem(String s, int i)
    {
        action = s;
        selectedItem = i;
    }
}
