// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ch.boye.httpclientandroidlib.impl.client;


// Referenced classes of package ch.boye.httpclientandroidlib.impl.client:
//            DefaultRedirectStrategy

public class LaxRedirectStrategy extends DefaultRedirectStrategy
{

    private static final String REDIRECT_METHODS[] = {
        "GET", "POST", "HEAD"
    };

    public LaxRedirectStrategy()
    {
    }

    protected boolean isRedirectable(String s)
    {
        String as[] = REDIRECT_METHODS;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (as[i].equalsIgnoreCase(s))
            {
                return true;
            }
        }

        return false;
    }

}
