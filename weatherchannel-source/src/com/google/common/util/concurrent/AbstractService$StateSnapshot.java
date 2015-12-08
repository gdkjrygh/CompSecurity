// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.util.concurrent:
//            AbstractService

private static final class failure
{

    final Throwable failure;
    final boolean shutdownWhenStartupFinishes;
    final failure state;

    failure externalState()
    {
        if (shutdownWhenStartupFinishes && state == state)
        {
            return state;
        } else
        {
            return state;
        }
    }

    Throwable failureCause()
    {
        boolean flag;
        if (state == state)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "failureCause() is only valid if the service has failed, service is %s", new Object[] {
            state
        });
        return failure;
    }

    ( )
    {
        this(, false, null);
    }

    <init>(<init> <init>1, boolean flag, Throwable throwable)
    {
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (!flag || <init>1 == <init>)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        Preconditions.checkArgument(flag3, "shudownWhenStartupFinishes can only be set if state is STARTING. Got %s instead.", new Object[] {
            <init>1
        });
        if (throwable != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (<init>1 == <init>)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!(flag1 ^ flag2))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        Preconditions.checkArgument(flag3, "A failure cause should be set if and only if the state is failed.  Got %s and %s instead.", new Object[] {
            <init>1, throwable
        });
        state = <init>1;
        shutdownWhenStartupFinishes = flag;
        failure = throwable;
    }
}
