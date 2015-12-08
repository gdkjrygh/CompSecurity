// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package RLSDK;


// Referenced classes of package RLSDK:
//            v, db, dc, ak, 
//            ap

public final class dd
{

    public dd()
    {
    }

    public static ap a(ak ak)
        throws v
    {
label0:
        {
            db db1 = new db(ak);
            ak = db1.a();
            if (ak == null || ak.length == 0)
            {
                throw v.a();
            }
            int i = 1 << db1.c() + 1;
            int ai[] = db1.b();
            if (ai != null && ai.length > i / 2 + 3 || i < 0 || i > 512)
            {
                throw v.a();
            }
            if (ai != null && ai.length > 3)
            {
                throw v.a();
            }
            if (ak.length < 4)
            {
                throw v.a();
            }
            int j = ak[0];
            if (j > ak.length)
            {
                throw v.a();
            }
            if (j == 0)
            {
                if (i >= ak.length)
                {
                    break label0;
                }
                ak[0] = ak.length - i;
            }
            return dc.a(ak);
        }
        throw v.a();
    }
}
