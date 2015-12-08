// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.ui;

import android.content.DialogInterface;
import com.squareup.otto.Bus;
import com.walmart.android.service.MessageBus;

// Referenced classes of package com.walmartlabs.android.pharmacy.ui:
//            DialogFactory

private static class mWrappedListener
    implements android.content.alogDismissListener
{

    private String mError;
    private android.content.alogDismissListener.mError mWrappedListener;

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (mWrappedListener != null)
        {
            mWrappedListener.(dialoginterface);
        }
        MessageBus.getBus().post((new com.walmartlabs.anivia.missListener.mWrappedListener("pageView")).mWrappedListener("name", mError));
    }

    public (String s, android.content.alogDismissListener alogdismisslistener)
    {
        mError = s;
        mWrappedListener = alogdismisslistener;
    }
}
