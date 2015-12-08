// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.android.adm;

import android.content.Context;
import com.amazon.device.messaging.ADM;

class ADMProvider
{

    private Object mADM;
    private final Context mContext;

    public ADMProvider(Context context)
    {
        mContext = context;
    }

    public Object get()
    {
        if (mADM == null)
        {
            mADM = new ADM(mContext);
        }
        return mADM;
    }
}
