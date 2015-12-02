// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.ubercab.crash.model.Crash;
import java.util.Collection;

public final class dat extends gkx
{

    private final Crash a;

    public dat(hoi hoi, gld gld, glq glq, gmc gmc, Thread.UncaughtExceptionHandler uncaughtexceptionhandler, Application application, Collection collection, 
            Crash crash)
    {
        super(hoi, gld, glq, gmc, uncaughtexceptionhandler, collection, application);
        a = crash;
    }

    public final Crash a()
    {
        return a;
    }
}
