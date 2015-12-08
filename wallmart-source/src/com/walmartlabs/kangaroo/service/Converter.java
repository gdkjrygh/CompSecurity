// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;

import java.io.IOException;
import okio.BufferedSource;

public interface Converter
{

    public abstract Object from(BufferedSource bufferedsource, Class class1)
        throws IOException;

    public abstract String getContentType();

    public abstract String toString(Object obj)
        throws IOException;
}
