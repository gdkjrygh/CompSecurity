// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.actions;

import android.net.Uri;
import android.os.Bundle;
import com.samsung.android.sdk.richnotification.SrnAction;
import com.samsung.android.sdk.richnotification.SrnImageAsset;

public class SrnRemoteLaunchAction extends SrnAction
{

    private Bundle mExtras;
    private SrnImageAsset mIcon;
    private String mMimeType;
    private String mOperation;
    private String mPackageName;
    private Uri mUri;

    private SrnRemoteLaunchAction(SrnRemoteLaunchAction srnremotelaunchaction)
    {
        super(srnremotelaunchaction);
        mOperation = "OP_LAUNCH";
        mIcon = srnremotelaunchaction.mIcon;
        mOperation = srnremotelaunchaction.mOperation;
        mPackageName = srnremotelaunchaction.mPackageName;
        mUri = srnremotelaunchaction.mUri;
        mMimeType = srnremotelaunchaction.mMimeType;
        if (srnremotelaunchaction.mExtras != null)
        {
            mExtras = new Bundle(srnremotelaunchaction.mExtras);
        }
    }

    public SrnRemoteLaunchAction(String s)
    {
        this(s, null);
    }

    public SrnRemoteLaunchAction(String s, Uri uri)
    {
        super(com.samsung.android.sdk.richnotification.SrnAction.ActionType.REMOTE_LAUNCH, s);
        mOperation = "OP_LAUNCH";
        mUri = uri;
    }

    protected SrnAction cloneSelf()
    {
        return new SrnRemoteLaunchAction(this);
    }

    public void setData(Uri uri)
    {
        mUri = uri;
    }

    public void setExtras(Bundle bundle)
    {
        mExtras = bundle;
    }

    public void setIcon(SrnImageAsset srnimageasset)
    {
        mIcon = srnimageasset;
    }

    public void setMimeType(String s)
    {
        mMimeType = s;
    }

    public void setOperation(String s)
    {
        mOperation = s;
    }

    public void setPackage(String s)
    {
        mPackageName = s;
    }
}
