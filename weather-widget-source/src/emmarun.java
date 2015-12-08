// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.vladium.emma.Command;
import com.vladium.emma.EMMARuntimeException;

public final class emmarun
{

    public emmarun()
    {
    }

    public static void main(String args[])
        throws EMMARuntimeException
    {
        Command.create("run", emmarun.getName(), args).run();
    }
}
