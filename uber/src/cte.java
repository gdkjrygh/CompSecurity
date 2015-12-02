// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.partner.funnel.onboarding.documents.DocumentsUploadService;

public final class cte
    implements cth
{

    static final boolean a;
    private hzb b;
    private hzb c;
    private hzb d;
    private hsr e;

    private cte(ctf ctf1)
    {
        if (!a && ctf1 == null)
        {
            throw new AssertionError();
        } else
        {
            a(ctf1);
            return;
        }
    }

    cte(ctf ctf1, byte byte0)
    {
        this(ctf1);
    }

    public static ctf a()
    {
        return new ctf((byte)0);
    }

    private void a(ctf ctf1)
    {
        b = new _cls1(ctf1);
        c = new _cls2(ctf1);
        d = new _cls3(ctf1);
        e = cti.a(hsu.a(), b, c, d);
    }

    public final void a(DocumentsUploadService documentsuploadservice)
    {
        e.injectMembers(documentsuploadservice);
    }

    static 
    {
        boolean flag;
        if (!cte.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
