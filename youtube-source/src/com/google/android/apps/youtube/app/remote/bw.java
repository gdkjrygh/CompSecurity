// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.PairingCode;
import com.google.android.apps.ytremote.model.ScreenId;

public interface bw
{

    public abstract void a(b b1);

    public abstract void a(CloudScreen cloudscreen, b b1);

    public abstract void a(PairingCode pairingcode, b b1);

    public abstract void a(ScreenId screenid, b b1);

    public abstract void a(ScreenId screenid, String s, b b1);

    public abstract void a(String s, PairingCode pairingcode, b b1);

    public abstract void b(b b1);

    public abstract void c(b b1);
}
