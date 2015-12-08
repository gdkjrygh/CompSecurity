// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.android.sdk.richnotification.actions;

import android.net.Uri;
import com.samsung.android.sdk.richnotification.SrnAction;

public class SrnRemoteBuiltInAction extends SrnAction
{
    public static final class OperationType extends Enum
    {

        public static final OperationType CALL;
        private static final OperationType ENUM$VALUES[];
        public static final OperationType SMS;

        public static OperationType valueOf(String s)
        {
            return (OperationType)Enum.valueOf(com/samsung/android/sdk/richnotification/actions/SrnRemoteBuiltInAction$OperationType, s);
        }

        public static OperationType[] values()
        {
            OperationType aoperationtype[] = ENUM$VALUES;
            int i = aoperationtype.length;
            OperationType aoperationtype1[] = new OperationType[i];
            System.arraycopy(aoperationtype, 0, aoperationtype1, 0, i);
            return aoperationtype1;
        }

        static 
        {
            CALL = new OperationType("CALL", 0);
            SMS = new OperationType("SMS", 1);
            ENUM$VALUES = (new OperationType[] {
                CALL, SMS
            });
        }

        private OperationType(String s, int i)
        {
            super(s, i);
        }
    }


    private OperationType mOperation;
    private Uri mUri;

    private SrnRemoteBuiltInAction(SrnRemoteBuiltInAction srnremotebuiltinaction)
    {
        super(srnremotebuiltinaction);
        mOperation = OperationType.CALL;
        mOperation = srnremotebuiltinaction.mOperation;
        mUri = srnremotebuiltinaction.mUri;
    }

    public SrnRemoteBuiltInAction(String s)
    {
        this(s, OperationType.CALL);
    }

    public SrnRemoteBuiltInAction(String s, OperationType operationtype)
    {
        super(com.samsung.android.sdk.richnotification.SrnAction.ActionType.REMOTE_BUILT_IN, s);
        mOperation = OperationType.CALL;
        if (operationtype == null)
        {
            throw new NullPointerException("opType is null,");
        } else
        {
            mOperation = operationtype;
            return;
        }
    }

    protected SrnAction cloneSelf()
    {
        return new SrnRemoteBuiltInAction(this);
    }

    public void setData(Uri uri)
    {
        mUri = uri;
    }

    public void setType(OperationType operationtype)
    {
        if (operationtype == null)
        {
            throw new NullPointerException("opType is null,");
        } else
        {
            mOperation = operationtype;
            return;
        }
    }
}
