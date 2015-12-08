// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.audience.widgets;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.dynamic.k;
import com.google.android.gms.dynamic.n;
import com.google.android.gms.internal.ek;
import com.google.android.gms.internal.em;
import java.util.Iterator;
import java.util.List;

final class a extends ek
{

    private Audience a;
    private TextView b;

    private a()
    {
    }

    a(byte byte0)
    {
        this();
    }

    public final k a()
    {
        return n.a(b);
    }

    public final void a(int i)
    {
    }

    public final void a(Bundle bundle)
    {
        a((Audience)bundle.getParcelable("audience"));
    }

    public final void a(Audience audience)
    {
        a = audience;
        if (a == null)
        {
            b.setText("");
            return;
        }
        Iterator iterator = audience.getAudienceMemberList().iterator();
        audience = null;
        while (iterator.hasNext()) 
        {
            AudienceMember audiencemember = (AudienceMember)iterator.next();
            StringBuilder stringbuilder = new StringBuilder();
            if (audience == null)
            {
                audience = "";
            } else
            {
                audience = (new StringBuilder()).append(audience).append(", ").toString();
            }
            audience = stringbuilder.append(audience).append(audiencemember.getDisplayName()).toString();
        }
        b.setText(audience);
    }

    public final void a(k k, k k1, em em)
    {
        b = new TextView((Context)n.a(k));
    }

    public final void a(boolean flag)
    {
    }

    public final Bundle b()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("audience", a);
        return bundle;
    }
}
