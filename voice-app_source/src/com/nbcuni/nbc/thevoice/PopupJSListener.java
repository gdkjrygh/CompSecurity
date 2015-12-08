// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcuni.nbc.thevoice;

import java.util.List;

public interface PopupJSListener
{

    public abstract void closePopup();

    public abstract void facebookLogin(String s, List list);

    public abstract void facebookLogout(String s);

    public abstract void facebookPermissionRequest(String s, List list);

    public abstract void facebookShare(String s, String s1, String s2, String s3, String s4);

    public abstract void hideLoadingScreen();

    public abstract void passExpiresValue(String s);
}
