// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements hst
{

    final gcs a;
    final gcr b;

    private dpb b()
    {
        dpb dpb = gcs.a(a).aW();
        if (dpb == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return dpb;
        }
    }

    public final Object a()
    {
        return b();
    }

    (gcr gcr1, gcs gcs1)
    {
        b = gcr1;
        a = gcs1;
        super();
    }
}
