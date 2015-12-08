// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.app.Notification;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package android.support.v4.app:
//            an, at, al, ai, 
//            ak, am, aj

final class ar
    implements an
{

    ar()
    {
    }

    public final Notification a(al al1)
    {
        at at1;
        at1 = new at(al1.a, al1.r, al1.b, al1.c, al1.h, al1.f, al1.i, al1.d, al1.e, al1.g, al1.n, al1.o, al1.p, al1.k, al1.j, al1.m);
        ai ai1;
        for (Iterator iterator = al1.q.iterator(); iterator.hasNext(); at1.a(ai1.a, ai1.b, ai1.c))
        {
            ai1 = (ai)iterator.next();
        }

        if (al1.l == null) goto _L2; else goto _L1
_L1:
        if (!(al1.l instanceof ak)) goto _L4; else goto _L3
_L3:
        al1 = (ak)al1.l;
        at1.a(((ak) (al1)).d, ((ak) (al1)).f, ((ak) (al1)).e, ((ak) (al1)).a);
_L2:
        return at1.a();
_L4:
        if (al1.l instanceof am)
        {
            al1 = (am)al1.l;
            at1.a(((am) (al1)).d, ((am) (al1)).f, ((am) (al1)).e, ((am) (al1)).a);
        } else
        if (al1.l instanceof aj)
        {
            al1 = (aj)al1.l;
            at1.a(((aj) (al1)).d, ((aj) (al1)).f, ((aj) (al1)).e, ((aj) (al1)).a, ((aj) (al1)).b, ((aj) (al1)).c);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
