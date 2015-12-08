// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.ui;


// Referenced classes of package com.walmart.android.ui:
//            PresenterStack, Presenter

public static interface 
{

    public abstract boolean onInterceptPresenterPush(Presenter presenter, boolean flag, boolean flag1);

    public abstract void onPresenterPopped(Presenter presenter);

    public abstract void onPresenterPushed(Presenter presenter);

    public abstract void onPresenterTitleUpdated(Presenter presenter);
}
