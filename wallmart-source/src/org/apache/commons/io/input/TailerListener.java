// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io.input;


// Referenced classes of package org.apache.commons.io.input:
//            Tailer

public interface TailerListener
{

    public abstract void fileNotFound();

    public abstract void fileRotated();

    public abstract void handle(Exception exception);

    public abstract void handle(String s);

    public abstract void init(Tailer tailer);
}
