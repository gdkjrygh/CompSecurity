// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import com.android.volley.VolleyError;

// Referenced classes of package com.android.volley.toolbox:
//            n, NetworkImageView, s, m

final class r
    implements n
{

    final boolean a;
    final NetworkImageView b;

    r(NetworkImageView networkimageview, boolean flag)
    {
        b = networkimageview;
        a = flag;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        if (NetworkImageView.a(b) != 0)
        {
            b.setImageResource(NetworkImageView.a(b));
        }
    }

    public final void a(m m1, boolean flag)
    {
        if (flag && a)
        {
            b.post(new s(this, m1));
        } else
        {
            if (m1.b() != null)
            {
                b.setImageBitmap(m1.b());
                return;
            }
            if (NetworkImageView.b(b) != 0)
            {
                b.setImageResource(NetworkImageView.b(b));
                return;
            }
        }
    }
}
