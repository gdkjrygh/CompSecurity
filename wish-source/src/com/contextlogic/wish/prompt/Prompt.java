// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.prompt;

import com.contextlogic.wish.ui.activity.root.RootActivity;

public interface Prompt
{

    public abstract boolean canShowPrompt(long l);

    public abstract void initialize(long l);

    public abstract void onLoggedInAppForeground(long l);

    public abstract void showPrompt(RootActivity rootactivity, long l);
}
