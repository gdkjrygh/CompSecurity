// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;

public interface hzw
    extends Closeable
{

    public abstract void close();

    public abstract long read(hzf hzf, long l);

    public abstract hzx timeout();
}
