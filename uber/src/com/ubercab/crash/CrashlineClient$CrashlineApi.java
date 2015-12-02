// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.crash;

import com.ubercab.crash.internal.model.Request;
import ica;
import retrofit.Callback;

interface 
{

    public abstract ica sendRequest(Request request);

    public abstract void sendRequest(Request request, Callback callback);
}
