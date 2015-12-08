// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wsi.android.framework.ui.utils;

import com.wsi.android.framework.settings.ConfigurationManager;

// Referenced classes of package com.wsi.android.framework.ui.utils:
//            Navigator

public interface ComponentsProvider
{

    public abstract ConfigurationManager getConfigManager();

    public abstract Navigator getNavigator();
}
