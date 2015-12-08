// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.jcd.compiler;

import com.vladium.jcd.lib.UDataOutputStream;
import java.io.IOException;

public interface IClassFormatOutput
{

    public abstract void writeInClassFormat(UDataOutputStream udataoutputstream)
        throws IOException;
}
