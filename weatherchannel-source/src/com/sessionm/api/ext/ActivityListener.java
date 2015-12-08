// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.api.ext;

import com.sessionm.api.SessionM;

public interface ActivityListener
    extends com.sessionm.api.ActivityListener
{

    public abstract void onPrepared(SessionM sessionm);
}
