// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            DecideChecker

static class _cls0
{

    public JSONArray eventBindings;
    public final List notifications = new ArrayList();
    public final List surveys = new ArrayList();
    public JSONArray variants;

    public _cls9()
    {
        eventBindings = DecideChecker.access$0();
        variants = DecideChecker.access$0();
    }
}
