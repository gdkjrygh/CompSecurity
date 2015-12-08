// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmui.animation;

import android.widget.Adapter;

public interface DismissibleAdapter
    extends Adapter
{

    public abstract void dismiss(int i);

    public abstract boolean isDismissible(int i);
}
