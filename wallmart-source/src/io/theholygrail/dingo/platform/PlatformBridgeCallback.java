// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.theholygrail.dingo.platform;

import android.app.Dialog;

public interface PlatformBridgeCallback
{

    public abstract void onDialogDismissed(Dialog dialog);

    public abstract void showDialog(Dialog dialog);
}
