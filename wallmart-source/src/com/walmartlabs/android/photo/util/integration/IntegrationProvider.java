// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util.integration;

import android.content.Context;

// Referenced classes of package com.walmartlabs.android.photo.util.integration:
//            AppIntegration

public interface IntegrationProvider
{

    public abstract AppIntegration getIntegration(Context context);
}
