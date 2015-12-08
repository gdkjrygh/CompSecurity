// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.ytremote.backend.logic;

import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.ScreenId;
import java.util.List;

public interface a
{

    public abstract CloudScreen a(String s, String s1, ScreenId screenid);

    public abstract CloudScreen a(String s, String s1, ScreenId screenid, String s2);

    public abstract List a(String s, String s1);

    public abstract void a(String s, String s1, CloudScreen cloudscreen);
}
