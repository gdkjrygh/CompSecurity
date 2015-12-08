// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.conn;

import java.io.IOException;

public interface ConnectionReleaseTrigger
{

    public abstract void abortConnection()
        throws IOException;

    public abstract void releaseConnection()
        throws IOException;
}
