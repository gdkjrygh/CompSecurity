// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

final class nit> extends hzc
{

    final Socket a;

    protected final void timedOut()
    {
        try
        {
            a.close();
            return;
        }
        catch (Exception exception)
        {
            hzp.a().log(Level.WARNING, (new StringBuilder("Failed to close timed out socket ")).append(a).toString(), exception);
        }
    }

    (Socket socket)
    {
        a = socket;
        super();
    }
}
