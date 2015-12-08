// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.viewcrawler:
//            EditorConnection

public static interface 
{

    public abstract void bindEvents(JSONObject jsonobject);

    public abstract void cleanup();

    public abstract void clearEdits(JSONObject jsonobject);

    public abstract void performEdit(JSONObject jsonobject);

    public abstract void sendDeviceInfo();

    public abstract void sendSnapshot(JSONObject jsonobject);

    public abstract void setTweaks(JSONObject jsonobject);
}
