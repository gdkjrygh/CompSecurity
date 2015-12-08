// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.ui;

import android.webkit.ValueCallback;

// Referenced classes of package com.sessionm.ui:
//            SessionMViewContainer

public static interface I
{

    public abstract void onClosePressed(SessionMViewContainer sessionmviewcontainer);

    public abstract void onFailure(SessionMViewContainer sessionmviewcontainer, int i, String s, String s1);

    public abstract void onValueCallback(SessionMViewContainer sessionmviewcontainer, ValueCallback valuecallback);

    public abstract void onViewLoadStarted(SessionMViewContainer sessionmviewcontainer, String s);

    public abstract void onViewLoaded(SessionMViewContainer sessionmviewcontainer, String s);
}
