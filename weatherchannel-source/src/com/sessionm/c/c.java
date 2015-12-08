// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sessionm.c;

import com.sessionm.net.Request;
import java.util.List;

public interface c
{

    public abstract long bF();

    public abstract void close();

    public abstract long getSize();

    public abstract boolean l(Request request);

    public abstract boolean m(Request request);

    public abstract List r(int i);

    public abstract boolean removeAll();

    public abstract void s(int i);
}
