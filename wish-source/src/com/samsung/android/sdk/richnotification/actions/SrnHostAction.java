// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.actions;

import com.samsung.android.sdk.richnotification.SrnAction;
import com.samsung.android.sdk.richnotification.SrnImageAsset;

public class SrnHostAction extends SrnAction
{

    private SrnImageAsset mIcon;
    private String mToast;

    private SrnHostAction(SrnHostAction srnhostaction)
    {
        super(srnhostaction);
        mToast = srnhostaction.mToast;
        mIcon = srnhostaction.mIcon;
    }

    public SrnHostAction(String s)
    {
        super(com.samsung.android.sdk.richnotification.SrnAction.ActionType.HOST, s);
    }

    protected SrnAction cloneSelf()
    {
        return new SrnHostAction(this);
    }

    public void setIcon(SrnImageAsset srnimageasset)
    {
        mIcon = srnimageasset;
    }

    public void setToast(String s)
    {
        mToast = s;
    }
}
