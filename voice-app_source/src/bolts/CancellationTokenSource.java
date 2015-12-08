// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import java.util.Locale;

// Referenced classes of package bolts:
//            CancellationToken

public class CancellationTokenSource
{

    private final CancellationToken token = new CancellationToken();

    public CancellationTokenSource()
    {
    }

    public void cancel()
    {
        token.tryCancel();
    }

    public CancellationToken getToken()
    {
        return token;
    }

    public boolean isCancellationRequested()
    {
        return token.isCancellationRequested();
    }

    public String toString()
    {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[] {
            getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(isCancellationRequested())
        });
    }
}
