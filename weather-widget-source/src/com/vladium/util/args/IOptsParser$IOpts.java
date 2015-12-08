// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vladium.util.args;

import java.io.PrintWriter;

// Referenced classes of package com.vladium.util.args:
//            IOptsParser

public static interface 
{

    public abstract void error(PrintWriter printwriter, int i);

    public abstract String[] getFreeArgs();

    public abstract [] getOpts();

    public abstract [] getOpts(String s);

    public abstract boolean hasArg(String s);

    public abstract int usageRequestLevel();
}
