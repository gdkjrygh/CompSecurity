// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.network.uspout;

import com.ubercab.network.uspout.internal.model.Request;
import retrofit.Callback;

interface 
{

    public abstract void sendRequest(Request request, Callback callback);
}
