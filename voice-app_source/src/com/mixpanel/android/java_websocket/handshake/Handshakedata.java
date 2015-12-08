// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.java_websocket.handshake;

import java.util.Iterator;

public interface Handshakedata
{

    public abstract byte[] getContent();

    public abstract String getFieldValue(String s);

    public abstract boolean hasFieldValue(String s);

    public abstract Iterator iterateHttpFields();
}
