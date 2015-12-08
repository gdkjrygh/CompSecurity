// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge;

import com.walmart.android.ui.Presenter;

// Referenced classes of package com.walmart.android.app.bridge:
//            BridgeController, Page

public static interface 
{

    public static final int BRIDGE_ERROR = 1;

    public abstract boolean isVisible();

    public abstract void pageError(int i, String s, String s1);

    public abstract void pushPresenter(Presenter presenter);

    public abstract void updateHeader(Page page, boolean flag);

    public abstract void updateLoadingView(boolean flag);
}
