// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import com.google.android.apps.youtube.app.honeycomb.phone.YouTubeActivity;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            cr, dc

final class ct
    implements android.view.View.OnClickListener
{

    final cr a;

    ct(cr cr1)
    {
        a = cr1;
        super();
    }

    public final void onClick(View view)
    {
        view = new Bundle();
        dc dc1;
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            (new ObjectOutputStream(bytearrayoutputstream)).writeObject(cr.b(a));
            view.putByteArray("playlist", bytearrayoutputstream.toByteArray());
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
        dc1 = new dc((byte)0);
        dc1.g(view);
        dc1.a(cr.c(a).c(), null);
    }
}
