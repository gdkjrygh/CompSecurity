// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api.b.a;

import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.IBinder;
import android.os.IInterface;
import android.view.Surface;

public interface ba
    extends IInterface
{

    public abstract int a(IBinder ibinder, IBinder ibinder1, android.view.WindowManager.LayoutParams layoutparams, int i, int j, int k, boolean flag, 
            Rect rect, Rect rect1, Rect rect2, Configuration configuration, Surface surface);

    public abstract void a();

    public abstract void a(int i, int j, int k);

    public abstract void a(Surface surface);
}
